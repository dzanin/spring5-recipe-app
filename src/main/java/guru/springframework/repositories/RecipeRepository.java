package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dz on 15/03/21.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
