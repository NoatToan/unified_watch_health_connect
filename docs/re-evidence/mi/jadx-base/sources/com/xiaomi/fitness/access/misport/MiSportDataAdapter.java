package com.xiaomi.fitness.access.misport;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import defpackage.aui;
import defpackage.vqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/access/misport/MiSportDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/access/misport/MiSportDataAdapter$ItemVh;", "mDataList", "", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportDataItem;", "<init>", "(Ljava/util/List;)V", "getMDataList", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "ItemVh", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiSportDataAdapter extends RecyclerView.Adapter<ItemVh> {

    @NotNull
    private final List<MiSportData.MiSportDataItem> mDataList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/access/misport/MiSportDataAdapter$ItemVh;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "itemTitle", "Landroid/widget/TextView;", "getItemTitle", "()Landroid/widget/TextView;", "setItemTitle", "(Landroid/widget/TextView;)V", "descText", "getDescText", "setDescText", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ItemVh extends RecyclerView.d0 {

        @NotNull
        private TextView descText;

        @NotNull
        private TextView itemTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemVh(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(vqi.P);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.itemTitle = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(vqi.O);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.descText = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getDescText() {
            return this.descText;
        }

        @NotNull
        public final TextView getItemTitle() {
            return this.itemTitle;
        }

        public final void setDescText(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.descText = textView;
        }

        public final void setItemTitle(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.itemTitle = textView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiSportDataAdapter(@NotNull List<? extends MiSportData.MiSportDataItem> mDataList) {
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mDataList = mDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final List<MiSportData.MiSportDataItem> getMDataList() {
        return this.mDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ItemVh holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MiSportData.MiSportDataItem miSportDataItem = this.mDataList.get(position);
        if (miSportDataItem != null) {
            holder.getItemTitle().setText(miSportDataItem.mItemName);
            holder.getDescText().setText(miSportDataItem.mItemDesc);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ItemVh onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(aui.d, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ItemVh(viewInflate);
    }
}
