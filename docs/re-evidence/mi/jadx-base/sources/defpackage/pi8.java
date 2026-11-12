package defpackage;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class pi8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f30410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet<String> f30411b;
    public static String c;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("ExoPlayerLib/2.14.0 (Linux; Android ");
        sb.append(str);
        sb.append(") ");
        sb.append("ExoPlayerLib/2.14.0");
        f30410a = sb.toString();
        f30411b = new HashSet<>();
        c = "goog.exo.core";
    }

    public static synchronized void a(String str) {
        if (f30411b.add(str)) {
            String str2 = c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
            sb.append(str2);
            sb.append(", ");
            sb.append(str);
            c = sb.toString();
        }
    }

    public static synchronized String b() {
        return c;
    }
}
