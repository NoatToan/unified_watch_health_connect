package dv0;

import androidx.lifecycle.v1;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu0.f f61360b;

    public /* synthetic */ d(yu0.f fVar, int i14) {
        this.f61359a = i14;
        this.f61360b = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f61359a) {
            case 0:
                ((f.a) obj).getClass();
                yu0.f fVar = this.f61360b;
                fVar.getClass();
                ge1.b.T(v1.a(fVar), null, null, new yu0.g(fVar, null), 3);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                yu0.f fVar2 = this.f61360b;
                fVar2.getClass();
                if (str.length() <= 64) {
                    p2 p2Var = fVar2.f199719q;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, str));
                }
                break;
            case 2:
                ((Boolean) obj).getClass();
                p2 p2Var2 = this.f61360b.f199721t;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, Boolean.valueOf(!((Boolean) value2).booleanValue())));
                break;
            default:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == -1) {
                    yu0.f fVar3 = this.f61360b;
                    fVar3.getClass();
                    ge1.b.T(v1.a(fVar3), null, null, new yu0.g(fVar3, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
