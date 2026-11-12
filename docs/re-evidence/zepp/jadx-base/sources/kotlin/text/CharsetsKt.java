package kotlin.text;

import java.nio.charset.Charset;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes23.dex */
@JvmName(name = "CharsetsKt")
public final class CharsetsKt {
    @InlineOnly
    private static final Charset a(String str) {
        return Charset.forName(str);
    }
}
