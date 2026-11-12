package com.xiaomi.fitness.active.pk.ui.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.ui.recyclerview.PkRecordListAdapter;
import com.xiaomi.fitness.active.pk.ui.recyclerview.holder.PkProcessRecordViewHolder;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.bui;
import defpackage.wqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-B\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "getContentItemCount", "()I", "position", "", "isHeaderView", "(I)Z", "", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "list", "", "updateDataList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "titleResId", "showHeader", "(I)V", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter$OnItemClickListener;)V", "headerCount", "I", "headerTitleResId", "onItemClickListener", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter$OnItemClickListener;", "dataList", "Ljava/util/List;", "<init>", "()V", "Companion", "OnItemClickListener", "HeaderViewHolder", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PkRecordListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_TYPE_CONTENT = 2;
    public static final int ITEM_TYPE_HEADER = 1;

    @Nullable
    private List<PkRecordDetail> dataList;
    private int headerCount;
    private int headerTitleResId;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "titleResId", "", "bindData", "(I)V", "Landroid/widget/TextView;", "headerTxtView", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class HeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView headerTxtView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(wqi.y1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.headerTxtView = (TextView) viewFindViewById;
        }

        public final void bindData(int titleResId) {
            this.headerTxtView.setText(ResourceExtKt.getString(titleResId));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter$OnItemClickListener;", "", "onClick", "", "recordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull PkRecordDetail recordDetail);
    }

    private final int getContentItemCount() {
        List<PkRecordDetail> list = this.dataList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private final boolean isHeaderView(int position) {
        int i = this.headerCount;
        return i != 0 && position < i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(PkRecordListAdapter this$0, PkRecordDetail pkRecordDetail, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pkRecordDetail, "$pkRecordDetail");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(pkRecordDetail);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.headerCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return isHeaderView(position) ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        List<PkRecordDetail> list;
        final PkRecordDetail pkRecordDetail;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData(this.headerTitleResId);
        } else {
            if (!(holder instanceof PkProcessRecordViewHolder) || (list = this.dataList) == null || (pkRecordDetail = list.get(position - this.headerCount)) == null) {
                return;
            }
            ((PkProcessRecordViewHolder) holder).bindData(pkRecordDetail);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: jzh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PkRecordListAdapter.onBindViewHolder$lambda$0(this.f23264a, pkRecordDetail, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(bui.t, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new HeaderViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(bui.u, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new PkProcessRecordViewHolder(viewInflate2);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    public final void showHeader(int titleResId) {
        this.headerTitleResId = titleResId;
        this.headerCount = 1;
    }

    public final void updateDataList(@Nullable List<PkRecordDetail> list) {
        this.dataList = list;
        notifyDataSetChanged();
    }
}
