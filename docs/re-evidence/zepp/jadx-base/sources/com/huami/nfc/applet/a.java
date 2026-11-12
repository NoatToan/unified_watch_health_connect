package com.huami.nfc.applet;

/* JADX INFO: loaded from: classes7.dex */
class a {
    private static final int a = 1024;
    private static final int b = 1048576;
    private static final int c = 1073741824;

    public static boolean a(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return "".equals(str.replaceAll(" ", "").trim().trim());
    }

    public static String b(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(i));
        int length = i2 - sb.length();
        if (length > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                sb.insert(0, str);
            }
        }
        return sb.toString();
    }
}
