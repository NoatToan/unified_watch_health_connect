package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class g5i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f18624a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f18625b;
    public final int c;

    public g5i(int i, int i2) {
        this.f18625b = new double[i];
        this.c = i2;
    }

    public synchronized boolean a(double d) {
        try {
            int i = this.f18624a + 1;
            double[] dArr = this.f18625b;
            if (i >= dArr.length) {
                return false;
            }
            int i2 = this.f18624a;
            this.f18624a = i2 + 1;
            dArr[i2] = d;
            if (this.f18624a >= this.c) {
                double d2 = 0.0d;
                for (int i3 = this.f18624a - 1; i3 >= this.f18624a - this.c; i3--) {
                    d2 += this.f18625b[i3];
                }
                this.f18625b[b()] = d2 / ((double) this.c);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int b() {
        return this.f18624a - ((this.c + 1) / 2);
    }

    public synchronized void c() {
        this.f18624a = 0;
        this.f18625b = new double[this.f18625b.length];
    }

    public synchronized double[] d(int i) {
        if (b() + 1 < i) {
            return null;
        }
        return e((b() + 1) - i, b() + 1);
    }

    public final synchronized double[] e(int i, int i2) {
        if (this.f18624a < i2) {
            return null;
        }
        int i3 = i2 - i;
        double[] dArr = new double[i3];
        System.arraycopy(this.f18625b, i, dArr, 0, i3);
        return dArr;
    }
}
