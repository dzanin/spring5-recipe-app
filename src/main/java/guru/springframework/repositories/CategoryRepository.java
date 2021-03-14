package guru.springframework.repositories;

import guru.springframework.domain.Category;
import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dz on 15/03/21.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
