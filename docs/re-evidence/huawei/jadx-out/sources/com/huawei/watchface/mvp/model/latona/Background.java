package com.huawei.watchface.mvp.model.latona;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class Background {
    private String honeycombBgPath;
    private boolean isPresetBg;

    @SerializedName("@index")
    private String mIndex;

    @SerializedName("@res_preview")
    private String mResPreview;
    private String radiationBgPath;

    public String getHoneycombBgPath() {
        return this.honeycombBgPath;
    }

    public String getIndex() {
        return this.mIndex;
    }

    public String getRadiationBgPath() {
        return this.radiationBgPath;
    }

    public String getResPreview() {
        return this.mResPreview;
    }

    public boolean isPresetBg() {
        return this.isPresetBg;
    }

    public void setHoneycombBgPath(String str) {
        this.honeycombBgPath = str;
    }

    public void setIndex(String str) {
        this.mIndex = str;
    }

    public void setPresetBg(boolean z) {
        this.isPresetBg = z;
    }

    public void setRadiationBgPath(String str) {
        this.radiationBgPath = str;
    }

    public void setResPreview(String str) {
        this.mResPreview = str;
    }

    public String toString() {
        return "LatonaStyle{mIndex='" + this.mIndex + "', mResPreview='" + this.mResPreview + "'}";
    }
}
