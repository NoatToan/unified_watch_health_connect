package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JM\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0010\u001a\u0004\u0018\u00010\tH&J(\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H&R\u0016\u0010\u001f\u001a\u00020\u001c8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/selection/Selectable;", "", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "endPosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "", "isStartHandle", "getSelection-Xn-YAUg", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Landroidx/compose/foundation/text/selection/Selection;", "getSelection", "getSelectAllSelection", "selection", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLayoutCoordinates", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "", "offset", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "", "getSelectableId", "()J", "selectableId", "foundation_release"}, k = 1, mv = {1, 5, 1})
public interface Selectable {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: getSelection-Xn-YAUg$default, reason: not valid java name */
        public static /* synthetic */ Selection m507getSelectionXnYAUg$default(Selectable selectable, long j, long j2, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, boolean z, int i, Object obj) {
            if (obj == null) {
                return selectable.mo505getSelectionXnYAUg(j, j2, layoutCoordinates, selectionAdjustment, (i & 16) != 0 ? null : selection, (i & 32) != 0 ? true : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSelection-Xn-YAUg");
        }
    }

    @NotNull
    Rect getBoundingBox(int offset);

    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU */
    long mo504getHandlePositiondBAh8RU(@NotNull Selection selection, boolean isStartHandle);

    @Nullable
    LayoutCoordinates getLayoutCoordinates();

    @Nullable
    Selection getSelectAllSelection();

    long getSelectableId();

    @Nullable
    /* JADX INFO: renamed from: getSelection-Xn-YAUg */
    Selection mo505getSelectionXnYAUg(long startPosition, long endPosition, @NotNull LayoutCoordinates containerLayoutCoordinates, @NotNull SelectionAdjustment adjustment, @Nullable Selection previousSelection, boolean isStartHandle);

    @NotNull
    AnnotatedString getText();
}
