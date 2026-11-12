package com.xiaomi.fitness.relative.threetarget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.threetarget.RainbowExKt;
import com.xiaomi.fitness.health.threetarget.model.TargetDetailModel;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView;
import com.xiaomi.fitness.relative.threetarget.TargetChartRFragment;
import com.xiaomi.fitness.relative.threetarget.child.CalorieTargetChildRFragment;
import com.xiaomi.fitness.relative.threetarget.child.MHIntensityTargetChildRFragment;
import com.xiaomi.fitness.relative.threetarget.child.StandTargetChildRFragment;
import com.xiaomi.fitness.relative.threetarget.child.StepTargetChildRFragment;
import com.xiaomi.fitness.relative.threetarget.viewmodel.DataRegularTargetViewModel;
import com.xiaomi.fitness.sport.RecordViewModel;
import defpackage.c0j;
import defpackage.jui;
import defpackage.nha;
import defpackage.y0p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 w2\u00020\u00012\u00020\u0002:\u0001wB\u0007¢\u0006\u0004\bv\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J-\u0010'\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010\u0005J\r\u0010-\u001a\u00020\u0003¢\u0006\u0004\b-\u0010\u0005J\u0017\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u0010\u001bR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010J\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NR$\u0010R\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010J\u001a\u0004\bS\u0010L\"\u0004\bT\u0010NR$\u0010U\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010J\u001a\u0004\bV\u0010L\"\u0004\bW\u0010NR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0016\u0010\\\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010]\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010ZR\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR$\u0010g\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010\fR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00020p\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0011\u0010u\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/TargetChartRFragment;", "Lcom/xiaomi/fitness/relative/threetarget/BaseTargetChartRFragment;", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView$OnWeekBarItemSelectedListener;", "", "initView", "()V", "bindReportRecord", "initData", "bindReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "report", "bindSelectedDateReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)V", "fillRainbowChart", "clearCurrentReportData", "bindWeekReportList", "createWeekReportList", "recentlyReport", "Lorg/joda/time/LocalDate;", "monday", "getRecentReportInner", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;Lorg/joda/time/LocalDate;)V", "showFragments", "showFragmentsAfterRequest", "", "visible", "showStepTargetFragment", "(I)V", "showCalorieTargetFragment", "showMHIntensityTargetFragment", "showStandTargetFragment", "initRecycler", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "setListener", "index", "onWeekItemSelected", "Lnha;", "_binding", "Lnha;", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;", "targetWeekBarView", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;", "getTargetWeekBarView", "()Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;", "setTargetWeekBarView", "(Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;)V", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "threeTargetView", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "getThreeTargetView", "()Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "setThreeTargetView", "(Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBottom", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerBottom", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerBottom", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/widget/FrameLayout;", "stepContainer", "Landroid/widget/FrameLayout;", "getStepContainer", "()Landroid/widget/FrameLayout;", "setStepContainer", "(Landroid/widget/FrameLayout;)V", "calorieContainer", "getCalorieContainer", "setCalorieContainer", "activityContainer", "getActivityContainer", "setActivityContainer", "standContainer", "getStandContainer", "setStandContainer", "", "containsStep", "Z", "containsCalorie", "containsMHIntensity", "containsStand", "Lcom/xiaomi/fitness/relative/threetarget/viewmodel/DataRegularTargetViewModel;", "mRegularTargetViewModel", "Lcom/xiaomi/fitness/relative/threetarget/viewmodel/DataRegularTargetViewModel;", "Lcom/xiaomi/fitness/sport/RecordViewModel;", "recordViewModel", "Lcom/xiaomi/fitness/sport/RecordViewModel;", "", "weekReportMap", "Ljava/util/Map;", "mDailyGoalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getMDailyGoalReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "setMDailyGoalReport", "Ly0p;", "mDetailAdapter", "Ly0p;", "", "Lcom/xiaomi/fitness/health/threetarget/model/TargetDetailModel;", "mDetailList", "Ljava/util/List;", "getBinding", "()Lnha;", "binding", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TargetChartRFragment extends Hilt_TargetChartRFragment implements TargetWeekBarView.OnWeekBarItemSelectedListener {

    @NotNull
    public static final String TAG = "TargetChartFragment";

    @Nullable
    private nha _binding;

    @Nullable
    private FrameLayout activityContainer;
    public FrameLayout calorieContainer;
    private boolean containsCalorie;
    private boolean containsMHIntensity;
    private boolean containsStand;
    private boolean containsStep;

    @Nullable
    private DailyGoalReport mDailyGoalReport;

    @Nullable
    private y0p mDetailAdapter;

    @Nullable
    private List<TargetDetailModel> mDetailList;
    private DataRegularTargetViewModel mRegularTargetViewModel;

    @Nullable
    private RecordViewModel recordViewModel;
    public RecyclerView recyclerBottom;

    @Nullable
    private FrameLayout standContainer;
    public FrameLayout stepContainer;
    public TargetWeekBarView targetWeekBarView;
    public ThreeTargetView threeTargetView;

    @NotNull
    private final Map<LocalDate, DailyGoalReport> weekReportMap = new LinkedHashMap();

    private final void bindReport() {
        DataRegularTargetViewModel dataRegularTargetViewModel = this.mRegularTargetViewModel;
        if (dataRegularTargetViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRegularTargetViewModel");
            dataRegularTargetViewModel = null;
        }
        dataRegularTargetViewModel.getRegularTargetReport().observe(getViewLifecycleOwner(), new TargetChartRFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartRFragment.bindReport$lambda$0(this.f33144a, (DailyGoalReport) obj);
            }
        }));
        LiveData<CloudDataResult<List<DailyBasicReport>>> liveDataGoalReportList = getLiveDataGoalReportList();
        if (liveDataGoalReportList != null) {
            liveDataGoalReportList.observe(getViewLifecycleOwner(), new TargetChartRFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t0p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetChartRFragment.bindReport$lambda$1(this.f34183a, (CloudDataResult) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReport$lambda$0(TargetChartRFragment this$0, DailyGoalReport dailyGoalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isInvalid()) {
            Intrinsics.checkNotNull(dailyGoalReport);
            this$0.bindSelectedDateReport(dailyGoalReport);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReport$lambda$1(TargetChartRFragment this$0, CloudDataResult cloudDataResult) {
        Collection collection;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cloudDataResult == null || (collection = (Collection) cloudDataResult.getData()) == null || collection.isEmpty()) {
            this$0.createWeekReportList();
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            boolean z = false;
            for (DailyBasicReport dailyBasicReport : (List) data) {
                Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport");
                DailyGoalReport dailyGoalReport = (DailyGoalReport) dailyBasicReport;
                LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyGoalReport.getTime());
                Logger.d("TargetChartFragment", "Calendar Model report localDate: " + localDateTimestampToLocalDate);
                DailyGoalReport dailyGoalReport2 = this$0.weekReportMap.get(localDateTimestampToLocalDate);
                if (dailyGoalReport2 == null || dailyGoalReport2 != dailyGoalReport) {
                    this$0.weekReportMap.put(localDateTimestampToLocalDate, dailyGoalReport);
                    z = true;
                }
            }
            if (z) {
                this$0.createWeekReportList();
            }
        }
        return Unit.INSTANCE;
    }

    private final void bindReportRecord() {
        bindReport();
        fillRainbowChart();
    }

    private final void bindSelectedDateReport(DailyGoalReport report) {
        List<GoalItem> listGoalList = report.goalList();
        clearCurrentReportData();
        for (GoalItem goalItem : listGoalList) {
            TargetDetailModel targetDetailModelCreateDetailModel = RainbowExKt.createDetailModel(goalItem);
            List<TargetDetailModel> list = this.mDetailList;
            Intrinsics.checkNotNull(list);
            list.add(targetDetailModelCreateDetailModel);
            if (RainbowExKt.isSTepTarget(goalItem)) {
                this.containsStep = true;
            }
            if (RainbowExKt.isCalorieTarget(goalItem)) {
                this.containsCalorie = true;
            }
            if (RainbowExKt.isMHIntensityTarget(goalItem)) {
                this.containsMHIntensity = true;
            }
            if (RainbowExKt.isStandTarget(goalItem)) {
                this.containsStand = true;
            }
        }
        showFragmentsAfterRequest();
        y0p y0pVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(y0pVar);
        y0pVar.notifyDataSetChanged();
        getThreeTargetView().x(report, true);
    }

    private final void bindWeekReportList() {
        getTargetWeekBarView().bindData(this.weekReportMap, TimeDateUtil.timestampToLocalDate(getStartTime()), this.mSelectDate);
    }

    private final void clearCurrentReportData() {
        List<TargetDetailModel> list = this.mDetailList;
        Intrinsics.checkNotNull(list);
        list.clear();
        this.containsStep = false;
        this.containsCalorie = false;
        this.containsMHIntensity = false;
        this.containsStand = false;
    }

    private final void createWeekReportList() {
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(getStartTime());
        DailyGoalReport dailyGoalReport = this.weekReportMap.get(localDateTimestampToLocalDate);
        if (dailyGoalReport == null) {
            getRecentReportInner(DailyGoalReport.INSTANCE.getRelativeEmptyReport(getStartTime()), localDateTimestampToLocalDate);
            bindWeekReportList();
            return;
        }
        getRecentReportInner(RainbowExKt.copyRecentlyReport(dailyGoalReport, dailyGoalReport), localDateTimestampToLocalDate);
        bindWeekReportList();
        Logger.d("TargetChartFragment", " weekReportMap size:" + this.weekReportMap.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void fillRainbowChart() {
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        ((ThreeTargetRViewModel) getMViewModel()).triggerFetchRelativeFitnessReport(IRainbowRepository.class, "days", TimeDateUtil.changZeroOfTheDay(mSelectDate), 0, 0, getRelativeUid()).observe(getViewLifecycleOwner(), new TargetChartRFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: u0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartRFragment.fillRainbowChart$lambda$2(this.f35262a, (CloudDataResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fillRainbowChart$lambda$2(TargetChartRFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DataRegularTargetViewModel dataRegularTargetViewModel = null;
        if (cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) {
            if (cloudDataResult.isOutSharedData() && (textView = this$0.getBinding().D) != null) {
                textView.setText(this$0.getString(c0j.I4));
            }
            TextView textView2 = this$0.getBinding().D;
            if (textView2 != null) {
                ViewExtKt.setVisible(textView2, true);
            }
            LinearLayout linearLayout = this$0.getBinding().E;
            if (linearLayout != null) {
                ViewExtKt.setVisible(linearLayout, false);
            }
            Logger.d("TargetChartFragment", "get DailyGoalReport empty!");
            DailyGoalReport.Companion companion = DailyGoalReport.INSTANCE;
            LocalDate mSelectDate = this$0.mSelectDate;
            Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
            DailyGoalReport relativeEmptyReport = companion.getRelativeEmptyReport(TimeDateUtil.localDateToTimestamp(mSelectDate));
            this$0.mDailyGoalReport = relativeEmptyReport;
            DataRegularTargetViewModel dataRegularTargetViewModel2 = this$0.mRegularTargetViewModel;
            if (dataRegularTargetViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRegularTargetViewModel");
            } else {
                dataRegularTargetViewModel = dataRegularTargetViewModel2;
            }
            dataRegularTargetViewModel.getRegularTargetReport().postValue(relativeEmptyReport);
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) ((List) data).get(0);
            if (dailyBasicReport instanceof DailyGoalReport) {
                this$0.mDailyGoalReport = (DailyGoalReport) dailyBasicReport;
                DataRegularTargetViewModel dataRegularTargetViewModel3 = this$0.mRegularTargetViewModel;
                if (dataRegularTargetViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRegularTargetViewModel");
                } else {
                    dataRegularTargetViewModel = dataRegularTargetViewModel3;
                }
                dataRegularTargetViewModel.getRegularTargetReport().postValue(dailyBasicReport);
                TextView textView3 = this$0.getBinding().D;
                if (textView3 != null) {
                    ViewExtKt.setVisible(textView3, false);
                }
                LinearLayout linearLayout2 = this$0.getBinding().E;
                if (linearLayout2 != null) {
                    ViewExtKt.setVisible(linearLayout2, true);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void getRecentReportInner(DailyGoalReport recentlyReport, LocalDate monday) {
        for (int i = 0; i < 7; i++) {
            LocalDate localDatePlusDays = monday.plusDays(i);
            Logger.d("TargetChartFragment", " for weekReportMap size:" + this.weekReportMap.size() + " currentDay:" + localDatePlusDays);
            DailyGoalReport dailyGoalReport = this.weekReportMap.get(localDatePlusDays);
            if (dailyGoalReport != null) {
                recentlyReport = RainbowExKt.copyRecentlyReport(dailyGoalReport, dailyGoalReport);
            } else {
                recentlyReport = RainbowExKt.copyRecentlyReport(recentlyReport, recentlyReport);
                Intrinsics.checkNotNull(localDatePlusDays);
                recentlyReport.setTime(TimeDateUtil.localDateToTimestamp(localDatePlusDays));
                this.weekReportMap.put(localDatePlusDays, recentlyReport);
            }
        }
    }

    private final void initData() {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        DataRegularTargetViewModel dataRegularTargetViewModel = (DataRegularTargetViewModel) new ViewModelProvider(mActivity).get(DataRegularTargetViewModel.class);
        this.mRegularTargetViewModel = dataRegularTargetViewModel;
        if (dataRegularTargetViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRegularTargetViewModel");
            dataRegularTargetViewModel = null;
        }
        dataRegularTargetViewModel.setRelativeUid(getRelativeUid());
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        this.recordViewModel = (RecordViewModel) new ViewModelProvider(mActivity2).get(RecordViewModel.class);
    }

    private final void initRecycler() {
        this.mDetailList = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 9);
        getRecyclerBottom().setLayoutManager(gridLayoutManager);
        this.mDetailAdapter = new y0p(getMActivity(), this.mDetailList, jui.A6);
        getRecyclerBottom().setAdapter(this.mDetailAdapter);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.relative.threetarget.TargetChartRFragment.initRecycler.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                y0p y0pVar = TargetChartRFragment.this.mDetailAdapter;
                Intrinsics.checkNotNull(y0pVar);
                return y0pVar.k(position);
            }
        });
    }

    private final void initView() {
        initData();
        initRecycler();
        showFragments();
        setListener();
    }

    private final void showCalorieTargetFragment(int visible) {
        if (getCalorieContainer() == null) {
            return;
        }
        if (visible != 0) {
            getCalorieContainer().setVisibility(8);
            return;
        }
        getCalorieContainer().setVisibility(0);
        CalorieTargetChildRFragment.Companion companion = CalorieTargetChildRFragment.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.switchDetailFragment(childFragmentManager);
    }

    private final void showFragments() {
        showStepTargetFragment(0);
        showCalorieTargetFragment(0);
        showMHIntensityTargetFragment(0);
        showStandTargetFragment(0);
    }

    private final void showFragmentsAfterRequest() {
        showStepTargetFragment(this.containsStep ? 0 : 8);
        showCalorieTargetFragment(this.containsCalorie ? 0 : 8);
        showMHIntensityTargetFragment(this.containsMHIntensity ? 0 : 8);
        showStandTargetFragment(this.containsStand ? 0 : 8);
    }

    private final void showMHIntensityTargetFragment(int visible) {
        FrameLayout frameLayout = this.activityContainer;
        if (frameLayout == null) {
            return;
        }
        if (visible != 0) {
            Intrinsics.checkNotNull(frameLayout);
            frameLayout.setVisibility(8);
            return;
        }
        Intrinsics.checkNotNull(frameLayout);
        frameLayout.setVisibility(0);
        MHIntensityTargetChildRFragment.Companion companion = MHIntensityTargetChildRFragment.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.switchDetailFragment(childFragmentManager);
    }

    private final void showStandTargetFragment(int visible) {
        FrameLayout frameLayout = this.standContainer;
        if (frameLayout == null) {
            return;
        }
        if (visible != 0) {
            Intrinsics.checkNotNull(frameLayout);
            frameLayout.setVisibility(8);
            return;
        }
        Intrinsics.checkNotNull(frameLayout);
        frameLayout.setVisibility(0);
        StandTargetChildRFragment.Companion companion = StandTargetChildRFragment.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.switchDetailFragment(childFragmentManager);
    }

    private final void showStepTargetFragment(int visible) {
        if (getStepContainer() == null) {
            return;
        }
        if (visible != 0) {
            getStepContainer().setVisibility(8);
            return;
        }
        getStepContainer().setVisibility(0);
        StepTargetChildRFragment.Companion companion = StepTargetChildRFragment.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.switchDetailFragment(childFragmentManager);
    }

    @Nullable
    public final FrameLayout getActivityContainer() {
        return this.activityContainer;
    }

    @NotNull
    public final nha getBinding() {
        nha nhaVar = this._binding;
        Intrinsics.checkNotNull(nhaVar);
        return nhaVar;
    }

    @NotNull
    public final FrameLayout getCalorieContainer() {
        FrameLayout frameLayout = this.calorieContainer;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("calorieContainer");
        return null;
    }

    @Nullable
    public final DailyGoalReport getMDailyGoalReport() {
        return this.mDailyGoalReport;
    }

    @NotNull
    public final RecyclerView getRecyclerBottom() {
        RecyclerView recyclerView = this.recyclerBottom;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerBottom");
        return null;
    }

    @Nullable
    public final FrameLayout getStandContainer() {
        return this.standContainer;
    }

    @NotNull
    public final FrameLayout getStepContainer() {
        FrameLayout frameLayout = this.stepContainer;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stepContainer");
        return null;
    }

    @NotNull
    public final TargetWeekBarView getTargetWeekBarView() {
        TargetWeekBarView targetWeekBarView = this.targetWeekBarView;
        if (targetWeekBarView != null) {
            return targetWeekBarView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetWeekBarView");
        return null;
    }

    @NotNull
    public final ThreeTargetView getThreeTargetView() {
        ThreeTargetView threeTargetView = this.threeTargetView;
        if (threeTargetView != null) {
            return threeTargetView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("threeTargetView");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = nha.A0(inflater, container, false);
        setTargetWeekBarView(getBinding().I);
        setThreeTargetView(getBinding().J);
        setRecyclerBottom(getBinding().F);
        setStepContainer(getBinding().H);
        setCalorieContainer(getBinding().C);
        this.activityContainer = getBinding().A;
        this.standContainer = getBinding().G;
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.relative.threetarget.BaseTargetChartRFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        bindReportRecord();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        getBundle();
        initView();
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView.OnWeekBarItemSelectedListener
    public void onWeekItemSelected(int index) {
        LocalDate localDatePlusDays = TimeDateUtil.getWeekMonday(this.mSelectDate).plusDays(index);
        Intrinsics.checkNotNull(localDatePlusDays);
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        if (TimeDateUtil.isSameLocalDate(localDatePlusDays, mSelectDate) || TimeDateUtil.isFuture(localDatePlusDays)) {
            return;
        }
        this.mSelectDate = localDatePlusDays;
        fillRainbowChart();
        bindReportRecord();
        bindWeekReportList();
        DataRegularTargetViewModel dataRegularTargetViewModel = this.mRegularTargetViewModel;
        if (dataRegularTargetViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRegularTargetViewModel");
            dataRegularTargetViewModel = null;
        }
        dataRegularTargetViewModel.getCurrentSelectedDate().postValue(localDatePlusDays);
    }

    public final void setActivityContainer(@Nullable FrameLayout frameLayout) {
        this.activityContainer = frameLayout;
    }

    public final void setCalorieContainer(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.calorieContainer = frameLayout;
    }

    public final void setListener() {
        getTargetWeekBarView().setOnItemSelectedListener(this);
    }

    public final void setMDailyGoalReport(@Nullable DailyGoalReport dailyGoalReport) {
        this.mDailyGoalReport = dailyGoalReport;
    }

    public final void setRecyclerBottom(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerBottom = recyclerView;
    }

    public final void setStandContainer(@Nullable FrameLayout frameLayout) {
        this.standContainer = frameLayout;
    }

    public final void setStepContainer(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.stepContainer = frameLayout;
    }

    public final void setTargetWeekBarView(@NotNull TargetWeekBarView targetWeekBarView) {
        Intrinsics.checkNotNullParameter(targetWeekBarView, "<set-?>");
        this.targetWeekBarView = targetWeekBarView;
    }

    public final void setThreeTargetView(@NotNull ThreeTargetView threeTargetView) {
        Intrinsics.checkNotNullParameter(threeTargetView, "<set-?>");
        this.threeTargetView = threeTargetView;
    }
}
