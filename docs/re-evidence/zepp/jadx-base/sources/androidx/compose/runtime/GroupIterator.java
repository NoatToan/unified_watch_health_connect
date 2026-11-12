package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "validateRead", "", "hasNext", "next", "Landroidx/compose/runtime/SlotTable;", "table", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "", "end", LogUtil.I, "getEnd", "()I", "index", "version", "start", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
final class GroupIterator implements Iterator<CompositionGroup>, KMappedMarker {
    private final int end;
    private int index;

    @NotNull
    private final SlotTable table;
    private final int version;

    /* JADX INFO: renamed from: androidx.compose.runtime.GroupIterator$next$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0096\u0002R\u0016\u0010\u0006\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"androidx/compose/runtime/GroupIterator$next$1", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "", "iterator", "", "isEmpty", "()Z", "", "getKey", "()Ljava/lang/Object;", "key", "", "getSourceInfo", "()Ljava/lang/String;", "sourceInfo", "getNode", "node", "getData", "()Ljava/lang/Iterable;", "data", "getCompositionGroups", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
        public final /* synthetic */ int $group;

        public AnonymousClass1(int i) {
            this.$group = i;
        }

        @Override // androidx.compose.runtime.tooling.CompositionData
        @NotNull
        public Iterable<CompositionGroup> getCompositionGroups() {
            return this;
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @NotNull
        public Iterable<Object> getData() {
            return new GroupIterator$next$1$data$1(SlotTableKt.dataAnchor(GroupIterator.this.getTable().getGroups(), this.$group), this.$group + 1 < GroupIterator.this.getTable().getGroupsSize() ? SlotTableKt.dataAnchor(GroupIterator.this.getTable().getGroups(), this.$group + 1) : GroupIterator.this.getTable().getSlotsSize(), GroupIterator.this);
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @NotNull
        public Object getKey() {
            return SlotTableKt.hasObjectKey(GroupIterator.this.getTable().getGroups(), this.$group) ? GroupIterator.this.getTable().getSlots()[SlotTableKt.objectKeyIndex(GroupIterator.this.getTable().getGroups(), this.$group)] : Integer.valueOf(SlotTableKt.key(GroupIterator.this.getTable().getGroups(), this.$group));
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @Nullable
        public Object getNode() {
            if (SlotTableKt.isNode(GroupIterator.this.getTable().getGroups(), this.$group)) {
                return GroupIterator.this.getTable().getSlots()[SlotTableKt.nodeIndex(GroupIterator.this.getTable().getGroups(), this.$group)];
            }
            return null;
        }

        @Override // androidx.compose.runtime.tooling.CompositionGroup
        @Nullable
        public String getSourceInfo() {
            if (!SlotTableKt.hasAux(GroupIterator.this.getTable().getGroups(), this.$group)) {
                return null;
            }
            Object obj = GroupIterator.this.getTable().getSlots()[SlotTableKt.auxIndex(GroupIterator.this.getTable().getGroups(), this.$group)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        @Override // androidx.compose.runtime.tooling.CompositionData
        public boolean isEmpty() {
            return SlotTableKt.groupSize(GroupIterator.this.getTable().getGroups(), this.$group) == 0;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<CompositionGroup> iterator() {
            GroupIterator.this.validateRead();
            SlotTable table = GroupIterator.this.getTable();
            int i = this.$group;
            return new GroupIterator(table, i + 1, i + SlotTableKt.groupSize(GroupIterator.this.getTable().getGroups(), this.$group));
        }
    }

    public GroupIterator(@NotNull SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.end = i2;
        this.index = i;
        this.version = slotTable.getVersion();
        if (slotTable.getWriter()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateRead() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public CompositionGroup next() {
        validateRead();
        int i = this.index;
        this.index = SlotTableKt.groupSize(this.table.getGroups(), i) + i;
        return new AnonymousClass1(i);
    }
}
