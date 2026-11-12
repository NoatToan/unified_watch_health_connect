package kotlin.text;

import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class a {
    @InlineOnly
    private static final boolean a(char c) {
        return Character.isDefined(c);
    }

    @InlineOnly
    private static final boolean b(char c) {
        return Character.isDigit(c);
    }

    @InlineOnly
    private static final boolean c(char c) {
        return Character.isHighSurrogate(c);
    }

    @PublishedApi
    public static int checkRadix(int i) {
        boolean z = false;
        if (2 <= i && i < 37) {
            z = true;
        }
        if (z) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }

    @InlineOnly
    private static final boolean d(char c) {
        return Character.isISOControl(c);
    }

    public static final int digitOf(char c, int i) {
        return Character.digit((int) c, i);
    }

    @InlineOnly
    private static final boolean e(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @InlineOnly
    private static final boolean f(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @InlineOnly
    private static final boolean g(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @NotNull
    public static final CharCategory getCategory(char c) {
        return CharCategory.Companion.valueOf(Character.getType(c));
    }

    @NotNull
    public static final CharDirectionality getDirectionality(char c) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality(c));
    }

    @InlineOnly
    private static final boolean h(char c) {
        return Character.isLetter(c);
    }

    @InlineOnly
    private static final boolean i(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static boolean isWhitespace(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @InlineOnly
    private static final boolean j(char c) {
        return Character.isLowSurrogate(c);
    }

    @InlineOnly
    private static final boolean k(char c) {
        return Character.isLowerCase(c);
    }

    @InlineOnly
    private static final boolean l(char c) {
        return Character.isTitleCase(c);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String lowercase(char c, @NotNull Locale locale) {
        return String.valueOf(c).toLowerCase(locale);
    }

    @InlineOnly
    private static final boolean m(char c) {
        return Character.isUpperCase(c);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String n(char c) {
        return String.valueOf(c).toLowerCase(Locale.ROOT);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char o(char c) {
        return Character.toLowerCase(c);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char p(char c) {
        return Character.toTitleCase(c);
    }

    @Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char q(char c) {
        return Character.toLowerCase(c);
    }

    @Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char r(char c) {
        return Character.toTitleCase(c);
    }

    @Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char s(char c) {
        return Character.toUpperCase(c);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String t(char c) {
        return String.valueOf(c).toUpperCase(Locale.ROOT);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String titlecase(char c, @NotNull Locale locale) {
        String strUppercase = uppercase(c, locale);
        if (strUppercase.length() <= 1) {
            return !Intrinsics.areEqual(strUppercase, String.valueOf(c).toUpperCase(Locale.ROOT)) ? strUppercase : String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return strUppercase;
        }
        return strUppercase.charAt(0) + strUppercase.substring(1).toLowerCase(Locale.ROOT);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char u(char c) {
        return Character.toUpperCase(c);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String uppercase(char c, @NotNull Locale locale) {
        return String.valueOf(c).toUpperCase(locale);
    }
}
