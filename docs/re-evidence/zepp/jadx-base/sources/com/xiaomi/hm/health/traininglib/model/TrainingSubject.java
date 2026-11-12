package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingSubject implements Serializable {

    @SerializedName("listPageIllustrated")
    private String a;

    @SerializedName("trainings")
    private List<TrainingItem> b;

    @SerializedName("id")
    public long id;

    @SerializedName("introduction")
    public String introduction;

    @SerializedName("name")
    public String name;

    public long getId() {
        return this.id;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public String getListPageIllustrated() {
        return this.a;
    }

    public String getName() {
        return this.name;
    }

    public List<TrainingItem> getTrainings() {
        return this.b;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIntroduction(String str) {
        this.introduction = str;
    }

    public void setListPageIllustrated(String str) {
        this.a = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTrainings(List<TrainingItem> list) {
        this.b = list;
    }
}
