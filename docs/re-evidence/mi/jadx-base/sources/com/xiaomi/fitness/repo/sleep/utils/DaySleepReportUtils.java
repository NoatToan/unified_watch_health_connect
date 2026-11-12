package com.xiaomi.fitness.repo.sleep.utils;

import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.distribute.SleepDistributeConfig;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.sleep.algo.MiDevSleepAlgo;
import com.xiaomi.fit.fitness.sleep.algo.evaluation.SleepEvaluation;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.aggregation.health.dao.TimeZoneUtil;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.repo.sleep.SleepBiz;
import com.xiaomi.fitness.repo.sleep.net.SleepDistributeResult;
import com.xiaomi.fitness.repo.sleep.sp.SleepDataCorePreference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005J\u001e\u0010\u0013\u001a\u00020\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u001e\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J&\u0010\u0018\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001d\u001a\u00020\fH\u0002J\u001e\u0010\u001e\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u001e\u0010 \u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u001e\u0010!\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\"\u001a\u00020\u0007H\u0002J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/utils/DaySleepReportUtils;", "", "<init>", "()V", "TAG", "", "computeDaySleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "segSleepLists", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "time", "", "tzInSec", "", "computeWeeklySleepReport", "dayReportList", "weeklyTime", CloudContract.COL_VIEW_TAG, "computeDaySleepSummaryInfo", "", "dayReport", "computeDaySleepAssistInfo", "reportList", "computeDaySleepComment", "buildSleepSummary", "Lcom/xiaomi/fit/fitness/sleep/algo/evaluation/SleepEvaluation$SleepSummary;", "segReport", "getDaySleepSegmentReportList", "timeSec", "computeWeeklySleepSummaryInfo", "weeklyReport", "computeWeeklySleepAssistInfo", "computeWeeklySleepComment", "weeklySummary", "loadSleepDistributeIfNeed", "Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;", "requestSleepDistributeConfig", "age", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaySleepReportUtils {

    @NotNull
    public static final DaySleepReportUtils INSTANCE = new DaySleepReportUtils();

    @NotNull
    private static final String TAG = "DaySleepReportUtils";

    private DaySleepReportUtils() {
    }

    private final SleepEvaluation.SleepSummary buildSleepSummary(SleepSegmentReport segReport) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        SleepStateItem sleepStateItem;
        SleepEvaluation.SleepSummary sleepSummary = new SleepEvaluation.SleepSummary();
        sleepSummary.deepDuration = segReport.getDeepDuration();
        sleepSummary.lightDuration = segReport.getLightDuration();
        int sleepState = 0;
        if (segReport.getRemDuration() == null) {
            iIntValue = 0;
        } else {
            Integer remDuration = segReport.getRemDuration();
            Intrinsics.checkNotNull(remDuration);
            iIntValue = remDuration.intValue();
        }
        sleepSummary.remDuration = iIntValue;
        if (segReport.getWakeCount() == null) {
            iIntValue2 = 0;
        } else {
            Integer wakeCount = segReport.getWakeCount();
            Intrinsics.checkNotNull(wakeCount);
            iIntValue2 = wakeCount.intValue();
        }
        sleepSummary.wakeCount = iIntValue2;
        if (segReport.getWakeDuration() == null) {
            iIntValue3 = 0;
        } else {
            Integer wakeDuration = segReport.getWakeDuration();
            Intrinsics.checkNotNull(wakeDuration);
            iIntValue3 = wakeDuration.intValue();
        }
        sleepSummary.wakeDuration = iIntValue3;
        sleepSummary.sleepDuration = segReport.getSleepDuration();
        sleepSummary.timeZone = segReport.getTzIn15Min();
        sleepSummary.sleepOnBed = segReport.getBedTime();
        List<SleepStateItem> sleepItems = segReport.getSleepItems();
        if (sleepItems != null && (sleepStateItem = (SleepStateItem) CollectionsKt___CollectionsKt.lastOrNull((List) sleepItems)) != null) {
            sleepState = sleepStateItem.getSleepState();
        }
        sleepSummary.lastStage = sleepState;
        return sleepSummary;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    private final void computeDaySleepAssistInfo(List<SleepSegmentReport> reportList, AllDaySleepReport dayReport) {
        int iRoundToInt;
        int iRoundToInt2 = 0;
        int i = 0;
        int i2 = 0;
        for (SleepSegmentReport sleepSegmentReport : reportList) {
            if (sleepSegmentReport.getAvgHr() != null) {
                Integer avgHr = sleepSegmentReport.getAvgHr();
                Intrinsics.checkNotNull(avgHr);
                if (avgHr.intValue() > 0) {
                    if (dayReport.getAvgHr() == null) {
                        dayReport.setAvgHr(0);
                        dayReport.setMaxHr(0);
                        dayReport.setMinHr(0);
                    }
                    i++;
                    Integer avgHr2 = dayReport.getAvgHr();
                    Intrinsics.checkNotNull(avgHr2);
                    int iIntValue = avgHr2.intValue();
                    Integer avgHr3 = sleepSegmentReport.getAvgHr();
                    Intrinsics.checkNotNull(avgHr3);
                    dayReport.setAvgHr(Integer.valueOf(iIntValue + avgHr3.intValue()));
                    if (sleepSegmentReport.getMaxHr() != null) {
                        Integer maxHr = sleepSegmentReport.getMaxHr();
                        Intrinsics.checkNotNull(maxHr);
                        int iIntValue2 = maxHr.intValue();
                        Integer maxHr2 = dayReport.getMaxHr();
                        Intrinsics.checkNotNull(maxHr2);
                        if (iIntValue2 > maxHr2.intValue()) {
                            dayReport.setMaxHr(sleepSegmentReport.getMaxHr());
                        }
                    }
                    if (sleepSegmentReport.getMinHr() != null) {
                        Integer minHr = dayReport.getMinHr();
                        if (minHr != null && minHr.intValue() == 0) {
                            dayReport.setMinHr(sleepSegmentReport.getMinHr());
                        } else {
                            Integer minHr2 = sleepSegmentReport.getMinHr();
                            Intrinsics.checkNotNull(minHr2);
                            if (minHr2.intValue() > 0) {
                                Integer minHr3 = sleepSegmentReport.getMinHr();
                                Intrinsics.checkNotNull(minHr3);
                                int iIntValue3 = minHr3.intValue();
                                Integer minHr4 = dayReport.getMinHr();
                                Intrinsics.checkNotNull(minHr4);
                                if (iIntValue3 < minHr4.intValue()) {
                                    dayReport.setMinHr(sleepSegmentReport.getMinHr());
                                }
                            }
                        }
                    }
                }
            }
            if (sleepSegmentReport.getAvgSpo2() != null) {
                Integer avgSpo2 = sleepSegmentReport.getAvgSpo2();
                Intrinsics.checkNotNull(avgSpo2);
                if (avgSpo2.intValue() > 0) {
                    if (dayReport.getAvgSpo2() == null) {
                        dayReport.setAvgSpo2(0);
                        dayReport.setMaxSpo2(0);
                        dayReport.setMinSpo2(0);
                    }
                    i2++;
                    Integer avgSpo3 = dayReport.getAvgSpo2();
                    Intrinsics.checkNotNull(avgSpo3);
                    int iIntValue4 = avgSpo3.intValue();
                    Integer avgSpo4 = sleepSegmentReport.getAvgSpo2();
                    Intrinsics.checkNotNull(avgSpo4);
                    dayReport.setAvgSpo2(Integer.valueOf(iIntValue4 + avgSpo4.intValue()));
                    if (sleepSegmentReport.getMaxSpo2() != null) {
                        Integer maxSpo2 = sleepSegmentReport.getMaxSpo2();
                        Intrinsics.checkNotNull(maxSpo2);
                        int iIntValue5 = maxSpo2.intValue();
                        Integer maxSpo3 = dayReport.getMaxSpo2();
                        Intrinsics.checkNotNull(maxSpo3);
                        if (iIntValue5 > maxSpo3.intValue()) {
                            dayReport.setMaxSpo2(sleepSegmentReport.getMaxSpo2());
                        }
                    }
                    if (sleepSegmentReport.getMinSpo2() != null) {
                        Integer minSpo2 = dayReport.getMinSpo2();
                        if (minSpo2 == null || minSpo2.intValue() != 0) {
                            Integer minSpo3 = sleepSegmentReport.getMinSpo2();
                            Intrinsics.checkNotNull(minSpo3);
                            if (minSpo3.intValue() > 0) {
                                Integer minSpo4 = sleepSegmentReport.getMinSpo2();
                                Intrinsics.checkNotNull(minSpo4);
                                int iIntValue6 = minSpo4.intValue();
                                Integer minSpo5 = dayReport.getMinSpo2();
                                Intrinsics.checkNotNull(minSpo5);
                                if (iIntValue6 < minSpo5.intValue()) {
                                }
                            }
                        }
                        dayReport.setMinSpo2(sleepSegmentReport.getMinSpo2());
                    }
                }
            }
        }
        if (i == 0) {
            iRoundToInt = 0;
        } else {
            Integer avgHr4 = dayReport.getAvgHr();
            Intrinsics.checkNotNull(avgHr4);
            iRoundToInt = MathKt__MathJVMKt.roundToInt(avgHr4.intValue() / (i * 1.0f));
        }
        dayReport.setAvgHr(Integer.valueOf(iRoundToInt));
        if (i2 != 0) {
            Integer avgSpo5 = dayReport.getAvgSpo2();
            Intrinsics.checkNotNull(avgSpo5);
            iRoundToInt2 = MathKt__MathJVMKt.roundToInt(avgSpo5.intValue() / (i2 * 1.0f));
        }
        dayReport.setAvgSpo2(Integer.valueOf(iRoundToInt2));
    }

    private final void computeDaySleepComment(List<SleepSegmentReport> reportList, AllDaySleepReport dayReport, int tzInSec) {
        ArrayList arrayList = new ArrayList();
        Iterator<SleepSegmentReport> it = reportList.iterator();
        while (it.hasNext()) {
            arrayList.add(buildSleepSummary(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        long time = (dayReport.getTime() + ((long) tzInSec)) - TimeUnit.DAYS.toSeconds(1L);
        Logger.i(TAG, "computeDaySleepComment currentDay:" + dayReport.getTime() + ",preDay:" + time + ";tzInSec:" + tzInSec);
        List<SleepSegmentReport> daySleepSegmentReportList = getDaySleepSegmentReportList(time);
        if (!daySleepSegmentReportList.isEmpty()) {
            Iterator<SleepSegmentReport> it2 = daySleepSegmentReportList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(buildSleepSummary(it2.next()));
            }
        }
        try {
            SleepEvaluation.Comment sleepDailyComment = MiDevSleepAlgo.INSTANCE.getInstance().getSleepDailyComment(dayReport.getTime(), arrayList, arrayList2);
            dayReport.setScore(sleepDailyComment.score);
            dayReport.setStage(sleepDailyComment.stage);
            dayReport.setLongSleepCommentCode(sleepDailyComment.longSleepCommentCode);
            dayReport.setCommentCode(sleepDailyComment.dayCommentCode);
        } catch (Throwable th) {
            FitnessLogUtils.INSTANCE.w(TAG, "getSleepDailyComment", th);
        }
        int score = dayReport.getScore();
        SleepDistributeConfig sleepDistributeConfigLoadSleepDistributeIfNeed = loadSleepDistributeIfNeed();
        if (sleepDistributeConfigLoadSleepDistributeIfNeed == null || !(!sleepDistributeConfigLoadSleepDistributeIfNeed.getMap().isEmpty())) {
            dayReport.setScoreOutperformedPercent(-1);
            return;
        }
        int iIntValue = 0;
        int iIntValue2 = 0;
        for (Map.Entry entry : MapsKt__MapsJVMKt.toSortedMap(sleepDistributeConfigLoadSleepDistributeIfNeed.getMap(), ComparisonsKt__ComparisonsKt.naturalOrder()).entrySet()) {
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            iIntValue += ((Number) value).intValue();
            if (((Number) entry.getKey()).intValue() < score) {
                Object value2 = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
                iIntValue2 += ((Number) value2).intValue();
            }
        }
        Number numberValueOf = iIntValue == 0 ? 0 : Float.valueOf((iIntValue2 * 100.0f) / iIntValue);
        dayReport.setScoreOutperformedPercent(Integer.valueOf(numberValueOf.intValue()));
        FitnessLogUtils.w(TAG, "computeScoreOutperformedPercent " + score + " - " + numberValueOf.intValue());
    }

    private final void computeDaySleepSummaryInfo(List<SleepSegmentReport> segSleepLists, AllDaySleepReport dayReport) {
        for (SleepSegmentReport sleepSegmentReport : segSleepLists) {
            dayReport.setTotalDuration(dayReport.getTotalDuration() + sleepSegmentReport.getSleepDuration());
            dayReport.setAvgDuration(dayReport.getAvgDuration() + sleepSegmentReport.getSleepDuration());
            dayReport.setDeepDuration(dayReport.getDeepDuration() + sleepSegmentReport.getDeepDuration());
            dayReport.setLightDuration(dayReport.getLightDuration() + sleepSegmentReport.getLightDuration());
            if (sleepSegmentReport.getRemDuration() != null) {
                if (dayReport.getRemDuration() == null) {
                    dayReport.setRemDuration(sleepSegmentReport.getRemDuration());
                } else {
                    Integer remDuration = dayReport.getRemDuration();
                    Intrinsics.checkNotNull(remDuration);
                    int iIntValue = remDuration.intValue();
                    Integer remDuration2 = sleepSegmentReport.getRemDuration();
                    Intrinsics.checkNotNull(remDuration2);
                    dayReport.setRemDuration(Integer.valueOf(iIntValue + remDuration2.intValue()));
                }
            }
            if (sleepSegmentReport.getWakeDuration() != null) {
                if (dayReport.getAwakeDuration() == null) {
                    dayReport.setAwakeDuration(sleepSegmentReport.getWakeDuration());
                } else {
                    Integer awakeDuration = dayReport.getAwakeDuration();
                    Intrinsics.checkNotNull(awakeDuration);
                    int iIntValue2 = awakeDuration.intValue();
                    Integer wakeDuration = sleepSegmentReport.getWakeDuration();
                    Intrinsics.checkNotNull(wakeDuration);
                    dayReport.setAwakeDuration(Integer.valueOf(iIntValue2 + wakeDuration.intValue()));
                }
            }
        }
        dayReport.setSleepSegments(segSleepLists);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    private final void computeWeeklySleepAssistInfo(List<AllDaySleepReport> reportList, AllDaySleepReport weeklyReport) {
        int iRoundToInt;
        int iRoundToInt2 = 0;
        int i = 0;
        int i2 = 0;
        for (AllDaySleepReport allDaySleepReport : reportList) {
            if (allDaySleepReport.getAvgHr() != null) {
                Integer avgHr = allDaySleepReport.getAvgHr();
                Intrinsics.checkNotNull(avgHr);
                if (avgHr.intValue() > 0) {
                    if (weeklyReport.getAvgHr() == null) {
                        weeklyReport.setAvgHr(0);
                        weeklyReport.setMaxHr(0);
                        weeklyReport.setMinHr(0);
                    }
                    i++;
                    Integer avgHr2 = weeklyReport.getAvgHr();
                    Intrinsics.checkNotNull(avgHr2);
                    int iIntValue = avgHr2.intValue();
                    Integer avgHr3 = allDaySleepReport.getAvgHr();
                    Intrinsics.checkNotNull(avgHr3);
                    weeklyReport.setAvgHr(Integer.valueOf(iIntValue + avgHr3.intValue()));
                    if (allDaySleepReport.getMaxHr() != null) {
                        Integer maxHr = allDaySleepReport.getMaxHr();
                        Intrinsics.checkNotNull(maxHr);
                        int iIntValue2 = maxHr.intValue();
                        Integer maxHr2 = weeklyReport.getMaxHr();
                        Intrinsics.checkNotNull(maxHr2);
                        if (iIntValue2 > maxHr2.intValue()) {
                            weeklyReport.setMaxHr(allDaySleepReport.getMaxHr());
                        }
                    }
                    if (allDaySleepReport.getMinHr() != null) {
                        Integer minHr = weeklyReport.getMinHr();
                        if (minHr != null && minHr.intValue() == 0) {
                            weeklyReport.setMinHr(allDaySleepReport.getMinHr());
                        } else {
                            Integer minHr2 = allDaySleepReport.getMinHr();
                            Intrinsics.checkNotNull(minHr2);
                            if (minHr2.intValue() > 0) {
                                Integer minHr3 = allDaySleepReport.getMinHr();
                                Intrinsics.checkNotNull(minHr3);
                                int iIntValue3 = minHr3.intValue();
                                Integer minHr4 = weeklyReport.getMinHr();
                                Intrinsics.checkNotNull(minHr4);
                                if (iIntValue3 < minHr4.intValue()) {
                                    weeklyReport.setMinHr(allDaySleepReport.getMinHr());
                                }
                            }
                        }
                    }
                }
            }
            if (allDaySleepReport.getAvgSpo2() != null) {
                Integer avgSpo2 = allDaySleepReport.getAvgSpo2();
                Intrinsics.checkNotNull(avgSpo2);
                if (avgSpo2.intValue() > 0) {
                    if (weeklyReport.getAvgSpo2() == null) {
                        weeklyReport.setAvgSpo2(0);
                        weeklyReport.setMaxSpo2(0);
                        weeklyReport.setMinSpo2(0);
                    }
                    i2++;
                    Integer avgSpo3 = weeklyReport.getAvgSpo2();
                    Intrinsics.checkNotNull(avgSpo3);
                    int iIntValue4 = avgSpo3.intValue();
                    Integer avgSpo4 = allDaySleepReport.getAvgSpo2();
                    Intrinsics.checkNotNull(avgSpo4);
                    weeklyReport.setAvgSpo2(Integer.valueOf(iIntValue4 + avgSpo4.intValue()));
                    if (allDaySleepReport.getMaxSpo2() != null) {
                        Integer maxSpo2 = allDaySleepReport.getMaxSpo2();
                        Intrinsics.checkNotNull(maxSpo2);
                        int iIntValue5 = maxSpo2.intValue();
                        Integer maxSpo3 = weeklyReport.getMaxSpo2();
                        Intrinsics.checkNotNull(maxSpo3);
                        if (iIntValue5 > maxSpo3.intValue()) {
                            weeklyReport.setMaxSpo2(allDaySleepReport.getMaxSpo2());
                        }
                    }
                    if (allDaySleepReport.getMinSpo2() != null) {
                        Integer minSpo2 = weeklyReport.getMinSpo2();
                        if (minSpo2 == null || minSpo2.intValue() != 0) {
                            Integer minSpo3 = allDaySleepReport.getMinSpo2();
                            Intrinsics.checkNotNull(minSpo3);
                            if (minSpo3.intValue() > 0) {
                                Integer minSpo4 = allDaySleepReport.getMinSpo2();
                                Intrinsics.checkNotNull(minSpo4);
                                int iIntValue6 = minSpo4.intValue();
                                Integer minSpo5 = weeklyReport.getMinSpo2();
                                Intrinsics.checkNotNull(minSpo5);
                                if (iIntValue6 < minSpo5.intValue()) {
                                }
                            }
                        }
                        weeklyReport.setMinSpo2(allDaySleepReport.getMinSpo2());
                    }
                }
            }
        }
        if (i == 0) {
            iRoundToInt = 0;
        } else {
            Integer avgHr4 = weeklyReport.getAvgHr();
            Intrinsics.checkNotNull(avgHr4);
            iRoundToInt = MathKt__MathJVMKt.roundToInt(avgHr4.intValue() / (i * 1.0f));
        }
        weeklyReport.setAvgHr(Integer.valueOf(iRoundToInt));
        if (i2 != 0) {
            Integer avgSpo5 = weeklyReport.getAvgSpo2();
            Intrinsics.checkNotNull(avgSpo5);
            iRoundToInt2 = MathKt__MathJVMKt.roundToInt(avgSpo5.intValue() / (i2 * 1.0f));
        }
        weeklyReport.setAvgSpo2(Integer.valueOf(iRoundToInt2));
    }

    private final void computeWeeklySleepComment(List<AllDaySleepReport> dayReportList, AllDaySleepReport weeklySummary) {
        int score;
        int i = 0;
        int i2 = 0;
        for (AllDaySleepReport allDaySleepReport : dayReportList) {
            if (allDaySleepReport.getSleepSegments() != null && allDaySleepReport.getRemDuration() != null && (score = allDaySleepReport.getScore()) > 0) {
                i2 += score;
                i++;
            }
        }
        weeklySummary.setScore(i != 0 ? i2 / i : 0);
    }

    private final void computeWeeklySleepSummaryInfo(List<AllDaySleepReport> reportList, AllDaySleepReport weeklyReport) {
        for (AllDaySleepReport allDaySleepReport : reportList) {
            weeklyReport.setTotalDuration(weeklyReport.getTotalDuration() + allDaySleepReport.getTotalDuration());
            weeklyReport.setDeepDuration(weeklyReport.getDeepDuration() + allDaySleepReport.getDeepDuration());
            weeklyReport.setLightDuration(weeklyReport.getLightDuration() + allDaySleepReport.getLightDuration());
            if (allDaySleepReport.getRemDuration() != null) {
                if (weeklyReport.getRemDuration() == null) {
                    weeklyReport.setRemDuration(allDaySleepReport.getRemDuration());
                } else {
                    Integer remDuration = weeklyReport.getRemDuration();
                    Intrinsics.checkNotNull(remDuration);
                    remDuration.intValue();
                    Integer remDuration2 = allDaySleepReport.getRemDuration();
                    Intrinsics.checkNotNull(remDuration2);
                    remDuration2.intValue();
                }
            }
        }
        weeklyReport.setAvgDuration(weeklyReport.getTotalDuration() / reportList.size());
        weeklyReport.setDayReportList(reportList);
    }

    private final List<SleepSegmentReport> getDaySleepSegmentReportList(long timeSec) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZoneUtil.INSTANCE.getTimeZone(0));
        long j = 1000;
        Intrinsics.checkNotNull(calendar);
        long beginOfDate = TimeUtils.getBeginOfDate(timeSec * j, calendar);
        List<SleepSegmentReport> listConvertToSleepSegmentList = new SleepBiz().convertToSleepSegmentList(FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getAllDailyRecord(HomeDataType.SLEEP, null, beginOfDate / j, TimeUtils.getBeginOfDate((TimeUnit.DAYS.toSeconds(1L) + timeSec) * j, calendar) / j, 0));
        Logger.i(TAG, "getDaySleepSegmentReportList " + timeSec + ";" + beginOfDate + ";" + listConvertToSleepSegmentList);
        return SleepAggregateUtils.INSTANCE.aggregateDaySleep(listConvertToSleepSegmentList);
    }

    private final SleepDistributeConfig loadSleepDistributeIfNeed() {
        SleepDistributeConfig sleepDistributeConfig = SleepDataCorePreference.INSTANCE.getSleepDistributeConfig();
        int age = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge();
        if (sleepDistributeConfig == null || sleepDistributeConfig.getTime() != TimeUtils.getBeginOfToday() / ((long) 1000) || sleepDistributeConfig.getAge() != age) {
            sleepDistributeConfig = requestSleepDistributeConfig(age);
        }
        Logger.i(TAG, "loadSleepDistributeIfNeed result:" + sleepDistributeConfig);
        return sleepDistributeConfig;
    }

    private final SleepDistributeConfig requestSleepDistributeConfig(int age) {
        SleepDistributeResult sleepDistributeResult;
        Logger.i(TAG, "requestSleepDistributeConfig");
        Map<Integer, Integer> map = null;
        try {
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                return null;
            }
            CompletableFuture completableFuture = new CompletableFuture();
            new NetCoroutineScope(null, null, Dispatchers.getIO(), 3, null).launch((Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new DaySleepReportUtils$requestSleepDistributeConfig$value$1(age, completableFuture, null));
            sleepDistributeResult = (SleepDistributeResult) completableFuture.get(VibrateModeProgressBar.sLongToLong, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Logger.e(TAG, "future get exception " + e);
            sleepDistributeResult = null;
        }
        SleepDataCorePreference sleepDataCorePreference = SleepDataCorePreference.INSTANCE;
        if (sleepDistributeResult != null && (map = sleepDistributeResult.getMap()) == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        sleepDataCorePreference.updateDistributeConfig(map, age);
        return sleepDataCorePreference.getSleepDistributeConfig();
    }

    @NotNull
    public final AllDaySleepReport computeDaySleepReport(@NotNull List<SleepSegmentReport> segSleepLists, long time, int tzInSec) {
        Intrinsics.checkNotNullParameter(segSleepLists, "segSleepLists");
        FitnessLogUtils.i(TAG, "computeDaySleepReport segment size = " + segSleepLists.size() + ", time = " + time + " ,tzInSec " + tzInSec);
        AllDaySleepReport allDaySleepReport = new AllDaySleepReport(time, "days");
        allDaySleepReport.setTzInSec(FitnessDateUtils.getCurrentTZOffsetInSec());
        computeDaySleepSummaryInfo(segSleepLists, allDaySleepReport);
        computeDaySleepAssistInfo(segSleepLists, allDaySleepReport);
        computeDaySleepComment(segSleepLists, allDaySleepReport, tzInSec);
        return allDaySleepReport;
    }

    @NotNull
    public final AllDaySleepReport computeWeeklySleepReport(@NotNull List<AllDaySleepReport> dayReportList, long weeklyTime, @NotNull String viewTag) {
        Intrinsics.checkNotNullParameter(dayReportList, "dayReportList");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        FitnessLogUtils.i(TAG, "computeWeeklySleepReport sleep days = " + dayReportList.size() + ", time = " + weeklyTime);
        AllDaySleepReport allDaySleepReport = new AllDaySleepReport(weeklyTime, viewTag);
        allDaySleepReport.setTzInSec(FitnessDateUtils.getCurrentTZOffsetInSec());
        try {
            computeWeeklySleepSummaryInfo(dayReportList, allDaySleepReport);
            computeWeeklySleepAssistInfo(dayReportList, allDaySleepReport);
            computeWeeklySleepComment(dayReportList, allDaySleepReport);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        return allDaySleepReport;
    }
}
