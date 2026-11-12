package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
final class w2<T> {
    private final int a;
    private final Comparator<? super T> b;
    private final T[] c;
    private int d;

    @NullableDecl
    private T e;

    private w2(Comparator<? super T> comparator, int i) {
        this.b = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.a = i;
        Preconditions.checkArgument(i >= 0, "k must be nonnegative, was %s", i);
        this.c = (T[]) new Object[i * 2];
        this.d = 0;
        this.e = null;
    }

    public static <T extends Comparable<? super T>> w2<T> a(int i) {
        return b(i, Ordering.natural());
    }

    public static <T> w2<T> b(int i, Comparator<? super T> comparator) {
        return new w2<>(Ordering.from(comparator).reverse(), i);
    }

    public static <T extends Comparable<? super T>> w2<T> c(int i) {
        return d(i, Ordering.natural());
    }

    public static <T> w2<T> d(int i, Comparator<? super T> comparator) {
        return new w2<>(comparator, i);
    }

    private int h(int i, int i2, int i3) {
        T[] tArr = this.c;
        T t = tArr[i3];
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.b.compare(this.c[i], t) < 0) {
                i(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.c;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = t;
        return i4;
    }

    private void i(int i, int i2) {
        T[] tArr = this.c;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    private void k() {
        int i = (this.a * 2) - 1;
        int iLog2 = IntMath.log2(i + 0, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i2 = 0;
        int i3 = 0;
        while (iMax < i) {
            int iH = h(iMax, i, ((iMax + i) + 1) >>> 1);
            int i4 = this.a;
            if (iH <= i4) {
                if (iH >= i4) {
                    break;
                }
                iMax = Math.max(iH, iMax + 1);
                i3 = iH;
            } else {
                i = iH - 1;
            }
            i2++;
            if (i2 >= iLog2) {
                Arrays.sort(this.c, iMax, i, this.b);
                break;
            }
        }
        this.d = this.a;
        this.e = this.c[i3];
        while (true) {
            i3++;
            if (i3 >= this.a) {
                return;
            }
            if (this.b.compare(this.c[i3], this.e) > 0) {
                this.e = this.c[i3];
            }
        }
    }

    public void e(@NullableDecl T t) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        int i2 = this.d;
        if (i2 == 0) {
            this.c[0] = t;
            this.e = t;
            this.d = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.c;
            this.d = i2 + 1;
            tArr[i2] = t;
            if (this.b.compare(t, this.e) > 0) {
                this.e = t;
                return;
            }
            return;
        }
        if (this.b.compare(t, this.e) < 0) {
            T[] tArr2 = this.c;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            tArr2[i3] = t;
            if (i4 == this.a * 2) {
                k();
            }
        }
    }

    public void f(Iterable<? extends T> iterable) {
        g(iterable.iterator());
    }

    public void g(Iterator<? extends T> it2) {
        while (it2.hasNext()) {
            e(it2.next());
        }
    }

    public List<T> j() {
        Arrays.sort(this.c, 0, this.d, this.b);
        int i = this.d;
        int i2 = this.a;
        if (i > i2) {
            T[] tArr = this.c;
            Arrays.fill(tArr, i2, tArr.length, (Object) null);
            int i3 = this.a;
            this.d = i3;
            this.e = this.c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.c, this.d)));
    }
}
