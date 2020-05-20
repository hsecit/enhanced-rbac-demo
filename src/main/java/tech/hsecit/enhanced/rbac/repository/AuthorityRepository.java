package tech.hsecit.enhanced.rbac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.hsecit.enhanced.rbac.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
