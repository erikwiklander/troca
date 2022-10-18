package org.wiklander.troca;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
  @QueryMapping
  public Objekt objekt() {
    return new Objekt.ObjektBuilder()
        .name("pelle")
        .id(1L)
        .build();
  }

  @SchemaMapping(typeName="Objekt", field="from")
  public String getFrom(Objekt objekt) {
    return "fr[n";
  }
}
