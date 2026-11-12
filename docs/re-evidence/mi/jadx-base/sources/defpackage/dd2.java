package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.state.AutoState;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dd2 implements lzc, azc, OnEcoDeviceStatusListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static long f15381r = 0;
    public static int s = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15383b;
    public double c;
    public Handler d;
    public long h;
    public long i;
    public EcoDeviceModel j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15384k;
    public long l;
    public SportData m;
    public azc n;
    public den o;
    public int p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15382a = "BaseSportState";
    public ExecutorService e = Executors.newSingleThreadExecutor();
    public int f = 0;
    public int g = 0;
    public Runnable q = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!dd2.this.B()) {
                FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
                FitnessLogUtils.i(dd2.this.f15382a, "has no ongoing sport--connect");
                return;
            }
            EcoDeviceModel deviceModelByDid = SportDeviceModel.INSTANCE.getDeviceModelByDid(dd2.this.f15384k);
            if (deviceModelByDid == null || !deviceModelByDid.getIsDeviceConnected()) {
                FitnessLogUtils fitnessLogUtils2 = FitnessLogUtils.INSTANCE;
                FitnessLogUtils.i(dd2.this.f15382a, "disconnected, and finish sport validSport = true");
                dd2.this.T();
                if (dd2.this.y() == 4 && dd2.this.y() == 0) {
                    return;
                }
                dd2.this.M(true, null, true);
            }
        }
    }

    public dd2(EcoDeviceModel ecoDeviceModel) {
        this.j = ecoDeviceModel;
        if (ecoDeviceModel != null) {
            this.f15384k = ecoDeviceModel.getDeviceInfo().getDid();
        }
        this.d = new Handler(Looper.getMainLooper());
    }

    private boolean C(int i) {
        int i2 = s;
        if ((i2 != 6 && i2 != 7) || i == 7 || i == 6) {
            return true;
        }
        return (i2 == 6 || i2 == 7) && i == 0;
    }

    private boolean E() {
        return (this.p != 1 || g2o.s().n() == 6) && g2o.s().n() != 7;
    }

    public static /* synthetic */ void F() {
        Iterator<ISportStateChangedListener> it = g2o.s().I().values().iterator();
        while (it.hasNext()) {
            try {
                it.next().onSportShutdown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I() {
        Iterator<ISportStateChangedListener> it = g2o.s().I().values().iterator();
        while (it.hasNext()) {
            try {
                it.next().onSportPaused();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void J() {
        Iterator<ISportStateChangedListener> it = g2o.s().I().values().iterator();
        while (it.hasNext()) {
            try {
                it.next().onSportRested();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K() {
        Iterator<ISportStateChangedListener> it = g2o.s().I().values().iterator();
        while (it.hasNext()) {
            it.next().onSportRestarted();
        }
    }

    private void X(int i) {
    }

    private void Z() {
        AutoState.get().finishAutoPause();
    }

    public static int u() {
        return s;
    }

    public int A() {
        return this.f;
    }

    public boolean B() {
        int i;
        return (this.f == 0 || (i = this.g) == 0 || i == 4) ? false : true;
    }

    public boolean D(int i) {
        return i == 1 || i == 2 || i == 3 || i == 6 || i == 7;
    }

    public final /* synthetic */ void G(boolean z, byte[] bArr) {
        ISportStateChangedListener iSportStateChangedListener = g2o.s().I().get(com.xiaomi.fitness.sport_eco_manager.remind.a.class);
        FitnessLogUtils.i(this.f15382a, "SportRemindListener : " + iSportStateChangedListener);
        if (iSportStateChangedListener != null) {
            iSportStateChangedListener.onSportFinished(z, bArr);
        }
        for (ISportStateChangedListener iSportStateChangedListener2 : g2o.s().I().values()) {
            if (iSportStateChangedListener2 != null && !(iSportStateChangedListener2 instanceof com.xiaomi.fitness.sport_eco_manager.remind.a)) {
                iSportStateChangedListener2.onSportFinished(z, bArr);
            }
        }
        p(z, bArr);
    }

    public final /* synthetic */ void H() {
        U(2);
        g2o.s().T();
    }

    public void L() {
        this.d.post(new Runnable() { // from class: tc2
            @Override // java.lang.Runnable
            public final void run() {
                dd2.F();
            }
        });
    }

    public void M(final boolean z, final byte[] bArr, boolean z2) {
        FitnessLogUtils.i(this.f15382a, "sport finished, validSport = " + z);
        if (z2) {
            SportDeviceModel.INSTANCE.removeDeviceStatusListener(this);
        }
        this.d.post(new Runnable() { // from class: vc2
            @Override // java.lang.Runnable
            public final void run() {
                this.f36731a.G(z, bArr);
            }
        });
        this.d.postDelayed(new Runnable() { // from class: xc2
            @Override // java.lang.Runnable
            public final void run() {
                this.f38961a.H();
            }
        }, 1000L);
        this.n = null;
    }

    public void N() {
        this.d.post(new Runnable() { // from class: bd2
            @Override // java.lang.Runnable
            public final void run() {
                dd2.I();
            }
        });
    }

    public void O() {
        this.d.post(new Runnable() { // from class: cd2
            @Override // java.lang.Runnable
            public final void run() {
                dd2.J();
            }
        });
    }

    public void P(SportRequestData sportRequestData, int i) {
        int i2 = sportRequestData.sportType;
        g2o.s().r();
        this.d.post(new Runnable() { // from class: ad2
            @Override // java.lang.Runnable
            public final void run() {
                dd2.K();
            }
        });
    }

    public void Q(SportRequestData sportRequestData, int i) {
        FitnessLogUtils.i(this.f15382a, "notifyListenerSportStart , requestData :" + sportRequestData + ", sportLaunchType:" + i);
        W(i);
        SportData sportData = this.m;
        if (sportData != null) {
            sportRequestData.timeStamp = sportData.startTime;
            sportRequestData.timeZone = sportData.timezone;
        }
        kdn.f().n(i, sportRequestData.sportType);
        Y(sportRequestData.timeStamp, sportRequestData.sportType, i);
        for (ISportStateChangedListener iSportStateChangedListener : g2o.s().I().values()) {
            if (!(iSportStateChangedListener instanceof com.xiaomi.fitness.sport_eco_manager.remind.a)) {
                iSportStateChangedListener.onSportStarted(sportRequestData.timeStamp, sportRequestData.timeZone, sportRequestData.sportType, i);
            } else if (!sportRequestData.disableAudioBroadcast && E()) {
                iSportStateChangedListener.onSportStarted(sportRequestData.timeStamp, sportRequestData.timeZone, sportRequestData.sportType, i);
            }
        }
    }

    public void R(SportRequestData sportRequestData) {
        FitnessLogUtils.i(this.f15382a, "onSportStateChanged sportType : " + g2o.s().L() + " getSportState : " + y());
        if (sportRequestData.sportState != y() || g2o.s().L() == 14) {
            b0(sportRequestData);
            FitnessLogUtils.i(this.f15382a, "iSportNotifyListener : " + this.n + " , SportRequestData : " + sportRequestData);
            if (this.n == null) {
                FitnessLogUtils.i(this.f15382a, "sportStateNotifyProxy is null");
                a(sportRequestData);
            } else {
                FitnessLogUtils.i(this.f15382a, "sportStateNotifyProxy is not null");
                this.n.a(sportRequestData);
            }
        }
    }

    public abstract void S();

    @SuppressLint({"WrongConstant"})
    public void T() {
        this.g = 0;
        this.f = 0;
        f15381r = 0L;
        this.i = 0L;
        this.c = 0.0d;
        this.f15383b = 0L;
        if (this.d.hasCallbacks(this.q)) {
            this.d.removeCallbacks(this.q);
        }
    }

    public void U(int i) {
        FitnessLogUtils.i(this.f15382a, "current sportState : " + y() + ",current appLaunchType : " + i);
        if ((y() == 1 || y() == 0 || y() == 4) && C(i)) {
            s = i;
        }
    }

    public void V(azc azcVar) {
        this.n = azcVar;
    }

    public void W(int i) {
        this.p = i;
    }

    public void Y(int i, int i2, int i3) {
        if (this.o == null) {
            this.o = new kth();
        }
        g2o.s().e(this.o.getClass(), this.o);
        kdn.f().d(this.o.getClass(), this.o);
        this.o.f(i, i2, i3);
    }

    @Override // defpackage.azc
    public void a(SportRequestData sportRequestData) {
        boolean zT;
        FitnessLogUtils.i(this.f15382a, "notifySportRequest " + sportRequestData);
        int i = sportRequestData.sportState;
        if (i == 1) {
            Q(sportRequestData, sportRequestData.sportLaunchType);
            return;
        }
        if (i == 2) {
            N();
            return;
        }
        if (i == 3) {
            P(sportRequestData, sportRequestData.sportLaunchType);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            O();
        } else {
            if (sportRequestData.sportType == 8) {
                zT = w() >= 60;
            } else {
                zT = t(sportRequestData);
            }
            M(zT, sportRequestData.ids, true);
            this.d.postDelayed(new zc2(this), 1000L);
        }
    }

    public abstract void a0();

    public void b0(SportRequestData sportRequestData) {
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
                f15381r += ((long) sportRequestData.timeStamp) - j;
            }
            this.g = i;
            this.h = 0L;
            S();
            return;
        }
        if (i == 3) {
            this.h = sportRequestData.timeStamp;
            this.g = i;
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            this.g = i;
            return;
        }
        this.g = i;
        long j2 = this.h;
        if (j2 != 0) {
            f15381r += (((long) sportRequestData.timeStamp) - j2) + this.i;
        }
        long j3 = f15381r;
        if (j3 != 0) {
            this.l = j3 + this.i;
        }
    }

    @Override // defpackage.lzc
    public void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        SportDeviceModel.INSTANCE.addDeviceStatusListener(this);
        this.j = ecoDeviceModel;
        SportData sportDataZ = g2o.s().z();
        this.m = sportDataZ;
        if (sportDataZ != null) {
            this.i = sportDataZ.totalTime;
        }
        X(sportRequestData.sportType);
    }

    @Override // defpackage.lzc
    public void h(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        Z();
    }

    public void o() {
        FitnessLogUtils.i(this.f15382a, "abnormalChangeSportStateToFinish");
        SportRequestData.a aVar = new SportRequestData.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a(aVar.u(jCurrentTimeMillis, timeUnit).w(FitnessDateUtils.getTZOffsetInMilli(System.currentTimeMillis()), timeUnit).p(4).j());
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(String str, String str2, int i, int i2) {
        FitnessLogUtils.i(this.f15382a, "onConnectFailure, did:" + str);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(String str, String str2) {
        FitnessLogUtils.d(this.f15382a, "onConnectStart , did :" + str);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(String str, String str2) {
        FitnessLogUtils.i(this.f15382a, "onConnectSuccess , did:" + str);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(String str, String str2) {
        FitnessLogUtils.i(this.f15382a, "onDisconnect , did:" + str);
        if (B() && this.p == 1) {
            FitnessLogUtils.i(this.f15382a, "this sport that launched by device is ongoing, disconnect now,finish the gps");
            M(false, null, false);
            this.d.postDelayed(new zc2(this), 1000L);
        }
    }

    public void p(boolean z, byte[] bArr) {
        if (kdn.f().c != null) {
            kdn.f().c.d();
        }
    }

    public SportRequestData q(int i, int i2) {
        return new SportRequestData.a().s(i).o(0).p(i2).v(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).x(FitnessDateUtils.getCurrentTZOffsetIn15min()).j();
    }

    public boolean r() {
        int i = this.g;
        return i == 1 || i == 3;
    }

    public boolean s() {
        int i = this.g;
        return i == 1 || i == 3 || i == 2 || i == 5;
    }

    public abstract boolean t(SportRequestData sportRequestData);

    public abstract den v();

    public long w() {
        int i = this.g;
        if (i == 0 || i == 2 || i == 4) {
            return f15381r + this.i;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - this.h;
        long j = f15381r;
        long j2 = this.i;
        this.l = j + seconds + j2;
        return j + seconds + j2;
    }

    public int x() {
        return this.p;
    }

    public int y() {
        return this.g;
    }

    public long z() {
        return this.l;
    }
}
