package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import com.liulishuo.filedownloader.model.ConnectionModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000\u001a)\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0000ø\u0001\u0000\u001aG\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Offset;", "selectionCoordinates", "", "selectableId", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "", "isStartHandle", "getTextSelectionInfo", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "", "rawStartOffset", "rawEndOffset", "startPosition", "endPosition", "Landroidx/compose/ui/geometry/Rect;", "bounds", "lastOffset", "getRefinedSelectionRange-pGV3PM0", "(IIJJLandroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/text/TextRange;", "getRefinedSelectionRange", ConnectionModel.START_OFFSET, ConnectionModel.END_OFFSET, "handlesCrossed", "getAssembledSelectionInfo", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class MultiWidgetSelectionDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection getAssembledSelectionInfo(int i, int i2, boolean z, long j, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(i), i, j), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(i2 - 1, 0)), i2, j), z);
    }

    /* JADX INFO: renamed from: getRefinedSelectionRange-pGV3PM0, reason: not valid java name */
    private static final TextRange m506getRefinedSelectionRangepGV3PM0(int i, int i2, long j, long j2, Rect rect, int i3) {
        boolean z = i >= 0;
        boolean z2 = i2 >= 0;
        return z && z2 ? TextRange.m2712boximpl(TextRangeKt.TextRange(i, i2)) : TextSelectionDelegateKt.m550processCrossComposablexrVmA(j, j2, i, i2, i3, rect, z, z2);
    }

    @Nullable
    public static final Selection getTextSelectionInfo(@NotNull TextLayoutResult textLayoutResult, @NotNull Pair<Offset, Offset> pair, long j, @NotNull SelectionAdjustment selectionAdjustment, @Nullable Selection selection, boolean z) {
        TextRange textSelectionRange = getTextSelectionRange(textLayoutResult, pair);
        if (textSelectionRange == null) {
            return null;
        }
        long jM549adjustSelectionLepunE = TextSelectionDelegateKt.m549adjustSelectionLepunE(textLayoutResult, textSelectionRange.getPackedValue(), z, selection == null ? false : selection.getHandlesCrossed(), selectionAdjustment);
        return getAssembledSelectionInfo(TextRange.m2724getStartimpl(jM549adjustSelectionLepunE), TextRange.m2719getEndimpl(jM549adjustSelectionLepunE), TextRange.m2723getReversedimpl(jM549adjustSelectionLepunE), j, textLayoutResult);
    }

    public static /* synthetic */ Selection getTextSelectionInfo$default(TextLayoutResult textLayoutResult, Pair pair, long j, SelectionAdjustment selectionAdjustment, Selection selection, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            selection = null;
        }
        return getTextSelectionInfo(textLayoutResult, pair, j, selectionAdjustment, selection, (i & 32) != 0 ? true : z);
    }

    @Nullable
    public static final TextRange getTextSelectionRange(@NotNull TextLayoutResult textLayoutResult, @NotNull Pair<Offset, Offset> pair) {
        long packedValue = pair.getFirst().getPackedValue();
        long packedValue2 = pair.getSecond().getPackedValue();
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m3085getWidthimpl(textLayoutResult.getSize()), IntSize.m3084getHeightimpl(textLayoutResult.getSize()));
        int length = textLayoutResult.getLayoutInput().getText().getText().length();
        return m506getRefinedSelectionRangepGV3PM0(rect.m1009containsk4lQ0M(OffsetKt.Offset(Offset.m983getXimpl(packedValue), Offset.m984getYimpl(packedValue))) ? e.coerceIn(textLayoutResult.m2707getOffsetForPositionk4lQ0M(packedValue), 0, length) : -1, rect.m1009containsk4lQ0M(OffsetKt.Offset(Offset.m983getXimpl(packedValue2), Offset.m984getYimpl(packedValue2))) ? e.coerceIn(textLayoutResult.m2707getOffsetForPositionk4lQ0M(packedValue2), 0, length) : -1, packedValue, packedValue2, rect, length);
    }
}
