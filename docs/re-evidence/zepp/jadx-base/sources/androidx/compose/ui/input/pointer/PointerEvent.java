package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0010\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0018\u0010\u001cB\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0018\u0010\u001dJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "component1", "Landroid/view/MotionEvent;", "component2$ui_release", "()Landroid/view/MotionEvent;", "component2", "changes", "motionEvent", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getChanges", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "getMotionEvent$ui_release", "<init>", "(Ljava/util/List;Landroid/view/MotionEvent;)V", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PointerEvent {
    public static final int $stable = 8;

    @NotNull
    private final List<PointerInputChange> changes;

    @Nullable
    private final MotionEvent motionEvent;

    public PointerEvent(@NotNull List<PointerInputChange> list, @Nullable MotionEvent motionEvent) {
        this.changes = list;
        this.motionEvent = motionEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PointerEvent copy$default(PointerEvent pointerEvent, List list, MotionEvent motionEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pointerEvent.changes;
        }
        if ((i & 2) != 0) {
            motionEvent = pointerEvent.motionEvent;
        }
        return pointerEvent.copy(list, motionEvent);
    }

    @NotNull
    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$ui_release, reason: from getter */
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    @NotNull
    public final PointerEvent copy(@NotNull List<PointerInputChange> changes, @Nullable MotionEvent motionEvent) {
        return new PointerEvent(changes, motionEvent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerEvent)) {
            return false;
        }
        PointerEvent pointerEvent = (PointerEvent) other;
        return Intrinsics.areEqual(this.changes, pointerEvent.changes) && Intrinsics.areEqual(this.motionEvent, pointerEvent.motionEvent);
    }

    @NotNull
    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    @Nullable
    public final MotionEvent getMotionEvent$ui_release() {
        return this.motionEvent;
    }

    public int hashCode() {
        int iHashCode = this.changes.hashCode() * 31;
        MotionEvent motionEvent = this.motionEvent;
        return iHashCode + (motionEvent == null ? 0 : motionEvent.hashCode());
    }

    @NotNull
    public String toString() {
        return "PointerEvent(changes=" + this.changes + ", motionEvent=" + this.motionEvent + ')';
    }

    public PointerEvent(@NotNull List<PointerInputChange> list, @Nullable InternalPointerEvent internalPointerEvent) {
        this(list, internalPointerEvent == null ? null : internalPointerEvent.getMotionEvent());
    }

    public PointerEvent(@NotNull List<PointerInputChange> list) {
        this(list, (MotionEvent) null);
    }
}
