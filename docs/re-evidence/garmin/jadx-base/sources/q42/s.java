package q42;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f142677b;

    public /* synthetic */ s(y yVar, int i14) {
        this.f142676a = i14;
        this.f142677b = yVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f142676a) {
            case 0:
                p2 p2Var = this.f142677b.f142755k;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, f0.a((f0) value, null, null, null, null, null, 31)));
                break;
            default:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == 11) {
                    this.f142677b.z4();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
