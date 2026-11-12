package com.huawei.hwcommonmodel.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.android.iaware.IAwareSdkEx;
import com.huawei.android.os.ServiceManagerEx;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.api.HwWatchFaceApi;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ThermalCallback extends Binder implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f17232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f17233b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17234c;
    private static ExtendHandler d;
    private static ThermalCallback e;
    private static IBinder f;
    private static int j;
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.huawei.hwcommonmodel.utils.ThermalCallback.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                LogUtil.a("ThermalCallback", "mTemperatureControlServiceStartReceiver() action: ", intent.getAction());
                if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                    ThermalCallback.n();
                }
            }
        }
    };
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: com.huawei.hwcommonmodel.utils.ThermalCallback.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
                return;
            }
            boolean unused = ThermalCallback.f17232a = intent.getBooleanExtra("isForeground", false);
            LogUtil.a("ThermalCallback", "mForegroundStatusChangeReceiver() sIsForeground: ", Boolean.valueOf(ThermalCallback.f17232a));
        }
    };

    public void controlThreadLevel(List<Integer> list, int i) {
    }

    static /* synthetic */ int c() {
        int i = j;
        j = i + 1;
        return i;
    }

    private ThermalCallback() {
        i();
        try {
            BaseApplication.getContext().registerReceiver(this.h, new IntentFilter("android.intent.action.BOOT_COMPLETED"), LocalBroadcast.f36595c, null);
        } catch (RuntimeException unused) {
            LogUtil.a("ThermalCallback", "System is dead, cannot register receiver");
        }
        BroadcastManager.d(this.i);
        f17232a = CommonUtil.q(BaseApplication.getContext());
    }

    public static ThermalCallback getInstance() {
        ThermalCallback thermalCallback;
        LogUtil.a("ThermalCallback", "getInstance ThermalCallback.");
        synchronized (f17233b) {
            if (e == null) {
                e = new ThermalCallback();
                n();
            }
            thermalCallback = e;
        }
        return thermalCallback;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        LogUtil.j("ThermalCallback", "binderDied sdkService is died.");
        f();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.huawei.iaware.sdk.ThermalCallback");
            c(parcel.readInt());
            LogUtil.a("ThermalCallback", "Thermal onTransact level:", Integer.valueOf(f17234c));
            parcel2.writeNoException();
            g();
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    private static void h() {
        if (f != null) {
            return;
        }
        try {
            IBinder service = ServiceManagerEx.getService("IAwareSdkService");
            f = service;
            if (service == null) {
                LogUtil.j("ThermalCallback", "failed to get IAwareSdkService.");
            } else {
                service.linkToDeath(e, 0);
            }
        } catch (RemoteException e2) {
            LogUtil.e("ThermalCallback", "RemoteException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        LogUtil.a("ThermalCallback", "registerService.");
        if (!CommonUtil.bg() || (CommonUtil.as() && !CommonUtil.at())) {
            LogUtil.j("ThermalCallback", "registerService only support HuaweiSystem.");
            return;
        }
        h();
        IAwareSdkEx.registerCallback(3034, BaseApplication.getAppPackage(), e);
        d.sendEmptyMessage(1, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        j = 0;
        d.quit(false);
    }

    private static void j() {
        synchronized (f17233b) {
            e = null;
        }
    }

    private static void c(int i) {
        f17234c = i;
    }

    private static void f() {
        f = null;
        d.sendEmptyMessage(1, 10000L);
    }

    private static void i() {
        d = HandlerCenter.b(new b(), "ThermalCallback");
    }

    public boolean isTriggerTask() {
        LogUtil.a("ThermalCallback", "isTriggerTask sIsForeground:", Boolean.valueOf(f17232a), ", sLevel:", Integer.valueOf(f17234c));
        return f17232a || f17234c < 1;
    }

    public boolean isTriggerOtaTask() {
        LogUtil.a("ThermalCallback", "isTriggerOtaTask sIsForeground:", Boolean.valueOf(f17232a), ", sLevel:", Integer.valueOf(f17234c));
        return f17232a || f17234c < 2;
    }

    public int getThermalLevel() {
        return f17234c;
    }

    public void destroy() {
        BaseApplication.getContext().unregisterReceiver(this.h);
        BroadcastManager.n(this.i);
        j();
    }

    static class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ThermalCallback.c();
                ThermalCallback.n();
                if (ThermalCallback.j == 3) {
                    ThermalCallback.g();
                }
            } else {
                LogUtil.j("ThermalCallback", "sHandler error msg.");
            }
            return true;
        }
    }
}
