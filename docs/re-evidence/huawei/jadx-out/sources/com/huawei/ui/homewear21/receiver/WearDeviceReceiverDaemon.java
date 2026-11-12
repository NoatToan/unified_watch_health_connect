package com.huawei.ui.homewear21.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import defpackage.qhu;
import defpackage.yln;
import health.compact.a.CommonUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes43.dex */
public class WearDeviceReceiverDaemon extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f26355c;

    static class c implements ServiceConnectCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        DeviceInfo f26358b;

        c(DeviceInfo deviceInfo) {
            this.f26358b = deviceInfo;
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onConnect() {
            LogUtil.a("WearDeviceReceiverDaemon", "profile connected");
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homewear21.receiver.WearDeviceReceiverDaemon.c.1
                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f26358b != null) {
                        c.this.c();
                    }
                }
            });
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onDisconnect() {
            LogUtil.a("WearDeviceReceiverDaemon", "profile disconnected");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (this.f26358b.getDeviceConnectState() == 2) {
                LogUtil.a("WearDeviceReceiverDaemon", "Device connected. Check inbox benefit automatic activate.");
                ((PayApi) Services.b("TradeService", PayApi.class)).enableBenefitAutoActivation(qhu.d(this.f26358b, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL, true));
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        if (!CommonUtil.ck() || intent == null || context == null) {
            return;
        }
        LogUtil.a("WearDeviceReceiverDaemon", "action = ", intent.getAction(), "current time: ", Long.valueOf(System.currentTimeMillis()));
        if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homewear21.receiver.WearDeviceReceiverDaemon.2
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("WearDeviceReceiverDaemon", "current time: ", Long.valueOf(System.currentTimeMillis()));
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        return;
                    }
                    try {
                        Parcelable parcelable = extras.getParcelable("deviceinfo");
                        if (parcelable instanceof DeviceInfo) {
                            WearDeviceReceiverDaemon.this.d((DeviceInfo) parcelable);
                        }
                    } catch (BadParcelableException unused) {
                        LogUtil.e("WearDeviceReceiverDaemon", "onReceive() BadParcelableException");
                    } catch (RuntimeException unused2) {
                        LogUtil.e("WearDeviceReceiverDaemon", "RuntimeException");
                    }
                }
            });
        } else {
            LogUtil.a("WearDeviceReceiverDaemon", "Enter else");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearDeviceReceiverDaemon", "deviceProfileUpload deviceInfo is null");
            return;
        }
        if (!yln.d(BaseApplication.getContext())) {
            LogUtil.j("WearDeviceReceiverDaemon", "deviceProfileUpload isNeedShowBeforeLogin");
        } else if (deviceInfo.getDeviceConnectState() != 2 && deviceInfo.getDeviceConnectState() != 3) {
            LogUtil.j("WearDeviceReceiverDaemon", "deviceProfileUpload device not connected or disconnect.");
        } else {
            this.f26355c = new c(deviceInfo);
            ProfileAgent.PROFILE_AGENT.connectProfile(this.f26355c);
        }
    }
}
