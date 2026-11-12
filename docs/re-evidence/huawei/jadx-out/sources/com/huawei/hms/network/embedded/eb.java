package com.huawei.hms.network.embedded;

import com.huawei.operation.utils.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes34.dex */
public class eb implements Serializable, Comparable<eb> {
    public static final long e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f14739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f14740c;
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final eb f = e(new byte[0]);

    public String toString() {
        String strReplace;
        StringBuilder sb;
        String str;
        if (this.f14738a.length == 0) {
            return "[size=0]";
        }
        String strN = n();
        int iA = a(strN, 64);
        if (iA != -1) {
            strReplace = strN.substring(0, iA).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iA < strN.length()) {
                sb = new StringBuilder("[size=");
                sb.append(this.f14738a.length);
                sb.append(" text=");
                sb.append(strReplace);
                str = "…]";
            } else {
                sb = new StringBuilder("[text=");
                sb.append(strReplace);
                str = "]";
            }
        } else if (this.f14738a.length <= 64) {
            sb = new StringBuilder("[hex=");
            strReplace = d();
            sb.append(strReplace);
            str = "]";
        } else {
            sb = new StringBuilder("[size=");
            sb.append(this.f14738a.length);
            sb.append(" hex=");
            strReplace = a(0, 64).d();
            sb.append(strReplace);
            str = "…]";
        }
        sb.append(str);
        return sb.toString();
    }

    public String n() {
        String str = this.f14740c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f14738a, cc.f14686a);
        this.f14740c = str2;
        return str2;
    }

    public byte[] m() {
        return (byte[]) this.f14738a.clone();
    }

    public eb l() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f14738a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 97 && b2 <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 97 && b3 <= 122) {
                        bArr2[i2] = (byte) (b3 - 32);
                    }
                }
                return new eb(bArr2);
            }
            i++;
        }
    }

    public eb k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f14738a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new eb(bArr2);
            }
            i++;
        }
    }

    public int j() {
        return this.f14738a.length;
    }

    public eb i() {
        return c("SHA-512");
    }

    public int hashCode() {
        int i = this.f14739b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f14738a);
        this.f14739b = iHashCode;
        return iHashCode;
    }

    public final boolean h(eb ebVar) {
        return a(0, ebVar, 0, ebVar.j());
    }

    public eb h() {
        return c("SHA-256");
    }

    public eb g() {
        return c("SHA-1");
    }

    public final int g(eb ebVar) {
        return b(ebVar.e(), j());
    }

    public eb f() {
        return c("MD5");
    }

    public final int f(eb ebVar) {
        return a(ebVar.e(), 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eb) {
            eb ebVar = (eb) obj;
            int iJ = ebVar.j();
            byte[] bArr = this.f14738a;
            if (iJ == bArr.length && ebVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] e() {
        return this.f14738a;
    }

    public eb e(eb ebVar) {
        return a("HmacSHA512", ebVar);
    }

    public final boolean d(byte[] bArr) {
        return a(0, bArr, 0, bArr.length);
    }

    public String d() {
        byte[] bArr = this.f14738a;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            char[] cArr2 = d;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            cArr[i + 1] = cArr2[b2 & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }

    public eb d(eb ebVar) {
        return a("HmacSHA256", ebVar);
    }

    public String c() {
        return ab.b(this.f14738a);
    }

    public eb c(eb ebVar) {
        return a("HmacSHA1", ebVar);
    }

    public final int c(byte[] bArr) {
        return b(bArr, j());
    }

    public final boolean b(eb ebVar) {
        return a(j() - ebVar.j(), ebVar, 0, ebVar.j());
    }

    public String b() {
        return ab.a(this.f14738a);
    }

    public eb b(int i) {
        return a(i, this.f14738a.length);
    }

    public int b(byte[] bArr, int i) {
        for (int iMin = Math.min(i, this.f14738a.length - bArr.length); iMin >= 0; iMin--) {
            if (cc.a(this.f14738a, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final int b(byte[] bArr) {
        return a(bArr, 0);
    }

    public final int b(eb ebVar, int i) {
        return b(ebVar.e(), i);
    }

    public final boolean a(byte[] bArr) {
        return a(j() - bArr.length, bArr, 0, bArr.length);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f14738a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && cc.a(bArr2, i, bArr, i2, i3);
    }

    public boolean a(int i, eb ebVar, int i2, int i3) {
        return ebVar.a(i2, this.f14738a, i, i3);
    }

    public void a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        outputStream.write(this.f14738a);
    }

    public void a(bb bbVar) {
        byte[] bArr = this.f14738a;
        bbVar.write(bArr, 0, bArr.length);
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(this.f14738a).asReadOnlyBuffer();
    }

    public String a(Charset charset) {
        if (charset != null) {
            return new String(this.f14738a, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public eb a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f14738a;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f14738a.length + Constants.RIGHT_BRACKET_ONLY);
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new eb(bArr2);
    }

    public int a(byte[] bArr, int i) {
        int length = this.f14738a.length;
        int length2 = bArr.length;
        for (int iMax = Math.max(i, 0); iMax <= length - length2; iMax++) {
            if (cc.a(this.f14738a, iMax, bArr, 0, bArr.length)) {
                return iMax;
            }
        }
        return -1;
    }

    public final int a(eb ebVar, int i) {
        return a(ebVar.e(), i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(eb ebVar) {
        int iJ = j();
        int iJ2 = ebVar.j();
        int iMin = Math.min(iJ, iJ2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = ebVar.a(i) & 255;
            if (iA != iA2) {
                return iA < iA2 ? -1 : 1;
            }
        }
        if (iJ == iJ2) {
            return 0;
        }
        return iJ < iJ2 ? -1 : 1;
    }

    public byte a(int i) {
        return this.f14738a[i];
    }

    public static eb e(byte... bArr) {
        if (bArr != null) {
            return new eb((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static eb d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        eb ebVar = new eb(str.getBytes(cc.f14686a));
        ebVar.f14740c = str;
        return ebVar;
    }

    private eb c(String str) {
        try {
            return e(MessageDigest.getInstance(str).digest(this.f14738a));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static eb b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
        }
        return e(bArr);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f14738a.length);
        objectOutputStream.write(this.f14738a);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException {
        eb ebVarA = a(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = eb.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, ebVarA.f14738a);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    public static eb a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        cc.a(bArr.length, i, i2);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new eb(bArr2);
    }

    public static eb a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("data == null");
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new eb(bArr);
    }

    public static eb a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new eb(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    private eb a(String str, eb ebVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(ebVar.m(), str));
            return e(mac.doFinal(this.f14738a));
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }

    @Nullable
    public static eb a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] bArrA = ab.a(str);
        if (bArrA != null) {
            return new eb(bArrA);
        }
        return null;
    }

    public static eb a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i);
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return new eb(bArr);
    }

    public static int a(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public eb(byte[] bArr) {
        this.f14738a = bArr;
    }
}
