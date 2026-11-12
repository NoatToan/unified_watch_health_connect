package com.xiaomi.hm.health.devicex.proxy;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesDaySportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.model.summery.DeviceDataSelectInfo;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&J&\u0010\u0012\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH&J0\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0015j\b\u0012\u0004\u0012\u00020\u0006`\u00162\u0006\u0010\t\u001a\u00020\bH&J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J&\u0010\u0019\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH&J\\\u0010#\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!H&JV\u0010#\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u0006\u0010%\u001a\u00020$H&J2\u0010&\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eH&J2\u0010'\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eH&J,\u0010-\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u000e2\u0006\u0010,\u001a\u00020+H&¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/ThreadJobFactory;", "", "", "name", "Lcom/xiaomi/hm/health/devicex/proxy/ThreadJob;", "createThreadJobByName", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "dsd", "", "type", "deviceTypeValue", "createHMDataAnalisisJob", "Lcom/xiaomi/hm/health/dataprocess/ShoesDaySportData;", "createHMShoesDataAnalisisJob", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/hm/health/model/summery/HMSummery;", "data", "workType", "createHMSummeryDataInitAnalisisJob", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createHMThirdPartyDataProcessJob", "createHmEarbudDataAnalysisJob", "createHmEarbudSummaryDataInitAnalysisJob", "mEarbudSummeryArrayList", "mBandDaySummeryArrayList", "mDaySummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMWeekSummery;", "mWeekSummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMMonthSummery;", "mMonthSummeryArrayList", "", "dsdList", "createHmEarbudSummaryDataUpdateAnalysisJob", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "dad", "createHmMixSummaryAnalysisJob", "createHmMixSummarySwitchJob", "Lcom/xiaomi/hm/health/model/summery/DeviceDataSelectInfo;", "sleepInfos", "selectDays", "", "isEarbud", "createHmSleepSelectInitJob", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ThreadJobFactory {
    @NotNull
    ThreadJob createHMDataAnalisisJob(@NotNull DaySportData dsd, int type, int deviceTypeValue);

    @NotNull
    ThreadJob createHMShoesDataAnalisisJob(@NotNull ShoesDaySportData dsd, int type);

    @NotNull
    ThreadJob createHMSummeryDataInitAnalisisJob(@NotNull CopyOnWriteArrayList<HMSummery> data, int type, int workType);

    @NotNull
    ThreadJob createHMThirdPartyDataProcessJob(@NotNull Context context, @NotNull ArrayList<DaySportData> data, int type);

    @NotNull
    ThreadJob createHmEarbudDataAnalysisJob(@NotNull DaySportData dsd, int type, int deviceTypeValue);

    @NotNull
    ThreadJob createHmEarbudSummaryDataInitAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> data, int type, int workType);

    @NotNull
    ThreadJob createHmEarbudSummaryDataUpdateAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> mEarbudSummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mBandDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList, @NotNull SportDay dad);

    @NotNull
    ThreadJob createHmEarbudSummaryDataUpdateAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> mEarbudSummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mBandDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList, @NotNull List<? extends DaySportData> dsdList);

    @NotNull
    ThreadJob createHmMixSummaryAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList);

    @NotNull
    ThreadJob createHmMixSummarySwitchJob(@NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList);

    @NotNull
    ThreadJob createHmSleepSelectInitJob(@NotNull CopyOnWriteArrayList<DeviceDataSelectInfo> sleepInfos, @NotNull CopyOnWriteArrayList<DeviceDataSelectInfo> selectDays, boolean isEarbud);

    @NotNull
    ThreadJob createThreadJobByName(@NotNull String name);
}
