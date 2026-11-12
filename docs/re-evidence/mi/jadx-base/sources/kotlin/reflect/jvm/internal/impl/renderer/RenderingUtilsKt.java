package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,78:1\n1088#2,2:79\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n30#1:79,2\n*E\n"})
public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (!shouldBeEscaped(name)) {
            String strAsString = name.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            return strAsString;
        }
        StringBuilder sb = new StringBuilder();
        String strAsString2 = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
        sb.append('`' + strAsString2);
        sb.append('`');
        return sb.toString();
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render(name));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public static final String replacePrefixesInTypeRepresentations(@NotNull String lowerRendered, @NotNull String lowerPrefix, @NotNull String upperRendered, @NotNull String upperPrefix, @NotNull String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (StringsKt__StringsJVMKt.startsWith$default(lowerRendered, lowerPrefix, false, 2, null) && StringsKt__StringsJVMKt.startsWith$default(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (Intrinsics.areEqual(strSubstring, strSubstring2)) {
                return str;
            }
            if (typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean shouldBeEscaped(Name name) {
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        if (!KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            for (int i = 0; i < strAsString.length(); i++) {
                char cCharAt = strAsString.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strAsString.length() != 0 && Character.isJavaIdentifierStart(strAsString.codePointAt(0))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x003e, please report this as an issue */
    public static final boolean typeStringsDifferOnlyInNullability(@NotNull String lower, @NotNull String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (!Intrinsics.areEqual(lower, StringsKt__StringsJVMKt.replace$default(upper, "?", "", false, 4, (Object) null))) {
            if (StringsKt__StringsJVMKt.endsWith$default(upper, "?", false, 2, null)) {
                if (!Intrinsics.areEqual(lower + '?', upper)) {
                    if (Intrinsics.areEqual('(' + lower + ")?", upper)) {
                        return false;
                    }
                }
            } else {
                if (Intrinsics.areEqual('(' + lower + ")?", upper)) {
                    return false;
                }
            }
        }
        return true;
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "<this>");
        List<Name> listPathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkNotNullExpressionValue(listPathSegments, "pathSegments(...)");
        return renderFqName(listPathSegments);
    }
}
