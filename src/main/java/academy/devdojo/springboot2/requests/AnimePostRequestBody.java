package academy.devdojo.springboot2.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnimePostRequestBody {

    @NotEmpty(message = "The anime name connot be empty")
    private String name;

    @URL(message = "The Url is not valid")
    private String url;
}


