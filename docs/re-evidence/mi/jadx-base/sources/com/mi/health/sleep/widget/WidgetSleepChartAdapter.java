package com.mi.health.sleep.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import defpackage.tti;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001'B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00182\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0006H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/mi/health/sleep/widget/WidgetSleepChartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/sleep/widget/WidgetSleepChartAdapter$BarChartViewHolder;", "context", "Landroid/content/Context;", "chartEntries", "", "Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V", "mContext", "mRecyclerView", "value", "entries", "getEntries", "()Ljava/util/List;", "setEntries", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "", "viewHolder", "position", "getItemViewType", "getItemCount", "setLinearLayout", "contentView", "Landroid/view/View;", "itemWidth", "", "holder", "payloads", "", "BarChartViewHolder", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetSleepChartAdapter extends RecyclerView.Adapter<BarChartViewHolder> {

    @Nullable
    private List<SleepItemEntry> entries;

    @Nullable
    private final Context mContext;

    @NotNull
    private final RecyclerView mRecyclerView;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/mi/health/sleep/widget/WidgetSleepChartAdapter$BarChartViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "itemView", "<init>", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BarChartViewHolder extends RecyclerView.d0 {

        @NotNull
        private View contentView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarChartViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.contentView = itemView;
        }

        @NotNull
        public final View getContentView() {
            return this.contentView;
        }

        public final void setContentView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.contentView = view;
        }
    }

    public WidgetSleepChartAdapter(@Nullable Context context, @Nullable List<SleepItemEntry> list, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.mContext = context;
        this.mRecyclerView = recyclerView;
        this.entries = list;
    }

    private final void setLinearLayout(View contentView, double itemWidth) {
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        layoutParams.width = (int) itemWidth;
        layoutParams.height = -1;
        contentView.setLayoutParams(layoutParams);
    }

    @Nullable
    public final List<SleepItemEntry> getEntries() {
        return this.entries;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SleepItemEntry> list = this.entries;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        List<SleepItemEntry> list = this.entries;
        Intrinsics.checkNotNull(list);
        SleepItemEntry sleepItemEntry = list.get(position);
        return sleepItemEntry != null ? sleepItemEntry.type : super.getItemViewType(position);
    }

    public final void setEntries(@Nullable List<SleepItemEntry> list) {
        this.entries = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        onBindViewHolder((BarChartViewHolder) d0Var, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BarChartViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.mContext).inflate(tti.f35027a, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new BarChartViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BarChartViewHolder viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        float paddingRight = (this.mRecyclerView.getLayoutParams().width - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft();
        List<SleepItemEntry> list = this.entries;
        Intrinsics.checkNotNull(list);
        SleepItemEntry sleepItemEntry = list.get(0);
        List<SleepItemEntry> list2 = this.entries;
        Intrinsics.checkNotNull(list2);
        List<SleepItemEntry> list3 = this.entries;
        Intrinsics.checkNotNull(list3);
        long j = sleepItemEntry.f11764a.g - list2.get(list3.size() - 1).f11764a.f;
        List<SleepItemEntry> list4 = this.entries;
        Intrinsics.checkNotNull(list4);
        SleepItemEntry sleepItemEntry2 = list4.get(position);
        setLinearLayout(viewHolder.getContentView(), Math.max((int) ((sleepItemEntry2.f11764a.b() * paddingRight) / j), 1.0d));
        viewHolder.getContentView().setTag(sleepItemEntry2);
    }

    public void onBindViewHolder(@NotNull BarChartViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, position);
    }
}
