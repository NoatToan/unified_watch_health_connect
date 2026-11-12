package com.xiaomi.yrn.env.entity.bundleload.load;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class YRNAssetsLoadRequest extends YRNLoadRequest {
    private String builtInPath;

    public String getBuiltInPath() {
        return this.builtInPath;
    }

    public void setBuiltInPath(String str) {
        this.builtInPath = str;
    }

    @Override // com.xiaomi.yrn.env.entity.bundleload.load.YRNLoadRequest
    public String toString() {
        return "YRNAssetsLoadRequest{builtInPath='" + this.builtInPath + "', appName='" + this.appName + "', module='" + this.module + "', version='" + this.version + "', md5='" + this.md5 + "', maxNativeApiLevel='" + this.maxNativeApiLevel + "', maxCommonJSApiLevel='" + this.maxCommonJSApiLevel + "', zipCachePath='" + this.zipCachePath + "', cacheDirPath='" + this.cacheDirPath + "', needVerify=" + this.needVerify + ", usingBundlePath='" + this.usingBundlePath + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
