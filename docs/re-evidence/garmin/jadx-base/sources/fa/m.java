package fa;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f70038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70039d;

    public m(int i14) {
        a.a(i14 >= 0 && i14 <= 1073741824);
        i14 = i14 == 0 ? 1 : i14;
        i14 = Integer.bitCount(i14) != 1 ? Integer.highestOneBit(i14 - 1) << 1 : i14;
        this.f70036a = 0;
        this.f70037b = 0;
        long[] jArr = new long[i14];
        this.f70038c = jArr;
        this.f70039d = jArr.length - 1;
    }

    public final long a() {
        int i14 = this.f70037b;
        if (i14 == 0) {
            c22.t.g();
            return 0L;
        }
        int i15 = this.f70036a;
        long j8 = this.f70038c[i15];
        this.f70036a = (i15 + 1) & this.f70039d;
        this.f70037b = i14 - 1;
        return j8;
    }

    public m() {
        this(16);
    }
}
