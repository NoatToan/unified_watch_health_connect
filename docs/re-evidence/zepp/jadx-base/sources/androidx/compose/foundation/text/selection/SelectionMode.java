package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\tj\u0002\b\u000fj\u0002\b\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "isSelected-2x9bVx0$foundation_release", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "isSelected", "areHandlesCrossed-2x9bVx0$foundation_release", "areHandlesCrossed", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 5, 1})
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: areHandlesCrossed-2x9bVx0$foundation_release */
        public boolean mo536areHandlesCrossed2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end) {
            if (Offset.m984getYimpl(start) < bounds.getTop() || Offset.m984getYimpl(start) >= bounds.getBottom() || Offset.m984getYimpl(end) < bounds.getTop() || Offset.m984getYimpl(end) >= bounds.getBottom()) {
                if (Offset.m984getYimpl(start) > Offset.m984getYimpl(end)) {
                    return true;
                }
            } else if (Offset.m983getXimpl(start) > Offset.m983getXimpl(end)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release */
        public boolean mo537isSelected2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end) {
            if (Offset.m984getYimpl(end) < bounds.getTop()) {
                return false;
            }
            if ((Offset.m983getXimpl(end) >= bounds.getLeft() || Offset.m984getYimpl(end) >= bounds.getBottom()) && Offset.m984getYimpl(start) < bounds.getBottom()) {
                return Offset.m983getXimpl(start) < bounds.getRight() || Offset.m984getYimpl(start) < bounds.getTop();
            }
            return false;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: areHandlesCrossed-2x9bVx0$foundation_release */
        public boolean mo536areHandlesCrossed2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end) {
            if (Offset.m983getXimpl(start) < bounds.getLeft() || Offset.m983getXimpl(start) >= bounds.getRight() || Offset.m983getXimpl(end) < bounds.getLeft() || Offset.m983getXimpl(end) >= bounds.getRight()) {
                if (Offset.m983getXimpl(start) > Offset.m983getXimpl(end)) {
                    return true;
                }
            } else if (Offset.m984getYimpl(start) > Offset.m984getYimpl(end)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release */
        public boolean mo537isSelected2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end) {
            if (Offset.m983getXimpl(end) < bounds.getLeft()) {
                return false;
            }
            if ((Offset.m984getYimpl(end) >= bounds.getTop() || Offset.m983getXimpl(end) >= bounds.getRight()) && Offset.m983getXimpl(start) < bounds.getRight()) {
                return Offset.m984getYimpl(start) < bounds.getBottom() || Offset.m983getXimpl(start) < bounds.getLeft();
            }
            return false;
        }
    };

    /* synthetic */ SelectionMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: areHandlesCrossed-2x9bVx0$foundation_release, reason: not valid java name */
    public abstract boolean mo536areHandlesCrossed2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public abstract boolean mo537isSelected2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end);
}
