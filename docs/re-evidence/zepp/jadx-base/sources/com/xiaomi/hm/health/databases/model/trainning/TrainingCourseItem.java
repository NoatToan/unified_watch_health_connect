package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingCourseItem implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("articleImgUrl")
    public String articleImgUrl;

    @SerializedName("articleLink")
    public String articleLink;

    @SerializedName("articleTitle")
    public String articleTitle;

    @SerializedName("consumption")
    public Integer consumption;

    @SerializedName("dayIndex")
    public Integer dayIndex;

    @SerializedName("dayOfWeek")
    public Integer dayOfWeek;

    @SerializedName("id_")
    public Long id;

    @SerializedName("isFinished")
    public Boolean isFinished;

    @SerializedName("isToday")
    public Boolean isToday;

    @SerializedName("name")
    public String name;

    @SerializedName("time")
    public Integer time;

    @SerializedName("detail")
    public TrainingDetail trainingDetail;

    @SerializedName("trainingId")
    public Long trainingId;

    public TrainingCourseItem(Long l, Long l2, String str, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Integer num4, String str2, String str3, String str4) {
        this.dayOfWeek = 0;
        this.time = 0;
        this.consumption = 0;
        Boolean bool3 = Boolean.FALSE;
        this.isFinished = bool3;
        this.isToday = bool3;
        this.dayIndex = 0;
        this.id = l;
        this.trainingId = l2;
        this.name = str;
        this.dayOfWeek = num;
        this.time = num2;
        this.consumption = num3;
        this.isFinished = bool;
        this.isToday = bool2;
        this.dayIndex = num4;
        this.articleTitle = str2;
        this.articleLink = str3;
        this.articleImgUrl = str4;
    }

    public String getArticleImgUrl() {
        return this.articleImgUrl;
    }

    public String getArticleLink() {
        return this.articleLink;
    }

    public String getArticleTitle() {
        return this.articleTitle;
    }

    public Integer getConsumption() {
        return this.consumption;
    }

    public Integer getDayIndex() {
        return this.dayIndex;
    }

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsFinished() {
        return this.isFinished;
    }

    public Boolean getIsToday() {
        return this.isToday;
    }

    public String getName() {
        return this.name;
    }

    public Integer getTime() {
        return this.time;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public void setArticleImgUrl(String str) {
        this.articleImgUrl = str;
    }

    public void setArticleLink(String str) {
        this.articleLink = str;
    }

    public void setArticleTitle(String str) {
        this.articleTitle = str;
    }

    public void setConsumption(Integer num) {
        this.consumption = num;
    }

    public void setDayIndex(Integer num) {
        this.dayIndex = num;
    }

    public void setDayOfWeek(Integer num) {
        this.dayOfWeek = num;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setIsFinished(Boolean bool) {
        this.isFinished = bool;
    }

    public void setIsToday(Boolean bool) {
        this.isToday = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public String toString() {
        return "TrainingCourseItem{trainingId=" + this.trainingId + ", name='" + this.name + "', dayIndex=" + this.dayIndex + '}';
    }

    public TrainingCourseItem() {
        this.dayOfWeek = 0;
        this.time = 0;
        this.consumption = 0;
        Boolean bool = Boolean.FALSE;
        this.isFinished = bool;
        this.isToday = bool;
        this.dayIndex = 0;
    }
}
