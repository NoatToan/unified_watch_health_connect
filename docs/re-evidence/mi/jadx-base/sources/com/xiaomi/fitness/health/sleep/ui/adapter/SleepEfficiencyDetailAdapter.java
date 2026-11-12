package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyDetailAdapter;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'()B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter$OnItemClickListener;", "onItemClickListener", "", "setOnItemClickListener", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter$OnItemClickListener;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepSegmentReport", "updateSegmentReport", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "allDaySleepTimestampInSec", "J", "getAllDaySleepTimestampInSec", "()J", "mOnItemClickListener", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter$OnItemClickListener;", "mSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter$DataModel;", "dataModelList", "Ljava/util/List;", "<init>", "(J)V", "OnItemClickListener", "DataModel", "DetailItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepEfficiencyDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    private final long allDaySleepTimestampInSec;

    @NotNull
    private final List<DataModel> dataModelList = new ArrayList();

    @Nullable
    private OnItemClickListener mOnItemClickListener;

    @Nullable
    private SleepSegmentReport mSegmentReport;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter$DataModel;", "", "title", "", "des", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/CharSequence;", "getDes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DataModel {

        @NotNull
        private final CharSequence des;

        @NotNull
        private final CharSequence title;

        public DataModel(@NotNull CharSequence title, @NotNull CharSequence des) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            this.title = title;
            this.des = des;
        }

        public static /* synthetic */ DataModel copy$default(DataModel dataModel, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = dataModel.title;
            }
            if ((i & 2) != 0) {
                charSequence2 = dataModel.des;
            }
            return dataModel.copy(charSequence, charSequence2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CharSequence getDes() {
            return this.des;
        }

        @NotNull
        public final DataModel copy(@NotNull CharSequence title, @NotNull CharSequence des) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            return new DataModel(title, des);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataModel)) {
                return false;
            }
            DataModel dataModel = (DataModel) other;
            return Intrinsics.areEqual(this.title, dataModel.title) && Intrinsics.areEqual(this.des, dataModel.des);
        }

        @NotNull
        public final CharSequence getDes() {
            return this.des;
        }

        @NotNull
        public final CharSequence getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.des.hashCode();
        }

        @NotNull
        public String toString() {
            return "DataModel(title=" + ((Object) this.title) + ", des=" + ((Object) this.des) + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001c\u0010\r\u001a\n \b*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter$DetailItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindData", "(I)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "valueTv", "Landroid/widget/TextView;", "labelTv", "Landroid/view/View;", "labelLayout", "Landroid/view/View;", "commonLabelTv", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DetailItemViewHolder extends RecyclerView.d0 {
        private final TextView commonLabelTv;
        private final View labelLayout;
        private final TextView labelTv;
        final /* synthetic */ SleepEfficiencyDetailAdapter this$0;
        private final TextView valueTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailItemViewHolder(@NotNull SleepEfficiencyDetailAdapter sleepEfficiencyDetailAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepEfficiencyDetailAdapter;
            this.valueTv = (TextView) itemView.findViewById(eri.Qo);
            this.labelTv = (TextView) itemView.findViewById(eri.B9);
            this.labelLayout = itemView.findViewById(eri.z9);
            this.commonLabelTv = (TextView) itemView.findViewById(eri.common_label);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(SleepEfficiencyDetailAdapter this$0, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            if (this$0.mSegmentReport == null) {
                return Unit.INSTANCE;
            }
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            if (onItemClickListener != null) {
                SleepSegmentReport sleepSegmentReport = this$0.mSegmentReport;
                Intrinsics.checkNotNull(sleepSegmentReport);
                onItemClickListener.onItemClick(sleepSegmentReport, this$0.getAllDaySleepTimestampInSec());
            }
            return Unit.INSTANCE;
        }

        public final void bindData(int position) {
            DataModel dataModel = (DataModel) this.this$0.dataModelList.get(position);
            this.valueTv.setText(dataModel.getTitle());
            if (position != 0) {
                View labelLayout = this.labelLayout;
                Intrinsics.checkNotNullExpressionValue(labelLayout, "labelLayout");
                ViewExtKt.gone(labelLayout);
                TextView commonLabelTv = this.commonLabelTv;
                Intrinsics.checkNotNullExpressionValue(commonLabelTv, "commonLabelTv");
                ViewExtKt.visible(commonLabelTv);
                this.commonLabelTv.setText(dataModel.getDes());
                return;
            }
            TextView commonLabelTv2 = this.commonLabelTv;
            Intrinsics.checkNotNullExpressionValue(commonLabelTv2, "commonLabelTv");
            ViewExtKt.gone(commonLabelTv2);
            View labelLayout2 = this.labelLayout;
            Intrinsics.checkNotNullExpressionValue(labelLayout2, "labelLayout");
            ViewExtKt.visible(labelLayout2);
            this.labelTv.setText(dataModel.getDes());
            View view = this.itemView;
            final SleepEfficiencyDetailAdapter sleepEfficiencyDetailAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: cmm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepEfficiencyDetailAdapter.DetailItemViewHolder.bindData$lambda$0(sleepEfficiencyDetailAdapter, (View) obj);
                }
            }, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepEfficiencyDetailAdapter$OnItemClickListener;", "", "onItemClick", "", "segmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "allDaySleepTimestampInSec", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@NotNull SleepSegmentReport segmentReport, long allDaySleepTimestampInSec);
    }

    public SleepEfficiencyDetailAdapter(long j) {
        this.allDaySleepTimestampInSec = j;
    }

    public final long getAllDaySleepTimestampInSec() {
        return this.allDaySleepTimestampInSec;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof DetailItemViewHolder) {
            ((DetailItemViewHolder) holder).bindData(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.D8, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new DetailItemViewHolder(this, viewInflate);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateSegmentReport(@NotNull SleepSegmentReport sleepSegmentReport) {
        Long entrySleepDuration;
        Long linBedDuration;
        Intrinsics.checkNotNullParameter(sleepSegmentReport, "sleepSegmentReport");
        this.mSegmentReport = sleepSegmentReport;
        this.dataModelList.clear();
        SleepSegmentReport sleepSegmentReport2 = this.mSegmentReport;
        long jLongValue = 0;
        long j = 60;
        CharSequence hHmmDurationSpannableWithMin = TimeDateUtil.getHHmmDurationSpannableWithMin((int) (((sleepSegmentReport2 == null || (linBedDuration = sleepSegmentReport2.getLinBedDuration()) == null) ? 0L : linBedDuration.longValue()) / j), 1.67f);
        String string = ExtUtilKt.getString(c0j.ih);
        SleepSegmentReport sleepSegmentReport3 = this.mSegmentReport;
        if (sleepSegmentReport3 != null && (entrySleepDuration = sleepSegmentReport3.getEntrySleepDuration()) != null) {
            jLongValue = entrySleepDuration.longValue();
        }
        CharSequence hHmmDurationSpannableWithMin2 = TimeDateUtil.getHHmmDurationSpannableWithMin((int) (jLongValue / j), 1.67f);
        String string2 = ExtUtilKt.getString(c0j.tq);
        this.dataModelList.add(new DataModel(hHmmDurationSpannableWithMin, string));
        this.dataModelList.add(new DataModel("", ""));
        this.dataModelList.add(new DataModel(hHmmDurationSpannableWithMin2, string2));
        notifyDataSetChanged();
    }
}
