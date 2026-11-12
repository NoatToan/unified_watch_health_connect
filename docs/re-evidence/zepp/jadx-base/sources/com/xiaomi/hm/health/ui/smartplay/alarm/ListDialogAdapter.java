package com.xiaomi.hm.health.ui.smartplay.alarm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.xiaomi.hm.health.ui.smartplay.alarm.ListDialogAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bJ\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0016\u0010\u0019\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter$ItemHolder;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/IListDialog;", "Landroid/view/View;", "", "show", "", "a", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListItemData;", "getData", "holder", "onBindViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "", "itemData", "setData", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "refreshView", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "inflater", "", "b", "Ljava/util/List;", "data", "c", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;", "itemClickListener", "<init>", "()V", "ItemHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ListDialogAdapter extends RecyclerView.Adapter<ItemHolder> implements IListDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LayoutInflater inflater;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<ListItemData> data = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ItemClickListener itemClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter$ItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getSelectIv", "()Landroid/widget/ImageView;", "selectIv", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "titleTv", "c", "getTailTv", "tailTv", GoogleApiAvailabilityLight.a, "getRightIv", "rightIv", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;", "e", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;", "getClickListener", "()Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;", "setClickListener", "(Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;)V", "clickListener", "Landroid/view/View;", "item", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ItemHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ImageView selectIv;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView titleTv;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final TextView tailTv;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final ImageView rightIv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private ItemClickListener clickListener;

        public ItemHolder(@NotNull View view) {
            super(view);
            this.selectIv = (ImageView) view.findViewById(R.id.iv_check);
            this.titleTv = (TextView) view.findViewById(R.id.tv_title);
            this.tailTv = (TextView) view.findViewById(R.id.tv_tail);
            this.rightIv = (ImageView) view.findViewById(R.id.iv_right);
            view.setOnClickListener(new View.OnClickListener() { // from class: po4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ListDialogAdapter.ItemHolder.b(this.a, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(ItemHolder itemHolder, View view) {
            ItemClickListener clickListener = itemHolder.getClickListener();
            if (clickListener == null) {
                return;
            }
            clickListener.onClick(itemHolder.getAdapterPosition());
        }

        @Nullable
        public final ItemClickListener getClickListener() {
            return this.clickListener;
        }

        @NotNull
        public final ImageView getRightIv() {
            return this.rightIv;
        }

        @NotNull
        public final ImageView getSelectIv() {
            return this.selectIv;
        }

        @NotNull
        public final TextView getTailTv() {
            return this.tailTv;
        }

        @NotNull
        public final TextView getTitleTv() {
            return this.titleTv;
        }

        public final void setClickListener(@Nullable ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;
        }
    }

    private final void a(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    @NotNull
    public final ListItemData getData(int position) {
        return this.data.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.inflater = LayoutInflater.from(recyclerView.getContext());
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IListDialog
    public void refreshView() {
        notifyDataSetChanged();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IListDialog
    public void setData(@NotNull List<ListItemData> itemData) {
        this.data.clear();
        this.data.addAll(itemData);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IListDialog
    public void setOnItemClickListener(@NotNull ItemClickListener listener) {
        this.itemClickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ItemHolder holder, int position) {
        ListItemData data = getData(position);
        a(holder.getSelectIv(), data.getShowSelect());
        holder.getTitleTv().setText(data.getTitle());
        a(holder.getTailTv(), data.getShowTailText());
        holder.getTailTv().setText(data.getTailText());
        a(holder.getRightIv(), data.getShowRightImage());
        holder.setClickListener(this.itemClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = this.inflater;
        Objects.requireNonNull(layoutInflater);
        return new ItemHolder(layoutInflater.inflate(R.layout.item_alarm_repeat, parent, false));
    }
}
