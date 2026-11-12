package g02;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g6.c f74527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f74528c;

    public /* synthetic */ r(g6.c cVar, p3.p1 p1Var, int i14) {
        this.f74526a = i14;
        this.f74527b = cVar;
        this.f74528c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f74526a) {
            case 0:
                p3.p1 p1Var = this.f74528c;
                p1Var.setValue(g6.f.a(this.f74527b.c1((int) (((g6.m) obj).f76013a >> 32)) + ((g6.f) p1Var.getF182175a()).f75997a));
                return Unit.INSTANCE;
            case 1:
                p3.p1 p1Var2 = this.f74528c;
                p1Var2.setValue(g6.f.a(this.f74527b.c1((int) (((g6.m) obj).f76013a >> 32)) + ((g6.f) p1Var2.getF182175a()).f75997a));
                return Unit.INSTANCE;
            case 2:
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                this.f74528c.setValue(g6.f.a(this.f74527b.c1((int) (c0Var.a() & 4294967295L))));
                return Unit.INSTANCE;
            case 3:
                h4.r.a aVar = h4.r.S;
                xx1.d dVar = new xx1.d((e23.a) obj, 9);
                r rVar = new r(this.f74527b, this.f74528c, 4);
                u1.v1.f167696a.getClass();
                return u1.j1.a(aVar, dVar, rVar, u1.v1.a.a());
            case 4:
                g6.h hVar = (g6.h) obj;
                float fC = g6.h.c(hVar.f76002a);
                g6.c cVar = this.f74527b;
                this.f74528c.setValue(g6.m.a((((long) cVar.f0(fC)) << 32) | (((long) cVar.f0(g6.h.b(hVar.f76002a))) & 4294967295L)));
                return Unit.INSTANCE;
            case 5:
                h4.r.a aVar2 = h4.r.S;
                xx1.d dVar2 = new xx1.d((e23.a) obj, 10);
                r rVar2 = new r(this.f74527b, this.f74528c, 6);
                u1.v1.f167696a.getClass();
                return u1.j1.a(aVar2, dVar2, rVar2, u1.v1.a.a());
            default:
                g6.h hVar2 = (g6.h) obj;
                float fC2 = g6.h.c(hVar2.f76002a);
                g6.c cVar2 = this.f74527b;
                this.f74528c.setValue(g6.m.a((((long) cVar2.f0(fC2)) << 32) | (((long) cVar2.f0(g6.h.b(hVar2.f76002a))) & 4294967295L)));
                return Unit.INSTANCE;
        }
    }
}
