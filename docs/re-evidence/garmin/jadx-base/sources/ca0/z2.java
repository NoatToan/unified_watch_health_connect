package ca0;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26571a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab0.a f26572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kb0.r f26573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26574d;

    public /* synthetic */ z2(ab0.a aVar, kb0.r rVar, lc.m0 m0Var) {
        this.f26572b = aVar;
        this.f26573c = rVar;
        this.f26574d = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        mb0.f fVar;
        mb0.a aVar;
        w13.c cVar;
        List listB1;
        int i14;
        switch (this.f26571a) {
            case 0:
                kb0.r rVar = this.f26573c;
                r53.p2 p2Var = rVar.f103807a;
                do {
                    value = p2Var.getValue();
                    fVar = (mb0.f) value;
                    aVar = fVar.f117731b;
                    cVar = mb0.h.f117748m;
                    listB1 = p13.h0.b1(cVar);
                    b63.v.Companion companion = b63.v.INSTANCE;
                    i14 = aVar.f117710a;
                    companion.getClass();
                } while (!p2Var.b(value, mb0.f.a(fVar, null, mb0.a.a(aVar, 0, 0, p13.w.c(new z80.j(listB1, b63.v.Companion.a(i14), b63.v.Companion.a(aVar.f117711b))), rVar.z4(p13.w.c(new z80.j(p13.h0.b1(cVar), b63.v.Companion.a(79200), b63.v.Companion.a(21600)))), false, 19), null, null, null, 29)));
                mb0.f fVar2 = (mb0.f) rVar.f103808b.getValue();
                ab0.a aVar2 = this.f26572b;
                aVar2.x4(fVar2);
                lc.y.l(this.f26574d, aVar2.y4(u90.a.SLEEP_ADVANCED));
                break;
            default:
                mb0.f fVar3 = (mb0.f) this.f26573c.f103808b.getValue();
                ab0.a aVar3 = this.f26572b;
                aVar3.x4(fVar3);
                lc.y.l(this.f26574d, aVar3.y4(u90.a.SLEEP));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ z2(kb0.r rVar, ab0.a aVar, lc.m0 m0Var) {
        this.f26573c = rVar;
        this.f26572b = aVar;
        this.f26574d = m0Var;
    }
}
