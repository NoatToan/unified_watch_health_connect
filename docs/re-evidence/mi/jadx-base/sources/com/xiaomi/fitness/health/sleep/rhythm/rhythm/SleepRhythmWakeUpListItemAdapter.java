package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0014\u0010\u0014\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmWakeUpListItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmWakeUpListItemAdapter$SleepRhythmWakeUpListItemViewHolder;", "dataList", "", "", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "setDataList", "getItemCount", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "SleepRhythmWakeUpListItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmWakeUpListItemAdapter extends RecyclerView.Adapter<SleepRhythmWakeUpListItemViewHolder> {

    @NotNull
    private List<Integer> dataList;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmWakeUpListItemAdapter$SleepRhythmWakeUpListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "item", "", "bindData", "(I)V", "Landroid/widget/TextView;", "contentTV", "Landroid/widget/TextView;", "titleTV", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmWakeUpListItemAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepRhythmWakeUpListItemViewHolder extends RecyclerView.d0 {

        @Nullable
        private TextView contentTV;
        final /* synthetic */ SleepRhythmWakeUpListItemAdapter this$0;

        @Nullable
        private TextView titleTV;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmWakeUpListItemViewHolder(@NotNull SleepRhythmWakeUpListItemAdapter sleepRhythmWakeUpListItemAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepRhythmWakeUpListItemAdapter;
            this.titleTV = (TextView) itemView.findViewById(eri.cj);
            this.contentTV = (TextView) itemView.findViewById(eri.W1);
        }

        public final void bindData(int item) {
            TextView textView = this.titleTV;
            Intrinsics.checkNotNull(textView);
            textView.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.O0, getBindingAdapterPosition() + 1, Integer.valueOf(getBindingAdapterPosition() + 1)));
            TextView textView2 = this.contentTV;
            Intrinsics.checkNotNull(textView2);
            textView2.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.R1, item, Integer.valueOf(item)));
        }
    }

    public SleepRhythmWakeUpListItemAdapter(@NotNull List<Integer> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @NotNull
    public final List<Integer> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setDataList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void updateDataList(@NotNull List<Integer> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepRhythmWakeUpListItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.dataList.get(position).intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepRhythmWakeUpListItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.A5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepRhythmWakeUpListItemViewHolder(this, viewInflate);
    }
}
