package com.xiaomi.fitness.health.hearing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$ViewHolder;", "items", "", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "itemClickListener", "Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$OnNoiseItemListener;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$OnNoiseItemListener;)V", "getItems", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "ViewHolder", "OnNoiseItemListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClickableRecordItemAdapter extends RecyclerView.Adapter<ViewHolder> {

    @NotNull
    private final OnNoiseItemListener itemClickListener;

    @NotNull
    private final List<NoiseItem> items;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$OnNoiseItemListener;", "", "onNoiseItemClick", "", "position", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnNoiseItemListener {
        void onNoiseItemClick(int position);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "leftStrView", "Landroid/widget/TextView;", "getLeftStrView", "()Landroid/widget/TextView;", "setLeftStrView", "(Landroid/widget/TextView;)V", "rightStrView", "getRightStrView", "setRightStrView", "Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$OnNoiseItemListener;", "onNoiseItemListener", "Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$OnNoiseItemListener;", "itemView", "noiseItemListener", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/hearing/ClickableRecordItemAdapter$OnNoiseItemListener;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ViewHolder extends RecyclerView.d0 implements View.OnClickListener {

        @NotNull
        private TextView leftStrView;

        @NotNull
        private final OnNoiseItemListener onNoiseItemListener;

        @NotNull
        private TextView rightStrView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView, @NotNull OnNoiseItemListener noiseItemListener) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(noiseItemListener, "noiseItemListener");
            View viewFindViewById = itemView.findViewById(eri.Cl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.leftStrView = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.nm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.rightStrView = (TextView) viewFindViewById2;
            this.onNoiseItemListener = noiseItemListener;
            itemView.setOnClickListener(this);
        }

        @NotNull
        public final TextView getLeftStrView() {
            return this.leftStrView;
        }

        @NotNull
        public final TextView getRightStrView() {
            return this.rightStrView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View v) {
            this.onNoiseItemListener.onNoiseItemClick(getBindingAdapterPosition());
        }

        public final void setLeftStrView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.leftStrView = textView;
        }

        public final void setRightStrView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.rightStrView = textView;
        }
    }

    public ClickableRecordItemAdapter(@NotNull List<NoiseItem> items, @NotNull OnNoiseItemListener itemClickListener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.items = items;
        this.itemClickListener = itemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @NotNull
    public final List<NoiseItem> getItems() {
        return this.items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getLeftStrView().setText(this.items.get(position).getDecibel() + ExtUtilKt.getString(c0j.B7));
        holder.getRightStrView().setText(TimeDateUtil.getDateHHmm24Format(this.items.get(position).getTime()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.m, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(viewInflate, this.itemClickListener);
    }
}
