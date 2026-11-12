package com.huawei.hwdevice.outofprocess.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import health.compact.a.ApplicationLazyLoad;
import health.compact.a.CommonUtil;
import health.compact.a.DeviceUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes2.dex */
public class HwTwsBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!ApplicationLazyLoad.b()) {
            LogUtil.e("HwTwsBroadcastReceiver", " application lazy load not finished.");
            return;
        }
        if (context == null || intent == null || intent.getAction() == null) {
            LogUtil.e("HwTwsBroadcastReceiver", "HwTwsBroadcastReceiver receive but intent is null");
            return;
        }
        if (Utils.o() || (!CommonUtil.at() && !EnvironmentInfo.l())) {
            LogUtil.e("HwTwsBroadcastReceiver", "HwTwsBroadcastReceiver Utils.isOversea or EMUI below 10.0");
            return;
        }
        LogUtil.b("HwTwsBroadcastReceiver", "HwTwsBroadcastReceiver get intent action:", intent.getAction());
        if (!"com.huawei.profile.service.ProfileDeviceUpdate".equals(intent.getAction())) {
            LogUtil.e("HwTwsBroadcastReceiver", "onReceive action not is PROFILE_UPDATE_ACTION");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isProfileDeviceUpdate", true);
        DeviceUtil.d(context, true, bundle);
    }
}
