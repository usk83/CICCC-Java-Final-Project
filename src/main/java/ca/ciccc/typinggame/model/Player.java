package ca.ciccc.typinggame.model;

import java.util.UUID;

public class Player {
  private String name;
  private UUID id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }
}
