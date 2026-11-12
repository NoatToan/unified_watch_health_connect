package o6;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f129458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double[] f129459b;

        public a(double d14, double[] dArr) {
            this.f129458a = d14;
            this.f129459b = dArr;
        }

        @Override // o6.b
        public final double b(double d14) {
            return this.f129459b[0];
        }

        @Override // o6.b
        public final void c(double d14, double[] dArr) {
            double[] dArr2 = this.f129459b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // o6.b
        public final void d(double d14, float[] fArr) {
            int i14 = 0;
            while (true) {
                double[] dArr = this.f129459b;
                if (i14 >= dArr.length) {
                    return;
                }
                fArr[i14] = (float) dArr[i14];
                i14++;
            }
        }

        @Override // o6.b
        public final void e(double d14, double[] dArr) {
            for (int i14 = 0; i14 < this.f129459b.length; i14++) {
                dArr[i14] = 0.0d;
            }
        }

        @Override // o6.b
        public final double[] f() {
            return new double[]{this.f129458a};
        }
    }

    public static b a(int i14, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i14 = 2;
        }
        if (i14 != 0) {
            return i14 != 2 ? new g(dArr, dArr2) : new a(dArr[0], dArr2[0]);
        }
        return new h(dArr, dArr2);
    }

    public abstract double b(double d14);

    public abstract void c(double d14, double[] dArr);

    public abstract void d(double d14, float[] fArr);

    public abstract void e(double d14, double[] dArr);

    public abstract double[] f();
}
