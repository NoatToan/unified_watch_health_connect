package com.huawei.health.device.wifi.interfaces;

import android.content.Context;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.IpushTokenCallback;
import defpackage.dyg;
import defpackage.eap;
import defpackage.ltb;
import health.compact.a.CompileParameterUtil;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class WiFiDevicePushReceiver implements IpushBase, IpushTokenCallback {
    private static final int DEVICE_UNBIND_PUSH_TYPE = 6;
    private static final String TAG = "WiFiDevicePushReceiver";

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("6");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        dyg.a(false, TAG, "get pushType 6 msg time:", ltb.d(new Date()));
        if (str == null || "".equals(str) || str.length() < 1) {
            dyg.c(false, TAG, "processPushMsg Error, PushMsg is Empty");
            return;
        }
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            dyg.a(false, TAG, "WiFiDevicePushReceiver processPushMsg():msg =", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("pushType") && jSONObject.getInt("pushType") == 6) {
                    eap.c().b();
                }
            } catch (JSONException e) {
                dyg.c(false, TAG, "processPushMsg JSONException:", e.getMessage());
            }
        }
    }

    @Override // com.huawei.health.messagecenter.model.IpushTokenCallback
    public void pushTokenHandle(Context context, String str) {
        dyg.a(false, TAG, "token =", str);
    }
}
