package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class UserRegion extends Entity {

    @SerializedName(Configs.Params.CURRENT_REGION)
    private String currentRegion;

    @SerializedName(Configs.Params.TARGET_REGION)
    private String targetRegion;

    public String getCurrentRegion() {
        return this.currentRegion;
    }

    public String getTargetRegion() {
        return this.targetRegion;
    }

    public void setCurrentRegion(String str) {
        this.currentRegion = str;
    }

    public void setTargetRegion(String str) {
        this.targetRegion = str;
    }

    public String toString() {
        return "UserRegion{currentRegion='" + this.currentRegion + "', targetRegion='" + this.targetRegion + "'}";
    }
}
