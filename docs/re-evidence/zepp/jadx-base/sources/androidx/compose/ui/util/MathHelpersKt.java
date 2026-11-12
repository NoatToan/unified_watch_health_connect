package androidx.compose.ui.util;

import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import kotlin.math.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¨\u0006\u0007"}, d2 = {"", "start", Command.STOP, "fraction", "lerp", "", "", "ui-util_release"}, k = 2, mv = {1, 5, 1})
public final class MathHelpersKt {
    public static final float lerp(float f, float f2, float f3) {
        return ((1 - f3) * f) + (f3 * f2);
    }

    public static final int lerp(int i, int i2, float f) {
        return i + c.roundToInt(((double) (i2 - i)) * ((double) f));
    }

    public static final long lerp(long j, long j2, float f) {
        return j + c.roundToLong((j2 - j) * ((double) f));
    }
}
