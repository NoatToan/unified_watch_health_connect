package com.xiaomi.fitness.health.threetarget;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.base.BaseDataFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.threetarget.BaseTargetChartFragment;
import com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel;
import defpackage.gmf;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bQ\u0010\u000fJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0019\u0010\u000fR\"\u0010\u001b\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010\u000b\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\rR\"\u0010\u0006\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010&\"\u0004\b)\u0010\rR\"\u0010*\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R4\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a05048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R0\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=\u0018\u00010<8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010\u0014¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/BaseTargetChartFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "Lcom/xiaomi/fitness/health/threetarget/ThreeTargetViewModel;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "", "beginTime", "endTime", "", "triggerFetchRainbowReportList", "(JJ)V", "triggerWeekBarRainbowReportList", "startTime", "requestLastWeekSummary", "(J)V", "onVisible", "()V", LifecycleConstantKt.ON_RESUME, "Lorg/joda/time/LocalDate;", "selectDate", "getDataOnSelectDate", "(Lorg/joda/time/LocalDate;)V", "getWeekBarDataOnSelectDate", "clearLastSelectedWeekData", "displayData", "scrollToCurrentCycle", "getBundle", "", "sportDataType", "I", "getSportDataType", "()I", "setSportDataType", "(I)V", "", "mDid", "Ljava/lang/String;", "J", "getStartTime", "()J", "setStartTime", "getEndTime", "setEndTime", "xAxisPosition", "getXAxisPosition", "setXAxisPosition", "Landroidx/viewpager2/widget/ViewPager2;", "mViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getMViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setMViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Lgmf;", "Lkotlin/Pair;", "liveDataLastWeekSummary", "Lgmf;", "getLiveDataLastWeekSummary", "()Lgmf;", "setLiveDataLastWeekSummary", "(Lgmf;)V", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "liveDataGoalReportList", "Landroidx/lifecycle/LiveData;", "getLiveDataGoalReportList", "()Landroidx/lifecycle/LiveData;", "setLiveDataGoalReportList", "(Landroidx/lifecycle/LiveData;)V", "Lcom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel;", "mRegularTargetViewModel", "Lcom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel;", "getMRegularTargetViewModel", "()Lcom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel;", "setMRegularTargetViewModel", "(Lcom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel;)V", "mTodayLocalDate", "Lorg/joda/time/LocalDate;", "getMTodayLocalDate", "()Lorg/joda/time/LocalDate;", "setMTodayLocalDate", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BaseTargetChartFragment extends BaseDataFragment<ThreeTargetViewModel, RecyclerBarEntry> {
    private long endTime;

    @Nullable
    private LiveData<List<DailyGoalReport>> liveDataGoalReportList;

    @NotNull
    private gmf<Pair<Integer, Integer>> liveDataLastWeekSummary = new gmf<>();

    @Nullable
    private String mDid;
    public DataRegularTargetViewModel mRegularTargetViewModel;

    @NotNull
    private LocalDate mTodayLocalDate;

    @Nullable
    private ViewPager2 mViewPager;
    private int sportDataType;
    private long startTime;
    private int xAxisPosition;

    public BaseTargetChartFragment() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.mTodayLocalDate = localDateNow;
    }

    private final void requestLastWeekSummary(long startTime) {
        ((ThreeTargetViewModel) this.basicDataViewModel).requestWeekReportSummary(startTime - 604800, this.liveDataLastWeekSummary);
    }

    private final void triggerFetchRainbowReportList(long beginTime, long endTime) {
        ((ThreeTargetViewModel) this.basicDataViewModel).triggerFetchRainbowReportList(beginTime, endTime).observe(getViewLifecycleOwner(), new BaseTargetChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: le2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseTargetChartFragment.triggerFetchRainbowReportList$lambda$0(this.f24961a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerFetchRainbowReportList$lambda$0(BaseTargetChartFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMRegularTargetViewModel().getMWeekMapDataList().postValue(list);
        return Unit.INSTANCE;
    }

    private final void triggerWeekBarRainbowReportList(long beginTime, long endTime) {
        this.liveDataGoalReportList = ((ThreeTargetViewModel) this.basicDataViewModel).triggerFetchRainbowReportList(beginTime, endTime);
    }

    public void clearLastSelectedWeekData() {
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void displayData() {
    }

    public final void getBundle() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
        } else {
            this.mSelectDate = (LocalDate) arguments.getSerializable("local_date");
            this.sportDataType = arguments.getInt("sport_type", 12);
            this.mDid = arguments.getString("did");
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
            setArguments(null);
        }
    }

    public final void getDataOnSelectDate(@NotNull LocalDate selectDate) {
        Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(selectDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(weekMonday);
        if (jChangZeroOfTheDay == this.startTime) {
            Logger.i(BaseFragment.TAG, " TargetChartFragment same week has request");
            return;
        }
        Logger.i(BaseFragment.TAG, "TargetChartFragment week:" + selectDate);
        clearLastSelectedWeekData();
        this.startTime = jChangZeroOfTheDay;
        LocalDate localDatePlusDays = weekMonday.plusDays(7);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        this.endTime = jChangZeroOfTheDay2;
        triggerFetchRainbowReportList(this.startTime, jChangZeroOfTheDay2);
        requestLastWeekSummary(this.startTime);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final LiveData<List<DailyGoalReport>> getLiveDataGoalReportList() {
        return this.liveDataGoalReportList;
    }

    @NotNull
    public final gmf<Pair<Integer, Integer>> getLiveDataLastWeekSummary() {
        return this.liveDataLastWeekSummary;
    }

    @NotNull
    public final DataRegularTargetViewModel getMRegularTargetViewModel() {
        DataRegularTargetViewModel dataRegularTargetViewModel = this.mRegularTargetViewModel;
        if (dataRegularTargetViewModel != null) {
            return dataRegularTargetViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRegularTargetViewModel");
        return null;
    }

    @NotNull
    public final LocalDate getMTodayLocalDate() {
        return this.mTodayLocalDate;
    }

    @Nullable
    public final ViewPager2 getMViewPager() {
        return this.mViewPager;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void getWeekBarDataOnSelectDate(@NotNull LocalDate selectDate) {
        Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(selectDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(weekMonday);
        if (jChangZeroOfTheDay == this.startTime) {
            Logger.i(BaseFragment.TAG, " TargetChartFragment same week has request");
            return;
        }
        Logger.i(BaseFragment.TAG, "TargetChartFragment week:" + selectDate);
        clearLastSelectedWeekData();
        this.startTime = jChangZeroOfTheDay;
        LocalDate localDatePlusDays = weekMonday.plusDays(7);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        this.endTime = jChangZeroOfTheDay2;
        triggerWeekBarRainbowReportList(this.startTime, jChangZeroOfTheDay2);
    }

    public final int getXAxisPosition() {
        return this.xAxisPosition;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        setStatusBarFontBlack(true);
        getBundle();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        getBundle();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void scrollToCurrentCycle() {
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLiveDataGoalReportList(@Nullable LiveData<List<DailyGoalReport>> liveData) {
        this.liveDataGoalReportList = liveData;
    }

    public final void setLiveDataLastWeekSummary(@NotNull gmf<Pair<Integer, Integer>> gmfVar) {
        Intrinsics.checkNotNullParameter(gmfVar, "<set-?>");
        this.liveDataLastWeekSummary = gmfVar;
    }

    public final void setMRegularTargetViewModel(@NotNull DataRegularTargetViewModel dataRegularTargetViewModel) {
        Intrinsics.checkNotNullParameter(dataRegularTargetViewModel, "<set-?>");
        this.mRegularTargetViewModel = dataRegularTargetViewModel;
    }

    public final void setMTodayLocalDate(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<set-?>");
        this.mTodayLocalDate = localDate;
    }

    public final void setMViewPager(@Nullable ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setXAxisPosition(int i) {
        this.xAxisPosition = i;
    }
}
