package gv0;

import java.util.Arrays;
import o4.f1;
import o4.k1;
import p005kotlin.Unit;
import wd2.m1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o13.p[] f79177b;

    public /* synthetic */ c(o13.p[] pVarArr, int i14) {
        this.f79176a = i14;
        this.f79177b = pVarArr;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f79176a;
        o13.p[] pVarArr = this.f79177b;
        switch (i14) {
            case 0:
                m1 m1Var = (m1) obj;
                int i15 = d.O0;
                m1Var.getClass();
                m1Var.h((o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length));
                break;
            default:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                o4.w.a aVar = o4.w.f129023a;
                o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, 4);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) * 0.5f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
                n4.c.a aVar2 = n4.c.f123541b;
                k1 k1VarF = o4.w.a.f(aVar, pVarArr2, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), Float.intBitsToFloat((int) (fVar.b() >> 32)) * 0.5f, 8);
                f1.a aVar3 = f1.f128849a;
                long jB = fVar.b();
                aVar3.getClass();
                o4.j jVarA = o4.m.a();
                int i16 = (int) (jB >> 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i16) / 2;
                int i17 = (int) (jB & 4294967295L);
                jVarA.a(0.0f, Float.intBitsToFloat(i17));
                float f14 = fIntBitsToFloat3 * 0.5523f;
                jVarA.b(0.0f, Float.intBitsToFloat(i17) - (Float.intBitsToFloat(i17) * 0.5523f), f14, 0.0f, fIntBitsToFloat3, 0.0f);
                jVarA.b(fIntBitsToFloat3 + f14, 0.0f, Float.intBitsToFloat(i16), Float.intBitsToFloat(i17) - (Float.intBitsToFloat(i17) * 0.5523f), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17));
                jVarA.a(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17));
                jVarA.close();
                q4.f.C1(fVar, jVarA, k1VarF, 0.0f, null, 60);
                break;
        }
        return Unit.INSTANCE;
    }
}
