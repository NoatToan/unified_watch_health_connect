package defpackage;

import com.huawei.health.ecologydevice.fitness.datastruct.RopeRealData;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class egt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static egt f32957a;
    private RopeRealData e;

    private egt() {
    }

    public static void b() {
        egt egtVar = f32957a;
        if (egtVar == null) {
            f32957a = new egt();
        } else {
            egtVar.a();
        }
    }

    public static RopeRealData a(RopeRealData ropeRealData) {
        egt egtVar = f32957a;
        return egtVar != null ? egtVar.c(ropeRealData) : ropeRealData;
    }

    public static void e() {
        f32957a = null;
    }

    private void a() {
        this.e = null;
    }

    private RopeRealData c(RopeRealData ropeRealData) {
        LogUtil.d("PDROPE_RopeRealDataCleaner", "RopeRealData:UpdateTime ", Long.valueOf(ropeRealData.getUpdateTime()), ", Status ", Integer.valueOf(ropeRealData.getStatus()), ", ElapsedTime ", Integer.valueOf(ropeRealData.getElapsedTime()), ", TotalSkip ", Integer.valueOf(ropeRealData.getTotalSkip()), ", InstantaneousSpeed ", Integer.valueOf(ropeRealData.getInstantaneousSpeed()), ", InterruptTimes ", Integer.valueOf(ropeRealData.getInterruptTimes()), ",CurrentContinueSkip ", Integer.valueOf(ropeRealData.getCurrentContinueSkip()), ",TotalEnergy ", Integer.valueOf(ropeRealData.getTotalEnergy()));
        if (dzt.b(ropeRealData.getRopeSkippingMode()) != 8) {
            b(ropeRealData);
        }
        return ropeRealData;
    }

    private void b(RopeRealData ropeRealData) {
        if (ropeRealData.getInstantaneousSpeed() > 480) {
            LogUtil.d("PDROPE_RopeRealDataCleaner", "correctData, InstantaneousSpeed:", Integer.valueOf(ropeRealData.getInstantaneousSpeed()));
            ropeRealData.setInstantaneousSpeed(-1);
        }
        if (this.e == null) {
            e(ropeRealData);
            return;
        }
        if (ropeRealData.getElapsedTime() < this.e.getElapsedTime()) {
            LogUtil.d("PDROPE_RopeRealDataCleaner", "correctData, ElapsedTime:", Integer.valueOf(ropeRealData.getElapsedTime()), ", last ElapsedTime:", Integer.valueOf(this.e.getElapsedTime()));
            ropeRealData.setElapsedTime(this.e.getElapsedTime());
        } else {
            this.e.setElapsedTime(ropeRealData.getElapsedTime());
        }
        if (ropeRealData.getTotalSkip() < this.e.getTotalSkip()) {
            LogUtil.d("PDROPE_RopeRealDataCleaner", "correctData, TotalSkip:", Integer.valueOf(ropeRealData.getTotalSkip()), ", last TotalSkip:", Integer.valueOf(this.e.getTotalSkip()));
            ropeRealData.setTotalSkip(this.e.getTotalSkip());
        } else {
            this.e.setTotalSkip(ropeRealData.getTotalSkip());
        }
        if (ropeRealData.getTotalEnergy() < this.e.getTotalEnergy()) {
            LogUtil.d("PDROPE_RopeRealDataCleaner", "correctData, TotalEnergy:", Integer.valueOf(ropeRealData.getTotalEnergy()), ", last TotalEnergy:", Integer.valueOf(this.e.getTotalEnergy()));
            ropeRealData.setTotalEnergy(this.e.getTotalEnergy());
        } else {
            this.e.setTotalEnergy(ropeRealData.getTotalEnergy());
        }
        if (ropeRealData.getInterruptTimes() < this.e.getInterruptTimes() && ropeRealData.getInterruptTimes() != 65535) {
            LogUtil.d("PDROPE_RopeRealDataCleaner", "correctData, InterruptTimes:", Integer.valueOf(ropeRealData.getInterruptTimes()), ", last InterruptTimes:", Integer.valueOf(this.e.getInterruptTimes()));
            ropeRealData.setInterruptTimes(this.e.getInterruptTimes());
        } else {
            this.e.setInterruptTimes(ropeRealData.getInterruptTimes());
        }
        if (ropeRealData.getCurrentContinueSkip() > ropeRealData.getTotalSkip() && ropeRealData.getCurrentContinueSkip() != 65535) {
            LogUtil.d("PDROPE_RopeRealDataCleaner", "correctData, ContinueSkip:", Integer.valueOf(ropeRealData.getCurrentContinueSkip()), ", TotalSkip:", Integer.valueOf(ropeRealData.getTotalSkip()));
            ropeRealData.setCurrentContinueSkip(this.e.getCurrentContinueSkip());
            return;
        }
        this.e.setCurrentContinueSkip(ropeRealData.getCurrentContinueSkip());
    }

    private void e(RopeRealData ropeRealData) {
        RopeRealData ropeRealData2 = new RopeRealData();
        this.e = ropeRealData2;
        ropeRealData2.setElapsedTime(ropeRealData.getElapsedTime());
        this.e.setTotalSkip(ropeRealData.getTotalSkip());
        this.e.setTotalEnergy(ropeRealData.getTotalEnergy());
        this.e.setInterruptTimes(ropeRealData.getInterruptTimes());
        this.e.setCurrentContinueSkip(ropeRealData.getCurrentContinueSkip());
    }
}
