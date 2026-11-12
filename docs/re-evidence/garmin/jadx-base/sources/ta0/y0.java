package ta0;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f163491b;

    public /* synthetic */ y0(k0 k0Var, int i14) {
        this.f163490a = i14;
        this.f163491b = k0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        l90.b bVar = (l90.b) obj;
        switch (this.f163490a) {
            case 0:
                bVar.getClass();
                k0 k0Var = this.f163491b;
                ge1.b.T(v1.a(k0Var), null, null, new i0(k0Var, bVar, null), 3);
                break;
            default:
                bVar.getClass();
                k0 k0Var2 = this.f163491b;
                ge1.b.T(v1.a(k0Var2), null, null, new i0(k0Var2, bVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
