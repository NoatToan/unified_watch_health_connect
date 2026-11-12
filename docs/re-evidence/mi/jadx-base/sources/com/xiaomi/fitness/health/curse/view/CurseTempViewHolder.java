package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.data.valueformatter.TempTrendHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.TempTrendYValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseMainActivity;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.adapter.CurseTempLineChartAdapter;
import com.xiaomi.fitness.health.curse.view.CurseTempViewHolder;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.health.temperature.ui.TemperatureBaseWeekMonthFragment;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.TemperatureDataUtil;
import com.xiaomi.fitness.view.TemperatureTrendEmptyView;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.arr;
import defpackage.c0j;
import defpackage.hak;
import defpackage.jui;
import defpackage.qtb;
import defpackage.rtr;
import defpackage.sk5;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0018\u00109\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseTempViewHolder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "initTrendChartRecyclerView", "()V", "refreshView", LifecycleConstantKt.ON_RESUME, "Lorg/joda/time/LocalDate;", DialWidgetType.DATE, "refreshData", "(Lorg/joda/time/LocalDate;)V", "Lcom/xiaomi/fitness/health/curse/CurseMainActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/health/curse/CurseMainActivity;", "Lqtb;", "bind", "Lqtb;", "Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM$delegate", "Lkotlin/Lazy;", "getMainVM", "()Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "Lcom/xiaomi/fitness/health/curse/adapter/CurseTempLineChartAdapter;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mLineChartAdapter", "Lcom/xiaomi/fitness/health/curse/adapter/CurseTempLineChartAdapter;", "", "mChartEntries", "Ljava/util/List;", "Lyfe;", "mItemDecoration", "Lyfe;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Ljava/util/TreeMap;", "", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "recordMap", "Ljava/util/TreeMap;", "leftTime", "Ljava/lang/Long;", "rightTime", "refreshDate", "Lorg/joda/time/LocalDate;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseTempViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseTempViewHolder.kt\ncom/xiaomi/fitness/health/curse/view/CurseTempViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,297:1\n1863#2,2:298\n1863#2,2:300\n*S KotlinDebug\n*F\n+ 1 CurseTempViewHolder.kt\ncom/xiaomi/fitness/health/curse/view/CurseTempViewHolder\n*L\n109#1:298,2\n136#1:300,2\n*E\n"})
public final class CurseTempViewHolder extends ConstraintLayout {

    @NotNull
    private final CurseMainActivity activity;

    @NotNull
    private final qtb bind;

    @Nullable
    private Long leftTime;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private CurseTempLineChartAdapter<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    /* JADX INFO: renamed from: mainVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainVM;

    @NotNull
    private TreeMap<Long, TemperatureTrendItem> recordMap;

    @Nullable
    private LocalDate refreshDate;

    @Nullable
    private Long rightTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseTempViewHolder(@NotNull Context context, @NotNull AttributeSet attr) {
        this(context, attr, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x021c  */
    public static final Unit _init_$lambda$8(CurseTempViewHolder this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("CurseTempViewHolder", "temperatureTrendData：" + list);
        if (list.isEmpty()) {
            this$0.recordMap.clear();
            TemperatureTrendEmptyView emptyView = this$0.bind.N;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ViewExtKt.setVisible(emptyView, true);
            ConstraintLayout curseTempChartLayout = this$0.bind.D;
            Intrinsics.checkNotNullExpressionValue(curseTempChartLayout, "curseTempChartLayout");
            ViewExtKt.setVisible(curseTempChartLayout, false);
        } else {
            ConstraintLayout curseTempChartLayout2 = this$0.bind.D;
            Intrinsics.checkNotNullExpressionValue(curseTempChartLayout2, "curseTempChartLayout");
            ViewExtKt.setVisible(curseTempChartLayout2, CurseManager.INSTANCE.getInstance().isAlgoPredictEnable());
            TemperatureTrendEmptyView emptyView2 = this$0.bind.N;
            Intrinsics.checkNotNullExpressionValue(emptyView2, "emptyView");
            ViewExtKt.setVisible(emptyView2, false);
            Intrinsics.checkNotNull(list);
            List<TemperatureTrendItem> list2 = list;
            TemperatureTrendItem temperatureTrendItem = null;
            for (TemperatureTrendItem temperatureTrendItem2 : list2) {
                this$0.recordMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(temperatureTrendItem2.getTime())), temperatureTrendItem2);
                if (TimeUtils.INSTANCE.isSameDay(temperatureTrendItem2.getTime() * ((long) 1000), System.currentTimeMillis())) {
                    temperatureTrendItem = temperatureTrendItem2;
                }
            }
            this$0.leftTime = this$0.recordMap.firstKey();
            this$0.rightTime = this$0.recordMap.lastKey();
            Long l = this$0.leftTime;
            Intrinsics.checkNotNull(l);
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(l.longValue());
            Long l2 = this$0.rightTime;
            Intrinsics.checkNotNull(l2);
            Logger.i("CurseTempViewHolder", "temperatureTrendData leftTime:" + localDateTimestampToLocalDate + "/rightTime" + TimeDateUtil.timestampToLocalDate(l2.longValue()));
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String str = "";
            if (temperatureTrendItem != null) {
                Intrinsics.checkNotNull(temperatureTrendItem);
                if (temperatureTrendItem.getStatus() == 2) {
                    str = ExtUtilKt.getString(c0j.bn) + "，";
                } else if (temperatureTrendItem.getStatus() == 1) {
                    str = ExtUtilKt.getString(c0j.f4796cn) + "，";
                }
            }
            Iterator it = list2.iterator();
            float diffTemp = 0.0f;
            while (it.hasNext()) {
                diffTemp += ((TemperatureTrendItem) it.next()).getDiffTemp();
            }
            Logger.i(TemperatureBaseWeekMonthFragment.TAG, "curseTemperatureTrendData totalDiff:" + diffTemp);
            String str2 = decimalFormat.format(Float.valueOf(diffTemp == 0.0f ? 0.0f : diffTemp / list.size()));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            float f = Float.parseFloat(str2);
            if (f < 0.0f) {
                this$0.bind.I.setText("-");
            } else {
                this$0.bind.I.setText(Marker.ANY_NON_NULL_MARKER);
            }
            this$0.bind.G.setText(Math.abs(f) + "°C");
            this$0.bind.E.setText(ExtUtilKt.getString(c0j.Zm));
            LocalDate localDate = this$0.refreshDate;
            if (localDate != null) {
                CurseManager companion = CurseManager.INSTANCE.getInstance();
                LocalDate localDateNow = LocalDate.now();
                Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
                Pair<Integer, String> tempTrendDesc = companion.getTempTrendDesc(TimeDateUtil.localDateToTimestamp(localDateNow) * ((long) 1000));
                if (tempTrendDesc.getFirst().intValue() == 0) {
                    LocalDate localDateNow2 = LocalDate.now();
                    Intrinsics.checkNotNullExpressionValue(localDateNow2, "now(...)");
                    if (TimeDateUtil.isSameMonthLocalDate(localDateNow2, localDate)) {
                        TextView curseTempBaselineDesc = this$0.bind.C;
                        Intrinsics.checkNotNullExpressionValue(curseTempBaselineDesc, "curseTempBaselineDesc");
                        ViewExtKt.setVisible(curseTempBaselineDesc, true);
                        TextView textView = this$0.bind.C;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str3 = String.format("%s%s", Arrays.copyOf(new Object[]{str, tempTrendDesc.getSecond()}, 2));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        textView.setText(str3);
                    } else {
                        TextView curseTempBaselineDesc2 = this$0.bind.C;
                        Intrinsics.checkNotNullExpressionValue(curseTempBaselineDesc2, "curseTempBaselineDesc");
                        ViewExtKt.setVisible(curseTempBaselineDesc2, false);
                    }
                } else {
                    TextView curseTempBaselineDesc3 = this$0.bind.C;
                    Intrinsics.checkNotNullExpressionValue(curseTempBaselineDesc3, "curseTempBaselineDesc");
                    ViewExtKt.setVisible(curseTempBaselineDesc3, false);
                }
            }
            this$0.refreshView();
        }
        return Unit.INSTANCE;
    }

    private final CurseMainVM getMainVM() {
        return (CurseMainVM) this.mainVM.getValue();
    }

    private final void initTrendChartRecyclerView() {
        Logger.d("CurseTempViewHolder", "initTrendChartRecyclerView");
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.lineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        vfeVar.a0 = true;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.activity, this.lineChartAttrs);
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        rtr rtrVarF = rtr.f(vfeVar2, 60.0f, 3);
        this.mYAxis = rtrVarF;
        Intrinsics.checkNotNull(rtrVarF);
        rtrVarF.setValueFormatter(new TempTrendYValueFormatter());
        rtr rtrVar = this.mYAxis;
        if (rtrVar != null) {
            rtrVar.f = 5;
        }
        vfe vfeVar3 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        vqr vqrVar = new vqr(vfeVar3, vfeVar3.c, new arr(getContext()));
        this.mXAxis = vqrVar;
        this.mItemDecoration = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        TempTrendHighLightMarkValueFormatter tempTrendHighLightMarkValueFormatter = new TempTrendHighLightMarkValueFormatter(this.activity);
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(tempTrendHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new CurseTempLineChartAdapter<>(this.activity, this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, tempTrendHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(this.activity, this.lineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.curse.view.CurseTempViewHolder$initTrendChartRecyclerView$itemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    this.this$0.bind.F.setVisibility(0);
                } else {
                    this.this$0.bind.F.setVisibility(4);
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                this.isRightScrollInner = dx < 0;
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseMainVM mainVM_delegate$lambda$0(CurseTempViewHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (CurseMainVM) new ViewModelProvider(this$0.activity).get(CurseMainVM.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int recordMap$lambda$1(long j, long j2) {
        return Intrinsics.compare(j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int recordMap$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void refreshView() {
        Logger.d("CurseTempViewHolder", "refreshView");
        this.bind.F.setVisibility(0);
        List<MaxMinEntry> list = this.mChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        LocalDate localDate = this.refreshDate;
        Intrinsics.checkNotNull(localDate);
        List<MaxMinEntry> listCreateTempTrendData = temperatureDataUtil.createTempTrendData(localDate, this.recordMap);
        List<MaxMinEntry> list2 = this.mChartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateTempTrendData);
        float fMax = Math.max(Math.abs(temperatureDataUtil.getTempTrendMaxValue(this.mChartEntries)), Math.abs(temperatureDataUtil.getTempTrendMinValue(this.mChartEntries)));
        float f = 0.1f + fMax;
        if (fMax < 0.3d) {
            f = 0.3f;
        }
        float f2 = -f;
        Logger.i(TemperatureBaseWeekMonthFragment.TAG, "yMax:" + f + ", yMin:" + f2);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarK = rtrVar.k(this.mYAxis, f, f2);
        this.mYAxis = rtrVarK;
        Intrinsics.checkNotNull(rtrVarK);
        rtrVarK.d(4, 10);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vfeVar.E = f;
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        vfeVar2.F = f2;
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        CurseTempLineChartAdapter<MaxMinEntry> curseTempLineChartAdapter = this.mLineChartAdapter;
        Intrinsics.checkNotNull(curseTempLineChartAdapter);
        curseTempLineChartAdapter.setYAxis(this.mYAxis);
        TempTrendHighLightMarkValueFormatter tempTrendHighLightMarkValueFormatter = new TempTrendHighLightMarkValueFormatter(this.activity);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setHighLightValueFormatter(tempTrendHighLightMarkValueFormatter);
        CurseTempLineChartAdapter<MaxMinEntry> curseTempLineChartAdapter2 = this.mLineChartAdapter;
        if (curseTempLineChartAdapter2 != null) {
            curseTempLineChartAdapter2.setValueFormatter(tempTrendHighLightMarkValueFormatter);
        }
        CurseTempLineChartAdapter<MaxMinEntry> curseTempLineChartAdapter3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(curseTempLineChartAdapter3);
        curseTempLineChartAdapter3.notifyDataSetChanged();
        Long l = this.leftTime;
        if (l != null) {
            long jLongValue = l.longValue();
            int daysOfMonth = TimeDateUtil.INSTANCE.getDaysOfMonth(((long) 1000) * jLongValue);
            int dayOfMonth = TimeDateUtil.timestampToLocalDate(jLongValue).getDayOfMonth();
            Logger.d("CurseTempViewHolder", "leftTime:" + jLongValue + ",leftDate:" + daysOfMonth + ",index:" + dayOfMonth);
            LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
            if (lineChartRecyclerView != null) {
                lineChartRecyclerView.smoothScrollToPosition(Math.min((daysOfMonth - dayOfMonth) + 6, daysOfMonth));
            }
        }
    }

    @Nullable
    public final LineChartRecyclerView getLineChartRecyclerView() {
        return this.lineChartRecyclerView;
    }

    public final void onResume() {
        if (ExtUtilsKt.isVisible(this) && !CurseManager.INSTANCE.getInstance().isAlgoPredictEnable()) {
            ConstraintLayout curseTempChartLayout = this.bind.D;
            Intrinsics.checkNotNullExpressionValue(curseTempChartLayout, "curseTempChartLayout");
            ViewExtKt.setVisible(curseTempChartLayout, false);
            TemperatureTrendEmptyView emptyView = this.bind.N;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ViewExtKt.setVisible(emptyView, true);
        }
        if (ViewExtKt.isGone(this) && CurseManager.INSTANCE.getInstance().isAlgoPredictEnable() && (!this.recordMap.isEmpty())) {
            ConstraintLayout curseTempChartLayout2 = this.bind.D;
            Intrinsics.checkNotNullExpressionValue(curseTempChartLayout2, "curseTempChartLayout");
            ViewExtKt.setVisible(curseTempChartLayout2, true);
            TemperatureTrendEmptyView emptyView2 = this.bind.N;
            Intrinsics.checkNotNullExpressionValue(emptyView2, "emptyView");
            ViewExtKt.setVisible(emptyView2, false);
        }
    }

    public final void refreshData(@Nullable LocalDate date) {
        if (date != null) {
            this.refreshDate = date;
        }
        if (this.refreshDate == null) {
            this.refreshDate = LocalDate.now();
        }
        CurseManager.Companion companion = CurseManager.INSTANCE;
        Logger.d("CurseTempViewHolder", "refreshData,intelligentCapability:" + companion.getInstance().supportMenstrualPredict() + ",data:" + this.refreshDate);
        if (companion.getInstance().supportMenstrualPredict()) {
            LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(this.refreshDate);
            LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
            CurseMainVM mainVM = getMainVM();
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(firstDayOfMonth);
            Intrinsics.checkNotNull(localDatePlusMonths);
            mainVM.queryCurseTemperatureTrend(jChangZeroOfTheDay, TimeDateUtil.changZeroOfTheDay(localDatePlusMonths));
        }
    }

    public final void setLineChartRecyclerView(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.lineChartRecyclerView = lineChartRecyclerView;
    }

    public /* synthetic */ CurseTempViewHolder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseTempViewHolder(@NotNull Context context, @NotNull AttributeSet attr, int i) {
        super(context, attr, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        CurseMainActivity curseMainActivity = (CurseMainActivity) context;
        this.activity = curseMainActivity;
        ViewDataBinding viewDataBindingJ = sk5.j(LayoutInflater.from(context), jui.n3, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingJ, "inflate(...)");
        qtb qtbVar = (qtb) viewDataBindingJ;
        this.bind = qtbVar;
        this.mainVM = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rc5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseTempViewHolder.mainVM_delegate$lambda$0(this.f32400a);
            }
        });
        final Function2 function2 = new Function2() { // from class: sc5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(CurseTempViewHolder.recordMap$lambda$1(((Long) obj).longValue(), ((Long) obj2).longValue()));
            }
        };
        this.recordMap = new TreeMap<>(new Comparator() { // from class: tc5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CurseTempViewHolder.recordMap$lambda$2(function2, obj, obj2);
            }
        });
        this.lineChartRecyclerView = qtbVar.L;
        initTrendChartRecyclerView();
        qtbVar.C.setOnClickListener(new View.OnClickListener() { // from class: uc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewUtilKt.startWebView$default("https://watch.iot.mi.com/html/general/index.html?#/women_health", null, false, false, null, false, null, false, 254, null);
            }
        });
        getMainVM().getTemperatureTrendData().observe(curseMainActivity, new CurseTempViewHolderKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vc5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseTempViewHolder._init_$lambda$8(this.f36735a, (List) obj);
            }
        }));
        refreshData(LocalDate.now());
    }
}
