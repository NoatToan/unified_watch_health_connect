package androidx.paging.multicast;

import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/paging/multicast/BufferImpl;", "T", "Landroidx/paging/multicast/Buffer;", "limit", "", "(I)V", "items", "Ljava/util/ArrayDeque;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch$Value;", "getItems", "()Ljava/util/ArrayDeque;", "add", "", "item", "paging-common"}, k = 1, mv = {1, 4, 2})
final class BufferImpl<T> implements Buffer<T> {

    @NotNull
    private final ArrayDeque<ChannelManager.Message.Dispatch.Value<T>> items;
    private final int limit;

    public BufferImpl(int i) {
        this.limit = i;
        this.items = new ArrayDeque<>(RangesKt___RangesKt.coerceAtMost(i, 10));
    }

    @Override // androidx.paging.multicast.Buffer
    public void add(@NotNull ChannelManager.Message.Dispatch.Value<T> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        while (getItems().size() >= this.limit) {
            getItems().pollFirst();
        }
        getItems().offerLast(item);
    }

    @Override // androidx.paging.multicast.Buffer
    public boolean isEmpty() {
        return Buffer.DefaultImpls.isEmpty(this);
    }

    @Override // androidx.paging.multicast.Buffer
    @NotNull
    public ArrayDeque<ChannelManager.Message.Dispatch.Value<T>> getItems() {
        return this.items;
    }
}
