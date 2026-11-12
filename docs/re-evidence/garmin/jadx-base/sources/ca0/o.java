package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ga0.a f26391b;

    public /* synthetic */ o(ga0.a aVar, int i14) {
        this.f26390a = i14;
        this.f26391b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        z80.f fVar;
        Object value2;
        z80.f fVarB;
        String str;
        Object value3;
        z80.f fVar2;
        switch (this.f26390a) {
            case 0:
                zb0.s0 s0Var = (zb0.s0) obj;
                s0Var.getClass();
                r53.p2 p2Var = this.f26391b.f76604m;
                do {
                    value = p2Var.getValue();
                    fVar = (z80.f) value;
                } while (!p2Var.b(value, fVar != null ? z80.f.b(fVar, null, Integer.valueOf(s0Var.f203656a.f20535a), null, null, null, null, null, 253) : null));
                return Unit.INSTANCE;
            case 1:
                j90.c cVar = (j90.c) obj;
                cVar.getClass();
                r53.p2 p2Var2 = this.f26391b.f76604m;
                do {
                    value2 = p2Var2.getValue();
                    z80.f fVar3 = (z80.f) value2;
                    if (fVar3 != null) {
                        int i14 = ga0.a.b.f76606a[cVar.ordinal()];
                        if (i14 == 1) {
                            str = j90.f.LANDSCAPE_FLIPPED.f97814a;
                        } else {
                            if (i14 != 2) {
                                lc.u0.r();
                                return null;
                            }
                            str = j90.f.LANDSCAPE.f97814a;
                        }
                        fVarB = z80.f.b(fVar3, null, null, str, null, null, null, null, 251);
                    } else {
                        fVarB = null;
                    }
                } while (!p2Var2.b(value2, fVarB));
                return Unit.INSTANCE;
            case 2:
                j90.k kVar = (j90.k) obj;
                kVar.getClass();
                r53.p2 p2Var3 = this.f26391b.f76604m;
                do {
                    value3 = p2Var3.getValue();
                    fVar2 = (z80.f) value3;
                } while (!p2Var3.b(value3, fVar2 != null ? z80.f.b(fVar2, null, null, null, null, kVar.f97833a, null, null, 239) : null));
                return Unit.INSTANCE;
            case 3:
                j90.o oVar = (j90.o) obj;
                oVar.getClass();
                this.f26391b.A4(oVar);
                return Unit.INSTANCE;
            default:
                j90.o oVar2 = (j90.o) obj;
                oVar2.getClass();
                this.f26391b.A4(oVar2);
                return Unit.INSTANCE;
        }
    }
}
