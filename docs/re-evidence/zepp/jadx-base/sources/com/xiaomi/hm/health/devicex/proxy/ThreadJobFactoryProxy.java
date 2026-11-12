package com.xiaomi.hm.health.devicex.proxy;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesDaySportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.devicex.proxy.def.DefaultThreadJob;
import com.xiaomi.hm.health.jobcenter.job.HMCompareModelInjectJob;
import com.xiaomi.hm.health.jobcenter.job.HMDataAnalisisJob;
import com.xiaomi.hm.health.jobcenter.job.HMSportDataPostToServerJob;
import com.xiaomi.hm.health.jobcenter.job.HMSummeryDataInitAnalisisJob;
import com.xiaomi.hm.health.jobcenter.job.HMThirdPartyDataProcessJob;
import com.xiaomi.hm.health.jobcenter.job.HMTotalDataAnalisisJob;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudDataAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudSummaryDataInitAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudSummaryDataUpdateAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmMixSummaryAnalysisJob;
import com.xiaomi.hm.health.jobcenter.job.HmMixSummarySwitchJob;
import com.xiaomi.hm.health.jobcenter.job.HmSleepSelectInitJob;
import com.xiaomi.hm.health.model.summery.DeviceDataSelectInfo;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u0012\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J0\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0015j\b\u0012\u0004\u0012\u00020\u0006`\u00162\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J&\u0010\u0019\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\\\u0010#\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0016JV\u0010#\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u0006\u0010%\u001a\u00020$H\u0016J2\u0010&\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eH\u0016J2\u0010'\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eH\u0016J,\u0010-\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u000e2\u0006\u0010,\u001a\u00020+H\u0016¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/ThreadJobFactoryProxy;", "Lcom/xiaomi/hm/health/devicex/proxy/ThreadJobFactory;", "", "name", "Lcom/xiaomi/hm/health/devicex/proxy/ThreadJob;", "createThreadJobByName", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "dsd", "", "type", "deviceTypeValue", "createHMDataAnalisisJob", "Lcom/xiaomi/hm/health/dataprocess/ShoesDaySportData;", "createHMShoesDataAnalisisJob", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/hm/health/model/summery/HMSummery;", "data", "workType", "createHMSummeryDataInitAnalisisJob", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createHMThirdPartyDataProcessJob", "createHmEarbudDataAnalysisJob", "createHmEarbudSummaryDataInitAnalysisJob", "mEarbudSummeryArrayList", "mBandDaySummeryArrayList", "mDaySummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMWeekSummery;", "mWeekSummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMMonthSummery;", "mMonthSummeryArrayList", "", "dsdList", "createHmEarbudSummaryDataUpdateAnalysisJob", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "dad", "createHmMixSummaryAnalysisJob", "createHmMixSummarySwitchJob", "Lcom/xiaomi/hm/health/model/summery/DeviceDataSelectInfo;", "sleepInfos", "selectDays", "", "isEarbud", "createHmSleepSelectInitJob", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ThreadJobFactoryProxy implements ThreadJobFactory {
    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHMDataAnalisisJob(@NotNull DaySportData dsd, int type, int deviceTypeValue) {
        return new HMDataAnalisisJob(dsd, type, deviceTypeValue);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHMShoesDataAnalisisJob(@NotNull ShoesDaySportData dsd, int type) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHMSummeryDataInitAnalisisJob(@NotNull CopyOnWriteArrayList<HMSummery> data, int type, int workType) {
        return new HMSummeryDataInitAnalisisJob(data, type, workType);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHMThirdPartyDataProcessJob(@NotNull Context context, @NotNull ArrayList<DaySportData> data, int type) {
        return new HMThirdPartyDataProcessJob(context, data, type);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHmEarbudDataAnalysisJob(@NotNull DaySportData dsd, int type, int deviceTypeValue) {
        return new HmEarbudDataAnalysisJob(dsd, type, deviceTypeValue);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHmEarbudSummaryDataInitAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> data, int type, int workType) {
        return new HmEarbudSummaryDataInitAnalysisJob(data, type, workType);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHmEarbudSummaryDataUpdateAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> mEarbudSummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mBandDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList, @NotNull List<? extends DaySportData> dsdList) {
        return new HmEarbudSummaryDataUpdateAnalysisJob(mEarbudSummeryArrayList, mBandDaySummeryArrayList, mDaySummeryArrayList, mWeekSummeryArrayList, mMonthSummeryArrayList, dsdList);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHmMixSummaryAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList) {
        return new HmMixSummaryAnalysisJob(mDaySummeryArrayList, mWeekSummeryArrayList, mMonthSummeryArrayList, 4);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHmMixSummarySwitchJob(@NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList) {
        return new HmMixSummarySwitchJob(mDaySummeryArrayList, mWeekSummeryArrayList, mMonthSummeryArrayList);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHmSleepSelectInitJob(@NotNull CopyOnWriteArrayList<DeviceDataSelectInfo> sleepInfos, @NotNull CopyOnWriteArrayList<DeviceDataSelectInfo> selectDays, boolean isEarbud) {
        return new HmSleepSelectInitJob(sleepInfos, selectDays, isEarbud);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createThreadJobByName(@NotNull String name) {
        int iHashCode = name.hashCode();
        if (iHashCode != -1000470653) {
            if (iHashCode != 1305484776) {
                if (iHashCode == 1354101126 && name.equals("HMSportDataPostToServerJob")) {
                    return new HMSportDataPostToServerJob();
                }
            } else if (name.equals("HMTotalDataAnalisisJob")) {
                return new HMTotalDataAnalisisJob();
            }
        } else if (name.equals("HMCompareModelInjectJob")) {
            return new HMCompareModelInjectJob();
        }
        return new DefaultThreadJob();
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJobFactory
    @NotNull
    public ThreadJob createHmEarbudSummaryDataUpdateAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> mEarbudSummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mBandDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList, @NotNull CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList, @NotNull SportDay dad) {
        return new HmEarbudSummaryDataUpdateAnalysisJob(mEarbudSummeryArrayList, mBandDaySummeryArrayList, mDaySummeryArrayList, mWeekSummeryArrayList, mMonthSummeryArrayList, dad);
    }
}
