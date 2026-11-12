package e11;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f11.a f61890b;

    public /* synthetic */ h(f11.a aVar, int i14) {
        this.f61889a = i14;
        this.f61890b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f61889a) {
            case 0:
                this.f61890b.f67888h.setValue(f11.a.c.LOADED);
                break;
            default:
                f11.a aVar = this.f61890b;
                aVar.getClass();
                ge1.b.T(v1.a(aVar), null, null, new f11.b(aVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
