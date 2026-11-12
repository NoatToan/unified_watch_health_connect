package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class fe extends pe {
    public static final Map c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f17690b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f17692b;

        public a(byte[] bArr) {
            this.f17691a = wj1.k(bArr);
            this.f17692b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return wj1.a(this.f17692b, ((a) obj).f17692b);
            }
            return false;
        }

        public int hashCode() {
            return this.f17691a;
        }
    }

    public fe(byte[] bArr) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigIntegerShiftLeft = null;
        int i2 = 0;
        long j = 0;
        while (i2 != bArr.length) {
            byte b2 = bArr[i2];
            if (j <= 72057594037927808L) {
                i = i2;
                long j2 = j + ((long) (b2 & 127));
                if ((b2 & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                i = i2;
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(b2 & 127));
                if ((b2 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
            i2 = i + 1;
        }
        this.f17689a = stringBuffer.toString();
        this.f17690b = wj1.d(bArr);
    }

    public static boolean A(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2') {
            return false;
        }
        return z(str, 2);
    }

    public static fe r(byte[] bArr) {
        a aVar = new a(bArr);
        Map map = c;
        synchronized (map) {
            try {
                fe feVar = (fe) map.get(aVar);
                return feVar != null ? feVar : new fe(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static fe v(ef efVar, boolean z) {
        pe peVarO = efVar.o();
        return (z || (peVarO instanceof fe)) ? w(peVarO) : r(ge.q(efVar.o()).r());
    }

    public static fe w(Object obj) {
        if (obj == null || (obj instanceof fe)) {
            return (fe) obj;
        }
        if (obj instanceof gd) {
            gd gdVar = (gd) obj;
            if (gdVar.toASN1Primitive() instanceof fe) {
                return (fe) gdVar.toASN1Primitive();
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (fe) pe.j((byte[]) obj);
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
        }
    }

    public static boolean z(String str, int i) {
        boolean z;
        char cCharAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                cCharAt = str.charAt(length);
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                z = true;
            }
            if (cCharAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    public final void B(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public final void C(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar == this) {
            return true;
        }
        if (peVar instanceof fe) {
            return this.f17689a.equals(((fe) peVar).f17689a);
        }
        return false;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        byte[] bArrT = t();
        oeVar.c(6);
        oeVar.i(bArrT.length);
        oeVar.d(bArrT);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return this.f17689a.hashCode();
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        int length = t().length;
        return zio.a(length) + 1 + length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public fe o(String str) {
        return new fe(this, str);
    }

    public final void q(ByteArrayOutputStream byteArrayOutputStream) {
        v2h v2hVar = new v2h(this.f17689a);
        int i = Integer.parseInt(v2hVar.b()) * 40;
        String strB = v2hVar.b();
        if (strB.length() <= 18) {
            B(byteArrayOutputStream, ((long) i) + Long.parseLong(strB));
        } else {
            C(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i)));
        }
        while (v2hVar.a()) {
            String strB2 = v2hVar.b();
            if (strB2.length() <= 18) {
                B(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                C(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
    }

    public final synchronized byte[] t() {
        try {
            if (this.f17690b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                q(byteArrayOutputStream);
                this.f17690b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17690b;
    }

    public String toString() {
        return u();
    }

    public String u() {
        return this.f17689a;
    }

    public fe x() {
        Map map = c;
        synchronized (map) {
            try {
                a aVar = new a(t());
                fe feVar = (fe) map.get(aVar);
                if (feVar != null) {
                    return feVar;
                }
                map.put(aVar, this);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public fe(String str) {
        if (str != null) {
            if (A(str)) {
                this.f17689a = str;
                return;
            }
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    public fe(fe feVar, String str) {
        if (z(str, 0)) {
            this.f17689a = feVar.u() + "." + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }
}
