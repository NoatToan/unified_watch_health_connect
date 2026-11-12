package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.formatter.SleepRegularitySleepTimeValueFormatter;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.data.valueformatter.SleepRegularityBedTimeHighlightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.SleepRegularityWakeupTimeHighlightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.WeekdayNameFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.SleepTrendStaticsModel;
import com.xiaomi.fitness.util.SleepTrendUtilKt;
import defpackage.brr;
import defpackage.c0j;
import defpackage.hak;
import defpackage.j9f;
import defpackage.onq;
import defpackage.pce;
import defpackage.pni;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 K2\u00020\u0001:\u0001KB\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bI\u0010JJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00101R\u0014\u00107\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00101R\u0014\u00109\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101R\u0014\u0010:\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00101R\u0014\u0010;\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101R\u0014\u0010<\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00101R\u0014\u0010=\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00101R\u0014\u0010>\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00101R\u0018\u0010?\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u001bR\u0018\u0010@\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u001eR\u0018\u0010A\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010!R\u0018\u0010B\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010$R\u0018\u0010C\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010'R\u0018\u0010D\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010*R \u0010E\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010.R\u0014\u0010G\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmRegularityHolder;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "", "bindBedTimeCardInfo", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "bindWakeUpCardInfo", "updateReport", "Lpce;", "binding", "Lpce;", "getBinding", "()Lpce;", "", "position", "I", "getPosition", "()I", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineChartRecyclerBedTime", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lj9f;", "mLineChartAdapterBedTime", "Lj9f;", "Lyfe;", "mLineChartItemDecorationBedTime", "Lyfe;", "Lvfe;", "mLineChartAttrsBedTime", "Lvfe;", "Lrtr;", "mLineChartYAxisBedTime", "Lrtr;", "Lvqr;", "mLineChartXAxisBedTime", "Lvqr;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntriesBedTime", "Ljava/util/List;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "avgBedTimeValueTv", "avgBedTimeLabelTv", "regularityBedValueTv", "regularityBedLabelTv", "latestBedTimeTv", "avgWakeTimeValueTv", "avgWakeTimeLabelTv", "regularityWakeValueTv", "regularityWakeLabelTv", "earliestWakeupTimeTv", "mLineChartRecyclerWakeTime", "mLineChartAdapterWakeTime", "mLineChartItemDecorationWakeTime", "mLineChartAttrsWakeTime", "mLineChartYAxisWakeTime", "mLineChartXAxisWakeTime", "mChartEntriesWakeTime", "", "isWeek", "()Z", "<init>", "(Lpce;I)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepWmRegularityHolder {

    @NotNull
    public static final String TAG = "SleepWmRegularityHolder";

    @NotNull
    private final TextView avgBedTimeLabelTv;

    @NotNull
    private final TextView avgBedTimeValueTv;

    @NotNull
    private final TextView avgWakeTimeLabelTv;

    @NotNull
    private final TextView avgWakeTimeValueTv;

    @NotNull
    private final pce binding;

    @NotNull
    private final Context context;

    @NotNull
    private final TextView earliestWakeupTimeTv;

    @NotNull
    private final AppCompatImageView ivIcon;

    @NotNull
    private final TextView latestBedTimeTv;

    @Nullable
    private List<MaxMinEntry> mChartEntriesBedTime;

    @Nullable
    private List<MaxMinEntry> mChartEntriesWakeTime;

    @Nullable
    private j9f mLineChartAdapterBedTime;

    @Nullable
    private j9f mLineChartAdapterWakeTime;

    @Nullable
    private vfe mLineChartAttrsBedTime;

    @Nullable
    private vfe mLineChartAttrsWakeTime;

    @Nullable
    private yfe mLineChartItemDecorationBedTime;

    @Nullable
    private yfe mLineChartItemDecorationWakeTime;

    @Nullable
    private LineChartRecyclerView mLineChartRecyclerBedTime;

    @Nullable
    private LineChartRecyclerView mLineChartRecyclerWakeTime;

    @Nullable
    private vqr mLineChartXAxisBedTime;

    @Nullable
    private vqr mLineChartXAxisWakeTime;

    @Nullable
    private rtr mLineChartYAxisBedTime;

    @Nullable
    private rtr mLineChartYAxisWakeTime;
    private final int position;

    @NotNull
    private final TextView regularityBedLabelTv;

    @NotNull
    private final TextView regularityBedValueTv;

    @NotNull
    private final TextView regularityWakeLabelTv;

    @NotNull
    private final TextView regularityWakeValueTv;

    @NotNull
    private final View rootView;

    @NotNull
    private final TextView titleTv;

    public SleepWmRegularityHolder(@NotNull pce binding, int i) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.position = i;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.rootView = root;
        TextView tvLabel = binding.A.B;
        Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
        this.titleTv = tvLabel;
        AppCompatImageView ivIcon = binding.A.A;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        this.ivIcon = ivIcon;
        TextView startValue = binding.B.H;
        Intrinsics.checkNotNullExpressionValue(startValue, "startValue");
        this.avgBedTimeValueTv = startValue;
        TextView startLabel = binding.B.G;
        Intrinsics.checkNotNullExpressionValue(startLabel, "startLabel");
        this.avgBedTimeLabelTv = startLabel;
        TextView endValue = binding.B.C;
        Intrinsics.checkNotNullExpressionValue(endValue, "endValue");
        this.regularityBedValueTv = endValue;
        TextView endLabel = binding.B.B;
        Intrinsics.checkNotNullExpressionValue(endLabel, "endLabel");
        this.regularityBedLabelTv = endLabel;
        TextView latestBedtime = binding.B.D;
        Intrinsics.checkNotNullExpressionValue(latestBedtime, "latestBedtime");
        this.latestBedTimeTv = latestBedtime;
        TextView startValue2 = binding.C.H;
        Intrinsics.checkNotNullExpressionValue(startValue2, "startValue");
        this.avgWakeTimeValueTv = startValue2;
        TextView startLabel2 = binding.C.G;
        Intrinsics.checkNotNullExpressionValue(startLabel2, "startLabel");
        this.avgWakeTimeLabelTv = startLabel2;
        TextView endValue2 = binding.C.C;
        Intrinsics.checkNotNullExpressionValue(endValue2, "endValue");
        this.regularityWakeValueTv = endValue2;
        TextView endLabel2 = binding.C.B;
        Intrinsics.checkNotNullExpressionValue(endLabel2, "endLabel");
        this.regularityWakeLabelTv = endLabel2;
        TextView latestBedtime2 = binding.C.D;
        Intrinsics.checkNotNullExpressionValue(latestBedtime2, "latestBedtime");
        this.earliestWakeupTimeTv = latestBedtime2;
        tvLabel.setText(c0j.hi);
        ivIcon.setImageResource(pni.d2);
        this.mLineChartRecyclerBedTime = binding.D;
        this.mChartEntriesBedTime = new ArrayList();
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerBedTime;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.mLineChartAttrsBedTime = vfeVar;
        this.mLineChartYAxisBedTime = new rtr(vfeVar);
        vfe vfeVar2 = this.mLineChartAttrsBedTime;
        if (vfeVar2 != null) {
            vfeVar2.x0 = true;
        }
        int i2 = isWeek() ? 7 : 30;
        onq weekdayNameFormatter = isWeek() ? new WeekdayNameFormatter() : new brr(context);
        vqr vqrVar = new vqr(this.mLineChartAttrsBedTime, i2, weekdayNameFormatter);
        this.mLineChartXAxisBedTime = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(weekdayNameFormatter);
        this.mLineChartItemDecorationBedTime = new yfe(this.mLineChartYAxisBedTime, this.mLineChartXAxisBedTime, this.mLineChartAttrsBedTime);
        SleepRegularityBedTimeHighlightMarkValueFormatter sleepRegularityBedTimeHighlightMarkValueFormatter = new SleepRegularityBedTimeHighlightMarkValueFormatter(0, isWeek());
        yfe yfeVar = this.mLineChartItemDecorationBedTime;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(sleepRegularityBedTimeHighlightMarkValueFormatter);
        this.mLineChartAdapterBedTime = new j9f(binding.getRoot().getContext(), this.mChartEntriesBedTime, this.mLineChartRecyclerBedTime, this.mLineChartXAxisBedTime, this.mLineChartAttrsBedTime, sleepRegularityBedTimeHighlightMarkValueFormatter);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(binding.getRoot().getContext(), this.mLineChartAttrsBedTime);
        yfe yfeVar2 = this.mLineChartItemDecorationBedTime;
        if (yfeVar2 != null) {
            yfeVar2.setBreakPointLine(Boolean.TRUE);
        }
        LineChartRecyclerView lineChartRecyclerView2 = this.mLineChartRecyclerBedTime;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView3 = this.mLineChartRecyclerBedTime;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        yfe yfeVar3 = this.mLineChartItemDecorationBedTime;
        Intrinsics.checkNotNull(yfeVar3);
        lineChartRecyclerView3.addItemDecoration(yfeVar3);
        LineChartRecyclerView lineChartRecyclerView4 = this.mLineChartRecyclerBedTime;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setAdapter(this.mLineChartAdapterBedTime);
        LineChartRecyclerView lineChartRecyclerView5 = this.mLineChartRecyclerBedTime;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(binding.getRoot().getContext(), this.mLineChartRecyclerBedTime, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepWmRegularityHolder$mItemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                this.this$0.getBinding().B.getRoot().setVisibility((barEntry == null || !barEntry.isSelected()) ? 0 : 4);
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mLineChartRecyclerBedTime;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
        this.mLineChartRecyclerWakeTime = binding.E;
        this.mChartEntriesWakeTime = new ArrayList();
        LineChartRecyclerView lineChartRecyclerView7 = this.mLineChartRecyclerWakeTime;
        Intrinsics.checkNotNull(lineChartRecyclerView7);
        vfe vfeVar3 = (vfe) lineChartRecyclerView7.mAttrs;
        this.mLineChartAttrsWakeTime = vfeVar3;
        this.mLineChartYAxisWakeTime = new rtr(vfeVar3);
        vfe vfeVar4 = this.mLineChartAttrsWakeTime;
        if (vfeVar4 != null) {
            vfeVar4.x0 = true;
        }
        vqr vqrVar2 = new vqr(vfeVar4, i2, weekdayNameFormatter);
        this.mLineChartXAxisWakeTime = vqrVar2;
        Intrinsics.checkNotNull(vqrVar2);
        vqrVar2.setValueFormatter(weekdayNameFormatter);
        this.mLineChartItemDecorationWakeTime = new yfe(this.mLineChartYAxisWakeTime, this.mLineChartXAxisWakeTime, this.mLineChartAttrsWakeTime);
        SleepRegularityWakeupTimeHighlightMarkValueFormatter sleepRegularityWakeupTimeHighlightMarkValueFormatter = new SleepRegularityWakeupTimeHighlightMarkValueFormatter(0, isWeek());
        yfe yfeVar4 = this.mLineChartItemDecorationWakeTime;
        Intrinsics.checkNotNull(yfeVar4);
        yfeVar4.setHighLightValueFormatter(sleepRegularityWakeupTimeHighlightMarkValueFormatter);
        this.mLineChartAdapterWakeTime = new j9f(binding.getRoot().getContext(), this.mChartEntriesWakeTime, this.mLineChartRecyclerWakeTime, this.mLineChartXAxisWakeTime, this.mLineChartAttrsWakeTime, sleepRegularityBedTimeHighlightMarkValueFormatter);
        yfe yfeVar5 = this.mLineChartItemDecorationWakeTime;
        if (yfeVar5 != null) {
            yfeVar5.setBreakPointLine(Boolean.TRUE);
        }
        SpeedRatioLayoutManager speedRatioLayoutManager2 = new SpeedRatioLayoutManager(binding.getRoot().getContext(), this.mLineChartAttrsWakeTime);
        LineChartRecyclerView lineChartRecyclerView8 = this.mLineChartRecyclerWakeTime;
        Intrinsics.checkNotNull(lineChartRecyclerView8);
        lineChartRecyclerView8.setLayoutManager(speedRatioLayoutManager2);
        LineChartRecyclerView lineChartRecyclerView9 = this.mLineChartRecyclerWakeTime;
        Intrinsics.checkNotNull(lineChartRecyclerView9);
        yfe yfeVar6 = this.mLineChartItemDecorationWakeTime;
        Intrinsics.checkNotNull(yfeVar6);
        lineChartRecyclerView9.addItemDecoration(yfeVar6);
        LineChartRecyclerView lineChartRecyclerView10 = this.mLineChartRecyclerWakeTime;
        Intrinsics.checkNotNull(lineChartRecyclerView10);
        lineChartRecyclerView10.setAdapter(this.mLineChartAdapterWakeTime);
        LineChartRecyclerView lineChartRecyclerView11 = this.mLineChartRecyclerWakeTime;
        Intrinsics.checkNotNull(lineChartRecyclerView11);
        lineChartRecyclerView11.setNestedScrollingEnabled(false);
        hak hakVar2 = new hak(binding.getRoot().getContext(), this.mLineChartRecyclerWakeTime, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepWmRegularityHolder$mItemGestureListenerWakeup$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                this.this$0.getBinding().C.getRoot().setVisibility((barEntry == null || !barEntry.isSelected()) ? 0 : 4);
            }
        });
        LineChartRecyclerView lineChartRecyclerView12 = this.mLineChartRecyclerWakeTime;
        Intrinsics.checkNotNull(lineChartRecyclerView12);
        lineChartRecyclerView12.addOnItemTouchListener(hakVar2);
    }

    private final void bindBedTimeCardInfo(AllDaySleepReport allDaySleepReport) {
        SleepTrendStaticsModel periodSleepBedTimeStaticsModel = SleepTrendUtilKt.getPeriodSleepBedTimeStaticsModel(allDaySleepReport);
        int minInWholeHour = periodSleepBedTimeStaticsModel.getMinInWholeHour();
        int maxInWholeHour = periodSleepBedTimeStaticsModel.getMaxInWholeHour();
        int avgInSec = periodSleepBedTimeStaticsModel.getAvgInSec();
        this.avgBedTimeValueTv.setText(SleepTrendUtilKt.secondsTo24HourTimeWithNegativeConverted(avgInSec));
        this.avgBedTimeLabelTv.setText(this.context.getString(c0j.Ed));
        rtr rtrVar = this.mLineChartYAxisBedTime;
        if (rtrVar != null) {
            rtrVar.setValueFormatter(new SleepRegularitySleepTimeValueFormatter());
        }
        rtr rtrVar2 = this.mLineChartYAxisBedTime;
        if (rtrVar2 != null) {
            rtrVar2.mAxisMaximum = maxInWholeHour;
        }
        if (rtrVar2 != null) {
            rtrVar2.mAxisMinimum = minInWholeHour;
        }
        Logger.d(TAG, "bedMin:" + minInWholeHour + ", bedMax:" + maxInWholeHour + ", bedAvg:" + avgInSec);
        List<Float> customLabelInSecList = SleepTrendUtilKt.getCustomLabelInSecList(minInWholeHour, maxInWholeHour);
        rtr rtrVar3 = this.mLineChartYAxisBedTime;
        if (rtrVar3 != null) {
            rtrVar3.f = customLabelInSecList.size();
        }
        rtr rtrVar4 = this.mLineChartYAxisBedTime;
        if (rtrVar4 != null) {
            rtrVar4.e(customLabelInSecList);
        }
        vfe vfeVar = this.mLineChartAttrsBedTime;
        Intrinsics.checkNotNull(vfeVar);
        List<MaxMinEntry> sleepTrendBedTimeEntries = SleepTrendUtilKt.getSleepTrendBedTimeEntries(vfeVar, isWeek(), allDaySleepReport, periodSleepBedTimeStaticsModel);
        List<MaxMinEntry> list = this.mChartEntriesBedTime;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntriesBedTime;
        if (list2 != null) {
            list2.addAll(sleepTrendBedTimeEntries);
        }
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerBedTime;
        if (lineChartRecyclerView != null) {
            lineChartRecyclerView.setYAxis(this.mLineChartYAxisBedTime);
        }
        j9f j9fVar = this.mLineChartAdapterBedTime;
        if (j9fVar != null) {
            j9fVar.notifyDataSetChanged();
        }
        boolean sleepRegularity = SleepTrendUtilKt.getSleepRegularity(allDaySleepReport, periodSleepBedTimeStaticsModel.getAvgInSec(), true);
        Logger.d(TAG, "sleepRegularity=" + sleepRegularity);
        this.regularityBedValueTv.setText(sleepRegularity ? c0j.ji : c0j.ii);
        this.regularityBedLabelTv.setText(c0j.Vd);
        this.latestBedTimeTv.setText(isWeek() ? ResourceExtKt.getString(c0j.hh, SleepTrendUtilKt.secondsTo24HourTimeWithNegativeConverted(periodSleepBedTimeStaticsModel.getMaxInSec())) : ResourceExtKt.getString(c0j.gh, SleepTrendUtilKt.secondsTo24HourTimeWithNegativeConverted(periodSleepBedTimeStaticsModel.getMaxInSec())));
    }

    private final void bindWakeUpCardInfo(AllDaySleepReport allDaySleepReport) {
        SleepTrendStaticsModel periodSleepWakeUpTimeStaticsModel = SleepTrendUtilKt.getPeriodSleepWakeUpTimeStaticsModel(allDaySleepReport);
        int minInWholeHour = periodSleepWakeUpTimeStaticsModel.getMinInWholeHour();
        int maxInWholeHour = periodSleepWakeUpTimeStaticsModel.getMaxInWholeHour();
        Logger.d(TAG, "wakeUpMin:" + minInWholeHour + ", wakeUpMax:" + maxInWholeHour + ", wakeUpAvg:" + periodSleepWakeUpTimeStaticsModel.getAvgInSec());
        List<Float> customLabelInSecList = SleepTrendUtilKt.getCustomLabelInSecList(minInWholeHour, maxInWholeHour);
        Logger.d(TAG, "size=" + customLabelInSecList.size() + " labelList:" + customLabelInSecList);
        rtr rtrVar = this.mLineChartYAxisWakeTime;
        if (rtrVar != null) {
            rtrVar.f = customLabelInSecList.size();
        }
        rtr rtrVar2 = this.mLineChartYAxisWakeTime;
        if (rtrVar2 != null) {
            rtrVar2.e(customLabelInSecList);
        }
        rtr rtrVar3 = this.mLineChartYAxisWakeTime;
        if (rtrVar3 != null) {
            rtrVar3.setValueFormatter(new SleepRegularitySleepTimeValueFormatter());
        }
        rtr rtrVar4 = this.mLineChartYAxisWakeTime;
        if (rtrVar4 != null) {
            rtrVar4.mAxisMaximum = maxInWholeHour;
        }
        if (rtrVar4 != null) {
            rtrVar4.mAxisMinimum = minInWholeHour;
        }
        this.avgWakeTimeValueTv.setText(SleepTrendUtilKt.secondsTo24HourTimeWithNegativeConverted(periodSleepWakeUpTimeStaticsModel.getAvgInSec()));
        this.avgWakeTimeLabelTv.setText(this.context.getString(c0j.Nd));
        boolean sleepRegularity = SleepTrendUtilKt.getSleepRegularity(allDaySleepReport, periodSleepWakeUpTimeStaticsModel.getAvgInSec(), false);
        Logger.d(TAG, "sleepRegularity=" + periodSleepWakeUpTimeStaticsModel);
        this.regularityWakeValueTv.setText(sleepRegularity ? c0j.ji : c0j.ii);
        this.regularityWakeLabelTv.setText(c0j.Kf);
        this.earliestWakeupTimeTv.setText(isWeek() ? ResourceExtKt.getString(c0j.Hf, SleepTrendUtilKt.secondsTo24HourTimeWithNegativeConverted(periodSleepWakeUpTimeStaticsModel.getMinInSec())) : ResourceExtKt.getString(c0j.Gf, SleepTrendUtilKt.secondsTo24HourTimeWithNegativeConverted(periodSleepWakeUpTimeStaticsModel.getMinInSec())));
        vfe vfeVar = this.mLineChartAttrsWakeTime;
        Intrinsics.checkNotNull(vfeVar);
        List<MaxMinEntry> sleepTrendWakeupTimeEntries = SleepTrendUtilKt.getSleepTrendWakeupTimeEntries(vfeVar, isWeek(), allDaySleepReport, periodSleepWakeUpTimeStaticsModel);
        List<MaxMinEntry> list = this.mChartEntriesWakeTime;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntriesWakeTime;
        if (list2 != null) {
            list2.addAll(sleepTrendWakeupTimeEntries);
        }
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerWakeTime;
        if (lineChartRecyclerView != null) {
            lineChartRecyclerView.setYAxis(this.mLineChartYAxisWakeTime);
        }
        j9f j9fVar = this.mLineChartAdapterWakeTime;
        if (j9fVar != null) {
            j9fVar.notifyDataSetChanged();
        }
    }

    private final boolean isWeek() {
        return this.position == 1;
    }

    @NotNull
    public final pce getBinding() {
        return this.binding;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void updateReport(@NotNull AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        boolean zCheckIfLongSleepExist = SleepTrendUtilKt.checkIfLongSleepExist(allDaySleepReport);
        List<AllDaySleepReport> list = dayReportList;
        if (list == null || list.isEmpty() || !zCheckIfLongSleepExist) {
            ViewExtKt.setVisible(this.rootView, false);
            return;
        }
        ViewExtKt.setVisible(this.rootView, true);
        bindBedTimeCardInfo(allDaySleepReport);
        bindWakeUpCardInfo(allDaySleepReport);
    }
}
