/*
 * Copyright 2016 Google.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.genomics.dockerflow.runner;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * A replacement for the autogenerated Pipelines API's Operation object. Reason: it works with
 * standard json serializers.
 */
@SuppressWarnings("serial")
public class Operation implements Serializable {
  private String name;
  private Boolean done;
  private Status error;
  private Map<String, Object> metadata;
  private Map<String, Object> response;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public Status getError() {
    return error;
  }

  public void setError(Status error) {
    this.error = error;
  }

  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public Map<String, Object> getResponse() {
    return response;
  }

  public void setResponse(Map<String, Object> response) {
    this.response = response;
  }

  /**
   * Status.
   */
  public class Status implements Serializable {
    private Integer code;
    private String message;
    private List<Map<String, Object>> details;

    public Integer getCode() {
      return code;
    }

    public void setCode(Integer code) {
      this.code = code;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }

    public List<Map<String, Object>> getDetails() {
      return details;
    }

    public void setDetails(List<Map<String, Object>> details) {
      this.details = details;
    }
  }
}
