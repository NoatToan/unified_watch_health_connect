package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

/* JADX INFO: loaded from: classes2.dex */
public final class CharCodeKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char Char(int i) {
        if (i >= 0 && i <= 65535) {
            return (char) i;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i);
    }

    private static final int getCode(char c) {
        return c;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* synthetic */ void getCode$annotations(char c) {
    }
}
