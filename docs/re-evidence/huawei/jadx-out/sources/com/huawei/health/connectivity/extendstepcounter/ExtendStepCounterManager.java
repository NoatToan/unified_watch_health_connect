package com.huawei.health.connectivity.extendstepcounter;

import android.content.Context;
import com.huawei.health.connectivity.standstepcounter.StandStepCounterManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ExtendStepCounterAdapter;
import health.compact.a.MockStepCounter;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendStepCounterManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6255b;
    private StandStepCounterManager d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6256c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExtendStepCounter f6254a = null;

    public ExtendStepCounterManager(Context context) {
        this.f6255b = null;
        this.d = null;
        if (context == null) {
            LogUtil.j("Step_ExtentdStepCounterManager", "ExtendStepCounterManager context is null");
            this.f6255b = BaseApplication.getContext();
        }
        this.f6255b = context;
        this.d = new StandStepCounterManager(context);
    }

    public ExtendStepCounter b() {
        if (this.f6256c) {
            if (this.d.d(1) != null) {
                this.f6254a = new ExtendStepCounterAdapter();
            }
            return this.f6254a;
        }
        int iA = a();
        if (iA == 100) {
            this.f6254a = new MotionStepCounter(this.f6255b);
        } else if (iA == 101) {
            this.f6254a = new MidwareStepCounter(this.f6255b);
        } else if (this.d.d(1) != null) {
            this.f6254a = new ExtendStepCounterAdapter();
        }
        return this.f6254a;
    }

    public ExtendStepCounter d() {
        MockStepCounter mockStepCounter = new MockStepCounter();
        this.f6254a = mockStepCounter;
        return mockStepCounter;
    }

    public int a() {
        if (StepCounterSupport.f(this.f6255b)) {
            return 101;
        }
        if (StepCounterSupport.b(this.f6255b) != 1) {
            return 0;
        }
        LogUtil.d("Step_ExtentdStepCounterManager", "getSupportType Motion");
        return 100;
    }

    public void c() {
        this.f6256c = true;
    }
}
