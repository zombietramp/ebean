package com.avaje.tests.model.joda;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class BasicJodaEntity {

  @Id
  Long id;

  String name;

  @CreatedTimestamp
  LocalDateTime created;

  @UpdatedTimestamp
  DateTime updated;

  @Version
  LocalDateTime version;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public DateTime getUpdated() {
    return updated;
  }

  public void setUpdated(DateTime updated) {
    this.updated = updated;
  }

  public LocalDateTime getVersion() {
    return version;
  }

  public void setVersion(LocalDateTime version) {
    this.version = version;
  }
}
