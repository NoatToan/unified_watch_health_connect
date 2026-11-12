package com.fasterxml.jackson.core;

import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Base64Variant f7623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Base64Variant f7624b;
    public static final Base64Variant c;
    public static final Base64Variant d;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f7623a = base64Variant;
        f7624b = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        c = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf(Marker.ANY_NON_NULL_MARKER), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        d = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static Base64Variant a() {
        return f7624b;
    }

    public static Base64Variant b(String str) throws IllegalArgumentException {
        String str2;
        Base64Variant base64Variant = f7623a;
        if (base64Variant._name.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = f7624b;
        if (base64Variant2._name.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = c;
        if (base64Variant3._name.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = d;
        if (base64Variant4._name.equals(str)) {
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
