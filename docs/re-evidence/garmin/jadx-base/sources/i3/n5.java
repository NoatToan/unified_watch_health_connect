package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n5 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5 f89061b;

    public /* synthetic */ n5(p5 p5Var, int i14) {
        this.f89060a = i14;
        this.f89061b = p5Var;
    }

    @Override // e23.a
    public final Object invoke() {
        h3.b bVar;
        int i14 = this.f89060a;
        p5 p5Var = this.f89061b;
        switch (i14) {
            case 0:
                db dbVar = (db) h5.i.a(p5Var, fb.f88099a);
                h3.a aVar = p5Var.f89277g;
                if (dbVar == null) {
                    if (aVar != null) {
                        p5Var.V1(aVar);
                    }
                    p5Var.f89277g = null;
                } else if (aVar == null) {
                    o5 o5Var = new o5(p5Var);
                    n5 n5Var = new n5(p5Var, 1);
                    a2.i iVar = p5Var.f89273c;
                    boolean z14 = p5Var.f89274d;
                    float f14 = p5Var.f89275e;
                    s1.b2<Float> b2Var = h3.h.f81245a;
                    h3.a aVar2 = new h3.a(iVar, z14, f14, o5Var, n5Var, null);
                    p5Var.U1(aVar2);
                    p5Var.f89277g = aVar2;
                }
                return Unit.INSTANCE;
            default:
                db dbVar2 = (db) h5.i.a(p5Var, fb.f88099a);
                if (dbVar2 != null && (bVar = dbVar2.f87863b) != null) {
                    return bVar;
                }
                eb.f87988a.getClass();
                return eb.f87989b;
        }
    }
}
