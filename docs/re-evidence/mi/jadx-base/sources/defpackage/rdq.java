package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class rdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f32450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f32451b;
    public final String[] c;
    public final int d;

    public rdq(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f32450a = strArr;
        this.f32451b = iArr;
        this.c = strArr2;
        this.d = i;
    }

    public static rdq b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new rdq(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    public static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                String strValueOf = String.valueOf(strArr[i]);
                String strValueOf2 = String.valueOf(str.substring(length));
                strArr[i] = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                length = str.length();
            } else if (iIndexOf != length) {
                String strValueOf3 = String.valueOf(strArr[i]);
                String strValueOf4 = String.valueOf(str.substring(length, iIndexOf));
                strArr[i] = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                strArr[i] = String.valueOf(strArr[i]).concat("$");
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = str.indexOf("$", i2);
                String strSubstring2 = str.substring(i2, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith(PluginDeviceInfo.FICONOFF) && !strSubstring.endsWith("x")) {
                            strSubstring = strSubstring.concat(PluginDeviceInfo.FICONOFF);
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(str.length() != 0 ? "Invalid template: ".concat(str) : new String("Invalid template: "));
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i;
    }

    public String a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3) {
                sb.append(this.f32450a[i3]);
                return sb.toString();
            }
            sb.append(this.f32450a[i2]);
            int i4 = this.f32451b[i2];
            if (i4 == 1) {
                sb.append(str);
            } else if (i4 == 2) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j)));
            } else if (i4 == 3) {
                sb.append(String.format(Locale.US, this.c[i2], Integer.valueOf(i)));
            } else if (i4 == 4) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j2)));
            }
            i2++;
        }
    }
}
