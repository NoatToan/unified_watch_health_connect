package by1;

import lc.m0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f22226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f22227e;

    public /* synthetic */ y(int i14, ey1.a aVar, m0 m0Var, p1 p1Var, int i15) {
        this.f22223a = i15;
        this.f22224b = i14;
        this.f22225c = aVar;
        this.f22226d = m0Var;
        this.f22227e = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f22223a;
        p1 p1Var = this.f22227e;
        m0 m0Var = this.f22226d;
        ey1.a aVar = this.f22225c;
        int i15 = this.f22224b;
        switch (i14) {
            case 0:
                z zVar = z.f22228a;
                if (i15 < ((i53.c) p1Var.getF182175a()).size() - 1) {
                    int i16 = i15 + 1;
                    aVar.O4(i16);
                    w3.x.s(m0Var, z.f22228a.c(), h7.c.a(new o13.p("dayIndexKey", Integer.valueOf(i16))));
                } else {
                    aVar.N4();
                    lc.y.k(v.f22216a.c(), m0Var);
                }
                break;
            default:
                cy1.b bVar = cy1.b.f56796a;
                if (i15 < ((i53.c) p1Var.getF182175a()).size() - 1) {
                    int i17 = i15 + 1;
                    aVar.O4(i17);
                    w3.x.s(m0Var, cy1.b.f56796a.c(), h7.c.a(new o13.p("dayIndexKey", Integer.valueOf(i17))));
                } else {
                    aVar.N4();
                    lc.y.k(v.f22216a.c(), m0Var);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
