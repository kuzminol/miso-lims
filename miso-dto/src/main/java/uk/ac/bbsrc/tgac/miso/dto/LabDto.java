package uk.ac.bbsrc.tgac.miso.dto;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class LabDto {
  
  private Long id;
  private String url;
  private InstituteDto institute;
  private String alias;
  private Long createdById;
  private String createdByUrl;
  private String creationDate;
  private Long updatedById;
  private String updatedByUrl;
  private String lastUpdated;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public InstituteDto getInstitute() {
    return institute;
  }
  
  public void setInstitute(InstituteDto institute) {
    this.institute = institute;
  }
  
  public String getAlias() {
    return alias;
  }
  
  public void setAlias(String alias) {
    this.alias = alias;
  }
  
  public Long getCreatedById() {
    return createdById;
  }
  
  public void setCreatedById(Long createdById) {
    this.createdById = createdById;
  }
  
  public String getCreatedByUrl() {
    return createdByUrl;
  }
  
  public void setCreatedByUrl(String createdByUrl) {
    this.createdByUrl = createdByUrl;
  }
  
  public String getCreationDate() {
    return creationDate;
  }
  
  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }
  
  public Long getUpdatedById() {
    return updatedById;
  }
  
  public void setUpdatedById(Long updatedById) {
    this.updatedById = updatedById;
  }
  
  public String getUpdatedByUrl() {
    return updatedByUrl;
  }
  
  public void setUpdatedByUrl(String updatedByUrl) {
    this.updatedByUrl = updatedByUrl;
  }
  
  public String getLastUpdated() {
    return lastUpdated;
  }
  
  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public String toString() {
    return "LabDto [id=" + id + ", url=" + url + ", institute=" + institute
        + ", alias=" + alias + ", createdById=" + createdById
        + ", createdByUrl=" + createdByUrl + ", creationDate=" + creationDate
        + ", updatedById=" + updatedById + ", updatedByUrl=" + updatedByUrl
        + ", lastUpdated=" + lastUpdated + "]";
  }

}
