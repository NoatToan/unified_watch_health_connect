package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilters", "", "addHitPath-KNwqfcY", "(JLjava/util/List;)V", "addHitPath", "removeHitPath-0FcD4WY", "(J)V", "removeHitPath", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "dispatchChanges", "processCancel", "removeDetachedPointerInputFilters", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/input/pointer/NodeParent;", RootDescription.ROOT_ELEMENT, "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class HitPathTracker {

    @NotNull
    private final NodeParent root = new NodeParent();

    @NotNull
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(@NotNull LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    /* JADX INFO: renamed from: addHitPath-KNwqfcY, reason: not valid java name */
    public final void m2367addHitPathKNwqfcY(long pointerId, @NotNull List<? extends PointerInputFilter> pointerInputFilters) {
        Node node;
        NodeParent nodeParent = this.root;
        int size = pointerInputFilters.size() - 1;
        if (size < 0) {
            return;
        }
        boolean z = true;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            PointerInputFilter pointerInputFilter = pointerInputFilters.get(i);
            if (z) {
                MutableVector<Node> children = nodeParent.getChildren();
                int size2 = children.getSize();
                if (size2 <= 0) {
                    node = null;
                    break;
                }
                Node[] content = children.getContent();
                int i3 = 0;
                while (true) {
                    node = content[i3];
                    if (Intrinsics.areEqual(node.getPointerInputFilter(), pointerInputFilter)) {
                        break;
                    }
                    i3++;
                    if (i3 >= size2) {
                        node = null;
                        break;
                    }
                }
                Node node2 = node;
                if (node2 != null) {
                    if (!node2.getPointerIds().contains(PointerId.m2374boximpl(pointerId))) {
                        node2.getPointerIds().add(PointerId.m2374boximpl(pointerId));
                    }
                    nodeParent = node2;
                } else {
                    z = false;
                    Node node3 = new Node(pointerInputFilter);
                    node3.getPointerIds().add(PointerId.m2374boximpl(pointerId));
                    nodeParent.getChildren().add(node3);
                    nodeParent = node3;
                }
            } else {
                Node node4 = new Node(pointerInputFilter);
                node4.getPointerIds().add(PointerId.m2374boximpl(pointerId));
                nodeParent.getChildren().add(node4);
                nodeParent = node4;
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final boolean dispatchChanges(@NotNull InternalPointerEvent internalPointerEvent) {
        return this.root.dispatchFinalEventPass() || this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent);
    }

    @NotNull
    /* JADX INFO: renamed from: getRoot$ui_release, reason: from getter */
    public final NodeParent getRoot() {
        return this.root;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }

    /* JADX INFO: renamed from: removeHitPath-0FcD4WY, reason: not valid java name */
    public final void m2368removeHitPath0FcD4WY(long pointerId) {
        this.root.m2372recursivelyRemovePointerId0FcD4WY(pointerId);
    }
}
