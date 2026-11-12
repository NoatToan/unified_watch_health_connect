package uu;

import android.text.TextUtils;
import c22.p3;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class i0 {
    public static String a(Integer num, Integer num2, Long l14) {
        String strG = g();
        String strI = ((bv.d) KoinJavaComponent.get(bv.d.class)).i();
        String strF = f();
        ((c22.o) KoinJavaComponent.get(c22.o.class)).getClass();
        String strValueOf = String.valueOf(11657);
        if (num2 != null && num != null) {
            return String.format(Locale.US, "%s/%simages/badges/%s/art_badge_challenge_category_%d_%d.png?appVer=".concat(strValueOf), strI, strF, strG, num, num2);
        }
        if (l14 != null) {
            return String.format(Locale.US, "%s/%simages/badges/%s/art_badge_challenge_%d.png?appVer=".concat(strValueOf), strI, strF, strG, l14);
        }
        return null;
    }

    public static String b(int i14, String str) {
        return c(i14, str, g(), true);
    }

    public static String c(int i14, String str, String str2, boolean z14) {
        String strI = ((bv.d) KoinJavaComponent.get(bv.d.class)).i();
        String strF = f();
        ((c22.o) KoinJavaComponent.get(c22.o.class)).getClass();
        String strConcat = (z14 ? "%s/%simages/badges/%s/badge_%s_sml.png?appVer=" : "%s/%simages/badges/%s/badge_%s_lrg.png?appVer=").concat(String.valueOf(11657));
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(i14);
        }
        return String.format(Locale.US, strConcat, strI, strF, str2, str);
    }

    public static String d(int i14) {
        return e(i14, g(), true);
    }

    public static String e(int i14, String str, boolean z14) {
        return String.format(Locale.US, z14 ? "%s/images/vivofitjr/avatars/%s/avatar_%d_sml.png" : "%s/images/vivofitjr/avatars/%s/avatar_%d_lrg.png", ((bv.d) KoinJavaComponent.get(bv.d.class)).i(), str, Integer.valueOf(i14));
    }

    public static String f() {
        return ((c22.k) KoinJavaComponent.get(c22.k.class)).c("cloudinary_images_enabled") ? "" : "web-";
    }

    public static String g() {
        int iF = ((c22.o) KoinJavaComponent.get(c22.o.class)).f();
        if (iF <= 160) {
            return p3.MDPI.f23201a;
        }
        if (iF <= 240) {
            return p3.HDPI.f23201a;
        }
        return iF <= 320 ? p3.XHDPI.f23201a : p3.XXHDPI.f23201a;
    }
}
