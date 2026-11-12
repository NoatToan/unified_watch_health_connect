package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\nR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-gBdvCQM", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)I", "process", "", "processCancel", "Landroidx/compose/ui/node/LayoutNode;", RootDescription.ROOT_ELEMENT, "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitResult", "Ljava/util/List;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class PointerInputEventProcessor {

    @NotNull
    private final HitPathTracker hitPathTracker;

    @NotNull
    private final LayoutNode root;

    @NotNull
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();

    @NotNull
    private final List<PointerInputFilter> hitResult = new ArrayList();

    public PointerInputEventProcessor(@NotNull LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    @NotNull
    public final LayoutNode getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: process-gBdvCQM, reason: not valid java name */
    public final int m2398processgBdvCQM(@NotNull PointerInputEvent pointerEvent, @NotNull PositionCalculator positionCalculator) {
        InternalPointerEvent internalPointerEventProduce = this.pointerInputChangeEventProducer.produce(pointerEvent, positionCalculator);
        for (PointerInputChange pointerInputChange : internalPointerEventProduce.getChanges().values()) {
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                getRoot().m2558hitTest3MmeM6k$ui_release(pointerInputChange.getPosition(), this.hitResult);
                if (true ^ this.hitResult.isEmpty()) {
                    this.hitPathTracker.m2367addHitPathKNwqfcY(pointerInputChange.getId(), this.hitResult);
                    this.hitResult.clear();
                }
            }
        }
        this.hitPathTracker.removeDetachedPointerInputFilters();
        boolean zDispatchChanges = this.hitPathTracker.dispatchChanges(internalPointerEventProduce);
        boolean z = false;
        for (PointerInputChange pointerInputChange2 : internalPointerEventProduce.getChanges().values()) {
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                this.hitPathTracker.m2368removeHitPath0FcD4WY(pointerInputChange2.getId());
            }
            if (PointerEventKt.positionChangeConsumed(pointerInputChange2)) {
                z = true;
            }
        }
        return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z);
    }

    public final void processCancel() {
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
