package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.barchart.SleepChartDayAdapter;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.decoration.SleepDurationYAxisFormatter;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepWmDurationHolder;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.c0j;
import defpackage.c0n;
import defpackage.eri;
import defpackage.gfe;
import defpackage.gjm;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.lce;
import defpackage.ni4;
import defpackage.npm;
import defpackage.onq;
import defpackage.pni;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rim;
import defpackage.rtr;
import defpackage.vqr;
import defpackage.wmm;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 r2\u00020\u0001:\u0001rB\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00102\u001a\u00020!¢\u0006\u0004\bp\u0010qJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00022\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00022\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010$\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0002¢\u0006\u0004\b)\u0010\u0004J)\u0010+\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00102\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00103R\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010CR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010;R\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u00103R\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmDurationHolder;", "", "", "addSummaryChartRecyclerview", "()V", "initLevelDescRecyclerview", "updateLevelBarRecyclerViewMargin", "initTopView", "initChartRecyclerView", "initRecyclerGestureListener", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "refreshDataSource", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "", "Lkotlin/Pair;", "", "sourceList", "showDataSourceDialogIfNeed", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/chart/entrys/SleepEntry;", "listEntry", "refreshLevelItems", "Lorg/joda/time/LocalDate;", "currentLocalDate", "dayReportList", "", "createEntries", "(Lorg/joda/time/LocalDate;Ljava/util/List;)Ljava/util/List;", "report", "localDate", "", "timeZero", "", "index", "type", "createSleepEntry", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lorg/joda/time/LocalDate;JII)Lcom/xiaomi/fitness/chart/entrys/SleepEntry;", "endDate", "getSleepRecyclerBarEntry", "(Lorg/joda/time/LocalDate;)I", "onParentResume", "preDaySleepReport", "updateReport", "(Lorg/joda/time/LocalDate;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Llce;", "binding", "Llce;", "getBinding", "()Llce;", "position", "I", "getPosition", "()I", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "surveyRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lcom/xiaomi/fitness/chart/barchart/SleepChartDayAdapter;", "barChartAdapter", "Lcom/xiaomi/fitness/chart/barchart/SleepChartDayAdapter;", "chartEntries", "Ljava/util/List;", "Lrim;", "itemDecoration", "Lrim;", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "Lr02;", "barChartAttrs", "Lr02;", "Landroidx/recyclerview/widget/RecyclerView;", "mLevelDescRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "levelItems", "Lgfe;", "levelDescAdapter", "Lgfe;", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "durationView", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "Landroid/widget/TextView;", "tvHighLightTip", "Landroid/widget/TextView;", "llChartInteractive", "Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepository$delegate", "Lkotlin/Lazy;", "getSleepSettingRepository", "()Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepository", "sleepTarget", "Lwmm;", "highLightValueFormatter", "Lwmm;", "", "isWeek", "()Z", "<init>", "(Llce;I)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepWmDurationHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepWmDurationHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepWmDurationHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,475:1\n1863#2:476\n1863#2,2:477\n1864#2:479\n1#3:480\n*S KotlinDebug\n*F\n+ 1 SleepWmDurationHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepWmDurationHolder\n*L\n312#1:476\n314#1:477,2\n312#1:479\n*E\n"})
public final class SleepWmDurationHolder {

    @NotNull
    public static final String TAG = "SleepWmDuration";

    @Nullable
    private SleepChartDayAdapter barChartAdapter;

    @Nullable
    private r02 barChartAttrs;

    @NotNull
    private final lce binding;

    @Nullable
    private List<SleepEntry> chartEntries;

    @NotNull
    private final Context context;
    private int displayNumber;

    @NotNull
    private final DurationTextView durationView;
    private wmm highLightValueFormatter;

    @Nullable
    private rim itemDecoration;

    @Nullable
    private gfe levelDescAdapter;

    @NotNull
    private final List<LevelBarView.LevelItem> levelItems;

    @NotNull
    private final View llChartInteractive;

    @Nullable
    private RecyclerView mLevelDescRecyclerView;
    private final int position;

    @NotNull
    private final View rootView;

    /* JADX INFO: renamed from: sleepSettingRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepSettingRepository;
    private int sleepTarget;

    @Nullable
    private BarChartRecyclerView surveyRecyclerView;

    @NotNull
    private final TextView tvHighLightTip;

    @Nullable
    private onq valueFormatter;

    @Nullable
    private vqr xAxis;

    @Nullable
    private rtr yAxis;

    public SleepWmDurationHolder(@NotNull lce binding, int i) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.position = i;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.rootView = root;
        this.levelItems = new ArrayList();
        DurationTextView durationView = binding.A;
        Intrinsics.checkNotNullExpressionValue(durationView, "durationView");
        this.durationView = durationView;
        TextView tvHighLightTip = binding.G;
        Intrinsics.checkNotNullExpressionValue(tvHighLightTip, "tvHighLightTip");
        this.tvHighLightTip = tvHighLightTip;
        LinearLayout llChartInteractive = binding.D;
        Intrinsics.checkNotNullExpressionValue(llChartInteractive, "llChartInteractive");
        this.llChartInteractive = llChartInteractive;
        this.sleepSettingRepository = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t1n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepWmDurationHolder.sleepSettingRepository_delegate$lambda$0();
            }
        });
        this.sleepTarget = HealthPrefer.INSTANCE.getSLEEP_GOAL_TIME_LOCAL();
        addSummaryChartRecyclerview();
        initTopView();
        initLevelDescRecyclerview();
        initChartRecyclerView();
    }

    private final void addSummaryChartRecyclerview() {
        LinearLayout llDistributeRecyclerParent = this.binding.E;
        Intrinsics.checkNotNullExpressionValue(llDistributeRecyclerParent, "llDistributeRecyclerParent");
        llDistributeRecyclerParent.removeAllViews();
        this.surveyRecyclerView = (BarChartRecyclerView) LayoutInflater.from(this.context).inflate(isWeek() ? jui.C5 : jui.p5, (ViewGroup) llDistributeRecyclerParent, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ExtUtilsKt.getDp(313));
        BarChartRecyclerView barChartRecyclerView = this.surveyRecyclerView;
        if (barChartRecyclerView != null) {
            barChartRecyclerView.setLayoutParams(layoutParams);
        }
        llDistributeRecyclerParent.addView(this.surveyRecyclerView);
    }

    private final List<SleepEntry> createEntries(LocalDate currentLocalDate, List<AllDaySleepReport> dayReportList) {
        LocalDate weekOrMonthEndDate = BarChartRecyclerHelper.INSTANCE.getWeekOrMonthEndDate(this.position, currentLocalDate);
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
        if (isWeek()) {
            return 2;
        }
        RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        return companion.getMonthBarEntryType2(r02Var, endDate);
    }

    private final SleepSettingRepository getSleepSettingRepository() {
        return (SleepSettingRepository) this.sleepSettingRepository.getValue();
    }

    private final void initChartRecyclerView() {
        wmm wmmVar;
        if (this.surveyRecyclerView == null) {
            return;
        }
        this.sleepTarget = getSleepSettingRepository().getSleepGoal();
        this.chartEntries = new ArrayList();
        BarChartRecyclerView barChartRecyclerView = this.surveyRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.barChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        this.valueFormatter = BarChartRecyclerHelper.INSTANCE.createXAxisFormatter(this.context, this.position);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.context, this.barChartAttrs);
        BarChartRecyclerView barChartRecyclerView2 = this.surveyRecyclerView;
        if (barChartRecyclerView2 != null) {
            barChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        }
        rtr rtrVar = new rtr(this.barChartAttrs);
        this.yAxis = rtrVar;
        rtrVar.setValueFormatter(new SleepDurationYAxisFormatter());
        vqr vqrVar = new vqr(this.barChartAttrs, this.displayNumber, this.valueFormatter);
        this.xAxis = vqrVar;
        this.itemDecoration = new rim(this.yAxis, vqrVar, this.barChartAttrs);
        this.highLightValueFormatter = new wmm(this.context);
        rim rimVar = this.itemDecoration;
        Intrinsics.checkNotNull(rimVar);
        wmm wmmVar2 = this.highLightValueFormatter;
        if (wmmVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("highLightValueFormatter");
            wmmVar2 = null;
        }
        rimVar.setHighLightValueFormatter(wmmVar2);
        BarChartRecyclerView barChartRecyclerView3 = this.surveyRecyclerView;
        if (barChartRecyclerView3 != null) {
            rim rimVar2 = this.itemDecoration;
            Intrinsics.checkNotNull(rimVar2);
            barChartRecyclerView3.addItemDecoration(rimVar2);
        }
        Context context = this.context;
        List<SleepEntry> arrayList = this.chartEntries;
        if (!TypeIntrinsics.isMutableList(arrayList)) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        List<SleepEntry> list = arrayList;
        BarChartRecyclerView barChartRecyclerView4 = this.surveyRecyclerView;
        vqr vqrVar2 = this.xAxis;
        r02 r02Var2 = this.barChartAttrs;
        wmm wmmVar3 = this.highLightValueFormatter;
        if (wmmVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("highLightValueFormatter");
            wmmVar = null;
        } else {
            wmmVar = wmmVar3;
        }
        SleepChartDayAdapter sleepChartDayAdapter = new SleepChartDayAdapter(context, list, barChartRecyclerView4, vqrVar2, r02Var2, wmmVar);
        this.barChartAdapter = sleepChartDayAdapter;
        BarChartRecyclerView barChartRecyclerView5 = this.surveyRecyclerView;
        if (barChartRecyclerView5 != null) {
            barChartRecyclerView5.setAdapter(sleepChartDayAdapter);
        }
        initRecyclerGestureListener();
    }

    private final void initLevelDescRecyclerview() {
        this.mLevelDescRecyclerView = (RecyclerView) this.rootView.findViewById(eri.ra);
        updateLevelBarRecyclerViewMargin();
        int i = UIUtils.INSTANCE.isTabletAndLandscape(this.context) ? 5 : 3;
        refreshLevelItems(null);
        this.levelDescAdapter = new gfe(this.context, this.levelItems, i);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.context, i);
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
        hak hakVar = new hak(this.context, this.surveyRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepWmDurationHolder$initRecyclerGestureListener$recyclerItemGestureListener$1
            /* JADX WARN: Code duplicated, block: B:16:0x002d  */
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                boolean z;
                r02 r02Var;
                if (barEntry != null) {
                    SleepWmDurationHolder sleepWmDurationHolder = this.this$0;
                    if (barEntry.isSelected() && (r02Var = sleepWmDurationHolder.barChartAttrs) != null) {
                        if (r02Var.C) {
                            wmm wmmVar = sleepWmDurationHolder.highLightValueFormatter;
                            if (wmmVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("highLightValueFormatter");
                                wmmVar = null;
                            }
                            z = TextUtils.isEmpty(wmmVar.getBarLabel(barEntry)) ? false : true;
                        }
                    }
                }
                this.this$0.llChartInteractive.setVisibility(z ? 4 : 0);
                SleepTrackHelper.INSTANCE.trackSleepDurationCardClick(this.this$0.isWeek());
            }
        });
        BarChartRecyclerView barChartRecyclerView = this.surveyRecyclerView;
        if (barChartRecyclerView != null) {
            barChartRecyclerView.addOnItemTouchListener(hakVar);
        }
    }

    private final void initTopView() {
        View viewFindViewById = this.rootView.findViewById(eri.Bl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = this.rootView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((AppCompatImageView) viewFindViewById2).setBackground(ni4.e(this.context, pni.l3));
        ((TextView) viewFindViewById).setText(c0j.Df);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isWeek() {
        return this.position == 1;
    }

    private final void refreshDataSource(AllDaySleepReport allDaySleepReport) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        if (dayReportList != null) {
            Iterator<T> it = dayReportList.iterator();
            while (it.hasNext()) {
                List<SleepSegmentReport> sleepSegments = ((AllDaySleepReport) it.next()).getSleepSegments();
                if (sleepSegments != null) {
                    for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
                        Pair<String, String> sidNameAndType = SleepExtKt.getSidNameAndType(sleepSegmentReport.getSid());
                        if (sidNameAndType != null) {
                            String sid = sleepSegmentReport.getSid();
                            Intrinsics.checkNotNull(sid);
                            linkedHashMap.put(sid, sidNameAndType);
                        }
                    }
                }
            }
        }
        Logger.i(TAG, "sidDataSourceMap " + linkedHashMap);
        final List list = CollectionsKt___CollectionsKt.toList(linkedHashMap.values());
        this.binding.B.setOnClickListener(new View.OnClickListener() { // from class: s1n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepWmDurationHolder.refreshDataSource$lambda$5(this.f33176a, list, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshDataSource$lambda$5(SleepWmDurationHolder this$0, List sourceList, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sourceList, "$sourceList");
        this$0.showDataSourceDialogIfNeed(sourceList);
        SleepTrackHelper.INSTANCE.trackSleepDurationCardQuestionClick(this$0.isWeek());
    }

    private final void refreshLevelItems(List<? extends SleepEntry> listEntry) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        this.levelItems.clear();
        ArrayList arrayList = new ArrayList();
        List<? extends SleepEntry> list = listEntry;
        if (list != null && !list.isEmpty()) {
            List<? extends SleepEntry> list2 = listEntry;
            Iterator<T> it = list2.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                List<npm> sleepItemList = ((SleepEntry) next).f11762a.f4804a;
                Intrinsics.checkNotNullExpressionValue(sleepItemList, "sleepItemList");
                Iterator<T> it2 = sleepItemList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next7 = null;
                        break;
                    }
                    next7 = it2.next();
                } while (((npm) next7).c != 3);
            } while (next7 == null);
            if (next != null) {
                arrayList.add(new LevelBarView.LevelItem(iji.e3, c0j.cf));
            }
            Iterator<T> it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                List<npm> sleepItemList2 = ((SleepEntry) next2).f11762a.f4804a;
                Intrinsics.checkNotNullExpressionValue(sleepItemList2, "sleepItemList");
                Iterator<T> it4 = sleepItemList2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it4.next();
                } while (((npm) next6).c != 2);
            } while (next6 == null);
            if (next2 != null) {
                arrayList.add(new LevelBarView.LevelItem(iji.i3, c0j.lk));
            }
            Iterator<T> it5 = list2.iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
                List<npm> sleepItemList3 = ((SleepEntry) next3).f11762a.f4804a;
                Intrinsics.checkNotNullExpressionValue(sleepItemList3, "sleepItemList");
                Iterator<T> it6 = sleepItemList3.iterator();
                do {
                    if (!it6.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it6.next();
                } while (((npm) next5).c != 1);
            } while (next5 == null);
            if (next3 != null) {
                arrayList.add(new LevelBarView.LevelItem(iji.g3, c0j.Nf));
            }
            for (Object obj2 : list2) {
                List<npm> sleepItemList4 = ((SleepEntry) obj2).f11762a.f4804a;
                Intrinsics.checkNotNullExpressionValue(sleepItemList4, "sleepItemList");
                Iterator<T> it7 = sleepItemList4.iterator();
                do {
                    if (!it7.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it7.next();
                } while (((npm) next4).c != 4);
                if (next4 != null) {
                    obj = obj2;
                    break;
                }
            }
            if (obj != null) {
                arrayList.add(new LevelBarView.LevelItem(iji.h3, c0j.Wc));
            }
        }
        LevelBarView.LevelItem levelItem = new LevelBarView.LevelItem(iji.f3, c0j.Cf);
        levelItem.e = pni.s0;
        arrayList.add(levelItem);
        this.levelItems.addAll(CollectionsKt___CollectionsKt.toList(arrayList));
        gfe gfeVar = this.levelDescAdapter;
        if (gfeVar != null) {
            gfeVar.notifyDataSetChanged();
        }
    }

    private final void showDataSourceDialogIfNeed(List<Pair<String, String>> sourceList) {
        Context context = this.context;
        if (context instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CommonDialog commonDialogCreate = (CommonDialog) supportFragmentManager.l0("sleep_data_source");
            if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                if (commonDialogCreate == null) {
                    commonDialogCreate = new CommonDialog.c("sleep_data_source").setDialogTitle(c0j.i5).setAdapter(new MyDataSourceAdapter(this.context, jui.n5, sourceList)).setItemsCheckedIndex(0).setPositiveText(c0j.I7).create();
                    Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                }
                commonDialogCreate.showIfNeed(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSettingRepository sleepSettingRepository_delegate$lambda$0() {
        return new SleepSettingRepository();
    }

    private final void updateLevelBarRecyclerViewMargin() {
        RecyclerView recyclerView = this.mLevelDescRecyclerView;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(UIUtils.INSTANCE.isTabletAndLandscape(this.context) ? ExtUtilsKt.getDp(250) : 0);
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    @NotNull
    public final lce getBinding() {
        return this.binding;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void onParentResume() {
        int sleepGoal = getSleepSettingRepository().getSleepGoal();
        if (sleepGoal != this.sleepTarget) {
            this.sleepTarget = sleepGoal;
            r02 r02Var = this.barChartAttrs;
            if (r02Var != null) {
                r02Var.r0 = sleepGoal / 60.0f;
            }
            SleepChartDayAdapter sleepChartDayAdapter = this.barChartAdapter;
            if (sleepChartDayAdapter != null) {
                sleepChartDayAdapter.notifyDataSetChanged();
            }
        }
    }

    public final void updateReport(@NotNull LocalDate currentLocalDate, @Nullable AllDaySleepReport allDaySleepReport, @Nullable AllDaySleepReport preDaySleepReport) {
        String quantityString;
        int i;
        Intrinsics.checkNotNullParameter(currentLocalDate, "currentLocalDate");
        if (allDaySleepReport == null || ArrayUtils.isEmpty(allDaySleepReport.getDayReportList())) {
            ViewExtKt.setVisible(this.rootView, false);
            return;
        }
        ViewExtKt.setVisible(this.rootView, true);
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Intrinsics.checkNotNull(dayReportList);
        List<SleepEntry> listCreateEntries = createEntries(currentLocalDate, dayReportList);
        refreshLevelItems(CollectionsKt___CollectionsKt.toList(listCreateEntries));
        List<SleepEntry> list = this.chartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<SleepEntry> list2 = this.chartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateEntries);
        float f = this.sleepTarget / 60.0f;
        float fMax = Math.max(RecyclerBarEntry.INSTANCE.getTheMaxNumber(this.chartEntries), f);
        int i2 = fMax > ((float) 10) ? ((((int) fMax) / 5) * 5) + 5 : 10;
        rtr rtrVar = this.yAxis;
        if (rtrVar != null) {
            rtrVar.mAxisMaximum = i2;
        }
        if (rtrVar != null) {
            rtrVar.setLabelCount(5);
        }
        rtr rtrVar2 = this.yAxis;
        if (rtrVar2 != null) {
            rtrVar2.f = 5;
        }
        r02 r02Var = this.barChartAttrs;
        if (r02Var != null) {
            r02Var.r0 = f;
        }
        SleepChartDayAdapter sleepChartDayAdapter = this.barChartAdapter;
        if (sleepChartDayAdapter != null) {
            sleepChartDayAdapter.notifyDataSetChanged();
        }
        this.durationView.setDuration(TimeUnit.MINUTES.toMillis(allDaySleepReport.getAvgDuration()));
        if (preDaySleepReport == null || preDaySleepReport.getAvgDuration() <= 0) {
            ViewExtKt.setVisible(this.tvHighLightTip, false);
        } else {
            ViewExtKt.setVisible(this.tvHighLightTip, true);
            int avgDuration = allDaySleepReport.getAvgDuration() - preDaySleepReport.getAvgDuration();
            if (avgDuration == 0) {
                this.tvHighLightTip.setText(this.context.getString(isWeek() ? c0j.Md : c0j.Ld));
                this.tvHighLightTip.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else {
                boolean z = avgDuration > 0;
                int iAbs = Math.abs(avgDuration);
                if (iAbs > 60) {
                    int i3 = iAbs / 60;
                    int i4 = iAbs % 60;
                    String quantityString2 = ResourceExtKt.getQuantityString(this.context, qxi.K1, i3, Integer.valueOf(i3));
                    String quantityString3 = ResourceExtKt.getQuantityString(this.context, qxi.L1, i4, Integer.valueOf(i4));
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    quantityString = String.format(LocaleUtil.isCN() ? "%s%s" : "%s %s", Arrays.copyOf(new Object[]{quantityString2, quantityString3}, 2));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "format(...)");
                } else {
                    quantityString = iAbs == 60 ? ResourceExtKt.getQuantityString(this.context, qxi.K1, 1, 1) : ResourceExtKt.getQuantityString(this.context, qxi.q, iAbs, Integer.valueOf(iAbs));
                }
                TextView textView = this.tvHighLightTip;
                Context context = this.context;
                if (z) {
                    i = isWeek() ? c0j.Kd : c0j.Id;
                } else {
                    i = isWeek() ? c0j.Jd : c0j.Hd;
                }
                textView.setText(context.getString(i, quantityString));
                int i5 = z ? pni.z0 : pni.v0;
                UIUtils uIUtils = UIUtils.INSTANCE;
                int i6 = !uIUtils.isRtl() ? i5 : 0;
                if (!uIUtils.isRtl()) {
                    i5 = 0;
                }
                this.tvHighLightTip.setCompoundDrawablesWithIntrinsicBounds(i6, 0, i5, 0);
            }
        }
        refreshDataSource(allDaySleepReport);
    }
}
