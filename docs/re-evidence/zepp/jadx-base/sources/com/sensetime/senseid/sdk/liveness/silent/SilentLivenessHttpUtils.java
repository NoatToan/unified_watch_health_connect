package com.sensetime.senseid.sdk.liveness.silent;

import com.sensetime.senseid.sdk.liveness.silent.common.network.AbstractLivenessUtils;

/* JADX INFO: loaded from: classes18.dex */
class SilentLivenessHttpUtils extends AbstractLivenessUtils {
    private static native String nativeGetBundleId();

    private static native String nativeGetSignature(String str, String str2, String str3, String str4, String str5);

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.network.AbstractHttpUtils
    public String getBundleId() {
        return nativeGetBundleId();
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.network.AbstractHttpUtils
    public String getHost() {
        return BuildConfig.SERVER_HOST;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.network.AbstractHttpUtils
    public String getSignature(String str, String str2, String str3, String str4, String str5) {
        return nativeGetSignature(str, str2, str3, str4, str5);
    }
}
