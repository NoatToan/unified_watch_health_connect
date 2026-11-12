package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final class ofc {
    public static String a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str).length());
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static String b(int i) {
        return wlq.D("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }
}
