package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingArticle implements Serializable {

    @SerializedName("description")
    public String description;

    @SerializedName("id")
    public long id;

    @SerializedName("imgUrl")
    public String imgUrl;

    @SerializedName("title")
    public String title;

    @SerializedName("url")
    public String url;

    public String toString() {
        return "TrainingArticle{id=" + this.id + ", title='" + this.title + "', description='" + this.description + "', url='" + this.url + "', imgUrl='" + this.imgUrl + "'}";
    }
}
