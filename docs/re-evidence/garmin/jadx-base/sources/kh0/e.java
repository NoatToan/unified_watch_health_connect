package kh0;

import i3.mc;
import nr.x;
import o53.b0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f104719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f104720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc f104721d;

    public /* synthetic */ e(b0 b0Var, p1 p1Var, mc mcVar, int i14) {
        this.f104718a = i14;
        this.f104720c = b0Var;
        this.f104719b = p1Var;
        this.f104721d = mcVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f104718a) {
            case 0:
                dh0.g gVar = (dh0.g) obj;
                gVar.getClass();
                this.f104719b.setValue(gVar);
                ge1.b.T(this.f104720c, null, null, new g.a(this.f104721d, null), 3);
                break;
            case 1:
                ((ky0.f) obj).getClass();
                this.f104719b.setValue(ky0.f.EDIT_NOTE);
                ge1.b.T(this.f104720c, null, null, new ky0.t.c(this.f104721d, null), 3);
                break;
            case 2:
                Long l14 = (Long) obj;
                l14.getClass();
                this.f104719b.setValue(l14);
                ge1.b.T(this.f104720c, null, null, new nw0.q.c(this.f104721d, null), 3);
                break;
            case 3:
                bx.b bVar = (bx.b) obj;
                bVar.getClass();
                this.f104719b.setValue(bVar);
                ge1.b.T(this.f104720c, null, null, new ox.a.C2549a(this.f104721d, null), 3);
                break;
            case 4:
                oz1.a aVar = (oz1.a) obj;
                aVar.getClass();
                this.f104719b.setValue(aVar);
                ge1.b.T(this.f104720c, null, null, new sz1.l.a(this.f104721d, null), 3);
                break;
            default:
                ((x) obj).getClass();
                this.f104719b.setValue(x.EDIT_NOTE);
                ge1.b.T(this.f104720c, null, null, new yr.m.c(this.f104721d, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(p1 p1Var, b0 b0Var, mc mcVar, int i14) {
        this.f104718a = i14;
        this.f104719b = p1Var;
        this.f104720c = b0Var;
        this.f104721d = mcVar;
    }
}
