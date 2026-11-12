package com.xiaomi.fitness.chart.barchart;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.j22;
import defpackage.npm;
import defpackage.nyi;
import defpackage.onq;
import defpackage.qzi;
import defpackage.r02;
import defpackage.sf2;
import defpackage.v02;
import defpackage.vqr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001BK\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/SleepChartDayAdapter;", "Lj22;", "Lcom/xiaomi/fitness/chart/entrys/SleepEntry;", "Lsf2;", "Lv02;", "viewHolder", "", "position", "", "bindBarEntryToView", "(Lv02;I)V", "Landroid/view/View;", "contentView", "itemWidth", "setLinearLayout", "(Landroid/view/View;I)V", "onBindViewHolder", "Landroid/content/Context;", "context", "", "entries", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lvqr;", "xAxis", "Lr02;", "attrs", "Lonq;", "valueFormatter", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;Lvqr;Lr02;Lonq;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class SleepChartDayAdapter extends j22<SleepEntry, sf2> {
    public SleepChartDayAdapter(@Nullable Context context, @Nullable List<SleepEntry> list, @Nullable RecyclerView recyclerView, @Nullable vqr vqrVar, @Nullable r02 r02Var, @Nullable onq onqVar) {
        super(context, list, recyclerView, vqrVar, r02Var, onqVar);
    }

    private final void bindBarEntryToView(v02 viewHolder, int position) {
        RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) this.mEntries.get(position);
        viewHolder.f36337a.setTag(recyclerBarEntry);
        if (recyclerBarEntry != null) {
            Context context = viewHolder.itemView.getContext();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            LocalDate localDate = recyclerBarEntry.localDate;
            String str = simpleDateFormat.format(localDate != null ? localDate.toDate() : null);
            float f = 60;
            String zNTimeWithMinute = TimeDateUtil.INSTANCE.getZNTimeWithMinute((int) (recyclerBarEntry.getY() * f), true);
            String string = context.getString(qzi.j, str, String.valueOf(recyclerBarEntry.getY()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            SleepEntry sleepEntry = recyclerBarEntry instanceof SleepEntry ? (SleepEntry) recyclerBarEntry : null;
            if (sleepEntry != null) {
                int size = sleepEntry.f11762a.f4804a.size();
                String quantityString = context.getResources().getQuantityString(nyi.f28569a, size, Integer.valueOf(size));
                ArrayList arrayList = new ArrayList();
                Iterator<npm> it = sleepEntry.f11762a.f4804a.iterator();
                while (it.hasNext()) {
                    arrayList.add(TimeDateUtil.INSTANCE.getZNTimeWithMinute((int) (it.next().f28233a * f), true));
                }
                string = context.getString(qzi.i, str, zNTimeWithMinute, quantityString, TextUtils.join(", ", arrayList));
            }
            viewHolder.f36337a.setContentDescription(string);
        }
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
