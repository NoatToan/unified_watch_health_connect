package com.huawei.hianalytics.visual;

import com.huawei.hianalytics.visual.autocollect.instrument.ScenarioInstrumentation;

/* JADX INFO: loaded from: classes33.dex */
public final class d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11630a;

    public d1(int i) {
        this.f11630a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScenarioInstrumentation.reportEventSignIn(this.f11630a);
    }
}
