package z33;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Marker;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Iterable<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f202161a = new m(new byte[0]);

    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    public static c a(Iterator<c> it, int i14) {
        if (i14 == 1) {
            return it.next();
        }
        int i15 = i14 >>> 1;
        return a(it, i15).b(a(it, i14 - i15));
    }

    public static b i() {
        return new b(128);
    }

    public final c b(c cVar) {
        int size = size();
        int size2 = cVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return q.q(this, cVar);
        }
        StringBuilder sb3 = new StringBuilder(53);
        sb3.append("ByteString would be too long: ");
        sb3.append(size);
        sb3.append(Marker.ANY_NON_NULL_MARKER);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public final void c(byte[] bArr, int i14, int i15, int i16) {
        if (i14 < 0) {
            org.apache.commons.lang3.e.v(com.google.android.exoplayer2.v.b(30, i14, "Source offset < 0: "));
            return;
        }
        if (i15 < 0) {
            org.apache.commons.lang3.e.v(com.google.android.exoplayer2.v.b(30, i15, "Target offset < 0: "));
            return;
        }
        if (i16 < 0) {
            org.apache.commons.lang3.e.v(com.google.android.exoplayer2.v.b(23, i16, "Length < 0: "));
            return;
        }
        int i17 = i14 + i16;
        if (i17 > size()) {
            org.apache.commons.lang3.e.v(com.google.android.exoplayer2.v.b(34, i17, "Source end offset < 0: "));
            return;
        }
        int i18 = i15 + i16;
        if (i18 > bArr.length) {
            org.apache.commons.lang3.e.v(com.google.android.exoplayer2.v.b(34, i18, "Target end offset < 0: "));
        } else if (i16 > 0) {
            d(bArr, i14, i15, i16);
        }
    }

    public abstract void d(byte[] bArr, int i14, int i15, int i16);

    public abstract int e();

    public abstract boolean f();

    public abstract boolean g();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract a iterator();

    public abstract int j(int i14, int i15, int i16);

    public abstract int l(int i14, int i15, int i16);

    public abstract int m();

    public abstract String n();

    public final String o() {
        try {
            return n();
        } catch (UnsupportedEncodingException e4) {
            q2.v("UTF-8 not supported?", e4);
            return null;
        }
    }

    public abstract void p(OutputStream outputStream, int i14, int i15);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f202162f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f202163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f202164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f202165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f202166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f202167e;

        public b(int i14) {
            if (i14 < 0) {
                vb.h.s("Buffer size < 0");
                throw null;
            }
            this.f202163a = i14;
            this.f202164b = new ArrayList<>();
            this.f202166d = new byte[i14];
        }

        public final void a(int i14) {
            this.f202164b.add(new m(this.f202166d));
            int length = this.f202165c + this.f202166d.length;
            this.f202165c = length;
            this.f202166d = new byte[Math.max(this.f202163a, Math.max(i14, length >>> 1))];
            this.f202167e = 0;
        }

        public final void c() {
            int i14 = this.f202167e;
            byte[] bArr = this.f202166d;
            int length = bArr.length;
            ArrayList<c> arrayList = this.f202164b;
            if (i14 >= length) {
                arrayList.add(new m(this.f202166d));
                this.f202166d = f202162f;
            } else if (i14 > 0) {
                byte[] bArr2 = new byte[i14];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i14));
                arrayList.add(new m(bArr2));
            }
            this.f202165c += this.f202167e;
            this.f202167e = 0;
        }

        public final synchronized c e() {
            ArrayList<c> arrayList;
            c();
            arrayList = this.f202164b;
            m mVar = c.f202161a;
            if (arrayList == null) {
                ArrayList<c> arrayList2 = new ArrayList<>();
                Iterator<c> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? c.f202161a : c.a(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i14;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i14 = this.f202165c + this.f202167e;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i14));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i14, int i15) {
            try {
                byte[] bArr2 = this.f202166d;
                int length = bArr2.length;
                int i16 = this.f202167e;
                if (i15 <= length - i16) {
                    System.arraycopy(bArr, i14, bArr2, i16, i15);
                    this.f202167e += i15;
                } else {
                    int length2 = bArr2.length - i16;
                    System.arraycopy(bArr, i14, bArr2, i16, length2);
                    int i17 = i15 - length2;
                    a(i17);
                    System.arraycopy(bArr, i14 + length2, this.f202166d, 0, i17);
                    this.f202167e = i17;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i14) {
            try {
                if (this.f202167e == this.f202166d.length) {
                    a(1);
                }
                byte[] bArr = this.f202166d;
                int i15 = this.f202167e;
                this.f202167e = i15 + 1;
                bArr[i15] = (byte) i14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
