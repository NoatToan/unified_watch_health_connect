package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class Tracks {

    @SerializedName("editSegments")
    @Expose
    private List<Segments> editSegments;

    @SerializedName("flag")
    @Expose
    private int flag;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("type")
    @Expose
    private String type;

    public int getFlag() {
        return this.flag;
    }

    public String getId() {
        return this.id;
    }

    public List<Segments> getSegments() {
        return this.editSegments;
    }

    public String getType() {
        return this.type;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSegments(List<Segments> list) {
        this.editSegments = list;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "Tracks{id='" + this.id + "', type='" + this.type + "', editSegments=" + this.editSegments + ", flag=" + this.flag + '}';
    }

    public Tracks withFlag(int i) {
        this.flag = i;
        return this;
    }

    public Tracks withId(String str) {
        this.id = str;
        return this;
    }

    public Tracks withSegments(List<Segments> list) {
        this.editSegments = list;
        return this;
    }

    public Tracks withType(String str) {
        this.type = str;
        return this;
    }
}
