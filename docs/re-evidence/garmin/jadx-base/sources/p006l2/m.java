package p006l2;

import b2.e;
import e23.a;
import f5.c0;
import g8.i;
import n4.c;
import n4.d;
import p005kotlin.Unit;
import p3.c2;
import s5.q0;
import s5.w0;
import v2.h2;
import w2.j0;
import w2.n;
import z2.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f108648b;

    public /* synthetic */ m(n nVar, int i14) {
        this.f108647a = i14;
        this.f108648b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        c0 c0VarV;
        d dVar;
        int i14 = this.f108647a;
        n nVar = this.f108648b;
        switch (i14) {
            case 0:
                return nVar.u(true, false);
            case 1:
                return nVar.u(false, false);
            case 2:
                return nVar.o(false);
            case 3:
                c2 c2Var = nVar.f181386v;
                h2 h2Var = nVar.f181365a;
                boolean zE = w0.e(h2Var.d().f167840d);
                if (((zE && ((j0) c2Var.getF182175a()) == j0.Cursor) || (!zE && ((j0) c2Var.getF182175a()) == j0.Selection)) && nVar.q() == null && ((Boolean) nVar.f181378n.getF182175a()).booleanValue() && (c0VarV = nVar.v()) != null) {
                    d dVarC = p1.c(c0VarV);
                    d dVarG = i.g(c0VarV.B(dVarC.i()), dVarC.g());
                    c0 c0VarV2 = nVar.v();
                    if (c0VarV2 != null) {
                        long j8 = h2Var.d().f167840d;
                        if (w0.e(j8)) {
                            d dVarP = nVar.p();
                            dVar = i.g(c0VarV2.B(dVarP.i()), dVarP.g());
                        } else {
                            long jB = c0VarV2.B(nVar.t(true));
                            long jB2 = c0VarV2.B(nVar.t(false));
                            q0 q0VarC = nVar.f181366b.c();
                            if (q0VarC == null) {
                                d.f123545e.getClass();
                                dVar = d.f123546f;
                            } else {
                                float f14 = q0VarC.c((int) (j8 >> 32)).f123548b;
                                long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f14)) & 4294967295L;
                                c.a aVar = c.f123541b;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0VarV2.B(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32)) & 4294967295L));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0VarV2.B((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(q0VarC.c((int) (j8 & 4294967295L)).f123548b)) & 4294967295L)) & 4294967295L));
                                int i15 = (int) (jB >> 32);
                                int i16 = (int) (jB2 >> 32);
                                dVar = new d(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jB2 & 4294967295L))));
                            }
                        }
                        if (dVar.m(dVarG)) {
                            return dVar.k(dVarG);
                        }
                    } else {
                        e.d("textLayoutCoordinates should not be null.");
                        o2.c.f();
                    }
                }
                return null;
            case 4:
                return (d) nVar.A.getF182175a();
            case 5:
                return nVar.f181365a.d();
            case 6:
                nVar.i();
                return Unit.INSTANCE;
            case 7:
                return Boolean.valueOf(!((Boolean) nVar.f181387w.getF182175a()).booleanValue());
            case 8:
                nVar.B();
                return Unit.INSTANCE;
            default:
                a<Unit> aVar2 = nVar.f181379o;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
