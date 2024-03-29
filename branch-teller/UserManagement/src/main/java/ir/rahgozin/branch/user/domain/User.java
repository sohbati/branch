package ir.rahgozin.branch.user.domain;

import ir.rahgozin.branch.baseentity.BaseAuditEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@Table(name = "BT_USER")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Column(name = "USERNAME", length = 150, nullable = false, unique = true)
    private String userName;

    @Column(name = "NAME", length = 150, nullable = false)
    private String name;

    @Column(name = "BRANCH_SORT_CODE", length = 150, nullable = false)
    private String branchSortCode;

    @Column(name = "ACTIVE", nullable = false)
    private boolean active;

    @Column(name = "DESCRIPTION", length = 300)
    private String description;

    @Embedded
    private BaseAuditEntity baseAuditEntity = new BaseAuditEntity();
}
