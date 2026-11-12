package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ll1 implements Runnable, z4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pqh f25189a = new pqh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld8 f25190b;

    public ll1(ld8 ld8Var) {
        this.f25190b = ld8Var;
    }

    @Override // defpackage.z4i
    public void a(ioo iooVar, Object obj) {
        this.f25189a.a(nqh.a(iooVar, obj));
        this.f25190b.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        nqh nqhVarB = this.f25189a.b();
        if (nqhVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f25190b.g(nqhVarB);
    }
}
