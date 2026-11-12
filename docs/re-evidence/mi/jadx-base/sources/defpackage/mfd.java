package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum mfd {
    LINEAR,
    EASE_IN,
    EASE_OUT,
    EASE_IN_EASE_OUT,
    SPRING;

    public static mfd a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "easeout":
                return EASE_OUT;
            case "easein":
                return EASE_IN;
            case "linear":
                return LINEAR;
            case "spring":
                return SPRING;
            case "easeineaseout":
                return EASE_IN_EASE_OUT;
            default:
                throw new IllegalArgumentException("Unsupported interpolation type : " + str);
        }
    }
}
