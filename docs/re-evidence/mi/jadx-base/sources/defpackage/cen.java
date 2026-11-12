package defpackage;

import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.recorder.device.FreeSportRecorder;
import com.xiaomi.fitness.sport_manager.recorder.device.SomatosensnsoryGameRecorder;
import com.xiaomi.fitness.sport_manager.recorder.device.SwitchDanceRecorder;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cen implements ISportStateChangedListener, ISportDataChangedListener, mrc, xq9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public eon f5252b;
    public xq9 d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5251a = "SportDataWearProvider";
    public AtomicBoolean c = new AtomicBoolean(false);

    @Override // xq9.a
    public void a(int i) {
        if (i == 4 && this.e && this.d != null) {
            if (f2o.x().P() == 1 || f2o.x().P() == 3) {
                g();
                this.d.b(4, 1000);
                FitnessLogUtils.d(this.f5251a, "fitness loop : " + this.d + "， this : " + this);
            }
        }
    }

    public int d(int i, int i2) {
        return (int) ((i / i2) * 1000.0f);
    }

    public void e() {
        FitnessLogUtils.i(this.f5251a, "FitnessSport onDestroy");
        eon eonVar = this.f5252b;
        if (eonVar != null) {
            eonVar.m();
            this.f5252b = null;
        }
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        if (this.d != null) {
            FitnessLogUtils.i(this.f5251a, "fitnessLoop.stopLoop(); this ：" + this);
            this.d.c();
            this.d = null;
        }
    }

    public void f(SportRequestData sportRequestData, int i) {
        FitnessLogUtils.i(this.f5251a, "start sport recorder");
        if (i == 0) {
            i(sportRequestData);
            h("xiaomiwear_app", 2);
        }
    }

    public void g() {
    }

    public void h(String str, int i) {
        SportData sportDataE = f2o.x().E();
        FitnessLogUtils.i(this.f5251a, "FitnessSport start GPS Recorder, did:" + str);
        SportDeviceModel.INSTANCE.curDeviceModel();
        this.f5252b = new eon(AppUtil.getApp(), str, sportDataE != null, i);
        f2o.x().h(this.f5252b.getClass(), this.f5252b);
        jdn.h().e(this.f5252b.getClass(), this.f5252b);
    }

    public void i(SportRequestData sportRequestData) {
        wyc f1lVar;
        SportData sportDataE = f2o.x().E();
        boolean z = sportDataE != null;
        if (z) {
            sportRequestData.timeStamp = sportDataE.startTime;
            sportRequestData.timeZone = sportDataE.timezone;
        }
        int i = sportRequestData.sportType;
        FitnessLogUtils.i(this.f5251a, "startSportDataRecorder: sportType = " + i);
        if (i == 1 || i == 2) {
            f1lVar = new f1l(AppUtil.getApp(), "xiaomiwear_app", sportRequestData, Boolean.valueOf(z));
            FitnessLogUtils.i(this.f5251a, "RunOutDoorRecorder : " + f1lVar);
        } else {
            f1lVar = null;
        }
        if (i == 3) {
            f1lVar = new d1l(AppUtil.getApp(), "xiaomiwear_app", sportRequestData, Boolean.valueOf(z));
            FitnessLogUtils.i(this.f5251a, "RunInDoorRecorder : " + f1lVar);
        }
        if (i == 6) {
            f1lVar = new zi2(AppUtil.getApp(), "xiaomiwear_app", sportRequestData, Boolean.valueOf(z));
            FitnessLogUtils.i(this.f5251a, "BikOutDoorRecorder : " + f1lVar);
        }
        if (i == 8) {
            f1lVar = new FreeSportRecorder(AppUtil.getApp(), "xiaomiwear_app", sportRequestData, false);
            FitnessLogUtils.i(this.f5251a, "FreeSportRecorder : " + f1lVar);
        }
        if (i == 810) {
            f1lVar = new SomatosensnsoryGameRecorder(AppUtil.getApp(), "xiaomiwear_app", sportRequestData, false);
            FitnessLogUtils.i(this.f5251a, "SomatosensnsoryGameRecorder : " + f1lVar);
        }
        if (i == 812) {
            f1lVar = new SwitchDanceRecorder(AppUtil.getApp(), "xiaomiwear_app", sportRequestData, false);
            FitnessLogUtils.i(this.f5251a, "SwitchDanceRecorder : " + f1lVar);
        }
        zj5 zj5Var = new zj5(AppUtil.getApp(), "xiaomiwear_app", sportRequestData, z);
        FitnessLogUtils.i(this.f5251a, "DailyRecorder : " + zj5Var);
        ndn.i().c(AIApiConstants.Fitness.NAME, f1lVar);
        ndn.i().c("Daily", zj5Var);
        f2o.x().h(ndn.i().getClass(), ndn.i());
        jdn.h().e(ndn.i().getClass(), ndn.i());
    }

    public void j() {
        FitnessLogUtils.i(this.f5251a, "FitnessSport stop GPS Recorder");
    }

    public void k() {
        xq9 xq9Var = this.d;
        if (xq9Var != null) {
            xq9Var.c();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public abstract void onSportFinished(boolean z, byte[] bArr, FinishSportData finishSportData);

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        FitnessLogUtils.i(this.f5251a, "onSportPaused , fitnessLoop:" + this.d);
        xq9 xq9Var = this.d;
        if (xq9Var != null) {
            xq9Var.c();
            this.d = null;
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        FitnessLogUtils.i(this.f5251a, "onSportRestarted , fitnessLoop:" + this.d + ",isHanderLoop:" + this.e);
        if (this.e) {
            xq9 xq9Var = new xq9(this);
            this.d = xq9Var;
            xq9Var.a(4);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4, int i5) {
        FitnessLogUtils.i(this.f5251a, "onSportStarted(): sportType = " + i4 + ", this ： " + this);
        boolean z = i4 == 6 && f2o.x().K() == 0;
        this.e = z;
        if (z) {
            xq9 xq9Var = new xq9(this);
            this.d = xq9Var;
            xq9Var.a(4);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }
}
