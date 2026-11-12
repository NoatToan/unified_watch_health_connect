package com.xmlywind.sdk.base.models;

import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.a;

/* JADX INFO: loaded from: classes22.dex */
public class MraidEnv {
    public final Boolean coppa;
    public final String version = "2.0";
    public final String sdk = "sigmob";
    public final String sdkVersion = Constants.SDK_VERSION;
    public final String appId = a.n().P();
    public final String ifa = a.n().w();
    public final Boolean limitAdTracking = Boolean.valueOf(a.n().x());

    public MraidEnv() {
        this.coppa = Boolean.valueOf(a.m() == 1);
    }
}
