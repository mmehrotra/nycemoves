package com.nyce.moves;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Comments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T16:41:29.282+05:30")

public class Comments   {
  @JsonProperty("commentId")
  private Long commentId = null;

  @JsonProperty("postedBy")
  private Long postedBy = null;

  @JsonProperty("imageId")
  private Long imageId = null;

  @JsonProperty("videoId")
  private Long videoId = null;

  @JsonProperty("postId")
  private Long postId = null;

  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("postedTimestamp")
  private OffsetDateTime postedTimestamp = null;

  public Comments commentId(Long commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   * @return commentId
  **/
  @ApiModelProperty(value = "")


  public Long getCommentId() {
    return commentId;
  }

  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }

  public Comments postedBy(Long postedBy) {
    this.postedBy = postedBy;
    return this;
  }

  /**
   * Get postedBy
   * @return postedBy
  **/
  @ApiModelProperty(value = "")


  public Long getPostedBy() {
    return postedBy;
  }

  public void setPostedBy(Long postedBy) {
    this.postedBy = postedBy;
  }

  public Comments imageId(Long imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
  **/
  @ApiModelProperty(value = "")


  public Long getImageId() {
    return imageId;
  }

  public void setImageId(Long imageId) {
    this.imageId = imageId;
  }

  public Comments videoId(Long videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Get videoId
   * @return videoId
  **/
  @ApiModelProperty(value = "")


  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }

  public Comments postId(Long postId) {
    this.postId = postId;
    return this;
  }

  /**
   * Get postId
   * @return postId
  **/
  @ApiModelProperty(value = "")


  public Long getPostId() {
    return postId;
  }

  public void setPostId(Long postId) {
    this.postId = postId;
  }

  public Comments comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Comments postedTimestamp(OffsetDateTime postedTimestamp) {
    this.postedTimestamp = postedTimestamp;
    return this;
  }

  /**
   * Get postedTimestamp
   * @return postedTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPostedTimestamp() {
    return postedTimestamp;
  }

  public void setPostedTimestamp(OffsetDateTime postedTimestamp) {
    this.postedTimestamp = postedTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comments comments = (Comments) o;
    return Objects.equals(this.commentId, comments.commentId) &&
        Objects.equals(this.postedBy, comments.postedBy) &&
        Objects.equals(this.imageId, comments.imageId) &&
        Objects.equals(this.videoId, comments.videoId) &&
        Objects.equals(this.postId, comments.postId) &&
        Objects.equals(this.comments, comments.comments) &&
        Objects.equals(this.postedTimestamp, comments.postedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, postedBy, imageId, videoId, postId, comments, postedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comments {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    postedBy: ").append(toIndentedString(postedBy)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    postedTimestamp: ").append(toIndentedString(postedTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

