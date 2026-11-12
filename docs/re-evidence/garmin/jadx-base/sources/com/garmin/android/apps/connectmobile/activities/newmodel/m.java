package com.garmin.android.apps.connectmobile.activities.newmodel;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class m {
    public static String a(int i14, String str) {
        if (str == null) {
            return "";
        }
        try {
            if (i14 <= 0) {
                return i14 == 0 ? new DecimalFormat("#").format(Double.valueOf(str)) : new DecimalFormat().format(Double.valueOf(str));
            }
            StringBuilder sb3 = new StringBuilder("#.");
            for (int i15 = 0; i15 < i14; i15++) {
                sb3.append("0");
            }
            return new DecimalFormat(sb3.toString()).format(Double.valueOf(str));
        } catch (NullPointerException unused) {
            return "";
        } catch (NumberFormatException unused2) {
            return str;
        }
    }
}
