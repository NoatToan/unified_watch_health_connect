package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hd5 {

    public static class a extends hd5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f19947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f19948b;

        public a(double d, double[] dArr) {
            this.f19947a = d;
            this.f19948b = dArr;
        }

        @Override // defpackage.hd5
        public double c(double d, int i) {
            return this.f19948b[i];
        }

        @Override // defpackage.hd5
        public void d(double d, double[] dArr) {
            double[] dArr2 = this.f19948b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // defpackage.hd5
        public void e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f19948b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // defpackage.hd5
        public double f(double d, int i) {
            return 0.0d;
        }

        @Override // defpackage.hd5
        public void g(double d, double[] dArr) {
            for (int i = 0; i < this.f19948b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // defpackage.hd5
        public double[] h() {
            return new double[]{this.f19947a};
        }
    }

    public static hd5 a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            return i != 2 ? new jge(dArr, dArr2) : new a(dArr[0], dArr2[0]);
        }
        return new r7g(dArr, dArr2);
    }

    public static hd5 b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new yi1(iArr, dArr, dArr2);
    }

    public abstract double c(double d, int i);

    public abstract void d(double d, double[] dArr);

    public abstract void e(double d, float[] fArr);

    public abstract double f(double d, int i);

    public abstract void g(double d, double[] dArr);

    public abstract double[] h();
}
