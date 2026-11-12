package androidx.compose.runtime;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003J\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/GroupIterator$next$1$data$1", "", "", "", "iterator", "", "hasNext", "next", "", "index", LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class GroupIterator$next$1$data$1 implements Iterable<Object>, Iterator<Object>, KMappedMarker {
    public final /* synthetic */ int $end;
    public final /* synthetic */ int $start;
    private int index;
    public final /* synthetic */ GroupIterator this$0;

    public GroupIterator$next$1$data$1(int i, int i2, GroupIterator groupIterator) {
        this.$start = i;
        this.$end = i2;
        this.this$0 = groupIterator;
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$end;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        int i = this.index;
        Object obj = (i < 0 || i >= this.this$0.getTable().getSlots().length) ? null : this.this$0.getTable().getSlots()[this.index];
        setIndex(getIndex() + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
