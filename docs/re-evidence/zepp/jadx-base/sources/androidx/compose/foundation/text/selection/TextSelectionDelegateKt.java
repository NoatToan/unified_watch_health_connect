package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.e;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001aW\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "startPosition", "endPosition", "", "rawStartOffset", "rawEndOffset", "lastOffset", "Landroidx/compose/ui/geometry/Rect;", "bounds", "", "containsWholeSelectionStart", "containsWholeSelectionEnd", "Landroidx/compose/ui/text/TextRange;", "processCrossComposable-xrV--mA", "(JJIIILandroidx/compose/ui/geometry/Rect;ZZ)Landroidx/compose/ui/text/TextRange;", "processCrossComposable", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "textRange", "isStartHandle", "previousHandlesCrossed", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "adjustSelection-Le-punE", "(Landroidx/compose/ui/text/TextLayoutResult;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "adjustSelection", "offset", "ensureAtLeastOneChar", "(IIZZ)J", "isStart", "areHandlesCrossed", "getSelectionHandleCoordinates", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class TextSelectionDelegateKt {
    /* JADX INFO: renamed from: adjustSelection-Le-punE, reason: not valid java name */
    public static final long m549adjustSelectionLepunE(@NotNull TextLayoutResult textLayoutResult, long j, boolean z, boolean z2, @NotNull SelectionAdjustment selectionAdjustment) {
        int length = textLayoutResult.getLayoutInput().getText().getText().length();
        if (selectionAdjustment == SelectionAdjustment.NONE || length == 0) {
            return j;
        }
        if (selectionAdjustment == SelectionAdjustment.CHARACTER) {
            return !TextRange.m2718getCollapsedimpl(j) ? j : ensureAtLeastOneChar(TextRange.m2724getStartimpl(j), StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText()), z, z2);
        }
        Function1 textSelectionDelegateKt$adjustSelection$boundaryFun$1 = selectionAdjustment == SelectionAdjustment.WORD ? new TextSelectionDelegateKt$adjustSelection$boundaryFun$1(textLayoutResult) : new TextSelectionDelegateKt$adjustSelection$boundaryFun$2(textLayoutResult.getLayoutInput().getText().getText());
        int i = length - 1;
        long packedValue = ((TextRange) textSelectionDelegateKt$adjustSelection$boundaryFun$1.invoke(Integer.valueOf(e.coerceIn(TextRange.m2724getStartimpl(j), 0, i)))).getPackedValue();
        long packedValue2 = ((TextRange) textSelectionDelegateKt$adjustSelection$boundaryFun$1.invoke(Integer.valueOf(e.coerceIn(TextRange.m2719getEndimpl(j), 0, i)))).getPackedValue();
        return TextRangeKt.TextRange(TextRange.m2723getReversedimpl(j) ? TextRange.m2719getEndimpl(packedValue) : TextRange.m2724getStartimpl(packedValue), TextRange.m2723getReversedimpl(j) ? TextRange.m2724getStartimpl(packedValue2) : TextRange.m2719getEndimpl(packedValue2));
    }

    private static final long ensureAtLeastOneChar(int i, int i2, boolean z, boolean z2) {
        if (i2 == 0) {
            return TextRangeKt.TextRange(i, i);
        }
        if (i == 0) {
            return z ? TextRangeKt.TextRange(1, 0) : TextRangeKt.TextRange(0, 1);
        }
        if (i == i2) {
            return z ? TextRangeKt.TextRange(i2 - 1, i2) : TextRangeKt.TextRange(i2, i2 - 1);
        }
        if (z) {
            return !z2 ? TextRangeKt.TextRange(i - 1, i) : TextRangeKt.TextRange(i + 1, i);
        }
        return !z2 ? TextRangeKt.TextRange(i, i + 1) : TextRangeKt.TextRange(i, i - 1);
    }

    public static final long getSelectionHandleCoordinates(@NotNull TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        return OffsetKt.Offset(textLayoutResult.getHorizontalPosition(i, textLayoutResult.getBidiRunDirection(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == textLayoutResult.getParagraphDirection(i)), textLayoutResult.getLineBottom(textLayoutResult.getLineForOffset(i)));
    }

    @Nullable
    /* JADX INFO: renamed from: processCrossComposable-xrV--mA, reason: not valid java name */
    public static final TextRange m550processCrossComposablexrVmA(long j, long j2, int i, int i2, int i3, @NotNull Rect rect, boolean z, boolean z2) {
        int iMax;
        int iMax2;
        SelectionMode selectionMode = SelectionMode.Vertical;
        boolean zMo536areHandlesCrossed2x9bVx0$foundation_release = selectionMode.mo536areHandlesCrossed2x9bVx0$foundation_release(rect, j, j2);
        boolean zMo537isSelected2x9bVx0$foundation_release = selectionMode.mo537isSelected2x9bVx0$foundation_release(rect, zMo536areHandlesCrossed2x9bVx0$foundation_release ? j2 : j, zMo536areHandlesCrossed2x9bVx0$foundation_release ? j : j2);
        if (!zMo537isSelected2x9bVx0$foundation_release || z) {
            iMax = i;
        } else {
            iMax = zMo536areHandlesCrossed2x9bVx0$foundation_release ? Math.max(i3, 0) : 0;
        }
        if (!zMo537isSelected2x9bVx0$foundation_release || z2) {
            iMax2 = i2;
        } else {
            iMax2 = zMo536areHandlesCrossed2x9bVx0$foundation_release ? 0 : Math.max(i3, 0);
        }
        if (iMax == -1 || iMax2 == -1) {
            return null;
        }
        return TextRange.m2712boximpl(TextRangeKt.TextRange(iMax, iMax2));
    }
}
