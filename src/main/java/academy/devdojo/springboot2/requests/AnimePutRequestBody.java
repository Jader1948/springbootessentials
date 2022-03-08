package academy.devdojo.springboot2.requests;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AnimePutRequestBody {
    private Long id;
    private String name;
}
