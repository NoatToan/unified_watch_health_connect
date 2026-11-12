package h21;

import c53.c0;
import p005kotlin.Unit;
import p13.g0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.r f81179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n82.f f81180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g21.g f81181d;

    public /* synthetic */ w(e23.r rVar, n82.f fVar, g21.g gVar, int i14) {
        this.f81178a = i14;
        this.f81179b = rVar;
        this.f81180c = fVar;
        this.f81181d = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f81178a) {
            case 0:
                q11.a aVar = (q11.a) obj;
                aVar.getClass();
                b63.o oVar = this.f81180c.b().f130843a;
                g21.g gVar = this.f81181d;
                this.f81179b.invoke(aVar, oVar, i53.a.i(c0.p(c0.k(c0.p(new g0(gVar.f75421a), new g11.e(2)), new g11.e(3)), new g11.e(4))), Boolean.valueOf(gVar.f75423c));
                break;
            case 1:
                b11.i iVar = (b11.i) obj;
                iVar.getClass();
                String f14315a = iVar.getF14315a();
                if (f14315a != null) {
                    this.f81179b.invoke(i01.a.COPY, this.f81180c.b().f130843a, i53.a.a(f14315a), Boolean.valueOf(this.f81181d.f75423c));
                }
                break;
            default:
                b11.i iVar2 = (b11.i) obj;
                iVar2.getClass();
                String f14315a2 = iVar2.getF14315a();
                if (f14315a2 != null) {
                    this.f81179b.invoke(i01.a.MOVE, this.f81180c.b().f130843a, i53.a.a(f14315a2), Boolean.valueOf(this.f81181d.f75423c));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
