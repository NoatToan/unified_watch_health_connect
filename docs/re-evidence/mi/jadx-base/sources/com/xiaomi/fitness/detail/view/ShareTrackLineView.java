package com.xiaomi.fitness.detail.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.view.ShareTrackLineView;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import defpackage.aam;
import defpackage.bge;
import defpackage.dki;
import defpackage.dn5;
import defpackage.ez5;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.ni4;
import defpackage.o5o;
import defpackage.yd5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 M2\u00020\u0001:\u0001MB\u001b\u0012\u0006\u0010H\u001a\u00020G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0004R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0006X\u0086D¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010?\u001a\u0004\bA\u0010B\"\u0004\bC\u0010&R\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/detail/view/ShareTrackLineView;", "Landroid/widget/LinearLayout;", "", "configLine", "()V", "Lcom/github/mikephil/charting/data/LineDataSet;", "basicLineDataSet", "dyLineDataSet", "setLineData", "(Lcom/github/mikephil/charting/data/LineDataSet;Lcom/github/mikephil/charting/data/LineDataSet;)V", "", "Lcom/github/mikephil/charting/data/Entry;", "list", "configBasicLineDataSet", "(Ljava/util/List;)Lcom/github/mikephil/charting/data/LineDataSet;", "configDynamicLineDataSet", "createLine", "(Ljava/util/List;)V", "", "viewType", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "getLineData", "(I)Ljava/util/List;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "getChartKeyByType", "(I)Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "getPaceDrawValue", "(Ljava/util/List;)Ljava/util/List;", DailyRecordKey.sportType, "", "getPaceMaxLevel", "(I)F", "setData", "(I)V", "", "duration", "startDynamicLine", "(J)V", "pauseDynamicLine", "resumeDynamicLine", "Laam;", "binding", "Laam;", "getBinding", "()Laam;", "Lcom/xiaomi/fitness/chart/mpchart/linechart/CustomLineChart;", "lineChart", "Lcom/xiaomi/fitness/chart/mpchart/linechart/CustomLineChart;", "getLineChart", "()Lcom/xiaomi/fitness/chart/mpchart/linechart/CustomLineChart;", "lineWidth", "F", "getLineWidth", "()F", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "lineData", "Ljava/util/List;", "itemDelay", "J", "pauseDelay", "getPauseDelay", "()J", "setPauseDelay", "Landroid/animation/ValueAnimator;", "lineAnimator", "Landroid/animation/ValueAnimator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareTrackLineView extends LinearLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int animatiorDuration = 500;
    public static final int gpsLineChartType = 0;
    public static final int heightLineChartType = 4;
    public static final int hrmLineChartType = 1;
    public static final int paceLineChartType = 3;
    public static final int speedLineChartType = 2;

    @NotNull
    private final String TAG;

    @NotNull
    private final aam binding;
    private long itemDelay;

    @NotNull
    private final ValueAnimator lineAnimator;

    @NotNull
    private final CustomLineChart lineChart;

    @Nullable
    private List<Entry> lineData;
    private final float lineWidth;
    private long pauseDelay;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/detail/view/ShareTrackLineView$Companion;", "", "<init>", "()V", "animatiorDuration", "", "getAnimatiorDuration", "()I", "gpsLineChartType", "hrmLineChartType", "speedLineChartType", "paceLineChartType", "heightLineChartType", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAnimatiorDuration() {
            return ShareTrackLineView.animatiorDuration;
        }
    }

    public /* synthetic */ ShareTrackLineView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final LineDataSet configBasicLineDataSet(List<Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.V0(ni4.c(AppUtil.getApp(), dki.f2));
        lineDataSet.s1(ez5.b(lineDataSet.X()));
        lineDataSet.Y0(false);
        lineDataSet.A1(false);
        lineDataSet.B1(false);
        lineDataSet.o1(true);
        lineDataSet.r1(ni4.e(getContext(), hoi.A0));
        lineDataSet.Z0(false);
        lineDataSet.D1(LineDataSet.Mode.LINEAR);
        return lineDataSet;
    }

    private final LineDataSet configDynamicLineDataSet(List<Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(new ArrayList(), "");
        lineDataSet.V0(ni4.c(AppUtil.getApp(), dki.K1));
        lineDataSet.s1(ez5.b(lineDataSet.X()));
        lineDataSet.Y0(false);
        lineDataSet.A1(false);
        lineDataSet.o1(true);
        lineDataSet.r1(ni4.e(getContext(), hoi.B0));
        lineDataSet.B1(false);
        lineDataSet.Z0(false);
        lineDataSet.D1(LineDataSet.Mode.HORIZONTAL_BEZIER);
        return lineDataSet;
    }

    private final void configLine() {
        CustomLineChart customLineChart = this.binding.A;
        customLineChart.setDrawBorders(false);
        customLineChart.setDrawGridBackground(false);
        customLineChart.setScaleEnabled(false);
        Legend legend = this.binding.A.getLegend();
        legend.setEnabled(false);
        legend.y(Legend.LegendForm.CIRCLE);
        legend.A(100.0f);
        legend.z(100.0f);
        XAxis xAxis = this.binding.A.getXAxis();
        xAxis.setTextSize(100.0f);
        xAxis.setEnabled(false);
        YAxis axisLeft = this.binding.A.getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.q(false);
        axisLeft.setEnabled(false);
        axisLeft.setTextSize(100.0f);
        this.binding.A.getAxisRight().setEnabled(false);
        this.binding.A.getDescription().setEnabled(false);
    }

    private final void createLine(List<Entry> list) {
        LineDataSet lineDataSetConfigBasicLineDataSet = configBasicLineDataSet(list);
        setLineData(lineDataSetConfigBasicLineDataSet, lineDataSetConfigBasicLineDataSet);
    }

    private final SportRecordKey getChartKeyByType(int viewType) {
        if (viewType == 1) {
            return SportRecordKey.Hr;
        }
        if (viewType == 2) {
            return SportRecordKey.Speed;
        }
        if (viewType != 3) {
            return viewType != 4 ? SportRecordKey.Hr : SportRecordKey.Height;
        }
        List<SportRecordItem> listI = o5o.e().i();
        return (listI == null || !(listI.isEmpty() ^ true)) ? SportRecordKey.Pace : SportRecordKey.SwimPace;
    }

    private final List<SportRecordItem> getLineData(int viewType) {
        List<SportRecordItem> listD;
        this.binding.A.getMLineChartAttr().y = false;
        dn5 renderer = this.binding.A.getRenderer();
        Intrinsics.checkNotNull(renderer, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
        ((yd5) renderer).m(this.binding.A.getMLineChartAttr());
        if (viewType == 1) {
            List<SportRecordItem> listG = o5o.e().g();
            if (listG == null || !(!listG.isEmpty())) {
                return null;
            }
            this.binding.C.setText(AppUtil.getApp().getString(j1j.O7));
            return o5o.e().g();
        }
        if (viewType == 2) {
            List<SportRecordItem> listH = o5o.e().h();
            if (listH == null || !(!listH.isEmpty())) {
                return null;
            }
            this.binding.C.setText(AppUtil.getApp().getString(j1j.N3));
            return o5o.e().h();
        }
        if (viewType != 3) {
            if (viewType != 4 || (listD = o5o.e().d()) == null || !(!listD.isEmpty())) {
                return null;
            }
            this.binding.C.setText(AppUtil.getApp().getString(j1j.b5));
            return o5o.e().d();
        }
        YAxis axisRight = this.binding.A.getAxisRight();
        if (axisRight != null) {
            axisRight.r(true);
        }
        List<SportRecordItem> listF = o5o.e().f();
        if (listF != null && (!listF.isEmpty())) {
            this.binding.C.setText(AppUtil.getApp().getString(j1j.K3));
            return o5o.e().f();
        }
        List<SportRecordItem> listI = o5o.e().i();
        if (listI == null || !(!listI.isEmpty())) {
            return null;
        }
        this.binding.C.setText(AppUtil.getApp().getString(j1j.K3));
        this.binding.A.getMLineChartAttr().y = true;
        dn5 renderer2 = this.binding.A.getRenderer();
        Intrinsics.checkNotNull(renderer2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
        ((yd5) renderer2).m(this.binding.A.getMLineChartAttr());
        return o5o.e().i();
    }

    private final List<SportRecordItem> getPaceDrawValue(List<SportRecordItem> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SportRecordItem> it = list.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().getValue().intValue());
        }
        for (SportRecordItem sportRecordItem : list) {
            ListExtKt.add(arrayList, new SportRecordItem(sportRecordItem.getStartTime(), sportRecordItem.getEndTime(), Integer.valueOf(iMax - sportRecordItem.getValue().intValue()), sportRecordItem.getIndex(), 0, 16, null));
        }
        return arrayList;
    }

    private final float getPaceMaxLevel(int sportType) {
        if (sportType != 1 && sportType != 2 && sportType != 3 && sportType != 5) {
            if (sportType == 6) {
                return 2400.0f;
            }
            if (sportType != 15) {
                return -1.0f;
            }
        }
        return 3600.0f;
    }

    private final void setLineData(LineDataSet basicLineDataSet, LineDataSet dyLineDataSet) {
        bge bgeVar = new bge();
        bgeVar.a(basicLineDataSet);
        this.binding.A.setData(bgeVar);
        this.binding.A.getLineData().x();
        this.binding.A.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDynamicLine$lambda$7$lambda$6(List it, ShareTrackLineView this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float size = it.size() * (((Float) animatedValue).floatValue() / animatiorDuration);
        if (size < it.size()) {
            this$0.binding.A.getLineData().b((Entry) it.get((int) size), 1);
            this$0.binding.A.getLineData().x();
            this$0.binding.A.notifyDataSetChanged();
            this$0.binding.A.postInvalidateOnAnimation();
        }
    }

    @NotNull
    public final aam getBinding() {
        return this.binding;
    }

    @NotNull
    public final CustomLineChart getLineChart() {
        return this.lineChart;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public final long getPauseDelay() {
        return this.pauseDelay;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final void pauseDynamicLine(long duration) {
        Logger.d(this.TAG, "pauseDynamicLine");
        this.pauseDelay = duration;
        this.lineAnimator.pause();
    }

    public final void resumeDynamicLine() {
        Logger.d(this.TAG, "resumeDynamicLine");
        this.pauseDelay = 0L;
        this.lineAnimator.resume();
    }

    public final void setData(int viewType) {
        long millis = TimeUnit.SECONDS.toMillis(1L);
        List<SportRecordItem> lineData = getLineData(viewType);
        if (lineData == null || lineData.size() < 2) {
            this.binding.B.setVisibility(8);
            return;
        }
        int i = 0;
        this.binding.B.setVisibility(0);
        Integer numValueOf = lineData != null ? Integer.valueOf(lineData.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        this.itemDelay = millis / ((long) numValueOf.intValue());
        this.lineData = new ArrayList();
        for (SportRecordItem sportRecordItem : lineData) {
            int i2 = i + 1;
            List<Entry> list = this.lineData;
            if (list != null) {
                list.add(new Entry(i, sportRecordItem.getValue().floatValue()));
            }
            i = i2;
        }
        SportRecordKey chartKeyByType = getChartKeyByType(viewType);
        List<SportRecordEntry> listCreatePaceEntryList = chartKeyByType == SportRecordKey.Pace ? SportRecordDataUtil.INSTANCE.createPaceEntryList(lineData, 1800.0f) : SportRecordDataUtil.createEntryListInner(lineData).getSportRecordList();
        this.lineChart.setChartKey(chartKeyByType);
        CustomLineChart.bindData$default(this.lineChart, listCreatePaceEntryList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
    }

    public final void setPauseDelay(long j) {
        this.pauseDelay = j;
    }

    public final void startDynamicLine(long duration) {
        final List<Entry> list = this.lineData;
        if (list != null) {
            Logger.d(this.TAG, "startDynamicLine");
            List<Entry> list2 = this.lineData;
            Intrinsics.checkNotNull(list2);
            createLine(list2);
            this.lineAnimator.setDuration(duration);
            this.lineAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: x9m
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ShareTrackLineView.startDynamicLine$lambda$7$lambda$6(list, this, valueAnimator);
                }
            });
            this.lineAnimator.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareTrackLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.lineWidth = 1.3f;
        this.TAG = "TrackLineView";
        aam aamVarA0 = aam.A0(LayoutInflater.from(context), this, true);
        this.binding = aamVarA0;
        CustomLineChart customLineChart = aamVarA0.A;
        this.lineChart = customLineChart;
        customLineChart.setNoDataText("");
        getWidth();
        configLine();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, animatiorDuration);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
        this.lineAnimator = valueAnimatorOfFloat;
    }
}
