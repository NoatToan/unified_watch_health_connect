package com.huawei.agconnect.apms;

import android.content.ComponentCallbacks2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class u0 implements ComponentCallbacks2 {
    public ScheduledExecutorService abc = Executors.newSingleThreadScheduledExecutor(new m("UIBackgroundListener"));

    public static final class abc implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            vwx vwxVarAbc = vwx.abc();
            vwxVarAbc.getClass();
            vwxVarAbc.abc.execute(new stu(vwxVarAbc));
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.abc.submit(new abc());
        }
    }
}
