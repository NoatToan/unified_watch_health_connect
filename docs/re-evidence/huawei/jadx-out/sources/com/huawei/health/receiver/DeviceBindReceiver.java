package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiDeviceInfo;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceBindReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DeviceBindReceiver f8652c;

    public static void a() {
        f8652c = new DeviceBindReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.binding_device");
        BroadcastManagerUtil.d(BaseApplication.b(), f8652c, intentFilter, "com.huawei.hihealth.DEFAULT_PERMISSION", null);
    }

    public static void d() {
        if (f8652c != null) {
            try {
                BaseApplication.b().unregisterReceiver(f8652c);
            } catch (IllegalArgumentException unused) {
                ReleaseLogUtil.b("DeviceBindReceiver", "unregister IllegalArgumentException");
            }
            f8652c = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        final HiDeviceInfo hiDeviceInfo;
        if (intent == null) {
            LogUtil.b("DeviceBindReceiver", "Broadcast triggered, but intent is null...");
            return;
        }
        LogUtil.b("DeviceBindReceiver", "BindDeviceBroadcastReceiver enter");
        try {
            hiDeviceInfo = (HiDeviceInfo) intent.getParcelableExtra("devicinfo");
        } catch (BadParcelableException unused) {
            LogUtil.d("DeviceBindReceiver", "bindDeviceBroadcastReceiver BadParcelableException");
            hiDeviceInfo = null;
        }
        if (hiDeviceInfo == null) {
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "SAVE_BIND_TO_ODMF");
        int deviceTypeMapping = hiDeviceInfo.getDeviceTypeMapping();
        if (!"TRUE".equals(strE) || deviceTypeMapping == -1) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.receiver.DeviceBindReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).saveBindingDeviceToOdmf(hiDeviceInfo.getDeviceInfoToODMF());
            }
        });
    }
}
