package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.barchart.SleepChartDayAdapter;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.c0j;
import defpackage.c0n;
import defpackage.eri;
import defpackage.gfe;
import defpackage.gjm;
import defpackage.hak;
import defpackage.iji;
import defpackage.ni4;
import defpackage.onq;
import defpackage.pni;
import defpackage.r02;
import defpackage.rim;
import defpackage.vqr;
import defpackage.w1n;
import defpackage.wmm;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010M\u001a\u00020%\u0012\u0006\u0010N\u001a\u00020\u0018¢\u0006\u0004\bO\u0010PJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u001b\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010)R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00101R\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDistributeWmHolder;", "", "", "initLevelDescRecyclerview", "()V", "initTopView", "initChartRecyclerView", "initRecyclerGestureListener", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "refreshLevelItems", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Lorg/joda/time/LocalDate;", "currentLocalDate", "", "dayReportList", "", "Lcom/xiaomi/fitness/chart/entrys/SleepEntry;", "createEntries", "(Lorg/joda/time/LocalDate;Ljava/util/List;)Ljava/util/List;", "report", "localDate", "", "timeZero", "", "index", "type", "createSleepEntry", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lorg/joda/time/LocalDate;JII)Lcom/xiaomi/fitness/chart/entrys/SleepEntry;", "endDate", "getSleepRecyclerBarEntry", "(Lorg/joda/time/LocalDate;)I", "updateReport", "(Lorg/joda/time/LocalDate;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "weekMonthPosition", "I", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "surveyRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lcom/xiaomi/fitness/chart/barchart/SleepChartDayAdapter;", "barChartAdapter", "Lcom/xiaomi/fitness/chart/barchart/SleepChartDayAdapter;", "chartEntries", "Ljava/util/List;", "Lrim;", "itemDecoration", "Lrim;", "Lw1n;", "yAxis", "Lw1n;", "Lvqr;", "xAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "Lr02;", "barChartAttrs", "Lr02;", "Landroidx/recyclerview/widget/RecyclerView;", "mLevelDescRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "levelItems", "Lgfe;", "levelDescAdapter", "Lgfe;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "mRootView", "position", "<init>", "(Landroid/view/View;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepDistributeWmHolder {
    private SleepChartDayAdapter barChartAdapter;

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private List<SleepEntry> chartEntries;

    @NotNull
    private final Context context;

    @Nullable
    private DataTitleView dataTitleView;
    private int displayNumber;

    @Nullable
    private rim itemDecoration;

    @Nullable
    private gfe levelDescAdapter;

    @NotNull
    private final List<LevelBarView.LevelItem> levelItems;

    @Nullable
    private RecyclerView mLevelDescRecyclerView;

    @NotNull
    private final View rootView;
    private BarChartRecyclerView surveyRecyclerView;

    @Nullable
    private onq valueFormatter;
    private final int weekMonthPosition;

    @Nullable
    private vqr xAxis;

    @Nullable
    private w1n yAxis;

    public SleepDistributeWmHolder(@NotNull View mRootView, int i) {
        Intrinsics.checkNotNullParameter(mRootView, "mRootView");
        Context context = mRootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        this.rootView = mRootView;
        this.weekMonthPosition = i;
        this.levelItems = new ArrayList();
        initTopView();
        initLevelDescRecyclerview();
        initChartRecyclerView();
    }

    private final List<SleepEntry> createEntries(LocalDate currentLocalDate, List<AllDaySleepReport> dayReportList) {
        LocalDate weekOrMonthEndDate = BarChartRecyclerHelper.INSTANCE.getWeekOrMonthEndDate(this.weekMonthPosition, currentLocalDate);
        HashMap map = new HashMap();
        for (AllDaySleepReport allDaySleepReport : dayReportList) {
            map.put(Long.valueOf(allDaySleepReport.getTime()), allDaySleepReport);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (!weekOrMonthEndDate.isBefore(currentLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(weekOrMonthEndDate);
            arrayList.add(createSleepEntry((AllDaySleepReport) map.get(Long.valueOf(jChangZeroOfTheDay)), TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay), jChangZeroOfTheDay, i, getSleepRecyclerBarEntry(weekOrMonthEndDate)));
            weekOrMonthEndDate = weekOrMonthEndDate.minusDays(1);
            i++;
        }
        return arrayList;
    }

    private final SleepEntry createSleepEntry(AllDaySleepReport report, LocalDate localDate, long timeZero, int index, int type) {
        c0n c0nVarD = gjm.d(report);
        Intrinsics.checkNotNullExpressionValue(c0nVarD, "createSleepTime(...)");
        SleepEntry sleepEntry = new SleepEntry(index, gjm.f(c0nVarD), timeZero, type);
        sleepEntry.localDate = localDate;
        sleepEntry.f11762a = c0nVarD;
        return sleepEntry;
    }

    private final int getSleepRecyclerBarEntry(LocalDate endDate) {
        if (this.weekMonthPosition == 1) {
            return 2;
        }
        RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        return companion.getMonthBarEntryType2(r02Var, endDate);
    }

    private final void initChartRecyclerView() {
        BarChartRecyclerView barChartRecyclerView;
        this.dataTitleView = (DataTitleView) this.rootView.findViewById(eri.U3);
        this.chartEntries = new ArrayList();
        BarChartRecyclerView barChartRecyclerView2 = (BarChartRecyclerView) this.rootView.findViewById(eri.V3);
        this.surveyRecyclerView = barChartRecyclerView2;
        SleepChartDayAdapter sleepChartDayAdapter = null;
        if (barChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
            barChartRecyclerView2 = null;
        }
        T t = barChartRecyclerView2.mAttrs;
        BarChartRecyclerView barChartRecyclerView3 = this.surveyRecyclerView;
        if (barChartRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
            barChartRecyclerView3 = null;
        }
        r02 r02Var = (r02) barChartRecyclerView3.mAttrs;
        this.barChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        this.valueFormatter = BarChartRecyclerHelper.INSTANCE.createXAxisFormatter(this.context, this.weekMonthPosition);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.context, this.barChartAttrs);
        BarChartRecyclerView barChartRecyclerView4 = this.surveyRecyclerView;
        if (barChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
            barChartRecyclerView4 = null;
        }
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        this.yAxis = new w1n(this.barChartAttrs);
        vqr vqrVar = new vqr(this.barChartAttrs, this.displayNumber, this.valueFormatter);
        this.xAxis = vqrVar;
        this.itemDecoration = new rim(this.yAxis, vqrVar, this.barChartAttrs);
        wmm wmmVar = new wmm(this.context);
        rim rimVar = this.itemDecoration;
        Intrinsics.checkNotNull(rimVar);
        rimVar.setHighLightValueFormatter(wmmVar);
        BarChartRecyclerView barChartRecyclerView5 = this.surveyRecyclerView;
        if (barChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
            barChartRecyclerView5 = null;
        }
        rim rimVar2 = this.itemDecoration;
        Intrinsics.checkNotNull(rimVar2);
        barChartRecyclerView5.addItemDecoration(rimVar2);
        Context context = this.context;
        List<SleepEntry> arrayList = this.chartEntries;
        if (!TypeIntrinsics.isMutableList(arrayList)) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        List<SleepEntry> list = arrayList;
        BarChartRecyclerView barChartRecyclerView6 = this.surveyRecyclerView;
        if (barChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
            barChartRecyclerView = null;
        } else {
            barChartRecyclerView = barChartRecyclerView6;
        }
        this.barChartAdapter = new SleepChartDayAdapter(context, list, barChartRecyclerView, this.xAxis, this.barChartAttrs, wmmVar);
        BarChartRecyclerView barChartRecyclerView7 = this.surveyRecyclerView;
        if (barChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
            barChartRecyclerView7 = null;
        }
        SleepChartDayAdapter sleepChartDayAdapter2 = this.barChartAdapter;
        if (sleepChartDayAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAdapter");
        } else {
            sleepChartDayAdapter = sleepChartDayAdapter2;
        }
        barChartRecyclerView7.setAdapter(sleepChartDayAdapter);
        initRecyclerGestureListener();
    }

    private final void initLevelDescRecyclerview() {
        this.mLevelDescRecyclerView = (RecyclerView) this.rootView.findViewById(eri.ra);
        refreshLevelItems(null);
        this.levelDescAdapter = new gfe(this.context, this.levelItems, 3);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.context, 3);
        RecyclerView recyclerView = this.mLevelDescRecyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.mLevelDescRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
        }
        RecyclerView recyclerView3 = this.mLevelDescRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        RecyclerView recyclerView4 = this.mLevelDescRecyclerView;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.levelDescAdapter);
        }
        gfe gfeVar = this.levelDescAdapter;
        Intrinsics.checkNotNull(gfeVar);
        gfeVar.notifyDataSetChanged();
    }

    private final void initRecyclerGestureListener() {
        Context context = this.context;
        BarChartRecyclerView barChartRecyclerView = this.surveyRecyclerView;
        BarChartRecyclerView barChartRecyclerView2 = null;
        if (barChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
            barChartRecyclerView = null;
        }
        hak hakVar = new hak(context, barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepDistributeWmHolder$initRecyclerGestureListener$recyclerItemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.dataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.dataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView3 = this.surveyRecyclerView;
        if (barChartRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surveyRecyclerView");
        } else {
            barChartRecyclerView2 = barChartRecyclerView3;
        }
        barChartRecyclerView2.addOnItemTouchListener(hakVar);
    }

    private final void initTopView() {
        View viewFindViewById = this.rootView.findViewById(eri.Bl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = this.rootView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((AppCompatImageView) viewFindViewById2).setBackgroundDrawable(ni4.e(this.context, pni.b2));
        textView.setText(this.weekMonthPosition == 1 ? c0j.K6 : c0j.J6);
    }

    private final void refreshLevelItems(AllDaySleepReport allDaySleepReport) {
        this.levelItems.clear();
        this.levelItems.add(new LevelBarView.LevelItem(iji.e3, c0j.cf));
        this.levelItems.add(new LevelBarView.LevelItem(iji.i3, c0j.lk));
        this.levelItems.add(new LevelBarView.LevelItem(iji.g3, c0j.Nf));
        this.levelItems.add(new LevelBarView.LevelItem(iji.h3, c0j.Wc));
        gfe gfeVar = this.levelDescAdapter;
        if (gfeVar != null) {
            gfeVar.notifyDataSetChanged();
        }
    }

    public final void updateReport(@NotNull LocalDate currentLocalDate, @Nullable AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(currentLocalDate, "currentLocalDate");
        if (allDaySleepReport == null || ArrayUtils.isEmpty(allDaySleepReport.getDayReportList())) {
            ViewExtKt.setVisible(this.rootView, false);
            return;
        }
        ViewExtKt.setVisible(this.rootView, true);
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Intrinsics.checkNotNull(dayReportList);
        List<SleepEntry> listCreateEntries = createEntries(currentLocalDate, dayReportList);
        List<SleepEntry> list = this.chartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<SleepEntry> list2 = this.chartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateEntries);
        float theMaxNumber = RecyclerBarEntry.INSTANCE.getTheMaxNumber(this.chartEntries);
        w1n w1nVar = this.yAxis;
        SleepChartDayAdapter sleepChartDayAdapter = null;
        w1n w1nVarO = w1nVar != null ? w1nVar.o(w1nVar, theMaxNumber) : null;
        this.yAxis = w1nVarO;
        rim rimVar = this.itemDecoration;
        if (rimVar != null) {
            rimVar.setYAxis(w1nVarO);
        }
        SleepChartDayAdapter sleepChartDayAdapter2 = this.barChartAdapter;
        if (sleepChartDayAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAdapter");
        } else {
            sleepChartDayAdapter = sleepChartDayAdapter2;
        }
        sleepChartDayAdapter.notifyDataSetChanged();
        String hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(this.context, allDaySleepReport.getAvgDuration());
        DataTitleView dataTitleView = this.dataTitleView;
        if (dataTitleView != null) {
            Context context = this.context;
            dataTitleView.b(context, hMFormatInMinutes, hMFormatInMinutes, "", Typeface.create(context.getString(c0j.fq), 1));
        }
    }
}
