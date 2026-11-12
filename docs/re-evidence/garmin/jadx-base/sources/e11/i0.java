package e11;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f11.j f61898b;

    public /* synthetic */ i0(f11.j jVar, int i14) {
        this.f61897a = i14;
        this.f61898b = jVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f61897a) {
            case 0:
                f11.j jVar = this.f61898b;
                jVar.getClass();
                ge1.b.T(v1.a(jVar), null, null, new f11.k(jVar, null), 3);
                break;
            default:
                this.f61898b.f67974k.setValue(f11.j.c.LOADED);
                break;
        }
        return Unit.INSTANCE;
    }
}
