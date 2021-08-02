package sia.tacocloud.tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Taco {
    @NotNull
    private String name;
    private List<String> ingredients;
}
