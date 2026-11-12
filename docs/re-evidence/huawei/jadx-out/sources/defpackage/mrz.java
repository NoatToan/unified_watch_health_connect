package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;

/* JADX INFO: loaded from: classes2.dex */
public class mrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mrz f42327a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f42328b = new BroadcastReceiver() { // from class: mrz.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwSportContactSyncMgr", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("HwSportContactSyncMgr", "mDeviceStatusReceiver onReceive action is null");
            } else {
                LogUtil.a("HwSportContactSyncMgr", "mDeviceListChangedReceiver onReceive action :", action);
                "com.huawei.bone.action.DEVICE_LIST_CHANGED".equals(action);
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f42329c = new BroadcastReceiver() { // from class: mrz.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
            LogUtil.a("HwSportContactSyncMgr", "mDeviceStatusChangedReceiver deviceInfo is :", deviceInfo);
            if (deviceInfo != null) {
                LogUtil.a("HwSportContactSyncMgr", "mDeviceStatusChangedReceiver deviceInfo getRelationship is :", deviceInfo.getRelationship());
                if (deviceInfo.getRelationship() == null || !"followed_relationship".equals(deviceInfo.getRelationship())) {
                    LogUtil.a("HwSportContactSyncMgr", "mDeviceStatusChangedReceiver deviceInfo getDeviceConnectState is :", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    if (deviceConnectState == 2) {
                        mrz.this.d(deviceInfo);
                    } else {
                        if (deviceConnectState != 3) {
                            return;
                        }
                        mrz.this.a(deviceInfo);
                    }
                }
            }
        }
    };
    private Context e;

    private mrz() {
        LogUtil.a("HwSportContactSyncMgr", "constructor method");
        c();
    }

    private void c() {
        this.e = BaseApplication.getContext();
        d();
        h();
    }

    private void d() {
        BroadcastManagerUtil.c(this.e, this.f42328b, new IntentFilter("com.huawei.bone.action.DEVICE_LIST_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void h() {
        BroadcastManagerUtil.c(this.e, this.f42329c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public static mrz b() {
        if (f42327a == null) {
            synchronized (d) {
                if (f42327a == null) {
                    f42327a = new mrz();
                }
            }
        }
        return f42327a;
    }

    private static void j() {
        synchronized (d) {
            f42327a = null;
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwSportContactSyncMgr", "onDeviceConnected: deviceInfo is null");
            return;
        }
        boolean zE = mud.e();
        if (!zE) {
            LogUtil.j("HwSportContactSyncMgr", "handleDeviceDisconnected isSupportSportContact is : ", Boolean.valueOf(zE));
            return;
        }
        HandlerCenter.a().d(new Runnable() { // from class: mry
            @Override // java.lang.Runnable
            public final void run() {
                mrt.a().e();
            }
        }, 30000L);
        msc.c().a(BaseApplication.getContext(), mtn.e());
        LogUtil.j("HwSportContactSyncMgr", "sportContactSyncUtils startListen ");
    }

    public void a(DeviceInfo deviceInfo) {
        LogUtil.a("HwSportContactSyncMgr", "deviceDisconnected");
        if (deviceInfo == null) {
            LogUtil.j("HwSportContactSyncMgr", "onDeviceDisconnected: deviceInfo is null");
        } else {
            b(deviceInfo);
        }
    }

    public void a() {
        LogUtil.a("HwSportContactSyncMgr", "destroy");
        Context context = this.e;
        if (context != null) {
            context.unregisterReceiver(this.f42328b);
            this.e.unregisterReceiver(this.f42329c);
        }
        msc.c().d(BaseApplication.getContext());
        mub.e().c();
        j();
    }

    public void b(final DeviceInfo deviceInfo) {
        LogUtil.a("HwSportContactSyncMgr", "handleDeviceDisconnected");
        if (deviceInfo == null) {
            LogUtil.j("HwSportContactSyncMgr", "handleDeviceDisconnected: deviceInfo is null.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: msb
                @Override // java.lang.Runnable
                public final void run() {
                    mrz.c(deviceInfo);
                }
            });
        }
    }

    static /* synthetic */ void c(DeviceInfo deviceInfo) {
        if (!mtk.d()) {
            LogUtil.j("HwSportContactSyncMgr", "handleDeviceDisconnected: have no contacts permissions");
            return;
        }
        boolean zE = mud.e();
        LogUtil.a("HwSportContactSyncMgr", "handleDeviceDisconnected isSupportSportContact is : ", Boolean.valueOf(zE));
        if (zE) {
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.a("HwSportContactSyncMgr", "handleDeviceDisconnected deviceConnectState is :", Integer.valueOf(deviceConnectState));
            if (deviceConnectState == 3) {
                mub.e().d();
            }
        }
    }
}
