package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.gzr;
import defpackage.gzv;
import defpackage.ive;
import defpackage.iwi;
import defpackage.izz;
import defpackage.jaa;
import defpackage.jac;
import defpackage.jad;
import defpackage.jaf;
import defpackage.jah;
import defpackage.jpq;
import defpackage.njy;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class SportLinkageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10455a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile PluginSportTrackAdapter f10456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LinkageDataManager> f10457c;
    private iwi d;
    private Context e;
    private jad g = null;
    private jah f = null;
    private izz i = null;

    public SportLinkageManager(Context context) {
        this.d = null;
        this.e = context;
        f10456b = ive.c().a();
        iwi iwiVar = new iwi(f10456b);
        this.d = iwiVar;
        iwiVar.i();
    }

    public int e() {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            return iwiVar.e();
        }
        return 0;
    }

    public boolean d(int i, int i2, int i3, IRidePostureDataCallback iRidePostureDataCallback) {
        iwi iwiVar = this.d;
        if (iwiVar == null) {
            this.d = new iwi(f10456b);
        } else {
            iwiVar.a(f10456b);
        }
        this.d.d(i);
        this.d.a(i3);
        if (!jaa.h(i)) {
            return true;
        }
        jad jadVar = this.g;
        if (jadVar == null) {
            this.g = new jad(f10456b, this.d, this.e);
        } else {
            jadVar.a(f10456b);
        }
        d(i, i2);
        e(i, i2);
        a(i, i2, iRidePostureDataCallback);
        a(i2);
        return true;
    }

    private void d(int i, int i2) {
        Map<String, DeviceCapability> mapQueryDeviceCapability;
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_SportLinkageManager");
        LogUtil.a("Track_SportLinkageManager", "deviceInfo != null ", Boolean.valueOf(deviceInfo != null));
        if (deviceInfo != null && (mapQueryDeviceCapability = ecu.d().queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "Track_SportLinkageManager")) != null && mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify()) != null && mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify()).isSupportInformCloseOrOpen()) {
            jad jadVar = this.g;
            if (jadVar != null) {
                jadVar.d(i);
                this.g.b(i2);
                this.g.c();
            }
            f10455a = true;
        }
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.b();
            this.d.f();
        }
    }

    private void e(int i, int i2) {
        jah jahVar = this.f;
        if (jahVar == null) {
            this.f = new jah(f10456b);
        } else {
            jahVar.c(f10456b);
        }
        k();
        this.f.c(i2);
        this.f.d(i);
        this.f.b();
    }

    private void a(int i, int i2, IRidePostureDataCallback iRidePostureDataCallback) {
        izz izzVar = this.i;
        if (izzVar == null) {
            this.i = new izz(f10456b, this.e);
        } else {
            izzVar.c(f10456b);
        }
        k();
        this.i.d(i2);
        this.i.b(i);
        this.i.e(iRidePostureDataCallback);
    }

    private void k() {
        if (f10456b != null) {
            f10456b.init();
        }
    }

    private void c(int i) {
        if (this.f10457c == null) {
            this.f10457c = new ArrayList(16);
            if (i == 259) {
                this.f10457c.add(new PowerLinkageDataManager(this.e));
                this.f10457c.add(new AnalogPowerLinkageDataManager(this.e));
                this.f10457c.add(new SlopeLinkageDataManager(this.e));
                this.f10457c.add(new AnalogCadenceManager(this.e));
                return;
            }
            if (jpq.j(i)) {
                this.f10457c.add(new AnalogPowerLinkageDataManager(this.e));
            } else {
                LogUtil.a("Track_SportLinkageManager", "initLinkDataManager sportType:", Integer.valueOf(i));
            }
        }
    }

    private void a(int i) {
        c(i);
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.registerLinkageData();
                }
            }
        }
    }

    private void l() {
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.unregisterLinkageData();
                }
            }
        }
    }

    public void h() {
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.a();
        }
        izz izzVar = this.i;
        if (izzVar != null) {
            izzVar.c();
        }
        jad jadVar = this.g;
        if (jadVar != null && f10455a) {
            jadVar.b();
        }
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.d();
        }
        l();
    }

    public void c(int i, IRidePostureDataCallback iRidePostureDataCallback) {
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.b();
        }
        izz izzVar = this.i;
        if (izzVar != null && i == 259) {
            izzVar.e(iRidePostureDataCallback);
        }
        if (f10455a) {
            jad jadVar = this.g;
            if (jadVar != null) {
                jadVar.c();
                this.d.b();
            }
        } else {
            iwi iwiVar = this.d;
            if (iwiVar != null) {
                iwiVar.b();
            }
        }
        a(i);
    }

    public void j() {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.g();
        }
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.a();
        }
        izz izzVar = this.i;
        if (izzVar != null) {
            izzVar.c();
        }
        if (f10455a) {
            jad jadVar = this.g;
            if (jadVar != null) {
                jadVar.b();
                this.d.d();
            }
        } else {
            iwi iwiVar2 = this.d;
            if (iwiVar2 != null) {
                iwiVar2.d();
            }
        }
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.clearCache();
                }
            }
        }
    }

    public boolean e(MotionPath motionPath, boolean z) {
        boolean zC = this.d != null ? c(motionPath, z) : z;
        if (this.f != null) {
            zC = a(motionPath, z);
        }
        if (this.i != null) {
            zC = d(motionPath, z);
        }
        return b(motionPath, zC);
    }

    public void a(String str, boolean z) {
        izz izzVar;
        List<gzr> listC = jac.c(this.e);
        if (njy.e(listC) || (izzVar = this.i) == null) {
            LogUtil.e("Track_SportLinkageManager", "handleCadenceData ridePostureDataList == null");
            return;
        }
        izzVar.d(listC);
        if (!z) {
            SharedPreferenceManager.e(this.e, Integer.toString(20002), "saved_maximum_cadence", null, null);
        }
        List<String> listB = izz.b(listC);
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        if (!TextUtils.isEmpty(stringBuffer.toString())) {
            jaf.b(this.e, stringBuffer.toString(), str);
        } else {
            LogUtil.e("Track_SportLinkageManager", "stringBuffer.toString() is null:");
        }
    }

    private boolean c(MotionPath motionPath, boolean z) {
        ArrayList<HeartRateData> arrayListA = this.d.a(false);
        if (njy.b(arrayListA)) {
            LogUtil.a("Track_SportLinkageManager", "saveCacheData：save remain heartRateList ", Integer.valueOf(arrayListA.size()));
            motionPath.requestHeartRateList().addAll(arrayListA);
            z = true;
        }
        ArrayList<HeartRateData> arrayListC = this.d.c(false);
        if (njy.b(arrayListC)) {
            LogUtil.a("Track_SportLinkageManager", "saveCacheData：save remain heartRateList ", Integer.valueOf(arrayListC.size()));
            motionPath.requestInvalidHeartRateList().addAll(arrayListC);
        }
        return z;
    }

    private boolean a(MotionPath motionPath, boolean z) {
        jah jahVar = this.f;
        if (jahVar != null) {
            ArrayList<gzv> arrayListA = jahVar.a(false);
            if (njy.b(arrayListA)) {
                LogUtil.a("Track_SportLinkageManager", "saveCacheRunningPosture：save remain runningPostureList ", Integer.valueOf(arrayListA.size()));
                motionPath.requestRunningPostureList().addAll(arrayListA);
                return true;
            }
        }
        return z;
    }

    private boolean d(MotionPath motionPath, boolean z) {
        izz izzVar = this.i;
        if (izzVar != null) {
            ArrayList<gzr> arrayListE = izzVar.e(false);
            if (njy.b(arrayListE)) {
                LogUtil.a("Track_SportLinkageManager", "saveCacheRidePostureData：save remain ridePostureDataList ", Integer.valueOf(arrayListE.size()));
                motionPath.requestRidePostureDataList().addAll(arrayListE);
                return true;
            }
        }
        return z;
    }

    private boolean b(MotionPath motionPath, boolean z) {
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.saveLinkDataToMotionPath(motionPath, true, false);
                    z = true;
                }
            }
        }
        return z;
    }

    public void e(MotionPathSimplify motionPathSimplify) {
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.a(motionPathSimplify);
        }
        izz izzVar = this.i;
        if (izzVar != null) {
            izzVar.c(motionPathSimplify);
        }
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.saveDataToSimplify(motionPathSimplify);
                }
            }
        }
    }

    public void a(MotionData motionData, int i) {
        if (this.f == null) {
            this.f = new jah(f10456b);
        }
        this.f.c(motionData.getRunningPostureList());
        if (this.d == null) {
            this.d = new iwi(f10456b);
        }
        this.d.a(motionData.getHeartRateList(), motionData.getInvalidHeartRateList());
        if (this.i == null) {
            this.i = new izz(f10456b, this.e);
        }
        this.i.c(motionData.getRidePostureDataList());
        this.i.d();
        c(i);
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.recoverLinkData(motionData);
                }
            }
        }
    }

    public void c() {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.d();
        }
        izz izzVar = this.i;
        if (izzVar != null) {
            izzVar.c();
        }
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.a();
        }
        jad jadVar = this.g;
        if (jadVar != null) {
            jadVar.b();
        }
        l();
        HandlerExecutor.c(new Runnable() { // from class: iwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f38160b.m();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.d = null;
        this.i = null;
        this.f = null;
        this.g = null;
        this.f10457c = null;
    }

    public void c(Bundle bundle) {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.a(bundle);
        }
        izz izzVar = this.i;
        if (izzVar != null) {
            izzVar.b(bundle);
        }
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.e(bundle);
        }
        jad jadVar = this.g;
        if (jadVar != null) {
            jadVar.a(bundle);
        }
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.putLatestLinkData(bundle);
                }
            }
        }
    }

    public HeartRateData f() {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            return iwiVar.c();
        }
        return null;
    }

    public void a(MotionPath motionPath) {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            motionPath.saveHeartRateList(iwiVar.a(true));
            motionPath.saveInvalidHeartRateList(this.d.c(true));
        }
        jah jahVar = this.f;
        if (jahVar != null) {
            motionPath.saveRunningPostureList(jahVar.a(true));
        }
        izz izzVar = this.i;
        if (izzVar != null) {
            izzVar.a();
            if (jaf.b(this.e, this.i.e(false))) {
                this.i.e(true);
            }
        }
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.saveLinkDataToMotionPath(motionPath, false, true);
                    linkageDataManager.saveRealTimeLinkData();
                }
            }
        }
    }

    public void d() {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.c(true);
            this.d.a(true);
        }
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.a(true);
        }
    }

    public void i() {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.h();
        }
    }

    public void b() {
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.a(true);
        }
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            iwiVar.a(true);
            this.d.c(true);
        }
    }

    public void a(Bundle bundle) {
        iwi iwiVar = this.d;
        if (iwiVar != null) {
            bundle.putLong("heartRateTime", iwiVar.a());
        }
        jah jahVar = this.f;
        if (jahVar != null) {
            jahVar.a(bundle);
        }
        izz izzVar = this.i;
        if (izzVar != null) {
            izzVar.b(bundle);
        }
        if (njy.b(this.f10457c)) {
            for (LinkageDataManager linkageDataManager : this.f10457c) {
                if (linkageDataManager != null) {
                    linkageDataManager.putLatestLinkData(bundle);
                }
            }
        }
    }

    public CopyOnWriteArrayList<gzv> a() {
        jah jahVar = this.f;
        if (jahVar != null) {
            return jahVar.c();
        }
        return null;
    }

    public boolean g() {
        return f10455a;
    }
}
