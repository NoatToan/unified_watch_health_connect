package w33;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        BooleanUtils.TRUE.equals(property);
    }

    private a() {
    }

    public static byte[] a(String[] strArr) {
        if (strArr == null) {
            Object[] objArr = new Object[3];
            objArr[0] = "data";
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            switch (7) {
                case 1:
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                    break;
                case 2:
                    objArr[2] = "encode8to7";
                    break;
                case 4:
                    objArr[2] = "addModuloByte";
                    break;
                case 5:
                    objArr[2] = "splitBytesToStringArray";
                    break;
                case 7:
                    objArr[2] = "decodeBytes";
                    break;
                case 9:
                    objArr[2] = "dropMarker";
                    break;
                case 11:
                    objArr[2] = "combineStringArrayIntoBytes";
                    break;
                case 13:
                    objArr[2] = "decode7to8";
                    break;
                default:
                    objArr[2] = "encodeBytes";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int length = 0;
                for (String str : strArr2) {
                    length += str.length();
                }
                byte[] bArr = new byte[length];
                int i14 = 0;
                for (String str2 : strArr2) {
                    int length2 = str2.length();
                    int i15 = 0;
                    while (i15 < length2) {
                        bArr[i14] = (byte) str2.charAt(i15);
                        i15++;
                        i14++;
                    }
                }
                return bArr;
            }
            if (cCharAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int length3 = 0;
        for (String str3 : strArr) {
            length3 += str3.length();
        }
        byte[] bArr2 = new byte[length3];
        int i16 = 0;
        for (String str4 : strArr) {
            int length4 = str4.length();
            int i17 = 0;
            while (i17 < length4) {
                bArr2[i16] = (byte) str4.charAt(i17);
                i17++;
                i16++;
            }
        }
        for (int i18 = 0; i18 < length3; i18++) {
            bArr2[i18] = (byte) ((bArr2[i18] + Ascii.DEL) & 127);
        }
        int i19 = (length3 * 7) / 8;
        byte[] bArr3 = new byte[i19];
        int i24 = 0;
        int i25 = 0;
        for (int i26 = 0; i26 < i19; i26++) {
            int i27 = i24 + 1;
            int i28 = i25 + 1;
            bArr3[i26] = (byte) (((bArr2[i24] & UnsignedBytes.MAX_VALUE) >>> i25) + ((bArr2[i27] & ((1 << i28) - 1)) << (7 - i25)));
            if (i25 == 6) {
                i24 += 2;
                i25 = 0;
            } else {
                i24 = i27;
                i25 = i28;
            }
        }
        return bArr3;
    }
}
