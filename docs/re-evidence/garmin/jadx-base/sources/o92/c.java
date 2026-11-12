package o92;

import g6.o;
import kotlin.t1;
import o4.b1;
import o4.j;
import o4.r1;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f131007a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f131008b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o92/c$a", "Lo4/r1;", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r1 {
        @Override // o4.r1
        public final b1 a(long j8, o oVar, g6.c cVar) {
            oVar.getClass();
            cVar.getClass();
            int i14 = (int) (j8 >> 32);
            float f14 = 2;
            int i15 = (int) (j8 & 4294967295L);
            return new b1.a(c.b(Float.intBitsToFloat(i14) / f14, Float.intBitsToFloat(i15) / f14, e.DIAMOND, Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o92/c$b", "Lo4/r1;", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r1 {
        @Override // o4.r1
        public final b1 a(long j8, o oVar, g6.c cVar) {
            oVar.getClass();
            cVar.getClass();
            int i14 = (int) (j8 >> 32);
            float f14 = 2;
            int i15 = (int) (j8 & 4294967295L);
            return new b1.a(c.b(Float.intBitsToFloat(i14) / f14, Float.intBitsToFloat(i15) / f14, e.TRIANGLE, Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)));
        }
    }

    /* JADX INFO: renamed from: o92.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C2488c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131009a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.DIAMOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f131009a = iArr;
        }
    }

    public static final float a(float f14, m mVar) {
        x1 x1Var = n.f135158a;
        return ((g6.c) mVar.A(t1.f91490h)).s0(f14);
    }

    public static final j b(float f14, float f15, e eVar, float f16, float f17) {
        eVar.getClass();
        int i14 = C2488c.f131009a[eVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                return o4.m.a();
            }
            j jVarA = o4.m.a();
            float f18 = f15 - (f17 / 2.0f);
            jVarA.a(f14, f18);
            float f19 = f16 / 2.0f;
            jVarA.c(f14 + f19, f15);
            jVarA.c(f14, (f17 / 2) + f15);
            jVarA.c(f14 - f19, f15);
            jVarA.c(f14, f18);
            return jVarA;
        }
        j jVarA2 = o4.m.a();
        float f22 = 2;
        float f24 = f17 / f22;
        float f25 = f15 - f24;
        jVarA2.a(f14, f25);
        float f26 = f16 / f22;
        float f27 = f15 + f24;
        jVarA2.c(f14 + f26, f27);
        jVarA2.c(f14 - f26, f27);
        jVarA2.c(f14, f25);
        return jVarA2;
    }

    public static final float c(m mVar, int i14) {
        x1 x1Var = n.f135158a;
        return ((g6.c) mVar.A(t1.f91490h)).c1(i14);
    }
}
