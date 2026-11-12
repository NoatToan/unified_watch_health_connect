package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingBanner implements Serializable {
    public static final String TYPE_ARTICLE = "ARTICLE";
    public static final String TYPE_FEATURED_COURSE = "EXCELLENT_COURSE";
    public static final String TYPE_SINGLE_TRAINING = "SINGLE_TRAINING";
    public static final String TYPE_TRAINING_COLLECTION = "TRAINING_COLLECTION";
    public static final String TYPE_YOGA_TRAINING = "YOGA";

    @SerializedName("articleUrl")
    public String articleUrl;

    @SerializedName("bannerIllustrated")
    public String bannerIllustrated;

    @SerializedName("id")
    public long id;

    @SerializedName("name")
    public String name;

    @SerializedName("training")
    public com.xiaomi.hm.health.databases.model.trainning.TrainingItem training;

    @SerializedName("type")
    public String type;
}
