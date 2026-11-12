package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "updateRangeAfterDelete", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m2781updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM2720getLengthimpl;
        int iM2722getMinimpl = TextRange.m2722getMinimpl(j);
        int iM2721getMaximpl = TextRange.m2721getMaximpl(j);
        if (TextRange.m2726intersects5zctL8(j2, j)) {
            if (TextRange.m2714contains5zctL8(j2, j)) {
                iM2722getMinimpl = TextRange.m2722getMinimpl(j2);
                iM2721getMaximpl = iM2722getMinimpl;
            } else {
                if (TextRange.m2714contains5zctL8(j, j2)) {
                    iM2720getLengthimpl = TextRange.m2720getLengthimpl(j2);
                } else if (TextRange.m2715containsimpl(j2, iM2722getMinimpl)) {
                    iM2722getMinimpl = TextRange.m2722getMinimpl(j2);
                    iM2720getLengthimpl = TextRange.m2720getLengthimpl(j2);
                } else {
                    iM2721getMaximpl = TextRange.m2722getMinimpl(j2);
                }
                iM2721getMaximpl -= iM2720getLengthimpl;
            }
        } else if (iM2721getMaximpl > TextRange.m2722getMinimpl(j2)) {
            iM2722getMinimpl -= TextRange.m2720getLengthimpl(j2);
            iM2720getLengthimpl = TextRange.m2720getLengthimpl(j2);
            iM2721getMaximpl -= iM2720getLengthimpl;
        }
        return TextRangeKt.TextRange(iM2722getMinimpl, iM2721getMaximpl);
    }
}
