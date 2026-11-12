package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.receiver.PacketReceiver;
import com.xiaomi.fitness.sport_manager.receiver.data.DeviceDisconnectDataHandleImpl;
import com.xiaomi.fitness.sport_manager.receiver.data.IDeviceDisconnectDataHandle;
import com.xiaomi.fitness.sport_manager.receiver.data.IncreaseDeviceStep;
import com.xiaomi.fitness.sport_manager.receiver.data.IncreaseSportDataKt;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_xms.data.SensorData;
import com.xiaomi.fitness.sport_xms.data.WearSensorData;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class b36 extends ha2 implements s0d, PacketReceiver, ISportStateChangedListener, OnDeviceStatusListener {
    public String c;
    public int d;
    public int e;
    public int f;
    public cln g;
    public long h;
    public Executor i;
    public IDeviceDisconnectDataHandle j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x7r f3741k;
    public x7r l;
    public SportSensorResult m;
    public int n;
    public IncreaseDeviceStep o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3742r;
    public long s;
    public float t;
    public long u;

    public b36(jdn jdnVar, tm5 tm5Var) {
        super(jdnVar, tm5Var);
        this.c = "DeviceDataReceiver";
        this.h = 0L;
        this.i = Executors.newFixedThreadPool(1);
        this.n = 0;
        this.f3742r = 0.0f;
        this.s = 0L;
        this.t = 0.0f;
        this.u = 0L;
        this.j = new DeviceDisconnectDataHandleImpl();
        FitnessLogUtils.i(this.c, "DeviceDataReceiver");
    }

    public static /* synthetic */ void l(dv9 dv9Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (l64 l64Var : dv9Var.c) {
            arrayList.add(new SensorData(l64Var.c, l64Var.d, l64Var.e, l64Var.f));
        }
        for (l64 l64Var2 : dv9Var.d) {
            arrayList2.add(new SensorData(l64Var2.c, l64Var2.d, l64Var2.e, l64Var2.f));
        }
        jdn.h().q(new WearSensorData(arrayList, arrayList2));
    }

    @Override // defpackage.s0d
    public void a(x7r x7rVar) {
        this.l = x7rVar;
        FitnessLogUtils.i(this.c, "onReceiverMainWearData:" + this.l.toString());
        r();
    }

    @Override // defpackage.s0d
    public void c(x7r x7rVar) {
        FitnessLogUtils.i(this.c, "onReceiveAccessoriesData:" + x7rVar.toString());
        this.f3741k = x7rVar;
        gv9.a aVar = x7rVar.g;
        if (aVar != null && aVar.c) {
            BeanSportUtils.INSTANCE.setModeChanged(true);
        }
        r();
    }

    @Override // defpackage.ha2
    public void d() {
        super.d();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.u = 0L;
        FitnessLogUtils.i(this.c, "onDestroy()");
    }

    public final int f(int i) {
        if (BeanSportUtils.INSTANCE.isBeanSport()) {
            return i;
        }
        return 0;
    }

    public final int g() {
        x7r x7rVar = this.l;
        if (x7rVar != null) {
            return x7rVar.f38797a + this.j.getDisconnectData().getCal();
        }
        return 0;
    }

    public final int h() {
        x7r x7rVar;
        if (2 == f2o.x().V()) {
            FitnessLogUtils.i(this.c, "the sport is pause , step is callback");
            return this.n;
        }
        IncreaseDeviceStep increaseDeviceStep = this.o;
        int increaseDeviceStep2 = increaseDeviceStep == null ? 0 : increaseDeviceStep.getIncreaseDeviceStep(this.f3741k, this.l, this.m);
        int i = this.n + increaseDeviceStep2;
        this.n = i;
        Logger.d(IncreaseSportDataKt.TAG, "increaseStep:" + increaseDeviceStep2 + ",step:" + i + ",preStep:" + this.n);
        if (f2o.x().E() != null && (x7rVar = this.l) != null) {
            int i2 = x7rVar.f38798b;
            i(i2, i2 == 0);
            i = this.e;
        }
        this.n = i;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final void i(int i, boolean z) {
        if ((1 == f2o.x().V() || 3 == f2o.x().V()) && (f2o.x().t() == 3 || f2o.x().t() == 1)) {
            if (this.d == 0 && !z) {
                this.d = i;
            }
            this.e = i - this.d;
        }
        if (2 == f2o.x().V()) {
            this.d = i - this.e;
        }
    }

    public boolean j() {
        return SportManagerPreference.INSTANCE.getKEY_START_SPORT_MODE() == 1;
    }

    public final boolean k() {
        return f2o.x().t() == 1 && !f2o.x().l.equals("xiaomiwear_app");
    }

    @SuppressLint({"WrongConstant"})
    public final void m(br9 br9Var) {
        if (f2o.x().T() == 8) {
            this.f19851a.onReceiveWearData(new x7r(0, 0, br9Var.f, 0, 0));
        }
    }

    @SuppressLint({"WrongConstant"})
    public void n(int i) {
        this.f = i;
        if (f2o.x().T() == 8) {
            this.f19851a.onReceiveWearData(new x7r(0, 0, this.f, 0, 0));
        }
    }

    public void o(@NotNull dxa dxaVar) {
        FitnessLogUtils.i(this.c, "AppLaunchType:" + f2o.x().t() + ",onReceiveGYMData : " + dxaVar + ",wear_Hr:" + this.f);
        PhoneSportData phoneSportData = new PhoneSportData();
        phoneSportData.distance = dxaVar.d;
        phoneSportData.calorie = (float) (dxaVar.f16026b * 1000);
        phoneSportData.step = dxaVar.e;
        int i = dxaVar.f;
        phoneSportData.stepRate = ((float) i) / 60.0f;
        phoneSportData.pace = dxaVar.g;
        phoneSportData.speed = dxaVar.h;
        phoneSportData.stride_frequency = i;
        phoneSportData.deviceDuration = dxaVar.f16025a;
        if (this.g == null) {
            this.g = new cln();
        }
        phoneSportData.heart_rate = dxaVar.c;
        phoneSportData.gym_hr = this.f;
        phoneSportData.stride = this.g.l(phoneSportData.distance, phoneSportData.step);
        jdn.h().a(phoneSportData);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(String str, int i, int i2) {
        FitnessLogUtils.i(this.c, "onConnectFailure");
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(String str) {
        FitnessLogUtils.i(this.c, "onConnectStart , did:" + str);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(String str) {
        FitnessLogUtils.i(this.c, "onConnectSuccess,did:" + str);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(String str) {
        FitnessLogUtils.i(this.c, "onDisconnect , did:" + str);
        if (System.currentTimeMillis() - this.s > 1000) {
            if (!j()) {
                this.j.onDisconnect();
            }
            if (SportDeviceModel.INSTANCE.isAccessoryDevice(str)) {
                this.f3741k = null;
            }
            this.f3742r += this.t;
        }
        this.s = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.PacketReceiver
    public void onReceive(int i, s7r s7rVar) {
        if (i != 8 || s7rVar == null || s7rVar.u() == null || s7rVar.u().p() == null) {
            return;
        }
        br9 br9VarP = s7rVar.u().p();
        this.f = br9VarP.f;
        m(br9VarP);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, byte[] bArr, FinishSportData finishSportData) {
        FitnessLogUtils.i(this.c, "onSportFinished");
        BeanSportUtils.INSTANCE.setModeChanged(false);
        this.j.clear();
        this.f3741k = null;
        this.l = null;
        IncreaseDeviceStep increaseDeviceStep = this.o;
        if (increaseDeviceStep != null) {
            increaseDeviceStep.clear();
            this.o = null;
        }
        this.f3742r = 0.0f;
        this.n = 0;
        this.q = 0;
        this.h = 0L;
        this.u = 0L;
        SportDeviceModel.INSTANCE.removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        FitnessLogUtils.i(this.c, "onSportPaused");
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        FitnessLogUtils.i(this.c, "onSportRestarted");
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        FitnessLogUtils.i(this.c, "onSportSegment:" + i);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4, int i5) {
        FitnessLogUtils.i(this.c, "onSportStarted");
        BeanSportUtils.INSTANCE.setModeChanged(false);
        SportDeviceModel.INSTANCE.addDeviceStatusListener(this);
        this.o = new IncreaseDeviceStep();
    }

    public void p(@NotNull SportSensorResult sportSensorResult) {
        FitnessLogUtils.d(this.c, "onReceivePhoneSensorData");
        if (f2o.x().K() == 0) {
            this.m = sportSensorResult;
            u(sportSensorResult);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        FitnessLogUtils.i(this.c, "preSport");
    }

    public void q(final dv9 dv9Var) {
        this.i.execute(new Runnable() { // from class: a36
            @Override // java.lang.Runnable
            public final void run() {
                b36.l(dv9Var);
            }
        });
    }

    public void r() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.h;
        if (jCurrentTimeMillis <= 800 && jCurrentTimeMillis > 0) {
            Logger.i(this.c, "intervalTime:" + jCurrentTimeMillis + ", preBleTime:" + this.h);
            return;
        }
        FitnessLogUtils.i(this.c, "onReceiverWearData , intervalTime:" + jCurrentTimeMillis);
        this.h = System.currentTimeMillis();
        x7r x7rVar = new x7r(0, 0, 0, 0, 0);
        this.p = h();
        this.q = g();
        if (f2o.x().t() == 4 || f2o.x().t() == 3) {
            Logger.i(this.c, "accessoriesWearData:" + this.f3741k + ", mainWearData:" + this.l);
            if (this.f3741k != null) {
                FitnessLogUtils.i(this.c, "accessoriesWearData");
                x7rVar.f = f(this.f3741k.f);
                gv9.a aVar = this.f3741k.g;
                if (aVar == null) {
                    aVar = new gv9.a();
                }
                x7rVar.g = aVar;
                x7rVar.h = f(this.f3741k.h);
                x7rVar.i = f(this.f3741k.i);
                x7rVar.j = f(this.f3741k.j);
                x7rVar.f38799k = f(this.f3741k.f38799k);
                x7rVar.l = f(this.f3741k.l);
                x7rVar.m = f(this.f3741k.m);
                x7rVar.n = f(this.f3741k.n);
                x7rVar.o = f(this.f3741k.o);
                x7rVar.p = f(this.f3741k.p);
                x7rVar.q = BeanSportUtils.INSTANCE.isBeanSport() ? this.f3741k.q : 0.0f;
                x7rVar.f38797a = f(this.f3741k.f38797a) * 1000;
            }
            if (this.l != null) {
                FitnessLogUtils.i(this.c, "mainWearData");
                x7r x7rVar2 = this.l;
                x7rVar.c = x7rVar2.c;
                x7rVar.d = x7rVar2.d;
                x7rVar.e = x7rVar2.e;
                x7rVar.f38797a = x7rVar2.f38797a * 1000;
                x7rVar.f38800r = x7rVar2.f38800r;
                x7rVar.s = x7rVar2.s;
                if (!f2o.x().r().isBeanConnect()) {
                    x7rVar.f38799k = this.l.f38799k;
                }
            } else {
                FitnessLogUtils.i(this.c, "mainWearData == null");
                x7rVar.c = this.f;
            }
            x7rVar.f38798b = this.p;
            v(x7rVar);
        }
        if (f2o.x().t() == 7 || f2o.x().t() == 6) {
            Logger.i(this.c, "local , mainWearData:" + this.l);
            x7r x7rVar3 = this.l;
            if (x7rVar3 != null) {
                this.f = x7rVar3.c;
            }
        }
    }

    public void s(int i) {
        FitnessLogUtils.d(this.c, "onStepChanged:step:" + i + ",hr:" + this.f);
        if (k()) {
            i(i, false);
            FitnessLogUtils.i(this.c, "huami step : " + i + ", hr : " + this.f);
        }
    }

    public void t(int i) {
        if (!f2o.x().W() || System.currentTimeMillis() - this.u <= 800) {
            return;
        }
        FitnessLogUtils.d(this.c, "step :" + this.e + ", hr :" + this.f);
        this.f19851a.onReceiveWearData(new x7r(0, i == 6 ? 0 : this.e, this.f, 0, 0));
        this.u = System.currentTimeMillis();
    }

    public final void u(SportSensorResult sportSensorResult) {
        if (SportDeviceModel.INSTANCE.noDevice()) {
            this.p = h();
        }
        SportSensorResult sportSensorResultH = new SportSensorResult.b().i(this.p).e(sportSensorResult.f13201b).f(sportSensorResult.c).g(sportSensorResult.d).h();
        r();
        this.f19851a.onReceivePhoneSensorData(sportSensorResultH);
    }

    public final void v(x7r x7rVar) {
        Logger.i(this.c, "sportType:" + f2o.x().T() + ", wearSportData:" + x7rVar);
        if (f2o.x().T() != 810 && f2o.x().T() != 812) {
            this.f19851a.onReceiveWearData(x7rVar);
            return;
        }
        PhoneSportData phoneSportData = new PhoneSportData();
        phoneSportData.distance = x7rVar.f;
        phoneSportData.calorie = this.f3742r + x7rVar.f38797a;
        phoneSportData.heart_rate = x7rVar.c;
        gv9.a aVar = x7rVar.g;
        if (aVar != null) {
            phoneSportData.modeChanged = aVar.c;
            phoneSportData.lowBattery = aVar.d;
        }
        jdn.h().a(phoneSportData);
        this.t = x7rVar.f38797a;
    }
}
