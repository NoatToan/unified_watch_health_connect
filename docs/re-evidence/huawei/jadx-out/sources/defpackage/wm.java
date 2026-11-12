package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes21.dex */
public final class wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Base64Variant f52172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Base64Variant f52173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Base64Variant f52174c;
    public static final Base64Variant e;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f52174c = base64Variant;
        e = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f52173b = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf(Marker.ANY_NON_NULL_MARKER), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        f52172a = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static Base64Variant d() {
        return e;
    }

    public static Base64Variant c(String str) throws IllegalArgumentException {
        String str2;
        Base64Variant base64Variant = f52174c;
        if (base64Variant.d.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = e;
        if (base64Variant2.d.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = f52173b;
        if (base64Variant3.d.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = f52172a;
        if (base64Variant4.d.equals(str)) {
            return base64Variant4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
