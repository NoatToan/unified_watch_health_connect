package com.huawei.openalliance.ad;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class hz extends hu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib f18934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f18935c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.huawei.openalliance.ad.utils.p("PPS-FileLog"));

    @Override // com.huawei.openalliance.ad.ib
    public void a(final id idVar, final int i, final String str) {
        this.f18935c.execute(new Runnable() { // from class: com.huawei.openalliance.ad.hz.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    hz.this.f18934b.a(idVar, i, str);
                } catch (Throwable th) {
                    Log.w("HiAdLog", "log err: " + th.getClass().getSimpleName());
                }
            }
        });
        if (this.f18928a != null) {
            this.f18928a.a(idVar, i, str);
        }
    }

    @Override // com.huawei.openalliance.ad.ib
    public ib a(final String str, final String str2) {
        this.f18935c.execute(new Runnable() { // from class: com.huawei.openalliance.ad.hz.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    hz.this.f18934b.a(str, str2);
                } catch (Throwable th) {
                    Log.w("HiAdLog", "init err: " + th.getClass().getSimpleName());
                }
            }
        });
        if (this.f18928a != null) {
            this.f18928a.a(str, str2);
        }
        return this;
    }

    public hz(ib ibVar) {
        this.f18934b = ibVar;
    }
}
