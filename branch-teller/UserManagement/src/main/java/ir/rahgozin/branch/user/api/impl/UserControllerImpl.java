package ir.rahgozin.branch.user.api.impl;


import ir.rahgozin.branch.user.api.UserController;
import ir.rahgozin.branch.user.api.dto.RequestUserDTO;
import ir.rahgozin.branch.user.api.dto.ResponseUserDTO;
import ir.rahgozin.branch.user.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class UserControllerImpl implements UserController {

    private final UserService userService;

     public UserControllerImpl(UserService service) {
         this.userService = service;
     }

    //@PreAuthorize("hasRole('user')")
    public ResponseEntity<ResponseUserDTO> addUser(RequestUserDTO requestUserDTO) {
        ResponseUserDTO dto= userService.addNewUser(requestUserDTO);
        return ResponseEntity.ok(dto);
    }

}
