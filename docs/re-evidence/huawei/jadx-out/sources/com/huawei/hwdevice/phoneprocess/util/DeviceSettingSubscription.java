package com.huawei.hwdevice.phoneprocess.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import defpackage.mhs;
import defpackage.mil;
import defpackage.mim;
import defpackage.njy;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceSettingSubscription {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f17551b = new Object();
    private static volatile DeviceSettingSubscription d;
    private String f;
    private List<Integer> h;
    private ExecutorService g = Executors.newSingleThreadExecutor();
    private Map<String, CallBack> k = new HashMap();
    private boolean i = true;
    private boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f17553c = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            DeviceInfo deviceInfo;
            LogUtil.a("DeviceSettingSubscription", "mConnectStateChangedReceiver action:", intent == null ? Constants.NULL : intent.getAction());
            if (intent == null || (action = intent.getAction()) == null || !action.equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                return;
            }
            try {
                deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
            } catch (ClassCastException unused) {
                LogUtil.e("DeviceSettingSubscription", "ClassCastException");
                deviceInfo = null;
            }
            if (deviceInfo == null) {
                LogUtil.j("DeviceSettingSubscription", "mConnectStateChangedReceiver deviceInfo is null");
                return;
            }
            LogUtil.a("DeviceSettingSubscription", "mConnectStateChangedReceiver ConnectState is :", Integer.valueOf(deviceInfo.getDeviceConnectState()), " deviceName: ", deviceInfo.getDeviceName(), " mIsFist:");
            if (deviceInfo.getDeviceConnectState() == 2) {
                try {
                    BaseApplication.getContext().unregisterReceiver(DeviceSettingSubscription.this.f17553c);
                } catch (IllegalArgumentException e) {
                    LogUtil.j("DeviceSettingSubscription", "unregister mConnectStateChangedReceiver exception: ", e.getMessage());
                }
                if (DeviceSettingSubscription.this.e) {
                    return;
                }
                DeviceSettingSubscription.this.e = true;
                DeviceSettingSubscription.this.i();
                DeviceSettingSubscription.this.g();
                DeviceSettingSubscription.this.j();
                DeviceSettingSubscription.this.a();
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BroadcastReceiver f17552a = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("DeviceSettingSubscription", "mLoginStatusReceiver action:", intent == null ? Constants.NULL : intent.getAction());
            if (intent == null) {
                LogUtil.j("DeviceSettingSubscription", "onReceive mLoginStatusReceiver intent is null");
            } else if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
                DeviceSettingSubscription.this.a();
            }
        }
    };
    private BroadcastReceiver j = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("DeviceSettingSubscription", "HiHealth service start action:", intent == null ? Constants.NULL : intent.getAction());
            if (intent != null && "com.huawei.health.action.HIHEALTH_SERVICE_START".equals(intent.getAction())) {
                DeviceSettingSubscription.this.i();
            }
        }
    };

    /* JADX INFO: loaded from: classes11.dex */
    public interface CallBack {
        void onCall(DeviceInfo deviceInfo, String str, String str2);
    }

    private DeviceSettingSubscription() {
        e();
        f();
    }

    private void e() {
        this.k.put("continuous_temp_monitoring", new CallBack() { // from class: nev
            @Override // com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.CallBack
            public final void onCall(DeviceInfo deviceInfo, String str, String str2) {
                ndq.c().c(deviceInfo, str2);
            }
        });
        this.k.put("temperature_upper_remind", new CallBack() { // from class: nez
            @Override // com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.CallBack
            public final void onCall(DeviceInfo deviceInfo, String str, String str2) {
                ndq.c().a(deviceInfo, str, str2);
            }
        });
        this.k.put("temperature_lower_remind", new CallBack() { // from class: nex
            @Override // com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.CallBack
            public final void onCall(DeviceInfo deviceInfo, String str, String str2) {
                ndq.c().a(deviceInfo, str, str2);
            }
        });
        this.k.put("custom.temperature_unit", new CallBack() { // from class: new
            @Override // com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.CallBack
            public final void onCall(DeviceInfo deviceInfo, String str, String str2) {
                ndq.c().d(deviceInfo, str, str2);
            }
        });
        this.k.put("weather_switch_status", new CallBack() { // from class: ney
            @Override // com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.CallBack
            public final void onCall(DeviceInfo deviceInfo, String str, String str2) {
                nei.c().e();
            }
        });
    }

    private void f() {
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f17553c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        BroadcastManagerUtil.d(BaseApplication.getContext(), this.j, new IntentFilter("com.huawei.health.action.HIHEALTH_SERVICE_START"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        BroadcastManagerUtil.d(BaseApplication.getContext(), this.f17552a, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.i) {
            this.f = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_FLY), "DEVICE_SETTING_SUBSCRIPTION_USER_ID");
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        boolean zEquals = Objects.equals(this.f, strC);
        if (!zEquals) {
            this.f = strC;
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_FLY), "DEVICE_SETTING_SUBSCRIPTION_USER_ID", this.f, new StorageParams(1));
            b();
        }
        if (this.i || !zEquals) {
            this.i = false;
            c(false);
        }
    }

    private void b() {
        LogUtil.a("DeviceSettingSubscription", "cleanSpData");
        this.g.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = new ArrayList(DeviceSettingSubscription.this.k.keySet()).iterator();
                while (it.hasNext()) {
                    mim.a((String) it.next(), "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this) {
            HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(102, new HiSubscribeListener() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.4
                @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
                public void onResult(List<Integer> list, List<Integer> list2) {
                    DeviceSettingSubscription.this.h = list;
                    LogUtil.a("DeviceSettingSubscription", "subscribeHiHealthData success");
                }

                @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
                public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                    if (i != 102) {
                        return;
                    }
                    LogUtil.a("DeviceSettingSubscription", "subscribeHiHealthData onChange changeKey:", str);
                    if ("HiSyncUserData".equals(str)) {
                        DeviceSettingSubscription.this.c(true);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final boolean z) {
        LogUtil.a("DeviceSettingSubscription", "updateDeviceSetting isNotifyDevice:", Boolean.valueOf(z));
        this.g.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.10
            @Override // java.lang.Runnable
            public void run() {
                mhs.a().getSwitchSetting(new ArrayList(DeviceSettingSubscription.this.k.keySet()), new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.10.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("DeviceSettingSubscription", "extracted getSwitchSetting errorCode:", Integer.valueOf(i));
                        if (i == 0 && (obj instanceof List)) {
                            DeviceInfo deviceInfoC = mil.c("DeviceSettingSubscription");
                            for (Object obj2 : (List) obj) {
                                if (obj2 instanceof HiUserPreference) {
                                    HiUserPreference hiUserPreference = (HiUserPreference) obj2;
                                    String key = hiUserPreference.getKey();
                                    String value = hiUserPreference.getValue();
                                    mim.a(key, value);
                                    if (z) {
                                        DeviceSettingSubscription.this.f(deviceInfoC, key, value);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        });
    }

    public static DeviceSettingSubscription d() {
        if (d == null) {
            synchronized (f17551b) {
                if (d == null) {
                    d = new DeviceSettingSubscription();
                }
            }
        }
        return d;
    }

    public void f(final DeviceInfo deviceInfo, final String str, final String str2) {
        this.g.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription.6
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("DeviceSettingSubscription", "notifyDeviceSettingChanger execute key:", str);
                CallBack callBack = (CallBack) DeviceSettingSubscription.this.k.get(str);
                if (callBack != null) {
                    callBack.onCall(deviceInfo, str, str2);
                }
            }
        });
    }

    public void c() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.f17553c);
        } catch (IllegalArgumentException unused) {
            LogUtil.j("DeviceSettingSubscription", "unregisterReceiver mConnectStateChangedReceiver is exception");
        }
        try {
            BaseApplication.getContext().unregisterReceiver(this.j);
        } catch (IllegalArgumentException unused2) {
            LogUtil.j("DeviceSettingSubscription", "unregisterReceiver mHiHealthServiceReceiver is exception");
        }
        if (njy.b(this.h)) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.h, new HiUnSubscribeListener() { // from class: nfb
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("DeviceSettingSubscription", " isSuccess=", Boolean.valueOf(z));
                }
            });
        }
    }
}
