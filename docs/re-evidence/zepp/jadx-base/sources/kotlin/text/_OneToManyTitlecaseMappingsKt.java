package kotlin.text;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class _OneToManyTitlecaseMappingsKt {
    @NotNull
    public static final String titlecaseImpl(char c) {
        String strValueOf = String.valueOf(c);
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(locale);
    }
}
