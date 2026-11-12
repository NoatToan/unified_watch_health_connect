package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class c36 extends ia2 implements t0d {
    public String c;
    public int d;
    public int e;
    public int f;
    public dln g;
    public long h;
    public long i;

    public c36(kdn kdnVar, um5 um5Var) {
        super(kdnVar, um5Var);
        this.c = "DeviceDataReceiver";
        this.h = 0L;
        this.i = 0L;
        FitnessLogUtils.i("DeviceDataReceiver", "DeviceDataReceiver");
    }

    @Override // defpackage.ia2
    public void b() {
        super.b();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.i = 0L;
        FitnessLogUtils.i(this.c, "onDestroy()");
    }

    public final void c(int i, boolean z) {
        if ((1 == g2o.s().N() || 3 == g2o.s().N()) && (g2o.s().n() == 3 || g2o.s().n() == 1)) {
            if (this.d == 0 && !z) {
                this.d = i;
            }
            this.e = i - this.d;
        }
        if (2 == g2o.s().N()) {
            this.d = i - this.e;
        }
    }

    public final boolean d() {
        return g2o.s().n() == 1 && !g2o.s().o.equals("xiaomiwear_app");
    }

    @SuppressLint({"WrongConstant"})
    public final void e(cr9 cr9Var) {
        if (g2o.s().L() == 8) {
            this.f20929a.onReceiveWearData(new y7r(0, 0, cr9Var.f, 0, 0));
        }
    }

    @SuppressLint({"WrongConstant"})
    public void f(int i) {
        this.f = i;
        if (g2o.s().L() == 8) {
            this.f20929a.onReceiveWearData(new y7r(0, 0, this.f, 0, 0));
        }
    }

    public void g(int i, u7r u7rVar) {
        if (i != 8 || u7rVar == null || u7rVar.r() == null || u7rVar.r().o() == null) {
            return;
        }
        cr9 cr9VarO = u7rVar.r().o();
        this.f = cr9VarO.f;
        e(cr9VarO);
    }

    public void h(@NotNull exa exaVar) {
        FitnessLogUtils.i(this.c, "AppLaunchType:" + g2o.s().n() + ",onReceiveGYMData : " + exaVar + ",wear_Hr:" + this.f);
        PhoneSportData phoneSportData = new PhoneSportData();
        phoneSportData.distance = exaVar.d;
        phoneSportData.calorie = (float) (exaVar.f17155b * 1000);
        phoneSportData.step = exaVar.e;
        int i = exaVar.f;
        phoneSportData.stepRate = ((float) i) / 60.0f;
        phoneSportData.pace = exaVar.g;
        phoneSportData.speed = exaVar.h;
        phoneSportData.stride_frequency = i;
        phoneSportData.deviceDuration = exaVar.f17154a;
        phoneSportData.bike_rpm = exaVar.i;
        phoneSportData.bike_power = exaVar.f17156k;
        phoneSportData.bike_below_target = exaVar.m;
        phoneSportData.bike_resistance_level = exaVar.l;
        phoneSportData.revolutionCount = exaVar.j;
        phoneSportData.jumpStartTime = exaVar.n;
        phoneSportData.jumpDuration = exaVar.o;
        phoneSportData.jumpCount = exaVar.p;
        phoneSportData.type = exaVar.q;
        phoneSportData.jumpFrequency = exaVar.f17157r;
        phoneSportData.stumbleCount = exaVar.s;
        phoneSportData.stumbleDuration = exaVar.t;
        if (this.g == null) {
            this.g = new dln();
        }
        int i2 = exaVar.c;
        if (i2 == 0) {
            i2 = this.f;
        }
        phoneSportData.heart_rate = i2;
        phoneSportData.gym_hr = this.f;
        phoneSportData.stride = this.g.k(phoneSportData.distance, phoneSportData.step);
        kdn.f().b(phoneSportData);
    }

    public void i(int i) {
        if (d()) {
            c(i, false);
            FitnessLogUtils.i(this.c, "huami step : " + i + ", hr : " + this.f);
        }
    }

    public void j(int i) {
        if (g2o.s().i()) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (timeUnit.toSeconds(System.currentTimeMillis()) - this.i >= 1) {
                FitnessLogUtils.d(this.c, "step :" + this.e + ", hr :" + this.f);
                this.f20929a.onReceiveWearData(new y7r(0, i == 6 ? 0 : this.e, this.f, 0, 0));
                this.i = timeUnit.toSeconds(System.currentTimeMillis());
            }
        }
    }

    @Override // defpackage.t0d
    public void onReceiveWearData(y7r y7rVar) {
        FitnessLogUtils.i(this.c, "AppLaunchType:" + g2o.s().n() + ",onReceiveWearData : " + y7rVar.toString() + ", this :" + this);
        if (System.currentTimeMillis() - this.h < 1000) {
            return;
        }
        this.h = System.currentTimeMillis();
        if (g2o.s().n() == 4 || g2o.s().n() == 3) {
            int i = y7rVar.f39907b;
            if (g2o.s().z() != null) {
                int i2 = y7rVar.f39907b;
                c(i2, i2 == 0);
                i = this.e;
            }
            y7r y7rVar2 = new y7r(y7rVar.f39906a * 1000, i, y7rVar.c, y7rVar.d, y7rVar.e);
            y7rVar2.f = y7rVar.f;
            this.f20929a.onReceiveWearData(y7rVar2);
        }
        if (g2o.s().n() == 7 || g2o.s().n() == 6) {
            this.f = y7rVar.c;
        }
    }
}
