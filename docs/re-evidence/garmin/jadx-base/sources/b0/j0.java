package b0;

import androidx.camera.core.impl.o1;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends i0 {

    public class a implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.e f13989a;

        public a(j0 j0Var, androidx.camera.core.e eVar) {
            this.f13989a = eVar;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) throws Exception {
            this.f13989a.close();
        }

        @Override // l0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r14) {
        }
    }

    @Override // b0.i0
    public final androidx.camera.core.e b(o1 o1Var) {
        return o1Var.a();
    }

    @Override // b0.i0
    public final void d() {
    }

    @Override // b0.i0
    public final void f(androidx.camera.core.e eVar) {
        l0.j.a(c(eVar), new a(this, eVar), k0.b.a());
    }
}
