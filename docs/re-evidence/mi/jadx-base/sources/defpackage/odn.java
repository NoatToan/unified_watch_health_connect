package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.sport_eco_manager.recorder.utils.RecorderUtils;
import com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_eco_manager.utils.UserInfo;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.utils.HrZoneLevelUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class odn implements ISportDataChangedListener, ISportStateChangedListener {
    public static volatile odn X;
    public boolean B;
    public double C;
    public double D;
    public int E;
    public int F;
    public int G;
    public float H;
    public double I;
    public long M;
    public short N;
    public long O;
    public long P;
    public SportData Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f29039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f29040b;
    public byte c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public double i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29041k;
    public int m;
    public int n;
    public double o;
    public double p;
    public double q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f29042r;
    public double s;
    public double t;
    public double u;
    public double v;
    public int w;
    public int x;
    public int y;
    public int l = Integer.MAX_VALUE;
    public int z = 1;
    public int A = 0;
    public boolean J = false;
    public List<xyc> K = new ArrayList();
    public Handler L = new Handler(Looper.getMainLooper());
    public boolean W = false;

    private byte c(int i, int i2) {
        return (byte) ((i & 15) | (i2 << 4));
    }

    private byte d() {
        int i = 0;
        if (this.J) {
            this.J = false;
            FitnessLogUtils.i("SportDataManager", "isWholeKm : " + this.J);
            i = 1;
        }
        return (byte) (((this.B ? 1 : 0) << 6) | (i << 7) | (((int) (this.C * 10.0d)) & 63));
    }

    public static odn e() {
        if (X == null) {
            synchronized (odn.class) {
                try {
                    if (X == null) {
                        X = new odn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        FitnessLogUtils.i("SportDataManager", "reset()");
        this.f29039a = (byte) 0;
        this.f29040b = (byte) 0;
        this.c = (byte) 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0.0d;
        this.j = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0.0d;
        this.p = 0.0d;
        this.q = 0.0d;
        this.f29042r = 0.0d;
        this.s = 0.0d;
        this.t = 0.0d;
        this.u = 0.0d;
        this.v = 0.0d;
        List<xyc> list = this.K;
        if (list != null) {
            list.clear();
        }
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 1;
        this.B = false;
        this.C = 0.0d;
        this.D = 0.0d;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.0f;
        this.I = 0.0d;
        this.J = false;
        this.f29041k = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        g2o.s().W(getClass(), this);
        kdn.f().o(getClass(), this);
        this.Q = null;
    }

    private void h(int i) {
        int iAbs = Math.abs(i);
        if (iAbs >= (this.f29040b & 255)) {
            this.f29040b = (byte) iAbs;
        }
        byte b2 = this.c;
        if (b2 == 0 || iAbs <= b2) {
            this.c = (byte) iAbs;
        }
        if (iAbs != 0) {
            this.d++;
        }
        int i2 = this.e + iAbs;
        this.e = i2;
        int i3 = this.d;
        if (i3 != 0) {
            this.f29039a = (byte) (i2 / i3);
        }
    }

    private void l(int i) {
        UserProfile.RecordMaxHrm recordMaxHrm = UserInfo.INSTANCE.getUserProfile().getRecordMaxHrm();
        if (recordMaxHrm != null) {
            HrZoneLevelUtil.HrZoneLevel heartRateZone = HrZoneLevelUtil.getHeartRateZone(i, recordMaxHrm.getHrm());
            if (heartRateZone == HrZoneLevelUtil.HrZoneLevel.warmUp) {
                this.V++;
            }
            if (heartRateZone == HrZoneLevelUtil.HrZoneLevel.fatBurning) {
                this.U++;
            }
            if (heartRateZone == HrZoneLevelUtil.HrZoneLevel.aerobic) {
                this.T++;
            }
            if (heartRateZone == HrZoneLevelUtil.HrZoneLevel.anaerobic) {
                this.S++;
            }
            if (heartRateZone == HrZoneLevelUtil.HrZoneLevel.extreme) {
                this.R++;
            }
        }
    }

    public void b(xyc xycVar) {
        if (xycVar != null) {
            this.K.add(xycVar);
        }
    }

    @NotNull
    public SportData f() {
        if (g2o.s() != null) {
            this.E = (int) g2o.s().K();
        }
        SportData sportData = this.Q;
        if (sportData != null) {
            int i = this.f29040b & 255;
            int i2 = sportData.maxHrRate & 255;
            if (Math.max(i, i2) == i2) {
                this.f29040b = this.Q.maxHrRate;
            }
            this.n = Math.max(this.n, this.Q.fastestSpeed);
            FitnessLogUtils.i("SportDataManager", "SportReport maxSpeed : " + this.n);
            this.l = Math.min(this.l, this.Q.fastestPace);
            this.m = Math.max(this.m, this.Q.slowestPace);
        }
        SportData.a aVarN0 = new SportData.a().o0(this.f).Y((int) (System.currentTimeMillis() / 1000)).t0(this.E).V((int) this.i).r0(this.g).R((short) this.j).Z(this.l).n0(this.m);
        int i3 = this.F;
        SportData sportData2 = this.Q;
        return aVarN0.s0(i3 + (sportData2 == null ? 0 : sportData2.totalStep)).j0(this.N).m0((float) this.o).X((float) this.p).P((float) this.t).h0((float) this.u).Q(this.f29039a).i0(this.f29040b).a0(this.n).k0(this.c).b0(this.T).c0(this.S).d0(this.U).g0(this.V).e0(this.R).M();
    }

    public void i(int i) {
        if (this.l > i && i != 0) {
            this.l = i;
        }
        if (this.m <= i) {
            this.m = i;
        }
    }

    public void j(int i) {
        if (i == 0) {
            return;
        }
        float f = 3600.0f / i;
        if (this.n <= f) {
            this.n = (int) f;
            FitnessLogUtils.i("SportDataManager", "maxSpeed : " + this.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x012e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    /* JADX WARN: Code duplicated, block: B:44:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f5 A[LOOP:1: B:55:0x01ef->B:57:0x01f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0147, please report this as an issue */
    public void k(PhoneSportData phoneSportData) {
        int iCeil;
        boolean z;
        int iCeil2;
        int i;
        int i2;
        int i3;
        long j;
        String str;
        SportData sportDataM;
        String str2;
        Iterator<xyc> it;
        boolean z2;
        String strC;
        h(this.w);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        long j2 = this.O;
        long j3 = j2 == 0 ? 1L : seconds - j2;
        this.O = seconds;
        if (j3 == 0) {
            j3 = 1;
        }
        int i4 = this.F;
        int i5 = this.G;
        if (i4 > i5) {
            iCeil = (int) ((Math.ceil(i4 - i5) * 1.0d) / j3);
            this.G = this.F;
            z = iCeil <= 16 || seconds - this.M <= j3;
            this.M = seconds;
        } else {
            iCeil = 0;
            z = true;
        }
        int i6 = this.j;
        int i7 = this.f29041k;
        if (i6 > i7) {
            iCeil2 = (int) ((Math.ceil(i6 - i7) * 1.0d) / j3);
            this.f29041k = this.j;
        } else {
            iCeil2 = 0;
        }
        double d = this.i;
        double d2 = this.D;
        if (d != d2) {
            i = (int) ((((d - d2) * 1.0d) / j3) * 10.0d);
            this.D = d;
        } else {
            i = 0;
        }
        String str3 = "SportDataManager";
        if (d > 1000.0d) {
            int i8 = this.z;
            i2 = i;
            if (d >= i8 * 1000) {
                this.z = i8 + 1;
                this.J = true;
                FitnessLogUtils.i("SportDataManager", "current distance : " + this.i + ", kmCount : " + this.z + ",timestamp:");
            }
            l(phoneSportData.heart_rate);
            i3 = 0;
            while (true) {
                j = i3;
                if (j < j3) {
                    return;
                }
                int i9 = i2;
                str = str3;
                sportDataM = new SportData.a().O(0.0f).o0(this.f).q0(this.x).S(c(iCeil, iCeil2)).f0((byte) this.w).W(d()).N((byte) i9).V((int) this.i).p0(phoneSportData.stride_frequency).T(this.j).U(this.F).l0(z).M();
                if (j == j3 - 1) {
                    if (this.P == 0) {
                        this.P = seconds;
                    }
                    if (seconds - this.P >= 15) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str2 = str;
                        FitnessLogUtils.i(str2, "currentTime : " + seconds + ",lastAddToFileTime : " + this.P + ", Thread:" + Thread.currentThread().getName() + " , this : " + this);
                        SportData sportDataF = f();
                        sportDataF.cal = (short) this.j;
                        sportDataF.sportType = g2o.s().L();
                        sportDataF.appLaunchType = g2o.s().n();
                        sportDataF.maxHrRate = this.f29040b;
                        sportDataF.kmCount = this.z;
                        sportDataF.cacheTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                        strC = h4b.c(sportDataF);
                        FitnessLogUtils.i(str2, "save RecoverSport : " + strC);
                        if (RecorderUtils.INSTANCE.isSupportRecover(this.h)) {
                            SportManagerPreference.INSTANCE.setKEY_RECOVER_SPORT_REPORT(strC);
                        }
                        this.P = seconds;
                    } else {
                        str2 = str;
                    }
                    sportDataM.addToFile = z2;
                } else {
                    str2 = str;
                    j3 = j3;
                }
                it = this.K.iterator();
                while (it.hasNext()) {
                    it.next().onSportRecordData(sportDataM);
                }
                i3++;
                str3 = str2;
                j3 = j3;
                i2 = i9;
            }
        } else {
            i2 = i;
        }
        l(phoneSportData.heart_rate);
        i3 = 0;
        while (true) {
            j = i3;
            if (j < j3) {
                return;
            }
            int i10 = i2;
            str = str3;
            sportDataM = new SportData.a().O(0.0f).o0(this.f).q0(this.x).S(c(iCeil, iCeil2)).f0((byte) this.w).W(d()).N((byte) i10).V((int) this.i).p0(phoneSportData.stride_frequency).T(this.j).U(this.F).l0(z).M();
            if (j == j3 - 1) {
                if (this.P == 0) {
                    this.P = seconds;
                }
                if (seconds - this.P >= 15) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str2 = str;
                    FitnessLogUtils.i(str2, "currentTime : " + seconds + ",lastAddToFileTime : " + this.P + ", Thread:" + Thread.currentThread().getName() + " , this : " + this);
                    SportData sportDataF2 = f();
                    sportDataF2.cal = (short) this.j;
                    sportDataF2.sportType = g2o.s().L();
                    sportDataF2.appLaunchType = g2o.s().n();
                    sportDataF2.maxHrRate = this.f29040b;
                    sportDataF2.kmCount = this.z;
                    sportDataF2.cacheTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    strC = h4b.c(sportDataF2);
                    FitnessLogUtils.i(str2, "save RecoverSport : " + strC);
                    if (RecorderUtils.INSTANCE.isSupportRecover(this.h)) {
                        SportManagerPreference.INSTANCE.setKEY_RECOVER_SPORT_REPORT(strC);
                    }
                    this.P = seconds;
                } else {
                    str2 = str;
                }
                sportDataM.addToFile = z2;
            } else {
                str2 = str;
                j3 = j3;
            }
            it = this.K.iterator();
            while (it.hasNext()) {
                it.next().onSportRecordData(sportDataM);
            }
            i3++;
            str3 = str2;
            j3 = j3;
            i2 = i10;
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportDataManager", "onPhoneDataChanged:" + phoneSportData);
        if (this.Q == null) {
            SportData sportDataZ = g2o.s().z();
            this.Q = sportDataZ;
            if (sportDataZ != null) {
                this.z = sportDataZ.kmCount;
            }
        }
        this.i = phoneSportData.distance;
        float f = this.H;
        if (f == 0.0f || f < phoneSportData.stepRate) {
            this.H = phoneSportData.stepRate;
        }
        short s = this.N;
        if (s == 0 || s < phoneSportData.stride_frequency) {
            this.N = (short) phoneSportData.stride_frequency;
        }
        i(phoneSportData.pace);
        j(phoneSportData.pace);
        this.w = phoneSportData.heart_rate;
        this.j = ((int) phoneSportData.calorie) / 1000;
        this.F = phoneSportData.step;
        k(phoneSportData);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(y7r y7rVar) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
        FitnessLogUtils.i("SportDataManager", "onSportFinished,isFinish:" + this.W);
        if (this.W) {
            return;
        }
        this.W = true;
        this.O = 0L;
        this.M = 0L;
        SportData sportDataF = f();
        Iterator<xyc> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().onSportReportData(z, sportDataF);
        }
        this.L.postDelayed(new Runnable() { // from class: mdn
            @Override // java.lang.Runnable
            public final void run() {
                this.f26043a.g();
            }
        }, 1000L);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.y = (int) (System.currentTimeMillis() / 1000);
        this.O = 0L;
        this.M = 0L;
        Iterator<xyc> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().onSportPaused(this.y);
        }
        FitnessLogUtils.i("SportDataManager", "onSportPaused");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.x = iCurrentTimeMillis;
        this.O = iCurrentTimeMillis;
        this.M = iCurrentTimeMillis;
        Iterator<xyc> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().onSportRestart(this.x);
        }
        FitnessLogUtils.i("SportDataManager", "onSportRestarted");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.O = seconds;
        this.M = seconds;
        Iterator<xyc> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().onSportStart();
        }
        this.W = false;
        FitnessLogUtils.i("SportDataManager", "onSportStarted");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }
}
