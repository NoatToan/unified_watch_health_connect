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
public final class dse {

    public static class a extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f15885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15886b;
        public final int c;

        public a(long[] jArr, int i, int i2) {
            this.f15885a = jArr;
            this.f15886b = i;
            this.c = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && dse.f(this.f15885a, ((Long) obj).longValue(), this.f15886b, this.c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long get(int i) {
            c6i.m(i, size());
            return Long.valueOf(this.f15885a[this.f15886b + i]);
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
                if (this.f15885a[this.f15886b + i] != aVar.f15885a[aVar.f15886b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long set(int i, Long l) {
            c6i.m(i, size());
            long[] jArr = this.f15885a;
            int i2 = this.f15886b;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) c6i.o(l)).longValue();
            return Long.valueOf(j);
        }

        public long[] g() {
            return Arrays.copyOfRange(this.f15885a, this.f15886b, this.c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iE = 1;
            for (int i = this.f15886b; i < this.c; i++) {
                iE = (iE * 31) + dse.e(this.f15885a[i]);
            }
            return iE;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iF;
            if (!(obj instanceof Long) || (iF = dse.f(this.f15885a, ((Long) obj).longValue(), this.f15886b, this.c)) < 0) {
                return -1;
            }
            return iF - this.f15886b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iG;
            if (!(obj instanceof Long) || (iG = dse.g(this.f15885a, ((Long) obj).longValue(), this.f15886b, this.c)) < 0) {
                return -1;
            }
            return iG - this.f15886b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c - this.f15886b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            c6i.s(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.f15885a;
            int i3 = this.f15886b;
            return new a(jArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.f15885a[this.f15886b]);
            int i = this.f15886b;
            while (true) {
                i++;
                if (i >= this.c) {
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f15885a[i]);
            }
        }
    }

    public static int c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static long d(byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9) {
        return ((((long) b3) & 255) << 48) | ((((long) b2) & 255) << 56) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b7) & 255) << 16) | ((((long) b8) & 255) << 8) | (((long) b9) & 255);
    }

    public static int e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int f(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int g(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    public static long h(long... jArr) {
        c6i.d(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long[] i(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) c6i.o(array[i])).longValue();
        }
        return jArr;
    }
}
