package w63;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lw63/h;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class h implements Serializable, Comparable<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f183361d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f183362e = new h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f183363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f183364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f183365c;

    public h(byte[] bArr) {
        bArr.getClass();
        this.f183363a = bArr;
    }

    public static int g(h hVar, h hVar2) {
        hVar2.getClass();
        return hVar.f(0, hVar2.getF183363a());
    }

    public static int l(h hVar, h hVar2) {
        int i14 = b.f183327b;
        hVar2.getClass();
        return hVar.k(i14, hVar2.getF183363a());
    }

    public static h q(h hVar, int i14, int i15, int i16) {
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        if ((i16 & 2) != 0) {
            i15 = b.f183327b;
        }
        return hVar.p(i14, i15);
    }

    public String a() {
        byte[] bArr = w63.a.f183321a;
        bArr.getClass();
        byte[] bArr2 = this.f183363a;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            byte b14 = bArr2[i14];
            int i16 = i14 + 2;
            byte b15 = bArr2[i14 + 1];
            i14 += 3;
            byte b16 = bArr2[i16];
            bArr3[i15] = bArr[(b14 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr3[i15 + 1] = bArr[((b14 & 3) << 4) | ((b15 & UnsignedBytes.MAX_VALUE) >> 4)];
            int i17 = i15 + 3;
            bArr3[i15 + 2] = bArr[((b15 & Ascii.SI) << 2) | ((b16 & UnsignedBytes.MAX_VALUE) >> 6)];
            i15 += 4;
            bArr3[i17] = bArr[b16 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b17 = bArr2[i14];
            bArr3[i15] = bArr[(b17 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr3[i15 + 1] = bArr[(b17 & 3) << 4];
            bArr3[i15 + 2] = 61;
            bArr3[i15 + 3] = 61;
        } else if (length2 == 2) {
            int i18 = i14 + 1;
            byte b18 = bArr2[i14];
            byte b19 = bArr2[i18];
            bArr3[i15] = bArr[(b18 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr3[i15 + 1] = bArr[((b18 & 3) << 4) | ((b19 & UnsignedBytes.MAX_VALUE) >> 4)];
            bArr3[i15 + 2] = bArr[(b19 & Ascii.SI) << 2];
            bArr3[i15 + 3] = 61;
        }
        return new String(bArr3, d53.c.f57666b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        hVar.getClass();
        int iD = d();
        int iD2 = hVar.d();
        int iMin = Math.min(iD, iD2);
        for (int i14 = 0; i14 < iMin; i14++) {
            int i15 = i(i14) & UnsignedBytes.MAX_VALUE;
            int i16 = hVar.i(i14) & UnsignedBytes.MAX_VALUE;
            if (i15 != i16) {
                return i15 < i16 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public h c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f183363a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new h(bArrDigest);
    }

    public int d() {
        return this.f183363a.length;
    }

    public String e() {
        byte[] bArr = this.f183363a;
        char[] cArr = new char[bArr.length * 2];
        int i14 = 0;
        for (byte b14 : bArr) {
            int i15 = i14 + 1;
            char[] cArr2 = x63.b.f189310a;
            cArr[i14] = cArr2[(b14 >> 4) & 15];
            i14 += 2;
            cArr[i15] = cArr2[b14 & Ascii.SI];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int iD = hVar.d();
            byte[] bArr = this.f183363a;
            if (iD == bArr.length && hVar.m(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i14, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.f183363a;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i14, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(bArr2, iMax, 0, bArr, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public byte[] getF183363a() {
        return this.f183363a;
    }

    public int hashCode() {
        int i14 = this.f183364b;
        if (i14 != 0) {
            return i14;
        }
        int iHashCode = Arrays.hashCode(this.f183363a);
        this.f183364b = iHashCode;
        return iHashCode;
    }

    public byte i(int i14) {
        return this.f183363a[i14];
    }

    public int k(int i14, byte[] bArr) {
        bArr.getClass();
        if (i14 == b.f183327b) {
            i14 = d();
        }
        byte[] bArr2 = this.f183363a;
        for (int iMin = Math.min(i14, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (b.a(bArr2, iMin, 0, bArr, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean m(int i14, int i15, int i16, byte[] bArr) {
        bArr.getClass();
        if (i14 < 0) {
            return false;
        }
        byte[] bArr2 = this.f183363a;
        return i14 <= bArr2.length - i16 && i15 >= 0 && i15 <= bArr.length - i16 && b.a(bArr2, i14, i15, bArr, i16);
    }

    public boolean n(int i14, h hVar, int i15) {
        hVar.getClass();
        return hVar.m(0, i14, i15, this.f183363a);
    }

    public String o(Charset charset) {
        return new String(this.f183363a, charset);
    }

    public h p(int i14, int i15) {
        if (i15 == b.f183327b) {
            i15 = d();
        }
        if (i14 < 0) {
            vb.h.s("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f183363a;
        if (i15 > bArr.length) {
            vb.h.x(ds.e0.j(new StringBuilder("endIndex > length("), bArr.length, CoreConstants.RIGHT_PARENTHESIS_CHAR));
            return null;
        }
        if (i15 - i14 >= 0) {
            return (i14 == 0 && i15 == bArr.length) ? this : new h(p13.s.k(i14, i15, bArr));
        }
        vb.h.s("endIndex < beginIndex");
        return null;
    }

    public h r() {
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f183363a;
            if (i14 >= bArr.length) {
                return this;
            }
            byte b14 = bArr[i14];
            if (b14 >= 65 && b14 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i14] = (byte) (b14 + 32);
                for (int i15 = i14 + 1; i15 < bArrCopyOf.length; i15++) {
                    byte b15 = bArrCopyOf[i15];
                    if (b15 >= 65 && b15 <= 90) {
                        bArrCopyOf[i15] = (byte) (b15 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
            i14++;
        }
    }

    public final String s() {
        String str = this.f183365c;
        if (str != null) {
            return str;
        }
        byte[] f183363a = getF183363a();
        f183363a.getClass();
        String str2 = new String(f183363a, d53.c.f57666b);
        this.f183365c = str2;
        return str2;
    }

    public void t(int i14, e eVar) {
        eVar.write(this.f183363a, 0, i14);
    }

    /* JADX WARN: Code duplicated, block: B:180:0x01bf A[EDGE_INSN: B:180:0x01bf->B:181:0x01c0 BREAK  A[LOOP:0: B:7:0x000e->B:248:0x000e]] */
    public String toString() {
        byte b14;
        int i14;
        byte[] bArr = this.f183363a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        loop0: while (true) {
            if (i15 >= length) {
                break;
            }
            byte b15 = bArr[i15];
            if (b15 < 0) {
                if ((b15 >> 5) != -2) {
                    if ((b15 >> 4) != -2) {
                        if ((b15 >> 3) != -2) {
                            if (i17 == 64) {
                                break;
                            }
                            i16 = -1;
                            break;
                        }
                        int i18 = i15 + 3;
                        if (length > i18) {
                            byte b16 = bArr[i15 + 1];
                            if ((b16 & 192) != 128) {
                                if (i17 == 64) {
                                    break;
                                }
                                i16 = -1;
                                break;
                            }
                            byte b17 = bArr[i15 + 2];
                            if ((b17 & 192) != 128) {
                                if (i17 == 64) {
                                    break;
                                }
                                i16 = -1;
                                break;
                            }
                            byte b18 = bArr[i18];
                            if ((b18 & 192) != 128) {
                                if (i17 == 64) {
                                    break;
                                }
                                i16 = -1;
                                break;
                            }
                            int i19 = (((b18 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b17 << 6)) ^ (b16 << Ascii.FF)) ^ (b15 << Ascii.DC2);
                            if (i19 <= 1114111) {
                                if (55296 <= i19 && i19 < 57344) {
                                    if (i17 == 64) {
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                                }
                                if (i19 >= 65536) {
                                    i14 = i17 + 1;
                                    if (i17 == 64) {
                                        break;
                                    }
                                    if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                        i16 = -1;
                                        break;
                                    }
                                    i16 += i19 < 65536 ? 1 : 2;
                                    Unit unit = Unit.INSTANCE;
                                    i15 += 4;
                                    i17 = i14;
                                } else {
                                    if (i17 == 64) {
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                                }
                            } else {
                                if (i17 == 64) {
                                    break;
                                }
                                i16 = -1;
                                break;
                            }
                        } else {
                            if (i17 == 64) {
                                break;
                            }
                            i16 = -1;
                            break;
                        }
                    } else {
                        int i24 = i15 + 2;
                        if (length > i24) {
                            byte b19 = bArr[i15 + 1];
                            if ((b19 & 192) != 128) {
                                if (i17 == 64) {
                                    break;
                                }
                                i16 = -1;
                                break;
                            }
                            byte b24 = bArr[i24];
                            if ((b24 & 192) != 128) {
                                if (i17 == 64) {
                                    break;
                                }
                                i16 = -1;
                                break;
                            }
                            int i25 = ((b24 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b19 << 6)) ^ (b15 << Ascii.FF);
                            if (i25 >= 2048) {
                                if (55296 <= i25 && i25 < 57344) {
                                    if (i17 == 64) {
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                                }
                                i14 = i17 + 1;
                                if (i17 == 64) {
                                    break;
                                }
                                if ((i25 != 10 && i25 != 13 && ((i25 >= 0 && i25 < 32) || (127 <= i25 && i25 < 160))) || i25 == 65533) {
                                    i16 = -1;
                                    break;
                                }
                                i16 += i25 < 65536 ? 1 : 2;
                                Unit unit2 = Unit.INSTANCE;
                                i15 += 3;
                                i17 = i14;
                            } else {
                                if (i17 == 64) {
                                    break;
                                }
                                i16 = -1;
                                break;
                            }
                        } else {
                            if (i17 == 64) {
                                break;
                            }
                            i16 = -1;
                            break;
                        }
                    }
                } else {
                    int i26 = i15 + 1;
                    if (length > i26) {
                        byte b25 = bArr[i26];
                        if ((b25 & 192) != 128) {
                            if (i17 == 64) {
                                break;
                            }
                            i16 = -1;
                            break;
                        }
                        int i27 = (b25 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b15 << 6);
                        if (i27 >= 128) {
                            i14 = i17 + 1;
                            if (i17 == 64) {
                                break;
                            }
                            if ((i27 != 10 && i27 != 13 && ((i27 >= 0 && i27 < 32) || (127 <= i27 && i27 < 160))) || i27 == 65533) {
                                i16 = -1;
                                break;
                            }
                            i16 += i27 < 65536 ? 1 : 2;
                            Unit unit3 = Unit.INSTANCE;
                            i15 += 2;
                            i17 = i14;
                        } else {
                            if (i17 == 64) {
                                break;
                            }
                            i16 = -1;
                            break;
                        }
                    } else {
                        if (i17 == 64) {
                            break;
                        }
                        i16 = -1;
                        break;
                    }
                }
            } else {
                int i28 = i17 + 1;
                if (i17 == 64) {
                    break;
                }
                if ((b15 == 10 || b15 == 13 || ((b15 < 0 || b15 >= 32) && (127 > b15 || b15 >= 160))) && b15 != 65533) {
                    i16 += b15 < 65536 ? 1 : 2;
                    i15++;
                    while (true) {
                        i17 = i28;
                        if (i15 < length && (b14 = bArr[i15]) >= 0) {
                            i15++;
                            i28 = i17 + 1;
                            if (i17 == 64) {
                                break loop0;
                            }
                            if ((b14 == 10 || b14 == 13 || ((b14 < 0 || b14 >= 32) && (127 > b14 || b14 >= 160))) && b14 != 65533) {
                                i16 += b14 < 65536 ? 1 : 2;
                            }
                        } else {
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                }
                i16 = -1;
                break;
            }
        }
        if (i16 != -1) {
            String strS = s();
            String strV = d53.u.v(d53.u.v(d53.u.v(strS.substring(0, i16), "\\", "\\\\", false), "\n", "\\n", false), StringUtils.CR, "\\r", false);
            if (i16 >= strS.length()) {
                return o2.c.c(']', "[text=", strV);
            }
            return "[size=" + bArr.length + " text=" + strV + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb3 = new StringBuilder("[size=");
        sb3.append(bArr.length);
        sb3.append(" hex=");
        int iD = 64 == b.f183327b ? d() : 64;
        if (iD > bArr.length) {
            vb.h.x(ds.e0.j(new StringBuilder("endIndex > length("), bArr.length, CoreConstants.RIGHT_PARENTHESIS_CHAR));
            return null;
        }
        if (iD < 0) {
            vb.h.s("endIndex < beginIndex");
            return null;
        }
        sb3.append((iD == bArr.length ? this : new h(p13.s.k(0, iD, bArr))).e());
        sb3.append("…]");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw63/h$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "Lw63/h;", "EMPTY", "Lw63/h;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
        public static h a(String str) {
            int i14;
            char cCharAt;
            str.getClass();
            byte[] bArr = w63.a.f183321a;
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length--;
            }
            int i15 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i15];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (i16 >= length) {
                    int i24 = i17 % 4;
                    if (i24 != 1) {
                        if (i24 == 2) {
                            bArrCopyOf[i19] = (byte) ((i18 << 12) >> 16);
                            i19++;
                        } else if (i24 == 3) {
                            int i25 = i18 << 6;
                            int i26 = i19 + 1;
                            bArrCopyOf[i19] = (byte) (i25 >> 16);
                            i19 += 2;
                            bArrCopyOf[i26] = (byte) (i25 >> 8);
                        }
                        if (i19 != i15) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i19);
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new h(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i16);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i14 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i14 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i14 = cCharAt2 + 4;
                } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                    i14 = 62;
                } else {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                    } else {
                        i14 = 63;
                    }
                    i16++;
                }
                i18 = (i18 << 6) | i14;
                i17++;
                if (i17 % 4 == 0) {
                    bArrCopyOf[i19] = (byte) (i18 >> 16);
                    int i27 = i19 + 2;
                    bArrCopyOf[i19 + 1] = (byte) (i18 >> 8);
                    i19 += 3;
                    bArrCopyOf[i27] = (byte) i18;
                }
                i16++;
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new h(bArrCopyOf);
            }
            return null;
        }

        public static h b(String str) {
            if (str.length() % 2 != 0) {
                vb.h.x("Unexpected hex string: ".concat(str));
                return null;
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = i14 * 2;
                bArr[i14] = (byte) (x63.b.a(str.charAt(i15 + 1)) + (x63.b.a(str.charAt(i15)) << 4));
            }
            return new h(bArr);
        }

        public static h c(String str) {
            str.getClass();
            byte[] bytes = str.getBytes(d53.c.f57666b);
            bytes.getClass();
            h hVar = new h(bytes);
            hVar.f183365c = str;
            return hVar;
        }

        public static h d(a aVar, byte[] bArr) {
            e.a aVar2 = b.f183326a;
            aVar.getClass();
            int length = bArr.length;
            b.b(bArr.length, 0, length);
            return new h(p13.s.k(0, length, bArr));
        }

        private a() {
        }
    }
}
