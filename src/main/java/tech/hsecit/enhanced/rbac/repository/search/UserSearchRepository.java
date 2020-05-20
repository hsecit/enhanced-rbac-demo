package tech.hsecit.enhanced.rbac.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import tech.hsecit.enhanced.rbac.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
