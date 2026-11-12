package c22;

/* JADX INFO: loaded from: classes10.dex */
public class k2 {
    public static com.garmin.android.library.mapsdkadapter.f[] a(int i14, String str) {
        int i15;
        int i16;
        com.garmin.android.library.mapsdkadapter.f[] fVarArr = new com.garmin.android.library.mapsdkadapter.f[i14];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        while (i17 < str.length()) {
            try {
                int i25 = 0;
                int i26 = 0;
                while (true) {
                    i15 = i17 + 1;
                    int iCharAt = str.charAt(i17) - '?';
                    i25 |= (iCharAt & 31) << i26;
                    i26 += 5;
                    if (iCharAt < 32) {
                        break;
                    }
                    i17 = i15;
                }
                i18 += (i25 & 1) != 0 ? ~(i25 >> 1) : i25 >> 1;
                int i27 = 0;
                int i28 = 0;
                while (true) {
                    i16 = i15 + 1;
                    int iCharAt2 = str.charAt(i15) - '?';
                    i27 |= (iCharAt2 & 31) << i28;
                    i28 += 5;
                    if (iCharAt2 < 32) {
                        break;
                    }
                    i15 = i16;
                }
                int i29 = i27 & 1;
                int i30 = i27 >> 1;
                if (i29 != 0) {
                    i30 = ~i30;
                }
                i19 += i30;
                int i34 = i24 + 1;
                fVarArr[i24] = new com.garmin.android.library.mapsdkadapter.f(i18 / 100000.0f, i19 / 100000.0f, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                i24 = i34;
                i17 = i16;
            } catch (Exception e4) {
                com.garmin.android.apps.connectmobile.i2.i("PolylineDecoder", "decodePoints: " + e4.getMessage());
                return fVarArr;
            }
        }
        return fVarArr;
    }

    public static int[] b(String str) {
        int[] iArr = new int[str.length()];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            iArr[i15] = charArray[i14] - '?';
            i14++;
            i15++;
        }
        return iArr;
    }
}
