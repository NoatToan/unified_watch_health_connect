package androidx.health.platform.client.proto;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f7657b = new h(l0.f7709b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7658c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7659a = 0;

    public class a implements Comparator<i> {
        @Override // java.util.Comparator
        public final int compare(i iVar, i iVar2) {
            i iVar3 = iVar;
            i iVar4 = iVar2;
            iVar3.getClass();
            androidx.health.platform.client.proto.h hVar = new androidx.health.platform.client.proto.h(iVar3);
            iVar4.getClass();
            androidx.health.platform.client.proto.h hVar2 = new androidx.health.platform.client.proto.h(iVar4);
            while (hVar.hasNext() && hVar2.hasNext()) {
                int iCompareTo = Integer.valueOf(hVar.nextByte() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(hVar2.nextByte() & UnsignedBytes.MAX_VALUE));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(iVar3.size()).compareTo(Integer.valueOf(iVar4.size()));
        }
    }

    public static abstract class b implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            return Byte.valueOf(((androidx.health.platform.client.proto.h) this).nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7661f;

        public d(byte[] bArr, int i14, int i15) {
            super(bArr);
            i.b(i14, i14 + i15, bArr.length);
            this.f7660e = i14;
            this.f7661f = i15;
        }

        @Override // androidx.health.platform.client.proto.i.h, androidx.health.platform.client.proto.i
        public final byte a(int i14) {
            int i15 = this.f7661f;
            if (((i15 - (i14 + 1)) | i14) >= 0) {
                return this.f7664d[this.f7660e + i14];
            }
            if (i14 < 0) {
                throw new ArrayIndexOutOfBoundsException(am.j.h(i14, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(tn.k.e(i14, i15, "Index > length: ", ", "));
        }

        @Override // androidx.health.platform.client.proto.i.h, androidx.health.platform.client.proto.i
        public final byte d(int i14) {
            return this.f7664d[this.f7660e + i14];
        }

        @Override // androidx.health.platform.client.proto.i.h
        public final int i() {
            return this.f7660e;
        }

        @Override // androidx.health.platform.client.proto.i.h, androidx.health.platform.client.proto.i
        public final int size() {
            return this.f7661f;
        }
    }

    public interface e {
        byte[] copyFrom(byte[] bArr, int i14, int i15);
    }

    public static class h extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f7664d;

        public h(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f7664d = bArr;
        }

        @Override // androidx.health.platform.client.proto.i
        public byte a(int i14) {
            return this.f7664d[i14];
        }

        @Override // androidx.health.platform.client.proto.i
        public byte d(int i14) {
            return this.f7664d[i14];
        }

        @Override // androidx.health.platform.client.proto.i
        public final j.b e() {
            int i14 = i();
            int size = size();
            j.b bVar = new j.b(this.f7664d, i14, size, true);
            try {
                bVar.g(size);
                return bVar;
            } catch (InvalidProtocolBufferException e4) {
                yc.l2.t(e4);
                return null;
            }
        }

        @Override // androidx.health.platform.client.proto.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof h)) {
                return obj.equals(this);
            }
            h hVar = (h) obj;
            int i14 = this.f7659a;
            int i15 = hVar.f7659a;
            if (i14 != 0 && i15 != 0 && i14 != i15) {
                return false;
            }
            int size = size();
            if (size > hVar.size()) {
                com.google.firebase.messaging.l.e(size, size());
                return false;
            }
            if (size > hVar.size()) {
                yc.l2.r(hVar.size(), b71.i.i(size, "Ran off end of other: 0, ", ", "));
                return false;
            }
            byte[] bArr = hVar.f7664d;
            int i16 = i() + size;
            int i17 = i();
            int i18 = hVar.i();
            while (i17 < i16) {
                if (this.f7664d[i17] != bArr[i18]) {
                    return false;
                }
                i17++;
                i18++;
            }
            return true;
        }

        @Override // androidx.health.platform.client.proto.i
        public final int f(int i14, int i15) {
            int i16 = i();
            Charset charset = l0.f7708a;
            for (int i17 = i16; i17 < i16 + i15; i17++) {
                i14 = (i14 * 31) + this.f7664d[i17];
            }
            return i14;
        }

        @Override // androidx.health.platform.client.proto.i
        public final h g(int i14) {
            int iB = i.b(0, i14, size());
            return iB == 0 ? i.f7657b : new d(this.f7664d, i(), iB);
        }

        @Override // androidx.health.platform.client.proto.i
        public final void h(CodedOutputStream.b bVar) {
            bVar.F(this.f7664d, i(), size());
        }

        public int i() {
            return 0;
        }

        @Override // androidx.health.platform.client.proto.i
        public int size() {
            return this.f7664d.length;
        }
    }

    static {
        androidx.health.platform.client.proto.h hVar = null;
        f7658c = androidx.health.platform.client.proto.d.a() ? new C0104i(hVar) : new c(hVar);
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

    public static h c(int i14, int i15, byte[] bArr) {
        b(i14, i14 + i15, bArr.length);
        return new h(f7658c.copyFrom(bArr, i14, i15));
    }

    public abstract byte a(int i14);

    public abstract byte d(int i14);

    public abstract j.b e();

    public abstract boolean equals(Object obj);

    public abstract int f(int i14, int i15);

    public abstract h g(int i14);

    public abstract void h(CodedOutputStream.b bVar);

    public final int hashCode() {
        int iF = this.f7659a;
        if (iF == 0) {
            int size = size();
            iF = f(size, size);
            if (iF == 0) {
                iF = 1;
            }
            this.f7659a = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new androidx.health.platform.client.proto.h(this);
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return am.j.o(size() <= 50 ? s2.a(this) : s2.a(g(47)).concat("..."), "\">", androidx.core.view.j.k(size(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    public static final class c implements e {
        private c() {
        }

        @Override // androidx.health.platform.client.proto.i.e
        public final byte[] copyFrom(byte[] bArr, int i14, int i15) {
            return Arrays.copyOfRange(bArr, i14, i15 + i14);
        }

        public /* synthetic */ c(androidx.health.platform.client.proto.h hVar) {
            this();
        }
    }

    public static abstract class g extends i {
        public /* synthetic */ g(androidx.health.platform.client.proto.h hVar) {
            this();
        }

        @Override // androidx.health.platform.client.proto.i, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new androidx.health.platform.client.proto.h(this);
        }

        private g() {
        }
    }

    /* JADX INFO: renamed from: androidx.health.platform.client.proto.i$i, reason: collision with other inner class name */
    public static final class C0104i implements e {
        private C0104i() {
        }

        @Override // androidx.health.platform.client.proto.i.e
        public final byte[] copyFrom(byte[] bArr, int i14, int i15) {
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            return bArr2;
        }

        public /* synthetic */ C0104i(androidx.health.platform.client.proto.h hVar) {
            this();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CodedOutputStream.b f7662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f7663b;

        private f(int i14) {
            byte[] bArr = new byte[i14];
            this.f7663b = bArr;
            Logger logger = CodedOutputStream.f7529b;
            this.f7662a = new CodedOutputStream.b(bArr, 0, i14);
        }

        public /* synthetic */ f(int i14, androidx.health.platform.client.proto.h hVar) {
            this(i14);
        }
    }
}
