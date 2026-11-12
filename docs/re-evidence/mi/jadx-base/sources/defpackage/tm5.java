package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.receiver.FreeTrainingDataProcesser;
import com.xiaomi.fitness.sport_manager.receiver.data.IDataProcesser;
import com.xiaomi.fitness.sport_manager.receiver.data.IncreaseCal;
import com.xiaomi.fitness.sport_manager.receiver.data.IncreaseDistance;
import com.xiaomi.fitness.sport_manager.receiver.product.BeanDataProcesser;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import com.xiaomi.fitness.sport_manager.utils.UserInfo;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class tm5 implements ISportStateChangedListener, arc, IDataProcesser {
    public float A;
    public float B;
    public String C;
    public int D;
    public FreeTrainingDataProcesser E;
    public BeanDataProcesser F;
    public IncreaseDistance G;
    public IncreaseCal H;
    public long I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public crc f34845a;
    public long c;
    public long d;
    public long e;
    public int f;
    public long i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x7r f34847k;
    public long n;
    public double o;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34848r;
    public int s;
    public int t;
    public float u;
    public int v;
    public int w;
    public int z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34846b = 15;
    public int g = 0;
    public long h = 0;
    public String j = "DataProcesser";
    public PhoneSportData l = new PhoneSportData();
    public PhoneSportData m = new PhoneSportData();
    public int p = 4;
    public Handler y = new Handler(Looper.getMainLooper());
    public cln x = new cln();

    public tm5(jdn jdnVar) {
        this.f34845a = jdnVar;
        f2o.x().h(this.x.getClass(), this.x);
    }

    private boolean o() {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        return wearableDeviceModelCurDeviceModel != null && sportDeviceModel.isDeviceConnected(wearableDeviceModelCurDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public void r() {
        this.o = 0.0d;
        this.q = 0.0f;
        this.f34848r = 0;
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
        this.f34847k = null;
    }

    public final PhoneSportData b(PhoneSportData phoneSportData) {
        float fG = this.x.g(phoneSportData.heart_rate, 0.0f);
        if (fG >= 0.0f) {
            this.q += fG;
        }
        FitnessLogUtils.d(this.j, "calculateCalorieWithHr,cal:" + fG + ",totalCal:" + this.q);
        PhoneSportData phoneSportData2 = this.m;
        phoneSportData2.calorie = this.q;
        return phoneSportData2;
    }

    public final PhoneSportData c(SportLocationResult sportLocationResult) {
        FitnessLogUtils.i(this.j, "SportLocationResult:" + sportLocationResult.toString());
        this.m.location = sportLocationResult.getLocation();
        Location locationD = this.x.d(sportLocationResult.getLocation());
        this.x.n(sportLocationResult.getLocation());
        if (locationD == null) {
            return null;
        }
        double increaseDis = this.o + this.G.getIncreaseDis(locationD.total_distance, -1);
        this.o = increaseDis;
        this.s = (int) increaseDis;
        FitnessLogUtils.d(this.j, "mDistance :" + this.o);
        long timeStamp = sportLocationResult.getTimeStamp();
        PhoneSportData phoneSportData = this.m;
        phoneSportData.timestamp = (int) timeStamp;
        phoneSportData.distance = this.s;
        int i = locationD.pace;
        phoneSportData.pace = i;
        phoneSportData.speed = i == 0 ? 0.0f : 3600.0f / i;
        phoneSportData.gpsAccuracyStatus = sportLocationResult.getGpsAccuracyStatus();
        this.m.avePace = this.x.f((int) f2o.x().J(), this.s);
        FitnessLogUtils.i(this.j, "calculateDataWithLocation : " + this.m.toString());
        FitnessLogUtils.i(this.j + "pace", "pace:" + this.m.pace + ", stride_frequency:" + this.m.stride_frequency);
        return this.m;
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.data.IDataProcesser
    public void calculateInfoWithSportData(boolean z) {
        int iT = f2o.x().t();
        int iT2 = f2o.x().T();
        if (iT == 0) {
            return;
        }
        m(this.l, z);
        if (iT == 2 && f2o.x().T() != 8) {
            l(this.m);
        } else if (o()) {
            if (rmc.y || f2o.x().T() == 8) {
                b(this.l);
            }
        } else if (n() && iT2 == 6) {
            e(this.m);
        } else {
            l(this.m);
        }
        h(this.f34847k);
    }

    public final void d(UserProfile userProfile) {
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

    public final void e(PhoneSportData phoneSportData) {
        l(phoneSportData);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    public final void f() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        int i = this.f;
        boolean z = i == 3;
        boolean z2 = i == 1 || i == 2 || z;
        FitnessLogUtils.d(this.j, "computeDistanceUseSteps , isUseSteps:" + z2);
        if (z2) {
            if (!z && seconds - this.i > 5 && seconds - this.h <= 5 && seconds - this.e >= 1) {
                calculateInfoWithSportData(true);
                this.m.gpsAccuracyStatus = 0;
                this.e = seconds;
            }
            if (this.d != 0) {
                long j = this.e;
                if (j == 0 && seconds - j >= 1) {
                    this.d = seconds;
                    this.e = seconds;
                    calculateInfoWithSportData(true);
                    this.m.gpsAccuracyStatus = 0;
                }
            } else {
                this.d = seconds;
                this.e = seconds;
                calculateInfoWithSportData(true);
                this.m.gpsAccuracyStatus = 0;
            }
            FitnessLogUtils.d(this.j, "isRunIndoor :" + z + ", time:" + (seconds - this.d) + ", time2:" + (seconds - this.e));
            if ((z || seconds - this.d > 5) && seconds - this.e >= 1) {
                FitnessLogUtils.d(this.j, "computeDistanceUseSteps: mLastLocationTime = " + this.d + ", mUseStepDisTime = " + this.e);
                this.e = seconds;
                calculateInfoWithSportData(true);
                this.m.gpsAccuracyStatus = 0;
            }
            long j2 = this.d;
            if (j2 != 0 && seconds - j2 < 5) {
                Math.abs(seconds - j2);
            }
            sendPhoneSportData();
        }
    }

    public final PhoneSportData g(SportSensorResult sportSensorResult) {
        if ((f2o.x().E() != null && f2o.x().Y()) || (SportDeviceModel.INSTANCE.noDevice() && f2o.x().K() == 0)) {
            this.l.step = sportSensorResult.f13200a;
        }
        PhoneSportData phoneSportData = this.l;
        phoneSportData.accX = sportSensorResult.f13201b;
        phoneSportData.accY = sportSensorResult.c;
        phoneSportData.accZ = sportSensorResult.d;
        return phoneSportData;
    }

    public final void h(x7r x7rVar) {
        PhoneSportData phoneSportData;
        if (x7rVar == null || (phoneSportData = this.m) == null) {
            return;
        }
        int i = x7rVar.f38797a;
        if (i > phoneSportData.calorie) {
            float increaseCal = (float) (((double) this.q) + this.H.getIncreaseCal(-1.0d, i));
            this.q = increaseCal;
            this.m.calorie = increaseCal;
        }
        this.m.heart_rate = x7rVar.c;
    }

    public final PhoneSportData i(x7r x7rVar) {
        int i = x7rVar.f38797a;
        if (i != 0) {
            float f = i;
            PhoneSportData phoneSportData = this.l;
            if (f > phoneSportData.calorie) {
                phoneSportData.calorie = i;
            }
        }
        int i2 = x7rVar.f38798b;
        if (i2 != 0) {
            PhoneSportData phoneSportData2 = this.l;
            if (i2 > phoneSportData2.step) {
                phoneSportData2.step = i2;
            }
        }
        int i3 = x7rVar.f;
        if (i3 != 0) {
            PhoneSportData phoneSportData3 = this.l;
            if (i3 > phoneSportData3.distance) {
                phoneSportData3.distance = i3;
            }
        }
        PhoneSportData phoneSportData4 = this.l;
        int i4 = x7rVar.c;
        phoneSportData4.heart_rate = i4;
        phoneSportData4.maxHr = x7rVar.d;
        phoneSportData4.minHr = x7rVar.e;
        gv9.a aVar = x7rVar.g;
        if (aVar != null) {
            phoneSportData4.lowBattery = aVar.d;
            phoneSportData4.modeChanged = aVar.c;
        }
        phoneSportData4.stride_frequency = x7rVar.h;
        phoneSportData4.runStyle = x7rVar.i;
        phoneSportData4.impact = x7rVar.j;
        int i5 = x7rVar.f38799k;
        phoneSportData4.onGround = i5;
        phoneSportData4.offGround = x7rVar.l;
        phoneSportData4.revolutionCount = x7rVar.m;
        phoneSportData4.stride = x7rVar.n;
        phoneSportData4.onOffRatio = x7rVar.o;
        phoneSportData4.currentPace = x7rVar.p;
        phoneSportData4.currentSpeed = x7rVar.q;
        PhoneSportData phoneSportData5 = this.m;
        phoneSportData5.heart_rate = i4;
        phoneSportData5.verticalStrideRatio = x7rVar.f38800r;
        phoneSportData5.verticalAmplitude = x7rVar.s;
        phoneSportData5.onGround = i5;
        return phoneSportData4;
    }

    public final void j() {
        if (f2o.x().t() == 1) {
            jdn.h().g().t(this.f);
        }
    }

    public void k() {
        if (n() && BeanSportUtils.INSTANCE.isBeanSport()) {
            s(this.m, this.l);
        }
    }

    public final PhoneSportData l(PhoneSportData phoneSportData) {
        long j;
        f2o.x().l();
        if (!f2o.x().l()) {
            return null;
        }
        long j2 = 1;
        if (this.n != 0) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j3 = this.I;
            if (j3 == 0) {
                j = seconds - this.n;
            } else {
                j = j3 - this.n;
                this.I = 0L;
            }
            if (j > 0) {
                j2 = j;
            }
        }
        float f = phoneSportData.pace / 1000.0f;
        double d = f != 0.0f ? 1.0f / f : 0.0d;
        double dH = this.x.h(this.B, this.A, this.z, d, this.C, f2o.x().T()) * 1000.0d;
        FitnessLogUtils.d(this.j, "userWeight:" + this.B + ",userHeight:" + this.A + ",userAge:" + this.z + ",speed:" + d + ",userSex:" + this.C + ",sportType:" + f2o.x().T());
        String str = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append("calorie:");
        sb.append(dH);
        FitnessLogUtils.d(str, sb.toString());
        double d2 = dH * ((double) j2);
        this.n = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.q = (float) (((double) this.q) + d2);
        FitnessLogUtils.d(this.j, "genCalorieWithStep,cal:" + d2 + ",totalCal:" + this.q);
        phoneSportData.calorie = this.q;
        return phoneSportData;
    }

    public final PhoneSportData m(PhoneSportData phoneSportData, boolean z) {
        int i;
        int i2;
        int i3;
        int iJ = (int) f2o.x().J();
        if (phoneSportData == null) {
            return this.m;
        }
        if (iJ == 0) {
            FitnessLogUtils.w(this.j, "genDistanceWithStep: duration = 0");
            return phoneSportData;
        }
        this.m.duration = iJ;
        FitnessLogUtils.d(this.j + "pace", "totalStep:" + this.f34848r + ", step : " + phoneSportData.step);
        if (!z && (i3 = this.f34848r) >= phoneSportData.step) {
            this.m.step = i3;
            FitnessLogUtils.w(this.j, "genDistanceWithStep: totalStep = " + this.f34848r + ", receiverData.step = " + phoneSportData.step);
            return this.m;
        }
        this.f34848r = phoneSportData.step;
        this.t = phoneSportData.heart_rate;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if (this.c == 0) {
            this.c = seconds - 5;
        }
        this.p = this.x.k(iJ, (float) phoneSportData.accX, (float) phoneSportData.accY, (float) phoneSportData.accZ);
        if (seconds - this.c >= 1) {
            float fC = this.x.c(this.f34848r);
            if (fC > 0.0f) {
                this.u = fC;
            }
        }
        FitnessLogUtils.d(this.j + "pace", ">>>>>>>>> totalStep:" + this.f34848r);
        Location locationB = this.x.b((long) this.f34848r);
        if (locationB != null) {
            this.o += this.G.getIncreaseDis(locationB.total_distance, -1);
            i = locationB.pace;
        } else {
            i = 0;
        }
        FitnessLogUtils.d(this.j, "genDistanceWithStep mDistance = " + this.o);
        double d = (double) this.s;
        double d2 = this.o;
        if (d < d2) {
            this.s = (int) d2;
        }
        if (iJ != 0 && (i2 = this.s) != 0) {
            int iF = this.x.f(iJ, i2);
            int iL = this.x.l(this.s, this.f34848r);
            if (seconds - this.c >= 5) {
                this.w = iF;
                this.v = iL;
                this.c = (int) seconds;
            }
        }
        this.m.setStepRate(this.u / 60.0f);
        PhoneSportData phoneSportData2 = this.m;
        phoneSportData2.stride_frequency = (int) this.u;
        phoneSportData2.stride = this.v;
        phoneSportData2.step = this.f34848r;
        if (z) {
            phoneSportData2.pace = i;
            phoneSportData2.speed = i != 0 ? 3600.0f / i : 0.0f;
            phoneSportData2.avePace = this.w;
            phoneSportData2.distance = this.s;
        }
        FitnessLogUtils.d(this.j + "pace", ">>>>>>>>pace:" + this.m.pace + ",fre:" + this.m.stride_frequency);
        return this.m;
    }

    public boolean n() {
        return f2o.x().L() == 1;
    }

    @Override // defpackage.arc
    public void onReceivePhoneLocationData(SportLocationResult sportLocationResult) {
        this.f34845a.b(sportLocationResult);
        BeanDataProcesser beanDataProcesser = this.F;
        if (beanDataProcesser != null) {
            beanDataProcesser.onReceivePhoneLocationData(sportLocationResult);
            return;
        }
        this.d = sportLocationResult.getTimeStamp();
        this.i = sportLocationResult.getTimeStamp();
        FitnessLogUtils.d(this.j, "onReceivePhoneLocationData:" + this.d);
        FitnessLogUtils.d(this.j, "locationResult:" + sportLocationResult);
        c(sportLocationResult);
        calculateInfoWithSportData(false);
        this.m.gpsAccuracyStatus = sportLocationResult.getGpsAccuracyStatus();
        j();
        sendPhoneSportData();
    }

    @Override // defpackage.arc
    public void onReceivePhoneSensorData(@NotNull SportSensorResult sportSensorResult) {
        this.x.a(sportSensorResult.f13201b, sportSensorResult.c, sportSensorResult.d);
        FitnessLogUtils.i(this.j, "onReceivePhoneSensorData:" + sportSensorResult + ",appLaunchType:" + f2o.x().t());
        j();
        if (f2o.x().t() == 6 || f2o.x().t() == 7 || !SportDeviceModel.INSTANCE.noDevice()) {
            if (this.f == 6) {
                sendPhoneSportData();
            }
        } else {
            g(sportSensorResult);
            if (this.f == 6) {
                sendPhoneSportData();
            } else {
                f();
            }
        }
    }

    @Override // defpackage.arc
    @SuppressLint({"WrongConstant"})
    public void onReceiveWearData(x7r x7rVar) {
        FitnessLogUtils.i(this.j, "onReceiveWearData:" + x7rVar);
        BeanSportUtils beanSportUtils = BeanSportUtils.INSTANCE;
        if (beanSportUtils.isBeanSport() && p(this.f)) {
            if (beanSportUtils.getModeChanged()) {
                this.F = null;
                return;
            }
            double increaseDis = this.o + ((double) ((int) this.G.getIncreaseDis(-1.0d, x7rVar.f)));
            this.o = increaseDis;
            x7rVar.f = (int) increaseDis;
            float increaseCal = this.q + ((int) this.H.getIncreaseCal(-1.0d, x7rVar.f38797a));
            this.q = increaseCal;
            x7rVar.f38797a = (int) increaseCal;
            this.F.onReceiveWearData(x7rVar);
            return;
        }
        if (o() || beanSportUtils.isBeanSport()) {
            FitnessLogUtils.i(this.j, "deviceConnected ：true , onReceiveWearData:" + x7rVar);
            this.f34847k = x7rVar;
            i(x7rVar);
            this.f34845a.c(x7rVar);
            f();
            FreeTrainingDataProcesser freeTrainingDataProcesser = this.E;
            if (freeTrainingDataProcesser != null) {
                freeTrainingDataProcesser.onReceiveWearData(this.f34847k);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr, FinishSportData finishSportData) {
        this.D = 4;
        FreeTrainingDataProcesser freeTrainingDataProcesser = this.E;
        if (freeTrainingDataProcesser != null) {
            freeTrainingDataProcesser.onSportFinished(z, bArr, finishSportData);
        }
        if (this.F != null) {
            this.F = null;
        }
        IncreaseDistance increaseDistance = this.G;
        if (increaseDistance != null) {
            increaseDistance.clear();
            this.G = null;
        }
        IncreaseCal increaseCal = this.H;
        if (increaseCal != null) {
            increaseCal.clear();
            this.H = null;
        }
        this.y.postDelayed(new Runnable() { // from class: rm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f32697a.r();
            }
        }, VibrateModeProgressBar.sLongToLong);
        jdn.h().o();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.D = 2;
        FreeTrainingDataProcesser freeTrainingDataProcesser = this.E;
        if (freeTrainingDataProcesser != null) {
            freeTrainingDataProcesser.onSportPaused();
        }
        this.I = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.D = 3;
        FreeTrainingDataProcesser freeTrainingDataProcesser = this.E;
        if (freeTrainingDataProcesser != null) {
            freeTrainingDataProcesser.onSportRestarted();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4, int i5) {
        this.D = 1;
        this.g = i2;
        this.f = i4;
        this.G = new IncreaseDistance();
        this.H = new IncreaseCal();
        if (f2o.x().E() != null) {
            this.h = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        } else {
            this.h = i2;
        }
        d(UserInfo.INSTANCE.getUserProfile());
        if (i4 == 8) {
            FreeTrainingDataProcesser freeTrainingDataProcesser = new FreeTrainingDataProcesser(this);
            this.E = freeTrainingDataProcesser;
            freeTrainingDataProcesser.onSportStarted(i, i2, i3, i4, i5);
        }
        FitnessLogUtils.i(this.j, "sportType:" + i4 + ",wearMode:" + f2o.x().L());
        if (p(i4)) {
            FitnessLogUtils.i(this.j, "BeanDataProcesser  is  process");
            this.F = new BeanDataProcesser(this.f34845a);
        }
    }

    public boolean p(int i) {
        return n() && i == 3;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }

    public final void q(PhoneSportData phoneSportData) {
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - this.i > 5) {
            phoneSportData.gpsAccuracyStatus = 0;
        }
    }

    public final void s(PhoneSportData phoneSportData, PhoneSportData phoneSportData2) {
        phoneSportData.offGround = phoneSportData2.offGround;
        phoneSportData.onGround = phoneSportData2.onGround;
        phoneSportData.runStyle = phoneSportData2.runStyle;
        phoneSportData.impact = phoneSportData2.impact;
        phoneSportData.revolutionCount = phoneSportData2.revolutionCount;
        phoneSportData.stride = phoneSportData2.stride;
        phoneSportData.onOffRatio = phoneSportData2.onOffRatio;
        phoneSportData.lowBattery = phoneSportData2.lowBattery;
        phoneSportData.currentPace = phoneSportData2.currentPace;
        phoneSportData.currentSpeed = phoneSportData2.currentSpeed;
        phoneSportData.modeChanged = phoneSportData2.modeChanged;
        if (f2o.x().T() != 6) {
            phoneSportData.calorie = phoneSportData2.calorie;
        }
        phoneSportData.stride_frequency = phoneSportData2.stride_frequency;
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.data.IDataProcesser
    public void sendPhoneSportData() {
        this.m.timeDuration = f2o.x().J();
        if (!SportDeviceModel.INSTANCE.isMainDeviceConnected()) {
            this.m.heart_rate = 0;
        }
        k();
        q(this.m);
        this.f34845a.a(this.m.copy());
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.data.IDataProcesser
    public void setCal(float f) {
        this.m.calorie = f;
    }
}
