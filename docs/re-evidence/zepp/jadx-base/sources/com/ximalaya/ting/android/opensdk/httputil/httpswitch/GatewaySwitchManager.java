package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import android.text.TextUtils;
import android.util.Log;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes22.dex */
class GatewaySwitchManager {
    private static final String TAG = "GatewaySwitchManager";
    private static final String X_IDC_GW = "x-idc-gw";

    public static void parseIDCSwitch(String str, Headers headers) {
        if (TextUtils.isEmpty(str) || headers == null || headers.size() == 0) {
            return;
        }
        String str2 = headers.get(X_IDC_GW);
        if (TextUtils.isEmpty(str2)) {
            if (ProcessUtil.isMainProcess(DNSCache.getInstance().sContext)) {
                IdcManager.noIdcStringTime();
            }
        } else {
            if (str2.equals("0")) {
                return;
            }
            Log.i(TAG, "host = " + str + " idcStr = " + str2);
            IdcManager.idcSwitch(str2);
        }
    }
}
