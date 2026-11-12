package bp2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fj2.a f19436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f19437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19438d;

    public /* synthetic */ b(fj2.a aVar, c cVar, int i14, int i15) {
        this.f19435a = i15;
        this.f19436b = aVar;
        this.f19437c = cVar;
        this.f19438d = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f19435a;
        int i15 = this.f19438d;
        c cVar = this.f19437c;
        fj2.a aVar = this.f19436b;
        switch (i14) {
            case 0:
                if (aVar != null) {
                    cVar.f19444d.c(new c.d.b(aVar, i15, c.a.f19446a));
                } else {
                    c.C0291c c0291c = c.f19439f;
                }
                break;
            case 1:
                if (aVar != null) {
                    cVar.f19444d.c(new c.d.b(aVar, i15, c.a.f19447b));
                } else {
                    c.C0291c c0291c2 = c.f19439f;
                }
                break;
            default:
                if (aVar != null) {
                    cVar.f19444d.c(new c.d.b(aVar, i15, c.a.f19448c));
                } else {
                    c.C0291c c0291c3 = c.f19439f;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
