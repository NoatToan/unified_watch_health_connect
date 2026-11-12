package androidx.datastore.preferences.protobuf;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0094h f6707b = new C0094h(z.f6937b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6708c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6709a = 0;

    public class a implements Comparator<h> {
        @Override // java.util.Comparator
        public final int compare(h hVar, h hVar2) {
            h hVar3 = hVar;
            h hVar4 = hVar2;
            hVar3.getClass();
            androidx.datastore.preferences.protobuf.g gVar = new androidx.datastore.preferences.protobuf.g(hVar3);
            hVar4.getClass();
            androidx.datastore.preferences.protobuf.g gVar2 = new androidx.datastore.preferences.protobuf.g(hVar4);
            while (gVar.hasNext() && gVar2.hasNext()) {
                int iCompareTo = Integer.valueOf(gVar.nextByte() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(gVar2.nextByte() & UnsignedBytes.MAX_VALUE));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(hVar3.size()).compareTo(Integer.valueOf(hVar4.size()));
        }
    }

    public static abstract class b implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            return Byte.valueOf(((androidx.datastore.preferences.protobuf.g) this).nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d extends C0094h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6711f;

        public d(byte[] bArr, int i14, int i15) {
            super(bArr);
            h.b(i14, i14 + i15, bArr.length);
            this.f6710e = i14;
            this.f6711f = i15;
        }

        @Override // androidx.datastore.preferences.protobuf.h.C0094h, androidx.datastore.preferences.protobuf.h
        public final byte a(int i14) {
            int i15 = this.f6711f;
            if (((i15 - (i14 + 1)) | i14) >= 0) {
                return this.f6714d[this.f6710e + i14];
            }
            if (i14 < 0) {
                throw new ArrayIndexOutOfBoundsException(am.j.h(i14, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(tn.k.e(i14, i15, "Index > length: ", ", "));
        }

        @Override // androidx.datastore.preferences.protobuf.h.C0094h, androidx.datastore.preferences.protobuf.h
        public final void d(int i14, byte[] bArr) {
            System.arraycopy(this.f6714d, this.f6710e, bArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.h.C0094h, androidx.datastore.preferences.protobuf.h
        public final byte e(int i14) {
            return this.f6714d[this.f6710e + i14];
        }

        @Override // androidx.datastore.preferences.protobuf.h.C0094h
        public final int l() {
            return this.f6710e;
        }

        @Override // androidx.datastore.preferences.protobuf.h.C0094h, androidx.datastore.preferences.protobuf.h
        public final int size() {
            return this.f6711f;
        }
    }

    public interface e {
        byte[] copyFrom(byte[] bArr, int i14, int i15);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$h, reason: collision with other inner class name */
    public static class C0094h extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f6714d;

        public C0094h(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f6714d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public byte a(int i14) {
            return this.f6714d[i14];
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void d(int i14, byte[] bArr) {
            System.arraycopy(this.f6714d, 0, bArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public byte e(int i14) {
            return this.f6714d[i14];
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0094h)) {
                return obj.equals(this);
            }
            C0094h c0094h = (C0094h) obj;
            int i14 = this.f6709a;
            int i15 = c0094h.f6709a;
            if (i14 != 0 && i15 != 0 && i14 != i15) {
                return false;
            }
            int size = size();
            if (size > c0094h.size()) {
                com.google.firebase.messaging.l.e(size, size());
                return false;
            }
            if (size > c0094h.size()) {
                l2.r(c0094h.size(), b71.i.i(size, "Ran off end of other: 0, ", ", "));
                return false;
            }
            byte[] bArr = c0094h.f6714d;
            int iL = l() + size;
            int iL2 = l();
            int iL3 = c0094h.l();
            while (iL2 < iL) {
                if (this.f6714d[iL2] != bArr[iL3]) {
                    return false;
                }
                iL2++;
                iL3++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final androidx.datastore.preferences.protobuf.i.b f() {
            return androidx.datastore.preferences.protobuf.i.d(this.f6714d, l(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int g(int i14, int i15) {
            int iL = l();
            Charset charset = z.f6936a;
            for (int i16 = iL; i16 < iL + i15; i16++) {
                i14 = (i14 * 31) + this.f6714d[i16];
            }
            return i14;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final C0094h h(int i14) {
            int iB = h.b(0, i14, size());
            return iB == 0 ? h.f6707b : new d(this.f6714d, l(), iB);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final void i(CodedOutputStream codedOutputStream) {
            codedOutputStream.a(this.f6714d, l(), size());
        }

        public int l() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int size() {
            return this.f6714d.length;
        }
    }

    static {
        androidx.datastore.preferences.protobuf.g gVar = null;
        f6708c = androidx.datastore.preferences.protobuf.d.a() ? new i(gVar) : new c(gVar);
        new a();
    }

    public static int b(int i14, int i15, int i16) {
        int i17 = i15 - i14;
        if ((i14 | i15 | i17 | (i16 - i15)) >= 0) {
            return i17;
        }
        if (i14 < 0) {
            org.apache.commons.lang3.e.v(v.e0.f(i14, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i15 < i14) {
            org.apache.commons.lang3.e.v(tn.k.e(i14, i15, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        org.apache.commons.lang3.e.v(tn.k.e(i15, i16, "End index: ", " >= "));
        return 0;
    }

    public static C0094h c(int i14, int i15, byte[] bArr) {
        b(i14, i14 + i15, bArr.length);
        return new C0094h(f6708c.copyFrom(bArr, i14, i15));
    }

    public abstract byte a(int i14);

    public abstract void d(int i14, byte[] bArr);

    public abstract byte e(int i14);

    public abstract boolean equals(Object obj);

    public abstract androidx.datastore.preferences.protobuf.i.b f();

    public abstract int g(int i14, int i15);

    public abstract C0094h h(int i14);

    public final int hashCode() {
        int iG = this.f6709a;
        if (iG == 0) {
            int size = size();
            iG = g(size, size);
            if (iG == 0) {
                iG = 1;
            }
            this.f6709a = iG;
        }
        return iG;
    }

    public abstract void i(CodedOutputStream codedOutputStream);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new androidx.datastore.preferences.protobuf.g(this);
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return am.j.o(size() <= 50 ? l1.a(this) : l1.a(h(47)).concat("..."), "\">", androidx.core.view.j.k(size(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    public static final class c implements e {
        private c() {
        }

        @Override // androidx.datastore.preferences.protobuf.h.e
        public final byte[] copyFrom(byte[] bArr, int i14, int i15) {
            return Arrays.copyOfRange(bArr, i14, i15 + i14);
        }

        public /* synthetic */ c(androidx.datastore.preferences.protobuf.g gVar) {
            this();
        }
    }

    public static abstract class g extends h {
        public /* synthetic */ g(androidx.datastore.preferences.protobuf.g gVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.h, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new androidx.datastore.preferences.protobuf.g(this);
        }

        private g() {
        }
    }

    public static final class i implements e {
        private i() {
        }

        @Override // androidx.datastore.preferences.protobuf.h.e
        public final byte[] copyFrom(byte[] bArr, int i14, int i15) {
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            return bArr2;
        }

        public /* synthetic */ i(androidx.datastore.preferences.protobuf.g gVar) {
            this();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CodedOutputStream.c f6712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f6713b;

        private f(int i14) {
            byte[] bArr = new byte[i14];
            this.f6713b = bArr;
            Logger logger = CodedOutputStream.f6654b;
            this.f6712a = new CodedOutputStream.c(bArr, 0, i14);
        }

        public /* synthetic */ f(int i14, androidx.datastore.preferences.protobuf.g gVar) {
            this(i14);
        }
    }
}
