package h22;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static String a(Typeface typeface) {
        if (typeface == null) {
            return "font/roboto_light.ttf";
        }
        if (typeface.isBold() && typeface.isItalic()) {
            return "font/roboto_italic.ttf";
        }
        if (typeface.isBold()) {
            return "font/roboto_regular.ttf";
        }
        return typeface.isItalic() ? "font/roboto_lightitalic.ttf" : "font/roboto_light.ttf";
    }
}
