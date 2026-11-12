package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.network.embedded.g4;
import defpackage.yzc;
import defpackage.yzk;
import defpackage.zcp;
import defpackage.zes;
import java.util.Arrays;
import kotlin.Metadata;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", "s", "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", "", TypedValues.CycleType.S_WAVE_OFFSET, "target", "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final String commonUtf8(okio.ByteString byteString) {
        zcp.c(byteString, "");
        String utf8 = byteString.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final String commonBase64(okio.ByteString byteString) {
        zcp.c(byteString, "");
        return Base64.encodeBase64$default(byteString.getData(), null, 1, null);
    }

    public static final String commonBase64Url(okio.ByteString byteString) {
        zcp.c(byteString, "");
        return Base64.encodeBase64(byteString.getData(), Base64.getBASE64_URL_SAFE());
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final String commonHex(okio.ByteString byteString) {
        zcp.c(byteString, "");
        char[] cArr = new char[byteString.getData().length * 2];
        byte[] data = byteString.getData();
        int length = data.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = data[i2];
            cArr[i] = getHEX_DIGIT_CHARS()[(b2 >> 4) & 15];
            cArr[i + 1] = getHEX_DIGIT_CHARS()[b2 & 15];
            i2++;
            i += 2;
        }
        return zes.e(cArr);
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
        zcp.c(byteString, "");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b2 = byteString.getData()[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                zcp.b((Object) bArrCopyOf, "");
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b3 = bArrCopyOf[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i2] = (byte) (b3 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
        zcp.c(byteString, "");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b2 = byteString.getData()[i];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                zcp.b((Object) bArrCopyOf, "");
                bArrCopyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b3 = bArrCopyOf[i2];
                    if (b3 >= 97 && b3 <= 122) {
                        bArrCopyOf[i2] = (byte) (b3 - 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i, int i2) {
        zcp.c(byteString, "");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iResolveDefaultParameter <= byteString.getData().length) {
            if (iResolveDefaultParameter - i >= 0) {
                return (i == 0 && iResolveDefaultParameter == byteString.getData().length) ? byteString : new okio.ByteString(yzk.a(byteString.getData(), i, iResolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData().length + g4.l).toString());
    }

    public static final byte commonGetByte(okio.ByteString byteString, int i) {
        zcp.c(byteString, "");
        return byteString.getData()[i];
    }

    public static final int commonGetSize(okio.ByteString byteString) {
        zcp.c(byteString, "");
        return byteString.getData().length;
    }

    public static final byte[] commonToByteArray(okio.ByteString byteString) {
        zcp.c(byteString, "");
        byte[] data = byteString.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        zcp.b((Object) bArrCopyOf, "");
        return bArrCopyOf;
    }

    public static final byte[] commonInternalArray(okio.ByteString byteString) {
        zcp.c(byteString, "");
        return byteString.getData();
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, okio.ByteString byteString2, int i2, int i3) {
        zcp.c(byteString, "");
        zcp.c(byteString2, "");
        return byteString2.rangeEquals(i2, byteString.getData(), i, i3);
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        zcp.c(byteString, "");
        zcp.c(bArr, "");
        return i >= 0 && i <= byteString.getData().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && SegmentedByteString.arrayRangeEquals(byteString.getData(), i, bArr, i2, i3);
    }

    public static final void commonCopyInto(okio.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        zcp.c(byteString, "");
        zcp.c(bArr, "");
        yzk.e(byteString.getData(), bArr, i2, i, i3 + i);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString byteString2) {
        zcp.c(byteString, "");
        zcp.c(byteString2, "");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, byte[] bArr) {
        zcp.c(byteString, "");
        zcp.c(bArr, "");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString byteString2) {
        zcp.c(byteString, "");
        zcp.c(byteString2, "");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, byte[] bArr) {
        zcp.c(byteString, "");
        zcp.c(bArr, "");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonIndexOf(okio.ByteString byteString, byte[] bArr, int i) {
        zcp.c(byteString, "");
        zcp.c(bArr, "");
        int length = byteString.getData().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString byteString2, int i) {
        zcp.c(byteString, "");
        zcp.c(byteString2, "");
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i);
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, byte[] bArr, int i) {
        zcp.c(byteString, "");
        zcp.c(bArr, "");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData().length - bArr.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonEquals(okio.ByteString byteString, Object obj) {
        zcp.c(byteString, "");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final int commonHashCode(okio.ByteString byteString) {
        zcp.c(byteString, "");
        int hashCode = byteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(byteString.getData());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString byteString2) {
        zcp.c(byteString, "");
        zcp.c(byteString2, "");
        int size = byteString.size();
        int size2 = byteString2.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i2 = byteString.getByte(i) & 255;
            int i3 = byteString2.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final okio.ByteString commonOf(byte[] bArr) {
        zcp.c(bArr, "");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        zcp.b((Object) bArrCopyOf, "");
        return new okio.ByteString(bArrCopyOf);
    }

    public static final okio.ByteString commonToByteString(byte[] bArr, int i, int i2) {
        zcp.c(bArr, "");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i2);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
        return new okio.ByteString(yzk.a(bArr, i, iResolveDefaultParameter + i));
    }

    public static final okio.ByteString commonEncodeUtf8(String str) {
        zcp.c(str, "");
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final okio.ByteString commonDecodeBase64(String str) {
        zcp.c(str, "");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final okio.ByteString commonDecodeHex(String str) {
        zcp.c(str, "");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
        }
        return new okio.ByteString(bArr);
    }

    public static final void commonWrite(okio.ByteString byteString, Buffer buffer, int i, int i2) {
        zcp.c(byteString, "");
        zcp.c(buffer, "");
        buffer.write(byteString.getData(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final String commonToString(okio.ByteString byteString) {
        okio.ByteString byteString2 = byteString;
        zcp.c(byteString2, "");
        if (byteString.getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData(), 64);
        if (iCodePointIndexToCharIndex == -1) {
            if (byteString.getData().length <= 64) {
                return "[hex=" + byteString.hex() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(byteString.getData().length);
            sb.append(" hex=");
            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString2, 64);
            if (iResolveDefaultParameter > byteString.getData().length) {
                throw new IllegalArgumentException(("endIndex > length(" + byteString.getData().length + g4.l).toString());
            }
            if (iResolveDefaultParameter < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            if (iResolveDefaultParameter != byteString.getData().length) {
                byteString2 = new okio.ByteString(yzk.a(byteString.getData(), 0, iResolveDefaultParameter));
            }
            sb.append(byteString2.hex());
            sb.append("…]");
            return sb.toString();
        }
        String strUtf8 = byteString.utf8();
        String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
        zcp.b((Object) strSubstring, "");
        String strA = zes.a(zes.a(zes.a(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
        if (iCodePointIndexToCharIndex < strUtf8.length()) {
            return "[size=" + byteString.getData().length + " text=" + strA + "…]";
        }
        return "[text=" + strA + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i) {
        byte b2;
        int i2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                int i6 = i4 + 1;
                if (i4 == i) {
                    break;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (127 <= b3 && b3 < 160))) || b3 == 65533) {
                    return -1;
                }
                i5 += b3 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i4 = i6;
                    if (i3 >= length || (b2 = bArr[i3]) < 0) {
                        break;
                    }
                    i3++;
                    i6 = i4 + 1;
                    if (i4 == i) {
                        return i5;
                    }
                    if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                        return -1;
                    }
                    i5 += b2 < 65536 ? 1 : 2;
                }
            } else if ((b3 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length <= i7) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                byte b4 = bArr[i7];
                if ((b4 & 192) != 128) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                int i8 = (b3 << 6) ^ (b4 ^ 3968);
                if (i8 < 128) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                if (i4 == i) {
                    break;
                }
                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                    return -1;
                }
                i5 += i8 < 65536 ? 1 : 2;
                yzc yzcVar = yzc.e;
                i3 += 2;
                i4++;
            } else if ((b3 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length <= i9) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                byte b5 = bArr[i3 + 1];
                if ((b5 & 192) != 128) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                byte b6 = bArr[i9];
                if ((b6 & 192) != 128) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                int i10 = (b3 << 12) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                if (i10 < 2048) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i10 && i10 < 57344) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                i2 = i4 + 1;
                if (i4 == i) {
                    break;
                }
                if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                    return -1;
                }
                i5 += i10 < 65536 ? 1 : 2;
                yzc yzcVar2 = yzc.e;
                i3 += 3;
                i4 = i2;
            } else {
                if ((b3 >> 3) != -2) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                int i11 = i3 + 3;
                if (length <= i11) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                byte b7 = bArr[i3 + 1];
                if ((b7 & 192) != 128) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                byte b8 = bArr[i3 + 2];
                if ((b8 & 192) != 128) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                byte b9 = bArr[i11];
                if ((b9 & 192) != 128) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                int i12 = (b3 << 18) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12));
                if (i12 > 1114111) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i12 && i12 < 57344) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                if (i12 < 65536) {
                    if (i4 == i) {
                        break;
                    }
                    return -1;
                }
                i2 = i4 + 1;
                if (i4 == i) {
                    break;
                }
                if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                    return -1;
                }
                i5 += i12 < 65536 ? 1 : 2;
                yzc yzcVar3 = yzc.e;
                i3 += 4;
                i4 = i2;
            }
        }
        return i5;
    }
}
