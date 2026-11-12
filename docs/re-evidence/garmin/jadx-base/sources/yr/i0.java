package yr;

import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 {
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    public static final void a(final nr.g.c cVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-269471359);
        int i15 = (o0VarE.r(cVar) ? 4 : 2) | i14;
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            u4.d dVar = cVar.f127048c;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar, j92.b.f97899b.f97920e);
            String str = cVar.f127046a;
            String str2 = cVar.f127047b;
            String str3 = cVar.f127049d;
            boolean zR = o0VarE.r(cVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a() { // from class: yr.h0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                cVar.f127050e.invoke();
                                break;
                            default:
                                cVar.f127051f.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a() { // from class: yr.h0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    cVar.f127050e.invoke();
                                    break;
                                default:
                                    cVar.f127051f.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean zR2 = o0VarE.r(cVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e23.a() { // from class: yr.h0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                cVar.f127050e.invoke();
                                break;
                            default:
                                cVar.f127051f.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.a() { // from class: yr.h0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    cVar.f127050e.invoke();
                                    break;
                                default:
                                    cVar.f127051f.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
            }
            sVar.c(rVarY, dVar, null, null, str, str2, str3, false, aVar3, (e23.a) objQ2, o0VarE, 0, 0, 396);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(cVar, i14, 10);
        }
    }
}
