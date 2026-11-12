package okhttp3.internal;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxMap;
import d53.u;
import d53.w;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import o2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;
import w63.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", MapboxMap.QFE_LIMIT, "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (s.h(cCharAt, 31) <= 0 || s.h(cCharAt, 127) >= 0 || w.G(cCharAt, 0, 6, " #%/:?@[\\]") != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i14, int i15, byte[] bArr, int i16) {
        int i17 = i16;
        while (i14 < i15) {
            if (i17 == bArr.length) {
                return false;
            }
            if (i17 != i16) {
                if (str.charAt(i14) != '.') {
                    return false;
                }
                i14++;
            }
            int i18 = i14;
            int i19 = 0;
            while (i18 < i15) {
                char cCharAt = str.charAt(i18);
                if (s.h(cCharAt, 48) < 0 || s.h(cCharAt, 57) > 0) {
                    break;
                }
                if ((i19 == 0 && i14 != i18) || (i19 = ((i19 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i18++;
            }
            if (i18 - i14 == 0) {
                return false;
            }
            bArr[i17] = (byte) i19;
            i17++;
            i14 = i18;
        }
        return i17 == i16 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057 A[LOOP:1: B:28:0x004b->B:31:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x005d A[EDGE_INSN: B:53:0x005d->B:32:0x005d BREAK  A[LOOP:1: B:28:0x004b->B:31:0x0057], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i14, int i15) {
        int i16;
        int i17;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i18 = 0;
        int i19 = -1;
        int i24 = -1;
        while (i14 < i15) {
            if (i18 == 16) {
                return null;
            }
            int i25 = i14 + 2;
            if (i25 <= i15 && u.x(i14, str, "::", false)) {
                if (i19 != -1) {
                    return null;
                }
                i18 += 2;
                i19 = i18;
                if (i25 == i15) {
                    break;
                }
                i24 = i25;
                i16 = 0;
                i14 = i24;
                while (i14 < i15) {
                    hexDigit = Util.parseHexDigit(str.charAt(i14));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i16 = (i16 << 4) + hexDigit;
                    i14++;
                }
                i17 = i14 - i24;
                return i17 == 0 ? null : null;
            }
            if (i18 != 0) {
                if (!u.x(i14, str, ":", false)) {
                    if (!u.x(i14, str, ".", false) || !decodeIpv4Suffix(str, i24, i15, bArr, i18 - 2)) {
                        return null;
                    }
                    i18 += 2;
                    break;
                }
                i14++;
            }
            i24 = i14;
            i16 = 0;
            i14 = i24;
            while (i14 < i15) {
                hexDigit = Util.parseHexDigit(str.charAt(i14));
                if (hexDigit != -1) {
                    break;
                }
                i16 = (i16 << 4) + hexDigit;
                i14++;
            }
            i17 = i14 - i24;
            if (i17 == 0 && i17 <= 4) {
                int i26 = i18 + 1;
                bArr[i18] = (byte) ((i16 >>> 8) & 255);
                i18 += 2;
                bArr[i26] = (byte) (i16 & 255);
            }
        }
        if (i18 != 16) {
            if (i19 == -1) {
                return null;
            }
            int i27 = i18 - i19;
            System.arraycopy(bArr, i19, bArr, 16 - i27, i27);
            Arrays.fill(bArr, i19, (16 - i18) + i19, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < bArr.length) {
            int i18 = i16;
            while (i18 < 16 && bArr[i18] == 0 && bArr[i18 + 1] == 0) {
                i18 += 2;
            }
            int i19 = i18 - i16;
            if (i19 > i17 && i19 >= 4) {
                i14 = i16;
                i17 = i19;
            }
            i16 = i18 + 2;
        }
        e eVar = new e();
        while (i15 < bArr.length) {
            if (i15 == i14) {
                eVar.H(58);
                i15 += i17;
                if (i15 == 16) {
                    eVar.H(58);
                }
            } else {
                if (i15 > 0) {
                    eVar.H(58);
                }
                eVar.K((Util.and(bArr[i15], 255) << 8) | Util.and(bArr[i15 + 1], 255));
                i15 += 2;
            }
        }
        return eVar.x();
    }

    public static final String toCanonicalHost(String str) {
        str.getClass();
        if (w.z(str, ":", false)) {
            InetAddress inetAddressDecodeIpv6 = (u.y(str, "[", false) && u.p(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            h.q(c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Invalid IPv6 address: '", str));
            return null;
        }
        try {
            String ascii = IDN.toASCII(str);
            ascii.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = ascii.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.length() == 0 || containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
