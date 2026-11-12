package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
public final class CharCodeJVMKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char a(short s) {
        return (char) (s & UShort.MAX_VALUE);
    }
}
