package p40;

import am.e1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f135690b;

    public /* synthetic */ k(l lVar, int i14) {
        this.f135689a = i14;
        this.f135690b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f135689a;
        l lVar = this.f135690b;
        q40.b bVar = (q40.b) obj;
        switch (i14) {
            case 0:
                l.a aVar = l.f135693p;
                bVar.getClass();
                bp.h hVar = lVar.f135698l;
                if (hVar != null) {
                    hVar.invoke(bVar);
                }
                break;
            case 1:
                l.a aVar2 = l.f135693p;
                bVar.getClass();
                a03.h0 h0Var = lVar.f135699m;
                if (h0Var != null) {
                    h0Var.invoke(bVar);
                }
                break;
            default:
                l.a aVar3 = l.f135693p;
                bVar.getClass();
                e1 e1Var = lVar.f135697k;
                if (e1Var != null) {
                    e1Var.invoke(bVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
