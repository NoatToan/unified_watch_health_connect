package af1;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ we1.d f3071b;

    public /* synthetic */ c(we1.d dVar, int i14) {
        this.f3070a = i14;
        this.f3071b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f3070a) {
            case 0:
                we1.d dVar = this.f3071b;
                dVar.getClass();
                ge1.b.T(v1.a(dVar), null, null, new we1.i(dVar, null), 3);
                break;
            default:
                we1.d dVar2 = this.f3071b;
                dVar2.getClass();
                ge1.b.T(v1.a(dVar2), null, null, new we1.g(dVar2, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
