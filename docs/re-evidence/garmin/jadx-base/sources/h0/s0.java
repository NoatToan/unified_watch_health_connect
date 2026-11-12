package h0;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes.dex */
public class s0 implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f80570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f80571b;

    public s0(t0 t0Var, n nVar) {
        this.f80571b = t0Var;
        this.f80570a = nVar;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        n nVar = this.f80570a;
        if (((k0) nVar.f80538b).f80527g) {
            return;
        }
        int iB = nVar.f80537a.get(0).b();
        boolean z14 = th3 instanceof ImageCaptureException;
        t0 t0Var = this.f80571b;
        if (z14) {
            y yVar = t0Var.f80575c;
            i iVar = new i(iB, (ImageCaptureException) th3);
            yVar.getClass();
            j0.u.a();
            yVar.f80590e.f80456m.accept(iVar);
        } else {
            y yVar2 = t0Var.f80575c;
            i iVar2 = new i(iB, new ImageCaptureException(2, "Failed to submit capture request", th3));
            yVar2.getClass();
            j0.u.a();
            yVar2.f80590e.f80456m.accept(iVar2);
        }
        ((b0.l0.a) t0Var.f80574b).a();
    }

    @Override // l0.c
    public final void onSuccess(Void r14) {
        ((b0.l0.a) this.f80571b.f80574b).a();
    }
}
