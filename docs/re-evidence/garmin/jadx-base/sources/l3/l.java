package l3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f109312b;

    public /* synthetic */ l(m mVar, int i14) {
        this.f109311a = i14;
        this.f109312b = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f109311a;
        float f14 = 0.0f;
        m mVar = this.f109312b;
        switch (i14) {
            case 0:
                T f182175a = mVar.f109330l.getF182175a();
                if (f182175a != 0) {
                    return f182175a;
                }
                float floatValue = mVar.f109328j.getFloatValue();
                boolean zIsNaN = Float.isNaN(floatValue);
                p3.c2 c2Var = mVar.f109325g;
                return !zIsNaN ? mVar.c(floatValue, 0.0f, c2Var.getF182175a()) : c2Var.getF182175a();
            case 1:
                T f182175a2 = mVar.f109330l.getF182175a();
                if (f182175a2 != 0) {
                    return f182175a2;
                }
                float floatValue2 = mVar.f109328j.getFloatValue();
                boolean zIsNaN2 = Float.isNaN(floatValue2);
                p3.c2 c2Var2 = mVar.f109325g;
                if (zIsNaN2) {
                    return c2Var2.getF182175a();
                }
                T f182175a3 = c2Var2.getF182175a();
                o0 o0VarE = mVar.e();
                float fC = o0VarE.c(f182175a3);
                if (fC != floatValue2 && !Float.isNaN(fC)) {
                    if (fC < floatValue2) {
                        Object objB = o0VarE.b(floatValue2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = o0VarE.b(floatValue2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return f182175a3;
            case 2:
                int i15 = m.f109318o;
                float fC2 = mVar.e().c(mVar.f109325g.getF182175a());
                float fC3 = mVar.e().c(mVar.f109327i.getF182175a()) - fC2;
                float fAbs = Math.abs(fC3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    f14 = 1.0f;
                } else {
                    float fH = (mVar.h() - fC2) / fC3;
                    if (fH >= 1.0E-6f) {
                        if (fH > 0.999999f) {
                            f14 = 1.0f;
                        } else {
                            f14 = fH;
                        }
                    }
                }
                return Float.valueOf(f14);
            case 3:
                return mVar.e();
            default:
                return new o13.p(mVar.e(), mVar.f109326h.getF182175a());
        }
    }
}
