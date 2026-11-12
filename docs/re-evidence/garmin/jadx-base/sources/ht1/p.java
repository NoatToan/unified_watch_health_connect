package ht1;

import f2.j0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f85571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k02.d f85572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f85573d;

    public /* synthetic */ p(i53.c cVar, k02.d dVar, e23.l lVar, int i14) {
        this.f85570a = i14;
        this.f85571b = cVar;
        this.f85572c = dVar;
        this.f85573d = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f85570a) {
            case 0:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                i53.c cVar = this.f85571b;
                j0Var.g(cVar.size(), null, null, new c0(cVar), new z3.e(-1942245546, true, new d0(cVar, this.f85572c, this.f85573d)));
                break;
            default:
                j0 j0Var2 = (j0) obj;
                j0Var2.getClass();
                i53.c cVar2 = this.f85571b;
                j0Var2.g(cVar2.size(), null, null, new y22.d.b(cVar2), new z3.e(-1942245546, true, new y22.d.c(cVar2, this.f85572c, this.f85573d, cVar2)));
                break;
        }
        return Unit.INSTANCE;
    }
}
