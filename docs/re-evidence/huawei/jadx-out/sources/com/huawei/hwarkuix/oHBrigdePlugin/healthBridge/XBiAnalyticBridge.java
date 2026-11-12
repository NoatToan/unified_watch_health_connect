package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.idy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;

/* JADX INFO: loaded from: classes10.dex */
public class XBiAnalyticBridge extends OHProBridgePlugin {
    private static final String TAG = "XBiAnalyticBridge";
    private static final String TAG_RELEASE = "R_XBiAnalyticBridge";

    public XBiAnalyticBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public XBiAnalyticBridge(Context context, String str, int i, BridgePlugin.BridgeType bridgeType) {
        super(context, str, i, bridgeType);
    }

    public XBiAnalyticBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void execBiEvent(int i, String str, String str2) {
        ReleaseLogUtil.d(TAG_RELEASE, "execBiEvent ", "key:", str);
        LogUtil.a(TAG, "biParam: ", str2);
        if (TextUtils.isEmpty(str2)) {
            ohProOnFailure(i, "biParam is empty");
        } else {
            idy.e(str, str2);
            ohProOnSuccess(i, "bi success");
        }
    }
}
