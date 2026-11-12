package com.xiaomi.hm.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;

/* JADX INFO: loaded from: classes21.dex */
public class LanguageReceiver extends BroadcastReceiver {
    private static final String a = "LanguageReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        HMDeviceSource featureProDevice;
        HMLog.i(a, "intent:" + intent, new Object[0]);
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action) || !action.equals("android.intent.action.LOCALE_CHANGED") || (featureProDevice = HMDeviceConfig.getFeatureProDevice()) == HMDeviceSource.VDEVICE) {
            return;
        }
        UpdateAboutLanguageConfig.INSTANCE.updateAboutLanguageConfig(featureProDevice);
    }
}
