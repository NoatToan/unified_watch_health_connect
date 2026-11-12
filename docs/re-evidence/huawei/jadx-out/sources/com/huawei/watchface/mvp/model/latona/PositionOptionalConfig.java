package com.huawei.watchface.mvp.model.latona;

/* JADX INFO: loaded from: classes45.dex */
public class PositionOptionalConfig {
    private String mPositionIndex;
    private String mPositionRect;

    public String getPositionIndex() {
        return this.mPositionIndex;
    }

    public String getPositionRect() {
        return this.mPositionRect;
    }

    public void setPositionIndex(String str) {
        this.mPositionIndex = str;
    }

    public void setPositionRect(String str) {
        this.mPositionRect = str;
    }

    public String toString() {
        return "Position{mPositionIndex='" + this.mPositionIndex + "', mPositionRect='" + this.mPositionRect + "'}";
    }
}
