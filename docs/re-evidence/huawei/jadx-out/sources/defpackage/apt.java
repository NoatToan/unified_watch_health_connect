package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apt {
    public static int a(byte b2) {
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(byte[] bArr, byte b2, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(byte[] bArr, byte b2, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (bArr[i3] == b2) {
                return i3;
            }
        }
        return -1;
    }

    public static byte[] a(Collection<? extends Number> collection) {
        if (collection instanceof e) {
            return ((e) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((Number) Preconditions.checkNotNull(array[i])).byteValue();
        }
        return bArr;
    }

    static class e extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f667a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f668c;
        final byte[] e;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        e(byte[] bArr, int i, int i2) {
            this.e = bArr;
            this.f668c = i;
            this.f667a = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f667a - this.f668c;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Byte get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Byte.valueOf(this.e[this.f668c + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Byte) && apt.c(this.e, ((Byte) obj).byteValue(), this.f668c, this.f667a) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iC;
            if (!(obj instanceof Byte) || (iC = apt.c(this.e, ((Byte) obj).byteValue(), this.f668c, this.f667a)) < 0) {
                return -1;
            }
            return iC - this.f668c;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iA;
            if (!(obj instanceof Byte) || (iA = apt.a(this.e, ((Byte) obj).byteValue(), this.f668c, this.f667a)) < 0) {
                return -1;
            }
            return iA - this.f668c;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Byte set(int i, Byte b2) {
            Preconditions.checkElementIndex(i, size());
            byte[] bArr = this.e;
            int i2 = this.f668c + i;
            byte b3 = bArr[i2];
            bArr[i2] = ((Byte) Preconditions.checkNotNull(b2)).byteValue();
            return Byte.valueOf(b3);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.e;
            int i3 = this.f668c;
            return new e(bArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                int size = size();
                if (eVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.e[this.f668c + i] != eVar.e[eVar.f668c + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iA = 1;
            for (int i = this.f668c; i < this.f667a; i++) {
                iA = (iA * 31) + apt.a(this.e[i]);
            }
            return iA;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.e[this.f668c]);
            int i = this.f668c;
            while (true) {
                i++;
                if (i < this.f667a) {
                    sb.append(", ");
                    sb.append((int) this.e[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        byte[] c() {
            return Arrays.copyOfRange(this.e, this.f668c, this.f667a);
        }
    }
}
