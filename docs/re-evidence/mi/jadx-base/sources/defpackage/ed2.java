package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.server.SportStateServer;
import com.xiaomi.fitness.sport_manager.state.AutoState;
import com.xiaomi.fitness.sport_manager.state.data.BeanAndWristPostureData;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseExtraData;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ed2 implements kzc, zyc, OnDeviceStatusListener {
    public static int u = 2;
    public static boolean v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16511b;
    public double c;
    public Handler d;
    public long h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WearableDeviceModel f16512k;
    public String l;
    public long m;
    public SportData n;
    public zyc o;
    public cen p;
    public int q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16510a = "BaseSportState";
    public ExecutorService e = Executors.newSingleThreadExecutor();
    public int f = 0;
    public int g = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Runnable f16513r = new a();
    public boolean s = false;
    public SportRequestData t = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!ed2.this.E()) {
                FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
                FitnessLogUtils.i(ed2.this.f16510a, "has no ongoing sport--connect");
                return;
            }
            WearableDeviceModel deviceModelByDid = SportDeviceModel.INSTANCE.getDeviceModelByDid(ed2.this.l);
            if (deviceModelByDid == null || !deviceModelByDid.isDeviceConnected()) {
                FitnessLogUtils fitnessLogUtils2 = FitnessLogUtils.INSTANCE;
                FitnessLogUtils.i(ed2.this.f16510a, "disconnected, and finish sport validSport = true");
                ed2.this.Y();
                if (ed2.this.B() == 4 && ed2.this.B() == 0) {
                    return;
                }
                ed2.this.P(true, new SportRequestData.a().o(), true);
            }
        }
    }

    public ed2(WearableDeviceModel wearableDeviceModel) {
        this.f16512k = wearableDeviceModel;
        if (wearableDeviceModel != null) {
            this.l = wearableDeviceModel.getDeviceInfo().getDid();
        }
        this.d = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void M() {
        Iterator<ISportStateChangedListener> it = f2o.x().Q().values().iterator();
        while (it.hasNext()) {
            try {
                it.next().onSportPaused();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void N() {
        Iterator<ISportStateChangedListener> it = f2o.x().Q().values().iterator();
        while (it.hasNext()) {
            it.next().onSportRestarted();
        }
    }

    public static int x() {
        return u;
    }

    public int A() {
        return this.q;
    }

    public int B() {
        return this.g;
    }

    public long C() {
        return this.m;
    }

    public int D() {
        return this.f;
    }

    public boolean E() {
        return v;
    }

    public final boolean F(int i) {
        int i2 = u;
        if ((i2 != 6 && i2 != 7) || i == 7 || i == 6) {
            return true;
        }
        return (i2 == 6 || i2 == 7) && i == 0;
    }

    public final boolean G(SportRequestData sportRequestData) {
        int i;
        return sportRequestData.sportState == 4 && ((i = sportRequestData.sportType) == 810 || i == 812) && sportRequestData.isCommandFromDevice;
    }

    public boolean H(int i) {
        return i == 8;
    }

    public boolean I(int i) {
        return i == 1 || i == 2 || i == 3 || i == 6 || i == 810 || i == 812;
    }

    public final boolean J() {
        return (this.q != 1 || f2o.x().t() == 6) && f2o.x().t() != 7;
    }

    public final /* synthetic */ void K(boolean z, SportRequestData sportRequestData) {
        ISportStateChangedListener iSportStateChangedListener = f2o.x().Q().get(com.xiaomi.fitness.sport_manager.remind.a.class);
        FitnessLogUtils.i(this.f16510a, "SportRemindListener : " + iSportStateChangedListener);
        if (iSportStateChangedListener != null) {
            iSportStateChangedListener.onSportFinished(z, sportRequestData.ids, sportRequestData.finishSportData);
        }
        for (ISportStateChangedListener iSportStateChangedListener2 : f2o.x().Q().values()) {
            if (iSportStateChangedListener2 != null && !(iSportStateChangedListener2 instanceof com.xiaomi.fitness.sport_manager.remind.a)) {
                iSportStateChangedListener2.onSportFinished(z, sportRequestData.ids, sportRequestData.finishSportData);
            }
        }
        ndn.i().onSportFinished(z, sportRequestData.ids, sportRequestData.finishSportData);
        q(z, sportRequestData.ids);
    }

    public final /* synthetic */ void L() {
        Z(2);
        f2o.x().g0();
    }

    public final void O(boolean z, byte[] bArr, FinishSportData finishSportData) {
        ISportStateChangedListener iSportStateChangedListener = f2o.x().Q().get(SportStateServer.class);
        if (iSportStateChangedListener != null) {
            iSportStateChangedListener.onSportFinished(z, bArr, finishSportData);
        }
    }

    public void P(final boolean z, final SportRequestData sportRequestData, boolean z2) {
        FitnessLogUtils.i(this.f16510a, "sport finished, validSport = " + z);
        if (z2) {
            SportDeviceModel.INSTANCE.removeDeviceStatusListener(this);
        }
        this.d.post(new Runnable() { // from class: sc2
            @Override // java.lang.Runnable
            public final void run() {
                this.f33496a.K(z, sportRequestData);
            }
        });
        this.d.postDelayed(new Runnable() { // from class: uc2
            @Override // java.lang.Runnable
            public final void run() {
                this.f35612a.L();
            }
        }, 1000L);
        this.o = null;
    }

    public void Q() {
        this.d.post(new Runnable() { // from class: wc2
            @Override // java.lang.Runnable
            public final void run() {
                ed2.M();
            }
        });
    }

    public void R(SportRequestData sportRequestData, int i) {
        int i2 = sportRequestData.sportType;
        this.d.post(new Runnable() { // from class: yc2
            @Override // java.lang.Runnable
            public final void run() {
                ed2.N();
            }
        });
    }

    public void S(SportRequestData sportRequestData, int i) {
        FitnessLogUtils.i(this.f16510a, "notifyListenerSportStart , requestData :" + sportRequestData + ", sportLaunchType:" + i);
        b0(i);
        SportData sportData = this.n;
        if (sportData != null) {
            sportRequestData.timeStamp = sportData.startTime;
            sportRequestData.timeZone = sportData.timezone;
        }
        jdn.h().p(i, sportRequestData.sportType);
        e0(sportRequestData, i);
        for (ISportStateChangedListener iSportStateChangedListener : f2o.x().Q().values()) {
            if (!(iSportStateChangedListener instanceof com.xiaomi.fitness.sport_manager.remind.a)) {
                iSportStateChangedListener.onSportStarted(sportRequestData.code, sportRequestData.timeStamp, sportRequestData.timeZone, sportRequestData.sportType, i);
            } else if (!sportRequestData.disableAudioBroadcast && J()) {
                iSportStateChangedListener.onSportStarted(sportRequestData.code, sportRequestData.timeStamp, sportRequestData.timeZone, sportRequestData.sportType, i);
            }
        }
    }

    public void T(SportRequestData sportRequestData, boolean z) {
        boolean zT;
        FitnessLogUtils.i(this.f16510a, "notifySportRequest " + sportRequestData);
        int i = sportRequestData.sportState;
        if (i == 1) {
            S(sportRequestData, sportRequestData.sportLaunchType);
            return;
        }
        if (i == 2) {
            Q();
            return;
        }
        if (i == 3) {
            R(sportRequestData, sportRequestData.sportLaunchType);
            return;
        }
        if (i != 4) {
            return;
        }
        int i2 = sportRequestData.sportType;
        if (i2 == 8 || i2 == 810 || i2 == 812) {
            zT = z() >= 60;
        } else {
            zT = z ? t(sportRequestData) : v(sportRequestData);
        }
        P(zT, sportRequestData, true);
        this.d.postDelayed(new rc2(this), 1000L);
    }

    public void U(SportRequestData sportRequestData) {
        if (G(sportRequestData)) {
            FitnessLogUtils.i(this.f16510a, "sportType:" + sportRequestData.sportType + ",isCommandFromDevice:true");
            O(z() >= 60, sportRequestData.ids, sportRequestData.finishSportData);
            sportRequestData.isCommandFromDevice = false;
            return;
        }
        h0(sportRequestData);
        FitnessLogUtils.i(this.f16510a, "iSportNotifyListener : " + this.o + " , SportRequestData : " + sportRequestData);
        w(sportRequestData);
        if (this.o != null) {
            FitnessLogUtils.i(this.f16510a, "sportStateNotifyProxy is not null");
            this.o.j(sportRequestData);
            return;
        }
        FitnessLogUtils.i(this.f16510a, "sportStateNotifyProxy is null");
        if (f2o.x().s() != 1 || !f2o.x().r().isBeanConnect()) {
            j(sportRequestData);
            return;
        }
        FitnessLogUtils.i(this.f16510a, "the sport mode is :1");
        WearableDeviceModel wearableDeviceModel = this.f16512k;
        if (wearableDeviceModel != null) {
            String did = wearableDeviceModel.getDid();
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            if (!did.equals(sportDeviceModel.curDeviceDid())) {
                SportResponseExtraData appFinishMainExtraData = BeanAndWristPostureData.INSTANCE.getAppFinishMainExtraData();
                FitnessLogUtils.i(this.f16510a, "mExtraData:" + appFinishMainExtraData + ", finishSportData:" + sportRequestData.finishSportData);
                FinishSportData finishSportData = sportRequestData.finishSportData;
                if (finishSportData != null && finishSportData.getExtraData() != null && appFinishMainExtraData != null) {
                    sportRequestData.finishSportData.getExtraData().setAvgVerticalStrideRatio(appFinishMainExtraData.getAvgVerticalStrideRatio());
                    sportRequestData.finishSportData.getExtraData().setMinVerticalStrideRatio(appFinishMainExtraData.getMinVerticalStrideRatio());
                    sportRequestData.finishSportData.getExtraData().setMaxVerticalStrideRatio(appFinishMainExtraData.getMaxVerticalStrideRatio());
                    sportRequestData.finishSportData.getExtraData().setAvgVerticalAmplitude(appFinishMainExtraData.getAvgVerticalAmplitude());
                    sportRequestData.finishSportData.getExtraData().setMinVerticalAmplitude(appFinishMainExtraData.getMinVerticalAmplitude());
                    sportRequestData.finishSportData.getExtraData().setMaxVerticalAmplitude(appFinishMainExtraData.getMaxVerticalAmplitude());
                }
                j(sportRequestData);
            } else if (sportRequestData.isCommandFromDevice) {
                FinishSportData finishSportData2 = sportRequestData.finishSportData;
                finishSportData2.setExtraData(finishSportData2.getExtraData());
                j(sportRequestData);
            }
            if (sportRequestData.sportState == 4) {
                f2o.x().F(sportDeviceModel.curDeviceModel()).Y();
            }
        }
    }

    public void V(SportRequestData sportRequestData) {
        if (sportRequestData.isCommandFromDevice) {
            BeanAndWristPostureData.INSTANCE.setCommandFromDevice(true);
        }
        String str = this.f16510a;
        StringBuilder sb = new StringBuilder();
        sb.append("-----------> appFinishAccessoryData:");
        BeanAndWristPostureData beanAndWristPostureData = BeanAndWristPostureData.INSTANCE;
        sb.append(beanAndWristPostureData.getAppFinishAccessoryExtraData());
        sb.append(",appFinishMainData:");
        sb.append(beanAndWristPostureData.getAppFinishMainExtraData());
        sb.append(", deviceFinishMainExtraData:");
        sb.append(beanAndWristPostureData.getDeviceFinishMainExtraData());
        Logger.i(str, sb.toString());
        if (beanAndWristPostureData.isCommandFromDevice()) {
            if (beanAndWristPostureData.getAppFinishAccessoryExtraData() == null || beanAndWristPostureData.getDeviceFinishMainExtraData() == null) {
                return;
            }
            s(sportRequestData, beanAndWristPostureData.getDeviceFinishMainExtraData(), beanAndWristPostureData.getAppFinishAccessoryExtraData());
            h0(sportRequestData);
            w(sportRequestData);
            j(sportRequestData);
            if (sportRequestData.sportState == 4) {
                f2o.x().F(SportDeviceModel.INSTANCE.curDeviceModel()).Y();
                return;
            }
            return;
        }
        if (beanAndWristPostureData.getAppFinishAccessoryExtraData() == null || beanAndWristPostureData.getAppFinishMainExtraData() == null) {
            return;
        }
        s(sportRequestData, beanAndWristPostureData.getAppFinishMainExtraData(), beanAndWristPostureData.getAppFinishAccessoryExtraData());
        h0(sportRequestData);
        w(sportRequestData);
        j(sportRequestData);
        if (sportRequestData.sportState == 4) {
            f2o.x().F(SportDeviceModel.INSTANCE.curDeviceModel()).Y();
        }
    }

    public abstract void W();

    public void X() {
        if (E() && this.q == 1) {
            FitnessLogUtils.i(this.f16510a, "this sport that launched by device is ongoing, disconnect now,finish the gps");
            U(r(D(), 4));
            this.d.postDelayed(new rc2(this), 1000L);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void Y() {
        this.s = false;
        this.g = 0;
        this.f = 0;
        this.i = 0L;
        this.j = 0L;
        this.c = 0.0d;
        this.f16511b = 0L;
        if (this.d.hasCallbacks(this.f16513r)) {
            this.d.removeCallbacks(this.f16513r);
        }
    }

    public void Z(int i) {
        FitnessLogUtils.i(this.f16510a, "current sportState : " + B() + ",current appLaunchType : " + i);
        if ((B() == 1 || B() == 0 || B() == 4) && F(i)) {
            u = i;
        }
    }

    public void a0(zyc zycVar) {
        this.o = zycVar;
    }

    public void b0(int i) {
        FitnessLogUtils.i("sendDataToWear", "sportLaunchType:" + i);
        this.q = i;
    }

    public void c0(int i) {
    }

    @Override // defpackage.kzc
    public void d(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        f0();
    }

    public final void d0(int i) {
    }

    @Override // defpackage.kzc
    public void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        SportDeviceModel.INSTANCE.addDeviceStatusListener(this);
        this.f16512k = wearableDeviceModel;
        SportData sportDataE = f2o.x().E();
        this.n = sportDataE;
        if (sportDataE != null) {
            this.j = sportDataE.totalTime;
        }
        d0(sportRequestData.sportType);
    }

    public void e0(SportRequestData sportRequestData, int i) {
        if (this.p == null) {
            this.p = new jth();
        }
        f2o.x().h(this.p.getClass(), this.p);
        jdn.h().e(this.p.getClass(), this.p);
        this.p.f(sportRequestData, i);
    }

    public final void f0() {
        AutoState.get().finishAutoPause();
    }

    public abstract void g0();

    public void h0(SportRequestData sportRequestData) {
        int i = sportRequestData.sportState;
        if (i == 1) {
            this.h = sportRequestData.timeStamp;
            this.f = sportRequestData.sportType;
            this.g = i;
            return;
        }
        if (i == 2) {
            long j = this.h;
            if (j != 0) {
                this.i += ((long) sportRequestData.timeStamp) - j;
            }
            this.g = i;
            this.h = 0L;
            W();
            return;
        }
        if (i == 3) {
            this.h = sportRequestData.timeStamp;
            this.g = i;
        } else {
            if (i != 4) {
                return;
            }
            this.g = i;
            long j2 = this.h;
            if (j2 != 0) {
                this.i += (((long) sportRequestData.timeStamp) - j2) + this.j;
            }
            long j3 = this.i;
            if (j3 != 0) {
                this.m = j3 + this.j;
            }
        }
    }

    @Override // defpackage.zyc
    public void j(SportRequestData sportRequestData) {
        T(sportRequestData, false);
    }

    public void o() {
        FitnessLogUtils.i(this.f16510a, "abnormalChangeSportStateToFinish");
        SportRequestData.a aVar = new SportRequestData.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        T(aVar.B(jCurrentTimeMillis, timeUnit).D(FitnessDateUtils.getTZOffsetInMilli(System.currentTimeMillis()), timeUnit).x(4).o(), true);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(String str, int i, int i2) {
        FitnessLogUtils.i(this.f16510a, "onConnectFailure, did:" + str);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(String str) {
        FitnessLogUtils.d(this.f16510a, "onConnectStart , did :" + str);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(String str) {
        FitnessLogUtils.i(this.f16510a, "onConnectSuccess , did:" + str);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(String str) {
        FitnessLogUtils.i(this.f16510a, "onDisconnect , did:" + str);
        X();
    }

    public void p() {
        this.s = true;
        SportRequestData.a aVar = new SportRequestData.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        U(aVar.B(jCurrentTimeMillis, timeUnit).D(FitnessDateUtils.getTZOffsetInMilli(System.currentTimeMillis()), timeUnit).x(2).o());
    }

    public void q(boolean z, byte[] bArr) {
        if (jdn.h().c != null) {
            jdn.h().c.e();
        }
    }

    public SportRequestData r(int i, int i2) {
        return new SportRequestData.a().z(i).w(0).x(i2).C(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).E(FitnessDateUtils.getCurrentTZOffsetIn15min()).o();
    }

    public final void s(SportRequestData sportRequestData, SportResponseExtraData sportResponseExtraData, SportResponseExtraData sportResponseExtraData2) {
        sportRequestData.finishSportData.setExtraData(new SportResponseExtraData(sportResponseExtraData2.getAvgPace(), sportResponseExtraData2.getMaxPace(), sportResponseExtraData2.getAvgSpeed(), sportResponseExtraData2.getMaxSpeed(), sportResponseExtraData2.getAvgFrequency(), sportResponseExtraData2.getMaxFrequency(), sportResponseExtraData2.getAvgStried(), sportResponseExtraData2.getDegree(), sportResponseExtraData2.getMainRunStyle(), sportResponseExtraData2.getForefootRatio(), sportResponseExtraData2.getHeelRatio(), sportResponseExtraData2.getAvgImpact(), sportResponseExtraData2.getMaxImpact(), sportResponseExtraData2.getAvgOnGround(), sportResponseExtraData2.getMinOnGround(), sportResponseExtraData2.getAvgOffGround(), sportResponseExtraData2.getMaxOffGround(), sportResponseExtraData2.getAvgOnOffRatio(), sportResponseExtraData2.getMinOnOffRatio(), sportResponseExtraData.getAvgVerticalStrideRatio(), sportResponseExtraData.getMinVerticalStrideRatio(), sportResponseExtraData.getMaxVerticalStrideRatio(), sportResponseExtraData.getAvgVerticalAmplitude(), sportResponseExtraData.getMinVerticalAmplitude(), sportResponseExtraData.getMaxVerticalAmplitude()));
        BeanAndWristPostureData beanAndWristPostureData = BeanAndWristPostureData.INSTANCE;
        beanAndWristPostureData.setDeviceFinishMainExtraData(null);
        beanAndWristPostureData.setAppFinishMainExtraData(null);
        beanAndWristPostureData.setAppFinishAccessoryExtraData(null);
        beanAndWristPostureData.setCommandFromDevice(false);
    }

    public boolean t(SportRequestData sportRequestData) {
        if (SportManagerPreference.INSTANCE.getKEY_START_SPORT_MODE() == 1) {
            return false;
        }
        return v(sportRequestData);
    }

    public boolean u() {
        int i = this.g;
        return i == 1 || i == 3;
    }

    public abstract boolean v(SportRequestData sportRequestData);

    public final void w(SportRequestData sportRequestData) {
        int i = sportRequestData.sportState;
        if (i == 1) {
            v = true;
        } else if (i == 4) {
            v = false;
        }
        FitnessLogUtils.i(this.f16510a, "sport tag : " + v);
    }

    public abstract cen y();

    public long z() {
        int i = this.g;
        if (i == 0 || i == 2 || i == 4) {
            return this.i + this.j;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - this.h;
        long j = this.i;
        long j2 = this.j;
        this.m = j + seconds + j2;
        return j + seconds + j2;
    }
}
