package c22;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d53.k f23305a = new d53.k("[\\s,-]+");

    public static final int a(String str, String str2) {
        String str3;
        String str4;
        str.getClass();
        str2.getClass();
        if (str.equals(str2)) {
            return 0;
        }
        if (str.length() == 0) {
            return str2.length();
        }
        if (str2.length() == 0) {
            return str.length();
        }
        if (str.length() > str2.length()) {
            str4 = str;
            str3 = str2;
        } else {
            str3 = str;
            str4 = str2;
        }
        int length = str3.length() + 1;
        int[] iArr = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = i14;
        }
        int length2 = str4.length();
        int i15 = 0;
        while (i15 < length2) {
            int i16 = i15 + 1;
            int length3 = str3.length();
            int i17 = 0;
            int i18 = i16;
            while (i17 < length3) {
                int i19 = i17 + 1;
                int iMin = Math.min(iArr[i19] + 1, Math.min(i18 + 1, iArr[i17] + (!d53.b.d(str3.charAt(i17), str4.charAt(i15), true) ? 1 : 0)));
                iArr[i17] = i18;
                i18 = iMin;
                i17 = i19;
            }
            iArr[str3.length()] = i18;
            i15 = i16;
        }
        return iArr[str3.length()];
    }
}
