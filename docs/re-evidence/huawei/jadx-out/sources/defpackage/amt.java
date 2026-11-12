package defpackage;

import androidx.media3.muxer.Mp4Utils;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class amt<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Object[] f562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f564c;
    transient long[] d;
    public transient int e;
    private transient float f;
    private transient int g;
    private transient int[] i;

    private static long a(long j, int i) {
        return (j & (-4294967296L)) | (Mp4Utils.UNSIGNED_INT_MAX_VALUE & ((long) i));
    }

    private static int b(long j) {
        return (int) (j >>> 32);
    }

    private static int d(long j) {
        return (int) j;
    }

    public int b(int i, int i2) {
        return i - 1;
    }

    static <K> amt<K> c() {
        return new amt<>();
    }

    public static <K> amt<K> d(int i) {
        return new amt<>(i);
    }

    amt() {
        e(3, 1.0f);
    }

    public amt(amt<? extends K> amtVar) {
        e(amtVar.a(), 1.0f);
        int iD = amtVar.d();
        while (iD != -1) {
            d(amtVar.b(iD), amtVar.e(iD));
            iD = amtVar.g(iD);
        }
    }

    amt(int i) {
        this(i, 1.0f);
    }

    amt(int i, float f) {
        e(i, f);
    }

    void e(int i, float f) {
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f > 0.0f, "Illegal load factor");
        int iA = aly.a(i, f);
        this.i = m(iA);
        this.f = f;
        this.f562a = new Object[i];
        this.f563b = new int[i];
        this.d = f(i);
        this.g = Math.max(1, (int) (iA * f));
    }

    private static int[] m(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] f(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private int e() {
        return this.i.length - 1;
    }

    public int d() {
        return this.f564c == 0 ? -1 : 0;
    }

    public int g(int i) {
        int i2 = i + 1;
        if (i2 < this.f564c) {
            return i2;
        }
        return -1;
    }

    public int a() {
        return this.f564c;
    }

    @ParametricNullness
    public K b(int i) {
        Preconditions.checkElementIndex(i, this.f564c);
        return (K) this.f562a[i];
    }

    public int e(int i) {
        Preconditions.checkElementIndex(i, this.f564c);
        return this.f563b[i];
    }

    public void a(int i, int i2) {
        Preconditions.checkElementIndex(i, this.f564c);
        this.f563b[i] = i2;
    }

    public Multiset.Entry<K> a(int i) {
        Preconditions.checkElementIndex(i, this.f564c);
        return new b(i);
    }

    class b extends Multisets.AbstractEntry<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f566b;

        @ParametricNullness
        final K e;

        b(int i) {
            this.e = (K) amt.this.f562a[i];
            this.f566b = i;
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return this.e;
        }

        void d() {
            int i = this.f566b;
            if (i == -1 || i >= amt.this.a() || !Objects.equal(this.e, amt.this.f562a[this.f566b])) {
                this.f566b = amt.this.a(this.e);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            d();
            if (this.f566b == -1) {
                return 0;
            }
            return amt.this.f563b[this.f566b];
        }
    }

    public void c(int i) {
        if (i > this.d.length) {
            h(i);
        }
        if (i >= this.g) {
            k(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public int d(@ParametricNullness K k, int i) {
        ale.d(i, "count");
        long[] jArr = this.d;
        Object[] objArr = this.f562a;
        int[] iArr = this.f563b;
        int iC = aly.c(k);
        int iE = e() & iC;
        int i2 = this.f564c;
        int[] iArr2 = this.i;
        int i3 = iArr2[iE];
        if (i3 == -1) {
            iArr2[iE] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (b(j) == iC && Objects.equal(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int iD = d(j);
                if (iD == -1) {
                    jArr[i3] = a(j, i2);
                    break;
                }
                i3 = iD;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i5 = i2 + 1;
        o(i5);
        a(i2, k, i, iC);
        this.f564c = i5;
        if (i2 >= this.g) {
            k(this.i.length * 2);
        }
        this.e++;
        return 0;
    }

    void a(int i, @ParametricNullness K k, int i2, int i3) {
        this.d[i] = (((long) i3) << 32) | Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        this.f562a[i] = k;
        this.f563b[i] = i2;
    }

    private void o(int i) {
        int length = this.d.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                h(iMax);
            }
        }
    }

    void h(int i) {
        this.f562a = Arrays.copyOf(this.f562a, i);
        this.f563b = Arrays.copyOf(this.f563b, i);
        long[] jArr = this.d;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.d = jArrCopyOf;
    }

    private void k(int i) {
        if (this.i.length >= 1073741824) {
            this.g = Integer.MAX_VALUE;
            return;
        }
        int i2 = (int) (i * this.f);
        int[] iArrM = m(i);
        long[] jArr = this.d;
        int length = iArrM.length;
        for (int i3 = 0; i3 < this.f564c; i3++) {
            int iB = b(jArr[i3]);
            int i4 = (length - 1) & iB;
            int i5 = iArrM[i4];
            iArrM[i4] = i3;
            jArr[i3] = (((long) iB) << 32) | (((long) i5) & Mp4Utils.UNSIGNED_INT_MAX_VALUE);
        }
        this.g = i2 + 1;
        this.i = iArrM;
    }

    public int a(@CheckForNull Object obj) {
        int iC = aly.c(obj);
        int iD = this.i[e() & iC];
        while (iD != -1) {
            long j = this.d[iD];
            if (b(j) == iC && Objects.equal(obj, this.f562a[iD])) {
                return iD;
            }
            iD = d(j);
        }
        return -1;
    }

    public int b(@CheckForNull Object obj) {
        int iA = a(obj);
        if (iA == -1) {
            return 0;
        }
        return this.f563b[iA];
    }

    public int c(@CheckForNull Object obj) {
        return c(obj, aly.c(obj));
    }

    private int c(@CheckForNull Object obj, int i) {
        int iE = e() & i;
        int i2 = this.i[iE];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (b(this.d[i2]) == i && Objects.equal(obj, this.f562a[i2])) {
                int i4 = this.f563b[i2];
                if (i3 == -1) {
                    this.i[iE] = d(this.d[i2]);
                } else {
                    long[] jArr = this.d;
                    jArr[i3] = a(jArr[i3], d(jArr[i2]));
                }
                i(i2);
                this.f564c--;
                this.e++;
                return i4;
            }
            int iD = d(this.d[i2]);
            if (iD == -1) {
                return 0;
            }
            i3 = i2;
            i2 = iD;
        }
    }

    public int j(int i) {
        return c(this.f562a[i], b(this.d[i]));
    }

    void i(int i) {
        int iA = a() - 1;
        if (i < iA) {
            Object[] objArr = this.f562a;
            objArr[i] = objArr[iA];
            int[] iArr = this.f563b;
            iArr[i] = iArr[iA];
            objArr[iA] = null;
            iArr[iA] = 0;
            long[] jArr = this.d;
            long j = jArr[iA];
            jArr[i] = j;
            jArr[iA] = -1;
            int iB = b(j) & e();
            int[] iArr2 = this.i;
            int i2 = iArr2[iB];
            if (i2 == iA) {
                iArr2[iB] = i;
                return;
            }
            while (true) {
                long j2 = this.d[i2];
                int iD = d(j2);
                if (iD == iA) {
                    this.d[i2] = a(j2, i);
                    return;
                }
                i2 = iD;
            }
        } else {
            this.f562a[i] = null;
            this.f563b[i] = 0;
            this.d[i] = -1;
        }
    }

    public void b() {
        this.e++;
        Arrays.fill(this.f562a, 0, this.f564c, (Object) null);
        Arrays.fill(this.f563b, 0, this.f564c, 0);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.d, -1L);
        this.f564c = 0;
    }
}
