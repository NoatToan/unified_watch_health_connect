package ki1;

import androidx.lifecycle.v1;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f104828b;

    public /* synthetic */ e(l lVar, int i14) {
        this.f104827a = i14;
        this.f104828b = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        switch (this.f104827a) {
            case 0:
                this.f104828b.y4();
                break;
            case 1:
                l lVar = this.f104828b;
                lVar.getClass();
                ge1.b.T(v1.a(lVar), null, null, new r(lVar, null), 3);
                break;
            case 2:
                l lVar2 = this.f104828b;
                lVar2.getClass();
                ge1.b.T(v1.a(lVar2), null, null, new p(lVar2, null), 3);
                break;
            default:
                p2 p2Var = this.f104828b.f104868q;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, b.C2009b.f104821a));
                break;
        }
        return Unit.INSTANCE;
    }
}
