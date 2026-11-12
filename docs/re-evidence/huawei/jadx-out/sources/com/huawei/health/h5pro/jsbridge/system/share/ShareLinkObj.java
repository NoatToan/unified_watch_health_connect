package com.huawei.health.h5pro.jsbridge.system.share;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes28.dex */
public class ShareLinkObj extends ShareObj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("url")
    private String f6888a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f6889c;

    @SerializedName("title")
    private String d;

    @SerializedName("iconUrl")
    private String e;

    public String getDesc() {
        return this.f6889c;
    }

    public String getIconUrl() {
        return this.e;
    }

    public String getTitle() {
        return this.d;
    }

    public String getUrl() {
        return this.f6888a;
    }

    public void setDesc(String str) {
        this.f6889c = str;
    }

    public void setIconUrl(String str) {
        this.e = str;
    }

    public void setTitle(String str) {
        this.d = str;
    }

    public void setUrl(String str) {
        this.f6888a = str;
    }
}
