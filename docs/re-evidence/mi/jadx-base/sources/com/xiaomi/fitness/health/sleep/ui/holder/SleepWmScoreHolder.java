package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.distribute.SleepDistributeConfig;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepWmScoreHolder;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import defpackage.c0j;
import defpackage.eri;
import defpackage.hak;
import defpackage.jui;
import defpackage.mwm;
import defpackage.ni4;
import defpackage.onq;
import defpackage.pni;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rce;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bX\u0010YJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010!R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010)R\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001d\u0010T\u001a\u0004\u0018\u00010P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010!R\u0014\u0010V\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmScoreHolder;", "", "", "addSummaryChartRecyclerview", "()V", "initTopView", "initChartRecyclerView", "checkAssistStatus", "initRecyclerGestureListener", "Lorg/joda/time/LocalDate;", "currentLocalDate", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "dayReportList", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createSleepScoreEntries", "(Lorg/joda/time/LocalDate;Ljava/util/List;)Ljava/util/List;", "allDaySleepReport", "preDaySleepReport", "updateReport", "(Lorg/joda/time/LocalDate;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "onParentResume", "Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;", "sleepDistributeConfig", "updateSleepDistributeConfig", "(Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;)V", "Lrce;", "binding", "Lrce;", "getBinding", "()Lrce;", "", "position", "I", "getPosition", "()I", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lq02;", "barChartAdapter", "Lq02;", "", "chartEntries", "Ljava/util/List;", "Ls02;", "itemDecoration", "Ls02;", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "Lr02;", "barChartAttrs", "Lr02;", "Landroid/widget/TextView;", "tvHighLightTip", "Landroid/widget/TextView;", "llChartInteractive", "Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepository$delegate", "Lkotlin/Lazy;", "getSleepSettingRepository", "()Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepository", "", "openAssistStatus", "Z", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "avgScore", "isWeek", "()Z", "<init>", "(Lrce;I)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepWmScoreHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepWmScoreHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepWmScoreHolder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,276:1\n216#2,2:277\n*S KotlinDebug\n*F\n+ 1 SleepWmScoreHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepWmScoreHolder\n*L\n266#1:277,2\n*E\n"})
public final class SleepWmScoreHolder {

    @NotNull
    public static final String TAG = "SleepWmScore";
    private int avgScore;

    @Nullable
    private q02<RecyclerBarEntry> barChartAdapter;

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;

    @NotNull
    private final rce binding;

    @Nullable
    private List<RecyclerBarEntry> chartEntries;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel;
    private int displayNumber;

    @Nullable
    private s02 itemDecoration;

    @NotNull
    private final View llChartInteractive;
    private boolean openAssistStatus;
    private final int position;

    @NotNull
    private final View rootView;

    /* JADX INFO: renamed from: sleepSettingRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepSettingRepository;

    @NotNull
    private final TextView tvHighLightTip;

    @Nullable
    private onq valueFormatter;

    @Nullable
    private vqr xAxis;

    @Nullable
    private rtr yAxis;

    public SleepWmScoreHolder(@NotNull rce binding, int i) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.position = i;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.rootView = root;
        TextView tvHighLightTip = binding.F;
        Intrinsics.checkNotNullExpressionValue(tvHighLightTip, "tvHighLightTip");
        this.tvHighLightTip = tvHighLightTip;
        LinearLayout llChartInteractive = binding.B;
        Intrinsics.checkNotNullExpressionValue(llChartInteractive, "llChartInteractive");
        this.llChartInteractive = llChartInteractive;
        this.sleepSettingRepository = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u1n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepWmScoreHolder.sleepSettingRepository_delegate$lambda$0();
            }
        });
        this.deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: v1n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepWmScoreHolder.deviceModel_delegate$lambda$1();
            }
        });
        addSummaryChartRecyclerview();
        initTopView();
        initChartRecyclerView();
    }

    private final void addSummaryChartRecyclerview() {
        LinearLayout llScoreRecyclerParent = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(llScoreRecyclerParent, "llScoreRecyclerParent");
        llScoreRecyclerParent.removeAllViews();
        this.barChartRecyclerView = (BarChartRecyclerView) LayoutInflater.from(this.context).inflate(isWeek() ? jui.B5 : jui.o5, (ViewGroup) llScoreRecyclerParent, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ExtUtilsKt.getDp(313));
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        if (barChartRecyclerView != null) {
            barChartRecyclerView.setLayoutParams(layoutParams);
        }
        llScoreRecyclerParent.addView(this.barChartRecyclerView);
    }

    private final void checkAssistStatus() {
        if (this.openAssistStatus) {
            ViewExtKt.setVisible(this.rootView, true);
        } else {
            ViewExtKt.setVisible(this.rootView, false);
        }
    }

    private final List<RecyclerBarEntry> createSleepScoreEntries(LocalDate currentLocalDate, List<AllDaySleepReport> dayReportList) {
        int monthBarEntryType2;
        LocalDate weekOrMonthEndDate = BarChartRecyclerHelper.INSTANCE.getWeekOrMonthEndDate(this.position, currentLocalDate);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AllDaySleepReport allDaySleepReport : dayReportList) {
            Logger.d(TAG, "createSleepScoreEntries time=" + allDaySleepReport.getTime() + "  remDuration=" + allDaySleepReport.getRemDuration());
            if (allDaySleepReport.getRemDuration() != null) {
                linkedHashMap.put(Long.valueOf(allDaySleepReport.getTime()), allDaySleepReport);
            }
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        while (!weekOrMonthEndDate.isBefore(currentLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(weekOrMonthEndDate);
            AllDaySleepReport allDaySleepReport2 = (AllDaySleepReport) linkedHashMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (isWeek()) {
                monthBarEntryType2 = 2;
            } else {
                RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
                r02 r02Var = this.barChartAttrs;
                Intrinsics.checkNotNull(r02Var);
                monthBarEntryType2 = companion.getMonthBarEntryType2(r02Var, weekOrMonthEndDate);
            }
            int i2 = monthBarEntryType2;
            int score = allDaySleepReport2 != null ? allDaySleepReport2.getScore() : 0;
            if ((allDaySleepReport2 != null ? allDaySleepReport2.getRemDuration() : null) != null) {
                z = true;
            }
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, score, jChangZeroOfTheDay, i2);
            recyclerBarEntry.localDate = TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay);
            arrayList.add(recyclerBarEntry);
            weekOrMonthEndDate = weekOrMonthEndDate.minusDays(1);
            i++;
        }
        Logger.d(TAG, "createSleepScoreEntries validRemExist=" + z);
        return z ? arrayList : CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$1() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    private final SleepSettingRepository getSleepSettingRepository() {
        return (SleepSettingRepository) this.sleepSettingRepository.getValue();
    }

    private final void initChartRecyclerView() {
        boolean sleepAssistSwitchOnlyAppCache;
        if (this.barChartRecyclerView == null) {
            return;
        }
        this.chartEntries = new ArrayList();
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.barChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        this.valueFormatter = BarChartRecyclerHelper.INSTANCE.createXAxisFormatter(this.context, this.position);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.context, this.barChartAttrs);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        if (barChartRecyclerView2 != null) {
            barChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        }
        rtr rtrVarF = rtr.f(this.barChartAttrs, 100.0f, 5);
        this.yAxis = rtrVarF;
        Intrinsics.checkNotNull(rtrVarF);
        rtrVarF.f = 5;
        vqr vqrVar = new vqr(this.barChartAttrs, this.displayNumber, this.valueFormatter);
        this.xAxis = vqrVar;
        this.itemDecoration = new s02(this.yAxis, vqrVar, this.barChartAttrs);
        mwm mwmVar = new mwm(this.context);
        s02 s02Var = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(mwmVar);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        if (barChartRecyclerView3 != null) {
            s02 s02Var2 = this.itemDecoration;
            Intrinsics.checkNotNull(s02Var2);
            barChartRecyclerView3.addItemDecoration(s02Var2);
        }
        q02<RecyclerBarEntry> q02Var = new q02<>(this.context, this.chartEntries, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, mwmVar);
        this.barChartAdapter = q02Var;
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        if (barChartRecyclerView4 != null) {
            barChartRecyclerView4.setAdapter(q02Var);
        }
        initRecyclerGestureListener();
        if (getDeviceModel() == null) {
            sleepAssistSwitchOnlyAppCache = false;
        } else {
            SleepSettingRepository sleepSettingRepository = getSleepSettingRepository();
            WearableDeviceModel deviceModel = getDeviceModel();
            Intrinsics.checkNotNull(deviceModel);
            sleepAssistSwitchOnlyAppCache = sleepSettingRepository.getSleepAssistSwitchOnlyAppCache(deviceModel);
        }
        this.openAssistStatus = sleepAssistSwitchOnlyAppCache;
    }

    private final void initRecyclerGestureListener() {
        hak hakVar = new hak(this.context, this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepWmScoreHolder$initRecyclerGestureListener$recyclerItemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    this.this$0.llChartInteractive.setVisibility(0);
                } else {
                    this.this$0.llChartInteractive.setVisibility(4);
                }
                SleepTrackHelper.INSTANCE.trackSleepScoreClick(this.this$0.isWeek());
            }
        });
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        if (barChartRecyclerView != null) {
            barChartRecyclerView.addOnItemTouchListener(hakVar);
        }
    }

    private final void initTopView() {
        View viewFindViewById = this.rootView.findViewById(eri.Bl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = this.rootView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((AppCompatImageView) viewFindViewById2).setBackground(ni4.e(this.context, pni.y0));
        ((TextView) viewFindViewById).setText(c0j.ai);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isWeek() {
        return this.position == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSettingRepository sleepSettingRepository_delegate$lambda$0() {
        return new SleepSettingRepository();
    }

    @NotNull
    public final rce getBinding() {
        return this.binding;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void onParentResume() {
        boolean sleepAssistSwitchOnlyAppCache;
        if (getDeviceModel() == null) {
            sleepAssistSwitchOnlyAppCache = false;
        } else {
            SleepSettingRepository sleepSettingRepository = getSleepSettingRepository();
            WearableDeviceModel deviceModel = getDeviceModel();
            Intrinsics.checkNotNull(deviceModel);
            sleepAssistSwitchOnlyAppCache = sleepSettingRepository.getSleepAssistSwitchOnlyAppCache(deviceModel);
        }
        if (sleepAssistSwitchOnlyAppCache != this.openAssistStatus) {
            this.openAssistStatus = sleepAssistSwitchOnlyAppCache;
            checkAssistStatus();
        }
    }

    public final void updateReport(@NotNull LocalDate currentLocalDate, @Nullable AllDaySleepReport allDaySleepReport, @Nullable AllDaySleepReport preDaySleepReport) {
        int i;
        Intrinsics.checkNotNullParameter(currentLocalDate, "currentLocalDate");
        if (allDaySleepReport == null || ArrayUtils.isEmpty(allDaySleepReport.getDayReportList())) {
            ViewExtKt.setVisible(this.rootView, false);
            return;
        }
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Intrinsics.checkNotNull(dayReportList);
        List<RecyclerBarEntry> listCreateSleepScoreEntries = createSleepScoreEntries(currentLocalDate, dayReportList);
        if (listCreateSleepScoreEntries.isEmpty()) {
            ViewExtKt.setVisible(this.rootView, false);
            return;
        }
        ViewExtKt.setVisible(this.rootView, true);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        int i2 = this.avgScore;
        r02Var.r0 = i2 > 0 ? i2 : -1.0f;
        List<RecyclerBarEntry> list = this.chartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<RecyclerBarEntry> list2 = this.chartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateSleepScoreEntries);
        q02<RecyclerBarEntry> q02Var = this.barChartAdapter;
        if (q02Var != null) {
            q02Var.notifyDataSetChanged();
        }
        int score = allDaySleepReport.getScore();
        this.binding.I.setText(String.valueOf(score));
        this.binding.H.setText(this.context.getResources().getQuantityText(qxi.R0, score));
        this.binding.G.setText(SleepExtKt.getSleepAccurateEvaluation(this.context, score));
        if (preDaySleepReport == null || preDaySleepReport.getScore() <= 0) {
            ViewExtKt.setVisible(this.tvHighLightTip, false);
        } else {
            ViewExtKt.setVisible(this.tvHighLightTip, true);
            int score2 = allDaySleepReport.getScore() - preDaySleepReport.getScore();
            if (score2 == 0) {
                this.tvHighLightTip.setText(this.context.getString(isWeek() ? c0j.Qd : c0j.Pd));
                this.tvHighLightTip.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else {
                boolean z = score2 > 0;
                int iAbs = Math.abs(score2);
                String quantityString = ResourceExtKt.getQuantityString(this.context, qxi.S0, iAbs, Integer.valueOf(iAbs));
                TextView textView = this.tvHighLightTip;
                Context context = this.context;
                if (z) {
                    i = isWeek() ? c0j.Kd : c0j.Id;
                } else {
                    i = isWeek() ? c0j.Jd : c0j.Hd;
                }
                textView.setText(context.getString(i, quantityString));
                int i3 = z ? pni.z0 : pni.v0;
                UIUtils uIUtils = UIUtils.INSTANCE;
                int i4 = !uIUtils.isRtl() ? i3 : 0;
                if (!uIUtils.isRtl()) {
                    i3 = 0;
                }
                this.tvHighLightTip.setCompoundDrawablesWithIntrinsicBounds(i4, 0, i3, 0);
            }
        }
        checkAssistStatus();
    }

    public final void updateSleepDistributeConfig(@Nullable SleepDistributeConfig sleepDistributeConfig) {
        Map<Integer, Integer> mapEmptyMap;
        if (sleepDistributeConfig == null || (mapEmptyMap = sleepDistributeConfig.getMap()) == null) {
            mapEmptyMap = MapsKt__MapsKt.emptyMap();
        }
        long j = 0;
        int iIntValue = 0;
        for (Map.Entry<Integer, Integer> entry : mapEmptyMap.entrySet()) {
            int iIntValue2 = entry.getKey().intValue();
            int iIntValue3 = entry.getValue().intValue();
            iIntValue += entry.getValue().intValue();
            j += (long) (iIntValue2 * iIntValue3);
        }
        int i = iIntValue != 0 ? (int) (j / ((long) iIntValue)) : 0;
        this.avgScore = i;
        Logger.i(TAG, "avgScore score " + i);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        int i2 = this.avgScore;
        r02Var.r0 = i2 > 0 ? i2 : -1.0f;
    }
}
