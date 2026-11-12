package s1;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f155814a = new float[91];

    public static m a(float f14, float f15, int i14) {
        if ((i14 & 2) != 0) {
            f15 = 0.0f;
        }
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        return new m(e2.f155568a, Float.valueOf(f14), new n(f15), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final float b(y yVar, float f14, float f15) {
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        d2 d2Var = e2.f155568a;
        return ((n) yVar.a().e(new n(f14), new n(f15))).f155642a;
    }

    public static final r c(r rVar) {
        r rVarC = rVar.c();
        int iB = rVarC.getF155699e();
        for (int i14 = 0; i14 < iB; i14++) {
            rVarC.e(rVar.a(i14), i14);
        }
        return rVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m d(m mVar, float f14, float f15, int i14) {
        if ((i14 & 1) != 0) {
            f14 = ((Number) mVar.f155628b.getF182175a()).floatValue();
        }
        if ((i14 & 2) != 0) {
            f15 = ((n) mVar.f155629c).f155642a;
        }
        return new m(mVar.f155627a, Float.valueOf(f14), new n(f15), mVar.f155630d, mVar.f155631e, mVar.f155632f);
    }

    public static z e() {
        return new z(new i0(1.0f, 0.1f));
    }
}
