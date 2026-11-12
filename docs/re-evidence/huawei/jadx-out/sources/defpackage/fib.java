package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.hwhealthlinkage.linkageinterface.SportPostureLifecycle;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fib implements SportPostureLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, IBaseResponseCallback> f34087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fkp f34088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ivo.d> f34089c;
    private fko d;
    private boolean e;
    private int f;
    private DeviceInfo g;
    private boolean h;
    private boolean i;
    private int j;
    private fko m;

    private fib() {
        this.h = false;
        this.e = false;
        this.i = false;
        this.f34087a = new HashMap(16);
        this.f34089c = new ArrayList(10);
    }

    @Override // com.huawei.health.hwhealthlinkage.linkageinterface.SportPostureLifecycle
    public void openReport(int i, int i2) {
        this.f = i2;
        this.j = i;
        ReleaseLogUtil.d("HWhealthLinkage_Posture_SportPostureInteractor", "openReport sportType：", Integer.valueOf(i), ", sportStatus：", Integer.valueOf(i2), ", mIsWornFootBolt: ", Boolean.valueOf(this.h), ", mIsOnlyWornWaistBolt: ", Boolean.valueOf(this.e));
        if (i == 258 || i == 264) {
            g();
            d(i, i2);
            if (this.h || this.e) {
                return;
            } else {
                e(i, i2);
            }
        }
        if (i == 259) {
            d(i, i2);
            if (this.h) {
                return;
            }
            a(i, i2);
        }
    }

    @Override // com.huawei.health.hwhealthlinkage.linkageinterface.SportPostureLifecycle
    public void closeReport(int i, int i2) {
        this.f = i2;
        this.j = i;
        ReleaseLogUtil.d("HWhealthLinkage_Posture_SportPostureInteractor", "closeReport sportType：", Integer.valueOf(i), ", sportStatus：", Integer.valueOf(i2), ", mIsWornFootBolt: ", Boolean.valueOf(this.h), ", mIsOnlyWornWaistBolt: ", Boolean.valueOf(this.e));
        if (i == 258 || i == 264) {
            f(i, i2);
            i();
            if (this.h || this.e) {
                b(i2);
                return;
            }
            b(i, i2);
        }
        if (i == 259) {
            f(i, i2);
            if (this.h) {
                b(i2);
                return;
            }
            c(i, i2);
        }
        b(i2);
    }

    private void b(int i) {
        if (i == 4) {
            this.f34089c = new ArrayList(10);
            this.i = false;
        }
        this.h = false;
        this.e = false;
    }

    @Override // com.huawei.health.hwhealthlinkage.linkageinterface.SportPostureLifecycle
    public void sendDataToDevice(Bundle bundle) {
        DeviceInfo deviceInfo;
        if (njy.b(this.f34089c)) {
            this.d.c(5, this.j);
        }
        fko fkoVar = this.m;
        if (fkoVar == null || (deviceInfo = this.g) == null) {
            return;
        }
        fkoVar.e(bundle, deviceInfo);
    }

    public List<ivo.d> e() {
        return this.f34089c;
    }

    public int c() {
        return this.j;
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final fib f34093c = new fib();
    }

    public Map<String, IBaseResponseCallback> b() {
        return this.f34087a;
    }

    public static fib d() {
        return c.f34093c;
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Posture_SportPostureInteractor", "setBoltStatusCallback: invalid input");
        } else {
            this.f34087a.put(str, iBaseResponseCallback);
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Posture_SportPostureInteractor", "setBoltStatusCallback: invalid input");
        } else {
            this.f34087a.remove(str);
        }
    }

    public List<DeviceInfo> a() {
        ArrayList arrayList = new ArrayList();
        if (njy.e(this.f34089c)) {
            LogUtil.j("Posture_SportPostureInteractor", "getCurrentDevices failed, mBoltDeviceInfos is empty.");
            return arrayList;
        }
        Iterator<ivo.d> it = this.f34089c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().e());
        }
        return arrayList;
    }

    private void d(int i, int i2) {
        a(i);
        if (njy.b(this.f34089c)) {
            this.d = new fko();
            edc.e().registerDeviceSampleListener("hw.sport.linkage", this.d);
            this.d.c(i2, i);
            f();
        }
    }

    private void e(int i, int i2) {
        List<DeviceCapability> listE = fks.d().e();
        if (njy.e(listE)) {
            ReleaseLogUtil.d("HWhealthLinkage_Posture_SportPostureInteractor", "openPostureDataReport: healthDeviceList is empty.");
            return;
        }
        for (int i3 = 0; i3 < listE.size(); i3++) {
            LogUtil.a("Posture_SportPostureInteractor", "openPostureDataReport: healthDevice: ", Integer.valueOf(i3), listE.get(i3));
            boolean zIsSupportRunPosture = listE.get(i3).isSupportRunPosture();
            this.i = zIsSupportRunPosture;
            if (zIsSupportRunPosture) {
                fkp fkpVar = new fkp();
                this.f34088b = fkpVar;
                fkpVar.e(i2, i);
                return;
            }
        }
    }

    private void a(int i, int i2) {
        fkp fkpVar = new fkp();
        this.f34088b = fkpVar;
        fkpVar.a(i2, i);
    }

    private void g() {
        if (fkn.c()) {
            this.g = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Posture_SportPostureInteractor");
            this.m = new fko();
            edc.e().registerDeviceSampleListener("hw.linkage.watch.posture.app", this.m);
        }
    }

    private void f() {
        ivo.a().b("Posture_SportPostureInteractor", new IBaseResponseCallback() { // from class: fib.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (fib.this.f == 1 || fib.this.f == 3) {
                    fib.this.d = new fko();
                    edc.e().registerDeviceSampleListener("hw.sport.linkage", fib.this.d);
                }
            }
        });
    }

    private void f(int i, int i2) {
        if (njy.b(this.f34089c)) {
            this.d.c(i2, i);
            if (i2 == 2) {
                edc.e().unRegisterDeviceSampleListener("hw.sport.linkage");
            } else {
                ivo.a().a("Posture_SportPostureInteractor");
            }
        }
    }

    private void b(int i, int i2) {
        if (this.i) {
            this.f34088b.b(i2, i);
        }
    }

    private void c(final int i, final int i2) {
        fks.d().c(new IBaseResponseCallback() { // from class: fib.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (i3 == 100000 && "true".equals(obj)) {
                    LogUtil.a("Posture_SportPostureInteractor", "closeRidePosture support ride posture");
                    fib.this.f34088b.c(i2, i);
                }
            }
        });
    }

    private void i() {
        if (fkn.c()) {
            edc.e().unRegisterDeviceSampleListener("hw.linkage.watch.posture.app");
        }
    }

    private void a(int i) {
        if (this.f == 1) {
            this.f34089c = ivo.a().b(i);
        }
        if (njy.e(this.f34089c)) {
            ReleaseLogUtil.e("HWhealthLinkage_Posture_SportPostureInteractor", "openPostureDataReport: boltDeviceInfos is empty.");
            return;
        }
        if (this.f34089c.size() == 1 && this.f34089c.get(0).d() == 1) {
            this.e = true;
            return;
        }
        Iterator<ivo.d> it = this.f34089c.iterator();
        while (it.hasNext()) {
            if (it.next().d() == 0) {
                this.h = true;
                return;
            }
        }
    }
}
