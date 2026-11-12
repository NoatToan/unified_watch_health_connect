package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\r\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "rawStartOffset", "rawEndOffset", "Landroidx/compose/ui/text/TextRange;", "previousSelection", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "getTextFieldSelection-bb3KNj8", "(Landroidx/compose/ui/text/TextLayoutResult;IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "getTextFieldSelection", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class TextFieldSelectionDelegateKt {
    /* JADX INFO: renamed from: getTextFieldSelection-bb3KNj8, reason: not valid java name */
    public static final long m541getTextFieldSelectionbb3KNj8(@Nullable TextLayoutResult textLayoutResult, int i, int i2, @Nullable TextRange textRange, boolean z, @NotNull SelectionAdjustment selectionAdjustment) {
        if (textLayoutResult == null) {
            return TextRangeKt.TextRange(0, 0);
        }
        long jTextRange = TextRangeKt.TextRange(i, i2);
        if (textRange == null && selectionAdjustment == SelectionAdjustment.CHARACTER) {
            return jTextRange;
        }
        return TextSelectionDelegateKt.m549adjustSelectionLepunE(textLayoutResult, jTextRange, z, textRange == null ? false : TextRange.m2723getReversedimpl(textRange.getPackedValue()), selectionAdjustment);
    }
}
