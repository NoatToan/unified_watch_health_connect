package com.huawei.watchface.videoedit.param;

import androidx.constraintlayout.motion.widget.Key;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes20.dex */
public class MaterialInfo {

    @SerializedName("category_name")
    @Expose
    private String categoryName;

    @SerializedName("duration")
    @Expose
    private int duration;

    @SerializedName("height")
    @Expose
    private int height;
    private String montagePath;

    @SerializedName(BleConstants.KEY_PATH)
    @Expose
    private String path;

    @SerializedName("pathUri")
    @Expose
    private String pathUri;

    @SerializedName(Key.ROTATION)
    @Expose
    private float rotation;

    @SerializedName("startTime")
    @Expose
    private long startTime;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("width")
    @Expose
    private int width;

    public String getCategoryName() {
        return this.categoryName;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMontagePath() {
        return this.montagePath;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathUri() {
        return this.pathUri;
    }

    public float getRotation() {
        return this.rotation;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMontagePath(String str) {
        this.montagePath = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPathUri(String str) {
        this.pathUri = str;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
