package com.xiaomi.fitness.active.pk.ui.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.h;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.ui.recyclerview.holder.PkUserHistoryViewHolder;
import defpackage.bui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkUserHistoryRecordAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/PkUserHistoryViewHolder;", "holder", "", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/PkUserHistoryViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/PkUserHistoryViewHolder;", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/h$f;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PkUserHistoryRecordAdapter extends PagingDataAdapter<PkRecordDetail, PkUserHistoryViewHolder> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkUserHistoryRecordAdapter(@NotNull h.f<PkRecordDetail> diffCallback) {
        super(diffCallback, null, null, 6, null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PkUserHistoryViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(getItem(position), position == getCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PkUserHistoryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(bui.g, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new PkUserHistoryViewHolder(viewInflate);
    }
}
