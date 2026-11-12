package com.chad.library.adapter.base.loadmore;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import defpackage.dqi;
import defpackage.vui;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/chad/library/adapter/base/loadmore/SimpleLoadMoreView;", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "()V", "getLoadComplete", "Landroid/view/View;", "holder", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getLoadEndView", "getLoadFailView", "getLoadingView", "getRootView", "parent", "Landroid/view/ViewGroup;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
public final class SimpleLoadMoreView extends BaseLoadMoreView {
    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    @NotNull
    public View getLoadComplete(@NotNull BaseViewHolder holder) {
        return holder.getView(dqi.d);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    @NotNull
    public View getLoadEndView(@NotNull BaseViewHolder holder) {
        return holder.getView(dqi.e);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    @NotNull
    public View getLoadFailView(@NotNull BaseViewHolder holder) {
        return holder.getView(dqi.f);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    @NotNull
    public View getLoadingView(@NotNull BaseViewHolder holder) {
        return holder.getView(dqi.g);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    @NotNull
    public View getRootView(@NotNull ViewGroup parent) {
        return AdapterUtilsKt.getItemView(parent, vui.f37237a);
    }
}
