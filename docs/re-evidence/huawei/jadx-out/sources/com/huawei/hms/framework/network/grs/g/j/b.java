package com.huawei.hms.framework.network.grs.g.j;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future<com.huawei.hms.framework.network.grs.g.d> f13327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13328b = SystemClock.elapsedRealtime();

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f13328b <= 300000;
    }

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.f13327a;
    }

    public b(Future<com.huawei.hms.framework.network.grs.g.d> future) {
        this.f13327a = future;
    }
}
