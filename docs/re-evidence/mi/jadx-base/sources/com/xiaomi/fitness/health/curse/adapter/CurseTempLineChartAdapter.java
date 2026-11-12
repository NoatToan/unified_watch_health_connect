package com.xiaomi.fitness.health.curse.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.health.curse.CurseManager;
import defpackage.a52;
import defpackage.onq;
import defpackage.pni;
import defpackage.ufe;
import defpackage.v02;
import defpackage.vqr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/curse/adapter/CurseTempLineChartAdapter;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "T", "Lufe;", "Lv02;", "viewHolder", "", "position", "", "onBindViewHolder", "(Lv02;I)V", "Landroid/view/View;", "contentView", "itemWidth", "setLinearLayout", "(Landroid/view/View;I)V", "Landroid/content/Context;", "context", "", "entries", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lvqr;", "xAxis", "La52;", "attrs", "Lonq;", "valueFormatter", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;Lvqr;La52;Lonq;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseTempLineChartAdapter<T extends MaxMinEntry> extends ufe<T> {
    public CurseTempLineChartAdapter(@Nullable Context context, @Nullable List<? extends T> list, @Nullable RecyclerView recyclerView, @Nullable vqr vqrVar, @Nullable a52 a52Var, @Nullable onq onqVar) {
        super(context, list, recyclerView, vqrVar, a52Var, onqVar);
    }

    @Override // defpackage.ufe, defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull v02 viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onBindViewHolder(viewHolder, position);
        float f = this.mBarChartAttrs.f625a;
        CurseManager companion = CurseManager.INSTANCE.getInstance();
        LocalDate localDate = ((MaxMinEntry) this.mEntries.get(position)).localDate;
        Intrinsics.checkNotNull(localDate);
        int dayState = companion.getDayState(localDate);
        if (dayState == 0) {
            viewHolder.f36337a.setAlpha(0.5f);
            viewHolder.f36337a.setBackgroundResource(pni.B);
            return;
        }
        if (dayState == 1) {
            viewHolder.f36337a.setAlpha(0.5f);
            viewHolder.f36337a.setBackgroundResource(pni.C);
        } else if (dayState == 2) {
            viewHolder.f36337a.setAlpha(0.5f);
            viewHolder.f36337a.setBackgroundResource(pni.D);
        } else if (dayState != 3) {
            viewHolder.f36337a.setAlpha(0.0f);
            viewHolder.f36337a.setBackgroundColor(0);
        } else {
            viewHolder.f36337a.setAlpha(0.5f);
            viewHolder.f36337a.setBackgroundResource(pni.E);
        }
    }

    @Override // defpackage.ufe
    public void setLinearLayout(@NotNull View contentView, int itemWidth) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        contentView.setAlpha(0.0f);
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = itemWidth;
        layoutParams.height = ((this.mRecyclerView.getHeight() - this.mRecyclerView.getPaddingTop()) - this.mRecyclerView.getPaddingBottom()) - ((int) this.mBarChartAttrs.f625a);
        contentView.setLayoutParams(layoutParams);
    }
}
