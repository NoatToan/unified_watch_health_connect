package com.xiaomi.fitness.aggregation.health.updater;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.IRainbowSourceData;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.aggregation.health.dao.RainbowDaoProxy;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J>\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J2\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0002J \u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/updater/RainbowUpdaterProcessor;", "", "<init>", "()V", "TAG", "", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "DAY_ONE", "", "startUpdateRainbow", "", "startTime", "endTime", "goalType", "", "reportList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/IRainbowSourceData;", "updateRainbowReport", "today", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "updateTodayGoalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "time", "curType", "curValue", "goalReport", "insertTodayReportIfNeed", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRainbowUpdaterProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RainbowUpdaterProcessor.kt\ncom/xiaomi/fitness/aggregation/health/updater/RainbowUpdaterProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,212:1\n1863#2,2:213\n216#3,2:215\n*S KotlinDebug\n*F\n+ 1 RainbowUpdaterProcessor.kt\ncom/xiaomi/fitness/aggregation/health/updater/RainbowUpdaterProcessor\n*L\n61#1:213,2\n165#1:215,2\n*E\n"})
public final class RainbowUpdaterProcessor {

    @NotNull
    private final String TAG = "Summary_Updater_rainbow";

    @NotNull
    private final UserInfoManager userInfoMgr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
    private final long DAY_ONE = TimeUnit.DAYS.toSeconds(1);

    private final void insertTodayReportIfNeed(long today, int goalType, UserProfile userProfile) {
        Map<Integer, Integer> rainbowItemGoalMap = UserProfileExtKt.getRainbowItemGoalMap(userProfile);
        if (rainbowItemGoalMap.containsKey(Integer.valueOf(goalType))) {
            for (DailyGoalReport dailyGoalReport : RainbowDaoProxy.INSTANCE.queryRainbowListTimeInZero(today, this.DAY_ONE + today)) {
                if (dailyGoalReport.getTime() == today) {
                    RainbowDaoProxy.INSTANCE.insertRainbows(updateTodayGoalReport(today, goalType, dailyGoalReport.getAchieved(goalType), userProfile, dailyGoalReport), true);
                    return;
                }
            }
            RainbowDaoProxy rainbowDaoProxy = RainbowDaoProxy.INSTANCE;
            DailyGoalReport dailyGoalReportQueryLatestRainbowBeforeInZero = rainbowDaoProxy.queryLatestRainbowBeforeInZero(today);
            FitnessLogUtils.d(this.TAG, "[before today report] = " + dailyGoalReportQueryLatestRainbowBeforeInZero);
            DailyGoalReport emptyReport = DailyGoalReport.INSTANCE.getEmptyReport(today, rainbowItemGoalMap);
            if (dailyGoalReportQueryLatestRainbowBeforeInZero != null) {
                if (rainbowItemGoalMap.equals(dailyGoalReportQueryLatestRainbowBeforeInZero.getItemTypeAndGoal())) {
                    return;
                }
                FitnessLogUtils.d(this.TAG, "[insertRainbows] oldGoalValue != newGoalValue, make a new");
                RainbowDaoProxy.insertRainbows$default(rainbowDaoProxy, emptyReport, false, 2, null);
                return;
            }
            FitnessLogUtils.i(this.TAG, "【insertRainbows make a new one】 " + emptyReport);
            RainbowDaoProxy.insertRainbows$default(rainbowDaoProxy, emptyReport, false, 2, null);
        }
    }

    private final void updateRainbowReport(long today, long startTime, long endTime, UserProfile userProfile, int goalType, List<? extends IRainbowSourceData> reportList) {
        long j = 1000;
        FitnessLogUtils.d(this.TAG, "updateRainbowReport: goalType = " + goalType + "，today = " + today + ", userTarget = " + UserProfileExtKt.getRainbowItemGoalMap(userProfile) + ", start = " + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(startTime * j)) + ",end = " + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(j * endTime)));
        String str = this.TAG;
        int size = reportList.size();
        StringBuilder sb = new StringBuilder();
        sb.append("reportList size=");
        sb.append(size);
        sb.append(",[");
        sb.append(startTime);
        sb.append(", ");
        sb.append(endTime);
        sb.append("]");
        FitnessLogUtils.i(str, sb.toString());
        for (IRainbowSourceData iRainbowSourceData : reportList) {
            FitnessLogUtils.d(this.TAG, "startUpdateRainbow: report = " + iRainbowSourceData.simpleInfo());
        }
        RainbowDaoProxy rainbowDaoProxy = RainbowDaoProxy.INSTANCE;
        long j2 = this.DAY_ONE;
        long j3 = 3;
        List<DailyGoalReport> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) rainbowDaoProxy.queryRainbowListTimeInZero(startTime - (j2 * j3), endTime + (j2 * j3)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyGoalReport dailyGoalReport : mutableList) {
            linkedHashMap.put(Long.valueOf(dailyGoalReport.getTime()), dailyGoalReport);
        }
        mutableList.clear();
        for (IRainbowSourceData iRainbowSourceData2 : reportList) {
            if (iRainbowSourceData2.isValidate()) {
                long timeStamp = iRainbowSourceData2.getTimeStamp();
                int sourceData = iRainbowSourceData2.getSourceData();
                if (timeStamp == today) {
                    List<Integer> rainbowItemTypes = UserProfileExtKt.getRainbowItemTypes(userProfile);
                    if (!rainbowItemTypes.contains(Integer.valueOf(goalType))) {
                        FitnessLogUtils.i(this.TAG, "User not select " + goalType + ",not in " + rainbowItemTypes + ", ignore");
                        return;
                    }
                    DailyGoalReport dailyGoalReport2 = (DailyGoalReport) linkedHashMap.get(Long.valueOf(timeStamp));
                    if (dailyGoalReport2 == null || sourceData != dailyGoalReport2.getAchieved(goalType)) {
                        DailyGoalReport dailyGoalReportUpdateTodayGoalReport = updateTodayGoalReport(timeStamp, goalType, sourceData, userProfile, (DailyGoalReport) linkedHashMap.get(Long.valueOf(timeStamp)));
                        FitnessLogUtils.i(this.TAG, "【insertRainbows isToday】 " + dailyGoalReportUpdateTodayGoalReport);
                        RainbowDaoProxy.insertRainbows$default(RainbowDaoProxy.INSTANCE, dailyGoalReportUpdateTodayGoalReport, false, 2, null);
                    } else {
                        FitnessLogUtils.i(this.TAG, "equal value(" + goalType + ")-" + sourceData + ", today not update");
                    }
                } else {
                    DailyGoalReport dailyGoalReport3 = (DailyGoalReport) linkedHashMap.get(Long.valueOf(timeStamp));
                    FitnessLogUtils.d(this.TAG, "time = " + timeStamp + ",【old report】= " + dailyGoalReport3);
                    if (dailyGoalReport3 == null) {
                        RainbowDaoProxy rainbowDaoProxy2 = RainbowDaoProxy.INSTANCE;
                        DailyGoalReport dailyGoalReportQueryLatestRainbowBeforeInZero = rainbowDaoProxy2.queryLatestRainbowBeforeInZero(timeStamp);
                        FitnessLogUtils.d(this.TAG, "[nearlyReport] = " + dailyGoalReportQueryLatestRainbowBeforeInZero);
                        if (dailyGoalReportQueryLatestRainbowBeforeInZero == null) {
                            DailyGoalReport dailyGoalReportUpdateTodayGoalReport2 = updateTodayGoalReport(timeStamp, goalType, sourceData, userProfile, (DailyGoalReport) linkedHashMap.get(Long.valueOf(timeStamp)));
                            FitnessLogUtils.d(this.TAG, "【insertRainbows init report】 " + dailyGoalReportUpdateTodayGoalReport2);
                            RainbowDaoProxy.insertRainbows$default(rainbowDaoProxy2, dailyGoalReportUpdateTodayGoalReport2, false, 2, null);
                        } else {
                            Integer itemGoal = dailyGoalReportQueryLatestRainbowBeforeInZero.getItemGoal(goalType);
                            if (itemGoal == null) {
                                itemGoal = Integer.valueOf(userProfile.getDEFAULT_TARGET()[goalType - 1]);
                            }
                            Map<Integer, Integer> itemTypeAndGoal = dailyGoalReportQueryLatestRainbowBeforeInZero.getItemTypeAndGoal();
                            if (itemTypeAndGoal.containsKey(Integer.valueOf(goalType))) {
                                DailyGoalReport emptyReport = DailyGoalReport.INSTANCE.getEmptyReport(timeStamp, itemTypeAndGoal);
                                emptyReport.updateItem(goalType, sourceData, itemGoal);
                                FitnessLogUtils.d(this.TAG, "【insertRainbows init from history】 " + emptyReport);
                                RainbowDaoProxy.insertRainbows$default(rainbowDaoProxy2, emptyReport, false, 2, null);
                            } else {
                                FitnessLogUtils.i(this.TAG, "nearlyReport not contain " + goalType + ", ignore");
                            }
                        }
                    } else if (dailyGoalReport3.getItemTypeAndGoal().containsKey(Integer.valueOf(goalType))) {
                        int achieved = dailyGoalReport3.getAchieved(goalType);
                        if (achieved < sourceData) {
                            DailyGoalReport.updateItem$default(dailyGoalReport3, goalType, sourceData, null, 4, null);
                            FitnessLogUtils.d(this.TAG, "【insertRainbows update achieved】 " + dailyGoalReport3);
                            RainbowDaoProxy.insertRainbows$default(RainbowDaoProxy.INSTANCE, dailyGoalReport3, false, 2, null);
                        } else {
                            FitnessLogUtils.d(this.TAG, "oldValue = " + achieved + ", curValue = " + sourceData + ", ignore update");
                        }
                    } else {
                        FitnessLogUtils.i(this.TAG, "rainbowReport(" + dailyGoalReport3.getTime() + ") not contain " + goalType + ", ignore(" + today + ")");
                    }
                }
            }
        }
    }

    private final DailyGoalReport updateTodayGoalReport(long time, int curType, int curValue, UserProfile userProfile, DailyGoalReport goalReport) {
        int rainbowItemGoal = UserProfileExtKt.getRainbowItemGoal(userProfile, curType);
        Map<Integer, Integer> rainbowItemGoalMap = UserProfileExtKt.getRainbowItemGoalMap(userProfile);
        Map<Integer, Pair<Integer, Integer>> mapEmptyMap = MapsKt__MapsKt.emptyMap();
        if (goalReport != null) {
            mapEmptyMap = goalReport.getItemTypeGoalAndValue();
            FitnessLogUtils.i(this.TAG, "updateTodayGoalReport: goalReport = " + goalReport);
        }
        DailyGoalReport emptyReport = DailyGoalReport.INSTANCE.getEmptyReport(time, rainbowItemGoalMap);
        Iterator<Map.Entry<Integer, Integer>> it = rainbowItemGoalMap.entrySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().getKey().intValue();
            if (mapEmptyMap.containsKey(Integer.valueOf(iIntValue))) {
                Pair<Integer, Integer> pair = mapEmptyMap.get(Integer.valueOf(iIntValue));
                Intrinsics.checkNotNull(pair);
                DailyGoalReport.updateItem$default(emptyReport, iIntValue, pair.getSecond().intValue(), null, 4, null);
            }
        }
        FitnessLogUtils.i(this.TAG, "updateTodayGoalReport: oldValue = " + mapEmptyMap + ", curType = " + curType + ", curValue = " + curValue);
        emptyReport.updateItem(curType, curValue, Integer.valueOf(rainbowItemGoal));
        return emptyReport;
    }

    public final void startUpdateRainbow(long startTime, long endTime, int goalType, @NotNull List<? extends IRainbowSourceData> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        long jChangeTo0TimeIn0TzOneDay = FitnessDateUtils.INSTANCE.changeTo0TimeIn0TzOneDay(System.currentTimeMillis() / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec());
        UserProfile userProfile = this.userInfoMgr.getUserProfile(false);
        if (startTime <= jChangeTo0TimeIn0TzOneDay && jChangeTo0TimeIn0TzOneDay <= endTime) {
            insertTodayReportIfNeed(jChangeTo0TimeIn0TzOneDay, goalType, userProfile);
        }
        updateRainbowReport(jChangeTo0TimeIn0TzOneDay, startTime, endTime, userProfile, goalType, reportList);
    }
}
