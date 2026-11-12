package v;

/* JADX INFO: loaded from: classes.dex */
public class x1 implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f174116a;

    public x1(y1 y1Var) {
        this.f174116a = y1Var;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        y1 y1Var = this.f174116a;
        y1Var.close();
        y1Var.release();
    }

    @Override // l0.c
    public final /* bridge */ /* synthetic */ void onSuccess(Void r14) {
    }
}
