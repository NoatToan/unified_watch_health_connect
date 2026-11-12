package fa;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f70063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f70064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70066d;

    public v(int i14) {
        this.f70063a = new long[i14];
        this.f70064b = (V[]) new Object[i14];
    }

    public final synchronized void a(long j8, V v14) {
        int i14 = this.f70066d;
        if (i14 > 0) {
            if (j8 <= this.f70063a[((this.f70065c + i14) - 1) % this.f70064b.length]) {
                b();
            }
        }
        c();
        int i15 = this.f70065c;
        int i16 = this.f70066d;
        V[] vArr = this.f70064b;
        int length = (i15 + i16) % vArr.length;
        this.f70063a[length] = j8;
        vArr[length] = v14;
        this.f70066d = i16 + 1;
    }

    public final synchronized void b() {
        this.f70065c = 0;
        this.f70066d = 0;
        Arrays.fill(this.f70064b, (Object) null);
    }

    public final void c() {
        int length = this.f70064b.length;
        if (this.f70066d < length) {
            return;
        }
        int i14 = length * 2;
        long[] jArr = new long[i14];
        V[] vArr = (V[]) new Object[i14];
        int i15 = this.f70065c;
        int i16 = length - i15;
        System.arraycopy(this.f70063a, i15, jArr, 0, i16);
        System.arraycopy(this.f70064b, this.f70065c, vArr, 0, i16);
        int i17 = this.f70065c;
        if (i17 > 0) {
            System.arraycopy(this.f70063a, 0, jArr, i16, i17);
            System.arraycopy(this.f70064b, 0, vArr, i16, this.f70065c);
        }
        this.f70063a = jArr;
        this.f70064b = vArr;
        this.f70065c = 0;
    }

    public final V d(long j8, boolean z14) {
        V vG = null;
        long j14 = Long.MAX_VALUE;
        while (this.f70066d > 0) {
            long j15 = j8 - this.f70063a[this.f70065c];
            if (j15 < 0 && (z14 || (-j15) >= j14)) {
                break;
            }
            vG = g();
            j14 = j15;
        }
        return vG;
    }

    public final synchronized V e() {
        return this.f70066d == 0 ? null : g();
    }

    public final synchronized V f(long j8) {
        return d(j8, true);
    }

    public final V g() {
        a.d(this.f70066d > 0);
        V[] vArr = this.f70064b;
        int i14 = this.f70065c;
        V v14 = vArr[i14];
        vArr[i14] = null;
        this.f70065c = (i14 + 1) % vArr.length;
        this.f70066d--;
        return v14;
    }

    public final synchronized int h() {
        return this.f70066d;
    }

    public v() {
        this(10);
    }
}
