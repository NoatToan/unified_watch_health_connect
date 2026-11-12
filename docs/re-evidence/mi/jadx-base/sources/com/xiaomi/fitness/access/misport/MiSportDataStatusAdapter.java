package com.xiaomi.fitness.access.misport;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import defpackage.aui;
import defpackage.eni;
import defpackage.tc1;
import defpackage.vqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/access/misport/MiSportDataStatusAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/access/misport/MiSportDataStatusAdapter$ItemVh;", "mDataList", "", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportUpdateStatusItem;", "<init>", "(Ljava/util/List;)V", "getMDataList", "()Ljava/util/List;", "statusUpdate", "", "list", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "ItemVh", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiSportDataStatusAdapter extends RecyclerView.Adapter<ItemVh> {

    @NotNull
    private final List<MiSportData.MiSportUpdateStatusItem> mDataList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/access/misport/MiSportDataStatusAdapter$ItemVh;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "itemTitle", "Landroid/widget/TextView;", "getItemTitle", "()Landroid/widget/TextView;", "setItemTitle", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "statusImage", "Landroid/widget/ImageView;", "getStatusImage", "()Landroid/widget/ImageView;", "setStatusImage", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ItemVh extends RecyclerView.d0 {

        @NotNull
        private TextView itemTitle;

        @NotNull
        private ImageView statusImage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemVh(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(vqi.P);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.itemTitle = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(vqi.e0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.statusImage = (ImageView) viewFindViewById2;
        }

        @NotNull
        public final TextView getItemTitle() {
            return this.itemTitle;
        }

        @NotNull
        public final ImageView getStatusImage() {
            return this.statusImage;
        }

        public final void setItemTitle(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.itemTitle = textView;
        }

        public final void setStatusImage(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.statusImage = imageView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiSportDataStatusAdapter(@NotNull List<? extends MiSportData.MiSportUpdateStatusItem> mDataList) {
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mDataList = mDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final List<MiSportData.MiSportUpdateStatusItem> getMDataList() {
        return this.mDataList;
    }

    public final void statusUpdate(@NotNull List<? extends MiSportData.MiSportUpdateStatusItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = list.size();
        int size2 = this.mDataList.size();
        int i = 0;
        boolean z = false;
        while (i < size2) {
            MiSportData.MiSportUpdateStatusItem miSportUpdateStatusItem = this.mDataList.get(i);
            MiSportData.MiSportUpdateStatusItem miSportUpdateStatusItem2 = i < size ? list.get(i) : null;
            if (miSportUpdateStatusItem2 == null) {
                break;
            }
            if (Intrinsics.areEqual(miSportUpdateStatusItem.mItemName, miSportUpdateStatusItem2.mItemName)) {
                int i2 = miSportUpdateStatusItem.status;
                int i3 = miSportUpdateStatusItem2.status;
                if (i2 != i3) {
                    miSportUpdateStatusItem.status = i3;
                    z = true;
                }
            }
            i++;
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ItemVh holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MiSportData.MiSportUpdateStatusItem miSportUpdateStatusItem = this.mDataList.get(position);
        if (miSportUpdateStatusItem != null) {
            holder.getItemTitle().setText(miSportUpdateStatusItem.mItemName);
            int i = miSportUpdateStatusItem.status;
            if (i == -1) {
                tc1.b(holder.getStatusImage());
                holder.getStatusImage().setImageResource(eni.c);
            } else if (i != 2) {
                holder.getStatusImage().setImageResource(eni.f16845b);
                tc1.a(holder.getStatusImage());
            } else {
                tc1.b(holder.getStatusImage());
                holder.getStatusImage().setImageResource(eni.d);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ItemVh onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(aui.e, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ItemVh(viewInflate);
    }
}
