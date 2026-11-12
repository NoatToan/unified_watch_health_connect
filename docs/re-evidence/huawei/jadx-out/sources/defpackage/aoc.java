package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aoc<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f619c;
    private int d;

    @CheckForNull
    private T e;

    public static <T> aoc<T> a(int i, Comparator<? super T> comparator) {
        return new aoc<>(comparator, i);
    }

    private aoc(Comparator<? super T> comparator, int i) {
        this.f618b = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f619c = i;
        Preconditions.checkArgument(i >= 0, "k (%s) must be >= 0", i);
        Preconditions.checkArgument(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f617a = (T[]) new Object[apn.a(i, 2)];
        this.d = 0;
        this.e = null;
    }

    public void d(@ParametricNullness T t) {
        int i = this.f619c;
        if (i == 0) {
            return;
        }
        int i2 = this.d;
        if (i2 == 0) {
            this.f617a[0] = t;
            this.e = t;
            this.d = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.f617a;
            this.d = i2 + 1;
            tArr[i2] = t;
            if (this.f618b.compare(t, (Object) ams.e(this.e)) > 0) {
                this.e = t;
                return;
            }
            return;
        }
        if (this.f618b.compare(t, (Object) ams.e(this.e)) < 0) {
            T[] tArr2 = this.f617a;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            tArr2[i3] = t;
            if (i4 == this.f619c * 2) {
                c();
            }
        }
    }

    private void c() {
        int i = (this.f619c * 2) - 1;
        int iB = apn.b(i, RoundingMode.CEILING);
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        while (iMax < i) {
            int iB2 = b(iMax, i, ((iMax + i) + 1) >>> 1);
            int i4 = this.f619c;
            if (iB2 <= i4) {
                if (iB2 >= i4) {
                    break;
                }
                iMax = Math.max(iB2, iMax + 1);
                i2 = iB2;
            } else {
                i = iB2 - 1;
            }
            i3++;
            if (i3 >= iB * 3) {
                Arrays.sort(this.f617a, iMax, i + 1, this.f618b);
                break;
            }
        }
        this.d = this.f619c;
        this.e = (T) ams.e(this.f617a[i2]);
        while (true) {
            i2++;
            if (i2 >= this.f619c) {
                return;
            }
            if (this.f618b.compare((Object) ams.e(this.f617a[i2]), (Object) ams.e(this.e)) > 0) {
                this.e = this.f617a[i2];
            }
        }
    }

    private int b(int i, int i2, int i3) {
        Object objE = ams.e(this.f617a[i3]);
        T[] tArr = this.f617a;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f618b.compare((Object) ams.e(this.f617a[i]), objE) < 0) {
                d(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f617a;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = objE;
        return i4;
    }

    private void d(int i, int i2) {
        T[] tArr = this.f617a;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    public void e(Iterator<? extends T> it) {
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public List<T> a() {
        T[] tArr = this.f617a;
        Arrays.sort(tArr, 0, this.d, this.f618b);
        int i = this.d;
        int i2 = this.f619c;
        if (i > i2) {
            T[] tArr2 = this.f617a;
            Arrays.fill(tArr2, i2, tArr2.length, (Object) null);
            int i3 = this.f619c;
            this.d = i3;
            this.e = this.f617a[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.d)));
    }
}
