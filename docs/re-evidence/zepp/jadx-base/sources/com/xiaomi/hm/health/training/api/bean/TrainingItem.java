package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.training.api.gson.JsonStringFieldMapAdapterFactory;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingItem {

    @SerializedName("actionAmount")
    public Integer actionAmount;

    @SerializedName("location")
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public List<FilterItem> bodyparts;

    @SerializedName("consumption")
    public int consumption;

    @SerializedName("content")
    public List<ContentItem> content;

    @SerializedName("salePrice")
    public float courseCurrentPrice;

    @SerializedName("recommendedSubTitle")
    public String courseDescription;

    @SerializedName("label")
    public List<Label> courseLabels;

    @SerializedName("originalPrice")
    public float courseOriginalPrice;

    @SerializedName("remainingTime")
    public long courseRemainingTime;

    @SerializedName("recommendedTitle")
    public String courseTitle;

    @SerializedName("detailsPageIllustrated")
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public StringGenderTuple detailImageUrl;

    @SerializedName("detailImgUrl")
    public String detailImgUrl;

    @SerializedName("difficultyDegree")
    public int difficultyDegree;

    @SerializedName("time")
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public LongGenderTuple duration;

    @SerializedName("externalLink")
    public String externalLink;

    @SerializedName("finishNumber")
    public int finishNumber;

    @SerializedName("function")
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public FilterItem function;

    @SerializedName("id")
    public long id;

    @SerializedName("instrument")
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public FilterItem instrument;

    @SerializedName("introduction")
    public String introduction;

    @SerializedName("isParticipate")
    public boolean isParticipate;

    @SerializedName("listPageIllustrated")
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public StringGenderTuple largeListImageUrl;

    @SerializedName("listImgUrl")
    public String listImgUrl;

    @SerializedName("name")
    public String name;

    @SerializedName("participantNumber")
    public int participantNumber;

    @SerializedName("partnerInfo")
    public String partnerInfo;

    @SerializedName("skus")
    public List<SkusItem> skus;

    @SerializedName("recommendedPageIllustrated")
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public StringGenderTuple smallListImageUrl;

    @SerializedName("trainingType")
    public String trainingType;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public long updateTime;

    @SerializedName("size")
    public long yogaVideoSize;

    public String toString() {
        return "TrainingItem{id=" + this.id + ", name='" + this.name + "', trainingType='" + this.trainingType + "'}";
    }
}
