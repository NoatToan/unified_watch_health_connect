package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mqu {
    private static final Object d = new Object();
    private static mqu e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f42202c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f42201b = new BroadcastReceiver() { // from class: mqu.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwCalendarSyncMgr", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("HwCalendarSyncMgr", "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            LogUtil.a("HwCalendarSyncMgr", "mDeviceListChangedReceiver onReceive action :", action);
            if ("com.huawei.bone.action.DEVICE_LIST_CHANGED".equals(action)) {
                mqu.this.e();
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f42200a = new BroadcastReceiver() { // from class: mqu.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DeviceInfo deviceInfo;
            if (context == null || intent == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null) {
                return;
            }
            if (deviceInfo.getRelationship() == null || !"followed_relationship".equals(deviceInfo.getRelationship())) {
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                if (deviceConnectState == 2) {
                    mqu.this.c(deviceInfo);
                } else {
                    if (deviceConnectState != 3) {
                        return;
                    }
                    mqu.this.h(deviceInfo);
                }
            }
        }
    };
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: mqu.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null || intent.getAction() == null) {
                return;
            }
            if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction()) || "android.intent.action.TIME_SET".equals(intent.getAction()) || "android.intent.action.DATE_CHANGED".equals(intent.getAction())) {
                LogUtil.a("HwCalendarSyncMgr", "ACTION: ", intent.getAction());
                mqu.this.a(mri.a());
            } else {
                LogUtil.a("HwCalendarSyncMgr", "mTimeChangedReceiver action default");
            }
        }
    };

    public static mqu b() {
        mqu mquVar;
        synchronized (d) {
            if (e == null) {
                e = new mqu();
            }
            mquVar = e;
        }
        return mquVar;
    }

    private static void f() {
        synchronized (d) {
            e = null;
        }
    }

    private mqu() {
        LogUtil.a("HwCalendarSyncMgr", "constructor method");
        g();
    }

    private void g() {
        this.f42202c = BaseApplication.getContext();
        i();
    }

    private void i() {
        BroadcastManagerUtil.c(this.f42202c, this.f42201b, new IntentFilter("com.huawei.bone.action.DEVICE_LIST_CHANGED"), LocalBroadcast.f36595c, null);
        BroadcastManagerUtil.c(this.f42202c, this.f42200a, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        BroadcastManagerUtil.a(this.f42202c, this.f, intentFilter);
    }

    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwCalendarSyncMgr", "onDeviceConnected: deviceInfo is null");
        } else {
            a(deviceInfo);
        }
    }

    public void h(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwCalendarSyncMgr", "onDeviceDisconnected: deviceInfo is null");
            return;
        }
        if (mri.h() && CommonUtil.bg() && deviceInfo.getSingleFrameDevice() == 0) {
            mqs.b(BaseApplication.getContext());
            LogUtil.j("HwCalendarSyncMgr", "onDeviceDisconnected: do not support calendar synchronization.");
        } else {
            b(deviceInfo);
        }
    }

    public void a(final DeviceInfo deviceInfo) {
        LogUtil.a("HwCalendarSyncMgr", "handleDeviceConnected: ");
        if (deviceInfo == null) {
            LogUtil.j("HwCalendarSyncMgr", "handleDeviceConnected: deviceInfo is null.");
            return;
        }
        LogUtil.a("HwCalendarSyncMgr", "handleDeviceConnected getSingleFrameDevice: ", Integer.valueOf(deviceInfo.getSingleFrameDevice()));
        if (mri.h() && CommonUtil.bg() && deviceInfo.getSingleFrameDevice() == 0) {
            mqs.b(BaseApplication.getContext());
            LogUtil.j("HwCalendarSyncMgr", "onDeviceDisconnected: do not support calendar synchronization.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mqx
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(deviceInfo);
                }
            });
        }
    }

    /* synthetic */ void d(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 171);
        boolean zD2 = eey.d(deviceInfo, 184);
        if (!zD && !zD2) {
            LogUtil.j("HwCalendarSyncMgr", "not support CalendarSync");
        } else {
            mqy.d().c(a.t, 1);
            c();
        }
    }

    public void b(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwCalendarSyncMgr", "handleDeviceDisconnected: deviceInfo is null.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mqw
                @Override // java.lang.Runnable
                public final void run() {
                    mqu.e(deviceInfo);
                }
            });
        }
    }

    static /* synthetic */ void e(DeviceInfo deviceInfo) {
        if (!mri.b()) {
            LogUtil.j("HwCalendarSyncMgr", "handleDeviceState: have no contacts permissions");
            mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 6);
        } else if (!eey.d(deviceInfo, 171) && !eey.d(deviceInfo, 184)) {
            LogUtil.j("HwCalendarSyncMgr", "handleDeviceState: is not supported sync calendar capability.");
        } else if (deviceInfo.getDeviceConnectState() == 3) {
            mrf.d().e();
        }
    }

    private void c() {
        LogUtil.a("HwCalendarSyncMgr", "handleReconnectedSync: ");
        mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1);
    }

    public void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mqu.4
            @Override // java.lang.Runnable
            public void run() {
                mqu.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Context context = BaseApplication.getContext();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwCalendarSyncMgr");
        b(c(deviceList), mqz.b(context).e());
    }

    private List<String> c(List<DeviceInfo> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null) {
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                if (!TextUtils.isEmpty(deviceIdentify)) {
                    arrayList.add(mtr.e(deviceIdentify));
                }
            }
        }
        return arrayList;
    }

    private void b(List<String> list, List<String> list2) {
        boolean z = true;
        boolean z2 = list == null || list.isEmpty();
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (z2 && z) {
            LogUtil.a("HwCalendarSyncMgr", "calculateChanged: SCENARIO 1.");
            return;
        }
        if (z2) {
            LogUtil.a("HwCalendarSyncMgr", "calculateChanged: SCENARIO 2.");
            b(list2);
            return;
        }
        if (z) {
            LogUtil.a("HwCalendarSyncMgr", "calculateChanged: SCENARIO 3.");
            return;
        }
        LogUtil.a("HwCalendarSyncMgr", "calculateChanged: SCENARIO 4.");
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list);
        List<String> arrayList3 = new ArrayList<>(list2);
        if (arrayList.retainAll(list2)) {
            LogUtil.a("HwCalendarSyncMgr", "calculateChanged: both of this list is same.");
            return;
        }
        if (arrayList2.removeAll(arrayList)) {
            LogUtil.a("HwCalendarSyncMgr", "removeAll ok");
        }
        if (arrayList3.removeAll(arrayList)) {
            b(arrayList3);
        }
    }

    private void b(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwCalendarSyncMgr", "onDeviceRemoved: removed device list is null or empty.");
        } else {
            LogUtil.a("HwCalendarSyncMgr", "onDeviceRemoved: removed device list's size:", Integer.valueOf(list.size()));
            mra.a(list);
        }
    }

    public void d() {
        LogUtil.a("HwCalendarSyncMgr", "destroy");
        Context context = this.f42202c;
        if (context != null) {
            context.unregisterReceiver(this.f42200a);
            this.f42202c.unregisterReceiver(this.f);
        }
        mrf.d().c(BaseApplication.getContext());
        mrf.d().b();
        f();
    }
}
