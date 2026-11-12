package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.idy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public class BIEvent extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_BIEvent";
    private static final String TAG = "ArkUIX_BIEvent";

    public BIEvent(Context context, String str, int i) {
        super(context, str, i);
    }

    public BIEvent(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void execBiEvent(int i, String str, String str2) {
        ReleaseLogUtil.d(R_TAG, "execBiEvent ", "key:", str);
        LogUtil.a(TAG, " biParam:", str2);
        if (TextUtils.isEmpty(str2)) {
            ohProOnFailure(i, "");
        } else {
            idy.e(str, str2);
            ohProOnSuccess(i, "bi success");
        }
    }
}
