package org.wiklander.troca;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Connection {
  private String name;
  private Long id;
  private Long fromId;
  private Long toId;
}
