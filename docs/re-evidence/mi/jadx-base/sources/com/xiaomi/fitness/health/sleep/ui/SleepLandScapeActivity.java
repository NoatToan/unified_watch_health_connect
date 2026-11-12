package com.xiaomi.fitness.health.sleep.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValue;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.LineChartDetailDecoration;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.chart.view.LineDetailChartRecyclerView;
import com.xiaomi.fitness.chart.view.SleepChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.SleepRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepLandScapeActivity;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepLandTitleAdapter;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.health.sleep.valueformater.DaySleepHighLightFormatter;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.util.DeviceModelExtKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.ez5;
import defpackage.f9n;
import defpackage.gjm;
import defpackage.hak;
import defpackage.ili;
import defpackage.jui;
import defpackage.oim;
import defpackage.qim;
import defpackage.qxi;
import defpackage.rtr;
import defpackage.tim;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import defpackage.zbe;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 j2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001jB\u0007¢\u0006\u0004\bi\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J3\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0007J3\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ'\u0010!\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R$\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020I098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010<R\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020I0Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010ER\u0016\u0010X\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010HR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020I098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010<R\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020I0Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010SR\u0016\u0010[\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010VR\u0016\u0010\\\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010MR\u0016\u0010]\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010PR\u0016\u0010^\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001e098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010<R\u0014\u0010f\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010e¨\u0006k"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepLandScapeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lzbe;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter$OnTitleItemClickListener;", "", "initSleepChartView", "()V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "report", "updateSleepChartView", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "initHeartChartView", "", "startTime", "endTime", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValue;", "", "hrmRecords", "updateSleepHrChartView", "(JJLjava/util/List;)V", "initSpo2ChartView", "spo2Records", "updateSleepSpo2ChartView", "initChartTitleClick", "updateChartTitleClickStatus", "updateChartTitle", "Lcom/xiaomi/fitness/chart/view/LineDetailChartRecyclerView;", "chartRecyclerView", "", "enableShow", "animationTime", "startAnimation", "(Lcom/xiaomi/fitness/chart/view/LineDetailChartRecyclerView;ZI)V", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entries", "", "getTheSpoMinNumber", "(Ljava/util/List;)F", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "position", "changeStatus", "onClick", "(IZ)V", "Lcom/xiaomi/fitness/chart/view/SleepChartRecyclerView;", "mChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/SleepChartRecyclerView;", "Ltim;", "sleepChartItemDecoration", "Ltim;", "Loim;", "mSleepChartAdapter", "Loim;", "", "Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;", "mChartEntries", "Ljava/util/List;", "daySleepReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "daySleepHrReport", "daySleepSpo2Report", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter;", "titleViewAdapter", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter;", "hrLineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineDetailChartRecyclerView;", "Lvfe;", "hrLineChartAttrs", "Lvfe;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "entryList", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lufe;", "hrLineChartAdapter", "Lufe;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/LineChartDetailDecoration;", "hrLineItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/LineChartDetailDecoration;", "spo2LineChartRecyclerView", "spo2LineChartAttrs", "spo2EntryList", "spo2LineChartAdapter", "spo2LineItemDecoration", "ySpo2Axis", "xSpo2Axis", "itemHeight", "I", "Landroid/view/View;", "chartTitleView", "Landroid/view/View;", "sleepItemStatus", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepLandScapeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepLandScapeActivity.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepLandScapeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n1755#2,3:637\n*S KotlinDebug\n*F\n+ 1 SleepLandScapeActivity.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepLandScapeActivity\n*L\n150#1:637,3\n*E\n"})
public final class SleepLandScapeActivity extends Hilt_SleepLandScapeActivity<SleepViewModel, zbe> implements SleepLandTitleAdapter.OnTitleItemClickListener {

    @NotNull
    public static final String PARAM_SLEEP_HR_REPORT = "sleep_hr_report";

    @NotNull
    public static final String PARAM_SLEEP_REPORT = "sleep_report";

    @NotNull
    public static final String PARAM_SLEEP_REPORT_DATE = "sleep_report_date";

    @NotNull
    public static final String PARAM_SLEEP_REPORT_DATE_UNIQUE = "sleep_report_date_unique";

    @NotNull
    public static final String PARAM_SLEEP_REPORT_POSITION = "sleep_report_position";

    @NotNull
    public static final String PARAM_SLEEP_SPO2_REPORT = "sleep_spo2_report";

    @NotNull
    public static final String TAG = "SleepLandScapeActivity";
    private View chartTitleView;

    @Nullable
    private List<TimedValue<Integer>> daySleepHrReport;

    @Nullable
    private SleepSegmentReport daySleepReport;

    @Nullable
    private List<TimedValue<Integer>> daySleepSpo2Report;
    private List<MaxMinEntry> entryList;
    private ufe<MaxMinEntry> hrLineChartAdapter;
    private vfe hrLineChartAttrs;
    private LineDetailChartRecyclerView hrLineChartRecyclerView;
    private LineChartDetailDecoration hrLineItemDecoration;
    private int itemHeight;

    @NotNull
    private final List<SleepItemEntry> mChartEntries = new LinkedList();

    @Nullable
    private SleepChartRecyclerView mChartRecyclerView;

    @Nullable
    private oim mSleepChartAdapter;

    @Nullable
    private tim sleepChartItemDecoration;

    @NotNull
    private List<Boolean> sleepItemStatus;
    private List<MaxMinEntry> spo2EntryList;
    private ufe<MaxMinEntry> spo2LineChartAdapter;
    private vfe spo2LineChartAttrs;
    private LineDetailChartRecyclerView spo2LineChartRecyclerView;
    private LineChartDetailDecoration spo2LineItemDecoration;

    @Nullable
    private SleepLandTitleAdapter titleViewAdapter;
    private vqr xAxis;
    private vqr xSpo2Axis;
    private rtr yAxis;
    private rtr ySpo2Axis;

    public SleepLandScapeActivity() {
        Boolean bool = Boolean.TRUE;
        this.sleepItemStatus = CollectionsKt__CollectionsKt.mutableListOf(bool, bool, bool, bool, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ zbe access$getMBinding(SleepLandScapeActivity sleepLandScapeActivity) {
        return (zbe) sleepLandScapeActivity.getMBinding();
    }

    private final float getTheSpoMinNumber(List<? extends RecyclerBarEntry> entries) {
        float fMin = -1.0f;
        if (entries != null && !entries.isEmpty()) {
            entries.get(0);
            int size = entries.size();
            for (int i = 0; i < size; i++) {
                RecyclerBarEntry recyclerBarEntry = entries.get(i);
                if (recyclerBarEntry.getY() != 0.0f) {
                    fMin = Math.min(fMin, recyclerBarEntry.getY());
                }
            }
        }
        return fMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initChartTitleClick() {
        View view = ((zbe) getMBinding()).B;
        this.chartTitleView = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
            view = null;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(eri.kj);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        SleepLandTitleAdapter sleepLandTitleAdapter = new SleepLandTitleAdapter();
        this.titleViewAdapter = sleepLandTitleAdapter;
        recyclerView.setAdapter(sleepLandTitleAdapter);
        SleepLandTitleAdapter sleepLandTitleAdapter2 = this.titleViewAdapter;
        Intrinsics.checkNotNull(sleepLandTitleAdapter2);
        sleepLandTitleAdapter2.setOnTitleItemClickListener(this);
        SleepLandTitleAdapter sleepLandTitleAdapter3 = this.titleViewAdapter;
        Intrinsics.checkNotNull(sleepLandTitleAdapter3);
        sleepLandTitleAdapter3.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHeartChartView() {
        List<MaxMinEntry> list;
        LineDetailChartRecyclerView lineDetailChartRecyclerView;
        vqr vqrVar;
        vfe vfeVar;
        LineDetailChartRecyclerView lineDetailChartRecyclerView2 = ((zbe) getMBinding()).G;
        this.hrLineChartRecyclerView = lineDetailChartRecyclerView2;
        LineDetailChartRecyclerView lineDetailChartRecyclerView3 = null;
        if (lineDetailChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
            lineDetailChartRecyclerView2 = null;
        }
        this.hrLineChartAttrs = (vfe) lineDetailChartRecyclerView2.mAttrs;
        xqr xqrVar = new xqr();
        this.entryList = new ArrayList();
        vfe vfeVar2 = this.hrLineChartAttrs;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAttrs");
            vfeVar2 = null;
        }
        this.yAxis = new rtr(vfeVar2);
        vfe vfeVar3 = this.hrLineChartAttrs;
        if (vfeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAttrs");
            vfeVar3 = null;
        }
        vfe vfeVar4 = this.hrLineChartAttrs;
        if (vfeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAttrs");
            vfeVar4 = null;
        }
        this.xAxis = new vqr(vfeVar3, vfeVar4.c, xqrVar);
        rtr rtrVar = this.yAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar = null;
        }
        vqr vqrVar2 = this.xAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar2 = null;
        }
        vfe vfeVar5 = this.hrLineChartAttrs;
        if (vfeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAttrs");
            vfeVar5 = null;
        }
        LineChartDetailDecoration lineChartDetailDecoration = new LineChartDetailDecoration(rtrVar, vqrVar2, vfeVar5);
        this.hrLineItemDecoration = lineChartDetailDecoration;
        String string = getString(c0j.k7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        lineChartDetailDecoration.setLabelText(string);
        LineChartDetailDecoration lineChartDetailDecoration2 = this.hrLineItemDecoration;
        if (lineChartDetailDecoration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineItemDecoration");
            lineChartDetailDecoration2 = null;
        }
        lineChartDetailDecoration2.setBreakPointLine(Boolean.TRUE);
        SleepRateHighLightMarkValueFormatter sleepRateHighLightMarkValueFormatter = new SleepRateHighLightMarkValueFormatter(0);
        List<MaxMinEntry> list2 = this.entryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list = null;
        } else {
            list = list2;
        }
        LineDetailChartRecyclerView lineDetailChartRecyclerView4 = this.hrLineChartRecyclerView;
        if (lineDetailChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
            lineDetailChartRecyclerView = null;
        } else {
            lineDetailChartRecyclerView = lineDetailChartRecyclerView4;
        }
        vqr vqrVar3 = this.xAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar = null;
        } else {
            vqrVar = vqrVar3;
        }
        vfe vfeVar6 = this.hrLineChartAttrs;
        if (vfeVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar6;
        }
        this.hrLineChartAdapter = new ufe<>(this, list, lineDetailChartRecyclerView, vqrVar, vfeVar, sleepRateHighLightMarkValueFormatter);
        LineDetailChartRecyclerView lineDetailChartRecyclerView5 = this.hrLineChartRecyclerView;
        if (lineDetailChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
            lineDetailChartRecyclerView5 = null;
        }
        ufe<MaxMinEntry> ufeVar = this.hrLineChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAdapter");
            ufeVar = null;
        }
        lineDetailChartRecyclerView5.setAdapter(ufeVar);
        LineDetailChartRecyclerView lineDetailChartRecyclerView6 = this.hrLineChartRecyclerView;
        if (lineDetailChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
            lineDetailChartRecyclerView6 = null;
        }
        LineChartDetailDecoration lineChartDetailDecoration3 = this.hrLineItemDecoration;
        if (lineChartDetailDecoration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineItemDecoration");
            lineChartDetailDecoration3 = null;
        }
        lineDetailChartRecyclerView6.addItemDecoration(lineChartDetailDecoration3);
        LineDetailChartRecyclerView lineDetailChartRecyclerView7 = this.hrLineChartRecyclerView;
        if (lineDetailChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
            lineDetailChartRecyclerView7 = null;
        }
        vfe vfeVar7 = this.hrLineChartAttrs;
        if (vfeVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAttrs");
            vfeVar7 = null;
        }
        lineDetailChartRecyclerView7.setLayoutManager(new SpeedRatioLayoutManager(this, vfeVar7));
        LineDetailChartRecyclerView lineDetailChartRecyclerView8 = this.hrLineChartRecyclerView;
        if (lineDetailChartRecyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
        } else {
            lineDetailChartRecyclerView3 = lineDetailChartRecyclerView8;
        }
        lineDetailChartRecyclerView3.setNestedScrollingEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSleepChartView() {
        SleepChartRecyclerView sleepChartRecyclerView = ((zbe) getMBinding()).A;
        this.mChartRecyclerView = sleepChartRecyclerView;
        this.mSleepChartAdapter = new oim(this, this.mChartEntries, sleepChartRecyclerView);
        SleepChartRecyclerView sleepChartRecyclerView2 = this.mChartRecyclerView;
        Intrinsics.checkNotNull(sleepChartRecyclerView2);
        T mAttrs = sleepChartRecyclerView2.mAttrs;
        Intrinsics.checkNotNullExpressionValue(mAttrs, "mAttrs");
        qim qimVar = (qim) mAttrs;
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this, qimVar);
        tim timVar = new tim(qimVar);
        this.sleepChartItemDecoration = timVar;
        Intrinsics.checkNotNull(timVar);
        timVar.setHighLightValueFormatter(new DaySleepHighLightFormatter(0));
        SleepChartRecyclerView sleepChartRecyclerView3 = this.mChartRecyclerView;
        Intrinsics.checkNotNull(sleepChartRecyclerView3);
        sleepChartRecyclerView3.setLayoutManager(speedRatioLayoutManager);
        SleepChartRecyclerView sleepChartRecyclerView4 = this.mChartRecyclerView;
        Intrinsics.checkNotNull(sleepChartRecyclerView4);
        tim timVar2 = this.sleepChartItemDecoration;
        Intrinsics.checkNotNull(timVar2);
        sleepChartRecyclerView4.addItemDecoration(timVar2);
        SleepChartRecyclerView sleepChartRecyclerView5 = this.mChartRecyclerView;
        Intrinsics.checkNotNull(sleepChartRecyclerView5);
        sleepChartRecyclerView5.setAdapter(this.mSleepChartAdapter);
        hak hakVar = new hak(this, this.mChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepLandScapeActivity$initSleepChartView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemClick(View view, int position, Boolean clickTwoCount) {
                if (Intrinsics.areEqual(clickTwoCount, Boolean.TRUE)) {
                    this.this$0.finish();
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    SleepLandScapeActivity.access$getMBinding(this.this$0).B.setVisibility(0);
                } else {
                    SleepLandScapeActivity.access$getMBinding(this.this$0).B.setVisibility(8);
                }
            }
        });
        SleepChartRecyclerView sleepChartRecyclerView6 = this.mChartRecyclerView;
        Intrinsics.checkNotNull(sleepChartRecyclerView6);
        sleepChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSpo2ChartView() {
        List<MaxMinEntry> list;
        LineDetailChartRecyclerView lineDetailChartRecyclerView;
        vqr vqrVar;
        vfe vfeVar;
        LineDetailChartRecyclerView lineDetailChartRecyclerView2 = ((zbe) getMBinding()).H;
        this.spo2LineChartRecyclerView = lineDetailChartRecyclerView2;
        LineDetailChartRecyclerView lineDetailChartRecyclerView3 = null;
        if (lineDetailChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
            lineDetailChartRecyclerView2 = null;
        }
        this.spo2LineChartAttrs = (vfe) lineDetailChartRecyclerView2.mAttrs;
        xqr xqrVar = new xqr();
        this.spo2EntryList = new ArrayList();
        vfe vfeVar2 = this.spo2LineChartAttrs;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar2 = null;
        }
        rtr rtrVar = new rtr(vfeVar2);
        this.ySpo2Axis = rtrVar;
        rtrVar.setValueFormatter(new f9n());
        vfe vfeVar3 = this.spo2LineChartAttrs;
        if (vfeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar3 = null;
        }
        vfe vfeVar4 = this.spo2LineChartAttrs;
        if (vfeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar4 = null;
        }
        this.xSpo2Axis = new vqr(vfeVar3, vfeVar4.c, xqrVar);
        rtr rtrVar2 = this.ySpo2Axis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ySpo2Axis");
            rtrVar2 = null;
        }
        vqr vqrVar2 = this.xSpo2Axis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xSpo2Axis");
            vqrVar2 = null;
        }
        vfe vfeVar5 = this.spo2LineChartAttrs;
        if (vfeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar5 = null;
        }
        LineChartDetailDecoration lineChartDetailDecoration = new LineChartDetailDecoration(rtrVar2, vqrVar2, vfeVar5);
        this.spo2LineItemDecoration = lineChartDetailDecoration;
        String string = getString(c0j.ch);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        lineChartDetailDecoration.setLabelText(string);
        LineChartDetailDecoration lineChartDetailDecoration2 = this.spo2LineItemDecoration;
        if (lineChartDetailDecoration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineItemDecoration");
            lineChartDetailDecoration2 = null;
        }
        lineChartDetailDecoration2.setBreakPointLine(Boolean.TRUE);
        SleepRateHighLightMarkValueFormatter sleepRateHighLightMarkValueFormatter = new SleepRateHighLightMarkValueFormatter(0);
        List<MaxMinEntry> list2 = this.spo2EntryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2EntryList");
            list = null;
        } else {
            list = list2;
        }
        LineDetailChartRecyclerView lineDetailChartRecyclerView4 = this.spo2LineChartRecyclerView;
        if (lineDetailChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
            lineDetailChartRecyclerView = null;
        } else {
            lineDetailChartRecyclerView = lineDetailChartRecyclerView4;
        }
        vqr vqrVar3 = this.xSpo2Axis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xSpo2Axis");
            vqrVar = null;
        } else {
            vqrVar = vqrVar3;
        }
        vfe vfeVar6 = this.spo2LineChartAttrs;
        if (vfeVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar6;
        }
        this.spo2LineChartAdapter = new ufe<>(this, list, lineDetailChartRecyclerView, vqrVar, vfeVar, sleepRateHighLightMarkValueFormatter);
        LineDetailChartRecyclerView lineDetailChartRecyclerView5 = this.spo2LineChartRecyclerView;
        if (lineDetailChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
            lineDetailChartRecyclerView5 = null;
        }
        ufe<MaxMinEntry> ufeVar = this.spo2LineChartAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAdapter");
            ufeVar = null;
        }
        lineDetailChartRecyclerView5.setAdapter(ufeVar);
        LineDetailChartRecyclerView lineDetailChartRecyclerView6 = this.spo2LineChartRecyclerView;
        if (lineDetailChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
            lineDetailChartRecyclerView6 = null;
        }
        LineChartDetailDecoration lineChartDetailDecoration3 = this.spo2LineItemDecoration;
        if (lineChartDetailDecoration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineItemDecoration");
            lineChartDetailDecoration3 = null;
        }
        lineDetailChartRecyclerView6.addItemDecoration(lineChartDetailDecoration3);
        LineDetailChartRecyclerView lineDetailChartRecyclerView7 = this.spo2LineChartRecyclerView;
        if (lineDetailChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
            lineDetailChartRecyclerView7 = null;
        }
        vfe vfeVar7 = this.spo2LineChartAttrs;
        if (vfeVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar7 = null;
        }
        lineDetailChartRecyclerView7.setLayoutManager(new SpeedRatioLayoutManager(this, vfeVar7));
        LineDetailChartRecyclerView lineDetailChartRecyclerView8 = this.spo2LineChartRecyclerView;
        if (lineDetailChartRecyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
        } else {
            lineDetailChartRecyclerView3 = lineDetailChartRecyclerView8;
        }
        lineDetailChartRecyclerView3.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$4(SleepLandScapeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LineDetailChartRecyclerView lineDetailChartRecyclerView = this$0.hrLineChartRecyclerView;
        if (lineDetailChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
            lineDetailChartRecyclerView = null;
        }
        this$0.startAnimation(lineDetailChartRecyclerView, true, 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$5(SleepLandScapeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LineDetailChartRecyclerView lineDetailChartRecyclerView = this$0.hrLineChartRecyclerView;
        if (lineDetailChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
            lineDetailChartRecyclerView = null;
        }
        this$0.startAnimation(lineDetailChartRecyclerView, false, 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$6(SleepLandScapeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LineDetailChartRecyclerView lineDetailChartRecyclerView = this$0.spo2LineChartRecyclerView;
        if (lineDetailChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
            lineDetailChartRecyclerView = null;
        }
        this$0.startAnimation(lineDetailChartRecyclerView, true, 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$7(SleepLandScapeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LineDetailChartRecyclerView lineDetailChartRecyclerView = this$0.spo2LineChartRecyclerView;
        if (lineDetailChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
            lineDetailChartRecyclerView = null;
        }
        this$0.startAnimation(lineDetailChartRecyclerView, false, 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(SleepLandScapeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$3(LocalDate currentLocalDate, int i, SleepLandScapeActivity this$0, LiveData liveData, long j, List list) {
        AllDaySleepReport allDaySleepReport;
        List<SleepSegmentReport> sleepSegments;
        List<SleepSegmentReport> sleepSegments2;
        Intrinsics.checkNotNullParameter(currentLocalDate, "$currentLocalDate");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(liveData, "$liveData");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) it.next();
            if ((dailyBasicReport instanceof AllDaySleepReport) && (sleepSegments = (allDaySleepReport = (AllDaySleepReport) dailyBasicReport).getSleepSegments()) != null) {
                List<SleepSegmentReport> list2 = sleepSegments;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((SleepSegmentReport) it2.next()).getBedTime() == j) {
                            if (allDaySleepReport.getTime() == TimeDateUtil.changZeroOfTheDay(currentLocalDate) && (sleepSegments2 = allDaySleepReport.getSleepSegments()) != null && !sleepSegments2.isEmpty() && i >= 0) {
                                List<SleepSegmentReport> sleepSegments3 = allDaySleepReport.getSleepSegments();
                                Intrinsics.checkNotNull(sleepSegments3);
                                if (i < sleepSegments3.size()) {
                                    ((zbe) this$0.getMBinding()).F.setVisibility(8);
                                    ((zbe) this$0.getMBinding()).D.setVisibility(0);
                                    ArrayList arrayList = new ArrayList();
                                    List<SleepSegmentReport> sleepSegments4 = allDaySleepReport.getSleepSegments();
                                    if (sleepSegments4 != null) {
                                        List<SleepSegmentReport> listFilterAndSortSleepLong = SleepExtKt.filterAndSortSleepLong(sleepSegments4);
                                        List<SleepSegmentReport> listFilterAndSortSleepShort = SleepExtKt.filterAndSortSleepShort(sleepSegments4);
                                        arrayList.addAll(listFilterAndSortSleepLong);
                                        arrayList.addAll(listFilterAndSortSleepShort);
                                    }
                                    SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) arrayList.get(i);
                                    this$0.daySleepReport = sleepSegmentReport;
                                    this$0.daySleepHrReport = sleepSegmentReport != null ? sleepSegmentReport.getHrDetailRecords() : null;
                                    SleepSegmentReport sleepSegmentReport2 = this$0.daySleepReport;
                                    this$0.daySleepSpo2Report = sleepSegmentReport2 != null ? sleepSegmentReport2.getSpo2DetailRecords() : null;
                                    LineDetailChartRecyclerView lineDetailChartRecyclerView = this$0.hrLineChartRecyclerView;
                                    if (lineDetailChartRecyclerView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                                        lineDetailChartRecyclerView = null;
                                    }
                                    ViewExtKt.setVisible(lineDetailChartRecyclerView, false);
                                    LineDetailChartRecyclerView lineDetailChartRecyclerView2 = this$0.spo2LineChartRecyclerView;
                                    if (lineDetailChartRecyclerView2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                                        lineDetailChartRecyclerView2 = null;
                                    }
                                    ViewExtKt.setVisible(lineDetailChartRecyclerView2, false);
                                    SleepSegmentReport sleepSegmentReport3 = this$0.daySleepReport;
                                    if (sleepSegmentReport3 != null && sleepSegmentReport3.hasStageData()) {
                                        SleepSegmentReport sleepSegmentReport4 = this$0.daySleepReport;
                                        Intrinsics.checkNotNull(sleepSegmentReport4);
                                        sleepSegmentReport4.setHrDetailRecords(this$0.daySleepHrReport);
                                        sleepSegmentReport4.setSpo2DetailRecords(this$0.daySleepSpo2Report);
                                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new SleepLandScapeActivity$onCreate$2$3(this$0, sleepSegmentReport4, null), 2, null);
                                        this$0.updateChartTitle(sleepSegmentReport4);
                                        this$0.updateChartTitleClickStatus();
                                        this$0.updateSleepChartView(sleepSegmentReport4);
                                    }
                                }
                            }
                            liveData.removeObservers(this$0);
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimation(final LineDetailChartRecyclerView chartRecyclerView, boolean enableShow, int animationTime) {
        ObjectAnimator objectAnimatorOfFloat = enableShow ? ObjectAnimator.ofFloat(chartRecyclerView, (Property<LineDetailChartRecyclerView, Float>) View.ALPHA, 0.0f, 1.0f) : ObjectAnimator.ofFloat(chartRecyclerView, (Property<LineDetailChartRecyclerView, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = enableShow ? ObjectAnimator.ofFloat(chartRecyclerView, (Property<LineDetailChartRecyclerView, Float>) View.SCALE_Y, 0.5f, 1.0f) : ObjectAnimator.ofFloat(chartRecyclerView, (Property<LineDetailChartRecyclerView, Float>) View.SCALE_Y, 0.5f, 0.0f);
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: spm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SleepLandScapeActivity.startAnimation$lambda$8(chartRecyclerView, valueAnimator);
            }
        });
        long j = animationTime;
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat2.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$8(LineDetailChartRecyclerView chartRecyclerView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(chartRecyclerView, "$chartRecyclerView");
        Intrinsics.checkNotNullParameter(it, "it");
        chartRecyclerView.invalidate();
    }

    private final void updateChartTitle(SleepSegmentReport report) {
        String string;
        String name;
        View view = this.chartTitleView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
            view = null;
        }
        View viewFindViewById = view.findViewById(eri.zn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        View view3 = this.chartTitleView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(eri.wn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        View view4 = this.chartTitleView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(eri.An);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById3;
        View view5 = this.chartTitleView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
            view5 = null;
        }
        View viewFindViewById4 = view5.findViewById(eri.xn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById4;
        View view6 = this.chartTitleView;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
            view6 = null;
        }
        View viewFindViewById5 = view6.findViewById(eri.vn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById5;
        View view7 = this.chartTitleView;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
        } else {
            view2 = view7;
        }
        View viewFindViewById6 = view2.findViewById(eri.Li);
        if (report.getSleepDuration() >= 60) {
            textView.setText(String.valueOf(report.getSleepDuration() / 60));
            textView2.setText(ResourceExtKt.getQuantityString(this, qxi.N1, report.getSleepDuration() / 60, Integer.valueOf(report.getSleepDuration() / 60)));
        } else {
            ViewExtKt.setVisible(textView, false);
            ViewExtKt.setVisible(textView2, false);
        }
        String str = "--";
        if (report.getSid() != null) {
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            String sid = report.getSid();
            Intrinsics.checkNotNull(sid);
            DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid);
            if (deviceInfoInAll != null && (name = deviceInfoInAll.getName()) != null) {
                str = name;
            }
        }
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(report.getTimestamp());
        if (report.getSleepDuration() % 60 > 0) {
            textView3.setText(String.valueOf(report.getSleepDuration() % 60));
            textView4.setText(ResourceExtKt.getQuantityString(this, qxi.P1, report.getSleepDuration() % 60, Integer.valueOf(report.getSleepDuration() % 60)));
        } else {
            ViewExtKt.setVisible(textView3, false);
            ViewExtKt.setVisible(textView4, false);
        }
        textView5.setText(getString(c0j.bh, dateMMddFormat, str));
        String string2 = "";
        if (ExtUtilsKt.isVisible(textView)) {
            CharSequence text = textView.getText();
            CharSequence text2 = textView2.getText();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) text);
            sb.append((Object) text2);
            string = sb.toString();
        } else {
            string = "";
        }
        if (ExtUtilsKt.isVisible(textView3)) {
            CharSequence text3 = textView3.getText();
            CharSequence text4 = textView4.getText();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) text3);
            sb2.append((Object) text4);
            string2 = sb2.toString();
        }
        viewFindViewById6.setContentDescription(string + string2);
    }

    private final void updateChartTitleClickStatus() {
        DeviceInfo<? extends Device> deviceInfoInAll;
        Integer wakeDuration;
        Integer remDuration;
        List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(1, 1, 1, 1, 1, 1);
        SleepSegmentReport sleepSegmentReport = this.daySleepReport;
        if (sleepSegmentReport == null) {
            return;
        }
        Intrinsics.checkNotNull(sleepSegmentReport);
        if (sleepSegmentReport.hasStageData()) {
            if (sleepSegmentReport.getDeepDuration() == 0) {
                listMutableListOf.set(0, 2);
            }
            if (sleepSegmentReport.getLightDuration() == 0) {
                listMutableListOf.set(1, 2);
            }
            if (sleepSegmentReport.getRemDuration() == null || ((remDuration = sleepSegmentReport.getRemDuration()) != null && remDuration.intValue() == 0)) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel != null && DeviceModelExtKt.isSupportAssistSleep(wearableDeviceModel) && TimeDateUtil.isToday(sleepSegmentReport.getWakeupTime())) {
                    listMutableListOf.set(2, 3);
                } else {
                    listMutableListOf.set(2, 2);
                }
            }
            if (sleepSegmentReport.getWakeDuration() == null || ((wakeDuration = sleepSegmentReport.getWakeDuration()) != null && wakeDuration.intValue() == 0)) {
                listMutableListOf.set(3, 2);
            }
            List<TimedValue<Integer>> hrDetailRecords = sleepSegmentReport.getHrDetailRecords();
            if (hrDetailRecords == null || hrDetailRecords.isEmpty()) {
                listMutableListOf.set(4, 2);
            }
            List<TimedValue<Integer>> spo2DetailRecords = sleepSegmentReport.getSpo2DetailRecords();
            if (spo2DetailRecords == null || spo2DetailRecords.isEmpty()) {
                WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel2 == null || !DeviceModelExtKt.isSupportSpo2Monitor(wearableDeviceModel2) || !TimeDateUtil.isToday(sleepSegmentReport.getWakeupTime()) || ((deviceInfoInAll = com.xiaomi.fitness.device.manager.DeviceManagerExtKt.getInstance(DeviceManager.INSTANCE).getDeviceInfoInAll(String.valueOf(sleepSegmentReport.getSid()))) != null && deviceInfoInAll.isPhone())) {
                    listMutableListOf.set(5, 2);
                } else {
                    listMutableListOf.set(5, 3);
                }
            }
        }
        SleepLandTitleAdapter sleepLandTitleAdapter = this.titleViewAdapter;
        if (sleepLandTitleAdapter != null) {
            sleepLandTitleAdapter.setEnableClickList(listMutableListOf);
        }
        SleepLandTitleAdapter sleepLandTitleAdapter2 = this.titleViewAdapter;
        if (sleepLandTitleAdapter2 != null) {
            sleepLandTitleAdapter2.notifyDataSetChanged();
        }
    }

    private final void updateSleepChartView(SleepSegmentReport report) {
        if (report.hasStageData()) {
            int stageCount = report.getStageCount();
            SleepChartRecyclerView sleepChartRecyclerView = this.mChartRecyclerView;
            Intrinsics.checkNotNull(sleepChartRecyclerView);
            sleepChartRecyclerView.setVisibility(0);
            if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
                SleepChartRecyclerView sleepChartRecyclerView2 = this.mChartRecyclerView;
                Intrinsics.checkNotNull(sleepChartRecyclerView2);
                ViewGroup.LayoutParams layoutParams = sleepChartRecyclerView2.getLayoutParams();
                layoutParams.height = (getResources().getDimensionPixelSize(ili.h) * 4) + ez5.a(167);
                SleepChartRecyclerView sleepChartRecyclerView3 = this.mChartRecyclerView;
                Intrinsics.checkNotNull(sleepChartRecyclerView3);
                sleepChartRecyclerView3.setLayoutParams(layoutParams);
            }
            tim timVar = this.sleepChartItemDecoration;
            Intrinsics.checkNotNull(timVar);
            timVar.c(Float.valueOf(((4 - stageCount) * this.itemHeight) / stageCount));
            tim timVar2 = this.sleepChartItemDecoration;
            Intrinsics.checkNotNull(timVar2);
            timVar2.updateStageSize(stageCount);
            this.mChartEntries.clear();
            List<SleepItemEntry> list = this.mChartEntries;
            List<SleepItemEntry> listB = gjm.b(report, Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(listB, "createDaySleepChartEntry(...)");
            list.addAll(listB);
            oim oimVar = this.mSleepChartAdapter;
            Intrinsics.checkNotNull(oimVar);
            oimVar.setEntries(this.mChartEntries);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSleepHrChartView(long startTime, long endTime, List<TimedValue<Integer>> hrmRecords) {
        new LinkedHashMap();
        int i = 4;
        ufe<MaxMinEntry> ufeVar = null;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            LineDetailChartRecyclerView lineDetailChartRecyclerView = this.hrLineChartRecyclerView;
            if (lineDetailChartRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                lineDetailChartRecyclerView = null;
            }
            ViewGroup.LayoutParams layoutParams = lineDetailChartRecyclerView.getLayoutParams();
            layoutParams.height = (getResources().getDimensionPixelSize(ili.h) * 4) + ez5.a(167);
            LineDetailChartRecyclerView lineDetailChartRecyclerView2 = this.hrLineChartRecyclerView;
            if (lineDetailChartRecyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                lineDetailChartRecyclerView2 = null;
            }
            lineDetailChartRecyclerView2.setLayoutParams(layoutParams);
        }
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        for (TimedValue timedValue : CollectionsKt___CollectionsKt.reversed(hrmRecords)) {
            float f2 = f;
            f += 1.0f;
            arrayList.add(new MaxMinEntry(f2, ((Number) timedValue.getValue()).intValue(), timedValue.getTime(), 2));
        }
        List<MaxMinEntry> list = this.entryList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list = null;
        }
        list.clear();
        List<MaxMinEntry> list2 = this.entryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list2 = null;
        }
        list2.addAll(arrayList);
        vqr vqrVar = this.xAxis;
        if (vqrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar = null;
        }
        vqrVar.f37144a = arrayList.size();
        List<MaxMinEntry> list3 = this.entryList;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list3 = null;
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(list3);
        float f3 = 160.0f;
        if (theMaxNumber >= 160.0f) {
            int i2 = (int) ((theMaxNumber - 160) / 40);
            f3 = ((i2 + 1) * 40) + theMaxNumber;
            i = i2 + 5;
        }
        rtr rtrVar = this.yAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar = null;
        }
        rtr rtrVar2 = this.yAxis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar2 = null;
        }
        rtr rtrVarL = rtrVar.l(rtrVar2, f3);
        this.yAxis = rtrVarL;
        if (rtrVarL == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVarL = null;
        }
        rtrVarL.setAxisMaximum(f3);
        rtr rtrVar3 = this.yAxis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar3 = null;
        }
        rtrVar3.f = i;
        rtr rtrVar4 = this.yAxis;
        if (rtrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar4 = null;
        }
        rtrVar4.d(i, 40);
        vfe vfeVar = this.hrLineChartAttrs;
        if (vfeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAttrs");
            vfeVar = null;
        }
        vfeVar.E = f3;
        LineChartDetailDecoration lineChartDetailDecoration = this.hrLineItemDecoration;
        if (lineChartDetailDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineItemDecoration");
            lineChartDetailDecoration = null;
        }
        rtr rtrVar5 = this.yAxis;
        if (rtrVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar5 = null;
        }
        lineChartDetailDecoration.setYAxis(rtrVar5);
        LineChartDetailDecoration lineChartDetailDecoration2 = this.hrLineItemDecoration;
        if (lineChartDetailDecoration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineItemDecoration");
            lineChartDetailDecoration2 = null;
        }
        vqr vqrVar2 = this.xAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar2 = null;
        }
        lineChartDetailDecoration2.setXAxis(vqrVar2);
        ufe<MaxMinEntry> ufeVar2 = this.hrLineChartAdapter;
        if (ufeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAdapter");
            ufeVar2 = null;
        }
        vqr vqrVar3 = this.xAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar3 = null;
        }
        ufeVar2.setXAxis(vqrVar3);
        ufe<MaxMinEntry> ufeVar3 = this.hrLineChartAdapter;
        if (ufeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrLineChartAdapter");
        } else {
            ufeVar = ufeVar3;
        }
        ufeVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSleepSpo2ChartView(long startTime, long endTime, List<TimedValue<Integer>> spo2Records) {
        new LinkedHashMap();
        int i = 4;
        ufe<MaxMinEntry> ufeVar = null;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            LineDetailChartRecyclerView lineDetailChartRecyclerView = this.spo2LineChartRecyclerView;
            if (lineDetailChartRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                lineDetailChartRecyclerView = null;
            }
            ViewGroup.LayoutParams layoutParams = lineDetailChartRecyclerView.getLayoutParams();
            layoutParams.height = (getResources().getDimensionPixelSize(ili.h) * 4) + ez5.a(167);
            LineDetailChartRecyclerView lineDetailChartRecyclerView2 = this.spo2LineChartRecyclerView;
            if (lineDetailChartRecyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                lineDetailChartRecyclerView2 = null;
            }
            lineDetailChartRecyclerView2.setLayoutParams(layoutParams);
        }
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        for (TimedValue timedValue : CollectionsKt___CollectionsKt.reversed(spo2Records)) {
            float f2 = f;
            f += 1.0f;
            arrayList.add(new MaxMinEntry(f2, ((Number) timedValue.getValue()).intValue(), timedValue.getTime(), 2));
        }
        List<MaxMinEntry> list = this.spo2EntryList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2EntryList");
            list = null;
        }
        list.clear();
        List<MaxMinEntry> list2 = this.spo2EntryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2EntryList");
            list2 = null;
        }
        list2.addAll(arrayList);
        vqr vqrVar = this.xSpo2Axis;
        if (vqrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xSpo2Axis");
            vqrVar = null;
        }
        vqrVar.f37144a = arrayList.size();
        List<MaxMinEntry> list3 = this.spo2EntryList;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2EntryList");
            list3 = null;
        }
        float theSpoMinNumber = getTheSpoMinNumber(list3);
        float f3 = 80.0f;
        if (theSpoMinNumber > 0.0f && theSpoMinNumber < 80.0f) {
            float f4 = 5;
            f3 = 80.0f - ((((int) ((80.0f - theSpoMinNumber) / f4)) + 1) * 5);
            i = ((int) ((f3 - theSpoMinNumber) / f4)) + 5;
        }
        vfe vfeVar = this.spo2LineChartAttrs;
        if (vfeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar = null;
        }
        vfeVar.E = 100.0f;
        vfe vfeVar2 = this.spo2LineChartAttrs;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAttrs");
            vfeVar2 = null;
        }
        vfeVar2.F = f3;
        rtr rtrVar = this.ySpo2Axis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ySpo2Axis");
            rtrVar = null;
        }
        rtrVar.setAxisMaximum(100.0f);
        rtr rtrVar2 = this.ySpo2Axis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ySpo2Axis");
            rtrVar2 = null;
        }
        rtrVar2.setAxisMinimum(f3);
        rtr rtrVar3 = this.ySpo2Axis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ySpo2Axis");
            rtrVar3 = null;
        }
        rtrVar3.f = i;
        rtr rtrVar4 = this.ySpo2Axis;
        if (rtrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ySpo2Axis");
            rtrVar4 = null;
        }
        rtrVar4.d(i, 5);
        LineChartDetailDecoration lineChartDetailDecoration = this.spo2LineItemDecoration;
        if (lineChartDetailDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineItemDecoration");
            lineChartDetailDecoration = null;
        }
        rtr rtrVar5 = this.ySpo2Axis;
        if (rtrVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ySpo2Axis");
            rtrVar5 = null;
        }
        lineChartDetailDecoration.setYAxis(rtrVar5);
        LineChartDetailDecoration lineChartDetailDecoration2 = this.spo2LineItemDecoration;
        if (lineChartDetailDecoration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineItemDecoration");
            lineChartDetailDecoration2 = null;
        }
        vqr vqrVar2 = this.xSpo2Axis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xSpo2Axis");
            vqrVar2 = null;
        }
        lineChartDetailDecoration2.setXAxis(vqrVar2);
        ufe<MaxMinEntry> ufeVar2 = this.spo2LineChartAdapter;
        if (ufeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAdapter");
            ufeVar2 = null;
        }
        vqr vqrVar3 = this.xSpo2Axis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xSpo2Axis");
            vqrVar3 = null;
        }
        ufeVar2.setXAxis(vqrVar3);
        ufe<MaxMinEntry> ufeVar3 = this.spo2LineChartAdapter;
        if (ufeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartAdapter");
        } else {
            ufeVar = ufeVar3;
        }
        ufeVar.notifyDataSetChanged();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.C7;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    @Override // com.xiaomi.fitness.health.sleep.ui.adapter.SleepLandTitleAdapter.OnTitleItemClickListener
    public void onClick(int position, boolean changeStatus) {
        if (position == 0) {
            this.sleepItemStatus.set(3, Boolean.valueOf(changeStatus));
            SleepTrackHelper.INSTANCE.trackLandChartItemClick(3);
        } else if (position == 1) {
            this.sleepItemStatus.set(2, Boolean.valueOf(changeStatus));
            SleepTrackHelper.INSTANCE.trackLandChartItemClick(4);
        } else if (position == 2) {
            this.sleepItemStatus.set(1, Boolean.valueOf(changeStatus));
            SleepTrackHelper.INSTANCE.trackLandChartItemClick(5);
        } else if (position != 3) {
            LineDetailChartRecyclerView lineDetailChartRecyclerView = null;
            if (position == 4) {
                if (changeStatus) {
                    LineDetailChartRecyclerView lineDetailChartRecyclerView2 = this.hrLineChartRecyclerView;
                    if (lineDetailChartRecyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                    } else {
                        lineDetailChartRecyclerView = lineDetailChartRecyclerView2;
                    }
                    lineDetailChartRecyclerView.postDelayed(new Runnable() { // from class: opm
                        @Override // java.lang.Runnable
                        public final void run() {
                            SleepLandScapeActivity.onClick$lambda$4(this.f29368a);
                        }
                    }, 0L);
                } else {
                    LineDetailChartRecyclerView lineDetailChartRecyclerView3 = this.hrLineChartRecyclerView;
                    if (lineDetailChartRecyclerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                    } else {
                        lineDetailChartRecyclerView = lineDetailChartRecyclerView3;
                    }
                    lineDetailChartRecyclerView.postDelayed(new Runnable() { // from class: ppm
                        @Override // java.lang.Runnable
                        public final void run() {
                            SleepLandScapeActivity.onClick$lambda$5(this.f30621a);
                        }
                    }, 0L);
                }
                SleepTrackHelper.INSTANCE.trackLandChartItemClick(1);
            } else if (position == 5) {
                if (changeStatus) {
                    LineDetailChartRecyclerView lineDetailChartRecyclerView4 = this.spo2LineChartRecyclerView;
                    if (lineDetailChartRecyclerView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                    } else {
                        lineDetailChartRecyclerView = lineDetailChartRecyclerView4;
                    }
                    lineDetailChartRecyclerView.postDelayed(new Runnable() { // from class: qpm
                        @Override // java.lang.Runnable
                        public final void run() {
                            SleepLandScapeActivity.onClick$lambda$6(this.f31726a);
                        }
                    }, 0L);
                } else {
                    LineDetailChartRecyclerView lineDetailChartRecyclerView5 = this.spo2LineChartRecyclerView;
                    if (lineDetailChartRecyclerView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                    } else {
                        lineDetailChartRecyclerView = lineDetailChartRecyclerView5;
                    }
                    lineDetailChartRecyclerView.postDelayed(new Runnable() { // from class: rpm
                        @Override // java.lang.Runnable
                        public final void run() {
                            SleepLandScapeActivity.onClick$lambda$7(this.f32774a);
                        }
                    }, 0L);
                }
                SleepTrackHelper.INSTANCE.trackLandChartItemClick(2);
            }
        } else {
            this.sleepItemStatus.set(0, Boolean.valueOf(changeStatus));
            SleepTrackHelper.INSTANCE.trackLandChartItemClick(6);
        }
        tim timVar = this.sleepChartItemDecoration;
        if (timVar != null) {
            timVar.setSleepItemStatus(this.sleepItemStatus);
        }
        oim oimVar = this.mSleepChartAdapter;
        if (oimVar != null) {
            oimVar.notifyDataSetChanged();
        }
        Logger.i("THISonClick", String.valueOf(changeStatus));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.sleep.ui.Hilt_SleepLandScapeActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(0);
        initSleepChartView();
        initHeartChartView();
        initSpo2ChartView();
        initChartTitleClick();
        setActionBarDisplayable(false);
        ((zbe) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: tpm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepLandScapeActivity.onCreate$lambda$0(this.f34917a, view);
            }
        });
        Serializable serializableExtra = getIntent().getSerializableExtra(PARAM_SLEEP_REPORT_DATE);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type org.joda.time.LocalDate");
        final LocalDate localDate = (LocalDate) serializableExtra;
        final long longExtra = getIntent().getLongExtra(PARAM_SLEEP_REPORT_DATE_UNIQUE, 0L);
        final int intExtra = getIntent().getIntExtra(PARAM_SLEEP_REPORT_POSITION, 0);
        final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = ((SleepViewModel) getMViewModel()).triggerFetchFitnessReport(ISleepRepository.class, "days", TimeDateUtil.changZeroOfTheDay(localDate), 1, 0, "");
        liveDataTriggerFetchFitnessReport.observe(this, new SleepLandScapeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: upm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepLandScapeActivity.onCreate$lambda$3(localDate, intExtra, this, liveDataTriggerFetchFitnessReport, longExtra, (List) obj);
            }
        }));
    }
}
