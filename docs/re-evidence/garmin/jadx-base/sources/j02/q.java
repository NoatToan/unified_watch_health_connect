package j02;

import lc.u0;
import p008y1.b2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f96123b;

    public /* synthetic */ q(s sVar, int i14) {
        this.f96122a = i14;
        this.f96123b = sVar;
    }

    @Override // e23.a
    public final Object invoke() {
        long jA;
        long j8;
        int i14 = this.f96122a;
        float fC = 0.0f;
        s sVar = this.f96123b;
        switch (i14) {
            case 0:
                int i15 = s.f96125v;
                g gVarD = sVar.d();
                if (gVarD != null) {
                    f0 f0VarC = sVar.f96126a.c();
                    int i16 = h.a.f96070a[f0VarC.getOrientation().ordinal()];
                    if (i16 == 1) {
                        jA = f0VarC.a() & 4294967295L;
                    } else {
                        if (i16 != 2) {
                            u0.r();
                            return null;
                        }
                        jA = f0VarC.a() >> 32;
                    }
                    long jD = gVarD.d();
                    g6.k.a aVar = g6.k.f76003b;
                    long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jD >> 32));
                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jD & 4294967295L))) & 4294967295L;
                    n4.c.a aVar2 = n4.c.f123541b;
                    fC = (((int) jA) - p.c(sVar.f(), jFloatToRawIntBits2 | (jFloatToRawIntBits << 32))) - 1.0f;
                }
                return Float.valueOf(fC);
            case 1:
                int i17 = s.f96125v;
                g gVarD2 = sVar.d();
                if (gVarD2 != null) {
                    long jD2 = gVarD2.d();
                    g6.k.a aVar3 = g6.k.f76003b;
                    long jFloatToRawIntBits3 = Float.floatToRawIntBits((int) (jD2 >> 32));
                    long jFloatToRawIntBits4 = Float.floatToRawIntBits((int) (jD2 & 4294967295L));
                    n4.c.a aVar4 = n4.c.f123541b;
                    float fC2 = p.c(sVar.f(), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L));
                    long jA2 = gVarD2.a();
                    b2 b2VarF = sVar.f();
                    b2VarF.getClass();
                    int i18 = p.a.f96121a[b2VarF.ordinal()];
                    if (i18 == 1) {
                        j8 = jA2 & 4294967295L;
                    } else {
                        if (i18 != 2) {
                            u0.r();
                            return null;
                        }
                        j8 = jA2 >> 32;
                    }
                    fC = (fC2 + ((int) j8)) - 1.0f;
                }
                return Float.valueOf(fC);
            case 2:
                return Boolean.valueOf(sVar.f96136k.getF182175a() != 0);
            default:
                return sVar.f96126a.c();
        }
    }
}
