package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ml1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qqh f26971a = new qqh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd8 f26972b;

    public ml1(kd8 kd8Var) {
        this.f26972b = kd8Var;
    }

    public void a(loo looVar, Object obj) {
        this.f26971a.a(oqh.a(looVar, obj));
        this.f26972b.c().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        oqh oqhVarB = this.f26971a.b();
        if (oqhVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f26972b.e(oqhVarB);
    }
}
