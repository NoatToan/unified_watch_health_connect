package bb2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f17376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f17377c;

    public /* synthetic */ n(o oVar, l lVar, int i14) {
        this.f17375a = i14;
        this.f17376b = oVar;
        this.f17377c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f17375a;
        l lVar = this.f17377c;
        o oVar = this.f17376b;
        ud.a aVar = (ud.a) obj;
        switch (i14) {
            case 0:
                o.c cVar = o.f17378d;
                aVar.getClass();
                oVar.f17380b.d(aVar, lVar);
                break;
            default:
                o.c cVar2 = o.f17378d;
                aVar.getClass();
                oVar.f17381c.c(aVar, lVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
