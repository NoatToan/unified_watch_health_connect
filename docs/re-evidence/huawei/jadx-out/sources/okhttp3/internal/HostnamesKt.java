package okhttp3.internal;

import com.huawei.hms.network.embedded.y;
import com.huawei.operation.ble.BleConstants;
import defpackage.zcp;
import defpackage.zes;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", BleConstants.LIMIT, "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", y.b.j}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    public static final String toCanonicalHost(String str) {
        InetAddress inetAddressDecodeIpv6;
        zcp.c(str, "");
        if (zes.b((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            if (zes.e(str, "[", false, 2, (Object) null) && zes.c(str, "]", false, 2, (Object) null)) {
                inetAddressDecodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                inetAddressDecodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                zcp.b((Object) address, "");
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            zcp.b((Object) ascii, "");
            Locale locale = Locale.US;
            zcp.b((Object) locale, "");
            String lowerCase = ascii.toLowerCase(locale);
            zcp.b((Object) lowerCase, "");
            if (lowerCase.length() == 0 || containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (zcp.d((int) cCharAt, 31) <= 0 || zcp.d((int) cCharAt, 127) >= 0 || zes.a((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:1: B:30:0x0069->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007b A[EDGE_INSN: B:54:0x007b->B:34:0x007b BREAK  A[LOOP:1: B:30:0x0069->B:33:0x0075], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i, int i2) {
        int i3;
        int i4;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        while (i5 < i2) {
            if (i8 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && zes.e(str, "::", i5, false, 4, null)) {
                if (i6 != -1) {
                    return null;
                }
                i8 += 2;
                if (i9 == i2) {
                    i6 = i8;
                    break;
                }
                i7 = i9;
                i6 = i8;
                i5 = i7;
                i3 = 0;
                while (i5 < i2) {
                    hexDigit = Util.parseHexDigit(str.charAt(i5));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + hexDigit;
                    i5++;
                }
                i4 = i5 - i7;
                if (i4 != 0) {
                }
                return null;
            }
            if (i8 != 0) {
                if (!zes.e(str, ":", i5, false, 4, null)) {
                    if (!zes.e(str, ".", i5, false, 4, null) || !decodeIpv4Suffix(str, i7, i2, bArr, i8 - 2)) {
                        return null;
                    }
                    i8 += 2;
                    break;
                }
                i5++;
            }
            i7 = i5;
            i5 = i7;
            i3 = 0;
            while (i5 < i2) {
                hexDigit = Util.parseHexDigit(str.charAt(i5));
                if (hexDigit != -1) {
                    break;
                }
                i3 = (i3 << 4) + hexDigit;
                i5++;
            }
            i4 = i5 - i7;
            if (i4 != 0 || i4 > 4) {
                return null;
            }
            bArr[i8] = (byte) ((i3 >>> 8) & 255);
            bArr[i8 + 1] = (byte) (i3 & 255);
            i8 += 2;
        }
        if (i8 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i10 = i8 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i6, (16 - i8) + i6, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (zcp.d((int) cCharAt, 48) < 0 || zcp.d((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        Buffer buffer = new Buffer();
        while (i2 < bArr.length) {
            if (i2 == i) {
                buffer.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i2], 255) << 8) | Util.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return buffer.readUtf8();
    }
}
