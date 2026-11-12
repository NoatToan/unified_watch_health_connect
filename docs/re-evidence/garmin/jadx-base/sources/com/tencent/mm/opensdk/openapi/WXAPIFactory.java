package com.tencent.mm.opensdk.openapi;

import android.content.Context;
import com.tencent.mm.opensdk.utils.Log;
import zl.a;

/* JADX INFO: loaded from: classes3.dex */
public class WXAPIFactory {
    private static final String TAG = "MicroMsg.PaySdk.WXFactory";

    private WXAPIFactory() {
        throw new RuntimeException("WXAPIFactory should not be instantiated");
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z14) {
        Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z14);
        return createWXAPI(context, str, z14, 2);
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        return createWXAPI(context, str, true);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z14, int i14) {
        StringBuilder sbD = a.d("createWXAPI, appId = ", str, ", checkSignature = ", z14, ", launchMode = ");
        sbD.append(i14);
        Log.d(TAG, sbD.toString());
        return new WXApiImplV10(context, str, z14, i14);
    }
}
