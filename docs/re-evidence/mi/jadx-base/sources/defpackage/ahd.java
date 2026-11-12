package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ahd extends chd {

    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f1022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1023b;
        public final int c;

        public a(int[] iArr, int i, int i2) {
            this.f1022a = iArr;
            this.f1023b = i;
            this.c = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && ahd.h(this.f1022a, ((Integer) obj).intValue(), this.f1023b, this.c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            c6i.m(i, size());
            return Integer.valueOf(this.f1022a[this.f1023b + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f1022a[this.f1023b + i] != aVar.f1022a[aVar.f1023b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer set(int i, Integer num) {
            c6i.m(i, size());
            int[] iArr = this.f1022a;
            int i2 = this.f1023b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) c6i.o(num)).intValue();
            return Integer.valueOf(i3);
        }

        public int[] g() {
            return Arrays.copyOfRange(this.f1022a, this.f1023b, this.c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iF = 1;
            for (int i = this.f1023b; i < this.c; i++) {
                iF = (iF * 31) + ahd.f(this.f1022a[i]);
            }
            return iF;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iH;
            if (!(obj instanceof Integer) || (iH = ahd.h(this.f1022a, ((Integer) obj).intValue(), this.f1023b, this.c)) < 0) {
                return -1;
            }
            return iH - this.f1023b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int i;
            if (!(obj instanceof Integer) || (i = ahd.i(this.f1022a, ((Integer) obj).intValue(), this.f1023b, this.c)) < 0) {
                return -1;
            }
            return i - this.f1023b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c - this.f1023b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            c6i.s(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f1022a;
            int i3 = this.f1023b;
            return new a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.f1022a[this.f1023b]);
            int i = this.f1023b;
            while (true) {
                i++;
                if (i >= this.c) {
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f1022a[i]);
            }
        }
    }

    public static int c(long j) {
        int i = (int) j;
        c6i.h(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int e(int i, int i2, int i3) {
        c6i.g(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int f(int i) {
        return i;
    }

    public static int g(int[] iArr, int i) {
        return h(iArr, i, 0, iArr.length);
    }

    public static int h(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int i(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int j(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] k(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) c6i.o(array[i])).intValue();
        }
        return iArr;
    }
}
