package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class oks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f29262a;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        f29262a = sb.toString();
    }

    public static void a() {
        e(f29262a);
        e("当前使用的自定义地图样式文件和目前版本不匹配，请到官网(lbs.amap.com)更新新版样式文件");
        e(f29262a);
    }

    public static void b(Context context, String str) {
        e(f29262a);
        if (context != null) {
            d("key:" + e0t.k(context));
        }
        e(str);
        e(f29262a);
    }

    public static void c(String str) {
        e(f29262a);
        e(str);
        e(f29262a);
    }

    public static void d(String str) {
        if (str.length() >= 78) {
            e("|" + str.substring(0, 78) + "|");
            d(str.substring(78));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        sb.append(str);
        for (int i = 0; i < 78 - str.length(); i++) {
            sb.append(" ");
        }
        sb.append("|");
        e(sb.toString());
    }

    public static void e(String str) {
    }
}
