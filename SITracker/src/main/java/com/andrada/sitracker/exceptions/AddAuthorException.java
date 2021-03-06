/*
 * Copyright 2013 Gleb Godonoga.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.andrada.sitracker.exceptions;

public class AddAuthorException extends Exception {

    private AuthorAddErrors mError = AuthorAddErrors.AUTHOR_UNKNOWN;

    public enum AuthorAddErrors {
        AUTHOR_UNKNOWN,
        AUTHOR_NAME_NOT_FOUND,
        AUTHOR_DATE_NOT_FOUND,
        AUTHOR_ALREADY_EXISTS,
        AUTHOR_NO_PUBLICATIONS
    }

    public AddAuthorException(AuthorAddErrors error) {
        super();
        mError = error;
    }

    public AuthorAddErrors getError() {
        return mError;
    }

    public AddAuthorException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
