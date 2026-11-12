package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.tencent.connect.common.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TpaConfig {

    @SerializedName("appid")
    private String appId;

    @SerializedName("keep_cookies")
    private boolean keepCookies;

    @SerializedName(Constants.PARAM_PLATFORM)
    private int platform = 0;

    @SerializedName("redirect_url")
    private String redirectUrl;

    @SerializedName("scope")
    private List<String> scope;

    @SerializedName("skip_confirm")
    private boolean skipConfirm;

    @SerializedName("third_name")
    private String thirdName;

    public String getAppId() {
        return this.appId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public List<String> getScope() {
        return this.scope;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public boolean isKeepCookies() {
        return this.keepCookies;
    }

    public boolean isSkipConfirm() {
        return this.skipConfirm;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setKeepCookies(boolean z) {
        this.keepCookies = z;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public void setScope(List<String> list) {
        this.scope = list;
    }

    public void setSkipConfirm(boolean z) {
        this.skipConfirm = z;
    }

    public void setThirdName(String str) {
        this.thirdName = str;
    }
}
