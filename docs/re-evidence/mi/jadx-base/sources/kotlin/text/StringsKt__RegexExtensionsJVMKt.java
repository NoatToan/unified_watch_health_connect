package kotlin.text;

import java.util.regex.Pattern;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
class StringsKt__RegexExtensionsJVMKt extends StringsKt__IndentKt {
    @InlineOnly
    private static final Regex toRegex(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "<this>");
        return new Regex(pattern);
    }
}
