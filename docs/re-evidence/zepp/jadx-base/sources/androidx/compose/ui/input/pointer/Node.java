package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.huami.watch.notification.TransportUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J/\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000J\b\u0010\f\u001a\u00020\nH\u0002J\u0017\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0082\bJ/\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0019\u0010\u0017\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040 8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "buildCache", "clearCache", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "", "dispatchIfNeeded", "dispatchMainEventPass", "dispatchFinalEventPass", "dispatchCancel", "", "toString", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/runtime/collection/MutableVector;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "", "relevantChanges", "Ljava/util/Map;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "<init>", "(Landroidx/compose/ui/input/pointer/PointerInputFilter;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class Node extends NodeParent {

    @Nullable
    private LayoutCoordinates coordinates;

    @Nullable
    private PointerEvent pointerEvent;

    @NotNull
    private final PointerInputFilter pointerInputFilter;

    @NotNull
    private final MutableVector<PointerId> pointerIds = new MutableVector<>(new PointerId[16], 0);

    @NotNull
    private final Map<PointerId, PointerInputChange> relevantChanges = new LinkedHashMap();

    public Node(@NotNull PointerInputFilter pointerInputFilter) {
        this.pointerInputFilter = pointerInputFilter;
    }

    private final void buildCache(Map<PointerId, PointerInputChange> changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent) {
        if (this.pointerInputFilter.isAttached$ui_release()) {
            this.coordinates = this.pointerInputFilter.getLayoutCoordinates();
            for (Map.Entry<PointerId, PointerInputChange> entry : changes.entrySet()) {
                long jM2380unboximpl = entry.getKey().m2380unboximpl();
                PointerInputChange value = entry.getValue();
                if (this.pointerIds.contains(PointerId.m2374boximpl(jM2380unboximpl))) {
                    this.relevantChanges.put(PointerId.m2374boximpl(jM2380unboximpl), value.m2382copyEzrO64((475 & 1) != 0 ? value.getId() : 0L, (475 & 2) != 0 ? value.uptimeMillis : 0L, (475 & 4) != 0 ? value.getPosition() : this.coordinates.mo2481localPositionOfR5De75A(parentCoordinates, value.getPosition()), (475 & 8) != 0 ? value.pressed : false, (475 & 16) != 0 ? value.previousUptimeMillis : 0L, (475 & 32) != 0 ? value.getPreviousPosition() : this.coordinates.mo2481localPositionOfR5De75A(parentCoordinates, value.getPreviousPosition()), (475 & 64) != 0 ? value.previousPressed : false, (475 & 128) != 0 ? value.consumed : null, (475 & 256) != 0 ? value.getType() : 0));
                }
            }
            if (this.relevantChanges.isEmpty()) {
                return;
            }
            this.pointerEvent = new PointerEvent((List<PointerInputChange>) CollectionsKt___CollectionsKt.toList(this.relevantChanges.values()), internalPointerEvent);
        }
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
        this.pointerEvent = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> block) {
        if (this.relevantChanges.isEmpty() || !getPointerInputFilter().isAttached$ui_release()) {
            return false;
        }
        block.invoke();
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            int i = 0;
            Node[] content = children.getContent();
            do {
                content[i].dispatchCancel();
                i++;
            } while (i < size);
        }
        this.pointerInputFilter.onCancel();
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass() {
        MutableVector<Node> children;
        int size;
        boolean z = true;
        int i = 0;
        if (!this.relevantChanges.isEmpty() && getPointerInputFilter().isAttached$ui_release()) {
            getPointerInputFilter().mo2400onPointerEventH0pRuoY(this.pointerEvent, PointerEventPass.Final, this.coordinates.mo2480getSizeYbymL2g());
            if (getPointerInputFilter().isAttached$ui_release() && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i].dispatchFinalEventPass();
                    i++;
                } while (i < size);
            }
        } else {
            z = false;
        }
        clearCache();
        return z;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        buildCache(changes, parentCoordinates, internalPointerEvent);
        int i = 0;
        if (this.relevantChanges.isEmpty() || !getPointerInputFilter().isAttached$ui_release()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        long jMo2480getSizeYbymL2g = this.coordinates.mo2480getSizeYbymL2g();
        getPointerInputFilter().mo2400onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo2480getSizeYbymL2g);
        if (getPointerInputFilter().isAttached$ui_release() && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            do {
                content[i].dispatchMainEventPass(this.relevantChanges, this.coordinates, internalPointerEvent);
                i++;
            } while (i < size);
        }
        if (!getPointerInputFilter().isAttached$ui_release()) {
            return true;
        }
        getPointerInputFilter().mo2400onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo2480getSizeYbymL2g);
        return true;
    }

    @NotNull
    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    @NotNull
    public final PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
