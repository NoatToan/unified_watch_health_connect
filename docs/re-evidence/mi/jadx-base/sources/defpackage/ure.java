package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f36053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36054b = 0;

    public ure(int i) {
        this.f36053a = new long[i];
    }

    public static ure b(int i) {
        return new ure(i);
    }

    public void a(long j) {
        e();
        long[] jArr = this.f36053a;
        int i = this.f36054b;
        this.f36054b = i + 1;
        jArr[i] = j;
    }

    public void c(int i) {
        int i2 = this.f36054b;
        if (i <= i2) {
            this.f36054b = i2 - i;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.f36054b);
    }

    public long d(int i) {
        if (i < this.f36054b) {
            return this.f36053a[i];
        }
        throw new IndexOutOfBoundsException("" + i + " >= " + this.f36054b);
    }

    public final void e() {
        int i = this.f36054b;
        if (i == this.f36053a.length) {
            long[] jArr = new long[Math.max(i + 1, (int) (((double) i) * 1.8d))];
            System.arraycopy(this.f36053a, 0, jArr, 0, this.f36054b);
            this.f36053a = jArr;
        }
    }

    public void f(int i, long j) {
        if (i < this.f36054b) {
            this.f36053a[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException("" + i + " >= " + this.f36054b);
    }

    public int g() {
        return this.f36054b;
    }
}
