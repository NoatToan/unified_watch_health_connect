package com.google.common.primitives;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Ints extends IntsMethodsForWeb {
    public static int a(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << Ascii.CAN) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int e(int i) {
        return i;
    }

    public static int b(long j) {
        int i = (int) j;
        Preconditions.checkArgument(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int c(int[] iArr, int i) {
        return e(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int e(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int d(int i, int i2, int i3) {
        Preconditions.checkArgument(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int c(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return a(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* JADX INFO: loaded from: classes21.dex */
    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iD = Ints.d(iArr[i], iArr2[i]);
                if (iD != 0) {
                    return iD;
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static int[] b(Collection<? extends Number> collection) {
        if (collection instanceof b) {
            return ((b) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }

    public static List<Integer> a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new b(iArr);
    }

    static class b extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int[] f4625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4626c;
        final int e;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        b(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        b(int[] iArr, int i, int i2) {
            this.f4625b = iArr;
            this.f4626c = i;
            this.e = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e - this.f4626c;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Integer.valueOf(this.f4625b[this.f4626c + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Integer) && Ints.e(this.f4625b, ((Integer) obj).intValue(), this.f4626c, this.e) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iE;
            if (!(obj instanceof Integer) || (iE = Ints.e(this.f4625b, ((Integer) obj).intValue(), this.f4626c, this.e)) < 0) {
                return -1;
            }
            return iE - this.f4626c;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iB;
            if (!(obj instanceof Integer) || (iB = Ints.b(this.f4625b, ((Integer) obj).intValue(), this.f4626c, this.e)) < 0) {
                return -1;
            }
            return iB - this.f4626c;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer set(int i, Integer num) {
            Preconditions.checkElementIndex(i, size());
            int[] iArr = this.f4625b;
            int i2 = this.f4626c + i;
            int i3 = iArr[i2];
            iArr[i2] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f4625b;
            int i3 = this.f4626c;
            return new b(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int size = size();
                if (bVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f4625b[this.f4626c + i] != bVar.f4625b[bVar.f4626c + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iE = 1;
            for (int i = this.f4626c; i < this.e; i++) {
                iE = (iE * 31) + Ints.e(this.f4625b[i]);
            }
            return iE;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f4625b[this.f4626c]);
            int i = this.f4626c;
            while (true) {
                i++;
                if (i < this.e) {
                    sb.append(", ");
                    sb.append(this.f4625b[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        int[] a() {
            return Arrays.copyOfRange(this.f4625b, this.f4626c, this.e);
        }
    }

    @CheckForNull
    public static Integer e(String str) {
        return c(str, 10);
    }

    @CheckForNull
    public static Integer c(String str, int i) {
        Long lB = Longs.b(str, i);
        if (lB == null || lB.longValue() != lB.intValue()) {
            return null;
        }
        return Integer.valueOf(lB.intValue());
    }
}
