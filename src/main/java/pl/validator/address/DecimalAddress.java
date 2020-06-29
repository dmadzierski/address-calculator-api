package pl.validator.address;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target(ElementType.PARAMETER)
@Constraint(validatedBy = DecimalAddressValidator.class)
@Retention(RUNTIME)
public @interface DecimalAddress {
  String message ();

  Class<?>[] groups () default {};

  Class<? extends Payload>[] payload () default {};
}
