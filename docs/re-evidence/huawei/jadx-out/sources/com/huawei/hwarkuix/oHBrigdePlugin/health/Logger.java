package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class Logger extends BridgePlugin {
    private static final String R_TAG = "R_ArkUIX_Config";
    private static final String TAG = "ArkUIX_Logger";

    public Logger(Context context, String str, int i) {
        super(context, str, i);
    }

    public Logger(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void logs(int i, String str) {
        String string;
        String string2 = "";
        if (TextUtils.isEmpty(str)) {
            LogUtil.d(TAG, "logs parmaStr is empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("level");
            try {
                string2 = jSONObject.getString("message");
            } catch (JSONException unused) {
                LogUtil.c(TAG, "logs json error.");
            }
        } catch (JSONException unused2) {
            string = "";
        }
        if (CloudParamKeys.INFO.equals(string)) {
            LogUtil.a(TAG, string2);
            return;
        }
        if (VastAttribute.ERROR.equals(string)) {
            LogUtil.c(TAG, string2);
        } else if ("release".equals(string)) {
            ReleaseLogUtil.c(R_TAG, string2);
        } else {
            LogUtil.e(TAG, string2);
        }
    }
}
