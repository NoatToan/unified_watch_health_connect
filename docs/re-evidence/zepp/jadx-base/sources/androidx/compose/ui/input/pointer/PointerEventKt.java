package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a \u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0000\u001a\n\u0010\u0013\u001a\u00020\u0011*\u00020\u0000\u001a\n\u0010\u0014\u001a\u00020\u0011*\u00020\u0000\u001a\u001f\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "ignoreConsumed", "positionChangeInternal", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChangeConsumed", "anyChangeConsumed", "", "consumeDownChange", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", "size", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        return positionChangeConsumed(pointerInputChange) || pointerInputChange.getConsumed().getDownChange();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        return (pointerInputChange.getConsumed().getDownChange() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        return (pointerInputChange.getConsumed().getDownChange() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        consumeDownChange(pointerInputChange);
        consumePositionChange(pointerInputChange);
    }

    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.getConsumed().setDownChange(true);
        }
    }

    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        if (Offset.m980equalsimpl0(positionChange(pointerInputChange), Offset.INSTANCE.m999getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.getConsumed().setPositionChange(true);
    }

    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m2373isOutOfBoundsO0kMr_c(@NotNull PointerInputChange pointerInputChange, long j) {
        long position = pointerInputChange.getPosition();
        float fM983getXimpl = Offset.m983getXimpl(position);
        float fM984getYimpl = Offset.m984getYimpl(position);
        return fM983getXimpl < 0.0f || fM983getXimpl > ((float) IntSize.m3085getWidthimpl(j)) || fM984getYimpl < 0.0f || fM984getYimpl > ((float) IntSize.m3084getHeightimpl(j));
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.getConsumed().getPositionChange();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long jM987minusMKHz9U = Offset.m987minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition());
        return (z || !pointerInputChange.getConsumed().getPositionChange()) ? jM987minusMKHz9U : Offset.INSTANCE.m999getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        return !Offset.m980equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.INSTANCE.m999getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return !Offset.m980equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.INSTANCE.m999getZeroF1C5BW0());
    }
}
