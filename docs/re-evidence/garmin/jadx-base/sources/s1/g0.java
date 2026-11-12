package s1;

/* JADX INFO: loaded from: classes.dex */
public interface g0 extends k<Float> {
    @Override // s1.k
    default f2 a(c2 c2Var) {
        return new m2(this);
    }

    long b(float f14, float f15, float f16);

    float c(float f14, float f15, float f16, long j8);

    float d(float f14, float f15, float f16, long j8);

    default float e(float f14, float f15, float f16) {
        return c(f14, f15, f16, b(f14, f15, f16));
    }
}
