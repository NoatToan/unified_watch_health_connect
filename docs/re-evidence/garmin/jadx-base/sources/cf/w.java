package cf;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f26991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f26992c;

    public /* synthetic */ w(b0 b0Var, t tVar, int i14) {
        this.f26990a = i14;
        this.f26991b = b0Var;
        this.f26992c = tVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f26990a;
        t tVar = this.f26992c;
        b0 b0Var = this.f26991b;
        ud.a aVar = (ud.a) obj;
        switch (i14) {
            case 0:
                b0.c cVar = b0.f26898d;
                aVar.getClass();
                b0Var.f26900b.d(aVar, tVar);
                break;
            default:
                b0.c cVar2 = b0.f26898d;
                aVar.getClass();
                b0Var.f26901c.c(aVar, tVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
