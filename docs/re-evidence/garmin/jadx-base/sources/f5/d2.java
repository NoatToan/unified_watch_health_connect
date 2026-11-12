package f5;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float a(v1.a aVar, boolean z14, c2[] c2VarArr, float f14) {
        float f15 = Float.NaN;
        for (c2 c2Var : c2VarArr) {
            float f16 = aVar.f(c2Var);
            if (Float.isNaN(f15)) {
                f15 = f16;
            } else if (z14 == (f16 > f15)) {
                f15 = f16;
            }
        }
        return Float.isNaN(f15) ? f14 : f15;
    }
}
