package kotlin.text;

import java.nio.charset.Charset;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@JvmName(name = "CharsetsKt")
public final class CharsetsKt {
    @InlineOnly
    private static final Charset charset(String charsetName) {
        Intrinsics.checkNotNullParameter(charsetName, "charsetName");
        Charset charsetForName = Charset.forName(charsetName);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return charsetForName;
    }
}
