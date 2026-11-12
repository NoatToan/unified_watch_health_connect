package com.xiaomi.fitness.share.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.share.view.TrackLineView;
import defpackage.bge;
import defpackage.dki;
import defpackage.ez5;
import defpackage.fmq;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.ni4;
import defpackage.o5o;
import defpackage.pxq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0001IB\u001b\u0012\u0006\u0010D\u001a\u00020C\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\b\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002¢\u0006\u0004\b!\u0010\u0015J\u0015\u0010\"\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020\u0002¢\u0006\u0004\b)\u0010\u0004J\r\u0010*\u001a\u00020\u0002¢\u0006\u0004\b*\u0010\u0004R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u00104\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010<\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010;\u001a\u0004\b=\u0010>\"\u0004\b?\u0010'R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/share/view/TrackLineView;", "Landroid/widget/LinearLayout;", "", "configLine", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "list", "removePreZeroValue", "(Ljava/util/List;Ljava/util/List;)V", "Lcom/github/mikephil/charting/data/LineDataSet;", "basicLineDataSet", "dyLineDataSet", "setLineData", "(Lcom/github/mikephil/charting/data/LineDataSet;Lcom/github/mikephil/charting/data/LineDataSet;)V", "", "Lcom/github/mikephil/charting/data/Entry;", "configBasicLineDataSet", "(Ljava/util/List;)Lcom/github/mikephil/charting/data/LineDataSet;", "configDynamicLineDataSet", "createLine", "(Ljava/util/List;)V", "", DailyRecordKey.sportType, "getLineData", "(I)Ljava/util/List;", "", "runOutdoorHeightValue", "()Z", "runOutdoorRateValue", "", "getPaceMaxLevel", "(I)F", "setMinAndMaxLineData", "setData", "(I)V", "", "duration", "startDynamicLine", "(J)V", "pauseDynamicLine", "resumeDynamicLine", "stopDynamicLine", "Lpxq;", "binding", "Lpxq;", "Lcom/github/mikephil/charting/charts/LineChart;", "lineChart", "Lcom/github/mikephil/charting/charts/LineChart;", "lineColor", "I", "mFillDrawable", "lineWidth", "F", "getLineWidth", "()F", "lineData", "Ljava/util/List;", "itemDelay", "J", "pauseDelay", "getPauseDelay", "()J", "setPauseDelay", "Landroid/animation/ValueAnimator;", "lineAnimator", "Landroid/animation/ValueAnimator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrackLineView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackLineView.kt\ncom/xiaomi/fitness/share/view/TrackLineView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,415:1\n2318#2,14:416\n1948#2,14:430\n*S KotlinDebug\n*F\n+ 1 TrackLineView.kt\ncom/xiaomi/fitness/share/view/TrackLineView\n*L\n408#1:416,14\n409#1:430,14\n*E\n"})
public final class TrackLineView extends LinearLayout {

    @NotNull
    private final pxq binding;
    private long itemDelay;

    @NotNull
    private final ValueAnimator lineAnimator;

    @NotNull
    private final LineChart lineChart;
    private int lineColor;

    @Nullable
    private List<Entry> lineData;
    private final float lineWidth;
    private int mFillDrawable;
    private long pauseDelay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int animatiorDuration = 15500;

    @NotNull
    private static final String TAG = "TrackLineView";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/share/view/TrackLineView$Companion;", "", "<init>", "()V", "animatiorDuration", "", "getAnimatiorDuration", "()I", "TAG", "", "getTAG", "()Ljava/lang/String;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAnimatiorDuration() {
            return TrackLineView.animatiorDuration;
        }

        @NotNull
        public final String getTAG() {
            return TrackLineView.TAG;
        }
    }

    public /* synthetic */ TrackLineView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final LineDataSet configBasicLineDataSet(List<Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.V0(ni4.c(AppUtil.getApp(), dki.j2));
        lineDataSet.s1(ez5.b(lineDataSet.X()));
        lineDataSet.Y0(false);
        lineDataSet.A1(false);
        lineDataSet.B1(false);
        lineDataSet.o1(true);
        lineDataSet.r1(ni4.e(getContext(), hoi.A0));
        lineDataSet.Z0(false);
        lineDataSet.D1(LineDataSet.Mode.HORIZONTAL_BEZIER);
        return lineDataSet;
    }

    private final LineDataSet configDynamicLineDataSet(List<Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(new ArrayList(), "");
        lineDataSet.V0(ni4.c(AppUtil.getApp(), this.lineColor));
        lineDataSet.s1(ez5.b(lineDataSet.X()));
        lineDataSet.Y0(false);
        lineDataSet.A1(false);
        lineDataSet.o1(true);
        if (fmq.s() >= 18) {
            lineDataSet.r1(ni4.e(getContext(), this.mFillDrawable));
        } else {
            lineDataSet.q1(ni4.c(getContext(), this.mFillDrawable));
        }
        lineDataSet.B1(false);
        lineDataSet.Z0(false);
        lineDataSet.D1(LineDataSet.Mode.HORIZONTAL_BEZIER);
        return lineDataSet;
    }

    private final void configLine() {
        LineChart lineChart = this.binding.A;
        lineChart.setDrawBorders(false);
        lineChart.setDrawGridBackground(false);
        lineChart.setScaleEnabled(false);
        lineChart.setMinOffset(0.0f);
        Legend legend = this.binding.A.getLegend();
        legend.setEnabled(false);
        legend.y(Legend.LegendForm.CIRCLE);
        legend.A(100.0f);
        legend.z(100.0f);
        XAxis xAxis = this.binding.A.getXAxis();
        xAxis.setTextSize(100.0f);
        xAxis.setEnabled(false);
        this.binding.A.getAxisRight().setEnabled(false);
        this.binding.A.getDescription().setEnabled(false);
    }

    private final void createLine(List<Entry> list) {
        setLineData(configBasicLineDataSet(list), configDynamicLineDataSet(list));
    }

    private final List<SportRecordItem> getLineData(int sportType) {
        if (sportType != 9) {
            if (sportType != 20) {
                if (sportType != 22) {
                    if (sportType == 24) {
                        List<SportRecordItem> listG = o5o.e().g();
                        if (listG == null || !(!listG.isEmpty())) {
                            return null;
                        }
                        this.binding.C.setText(AppUtil.getApp().getString(j1j.c5));
                        this.lineColor = dki.y1;
                        this.mFillDrawable = hoi.D0;
                        return o5o.e().g();
                    }
                    if (sportType == 36) {
                        List<SportRecordItem> list = o5o.e().m;
                        if (list != null && (!list.isEmpty())) {
                            this.binding.C.setText(AppUtil.getApp().getString(j1j.c5));
                            this.lineColor = dki.y1;
                            this.mFillDrawable = hoi.D0;
                            return o5o.e().m;
                        }
                        List<SportRecordItem> listD = o5o.e().d();
                        if (listD == null || !(!listD.isEmpty())) {
                            return null;
                        }
                        this.binding.C.setText(AppUtil.getApp().getString(j1j.a5));
                        this.lineColor = dki.z1;
                        this.mFillDrawable = hoi.F0;
                        return o5o.e().d();
                    }
                    switch (sportType) {
                        case 26:
                            List<SportRecordItem> listG2 = o5o.e().g();
                            if (listG2 != null && (!listG2.isEmpty())) {
                                this.binding.C.setText(AppUtil.getApp().getString(j1j.c5));
                                this.lineColor = dki.y1;
                                this.mFillDrawable = hoi.D0;
                                return o5o.e().g();
                            }
                            List<SportRecordItem> listH = o5o.e().h();
                            if (listH != null && (!listH.isEmpty())) {
                                this.binding.C.setText(AppUtil.getApp().getString(j1j.N3));
                                this.lineColor = dki.A1;
                                this.mFillDrawable = hoi.G0;
                                return o5o.e().h();
                            }
                            List<SportRecordItem> listD2 = o5o.e().d();
                            if (listD2 == null || !(!listD2.isEmpty())) {
                                return null;
                            }
                            this.binding.C.setText(AppUtil.getApp().getString(j1j.a5));
                            this.lineColor = dki.z1;
                            this.mFillDrawable = hoi.F0;
                            return o5o.e().d();
                        case 27:
                            break;
                        case 28:
                            List<SportRecordItem> listG3 = o5o.e().g();
                            if (listG3 != null && (!listG3.isEmpty())) {
                                this.binding.C.setText(AppUtil.getApp().getString(j1j.c5));
                                this.lineColor = dki.y1;
                                this.mFillDrawable = hoi.D0;
                                return o5o.e().g();
                            }
                            List<SportRecordItem> listD3 = o5o.e().d();
                            if (listD3 == null || !(!listD3.isEmpty())) {
                                return null;
                            }
                            this.binding.C.setText(AppUtil.getApp().getString(j1j.a5));
                            this.lineColor = dki.z1;
                            this.mFillDrawable = hoi.F0;
                            return o5o.e().d();
                        default:
                            if (runOutdoorRateValue()) {
                                return o5o.e().g();
                            }
                            if (runOutdoorHeightValue()) {
                                return o5o.e().d();
                            }
                            return null;
                    }
                }
            }
            List<SportRecordItem> listG4 = o5o.e().g();
            if (listG4 != null && (!listG4.isEmpty())) {
                this.binding.C.setText(AppUtil.getApp().getString(j1j.c5));
                this.lineColor = dki.y1;
                this.mFillDrawable = hoi.D0;
                return o5o.e().g();
            }
            List<SportRecordItem> listD4 = o5o.e().d();
            if (listD4 == null || !(!listD4.isEmpty())) {
                return null;
            }
            this.binding.C.setText(AppUtil.getApp().getString(j1j.a5));
            this.lineColor = dki.z1;
            this.mFillDrawable = hoi.F0;
            return o5o.e().d();
        }
        if (runOutdoorRateValue()) {
            return o5o.e().g();
        }
        if (runOutdoorHeightValue()) {
            return o5o.e().d();
        }
        return null;
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

    private final void removePreZeroValue(List<SportRecordItem> list, List<SportRecordItem> list2) {
        int i = 0;
        int iIntValue = 0;
        for (SportRecordItem sportRecordItem : list2) {
            int i2 = i + 1;
            if (Intrinsics.areEqual((Object) sportRecordItem.getValue(), (Object) 0) && iIntValue == 0) {
                ListExtKt.remove(list2, i);
            } else {
                Number value = sportRecordItem.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) value).intValue();
            }
            i = i2;
        }
    }

    private final boolean runOutdoorHeightValue() {
        List<SportRecordItem> listD = o5o.e().d();
        if (listD == null || !(!listD.isEmpty())) {
            return false;
        }
        this.binding.C.setText(AppUtil.getApp().getString(j1j.a5));
        this.lineColor = dki.z1;
        this.mFillDrawable = hoi.F0;
        return true;
    }

    private final boolean runOutdoorRateValue() {
        List<SportRecordItem> listG = o5o.e().g();
        if (listG == null || !(!listG.isEmpty())) {
            return false;
        }
        this.binding.C.setText(AppUtil.getApp().getString(j1j.c5));
        this.lineColor = dki.y1;
        this.mFillDrawable = hoi.D0;
        return true;
    }

    private final void setLineData(LineDataSet basicLineDataSet, LineDataSet dyLineDataSet) {
        bge bgeVar = new bge();
        bgeVar.a(basicLineDataSet);
        bgeVar.a(dyLineDataSet);
        this.binding.A.setData(bgeVar);
        this.binding.A.getLineData().x();
        this.binding.A.notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    private final void setMinAndMaxLineData(List<SportRecordItem> list) {
        float fFloatValue;
        Number value;
        Number value2;
        YAxis axisLeft = this.binding.A.getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.q(false);
        float fFloatValue2 = 0.0f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                float fFloatValue3 = ((SportRecordItem) next).getValue().floatValue();
                do {
                    Object next2 = it.next();
                    float fFloatValue4 = ((SportRecordItem) next2).getValue().floatValue();
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        next = next2;
                        fFloatValue3 = fFloatValue4;
                    }
                } while (it.hasNext());
            }
            SportRecordItem sportRecordItem = (SportRecordItem) next;
            if (sportRecordItem == null || (value2 = sportRecordItem.getValue()) == null) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = value2.floatValue();
            }
        } else {
            fFloatValue = 0.0f;
        }
        axisLeft.setAxisMinimum(fFloatValue);
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next3 = it2.next();
            if (it2.hasNext()) {
                float fFloatValue5 = ((SportRecordItem) next3).getValue().floatValue();
                do {
                    Object next4 = it2.next();
                    float fFloatValue6 = ((SportRecordItem) next4).getValue().floatValue();
                    if (Float.compare(fFloatValue5, fFloatValue6) < 0) {
                        next3 = next4;
                        fFloatValue5 = fFloatValue6;
                    }
                } while (it2.hasNext());
            }
            SportRecordItem sportRecordItem2 = (SportRecordItem) next3;
            if (sportRecordItem2 != null && (value = sportRecordItem2.getValue()) != null) {
                fFloatValue2 = value.floatValue();
            }
        }
        axisLeft.setAxisMaximum(fFloatValue2);
        FitnessLogUtils.d(TAG, "axisMinimum:" + axisLeft.getAxisMinimum() + " , axisMaximum:" + axisLeft.getAxisMaximum());
        axisLeft.setEnabled(false);
        axisLeft.setTextSize(100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDynamicLine$lambda$6$lambda$5(List it, TrackLineView this$0, ValueAnimator animation) {
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

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public final long getPauseDelay() {
        return this.pauseDelay;
    }

    public final void pauseDynamicLine(long duration) {
        Logger.d(TAG, "pauseDynamicLine");
        this.pauseDelay = duration;
        this.lineAnimator.pause();
    }

    public final void resumeDynamicLine() {
        Logger.d(TAG, "resumeDynamicLine");
        this.pauseDelay = 0L;
        this.lineAnimator.resume();
    }

    public final void setData(int sportType) {
        List<Entry> list;
        long millis = TimeUnit.SECONDS.toMillis(15L);
        List<SportRecordItem> lineData = getLineData(sportType);
        if (lineData == null || lineData.size() < 15) {
            this.binding.B.setVisibility(8);
            return;
        }
        setMinAndMaxLineData(lineData);
        Integer numValueOf = lineData != null ? Integer.valueOf(lineData.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        this.itemDelay = millis / ((long) numValueOf.intValue());
        this.lineData = new ArrayList();
        int i = 0;
        for (SportRecordItem sportRecordItem : lineData) {
            int i2 = i + 1;
            if (i != 0) {
                List<Entry> list2 = this.lineData;
                if (list2 != null) {
                    list2.add(new Entry(i, sportRecordItem.getValue().floatValue()));
                }
            } else if (!Intrinsics.areEqual((Object) sportRecordItem.getValue(), (Object) 0) && (list = this.lineData) != null) {
                list.add(new Entry(i, sportRecordItem.getValue().floatValue()));
            }
            i = i2;
        }
        startDynamicLine(1L);
    }

    public final void setPauseDelay(long j) {
        this.pauseDelay = j;
    }

    public final void startDynamicLine(long duration) {
        final List<Entry> list = this.lineData;
        if (list != null) {
            Logger.d(TAG, "startDynamicLine");
            createLine(list);
            this.lineAnimator.setDuration(duration);
            this.lineAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: onp
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TrackLineView.startDynamicLine$lambda$6$lambda$5(list, this, valueAnimator);
                }
            });
            this.lineAnimator.start();
        }
    }

    public final void stopDynamicLine() {
        this.lineAnimator.cancel();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.lineWidth = 1.3f;
        pxq pxqVarA0 = pxq.A0(LayoutInflater.from(context), this, true);
        this.binding = pxqVarA0;
        LineChart lineChart = pxqVarA0.A;
        this.lineChart = lineChart;
        lineChart.setNoDataText("");
        lineChart.setExtraOffsets(0.0f, 0.0f, 0.0f, ExtUtilsKt.getDp(5));
        configLine();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, animatiorDuration);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
        this.lineAnimator = valueAnimatorOfFloat;
    }
}
