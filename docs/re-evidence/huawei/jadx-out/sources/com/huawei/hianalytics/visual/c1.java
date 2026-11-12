package com.huawei.hianalytics.visual;

import com.huawei.hianalytics.visual.autocollect.instrument.ScenarioInstrumentation;

/* JADX INFO: loaded from: classes33.dex */
public final class c1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ScenarioInstrumentation.reportEventSignOut();
    }
}
