package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.callback.BindPhoneServiceCallback;
import com.huawei.callback.DeviceBatterStateListener;
import com.huawei.callback.DeviceConnectStateListener;
import com.huawei.callback.DeviceDeleteListener;
import com.huawei.callback.DeviceExtraStateListener;
import com.huawei.callback.DeviceListUpdateListener;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public final class lut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<DeviceDeleteListener> f40858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<DeviceConnectStateListener> f40859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<DeviceBatterStateListener> f40860c;
    private final Set<Integer> d;
    private volatile Map<String, CloudDeviceInfo> e;
    private final Set<DeviceExtraStateListener> f;
    private int g;
    private DeviceInfo h;
    private final Set<DeviceListUpdateListener> i;
    private boolean j;
    private volatile FutureTask<List<DeviceInfo>> k;
    private volatile Map<String, DeviceInfo> l;
    private volatile FutureTask<List<CloudDeviceInfo>> m;
    private Runnable o;

    private lut() {
        this.f40859b = Collections.synchronizedSet(new LinkedHashSet());
        this.f = Collections.synchronizedSet(new LinkedHashSet());
        this.f40860c = Collections.synchronizedSet(new LinkedHashSet());
        this.i = Collections.synchronizedSet(new LinkedHashSet());
        this.f40858a = Collections.synchronizedSet(new LinkedHashSet());
        this.l = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.d = new HashSet(Arrays.asList(75, 10, 12, 11));
        this.g = -1;
        this.o = new Runnable() { // from class: lus
            @Override // java.lang.Runnable
            public final void run() {
                this.e.h();
            }
        };
        k();
        m();
        lug.e(new BindPhoneServiceCallback() { // from class: luw
            @Override // com.huawei.callback.BindPhoneServiceCallback
            public final void onBind() {
                this.f40869c.g();
            }
        });
        g();
    }

    private void m() {
        LogUtil.a("DeviceInfoProtectManage", "enter registerBatteryBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        BroadcastManagerUtil.c(BaseApplication.b(), new BroadcastReceiver() { // from class: lut.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        lut.this.d(extras.getString("DEVICE_MAC"));
                    } else {
                        LogUtil.j("DeviceInfoProtectManage", "registerReceiverExported onReceive bundle == null");
                    }
                }
            }
        }, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: renamed from: lut$2, reason: invalid class name */
    class AnonymousClass2 implements DeviceStatusCallback {
        final /* synthetic */ Map d;

        AnonymousClass2(Map map) {
            this.d = map;
        }

        @Override // com.huawei.callback.DeviceStatusCallback
        public void onDeviceConnectedChanged(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) {
            LogUtil.a("DeviceInfoProtectManage", "handlerDeviceConnectedChanged CONNECT_STATE = ", Integer.valueOf(deviceInfo.getDeviceConnectState()), " DeviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " LastConnectedTime:", Long.valueOf(deviceInfo.getLastConnectedTime()));
            ((LinkedList) this.d.computeIfAbsent(deviceInfo.getDeviceIdentify(), new Function() { // from class: lvd
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return lut.AnonymousClass2.c((String) obj);
                }
            })).addLast(String.valueOf(deviceInfo.getLastConnectedTime()) + deviceInfo.getDeviceConnectState());
            lut.this.a(deviceInfo);
        }

        static /* synthetic */ LinkedList c(String str) {
            return new LinkedList();
        }
    }

    private void k() {
        final HashMap map = new HashMap();
        lvk.b("DeviceInfoProtectManage", new AnonymousClass2(map));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_DATA_SYNC");
        intentFilter.addAction("com.huawei.bone.action.UNITE_SERVICE_SUCCESS");
        BroadcastManagerUtil.c(BaseApplication.b(), new BroadcastReceiver() { // from class: lut.5
            private final HashSet<Integer> d = new HashSet<>(Arrays.asList(1, 2, 3, 4));

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent == null) {
                        LogUtil.j("DeviceInfoProtectManage", "intent == null");
                        return;
                    }
                    if ("com.huawei.bone.action.CONNECTION_DATA_SYNC".equals(intent.getAction())) {
                        LogUtil.a("DeviceInfoProtectManage", "received ACTION_CONNECTION_DATA_SYNC LocalBroadcast");
                        lut.this.a(intent.getStringExtra(MatterDataContans.KEY_MAC_ADDRESS), 1);
                        return;
                    }
                    if ("com.huawei.bone.action.UNITE_SERVICE_SUCCESS".equals(intent.getAction())) {
                        LogUtil.a("DeviceInfoProtectManage", "received ACTION_UNITE_SERVICE_SUCCESS LocalBroadcast");
                        lut.this.g();
                        return;
                    }
                    DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                    if (deviceInfo == null) {
                        LogUtil.j("DeviceInfoProtectManage", "deviceStatusChangeReceiver deviceInfo == null");
                        return;
                    }
                    if ("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                        DeviceInfo deviceInfoB = lut.this.b(deviceInfo.getDeviceIdentify());
                        if (deviceInfoB instanceof CloudDeviceInfo) {
                            deviceInfoB.setDeviceConnectState(deviceInfo.getDeviceConnectState());
                            lut.this.a(deviceInfoB);
                            return;
                        }
                        return;
                    }
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    LogUtil.a("DeviceInfoProtectManage", "switchDeviceHandler CONNECT_STATE = ", Integer.valueOf(deviceConnectState), " DeviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " LastConnectedTime:", Long.valueOf(deviceInfo.getLastConnectedTime()));
                    if (e(deviceInfo, deviceConnectState, String.valueOf(deviceInfo.getLastConnectedTime()) + deviceInfo.getDeviceConnectState())) {
                        return;
                    }
                    map.remove(deviceInfo.getDeviceIdentify());
                    lut.this.a(deviceInfo);
                } catch (ClassCastException e) {
                    LogUtil.e("DeviceInfoProtectManage", "DeviceInfo deviceInfo error :", e.getMessage());
                }
            }

            private boolean e(DeviceInfo deviceInfo, int i, String str) {
                LinkedList linkedList;
                if (!this.d.contains(Integer.valueOf(i)) || (linkedList = (LinkedList) map.get(deviceInfo.getDeviceIdentify())) == null || !linkedList.removeFirstOccurrence(str)) {
                    return false;
                }
                LogUtil.a("DeviceInfoProtectManage", "switchDeviceHandler removeFirstOccurrence");
                return true;
            }
        }, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final int i) {
        final DeviceInfo deviceInfoB = b(str);
        if (deviceInfoB == null || (deviceInfoB instanceof CloudDeviceInfo)) {
            LogUtil.a("DeviceInfoProtectManage", "dealDeviceConnectSync deviceInfo is invalid");
        } else {
            this.f.forEach(new Consumer() { // from class: lux
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((DeviceExtraStateListener) obj).onDeviceExtraChange(deviceInfoB, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        ReleaseLogUtil.d("R_DeviceInfoProtectManage", "dealDeviceConnectChanger deviceInfo name:", deviceInfo.getDeviceName(), " connect:", Integer.valueOf(deviceConnectState), " isCloud:", Boolean.valueOf(deviceInfo instanceof CloudDeviceInfo));
        HandlerExecutor.c(new AnonymousClass3(deviceInfo, deviceConnectState));
        if (deviceConnectState == 2 || deviceConnectState == 3 || deviceConnectState == 4) {
            n();
        }
    }

    /* JADX INFO: renamed from: lut$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f40862b;
        final /* synthetic */ int d;

        AnonymousClass3(DeviceInfo deviceInfo, int i) {
            this.f40862b = deviceInfo;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!(this.f40862b instanceof CloudDeviceInfo)) {
                a();
            }
            Set set = lut.this.f40859b;
            final DeviceInfo deviceInfo = this.f40862b;
            final int i = this.d;
            set.forEach(new Consumer() { // from class: lve
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((DeviceConnectStateListener) obj).onDeviceConnectChange(deviceInfo, i);
                }
            });
        }

        private void a() {
            if (lut.this.l.containsKey(this.f40862b.getDeviceIdentify()) || this.d == 2) {
                lut.this.l.put(this.f40862b.getDeviceIdentify(), this.f40862b);
            }
            if (this.d == 2) {
                lut.this.i(this.f40862b);
            }
            lut.this.g = this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceInfoProtectManage", "refreshWearCapability entry");
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceIdentify, "DeviceInfoProtectManage");
        if (mapD == null) {
            LogUtil.a("DeviceInfoProtectManage", "refreshWearCapability map is null");
            return;
        }
        DeviceCapability deviceCapability = mapD.get(deviceIdentify);
        if (deviceCapability == null) {
            LogUtil.a("DeviceInfoProtectManage", "refreshWearCapability deviceCapability is null");
        } else {
            LogUtil.a("DeviceInfoProtectManage", "refreshWearCapability success");
            eej.a(deviceIdentify, deviceCapability);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        final DeviceInfo deviceInfo = this.l.get(str);
        if (deviceInfo == null) {
            LogUtil.a("DeviceInfoProtectManage", "dealDeviceBatterState deviceInfo == null, deviceMac:", CommonUtil.n(str));
        } else {
            final mgp mgpVarA = mgt.a(str);
            this.f40860c.forEach(new Consumer<DeviceBatterStateListener>() { // from class: lut.1
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void accept(DeviceBatterStateListener deviceBatterStateListener) {
                    deviceBatterStateListener.onDeviceBatteryChange(deviceInfo, mgpVarA);
                }
            });
        }
    }

    public void g() {
        lsy.a(new Runnable() { // from class: lva
            @Override // java.lang.Runnable
            public final void run() {
                this.e.i();
            }
        });
    }

    /* synthetic */ void i() {
        List<DeviceInfo> listE = e();
        if (a(listE)) {
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            if (listE != null) {
                listE.forEach(new Consumer() { // from class: luu
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        DeviceInfo deviceInfo = (DeviceInfo) obj;
                        concurrentHashMap.put(deviceInfo.getDeviceIdentify(), deviceInfo);
                    }
                });
            }
            this.l = concurrentHashMap;
            n();
        }
    }

    private boolean a(List<DeviceInfo> list) {
        boolean zIsEmpty;
        if (list == null) {
            zIsEmpty = this.l.isEmpty();
        } else {
            if (list.size() != this.l.size()) {
                return true;
            }
            HashMap map = new HashMap(this.l);
            for (DeviceInfo deviceInfo : list) {
                if (mig.c((DeviceInfo) map.remove(deviceInfo.getDeviceIdentify()), deviceInfo)) {
                    return true;
                }
            }
            zIsEmpty = map.isEmpty();
        }
        return !zIsEmpty;
    }

    public void o() {
        n();
    }

    private void n() {
        HandlerExecutor.a().removeCallbacks(this.o);
        HandlerExecutor.a().post(this.o);
    }

    /* synthetic */ void a(final List list, final List list2) {
        this.i.forEach(new Consumer() { // from class: lur
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((DeviceListUpdateListener) obj).onDeviceListUpdate(list, list2);
            }
        });
    }

    /* synthetic */ void h() {
        d(new DeviceListUpdateListener() { // from class: luy
            @Override // com.huawei.callback.DeviceListUpdateListener
            public final void onDeviceListUpdate(List list, List list2) {
                this.f40871c.a(list, list2);
            }
        });
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(final DeviceListUpdateListener deviceListUpdateListener) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            lsy.a(new Runnable() { // from class: luz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40872c.d(deviceListUpdateListener);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList(this.l.values());
        final HashMap map = new HashMap(0);
        final HashMap map2 = new HashMap(0);
        for (DeviceInfo deviceInfo : arrayList) {
            map.put(deviceInfo.getDeviceIdentify(), deviceInfo);
            map2.put(deviceInfo.getDeviceName(), deviceInfo);
            LogUtil.a("DeviceInfoProtectManage", "getCloudDeviceInfoList macValueMap:", deviceInfo.getDeviceName());
        }
        deviceListUpdateListener.onDeviceListUpdate(arrayList, (List) c().stream().filter(new Predicate<CloudDeviceInfo>() { // from class: lut.8
            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean test(CloudDeviceInfo cloudDeviceInfo) {
                return (map.containsKey(cloudDeviceInfo.getDeviceIdentify()) || map2.containsKey(cloudDeviceInfo.getDeviceName())) ? false : true;
            }
        }).collect(Collectors.toList()));
    }

    public List<DeviceInfo> e() {
        FutureTask<List<DeviceInfo>> futureTask = this.k;
        if (futureTask == null || futureTask.isDone()) {
            futureTask = new FutureTask<>(new Callable() { // from class: luv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceInfoProtectManage");
                }
            });
            this.k = futureTask;
            lsy.a(futureTask);
        }
        try {
            return futureTask.get();
        } catch (Exception unused) {
            LogUtil.j("DeviceInfoProtectManage", "getCloudDevices");
            return new ArrayList(this.l.values());
        }
    }

    public List<CloudDeviceInfo> c() {
        FutureTask<List<CloudDeviceInfo>> futureTask = this.m;
        if (futureTask == null || futureTask.isDone()) {
            futureTask = new FutureTask<>(new AnonymousClass7());
            this.m = futureTask;
            lsy.a(futureTask);
        }
        try {
            return futureTask.get();
        } catch (Exception unused) {
            LogUtil.j("DeviceInfoProtectManage", "getCloudDevices");
            return new ArrayList(this.e.values());
        }
    }

    /* JADX INFO: renamed from: lut$7, reason: invalid class name */
    class AnonymousClass7 implements Callable<List<CloudDeviceInfo>> {
        AnonymousClass7() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<CloudDeviceInfo> call() throws Exception {
            List<CloudDeviceInfo> listC = lvl.c();
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            listC.forEach(new Consumer() { // from class: lvf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    CloudDeviceInfo cloudDeviceInfo = (CloudDeviceInfo) obj;
                    concurrentHashMap.put(cloudDeviceInfo.getDeviceIdentify(), cloudDeviceInfo);
                }
            });
            lut.this.e = concurrentHashMap;
            return listC;
        }
    }

    public DeviceInfo b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        DeviceInfo deviceInfo = this.l.get(str);
        return deviceInfo != null ? deviceInfo : this.e.get(str);
    }

    public boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceIdentify() == null) {
            LogUtil.j("DeviceInfoProtectManage", "isSameTypeDevice currentDevice or deviceMac is null");
            return false;
        }
        String strD = lvl.d(deviceInfo.getDeviceName());
        LogUtil.a("DeviceInfoProtectManage", "isSameTypeDevice currentDeviceName:", strD, "deviceMac:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        Iterator it = new ArrayList(this.l.entrySet()).iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo2 = (DeviceInfo) ((Map.Entry) it.next()).getValue();
            if (deviceInfo2 != null && !deviceInfo.getDeviceIdentify().equals(deviceInfo2.getDeviceIdentify()) && strD.equals(lvl.d(deviceInfo2.getDeviceName()))) {
                return true;
            }
        }
        Iterator it2 = new ArrayList(this.e.entrySet()).iterator();
        while (it2.hasNext()) {
            CloudDeviceInfo cloudDeviceInfo = (CloudDeviceInfo) ((Map.Entry) it2.next()).getValue();
            if (cloudDeviceInfo != null && !deviceInfo.getDeviceIdentify().equals(cloudDeviceInfo.getDeviceIdentify()) && strD.equals(lvl.d(cloudDeviceInfo.getDeviceName()))) {
                return true;
            }
        }
        return false;
    }

    public DeviceCapability e(String str) {
        return eej.a(str);
    }

    public void d(DeviceConnectStateListener deviceConnectStateListener) {
        this.f40859b.add(deviceConnectStateListener);
    }

    public void b(DeviceConnectStateListener deviceConnectStateListener) {
        this.f40859b.remove(deviceConnectStateListener);
    }

    public void b(DeviceExtraStateListener deviceExtraStateListener) {
        this.f.add(deviceExtraStateListener);
    }

    public void c(DeviceExtraStateListener deviceExtraStateListener) {
        this.f.remove(deviceExtraStateListener);
    }

    public void e(DeviceBatterStateListener deviceBatterStateListener) {
        this.f40860c.add(deviceBatterStateListener);
    }

    public void b(DeviceBatterStateListener deviceBatterStateListener) {
        this.f40860c.remove(deviceBatterStateListener);
    }

    public void a(DeviceListUpdateListener deviceListUpdateListener) {
        this.i.add(deviceListUpdateListener);
    }

    public void c(DeviceListUpdateListener deviceListUpdateListener) {
        this.i.remove(deviceListUpdateListener);
    }

    public boolean b(DeviceInfo deviceInfo) {
        return (deviceInfo == null || this.d.contains(Integer.valueOf(deviceInfo.getProductType())) || eel.d(deviceInfo.getProductType())) ? false : true;
    }

    public void d(DeviceInfo deviceInfo) {
        this.h = deviceInfo;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DeviceInfo deviceInfoRemove = this.l.remove(str);
        CloudDeviceInfo cloudDeviceInfoRemove = this.e.remove(str);
        if (deviceInfoRemove == null && cloudDeviceInfoRemove == null) {
            return;
        }
        if (deviceInfoRemove == null) {
            deviceInfoRemove = cloudDeviceInfoRemove;
        }
        c(deviceInfoRemove);
    }

    private void c(final DeviceInfo deviceInfo) {
        this.f40858a.forEach(new Consumer<DeviceDeleteListener>() { // from class: lut.6
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void accept(DeviceDeleteListener deviceDeleteListener) {
                deviceDeleteListener.onDeviceDelete(deviceInfo);
            }
        });
    }

    public void d(DeviceDeleteListener deviceDeleteListener) {
        this.f40858a.add(deviceDeleteListener);
    }

    public void c(DeviceDeleteListener deviceDeleteListener) {
        this.f40858a.remove(deviceDeleteListener);
    }

    public DeviceInfo d() {
        return this.h;
    }

    public boolean f() {
        return this.j;
    }

    public void d(boolean z) {
        this.j = z;
    }

    public boolean j() {
        int i = this.g;
        return (i == -1 || i == 2 || i == 3 || i == 4) ? false : true;
    }

    public static lut a() {
        return d.e;
    }

    static class d {
        private static final lut e = new lut();
    }
}
