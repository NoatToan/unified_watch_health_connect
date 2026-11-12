package defpackage;

import com.huawei.health.connectivity.thirdband.StepCounterStrategy;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class dln {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31968c;
    private final StepCounterStrategy d;

    public dln() {
        StepCounterStrategy stepCounterStrategyA = dlq.a();
        this.d = stepCounterStrategyA;
        if (stepCounterStrategyA != null) {
            this.f31968c = stepCounterStrategyA.isSupportStep();
        }
    }

    public int d() {
        StepCounterStrategy stepCounterStrategy = this.d;
        if (stepCounterStrategy == null) {
            LogUtil.a("Step_StepCounterFactory", "getDailySteps mStrategy == null");
            return 0;
        }
        return stepCounterStrategy.getRealSteps();
    }

    public boolean c() {
        return this.f31968c;
    }
}
