package com.chad.library.adapter.base.diff;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.ghe;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahListUpdateCallback;", "Lghe;", "", "position", "count", "", "onInserted", "(II)V", "onRemoved", "fromPosition", "toPosition", "onMoved", "", TSMAuthContants.PARAM_PAYLOAD, "onChanged", "(IILjava/lang/Object;)V", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "mAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public final class BrvahListUpdateCallback implements ghe {
    private final BaseQuickAdapter<?, ?> mAdapter;

    public BrvahListUpdateCallback(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        this.mAdapter = baseQuickAdapter;
    }

    @Override // defpackage.ghe
    public void onChanged(int position, int count, @Nullable Object payload) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeChanged(position + baseQuickAdapter.getHeaderLayoutCount(), count, payload);
    }

    @Override // defpackage.ghe
    public void onInserted(int position, int count) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeInserted(position + baseQuickAdapter.getHeaderLayoutCount(), count);
    }

    @Override // defpackage.ghe
    public void onMoved(int fromPosition, int toPosition) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemMoved(fromPosition + baseQuickAdapter.getHeaderLayoutCount(), toPosition + this.mAdapter.getHeaderLayoutCount());
    }

    @Override // defpackage.ghe
    public void onRemoved(int position, int count) {
        BaseLoadMoreModule mLoadMoreModule = this.mAdapter.getMLoadMoreModule();
        if (mLoadMoreModule != null && mLoadMoreModule.hasLoadMoreView() && this.mAdapter.getItemCount() == 0) {
            BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
            baseQuickAdapter.notifyItemRangeRemoved(position + baseQuickAdapter.getHeaderLayoutCount(), count + 1);
        } else {
            BaseQuickAdapter<?, ?> baseQuickAdapter2 = this.mAdapter;
            baseQuickAdapter2.notifyItemRangeRemoved(position + baseQuickAdapter2.getHeaderLayoutCount(), count);
        }
    }
}
