package com.huami.training.ui.entrance;

import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\u0011\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/training/ui/entrance/AdapterDataObserverProxy;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "", "onChanged", "", "positionStart", "itemCount", "onItemRangeChanged", "", "payload", "onItemRangeInserted", "onItemRangeRemoved", "fromPosition", "toPosition", "onItemRangeMoved", "a", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "adapterDataObserver", "b", LogUtil.I, "headCount", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;I)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class AdapterDataObserverProxy extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView.AdapterDataObserver adapterDataObserver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int headCount;

    public AdapterDataObserverProxy(@NotNull RecyclerView.AdapterDataObserver adapterDataObserver, int i) {
        this.adapterDataObserver = adapterDataObserver;
        this.headCount = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        this.adapterDataObserver.onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int positionStart, int itemCount) {
        this.adapterDataObserver.onItemRangeChanged(positionStart + this.headCount, itemCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int positionStart, int itemCount) {
        this.adapterDataObserver.onItemRangeInserted(positionStart + this.headCount, itemCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
        int i = this.headCount;
        super.onItemRangeMoved(fromPosition + i, toPosition + i, itemCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int positionStart, int itemCount) {
        this.adapterDataObserver.onItemRangeRemoved(positionStart + this.headCount, itemCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int positionStart, int itemCount, @Nullable Object payload) {
        this.adapterDataObserver.onItemRangeChanged(positionStart + this.headCount, itemCount, payload);
    }
}
