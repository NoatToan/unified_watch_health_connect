package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.receiver.FreeTrainingDataProcesser;
import com.xiaomi.fitness.sport_eco_manager.receiver.data.IDataProcesser;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_eco_manager.utils.UserInfo;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class um5 implements ISportStateChangedListener, brc, IDataProcesser {
    public float A;
    public float B;
    public String C;
    public int D;
    public FreeTrainingDataProcesser E;
    public long G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public drc f35924a;
    public long c;
    public long d;
    public long e;
    public int f;
    public long i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y7r f35926k;
    public long n;
    public double o;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35927r;
    public int s;
    public int t;
    public float u;
    public int v;
    public int w;
    public int z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35925b = 15;
    public int g = 0;
    public long h = 0;
    public String j = "DataProcesser";
    public PhoneSportData l = new PhoneSportData();
    public PhoneSportData m = new PhoneSportData();
    public int p = 4;
    public Handler y = new Handler(Looper.getMainLooper());
    public long F = 0;
    public dln x = new dln();

    public um5(kdn kdnVar) {
        this.f35924a = kdnVar;
        g2o.s().e(this.x.getClass(), this.x);
    }

    private void c(UserProfile userProfile) {
        if (userProfile == null) {
            this.z = 25;
            this.A = 170.0f;
            this.B = 60.0f;
            this.C = "male";
            return;
        }
        this.z = userProfile.getAge();
        this.A = userProfile.getHeight();
        this.B = userProfile.getWeight();
        this.C = userProfile.getSex();
        if (this.z == 0) {
            this.z = 25;
        }
        if (Math.abs(this.B) < 1.0f) {
            this.B = 60.0f;
        }
        if (Math.abs(this.A) < 1.0f) {
            this.A = 170.0f;
        }
        if (TextUtils.isEmpty(this.C)) {
            this.C = "male";
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    private void d() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        int i = this.f;
        boolean z = i == 3;
        boolean z2 = i == 1 || i == 2 || z;
        FitnessLogUtils.i(this.j, "computeDistanceUseSteps , isUseSteps:" + z2);
        if (z2) {
            if (!z && seconds - this.i > 5 && seconds - this.h <= 5 && seconds - this.e >= 1) {
                calculateInfoWithSportData(true);
                this.e = seconds;
                sendPhoneSportData();
            }
            if (this.d != 0) {
                long j = this.e;
                if (j == 0 && seconds - j >= 1) {
                    this.d = seconds;
                    this.e = seconds;
                    calculateInfoWithSportData(true);
                    sendPhoneSportData();
                }
            } else {
                this.d = seconds;
                this.e = seconds;
                calculateInfoWithSportData(true);
                sendPhoneSportData();
            }
            FitnessLogUtils.i(this.j, "isRunIndoor :" + z + ", time:" + (seconds - this.d) + ", time2:" + (seconds - this.e));
            if ((z || seconds - this.d > 5) && seconds - this.e >= 1) {
                FitnessLogUtils.i(this.j, "computeDistanceUseSteps: mLastLocationTime = " + this.d + ", mUseStepDisTime = " + this.e);
                this.e = seconds;
                calculateInfoWithSportData(true);
                sendPhoneSportData();
            }
        }
    }

    private void h() {
        if (g2o.s().n() == 1) {
            kdn.f().e().j(this.f);
        }
    }

    private boolean k() {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        EcoDeviceModel ecoDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        return ecoDeviceModelCurDeviceModel != null && sportDeviceModel.isDeviceConnected(ecoDeviceModelCurDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public void l() {
        this.o = 0.0d;
        this.q = 0.0f;
        this.f35927r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = 0;
        this.w = 0;
        this.d = 0L;
        this.n = 0L;
        this.f = 0;
        this.m.clear();
        this.l.clear();
        this.f35926k = null;
    }

    public final PhoneSportData b(PhoneSportData phoneSportData) {
        float f = this.x.f(phoneSportData.heart_rate, 0.0f);
        if (f >= 0.0f) {
            this.q += f;
        }
        PhoneSportData phoneSportData2 = this.m;
        phoneSportData2.calorie = this.q;
        return phoneSportData2;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.receiver.data.IDataProcesser
    public void calculateInfoWithSportData(boolean z) {
        int iN = g2o.s().n();
        g2o.s().L();
        if (iN == 0) {
            return;
        }
        j(this.l, z);
        if (iN != 2 || g2o.s().L() == 8) {
            if (k() && (iN == 1 || g2o.s().L() == 8)) {
                b(this.l);
            }
            if (!k()) {
                i(this.m);
            }
        } else {
            i(this.m);
        }
        f(this.f35926k);
    }

    public final PhoneSportData e(SportSensorResult sportSensorResult) {
        int i;
        if ((g2o.s().z() != null && g2o.s().P()) || ((i = sportSensorResult.f13154a) != 0 && i > this.l.step && g2o.s().n() == 2)) {
            this.l.step = sportSensorResult.f13154a;
        }
        PhoneSportData phoneSportData = this.l;
        phoneSportData.accX = sportSensorResult.f13155b;
        phoneSportData.accY = sportSensorResult.c;
        phoneSportData.accZ = sportSensorResult.d;
        return phoneSportData;
    }

    public final void f(y7r y7rVar) {
        int i;
        if (y7rVar == null) {
            return;
        }
        PhoneSportData phoneSportData = this.m;
        if (phoneSportData != null && (i = y7rVar.f39906a) != 0) {
            phoneSportData.calorie = i;
        }
        phoneSportData.heart_rate = y7rVar.c;
    }

    public final PhoneSportData g(y7r y7rVar) {
        int i = y7rVar.f39906a;
        if (i != 0) {
            float f = i;
            PhoneSportData phoneSportData = this.l;
            if (f > phoneSportData.calorie) {
                phoneSportData.calorie = i;
            }
        }
        int i2 = y7rVar.f39907b;
        if (i2 != 0) {
            PhoneSportData phoneSportData2 = this.l;
            if (i2 > phoneSportData2.step) {
                phoneSportData2.step = i2;
            }
        }
        int i3 = y7rVar.f;
        if (i3 != 0) {
            PhoneSportData phoneSportData3 = this.l;
            if (i3 > phoneSportData3.distance) {
                phoneSportData3.distance = i3;
            }
        }
        PhoneSportData phoneSportData4 = this.l;
        int i4 = y7rVar.c;
        phoneSportData4.heart_rate = i4;
        phoneSportData4.maxHr = y7rVar.d;
        phoneSportData4.minHr = y7rVar.e;
        this.m.heart_rate = i4;
        return phoneSportData4;
    }

    public final PhoneSportData i(PhoneSportData phoneSportData) {
        long j;
        g2o.s().i();
        if (!g2o.s().i()) {
            return null;
        }
        long j2 = 1;
        if (this.n != 0) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j3 = this.G;
            if (j3 == 0) {
                j = seconds - this.n;
            } else {
                j = j3 - this.n;
                this.G = 0L;
            }
            if (j > 0) {
                j2 = j;
            }
        }
        float f = phoneSportData.pace / 1000.0f;
        double dG = this.x.g(this.B, this.A, this.z, f != 0.0f ? 1.0f / f : 0.0d, this.C, g2o.s().L()) * 1000.0d * j2;
        this.n = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        float f2 = (float) (((double) this.q) + dG);
        this.q = f2;
        phoneSportData.calorie = f2;
        return phoneSportData;
    }

    public final PhoneSportData j(PhoneSportData phoneSportData, boolean z) {
        int i;
        int i2;
        int i3;
        if (!g2o.s().i()) {
            return null;
        }
        int iE = (int) g2o.s().E();
        if (phoneSportData == null) {
            return this.m;
        }
        if (iE == 0) {
            FitnessLogUtils.w(this.j, "genDistanceWithStep: duration = 0");
            return phoneSportData;
        }
        PhoneSportData phoneSportData2 = this.m;
        phoneSportData2.duration = iE;
        if (!z && (i3 = this.f35927r) >= phoneSportData.step) {
            phoneSportData2.step = i3;
            FitnessLogUtils.w(this.j, "genDistanceWithStep: totalStep = " + this.f35927r + ", receiverData.step = " + phoneSportData.step);
            return this.m;
        }
        this.f35927r = phoneSportData.step;
        this.t = phoneSportData.heart_rate;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if (this.c == 0) {
            this.c = seconds - 5;
        }
        this.p = this.x.j(iE, (float) phoneSportData.accX, (float) phoneSportData.accY, (float) phoneSportData.accZ);
        if (seconds - this.c >= 1) {
            float fC = this.x.c(this.f35927r);
            if (fC > 0.0f) {
                this.u = fC;
            }
        }
        Location locationB = this.x.b(this.f35927r);
        if (locationB != null) {
            double d = locationB.total_distance;
            double d2 = this.o;
            if (d <= d2) {
                d = d2;
            }
            this.o = d;
            i = locationB.pace;
        } else {
            i = 0;
        }
        FitnessLogUtils.i(this.j, "genDistanceWithStep mDistance = " + this.o);
        double d3 = (double) this.s;
        double d4 = this.o;
        if (d3 < d4) {
            this.s = (int) d4;
        }
        if (iE != 0 && (i2 = this.s) != 0) {
            int iE2 = this.x.e(iE, i2);
            int iK = this.x.k(this.s, this.f35927r);
            if (seconds - this.c >= 5) {
                this.w = iE2;
                this.v = iK;
                this.c = (int) seconds;
            }
        }
        this.m.setStepRate(this.u / 60.0f);
        PhoneSportData phoneSportData3 = this.m;
        phoneSportData3.stride_frequency = (int) this.u;
        phoneSportData3.stride = this.v;
        phoneSportData3.step = this.f35927r;
        if (z) {
            phoneSportData3.pace = i;
            phoneSportData3.avePace = this.w;
            phoneSportData3.distance = this.s;
        }
        return phoneSportData3;
    }

    @Override // defpackage.brc
    public void onReceivePhoneSensorData(@NotNull SportSensorResult sportSensorResult) {
        this.x.a(sportSensorResult.f13155b, sportSensorResult.c, sportSensorResult.d);
        FitnessLogUtils.i(this.j, "onReceivePhoneSensorData:" + sportSensorResult + ",appLaunchType:" + g2o.s().n());
        if (g2o.s().n() == 6) {
            return;
        }
        e(sportSensorResult);
        h();
        d();
    }

    @Override // defpackage.brc
    @SuppressLint({"WrongConstant"})
    public void onReceiveWearData(y7r y7rVar) {
        FitnessLogUtils.i(this.j, "onReceiveWearData:" + y7rVar);
        if (k()) {
            FitnessLogUtils.i(this.j, "deviceConnected ：true , onReceiveWearData:" + y7rVar);
            this.f35926k = y7rVar;
            g(y7rVar);
            this.f35924a.a(y7rVar);
            d();
            FreeTrainingDataProcesser freeTrainingDataProcesser = this.E;
            if (freeTrainingDataProcesser != null) {
                freeTrainingDataProcesser.onReceiveWearData(this.f35926k);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
        this.D = 4;
        this.F = 0L;
        if (this.E != null) {
            FitnessLogUtils.i(this.j, "freeTrainingDataProcesser  is null");
            this.E.onSportFinished(z, bArr);
        }
        this.y.postDelayed(new Runnable() { // from class: sm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f33777a.l();
            }
        }, VibrateModeProgressBar.sLongToLong);
        kdn.f().m();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.D = 2;
        FreeTrainingDataProcesser freeTrainingDataProcesser = this.E;
        if (freeTrainingDataProcesser != null) {
            freeTrainingDataProcesser.onSportPaused();
        }
        this.G = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.D = 3;
        FreeTrainingDataProcesser freeTrainingDataProcesser = this.E;
        if (freeTrainingDataProcesser != null) {
            freeTrainingDataProcesser.onSportRestarted();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4) {
        this.D = 1;
        this.g = i;
        this.f = i3;
        if (g2o.s().z() != null) {
            this.h = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        } else {
            this.h = i;
        }
        c(UserInfo.INSTANCE.getUserProfile());
        if (i3 == 8) {
            FreeTrainingDataProcesser freeTrainingDataProcesser = new FreeTrainingDataProcesser(this);
            this.E = freeTrainingDataProcesser;
            freeTrainingDataProcesser.onSportStarted(i, i2, i3, i4);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.receiver.data.IDataProcesser
    public void sendPhoneSportData() {
        this.m.timeDuration = g2o.s().E();
        this.f35924a.b(this.m);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.receiver.data.IDataProcesser
    public void setCal(float f) {
        this.m.calorie = f;
    }
}
