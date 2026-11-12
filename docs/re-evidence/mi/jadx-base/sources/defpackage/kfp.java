package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class kfp<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f23807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f23808b;
    public int c;
    public int d;

    public kfp() {
        this(10);
    }

    public static <V> V[] f(int i) {
        return (V[]) new Object[i];
    }

    public synchronized void a(long j, V v) {
        d(j);
        e();
        b(j, v);
    }

    public final void b(long j, V v) {
        int i = this.c;
        int i2 = this.d;
        V[] vArr = this.f23808b;
        int length = (i + i2) % vArr.length;
        this.f23807a[length] = j;
        vArr[length] = v;
        this.d = i2 + 1;
    }

    public synchronized void c() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.f23808b, (Object) null);
    }

    public final void d(long j) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.f23807a[((this.c + i) - 1) % this.f23808b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f23808b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) f(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.f23807a, i2, jArr, 0, i3);
        System.arraycopy(this.f23808b, this.c, vArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.f23807a, 0, jArr, i3, i4);
            System.arraycopy(this.f23808b, 0, vArr, i3, this.c);
        }
        this.f23807a = jArr;
        this.f23808b = vArr;
        this.c = 0;
    }

    public synchronized V g(long j) {
        return h(j, false);
    }

    public final V h(long j, boolean z) {
        V vK = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.f23807a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vK = k();
            j2 = j3;
        }
        return vK;
    }

    public synchronized V i() {
        return this.d == 0 ? null : k();
    }

    public synchronized V j(long j) {
        return h(j, true);
    }

    public final V k() {
        rk1.g(this.d > 0);
        V[] vArr = this.f23808b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }

    public synchronized int l() {
        return this.d;
    }

    public kfp(int i) {
        this.f23807a = new long[i];
        this.f23808b = (V[]) f(i);
    }
}
