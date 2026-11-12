package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.formatter.PercentageYAxisFormatter;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.data.valueformatter.SleepEfficiencyHighlightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.WeekdayNameFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.SleepTrendUtilKt;
import defpackage.brr;
import defpackage.c0j;
import defpackage.hak;
import defpackage.j9f;
import defpackage.nce;
import defpackage.onq;
import defpackage.pni;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b4\u00105J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00102\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmEfficiencyHolder;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "", "updateReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Lnce;", "binding", "Lnce;", "getBinding", "()Lnce;", "", "position", "I", "getPosition", "()I", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineChartRecycler", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lj9f;", "mLineChartAdapter", "Lj9f;", "Lyfe;", "mLineChartItemDecoration", "Lyfe;", "Lvfe;", "mLineChartAttrs", "Lvfe;", "Lrtr;", "mLineChartYAxis", "Lrtr;", "Lvqr;", "mLineChartXAxis", "Lvqr;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntries", "Ljava/util/List;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "iconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "avgSleepEfficiencyTv", "", "isWeek", "()Z", "<init>", "(Lnce;I)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepWmEfficiencyHolder {

    @NotNull
    public static final String TAG = "SleepWmEfficiency";

    @NotNull
    private TextView avgSleepEfficiencyTv;

    @NotNull
    private final nce binding;

    @NotNull
    private final Context context;

    @NotNull
    private AppCompatImageView iconIv;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private j9f mLineChartAdapter;

    @Nullable
    private vfe mLineChartAttrs;

    @Nullable
    private yfe mLineChartItemDecoration;

    @Nullable
    private LineChartRecyclerView mLineChartRecycler;

    @Nullable
    private vqr mLineChartXAxis;

    @Nullable
    private rtr mLineChartYAxis;
    private final int position;

    @NotNull
    private TextView titleTv;

    public SleepWmEfficiencyHolder(@NotNull nce binding, int i) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.position = i;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        TextView tvLabel = binding.B.B;
        Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
        this.titleTv = tvLabel;
        AppCompatImageView ivIcon = binding.B.A;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        this.iconIv = ivIcon;
        TextView avgSleepEfficiency = binding.A;
        Intrinsics.checkNotNullExpressionValue(avgSleepEfficiency, "avgSleepEfficiency");
        this.avgSleepEfficiencyTv = avgSleepEfficiency;
        this.mLineChartRecycler = binding.C;
        this.mChartEntries = new ArrayList();
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.mLineChartAttrs = vfeVar;
        rtr rtrVar = new rtr(vfeVar);
        this.mLineChartYAxis = rtrVar;
        rtrVar.f = 6;
        rtrVar.mAxisMaximum = 100.0f;
        rtrVar.mAxisMinimum = 0.0f;
        rtrVar.setValueFormatter(new PercentageYAxisFormatter());
        vfe vfeVar2 = this.mLineChartAttrs;
        if (vfeVar2 != null) {
            vfeVar2.x0 = true;
        }
        rtr rtrVar2 = this.mLineChartYAxis;
        if (rtrVar2 != null) {
            rtrVar2.e(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(100.0f), Float.valueOf(80.0f), Float.valueOf(60.0f), Float.valueOf(40.0f), Float.valueOf(20.0f), Float.valueOf(0.0f)}));
        }
        int i2 = isWeek() ? 7 : 30;
        onq weekdayNameFormatter = isWeek() ? new WeekdayNameFormatter() : new brr(context);
        vqr vqrVar = new vqr(this.mLineChartAttrs, i2, weekdayNameFormatter);
        this.mLineChartXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(weekdayNameFormatter);
        vfe vfeVar3 = this.mLineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        vfeVar3.I0 = 10.0f;
        this.mLineChartItemDecoration = new yfe(this.mLineChartYAxis, this.mLineChartXAxis, this.mLineChartAttrs);
        SleepEfficiencyHighlightMarkValueFormatter sleepEfficiencyHighlightMarkValueFormatter = new SleepEfficiencyHighlightMarkValueFormatter(0, isWeek());
        yfe yfeVar = this.mLineChartItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(sleepEfficiencyHighlightMarkValueFormatter);
        this.mLineChartAdapter = new j9f(binding.getRoot().getContext(), this.mChartEntries, this.mLineChartRecycler, this.mLineChartXAxis, this.mLineChartAttrs, sleepEfficiencyHighlightMarkValueFormatter);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(binding.getRoot().getContext(), this.mLineChartAttrs);
        yfe yfeVar2 = this.mLineChartItemDecoration;
        if (yfeVar2 != null) {
            yfeVar2.setBreakPointLine(Boolean.TRUE);
        }
        LineChartRecyclerView lineChartRecyclerView2 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView3 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        yfe yfeVar3 = this.mLineChartItemDecoration;
        Intrinsics.checkNotNull(yfeVar3);
        lineChartRecyclerView3.addItemDecoration(yfeVar3);
        LineChartRecyclerView lineChartRecyclerView4 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView5 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(binding.getRoot().getContext(), this.mLineChartRecycler, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepWmEfficiencyHolder.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                SleepWmEfficiencyHolder.this.getBinding().A.setVisibility((barEntry == null || !barEntry.isSelected()) ? 0 : 4);
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
        Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), pni.o1);
        this.titleTv.setText(c0j.Jf);
        this.iconIv.setImageDrawable(resourceDrawable);
    }

    private final boolean isWeek() {
        return this.position == 1;
    }

    @NotNull
    public final nce getBinding() {
        return this.binding;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void updateReport(@NotNull AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Logger.d(TAG, "updateReport: size=" + (dayReportList != null ? Integer.valueOf(dayReportList.size()) : null));
        vfe vfeVar = this.mLineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<MaxMinEntry> sleepWmEfficiencyEntries = SleepTrendUtilKt.getSleepWmEfficiencyEntries(vfeVar, isWeek(), allDaySleepReport);
        Logger.i(TAG, "updateReport: entryList size=" + sleepWmEfficiencyEntries.size());
        boolean zCheckIfLongSleepExist = SleepTrendUtilKt.checkIfLongSleepExist(allDaySleepReport);
        if (sleepWmEfficiencyEntries.isEmpty() || !zCheckIfLongSleepExist) {
            View root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setVisible(root, false);
            return;
        }
        int avgSleepEfficiency = (int) SleepTrendUtilKt.getAvgSleepEfficiency(allDaySleepReport);
        View root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewExtKt.setVisible(root2, true);
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(sleepWmEfficiencyEntries);
        }
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecycler;
        if (lineChartRecyclerView != null) {
            lineChartRecyclerView.setYAxis(this.mLineChartYAxis);
        }
        j9f j9fVar = this.mLineChartAdapter;
        if (j9fVar != null) {
            j9fVar.notifyDataSetChanged();
        }
        String string = ResourceExtKt.getString(c0j.S, Integer.valueOf(avgSleepEfficiency));
        String strValueOf = String.valueOf(avgSleepEfficiency);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, strValueOf, 0, false, 6, (Object) null);
        int length = strValueOf.length() + iIndexOf$default;
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(2.4f);
        SpannableString spannableString = new SpannableString(string);
        try {
            spannableString.setSpan(relativeSizeSpan, iIndexOf$default, length, 17);
        } catch (Exception unused) {
            Logger.i(TAG, "updateReport: wholeStr=" + string + " avgSleepEfficiency=" + avgSleepEfficiency);
        }
        this.avgSleepEfficiencyTv.setText(spannableString);
    }
}
