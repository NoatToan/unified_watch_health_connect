package p008y1;

import e23.a;
import o13.p;
import p3.c2;
import p3.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f193560b;

    public /* synthetic */ q(r rVar, int i14) {
        this.f193559a = i14;
        this.f193560b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    @Override // e23.a
    public final Object invoke() {
        Object objA;
        float fE;
        int i14 = this.f193559a;
        r rVar = this.f193560b;
        switch (i14) {
            case 0:
                c2 c2Var = rVar.f193590l;
                c2 c2Var2 = rVar.f193585g;
                z1 z1Var = rVar.f193588j;
                T f182175a = c2Var.getF182175a();
                if (f182175a == 0) {
                    return (Float.isNaN(z1Var.getFloatValue()) || (objA = rVar.b().a(z1Var.getFloatValue())) == null) ? c2Var2.getF182175a() : objA;
                }
                return f182175a;
            case 1:
                int i15 = r.f193578o;
                float fC = rVar.b().c(rVar.f193586h.getF182175a());
                float fC2 = rVar.b().c(rVar.f193587i.getF182175a()) - fC;
                float fAbs = Math.abs(fC2);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fE = 1.0f;
                } else {
                    fE = (rVar.e() - fC) / fC2;
                    if (fE < 1.0E-6f) {
                        fE = 0.0f;
                    } else if (fE > 0.999999f) {
                        fE = 1.0f;
                    }
                }
                return Float.valueOf(fE);
            case 2:
                return rVar.b();
            default:
                return new p(rVar.b(), rVar.f193587i.getF182175a());
        }
    }
}
