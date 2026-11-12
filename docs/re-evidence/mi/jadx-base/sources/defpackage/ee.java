package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public class ee extends re {
    public static final ConcurrentMap<a, ee> c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f16549b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f16551b;

        public a(byte[] bArr) {
            this.f16550a = vj1.q(bArr);
            this.f16551b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return vj1.a(this.f16551b, ((a) obj).f16551b);
            }
            return false;
        }

        public int hashCode() {
            return this.f16550a;
        }
    }

    public ee(ee eeVar, String str) {
        if (!z(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f16548a = eeVar.u() + "." + str;
    }

    public static boolean A(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2') {
            return false;
        }
        return z(str, 2);
    }

    public static ee r(byte[] bArr) {
        ee eeVar = c.get(new a(bArr));
        return eeVar == null ? new ee(bArr) : eeVar;
    }

    public static ee v(ff ffVar, boolean z) {
        re reVarQ = ffVar.q();
        return (z || (reVarQ instanceof ee)) ? w(reVarQ) : r(he.q(reVarQ).r());
    }

    public static ee w(Object obj) {
        if (obj == null || (obj instanceof ee)) {
            return (ee) obj;
        }
        if (obj instanceof hd) {
            hd hdVar = (hd) obj;
            if (hdVar.toASN1Primitive() instanceof ee) {
                return (ee) hdVar.toASN1Primitive();
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ee) re.j((byte[]) obj);
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

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar == this) {
            return true;
        }
        if (reVar instanceof ee) {
            return this.f16548a.equals(((ee) reVar).f16548a);
        }
        return false;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        byte[] bArrT = t();
        keVar.c(6);
        keVar.i(bArrT.length);
        keVar.d(bArrT);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return this.f16548a.hashCode();
    }

    @Override // defpackage.re
    public int i() throws IOException {
        int length = t().length;
        return yio.a(length) + 1 + length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public ee o(String str) {
        return new ee(this, str);
    }

    public final void q(ByteArrayOutputStream byteArrayOutputStream) {
        w2h w2hVar = new w2h(this.f16548a);
        int i = Integer.parseInt(w2hVar.b()) * 40;
        String strB = w2hVar.b();
        if (strB.length() <= 18) {
            B(byteArrayOutputStream, ((long) i) + Long.parseLong(strB));
        } else {
            C(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i)));
        }
        while (w2hVar.a()) {
            String strB2 = w2hVar.b();
            if (strB2.length() <= 18) {
                B(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                C(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
    }

    public final synchronized byte[] t() {
        try {
            if (this.f16549b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                q(byteArrayOutputStream);
                this.f16549b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16549b;
    }

    public String toString() {
        return u();
    }

    public String u() {
        return this.f16548a;
    }

    public ee x() {
        a aVar = new a(t());
        ConcurrentMap<a, ee> concurrentMap = c;
        ee eeVar = concurrentMap.get(aVar);
        if (eeVar != null) {
            return eeVar;
        }
        ee eeVarPutIfAbsent = concurrentMap.putIfAbsent(aVar, this);
        return eeVarPutIfAbsent == null ? this : eeVarPutIfAbsent;
    }

    public ee(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        if (A(str)) {
            this.f16548a = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    public ee(byte[] bArr) {
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
        this.f16548a = stringBuffer.toString();
        this.f16549b = vj1.e(bArr);
    }
}
