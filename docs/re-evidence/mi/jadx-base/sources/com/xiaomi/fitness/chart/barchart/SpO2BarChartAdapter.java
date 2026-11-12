package com.xiaomi.fitness.chart.barchart;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import defpackage.a52;
import defpackage.j22;
import defpackage.onq;
import defpackage.sf2;
import defpackage.v02;
import defpackage.vqr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u00000\u0003BG\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/SpO2BarChartAdapter;", "Lsf2;", "T", "Lj22;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "Lv02;", "viewHolder", "", "position", "", "bindBarEntryToView", "(Lv02;I)V", "Landroid/view/View;", "contentView", "itemWidth", "setLinearLayout", "(Landroid/view/View;I)V", "onBindViewHolder", "Landroid/content/Context;", "context", "", "entries", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lvqr;", "xAxis", "La52;", "attrs", "Lonq;", "valueFormatter", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;Lvqr;La52;Lonq;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class SpO2BarChartAdapter<T extends sf2> extends j22<RecyclerBarEntry, T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpO2BarChartAdapter(@Nullable Context context, @NotNull List<? extends RecyclerBarEntry> entries, @Nullable RecyclerView recyclerView, @Nullable vqr vqrVar, @Nullable a52 a52Var, @NotNull onq valueFormatter) {
        super(context, entries, recyclerView, vqrVar, a52Var, valueFormatter);
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(valueFormatter, "valueFormatter");
    }

    private final void bindBarEntryToView(v02 viewHolder, int position) {
        Object obj = this.mEntries.get(position);
        Intrinsics.checkNotNull(obj);
        viewHolder.f36337a.setTag((RecyclerBarEntry) obj);
    }

    private final void setLinearLayout(View contentView, int itemWidth) {
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = itemWidth;
        layoutParams.height = -1;
        contentView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull v02 viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onBindViewHolder(viewHolder, position);
        int width = (int) (((this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft()) / this.mXAxis.f37144a);
        View contentView = viewHolder.f36337a;
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        setLinearLayout(contentView, width);
        bindBarEntryToView(viewHolder, position);
    }
}
