package b23;

import am.j;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p13.c;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002\u000b\fB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lb23/a;", "", "", "isUrlSafe", "isMimeScheme", "", "mimeLineLength", "Lb23/a$b;", "paddingOption", "<init>", "(ZZILb23/a$b;)V", "b", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0218a f15486f = new C0218a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f15487g = {Ascii.CR, 10};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f15491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15492e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb23/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        /* JADX INFO: Fake field, exist only in values array */
        ABSENT_OPTIONAL
    }

    static {
        b bVar = b.PRESENT;
        new a(true, false, -1, bVar);
        new a(false, true, 76, bVar);
        new a(false, true, 64, bVar);
    }

    private a(boolean z14, boolean z15, int i14, b bVar) {
        this.f15488a = z14;
        this.f15489b = z15;
        this.f15490c = i14;
        this.f15491d = bVar;
        if (z14 && z15) {
            h.s("Failed requirement.");
            throw null;
        }
        this.f15492e = i14 / 4;
    }

    public static byte[] a(a aVar, CharSequence charSequence, int i14, int i15) {
        byte[] bytes;
        int i16;
        int i17;
        boolean z14;
        int[] iArr;
        int i18;
        int i19 = (i15 & 2) != 0 ? 0 : i14;
        int length = charSequence.length();
        aVar.getClass();
        b bVar = aVar.f15491d;
        boolean z15 = aVar.f15489b;
        charSequence.getClass();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            int length2 = str.length();
            c.f134916a.getClass();
            c.a.a(i19, length, length2);
            bytes = str.substring(i19, length).getBytes(d53.c.f57668d);
            bytes.getClass();
        } else {
            int length3 = charSequence.length();
            c.f134916a.getClass();
            c.a.a(i19, length, length3);
            byte[] bArr = new byte[length - i19];
            int i24 = 0;
            while (i19 < length) {
                char cCharAt = charSequence.charAt(i19);
                if (cCharAt <= 255) {
                    bArr[i24] = (byte) cCharAt;
                    i24++;
                } else {
                    bArr[i24] = 63;
                    i24++;
                }
                i19++;
            }
            bytes = bArr;
        }
        int length4 = bytes.length;
        int length5 = bytes.length;
        c.f134916a.getClass();
        c.a.a(0, length4, length5);
        int i25 = 8;
        int i26 = -2;
        if (length4 == 0) {
            i17 = 0;
        } else {
            if (length4 == 1) {
                h.s(j.h(length4, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                return null;
            }
            if (z15) {
                i16 = length4;
                for (int i27 = 0; i27 < length4; i27++) {
                    int i28 = b23.b.f15498b[bytes[i27] & UnsignedBytes.MAX_VALUE];
                    if (i28 < 0) {
                        if (i28 == -2) {
                            i16 -= length4 - i27;
                            break;
                        }
                        i16--;
                    }
                }
            } else if (bytes[length4 - 1] == 61) {
                i16 = length4 - 1;
                if (bytes[length4 - 2] == 61) {
                    i16 = length4 - 2;
                }
            } else {
                i16 = length4;
            }
            i17 = (int) ((((long) i16) * ((long) 6)) / ((long) 8));
        }
        byte[] bArr2 = new byte[i17];
        int[] iArr2 = aVar.f15488a ? b23.b.f15500d : b23.b.f15498b;
        int i29 = -8;
        int i30 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -8;
        while (true) {
            int i37 = i25;
            if (i30 >= length4) {
                z14 = false;
                break;
            }
            if (i36 != i29 || (i18 = i30 + 3) >= length4) {
                iArr = iArr2;
            } else {
                iArr = iArr2;
                int i38 = i30 + 4;
                int i39 = (iArr[bytes[i30 + 2] & UnsignedBytes.MAX_VALUE] << 6) | (iArr2[bytes[i30 + 1] & UnsignedBytes.MAX_VALUE] << 12) | (iArr2[bytes[i30] & UnsignedBytes.MAX_VALUE] << 18) | iArr[bytes[i18] & UnsignedBytes.MAX_VALUE];
                if (i39 >= 0) {
                    bArr2[i35] = (byte) (i39 >> 16);
                    int i44 = i35 + 2;
                    bArr2[i35 + 1] = (byte) (i39 >> 8);
                    i35 += 3;
                    bArr2[i44] = (byte) i39;
                    i25 = i37;
                    iArr2 = iArr;
                    i30 = i38;
                }
                i26 = -2;
                i29 = -8;
            }
            int i45 = bytes[i30] & UnsignedBytes.MAX_VALUE;
            int i46 = iArr[i45];
            if (i46 >= 0) {
                i30++;
                i34 = (i34 << 6) | i46;
                int i47 = i36 + 6;
                if (i47 >= 0) {
                    bArr2[i35] = (byte) (i34 >>> i47);
                    i34 &= (1 << i47) - 1;
                    i36 -= 2;
                    i35++;
                } else {
                    i36 = i47;
                }
                iArr2 = iArr;
                i25 = 8;
            } else {
                if (i46 == -2) {
                    if (i36 == -8) {
                        h.s(j.h(i30, "Redundant pad character at index "));
                        return null;
                    }
                    if (i36 != -6) {
                        if (i36 == -4) {
                            if (bVar == b.ABSENT) {
                                h.s(j.h(i30, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                return null;
                            }
                            int i48 = i30 + 1;
                            if (z15) {
                                while (i48 < length4) {
                                    if (b23.b.f15498b[bytes[i48] & UnsignedBytes.MAX_VALUE] != -1) {
                                        break;
                                    }
                                    i48++;
                                }
                            }
                            if (i48 == length4 || bytes[i48] != 61) {
                                h.s(j.h(i48, "Missing one pad character at index "));
                                return null;
                            }
                            i30 = i48 + 1;
                        } else if (i36 != -2) {
                            h.z("Unreachable");
                            return null;
                        }
                        z14 = true;
                        i26 = -2;
                        break;
                    }
                    if (bVar == b.ABSENT) {
                        h.s(j.h(i30, "The padding option is set to ABSENT, but the input has a pad character at index "));
                        return null;
                    }
                    i30++;
                    z14 = true;
                    i26 = -2;
                    break;
                }
                if (!z15) {
                    char c14 = (char) i45;
                    d53.a.a(i37);
                    String string = Integer.toString(i45, i37);
                    string.getClass();
                    throw new IllegalArgumentException("Invalid symbol '" + c14 + "'(" + string + ") at index " + i30);
                }
                i30++;
                i25 = i37;
                iArr2 = iArr;
            }
            i26 = -2;
            i29 = -8;
        }
        if (i36 == i26) {
            h.s("The last unit of input does not have enough bits");
            return null;
        }
        if (i36 != -8 && !z14 && bVar == b.PRESENT) {
            h.s("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i34 != 0) {
            h.s("The pad bits must be zeros");
            return null;
        }
        if (z15) {
            while (i30 < length4) {
                if (b23.b.f15498b[bytes[i30] & UnsignedBytes.MAX_VALUE] != -1) {
                    break;
                }
                i30++;
            }
        }
        if (i30 >= length4) {
            if (i35 == i17) {
                return bArr2;
            }
            h.z("Check failed.");
            return null;
        }
        int i49 = bytes[i30] & UnsignedBytes.MAX_VALUE;
        StringBuilder sb3 = new StringBuilder("Symbol '");
        sb3.append((char) i49);
        sb3.append("'(");
        d53.a.a(8);
        String string2 = Integer.toString(i49, 8);
        string2.getClass();
        sb3.append(string2);
        sb3.append(") at index ");
        h.s(j.q(sb3, i30 - 1, " is prohibited after the pad character"));
        return null;
    }

    public static String b(a aVar, byte[] bArr) {
        int i14;
        int length = bArr.length;
        aVar.getClass();
        b bVar = aVar.f15491d;
        int length2 = bArr.length;
        c.a aVar2 = c.f134916a;
        aVar2.getClass();
        c.a.a(0, length, length2);
        int iC = aVar.c(length);
        byte[] bArr2 = new byte[iC];
        int length3 = bArr.length;
        aVar2.getClass();
        c.a.a(0, length, length3);
        int iC2 = aVar.c(length);
        if (iC < 0) {
            e.v(j.h(iC, "destination offset: 0, destination size: "));
            return null;
        }
        if (iC2 < 0 || iC2 > iC) {
            e.v(k.e(iC, iC2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
            return null;
        }
        byte[] bArr3 = aVar.f15488a ? b23.b.f15499c : b23.b.f15497a;
        int i15 = aVar.f15489b ? aVar.f15492e : Integer.MAX_VALUE;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i14 = i16 + 2;
            if (i14 >= length) {
                break;
            }
            int iMin = Math.min((length - i16) / 3, i15);
            for (int i18 = 0; i18 < iMin; i18++) {
                int i19 = bArr[i16] & UnsignedBytes.MAX_VALUE;
                int i24 = i16 + 2;
                int i25 = bArr[i16 + 1] & UnsignedBytes.MAX_VALUE;
                i16 += 3;
                int i26 = (i25 << 8) | (i19 << 16) | (bArr[i24] & UnsignedBytes.MAX_VALUE);
                bArr2[i17] = bArr3[i26 >>> 18];
                bArr2[i17 + 1] = bArr3[(i26 >>> 12) & 63];
                int i27 = i17 + 3;
                bArr2[i17 + 2] = bArr3[(i26 >>> 6) & 63];
                i17 += 4;
                bArr2[i27] = bArr3[i26 & 63];
            }
            if (iMin == i15 && i16 != length) {
                int i28 = i17 + 1;
                byte[] bArr4 = f15487g;
                bArr2[i17] = bArr4[0];
                i17 += 2;
                bArr2[i28] = bArr4[1];
            }
        }
        int i29 = length - i16;
        if (i29 == 1) {
            int i30 = i16 + 1;
            int i34 = (bArr[i16] & UnsignedBytes.MAX_VALUE) << 4;
            bArr2[i17] = bArr3[i34 >>> 6];
            int i35 = i17 + 2;
            bArr2[i17 + 1] = bArr3[i34 & 63];
            if (bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL) {
                bArr2[i35] = 61;
                bArr2[i17 + 3] = 61;
            }
            i16 = i30;
        } else if (i29 == 2) {
            int i36 = ((bArr[i16 + 1] & UnsignedBytes.MAX_VALUE) << 2) | ((bArr[i16] & UnsignedBytes.MAX_VALUE) << 10);
            bArr2[i17] = bArr3[i36 >>> 12];
            int i37 = i17 + 2;
            bArr2[i17 + 1] = bArr3[(i36 >>> 6) & 63];
            int i38 = i17 + 3;
            bArr2[i37] = bArr3[i36 & 63];
            if (bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL) {
                bArr2[i38] = 61;
            }
            i16 = i14;
        }
        if (i16 == length) {
            return new String(bArr2, d53.c.f57668d);
        }
        h.z("Check failed.");
        return null;
    }

    public final int c(int i14) {
        int i15 = i14 / 3;
        int i16 = i14 % 3;
        int i17 = 4;
        int iV = i15 * 4;
        if (i16 != 0) {
            b bVar = b.PRESENT;
            b bVar2 = this.f15491d;
            if (bVar2 != bVar && bVar2 != b.PRESENT_OPTIONAL) {
                i17 = i16 + 1;
            }
            iV += i17;
        }
        if (iV < 0) {
            h.s("Input is too big");
            return 0;
        }
        if (this.f15489b) {
            iV = androidx.core.view.j.v(iV - 1, this.f15490c, 2, iV);
        }
        if (iV >= 0) {
            return iV;
        }
        h.s("Input is too big");
        return 0;
    }

    /* JADX INFO: renamed from: b23.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lb23/a$a;", "Lb23/a;", "<init>", "()V", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "", "padSymbol", "B", "lineLengthMime", "lineLengthPem", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0218a extends a {
        private C0218a() {
            super(false, false, -1, b.PRESENT, null);
        }

        public /* synthetic */ C0218a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public /* synthetic */ a(boolean z14, boolean z15, int i14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, i14, bVar);
    }
}
