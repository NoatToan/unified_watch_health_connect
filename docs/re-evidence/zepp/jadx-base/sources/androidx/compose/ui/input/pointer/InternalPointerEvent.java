package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fB(\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0012R(\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Ljava/util/Map;", "getChanges", "()Ljava/util/Map;", "Landroid/view/MotionEvent;", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "<init>", "(Ljava/util/Map;Landroid/view/MotionEvent;)V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerInputEvent", "(Ljava/util/Map;Landroidx/compose/ui/input/pointer/PointerInputEvent;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class InternalPointerEvent {

    @NotNull
    private final Map<PointerId, PointerInputChange> changes;

    @NotNull
    private final MotionEvent motionEvent;

    public InternalPointerEvent(@NotNull Map<PointerId, PointerInputChange> map, @NotNull MotionEvent motionEvent) {
        this.changes = map;
        this.motionEvent = motionEvent;
    }

    @NotNull
    public final Map<PointerId, PointerInputChange> getChanges() {
        return this.changes;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public InternalPointerEvent(@NotNull Map<PointerId, PointerInputChange> map, @NotNull PointerInputEvent pointerInputEvent) {
        this(map, pointerInputEvent.getMotionEvent());
    }
}
