package com.google.common.primitives;

import b71.i;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Chars {
    public static final int BYTES = 2;

    public enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Character.compare(cArr[i14], cArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return cArr.length - cArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    private Chars() {
    }

    public static List<Character> asList(char... cArr) {
        return cArr.length == 0 ? Collections.EMPTY_LIST : new CharArrayAsList(cArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    public static char checkedCast(long j8) {
        char c14 = (char) j8;
        Preconditions.checkArgument(((long) c14) == j8, "Out of range: %s", j8);
        return c14;
    }

    @InlineMe(replacement = "Character.compare(a, b)")
    public static int compare(char c14, char c15) {
        return Character.compare(c14, c15);
    }

    public static char[] concat(char[]... cArr) {
        long length = 0;
        for (char[] cArr2 : cArr) {
            length += (long) cArr2.length;
        }
        char[] cArr3 = new char[checkNoOverflow(length)];
        int length2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, length2, cArr4.length);
            length2 += cArr4.length;
        }
        return cArr3;
    }

    public static char constrainToRange(char c14, char c15, char c16) {
        Preconditions.checkArgument(c15 <= c16, "min (%s) must be less than or equal to max (%s)", c15, c16);
        if (c14 < c15) {
            return c15;
        }
        return c14 < c16 ? c14 : c16;
    }

    public static boolean contains(char[] cArr, char c14) {
        for (char c15 : cArr) {
            if (c15 == c14) {
                return true;
            }
        }
        return false;
    }

    public static char[] ensureCapacity(char[] cArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return cArr.length < i14 ? Arrays.copyOf(cArr, i14 + i15) : cArr;
    }

    @GwtIncompatible
    public static char fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static char fromBytes(byte b14, byte b15) {
        return (char) ((b14 << 8) | (b15 & UnsignedBytes.MAX_VALUE));
    }

    public static int hashCode(char c14) {
        return c14;
    }

    public static int indexOf(char[] cArr, char[] cArr2) {
        Preconditions.checkNotNull(cArr, "array");
        Preconditions.checkNotNull(cArr2, "target");
        if (cArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (cArr.length - cArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < cArr2.length; i15++) {
                if (cArr[i14 + i15] != cArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    public static String join(String str, char... cArr) {
        Preconditions.checkNotNull(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(i.b(length, 1, str.length(), length));
        sb3.append(cArr[0]);
        for (int i14 = 1; i14 < length; i14++) {
            sb3.append(str);
            sb3.append(cArr[i14]);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(char[] cArr, char c14, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (cArr[i16] == c14) {
                return i16;
            }
        }
        return -1;
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char max(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c14 = cArr[0];
        for (int i14 = 1; i14 < cArr.length; i14++) {
            char c15 = cArr[i14];
            if (c15 > c14) {
                c14 = c15;
            }
        }
        return c14;
    }

    public static char min(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c14 = cArr[0];
        for (int i14 = 1; i14 < cArr.length; i14++) {
            char c15 = cArr[i14];
            if (c15 < c14) {
                c14 = c15;
            }
        }
        return c14;
    }

    public static void reverse(char[] cArr, int i14, int i15) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i14, i15, cArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            char c14 = cArr[i14];
            cArr[i14] = cArr[i16];
            cArr[i16] = c14;
            i14++;
        }
    }

    public static void rotate(char[] cArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i15, i16, cArr.length);
        if (cArr.length <= 1) {
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
        reverse(cArr, i15, i19);
        reverse(cArr, i19, i16);
        reverse(cArr, i15, i16);
    }

    public static char saturatedCast(long j8) {
        if (j8 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (j8 < 0) {
            return (char) 0;
        }
        return (char) j8;
    }

    public static void sortDescending(char[] cArr, int i14, int i15) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i14, i15, cArr.length);
        Arrays.sort(cArr, i14, i15);
        reverse(cArr, i14, i15);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).toCharArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i14 = 0; i14 < length; i14++) {
            cArr[i14] = ((Character) Preconditions.checkNotNull(array[i14])).charValue();
        }
        return cArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(char c14) {
        return new byte[]{(byte) (c14 >> '\b'), (byte) c14};
    }

    @GwtCompatible
    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        public CharArrayAsList(char[] cArr, int i14, int i15) {
            this.array = cArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Character) && Chars.indexOf(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != charArrayAsList.array[charArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Character.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Chars.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Character) || (iIndexOf = Chars.indexOf(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Character) || (iLastIndexOf = Chars.lastIndexOf(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i14, Character ch3) {
            Preconditions.checkElementIndex(i14, size());
            char[] cArr = this.array;
            int i15 = this.start;
            char c14 = cArr[i15 + i14];
            cArr[i15 + i14] = ((Character) Preconditions.checkNotNull(ch3)).charValue();
            return Character.valueOf(c14);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.array;
            int i16 = this.start;
            return new CharArrayAsList(cArr, i14 + i16, i16 + i15);
        }

        public char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 3);
            sb3.append('[');
            sb3.append(this.array[this.start]);
            int i14 = this.start;
            while (true) {
                i14++;
                if (i14 >= this.end) {
                    sb3.append(']');
                    return sb3.toString();
                }
                sb3.append(", ");
                sb3.append(this.array[i14]);
            }
        }

        public CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }
    }

    public static int lastIndexOf(char[] cArr, char c14) {
        return lastIndexOf(cArr, c14, 0, cArr.length);
    }

    public static void sortDescending(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        sortDescending(cArr, 0, cArr.length);
    }

    public static void reverse(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        reverse(cArr, 0, cArr.length);
    }

    public static void rotate(char[] cArr, int i14) {
        rotate(cArr, i14, 0, cArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(char[] cArr, char c14, int i14, int i15) {
        while (i14 < i15) {
            if (cArr[i14] == c14) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int indexOf(char[] cArr, char c14) {
        return indexOf(cArr, c14, 0, cArr.length);
    }
}
