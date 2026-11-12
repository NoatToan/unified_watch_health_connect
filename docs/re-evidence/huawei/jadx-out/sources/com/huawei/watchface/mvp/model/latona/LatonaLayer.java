package com.huawei.watchface.mvp.model.latona;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class LatonaLayer {

    @SerializedName("@draw_type")
    private String mDrawType;

    @SerializedName("@mIndex")
    private String mIndex;

    @SerializedName("@res_active")
    private String mResActive;

    @SerializedName("@res_align")
    private String mResAlign;

    @SerializedName("@res_ambient")
    private String mResAmbient;

    @SerializedName("@res_position")
    private String mResPosition;

    @SerializedName("@res_position_options")
    private String mResPositionOptions;

    @SerializedName("@res_style_options")
    private String mResStyleOptions;

    @SerializedName("@value_type")
    private String mValueType;

    public String getDrawType() {
        return this.mDrawType;
    }

    public String getIndex() {
        return this.mIndex;
    }

    public String getResActive() {
        return this.mResActive;
    }

    public String getResAlign() {
        return this.mResAlign;
    }

    public String getResAmbient() {
        return this.mResAmbient;
    }

    public String getResPosition() {
        return this.mResPosition;
    }

    public String getResPositionOptions() {
        return this.mResPositionOptions;
    }

    public String getResStyleOptions() {
        return this.mResStyleOptions;
    }

    public String getValueType() {
        return this.mValueType;
    }

    public void setDrawType(String str) {
        this.mDrawType = str;
    }

    public void setIndex(String str) {
        this.mIndex = str;
    }

    public void setResActive(String str) {
        this.mResActive = str;
    }

    public void setResAlign(String str) {
        this.mResAlign = str;
    }

    public void setResAmbient(String str) {
        this.mResAmbient = str;
    }

    public void setResPosition(String str) {
        this.mResPosition = str;
    }

    public void setResPositionOptions(String str) {
        this.mResPositionOptions = str;
    }

    public void setResStyleOptions(String str) {
        this.mResStyleOptions = str;
    }

    public void setValueType(String str) {
        this.mValueType = str;
    }

    public String toString() {
        return "LatonaLayer{mIndex='" + this.mIndex + "', mDrawType='" + this.mDrawType + "', mResActive='" + this.mResActive + "', mResAmbient='" + this.mResAmbient + "', mResAlign='" + this.mResAlign + "', mResPosition='" + this.mResPosition + "', mResStyleOptions='" + this.mResStyleOptions + "', mResPositionOptions='" + this.mResPositionOptions + "', mValueType='" + this.mValueType + "'}";
    }
}
