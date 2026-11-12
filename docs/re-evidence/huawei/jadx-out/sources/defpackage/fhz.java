package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fhz {
    private static final List<DeviceInfo> e = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f34078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f34079c;
    private List<DeviceInfo> d;
    private IntentFilter f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final Object l;
    private boolean m;
    private boolean n;
    private IBaseResponseCallback o;
    private BroadcastReceiver r;
    private IBaseResponseCallback s;
    private IBaseResponseCallback t;

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fhz f34082b = new fhz();
    }

    private fhz() {
        this.f = new IntentFilter();
        this.g = false;
        this.i = false;
        this.j = false;
        this.m = false;
        this.k = false;
        this.n = false;
        this.f34077a = 0;
        this.d = new ArrayList();
        this.h = false;
        this.l = new Object();
        this.f34079c = new IBaseResponseCallback() { // from class: fhz.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 100000) {
                    ReleaseLogUtil.d("HWhealthLinkage_", "already binder");
                    fhz.this.b();
                }
            }
        };
        this.t = new IBaseResponseCallback() { // from class: fhz.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "syncFitnessDetailData err_code is " + i);
                LogUtil.d("HWhealthLinkage_", "syncFitnessDetailData objData is " + obj);
                if (i == 100000) {
                    LogUtil.a("HWhealthLinkage_", "syncFitnessDetailData succeed");
                    return;
                }
                LogUtil.a("HWhealthLinkage_", "syncFitnessDetailData return error");
                if (fhz.this.s != null) {
                    fhz.this.s.a(-1, Long.valueOf(System.currentTimeMillis()));
                }
            }
        };
        this.f34078b = new IBaseResponseCallback() { // from class: fhz.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 100000) {
                    ReleaseLogUtil.d("HWhealthLinkage_", "WearApp and HealthApp connected");
                    if (fhz.this.o != null) {
                        fhz.this.o.a(6, new Object());
                    }
                }
            }
        };
        fks.d().k(new IBaseResponseCallback() { // from class: fhz.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "err_code is " + i);
                synchronized (fhz.this.l) {
                    if (!fhz.this.h) {
                        fhz.this.k();
                    }
                }
            }
        });
    }

    public static final fhz d() {
        return a.f34082b;
    }

    public boolean c() {
        boolean z;
        synchronized (this.l) {
            z = this.h;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ReleaseLogUtil.d("HWhealthLinkage_", "initMediator");
        this.h = true;
        fic.e().f();
        fhy.e().c();
        fhh.b().d();
        fhh.b().c();
        fhi.d().a();
        fic.e().g();
        fic.e().l();
        fic.e().k();
        fic.e().m();
        fic.e().n();
        fic.e().o();
        fic.e().i();
        fhw.d().registerStatusListener();
        fks.d().g(this.f34079c);
        int iG = drw.e().g();
        int iC = iG > 2 ? drw.e().c() : 0;
        b();
        ReleaseLogUtil.d("HWhealthLinkage_", "Mediator initialized completed wearSize:", iG + "  deleteNum:" + iC);
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        this.o = iBaseResponseCallback;
        fks.d().k(this.f34078b);
    }

    public void n() {
        this.o = null;
        fks.d().q(this.f34078b);
    }

    public void b(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HWhealthLinkage_", "notifyWearSDKRefreshData");
        if (this.r == null) {
            ReleaseLogUtil.d("HWhealthLinkage_", "register Receiver");
            this.f.addAction("com.huawei.health.fitness_detail_sync_success");
            this.f.addAction("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_START");
            this.f.addAction("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_SUCCESS");
            this.f.addAction("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_FAILED");
            this.f.addAction(HwExerciseConstants.WORKOUT_RECORD_SAVE_FINISH);
            this.f.addAction("com.huawei.health.fitness_detail_sync_fail");
            this.r = new BroadcastReceiver() { // from class: fhz.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    ReleaseLogUtil.d("HWhealthLinkage_", "Mediator receive broadcastReceiver");
                    if (intent != null) {
                        String action = intent.getAction();
                        if (action != null) {
                            fhz.this.a(action);
                            fhz.this.d(intent);
                            fhz.this.b(action);
                            return;
                        }
                        ReleaseLogUtil.e("HWhealthLinkage_", "Mediator action is null");
                    }
                }
            };
            BroadcastManagerUtil.d(dxw.d(), this.r, this.f, LocalBroadcast.f36595c, null);
        }
        this.s = iBaseResponseCallback;
        fks.d().r(this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (str.equals("com.huawei.health.fitness_detail_sync_success")) {
            ReleaseLogUtil.d("HWhealthLinkage_", "Mediator receive DETAIL_DATA_SYNC_SUCCEED");
            IBaseResponseCallback iBaseResponseCallback = this.s;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(1, new Object());
            }
            cre.a().j();
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_", "refreshCommonData other condition");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str.equals(HwExerciseConstants.WORKOUT_RECORD_SAVE_FINISH)) {
            ReleaseLogUtil.d("HWhealthLinkage_", "Mediator receive WORKOUT_RECORD_SAVE_FINISH");
            IBaseResponseCallback iBaseResponseCallback = this.s;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(5, new Object());
                return;
            }
            return;
        }
        if (str.equals("com.huawei.health.fitness_detail_sync_fail")) {
            ReleaseLogUtil.d("HWhealthLinkage_", "Mediator receive FITNESS_DETAIL_SYNC_FAIL");
            IBaseResponseCallback iBaseResponseCallback2 = this.s;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(-1, new Object());
                return;
            }
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_", "refreshOtherData other condition");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            ReleaseLogUtil.d("HWhealthLinkage_", "refreshSleepData: action is null");
            return;
        }
        if (action.equals("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_START")) {
            ReleaseLogUtil.d("HWhealthLinkage_", "Mediator receive CORE_SLEEP_DATA_SYNC_START");
            IBaseResponseCallback iBaseResponseCallback = this.s;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(2, new Object());
                return;
            }
            return;
        }
        if (action.equals("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_SUCCESS")) {
            ReleaseLogUtil.d("HWhealthLinkage_", "Mediator receive CORE_SLEEP_DATA_SYNC_SUCCEED");
            IBaseResponseCallback iBaseResponseCallback2 = this.s;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(3, new Object());
                return;
            }
            return;
        }
        if (action.equals("com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_FAILED")) {
            ReleaseLogUtil.d("HWhealthLinkage_", "Mediator receive CORE_SLEEP_DATA_SYNC_FAILED");
            if (this.s != null) {
                int intExtra = -1;
                try {
                    intExtra = intent.getIntExtra(OpAnalyticsConstants.ERROR_CODE, -1);
                    ReleaseLogUtil.d("HWhealthLinkage_", "refreshSleepData() errorCode:" + intExtra);
                } catch (Exception unused) {
                    ReleaseLogUtil.d("HWhealthLinkage_", "refreshSleepData() Exception");
                }
                this.s.a(4, Integer.valueOf(intExtra));
                return;
            }
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_", "Mediator refreshSleepData other condition");
    }

    public boolean g() {
        return this.g;
    }

    public void e(boolean z) {
        this.g = z;
        cre.a().c(this.g);
    }

    public void e(int i) {
        this.f34077a = i;
    }

    public boolean i() {
        return this.i;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public boolean h() {
        return this.j;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public boolean f() {
        return this.m;
    }

    public void d(boolean z) {
        this.m = z;
    }

    public boolean a() {
        return this.n;
    }

    public boolean j() {
        return this.k;
    }

    public List<DeviceInfo> e() {
        return this.d;
    }

    public boolean b() {
        LogUtil.a("HWhealthLinkage_", "getHeartRateDeviceFromWearAPP");
        List<DeviceInfo> list = e;
        list.clear();
        boolean zL = l();
        m();
        o();
        if (list.size() > 0 && this.m) {
            ReleaseLogUtil.e("HWhealthLinkage_", "getHeartRateDeviceFromWearAPP delete num;" + drw.e().c() + "  TEMP_DEVICE_INFO_LIST:" + list.size());
            Iterator<DeviceInfo> it = list.iterator();
            while (it.hasNext()) {
                fhi.d().b(it.next());
            }
        }
        ReleaseLogUtil.d("HWhealthLinkage_", "getHeartRateDeviceFromWearAPP heartRateDevices size is " + this.d.size());
        Iterator<DeviceInfo> it2 = this.d.iterator();
        while (it2.hasNext()) {
            LogUtil.a("HWhealthLinkage_", "getHeartRateDeviceFromWearAPP heartRateDevices aar " + it2.next().toString());
        }
        if (this.d.size() == 0) {
            ReleaseLogUtil.d("HWhealthLinkage_", "getHeartRateDeviceFromWearAPP setLinkStatus is false");
            this.g = false;
        }
        return zL;
    }

    private void o() {
        DeviceInfo deviceInfoB = fks.d().b(false);
        if (deviceInfoB != null) {
            if (!c(deviceInfoB) && deviceInfoB.getDeviceName() != null && deviceInfoB.getSecurityUuid() != null) {
                boolean zJ = fks.d().j();
                ReleaseLogUtil.d("HWhealthLinkage_", "acquireHealthDeviceInfo isSupportHeartRate = ", Boolean.valueOf(zJ));
                if (zJ) {
                    e(deviceInfoB);
                    return;
                }
                return;
            }
            ReleaseLogUtil.d("HWhealthLinkage_", "device " + deviceInfoB.getDeviceName() + " has already been added ");
        }
    }

    private void m() {
        DeviceInfo deviceInfoB = fks.d().b(true);
        if (deviceInfoB != null) {
            if (!c(deviceInfoB) && deviceInfoB.getDeviceName() != null && deviceInfoB.getSecurityUuid() != null) {
                boolean zM = fks.d().m();
                ReleaseLogUtil.d("HWhealthLinkage_", "acquireWearDeviceInfo isSupportHeartRate = ", Boolean.valueOf(zM));
                if (zM) {
                    e(deviceInfoB);
                    return;
                }
                return;
            }
            ReleaseLogUtil.d("HWhealthLinkage_", "device " + deviceInfoB.getDeviceName() + " has already been added ");
        }
    }

    private void e(DeviceInfo deviceInfo) {
        this.d.add(deviceInfo);
        if (e(deviceInfo.getSecurityUuid())) {
            fhi.d().a(deviceInfo.getSecurityUuid());
        } else {
            e.add(deviceInfo);
        }
    }

    public boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("HWhealthLinkage_", "isWearableDevice uniqueId is null.");
            return false;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HWhealthLinkage_");
        if (njy.e(deviceList)) {
            ReleaseLogUtil.e("HWhealthLinkage_", "isWearableDevice deviceInfoList is empty.");
            return false;
        }
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getSecurityUuid())) {
                return true;
            }
        }
        ReleaseLogUtil.d("HWhealthLinkage_", "This is not the wearable device.");
        return false;
    }

    private boolean l() {
        LogUtil.a("HWhealthLinkage_", "getDeviceCapability");
        JSONObject jSONObjectB = fks.d().b();
        if (jSONObjectB == null) {
            return false;
        }
        LogUtil.d("HWhealthLinkage_", "DeviceCapability" + jSONObjectB.toString());
        try {
            boolean z = jSONObjectB.has("isSupportExerciseAdvice") ? jSONObjectB.getBoolean("isSupportExerciseAdvice") : false;
            boolean z2 = jSONObjectB.has("isSupportWorkoutExerciseDisplayLink") ? jSONObjectB.getBoolean("isSupportWorkoutExerciseDisplayLink") : false;
            if (jSONObjectB.has("isSupportHeartRateInfo")) {
                this.m = jSONObjectB.getBoolean("isSupportHeartRateInfo");
                ReleaseLogUtil.d("HWhealthLinkage_", "SupportHeartRateInfo is " + this.m);
            }
            if (jSONObjectB.has("isSupportStressInfo")) {
                this.n = jSONObjectB.getBoolean("isSupportStressInfo");
                ReleaseLogUtil.d("HWhealthLinkage_", "SupportStressInfo is " + this.n);
            }
            if (jSONObjectB.has("isSupportInformCloseOrOpen")) {
                boolean z3 = jSONObjectB.getBoolean("isSupportInformCloseOrOpen");
                this.k = z3;
                ReleaseLogUtil.d("HWhealthLinkage_", "isSupportInformCloseOrOpen is ", Boolean.valueOf(z3));
            }
            if (z && z2) {
                ReleaseLogUtil.d("HWhealthLinkage_", "setNewLinkStrategy is true");
                this.j = true;
                this.i = false;
            } else if (z) {
                ReleaseLogUtil.d("HWhealthLinkage_", "setOldLinkStrategy is true");
                this.i = true;
                this.j = false;
            } else {
                this.j = false;
                this.i = false;
                ReleaseLogUtil.d("HWhealthLinkage_", "both are false");
            }
            ReleaseLogUtil.d("HWhealthLinkage_", "Mediator isNewLinkStrategy:" + this.j + "  isOldLinkStrategy:" + this.i + "  isSupportHeartReport:" + this.m);
        } catch (JSONException e2) {
            LogUtil.e("HWhealthLinkage_", e2.getMessage());
            xjt.v("getDeviceCapability exception：" + e2.getMessage());
        }
        return true;
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (this.d.isEmpty()) {
            return false;
        }
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        if (TextUtils.isEmpty(securityDeviceId)) {
            return false;
        }
        Iterator<DeviceInfo> it = this.d.iterator();
        while (it.hasNext()) {
            if (securityDeviceId.equals(it.next().getSecurityDeviceId())) {
                return true;
            }
        }
        return false;
    }
}
