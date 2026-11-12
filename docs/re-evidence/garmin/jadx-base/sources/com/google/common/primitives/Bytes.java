package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Bytes {
    private Bytes() {
    }

    public static List<Byte> asList(byte... bArr) {
        return bArr.length == 0 ? Collections.EMPTY_LIST : new ByteArrayAsList(bArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    public static byte[] concat(byte[]... bArr) {
        long length = 0;
        for (byte[] bArr2 : bArr) {
            length += (long) bArr2.length;
        }
        byte[] bArr3 = new byte[checkNoOverflow(length)];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean contains(byte[] bArr, byte b14) {
        for (byte b15 : bArr) {
            if (b15 == b14) {
                return true;
            }
        }
        return false;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return bArr.length < i14 ? Arrays.copyOf(bArr, i14 + i15) : bArr;
    }

    public static int hashCode(byte b14) {
        return b14;
    }

    public static int indexOf(byte[] bArr, byte[] bArr2) {
        Preconditions.checkNotNull(bArr, "array");
        Preconditions.checkNotNull(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (bArr.length - bArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < bArr2.length; i15++) {
                if (bArr[i14 + i15] != bArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] bArr, byte b14, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (bArr[i16] == b14) {
                return i16;
            }
        }
        return -1;
    }

    public static void reverse(byte[] bArr, int i14, int i15) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i14, i15, bArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            byte b14 = bArr[i14];
            bArr[i14] = bArr[i16];
            bArr[i16] = b14;
            i14++;
        }
    }

    public static void rotate(byte[] bArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i15, i16, bArr.length);
        if (bArr.length <= 1) {
            return;
        }
        int i17 = i16 - i15;
        int i18 = (-i14) % i17;
        if (i18 < 0) {
            i18 += i17;
        }
        int i19 = i18 + i15;
        if (i19 == i15) {
            return;
        }
        reverse(bArr, i15, i19);
        reverse(bArr, i19, i16);
        reverse(bArr, i15, i16);
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ByteArrayAsList) {
            return ((ByteArrayAsList) collection).toByteArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            bArr[i14] = ((Number) Preconditions.checkNotNull(array[i14])).byteValue();
        }
        return bArr;
    }

    @GwtCompatible
    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        public ByteArrayAsList(byte[] bArr, int i14, int i15) {
            this.array = bArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Byte) && Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != byteArrayAsList.array[byteArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Byte.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Bytes.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Byte) || (iIndexOf = Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Byte) || (iLastIndexOf = Bytes.lastIndexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i14, Byte b14) {
            Preconditions.checkElementIndex(i14, size());
            byte[] bArr = this.array;
            int i15 = this.start;
            byte b15 = bArr[i15 + i14];
            bArr[i15 + i14] = ((Byte) Preconditions.checkNotNull(b14)).byteValue();
            return Byte.valueOf(b15);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.array;
            int i16 = this.start;
            return new ByteArrayAsList(bArr, i14 + i16, i16 + i15);
        }

        public byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 5);
            sb3.append('[');
            sb3.append((int) this.array[this.start]);
            int i14 = this.start;
            while (true) {
                i14++;
                if (i14 >= this.end) {
                    sb3.append(']');
                    return sb3.toString();
                }
                sb3.append(", ");
                sb3.append((int) this.array[i14]);
            }
        }

        public ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }
    }

    public static int lastIndexOf(byte[] bArr, byte b14) {
        return lastIndexOf(bArr, b14, 0, bArr.length);
    }

    public static void reverse(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        reverse(bArr, 0, bArr.length);
    }

    public static void rotate(byte[] bArr, int i14) {
        rotate(bArr, i14, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] bArr, byte b14, int i14, int i15) {
        while (i14 < i15) {
            if (bArr[i14] == b14) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int indexOf(byte[] bArr, byte b14) {
        return indexOf(bArr, b14, 0, bArr.length);
    }
}
