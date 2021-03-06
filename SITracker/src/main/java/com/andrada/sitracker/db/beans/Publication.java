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

package com.andrada.sitracker.db.beans;

import com.andrada.sitracker.db.dao.PublicationDaoImpl;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(daoClass = PublicationDaoImpl.class, tableName = "publications")
public class Publication {
    @DatabaseField(generatedId = true, useGetSet = true)
    long id;
    @DatabaseField(canBeNull = false, useGetSet = true)
    String name;
    @DatabaseField(useGetSet = true)
    int size;
    @DatabaseField(useGetSet = true)
    int oldSize;
    @DatabaseField(useGetSet = true)
    String category;
    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    Author author;
    @DatabaseField(useGetSet = true)
    String date;
    @DatabaseField(useGetSet = true)
    String description;
    @DatabaseField(useGetSet = true)
    String commentUrl;
    @DatabaseField(canBeNull = false, useGetSet = true)
    String url;
    @DatabaseField(useGetSet = true)
    String rating;
    @DatabaseField(useGetSet = true)
    int commentsCount;
    @DatabaseField(defaultValue = "false", canBeNull = false)
    Boolean isNew;
    @DatabaseField(canBeNull = false, useGetSet = true)
    Date updateDate;
    @DatabaseField(canBeNull = true, useGetSet = true)
    String imageUrl;

    boolean isLoading = false;

    public Publication() {
        updateDate = new Date();
    }

    @Override
    public boolean equals(Object object) {
        boolean sameSame = false;

        if (object != null && object instanceof Publication) {
            sameSame = this.getUrl().equals(((Publication) object).getUrl());
        }

        return sameSame;
    }

    public int hashCode() {
        return getUrl().hashCode();
    }


    //region Getters setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOldSize() {
        return oldSize;
    }

    public void setOldSize(int oldSize) {
        this.oldSize = oldSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCommentUrl() {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl) {
        this.commentUrl = commentUrl;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean getLoading() {
        return isLoading;
    }

    public void setLoading(Boolean loading) {
        isLoading = loading;
    }


    //endregion

}
