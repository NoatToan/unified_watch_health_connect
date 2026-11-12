package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class wu5 implements bg8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f38357b;
    public final Executor c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f38356a = Executors.newFixedThreadPool(2, new f9i(10, "FrescoIoBoundExecutor", true));
    public final Executor d = Executors.newFixedThreadPool(1, new f9i(10, "FrescoLightWeightBackgroundExecutor", true));

    public wu5(int i) {
        this.f38357b = Executors.newFixedThreadPool(i, new f9i(10, "FrescoDecodeExecutor", true));
        this.c = Executors.newFixedThreadPool(i, new f9i(10, "FrescoBackgroundExecutor", true));
    }

    @Override // defpackage.bg8
    public Executor a() {
        return this.d;
    }

    @Override // defpackage.bg8
    public Executor b() {
        return this.c;
    }

    @Override // defpackage.bg8
    public Executor c() {
        return this.f38356a;
    }

    @Override // defpackage.bg8
    public Executor d() {
        return this.f38356a;
    }

    @Override // defpackage.bg8
    public Executor e() {
        return this.f38357b;
    }
}
