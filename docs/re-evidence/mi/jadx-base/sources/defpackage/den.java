package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_eco_manager.recorder.device.FreeSportRecorder;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class den implements ISportStateChangedListener, ISportDataChangedListener, nrc, wq9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15452a = "SportDataWearProvider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f15453b = new AtomicBoolean(false);
    public aen c = null;
    public wq9 d;
    public boolean e;
    public int f;

    @Override // wq9.a
    public void a(int i) {
        if (i == 4 && this.e && this.d != null) {
            if (g2o.s().H() == 1 || g2o.s().H() == 3) {
                g();
                this.d.b(4, 1000);
                FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
                FitnessLogUtils.d(this.f15452a, "fitness loop : " + this.d + "， this : " + this);
            }
        }
    }

    public int d(int i, int i2) {
        return (int) ((i / i2) * 1000.0f);
    }

    public void e() {
        FitnessLogUtils.i(this.f15452a, "FitnessSport onDestroy");
        AtomicBoolean atomicBoolean = this.f15453b;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        if (this.d != null) {
            FitnessLogUtils.d(this.f15452a, "fitnessLoop.stopLoop(); this ：" + this);
            this.d.c();
            this.d = null;
        }
    }

    public void f(int i, int i2, int i3) {
        FitnessLogUtils.i(this.f15452a, "start sport recorder");
        if (i3 == 0) {
            h(i, i2);
        }
    }

    public void g() {
    }

    public void h(int i, int i2) {
        int currentTZOffsetIn15min = FitnessDateUtils.getCurrentTZOffsetIn15min();
        SportData sportDataZ = g2o.s().z();
        if (sportDataZ != null) {
            i = sportDataZ.startTime;
            currentTZOffsetIn15min = sportDataZ.timezone;
        }
        if (i2 == 3) {
            this.c = new e1l(AppUtil.getApp(), "xiaomiwear_app", i, currentTZOffsetIn15min, i2, sportDataZ != null);
        }
        if (i2 == 7) {
            FitnessLogUtils.i(this.f15452a, "startSportDataRecorder is 健身车");
            this.c = new ytk(AppUtil.getApp(), "xiaomiwear_app", i, currentTZOffsetIn15min, i2, sportDataZ != null);
        }
        if (i2 == 6) {
            this.c = new aj2(AppUtil.getApp(), "xiaomiwear_app", i, currentTZOffsetIn15min, i2, sportDataZ != null);
        }
        if (i2 == 8) {
            this.c = new FreeSportRecorder(AppUtil.getApp(), "xiaomiwear_app", i, currentTZOffsetIn15min, i2, false);
        }
        ak5 ak5Var = new ak5(AppUtil.getApp(), "xiaomiwear_app", i, currentTZOffsetIn15min, i2, sportDataZ != null);
        odn.e().b(this.c);
        odn.e().b(ak5Var);
        g2o.s().e(odn.e().getClass(), odn.e());
        kdn.f().d(odn.e().getClass(), odn.e());
    }

    public void i() {
        wq9 wq9Var = this.d;
        if (wq9Var != null) {
            wq9Var.c();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public abstract void onSportFinished(boolean z, @Nullable byte[] bArr);

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        wq9 wq9Var = this.d;
        if (wq9Var != null) {
            wq9Var.c();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        if (!this.e || this.d == null) {
            return;
        }
        wq9 wq9Var = new wq9(this);
        this.d = wq9Var;
        wq9Var.a(4);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4) {
        FitnessLogUtils.i(this.f15452a, "onSportStarted(), this ： " + this);
        this.f = i3;
        boolean z = i3 == 3 || i3 == 6 || i3 == 7;
        this.e = z;
        if (z) {
            wq9 wq9Var = new wq9(this);
            this.d = wq9Var;
            wq9Var.a(4);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }
}
