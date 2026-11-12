package com.huawei.watchface.mvp.model.latona;

/* JADX INFO: loaded from: classes20.dex */
public class BackgroundOptionalConfig {
    private String honeycombBgPath;
    private String mIndex;
    private String mResPreview;
    private int mSortTag;
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

    public int getSortTag() {
        return this.mSortTag;
    }

    public void setHoneycombBgPath(String str) {
        this.honeycombBgPath = str;
    }

    public void setIndex(String str) {
        this.mIndex = str;
    }

    public void setRadiationBgPath(String str) {
        this.radiationBgPath = str;
    }

    public void setResPreview(String str) {
        this.mResPreview = str;
    }

    public void setSortTag(int i) {
        this.mSortTag = i;
    }

    public String toString() {
        return "BackgroundOptionalConfig{mIndex='" + this.mIndex + "'mSortTag='" + this.mSortTag + "', mResPreview='" + this.mResPreview + "', honeycombBgPath='" + this.honeycombBgPath + "', radiationBgPath='" + this.radiationBgPath + "'}";
    }
}
