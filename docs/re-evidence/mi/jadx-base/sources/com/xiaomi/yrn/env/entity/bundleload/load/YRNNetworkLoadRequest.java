package com.xiaomi.yrn.env.entity.bundleload.load;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class YRNNetworkLoadRequest extends YRNLoadRequest {
    private String url;
    private String userAgent;

    public String getUrl() {
        return this.url;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    @Override // com.xiaomi.yrn.env.entity.bundleload.load.YRNLoadRequest
    public String toString() {
        return "YRNNetworkLoadRequest{appName='" + this.appName + "', module='" + this.module + "', version='" + this.version + "', md5='" + this.md5 + "', maxNativeApiLevel='" + this.maxNativeApiLevel + "', maxCommonJSApiLevel='" + this.maxCommonJSApiLevel + "', zipCachePath='" + this.zipCachePath + "', cacheDirPath='" + this.cacheDirPath + "', needVerify=" + this.needVerify + ", usingBundlePath='" + this.usingBundlePath + "', url='" + this.url + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
