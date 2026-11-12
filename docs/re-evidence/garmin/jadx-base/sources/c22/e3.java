package c22;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class e3 {
    public static double a(String str, String str2) {
        double d14 = 1.0d;
        if (str.equals(str2)) {
            return 1.0d;
        }
        if (str2.equals("")) {
            return 0.0d;
        }
        double length = str.length();
        double length2 = str2.length();
        int i14 = 0;
        boolean z14 = false;
        double d15 = 0.0d;
        String strSubstring = str;
        while (i14 < str2.length()) {
            String string = Character.toString(str2.charAt(i14));
            int iIndexOf = strSubstring.indexOf(string.toLowerCase(Locale.getDefault()));
            double d16 = d14;
            int iIndexOf2 = strSubstring.indexOf(string.toUpperCase(Locale.getDefault()));
            int iMin = Math.min(iIndexOf, iIndexOf2);
            if (iMin <= -1) {
                iMin = Math.max(iIndexOf, iIndexOf2);
            }
            if (iMin == -1) {
                return 0.0d;
            }
            double d17 = Character.toString(strSubstring.charAt(iMin)).equals(string) ? 0.2d : 0.1d;
            if (iMin == 0) {
                d17 += 0.6d;
                if (i14 == 0) {
                    z14 = true;
                }
            } else if (Character.toString(strSubstring.charAt(iMin - 1)).equals(StringUtils.SPACE)) {
                d17 += 0.8d;
            }
            strSubstring = strSubstring.substring(iMin + 1);
            d15 += d17;
            i14++;
            d14 = d16;
        }
        double d18 = d15 / length2;
        double d19 = ((((length2 / length) * d18) + d18) / 2.0d) / d14;
        return (!z14 || d19 > 0.85d) ? d19 : d19 + 0.15d;
    }
}
