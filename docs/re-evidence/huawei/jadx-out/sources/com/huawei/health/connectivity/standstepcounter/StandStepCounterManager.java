package com.huawei.health.connectivity.standstepcounter;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.StandStepCounter;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public class StandStepCounterManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static StandStepCounter f6271c;
    private Context e;

    public StandStepCounterManager(Context context) {
        this.e = null;
        if (context == null) {
            LogUtil.j("Step_StandStepCounterManager", "StandStepCounterManager context is null.");
            this.e = BaseApplication.getContext();
        }
        this.e = context;
    }

    public StandStepCounter d(int i) {
        StandStepCounter standStepCounter;
        int iB;
        synchronized (StandStepCounterManager.class) {
            if (f6271c == null && ((iB = StepCounterSupport.b(this.e)) == 1 || iB == 2)) {
                f6271c = new StandStepCounter(this.e);
            }
            standStepCounter = f6271c;
        }
        return standStepCounter;
    }

    public StandStepCounter a() {
        StandStepCounter standStepCounter;
        synchronized (StandStepCounterManager.class) {
            if (f6271c == null) {
                f6271c = new StandStepCounter(this.e, true);
            }
            standStepCounter = f6271c;
        }
        return standStepCounter;
    }
}
