package com.xiaomi.fitness.relative.threetarget;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.entity.UIConfig;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.base.BaseDataFragment;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00107\u001a\u000208H\u0014J\b\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0004J\u0010\u0010=\u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0004J\u0018\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0007H\u0004J\u0010\u0010A\u001a\u0002082\u0006\u0010\u0018\u001a\u00020\u0013H\u0004J\b\u0010B\u001a\u000208H\u0014J\b\u0010C\u001a\u000208H\u0016J\b\u0010G\u001a\u000208H\u0004R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR.\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#\u0018\u00010\"X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R(\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020+\u0018\u00010/X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R\u0014\u0010D\u001a\u0002088DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/BaseTargetChartRFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "Lcom/xiaomi/fitness/relative/threetarget/ThreeTargetRViewModel;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "<init>", "()V", "sportDataType", "", "getSportDataType", "()I", "setSportDataType", "(I)V", "mDid", "", "getMDid", "()Ljava/lang/String;", "setMDid", "(Ljava/lang/String;)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", UIConfig.KEY_CURRENT_TIME, "getCurrentTime", "setCurrentTime", "xAxisPosition", "getXAxisPosition", "setXAxisPosition", "liveDataGoalReportList", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "getLiveDataGoalReportList", "()Landroidx/lifecycle/LiveData;", "setLiveDataGoalReportList", "(Landroidx/lifecycle/LiveData;)V", "liveDataRecentlyReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getLiveDataRecentlyReport", "setLiveDataRecentlyReport", "mReportMap", "", "getMReportMap", "()Ljava/util/Map;", "setMReportMap", "(Ljava/util/Map;)V", "relativeUid", "getRelativeUid", "setRelativeUid", "onVisible", "", LifecycleConstantKt.ON_RESUME, "getDataOnSelectDate", "monday", "Lorg/joda/time/LocalDate;", "getFitnessData", "triggerFetchRainbowReportList", "leftOffset", "rightOffset", "triggerFetchRainbowReport", "displayData", "scrollToCurrentCycle", SdkContants.KEY_BUNDLE, "getBundle", "()Lkotlin/Unit;", "cleanDataList", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseTargetChartRFragment extends BaseDataFragment<ThreeTargetRViewModel, RecyclerBarEntry> {
    private long currentTime;
    private long endTime;

    @Nullable
    private LiveData<CloudDataResult<List<DailyBasicReport>>> liveDataGoalReportList;

    @Nullable
    private LiveData<DailyGoalReport> liveDataRecentlyReport;

    @Nullable
    private String mDid;

    @Nullable
    private Map<Long, DailyGoalReport> mReportMap = new HashMap();
    private long relativeUid = -1;
    private int sportDataType;
    private long startTime;
    private int xAxisPosition;

    public final void cleanDataList() {
        Map<Long, DailyGoalReport> map = this.mReportMap;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            map.clear();
        }
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void displayData() {
    }

    @NotNull
    public final Unit getBundle() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mSelectDate = (LocalDate) arguments.getSerializable("local_date");
            this.sportDataType = arguments.getInt("sport_type", 12);
            this.mDid = arguments.getString("did");
            this.relativeUid = arguments.getLong("key_relative_uid", -1L);
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
        } else {
            this.mSelectDate = LocalDate.now();
        }
        return Unit.INSTANCE;
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    public final void getDataOnSelectDate(@NotNull LocalDate monday) {
        Intrinsics.checkNotNullParameter(monday, "monday");
        cleanDataList();
        getFitnessData(monday);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void getFitnessData(@NotNull LocalDate monday) {
        Intrinsics.checkNotNullParameter(monday, "monday");
        this.startTime = TimeDateUtil.changZeroOfTheDay(monday);
        LocalDate localDatePlusDays = monday.plusDays(7);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        this.endTime = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int dayOfWeek = new LocalDate(this.currentTime * ((long) 1000)).getDayOfWeek();
        triggerFetchRainbowReportList(dayOfWeek, 6 - dayOfWeek);
    }

    @Nullable
    public final LiveData<CloudDataResult<List<DailyBasicReport>>> getLiveDataGoalReportList() {
        return this.liveDataGoalReportList;
    }

    @Nullable
    public final LiveData<DailyGoalReport> getLiveDataRecentlyReport() {
        return this.liveDataRecentlyReport;
    }

    @Nullable
    public final String getMDid() {
        return this.mDid;
    }

    @Nullable
    public final Map<Long, DailyGoalReport> getMReportMap() {
        return this.mReportMap;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    public final long getStartTime() {
        return this.startTime;
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
        LocalDate localDate = this.mCurrentDate;
        if (localDate == null) {
            localDate = this.mSelectDate;
        }
        Intrinsics.checkNotNull(localDate);
        this.currentTime = TimeDateUtil.changZeroOfTheDay(localDate);
        getDataOnSelectDate(TimeDateUtil.getWeekMonday(localDate));
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void scrollToCurrentCycle() {
    }

    public final void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLiveDataGoalReportList(@Nullable LiveData<CloudDataResult<List<DailyBasicReport>>> liveData) {
        this.liveDataGoalReportList = liveData;
    }

    public final void setLiveDataRecentlyReport(@Nullable LiveData<DailyGoalReport> liveData) {
        this.liveDataRecentlyReport = liveData;
    }

    public final void setMDid(@Nullable String str) {
        this.mDid = str;
    }

    public final void setMReportMap(@Nullable Map<Long, DailyGoalReport> map) {
        this.mReportMap = map;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
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

    public final void triggerFetchRainbowReport(long endTime) {
        M m = this.basicDataViewModel;
        Intrinsics.checkNotNull(m);
        this.liveDataRecentlyReport = ((ThreeTargetRViewModel) m).reqRecentRegularReport(endTime, this.relativeUid);
    }

    public final void triggerFetchRainbowReportList(int leftOffset, int rightOffset) {
        LiveData<CloudDataResult<List<DailyBasicReport>>> liveData = this.liveDataGoalReportList;
        if (liveData != null) {
            Intrinsics.checkNotNull(liveData);
            liveData.removeObservers(getViewLifecycleOwner());
        }
        M m = this.basicDataViewModel;
        Intrinsics.checkNotNull(m);
        this.liveDataGoalReportList = ((ThreeTargetRViewModel) m).triggerFetchRainbowReportList(this.currentTime, leftOffset, rightOffset, this.relativeUid);
    }
}
