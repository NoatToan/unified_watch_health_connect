package com.xiaomi.fitness.health.temperature.ui;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.TemperatureEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.temperature.TemperatureViewModel;
import com.xiaomi.fitness.health.temperature.adapter.TemperatureDayDetailAdapter;
import com.xiaomi.fitness.health.temperature.ui.TemperatureDayItemFragment;
import com.xiaomi.fitness.util.TemperatureDataUtil;
import defpackage.a52;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.jui;
import defpackage.k3p;
import defpackage.pni;
import defpackage.q02;
import defpackage.r02;
import defpackage.s02;
import defpackage.tka;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.vx5;
import defpackage.xcm;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001MB\u0007¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010%R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010%R\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/ui/TemperatureDayItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/temperature/TemperatureViewModel;", "Ltka;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewOnReportChanged", "refreshDataTitle", "setTitleEmpty", "", "time", "", "getDateDescStr", "(J)Ljava/lang/String;", "refreshDetailCard", "refreshBarChart", "initView", "initUnderstandCard", "initDetailRecyclerView", "initBarChartRecyclerView", "initViewBinding", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lorg/joda/time/LocalDate;", "currentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "dailyTempReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "containerView", "Landroid/view/View;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Ls02;", "itemDecoration", "Ls02;", "Lvnq;", "La52;", "yAxis", "Lvnq;", "Lvqr;", "xAxis", "Lvqr;", "Lr02;", "barChartAttrs", "Lr02;", "Lcom/xiaomi/fitness/health/temperature/ui/TemperatureDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/health/temperature/ui/TemperatureDataTitleView;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barChartEntries", "Ljava/util/List;", "Lq02;", "barChartAdapter", "Lq02;", "viewSpace", "Landroidx/recyclerview/widget/RecyclerView;", "detailRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/temperature/adapter/TemperatureDayDetailAdapter;", "detailAdapter", "Lcom/xiaomi/fitness/health/temperature/adapter/TemperatureDayDetailAdapter;", "understandCard", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTemperatureDayItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureDayItemFragment.kt\ncom/xiaomi/fitness/health/temperature/ui/TemperatureDayItemFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n1#2:294\n*E\n"})
public final class TemperatureDayItemFragment extends Hilt_TemperatureDayItemFragment<TemperatureViewModel, tka> {

    @NotNull
    public static final String TAG = "TempDay";

    @Nullable
    private q02<RecyclerBarEntry> barChartAdapter;

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private List<RecyclerBarEntry> barChartEntries;

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;

    @Nullable
    private View containerView;

    @Nullable
    private LocalDate currentLocalDate;

    @Nullable
    private DailyTempReport dailyTempReport;

    @Nullable
    private TemperatureDataTitleView dataTitleView;

    @Nullable
    private TemperatureDayDetailAdapter detailAdapter;

    @Nullable
    private RecyclerView detailRecyclerView;

    @Nullable
    private s02 itemDecoration;

    @Nullable
    private View understandCard;

    @Nullable
    private View viewSpace;

    @Nullable
    private vqr xAxis;

    @Nullable
    private vnq<a52> yAxis;

    private final String getDateDescStr(long time) {
        LocalDate localDate = this.currentLocalDate;
        Intrinsics.checkNotNull(localDate);
        if (TimeDateUtil.isToday(localDate)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s %s", Arrays.copyOf(new Object[]{getString(c0j.v5), TimeDateUtil.getDateStr(time, TimeUtils.FORMAT_H_M)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        return TimeDateUtil.getDateYYYYMMddLocalFormat(((long) 1000) * time) + " " + TimeDateUtil.getDateStr(time, TimeUtils.FORMAT_H_M);
    }

    private final void initBarChartRecyclerView() {
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.barChartAttrs = (r02) barChartRecyclerView.mAttrs;
        this.barChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.barChartAttrs);
        vnq<a52> vnqVar = new vnq<>(this.barChartAttrs);
        this.yAxis = vnqVar;
        Intrinsics.checkNotNull(vnqVar);
        vnqVar.setValueFormatter(new vx5(1));
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        vnq<a52> vnqVar2 = this.yAxis;
        Intrinsics.checkNotNull(vnqVar2);
        temperatureDataUtil.updateTempYAxis(vnqVar2, null, null, null);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c);
        this.xAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(new xqr());
        this.itemDecoration = new s02(this.yAxis, this.xAxis, this.barChartAttrs);
        k3p k3pVar = new k3p(getMActivity(), true);
        s02 s02Var = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(k3pVar);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        this.barChartAdapter = new q02<>(getMActivity(), this.barChartEntries, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, k3pVar);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.barChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.temperature.ui.TemperatureDayItemFragment$initBarChartRecyclerView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    TemperatureDataTitleView temperatureDataTitleView = this.this$0.dataTitleView;
                    if (temperatureDataTitleView != null) {
                        temperatureDataTitleView.c(false);
                        return;
                    }
                    return;
                }
                TemperatureDataTitleView temperatureDataTitleView2 = this.this$0.dataTitleView;
                if (temperatureDataTitleView2 != null) {
                    temperatureDataTitleView2.c(true);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private final void initBundle() {
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            localDateNow = LocalDate.now().minusDays(numValueOf.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        this.currentLocalDate = localDateNow;
        if (localDateNow == null) {
            this.currentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailRecyclerView() {
        RecyclerView recyclerView = this.detailRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getMActivity()));
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.detailRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(bl5Var);
        TemperatureDayDetailAdapter temperatureDayDetailAdapter = new TemperatureDayDetailAdapter();
        this.detailAdapter = temperatureDayDetailAdapter;
        Intrinsics.checkNotNull(temperatureDayDetailAdapter);
        TemperatureDayDetailAdapter.showHeader$default(temperatureDayDetailAdapter, c0j.I6, pni.H3, false, 4, null);
        RecyclerView recyclerView3 = this.detailRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.detailAdapter);
        RecyclerView recyclerView4 = this.detailRecyclerView;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: f3p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TemperatureDayItemFragment.initUnderstandCard$lambda$1(this.f17369a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$1(TemperatureDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandTemperatureFragment.class, null);
    }

    private final void initView() {
        initBarChartRecyclerView();
        initDetailRecyclerView();
        initUnderstandCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewBinding() {
        this.containerView = ((tka) getMBinding()).E;
        this.barChartRecyclerView = ((tka) getMBinding()).B;
        this.dataTitleView = ((tka) getMBinding()).A;
        this.detailRecyclerView = ((tka) getMBinding()).C;
        this.understandCard = ((tka) getMBinding()).F;
        this.viewSpace = ((tka) getMBinding()).D;
    }

    private final void refreshBarChart() {
        DailyTempReport dailyTempReport = this.dailyTempReport;
        if (dailyTempReport == null) {
            LocalDate localDate = this.currentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyTempReport = new DailyTempReport(TimeDateUtil.changZeroOfTheDay(localDate), "days");
        }
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        List<TemperatureEntry> listFillDaySegmentBarEntries = temperatureDataUtil.fillDaySegmentBarEntries(dailyTempReport, r02Var);
        List<RecyclerBarEntry> list = this.barChartEntries;
        if (list != null) {
            list.clear();
        }
        List<RecyclerBarEntry> list2 = this.barChartEntries;
        if (list2 != null) {
            list2.addAll(listFillDaySegmentBarEntries);
        }
        vnq<a52> vnqVar = this.yAxis;
        Intrinsics.checkNotNull(vnqVar);
        temperatureDataUtil.updateTempYAxis(vnqVar, dailyTempReport.getBodyTempRecords(), dailyTempReport.getSkinTempRecords(), listFillDaySegmentBarEntries);
        s02 s02Var = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.yAxis);
        q02<RecyclerBarEntry> q02Var = this.barChartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.setYAxis(this.yAxis);
        q02<RecyclerBarEntry> q02Var2 = this.barChartAdapter;
        if (q02Var2 != null) {
            q02Var2.notifyDataSetChanged();
        }
    }

    private final void refreshDataTitle() {
        DailyTempReport dailyTempReport = this.dailyTempReport;
        if (dailyTempReport == null) {
            setTitleEmpty();
            return;
        }
        Intrinsics.checkNotNull(dailyTempReport);
        List<TimesDataRecordFloat> bodyTempRecords = dailyTempReport.getBodyTempRecords();
        DailyTempReport dailyTempReport2 = this.dailyTempReport;
        Intrinsics.checkNotNull(dailyTempReport2);
        List<TimesDataRecordFloat> skinTempRecords = dailyTempReport2.getSkinTempRecords();
        DailyTempReport dailyTempReport3 = this.dailyTempReport;
        Intrinsics.checkNotNull(dailyTempReport3);
        List<TemperatureItem> dailyAllTempDatas = dailyTempReport3.getDailyAllTempDatas();
        boolean zIsEmpty = bodyTempRecords != null ? bodyTempRecords.isEmpty() : true;
        boolean zIsEmpty2 = skinTempRecords != null ? skinTempRecords.isEmpty() : true;
        DailyTempReport dailyTempReport4 = this.dailyTempReport;
        Intrinsics.checkNotNull(dailyTempReport4);
        if (dailyTempReport4.isEmpty()) {
            setTitleEmpty();
            return;
        }
        if (ArrayUtils.isEmpty(dailyAllTempDatas)) {
            setTitleEmpty();
            return;
        }
        Intrinsics.checkNotNull(dailyAllTempDatas);
        TemperatureItem temperatureItem = dailyAllTempDatas.get(0);
        Float bodyTemp = temperatureItem.getBodyTemp();
        float fFloatValue = bodyTemp != null ? bodyTemp.floatValue() : 0.0f;
        Float skinTemp = temperatureItem.getSkinTemp();
        float fFloatValue2 = skinTemp != null ? skinTemp.floatValue() : 0.0f;
        boolean z = !zIsEmpty;
        boolean z2 = !zIsEmpty2;
        if (!z && !z2) {
            setTitleEmpty();
            return;
        }
        String dateDescStr = getDateDescStr(temperatureItem.getTime());
        View view = this.viewSpace;
        if (view != null) {
            ViewExtKt.setVisible(view, true);
        }
        TemperatureDataTitleView temperatureDataTitleView = this.dataTitleView;
        if (temperatureDataTitleView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArr = new Object[2];
            objArr[0] = fFloatValue > 0.0f ? TemperatureDataUtil.INSTANCE.formatTemperature(fFloatValue) : "--";
            objArr[1] = getString(c0j.hn);
            String str = String.format("%s%s", Arrays.copyOf(objArr, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            temperatureDataTitleView.a(z, dateDescStr, str);
        }
        TemperatureDataTitleView temperatureDataTitleView2 = this.dataTitleView;
        if (temperatureDataTitleView2 != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] objArr2 = new Object[2];
            objArr2[0] = fFloatValue2 > 0.0f ? TemperatureDataUtil.INSTANCE.formatTemperature(fFloatValue2) : "--";
            objArr2[1] = getString(c0j.hn);
            String str2 = String.format("%s%s", Arrays.copyOf(objArr2, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            temperatureDataTitleView2.b(z2, dateDescStr, str2);
        }
    }

    private final void refreshDetailCard() {
        DailyTempReport dailyTempReport = this.dailyTempReport;
        List<TemperatureItem> dailyAllTempDatas = dailyTempReport != null ? dailyTempReport.getDailyAllTempDatas() : null;
        if (ArrayUtils.isEmpty(dailyAllTempDatas)) {
            RecyclerView recyclerView = this.detailRecyclerView;
            if (recyclerView != null) {
                ViewExtKt.setVisible(recyclerView, false);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.detailRecyclerView;
        if (recyclerView2 != null) {
            ViewExtKt.setVisible(recyclerView2, true);
        }
        TemperatureDayDetailAdapter temperatureDayDetailAdapter = this.detailAdapter;
        Intrinsics.checkNotNull(temperatureDayDetailAdapter);
        TemperatureDayDetailAdapter.updateDataList$default(temperatureDayDetailAdapter, dailyAllTempDatas, false, 2, null);
    }

    private final void refreshViewOnReportChanged() {
        DailyTempReport dailyTempReport = this.dailyTempReport;
        Logger.i(TAG, "refresh TemperatureReport .. " + (dailyTempReport != null ? dailyTempReport.toString() : null));
        refreshBarChart();
        refreshDataTitle();
        refreshDetailCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        this.dailyTempReport = null;
        LocalDate localDate = this.currentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i(TAG, "start request data.." + this.currentLocalDate + "/params start:" + jChangZeroOfTheDay);
        ((TemperatureViewModel) getMViewModel()).triggerFetchFitnessReport(ITemperatureRepository.class, "days", jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new TemperatureDayItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e3p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TemperatureDayItemFragment.requestData$lambda$0(this.f16233a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(TemperatureDayItemFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.dailyTempReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyTempReport) {
                this$0.dailyTempReport = (DailyTempReport) dailyBasicReport;
            }
        }
        this$0.refreshViewOnReportChanged();
        return Unit.INSTANCE;
    }

    private final void setTitleEmpty() {
        View view = this.viewSpace;
        if (view != null) {
            ViewExtKt.setVisible(view, false);
        }
        TemperatureDataTitleView temperatureDataTitleView = this.dataTitleView;
        if (temperatureDataTitleView != null) {
            temperatureDataTitleView.d(getString(c0j.L6));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.S1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        initViewBinding();
        initView();
        requestData();
    }
}
