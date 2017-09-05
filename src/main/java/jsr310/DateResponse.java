package jsr310;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
@JsonInclude(Include.NON_EMPTY)
public class DateResponse implements Serializable {

    private static final long serialVersionUID = 3191068752500323145L;

    private LocalDate localDate;
    private LocalDateTime localDateTime;
    private LocalDateTime localDateTimeUTC;
    private OffsetDateTime offsetDateTime;
    private OffsetDateTime offsetDateTimeUTC;
}
