package com.huawei.health.connectivity;

import android.content.Context;
import com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter;
import com.huawei.health.connectivity.extendstepcounter.ExtendStepCounterManager;
import com.huawei.health.connectivity.standstepcounter.StandStepCounterManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.StandStepCounter;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public class StepCounterManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExtendStepCounterManager f6251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StandStepCounterManager f6252b;
    private Context e;
    private StandStepCounter d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendStepCounter f6253c = null;

    public StepCounterManager(Context context) {
        this.f6251a = null;
        this.f6252b = null;
        this.e = context;
        this.f6251a = new ExtendStepCounterManager(context);
        this.f6252b = new StandStepCounterManager(this.e);
        LogUtil.a("Step_StepCounterManager", "StepCounterManager() deviceType = ", Integer.valueOf(StepCounterSupport.b(this.e)));
    }

    public StandStepCounter a() {
        return b(false);
    }

    public StandStepCounter b(boolean z) {
        if (z) {
            if (this.d == null) {
                this.d = this.f6252b.a();
            }
        } else if (this.d == null) {
            this.d = this.f6252b.d(0);
        }
        if (this.d == null) {
            LogUtil.j("Step_StepCounterManager", "mStandStepCounter is null.");
        }
        return this.d;
    }

    public ExtendStepCounter d() {
        LogUtil.a("Step_StepCounterManager", "initExtendStepCounter = ", Integer.valueOf(this.f6251a.a()));
        ExtendStepCounter extendStepCounterB = this.f6251a.b();
        this.f6253c = extendStepCounterB;
        return extendStepCounterB;
    }

    public ExtendStepCounter e(boolean z) {
        if (z) {
            this.f6253c = this.f6251a.d();
        } else {
            this.f6253c = d();
        }
        return this.f6253c;
    }

    public void b() {
        this.f6251a.c();
        this.f6253c = null;
    }
}
