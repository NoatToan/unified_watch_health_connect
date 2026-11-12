package a81;

import com.github.mikephil.charting.data.Entry;
import g81.g0;
import kotlin.m2;
import o4.t0;
import o4.u1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f1959b;

    public /* synthetic */ d(float f14, int i14) {
        this.f1958a = i14;
        this.f1959b = f14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        o13.p pVar;
        int i14 = this.f1958a;
        float f14 = this.f1959b;
        switch (i14) {
            case 0:
                g0 g0Var = (g0) obj;
                f fVar = f.f1960a;
                g0Var.getClass();
                return Integer.valueOf(Float.compare(g0Var.f76332a, f14));
            case 1:
                g0 g0Var2 = (g0) obj;
                f fVar2 = f.f1960a;
                g0Var2.getClass();
                return Integer.valueOf(Float.compare(g0Var2.f76332a, f14));
            case 2:
                m2 m2Var = (m2) obj;
                m2Var.f91341a = "padding";
                m2Var.f91342b = g6.f.a(f14);
                return Unit.INSTANCE;
            case 3:
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                t0Var.x(f14);
                return Unit.INSTANCE;
            case 4:
                ((Float) obj).floatValue();
                return Float.valueOf(f14);
            case 5:
                t0 t0Var2 = (t0) obj;
                t0Var2.getClass();
                t0Var2.x(f14);
                return Unit.INSTANCE;
            case 6:
                t0 t0Var3 = (t0) obj;
                t0Var3.getClass();
                t0Var3.v(f14);
                t0Var3.w(f14);
                return Unit.INSTANCE;
            case 7:
                t0 t0Var4 = (t0) obj;
                t0Var4.getClass();
                t0Var4.v(f14);
                t0Var4.w(f14);
                return Unit.INSTANCE;
            case 8:
                t0 t0Var5 = (t0) obj;
                t0Var5.getClass();
                t0Var5.c(f14);
                return Unit.INSTANCE;
            case 9:
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar3.b() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar3.b() & 4294967295L));
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.d dVar = j92.b.f97900c;
                float fS0 = fVar3.s0(dVar.f97914f);
                float fS1 = fVar3.s0(dVar.f97912d);
                float fS2 = fVar3.s0(dVar.f97910b);
                float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) * 0.85f;
                float f15 = 2;
                float f16 = (fIntBitsToFloat2 - fMin) / f15;
                if (f16 < f14) {
                    float f17 = fIntBitsToFloat2 - (f14 * f15);
                    float f18 = 0.85f * f17;
                    pVar = new o13.p(Float.valueOf(f18), Float.valueOf(q6.f.c(f17, f18, f15, f14)));
                } else {
                    pVar = new o13.p(Float.valueOf(fMin), Float.valueOf(f16));
                }
                float fFloatValue = ((Number) pVar.f128594a).floatValue();
                float fFloatValue2 = ((Number) pVar.f128595b).floatValue();
                float f19 = (fIntBitsToFloat - fFloatValue) / f15;
                float f22 = f19 + fFloatValue;
                float f24 = fFloatValue + fFloatValue2;
                o4.j jVarA = o4.m.a();
                float f25 = fFloatValue2 + fS0;
                jVarA.a(f19, f25);
                float f26 = fFloatValue2 + fS1;
                jVarA.c(f19, f26);
                float f27 = f19 + fS1;
                jVarA.r(f19, fFloatValue2, f27, fFloatValue2);
                float f28 = f19 + fS0;
                jVarA.c(f28, fFloatValue2);
                float f29 = f22 - fS0;
                jVarA.a(f29, fFloatValue2);
                float f34 = f22 - fS1;
                jVarA.c(f34, fFloatValue2);
                jVarA.r(f22, fFloatValue2, f22, f26);
                jVarA.c(f22, f25);
                float f35 = f24 - fS0;
                jVarA.a(f19, f35);
                float f36 = f24 - fS1;
                jVarA.c(f19, f36);
                jVarA.r(f19, f24, f27, f24);
                jVarA.c(f28, f24);
                jVarA.a(f29, f24);
                jVarA.c(f34, f24);
                jVarA.r(f22, f24, f22, f36);
                jVarA.c(f22, f35);
                gl.c.f77766a.getClass();
                long j8 = gl.c.f77767b.f77769a;
                u1.f129010b.getClass();
                q4.f.L(fVar3, jVarA, j8, 0.0f, new q4.k(fS2, 0.0f, u1.f129011c, 0, null, 26, null), 52);
                return Unit.INSTANCE;
            default:
                int i15 = zm.c.f205201y;
                return Boolean.valueOf(((Entry) obj).getX() <= f14);
        }
    }
}
