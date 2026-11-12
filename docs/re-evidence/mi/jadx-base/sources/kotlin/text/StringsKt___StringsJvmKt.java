package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1244#2,14:109\n1526#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
class StringsKt___StringsJvmKt extends StringsKt__StringsKt {
    @InlineOnly
    private static final char elementAt(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character max(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.maxOrNull(charSequence);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke3 = selector.invoke2(Character.valueOf(cCharAt2));
                if (rInvoke2.compareTo(rInvoke3) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.maxWithOrNull(charSequence, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character min(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.minOrNull(charSequence);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke2 = selector.invoke2(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke3 = selector.invoke2(Character.valueOf(cCharAt2));
                if (rInvoke2.compareTo(rInvoke3) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke2 = rInvoke3;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.minWithOrNull(charSequence, comparator);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(CharSequence charSequence, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (int i = 0; i < charSequence.length(); i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke2(Character.valueOf(charSequence.charAt(i))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(CharSequence charSequence, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (int i = 0; i < charSequence.length(); i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke2(Character.valueOf(charSequence.charAt(i))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) StringsKt___StringsKt.toCollection(charSequence, new TreeSet());
    }
}
