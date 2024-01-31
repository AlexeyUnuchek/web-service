package home.service.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonEatDto {
	String fullName;
	@Singular
	List<String> foods;

}
