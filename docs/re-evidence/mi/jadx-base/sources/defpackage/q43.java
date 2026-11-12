package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class q43 implements koo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sc0 f31066b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<sc0> f31067a;

    public static class a implements sc0 {
        @Override // defpackage.sc0
        public void call() {
        }
    }

    public q43(sc0 sc0Var) {
        this.f31067a = new AtomicReference<>(sc0Var);
    }

    public static q43 a(sc0 sc0Var) {
        return new q43(sc0Var);
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return this.f31067a.get() == f31066b;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        sc0 andSet;
        sc0 sc0Var = this.f31067a.get();
        sc0 sc0Var2 = f31066b;
        if (sc0Var == sc0Var2 || (andSet = this.f31067a.getAndSet(sc0Var2)) == null || andSet == sc0Var2) {
            return;
        }
        andSet.call();
    }
}
