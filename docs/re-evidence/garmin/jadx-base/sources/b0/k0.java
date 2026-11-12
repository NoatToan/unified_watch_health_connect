package b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements androidx.camera.core.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13998b;

    public /* synthetic */ k0(Object obj, int i14) {
        this.f13997a = i14;
        this.f13998b = obj;
    }

    @Override // androidx.camera.core.b.a
    public final void e(androidx.camera.core.b bVar) {
        h0.t0 t0Var;
        switch (this.f13997a) {
            case 0:
                androidx.camera.core.c cVar = ((androidx.camera.core.c.b) this.f13998b).f5438d.get();
                if (cVar != null) {
                    cVar.f5434x.execute(new a0.c(cVar, 19));
                    return;
                }
                return;
            default:
                androidx.camera.core.g gVar = (androidx.camera.core.g) this.f13998b;
                synchronized (gVar.f5455a) {
                    try {
                        int i14 = gVar.f5456b - 1;
                        gVar.f5456b = i14;
                        if (gVar.f5457c && i14 == 0) {
                            gVar.close();
                        }
                        t0Var = gVar.f5460f;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (t0Var != null) {
                    t0Var.e(bVar);
                    return;
                }
                return;
        }
    }
}
