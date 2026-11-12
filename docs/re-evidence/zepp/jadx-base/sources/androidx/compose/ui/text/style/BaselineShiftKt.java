package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "start", Command.STOP, "", "fraction", "lerp-jWV1Mfo", "(FFF)F", "lerp", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class BaselineShiftKt {
    @Stable
    /* JADX INFO: renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m2883lerpjWV1Mfo(float f, float f2, float f3) {
        return BaselineShift.m2871constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }
}
