/*
 * Copyright 2017 Software Engineering and Synthesis Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sesygroup.choreography.web.business;

/**
 *
 * @author Alexander Perucci (http://www.alexanderperucci.com/)
 *
 */
public class BusinessException extends  RuntimeException {
   private static final long serialVersionUID = -2747157039796007525L;

   public BusinessException() {
      super();
   }

   public BusinessException(String message, Throwable cause) {
      super(message, cause);
   }

   public BusinessException(String message) {
      super(message);
   }

   public BusinessException(Throwable cause) {
      super(cause);
   }
}
