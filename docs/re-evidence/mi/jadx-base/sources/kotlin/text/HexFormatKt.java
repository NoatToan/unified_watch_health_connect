package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,844:1\n1088#2,2:845\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:845,2\n*E\n"})
public final class HexFormatKt {
    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final HexFormat HexFormat(Function1<? super HexFormat.Builder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        HexFormat.Builder builder = new HexFormat.Builder();
        builderAction.invoke(builder);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCaseSensitive(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
