package com.xiaomi.fitness.health.hrm.deprecated;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.hrm.deprecated.HrmManuallyMeasuredRecordsAdapter;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import defpackage.uv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter$AllRecordsHolder;", "<init>", "()V", "onItemClickListener", "Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter$OnItemClickListener;", "setOnItemClickListener", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AllRecordsHolder", "OnItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrmManuallyMeasuredRecordsAdapter extends PagingDataAdapter<HrItem, AllRecordsHolder> {

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter$AllRecordsHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "tvValue", "Landroid/widget/TextView;", "getTvValue", "()Landroid/widget/TextView;", "setTvValue", "(Landroid/widget/TextView;)V", "tvRecordTime", "getTvRecordTime", "setTvRecordTime", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AllRecordsHolder extends RecyclerView.d0 {

        @NotNull
        private TextView tvRecordTime;

        @NotNull
        private TextView tvValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllRecordsHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.qn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tvValue = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.im);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tvRecordTime = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getTvRecordTime() {
            return this.tvRecordTime;
        }

        @NotNull
        public final TextView getTvValue() {
            return this.tvValue;
        }

        public final void setTvRecordTime(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvRecordTime = textView;
        }

        public final void setTvValue(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvValue = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/deprecated/HrmManuallyMeasuredRecordsAdapter$OnItemClickListener;", "", "onClick", "", "item", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull HrItem item);
    }

    public HrmManuallyMeasuredRecordsAdapter() {
        super(new uv6(), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(HrmManuallyMeasuredRecordsAdapter this$0, HrItem hrItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(hrItem, "$hrItem");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onClick(hrItem);
        }
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.onItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AllRecordsHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final HrItem item = getItem(position);
        if (item == null) {
            return;
        }
        String quantityString = holder.itemView.getContext().getResources().getQuantityString(qxi.common_unit_heart_rate_desc, item.getHr(), Integer.valueOf(item.getHr()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        holder.getTvValue().setText(quantityString);
        holder.getTvRecordTime().setText(TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(item.getTime(), false, 2, null));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: gec
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HrmManuallyMeasuredRecordsAdapter.onBindViewHolder$lambda$0(this.f18885a, item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AllRecordsHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.h6, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new AllRecordsHolder(viewInflate);
    }
}
