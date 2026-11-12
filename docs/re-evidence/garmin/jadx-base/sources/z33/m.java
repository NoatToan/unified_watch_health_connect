package z33;

import com.google.common.base.Ascii;
import j20.x;
import java.io.IOException;
import java.io.OutputStream;
import w52.u0;

/* JADX INFO: loaded from: classes3.dex */
public class m extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f202211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f202212c = 0;

    public class b implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f202214b;

        private b() {
            this.f202213a = 0;
            this.f202214b = m.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202213a < this.f202214b;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // z33.c.a
        public final byte nextByte() {
            try {
                byte[] bArr = m.this.f202211b;
                int i14 = this.f202213a;
                this.f202213a = i14 + 1;
                return bArr[i14];
            } catch (ArrayIndexOutOfBoundsException e4) {
                n23.j.s(e4.getMessage());
                return (byte) 0;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public m(byte[] bArr) {
        this.f202211b = bArr;
    }

    @Override // z33.c
    public void d(byte[] bArr, int i14, int i15, int i16) {
        System.arraycopy(this.f202211b, i14, bArr, i15, i16);
    }

    @Override // z33.c
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || size() != ((c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof m) {
            return q((m) obj, 0, size());
        }
        if (obj instanceof q) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        vb.h.s(am.j.o("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
        return false;
    }

    @Override // z33.c
    public final boolean f() {
        return true;
    }

    @Override // z33.c
    public final boolean g() {
        int iR = r();
        return u0.u(this.f202211b, iR, size() + iR) == 0;
    }

    @Override // z33.c, java.lang.Iterable
    /* JADX INFO: renamed from: h */
    public c.a iterator() {
        return new b();
    }

    public final int hashCode() {
        int iJ = this.f202212c;
        if (iJ == 0) {
            int size = size();
            iJ = j(size, 0, size);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f202212c = iJ;
        }
        return iJ;
    }

    @Override // z33.c
    public final int j(int i14, int i15, int i16) {
        int iR = r() + i15;
        for (int i17 = iR; i17 < iR + i16; i17++) {
            i14 = (i14 * 31) + this.f202211b[i17];
        }
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r9[r0] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r9[r0] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0097, code lost:
    
        if (r9[r8] > (-65)) goto L59;
     */
    @Override // z33.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(int i14, int i15, int i16) {
        byte b14;
        int i17;
        int i18;
        int iR = r() + i15;
        int i19 = i16 + iR;
        byte[] bArr = this.f202211b;
        if (i14 != 0) {
            if (iR >= i19) {
                return i14;
            }
            byte b15 = (byte) i14;
            if (b15 < -32) {
                if (b15 >= -62) {
                    i18 = iR + 1;
                }
                return -1;
            }
            if (b15 < -16) {
                byte b16 = (byte) (~(i14 >> 8));
                if (b16 == 0) {
                    int i24 = iR + 1;
                    byte b17 = bArr[iR];
                    if (i24 >= i19) {
                        return u0.q(b15, b17);
                    }
                    iR = i24;
                    b16 = b17;
                }
                if (b16 <= -65 && ((b15 != -32 || b16 >= -96) && (b15 != -19 || b16 < -96))) {
                    i18 = iR + 1;
                }
            } else {
                byte b18 = (byte) (~(i14 >> 8));
                if (b18 == 0) {
                    i17 = iR + 1;
                    b18 = bArr[iR];
                    if (i17 >= i19) {
                        return u0.q(b15, b18);
                    }
                    b14 = 0;
                } else {
                    b14 = (byte) (i14 >> 16);
                    i17 = iR;
                }
                if (b14 == 0) {
                    int i25 = i17 + 1;
                    byte b19 = bArr[i17];
                    if (i25 >= i19) {
                        if (b15 > -12 || b18 > -65 || b19 > -65) {
                            return -1;
                        }
                        return (b19 << Ascii.DLE) ^ ((b18 << 8) ^ b15);
                    }
                    b14 = b19;
                    i17 = i25;
                }
                if (b18 <= -65) {
                    if ((((b18 + 112) + (b15 << Ascii.FS)) >> 30) == 0 && b14 <= -65) {
                        iR = i17 + 1;
                    }
                }
            }
            return -1;
        }
        return u0.u(bArr, iR, i19);
    }

    @Override // z33.c
    public final int m() {
        return this.f202212c;
    }

    @Override // z33.c
    public final String n() {
        return new String(this.f202211b, r(), size(), "UTF-8");
    }

    @Override // z33.c
    public final void p(OutputStream outputStream, int i14, int i15) throws IOException {
        outputStream.write(this.f202211b, r() + i14, i15);
    }

    public final boolean q(m mVar, int i14, int i15) {
        if (i15 > mVar.size()) {
            int size = size();
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(i15);
            sb3.append(size);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (i14 + i15 > mVar.size()) {
            int size2 = mVar.size();
            StringBuilder sb4 = new StringBuilder(59);
            sb4.append("Ran off end of other: ");
            sb4.append(i14);
            sb4.append(", ");
            sb4.append(i15);
            vb.h.s(x.e(sb4, size2, ", "));
            return false;
        }
        byte[] bArr = mVar.f202211b;
        int iR = r() + i15;
        int iR2 = r();
        int iR3 = mVar.r() + i14;
        while (iR2 < iR) {
            if (this.f202211b[iR2] != bArr[iR3]) {
                return false;
            }
            iR2++;
            iR3++;
        }
        return true;
    }

    public int r() {
        return 0;
    }

    @Override // z33.c
    public int size() {
        return this.f202211b.length;
    }
}
