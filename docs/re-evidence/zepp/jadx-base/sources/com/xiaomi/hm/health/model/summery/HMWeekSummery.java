package com.xiaomi.hm.health.model.summery;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes21.dex */
public class HMWeekSummery extends Summery {
    private static final String a = "HMWeekSummery";
    public String bestScoreDate;
    public int dayAWake;
    public int dayActiveTime;
    public int dayDeepSleep;
    public int dayIntoSleepCoast;
    public int dayIntoSleepTime;
    public int dayLazyBedTime;
    public int dayLowSleep;
    public int dayRem;
    public int dayScore;
    public int daySleep;
    public int daySteps;
    public int dayWakeUpTime;
    public int mStatus = 0;
    public int totalCal;
    public int totalMiles;
    public int totalStepDays;
    public int totalSteps;
    public String weekEndDate;
    public String weekStartDate;
    public String worstScoreDate;

    private void a() {
        this.daySteps = 0;
        this.dayActiveTime = 0;
        this.totalMiles = 0;
        this.totalCal = 0;
        this.daySleep = 0;
        this.dayDeepSleep = 0;
        this.dayLowSleep = 0;
        this.dayIntoSleepTime = 0;
        this.dayWakeUpTime = 0;
        this.dayAWake = 0;
        this.mStatus = 0;
        this.totalSteps = 0;
        this.totalStepDays = 0;
        this.dayIntoSleepCoast = 0;
        this.dayLazyBedTime = 0;
        this.dayRem = 0;
        this.dayScore = 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0127  */
    /* JADX WARN: Code duplicated, block: B:33:0x0145  */
    /* JADX WARN: Code duplicated, block: B:34:0x0148  */
    public static HMWeekSummery fillWeekSummary(HMWeekSummery weekSummery) {
        int i;
        String str;
        int i2;
        int i3;
        Steps steps;
        int i4;
        weekSummery.a();
        String str2 = a;
        HMLog.d(a, "weekStart = " + weekSummery.weekStartDate + ";weekEnd = " + weekSummery.weekEndDate, new Object[0]);
        SportDay sportDayFromString = SportDay.fromString(weekSummery.weekStartDate);
        int iOffsetDay = SportDay.fromString(weekSummery.weekEndDate).offsetDay(SportDay.fromString(weekSummery.weekStartDate));
        weekSummery.mStatus = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i5 <= iOffsetDay) {
            HMSummery specifyDaySummary = HMDataCacheCenter.getInstance().getSpecifyDaySummary(sportDayFromString.addDay(i5).getKey());
            if (specifyDaySummary == null) {
                i = iOffsetDay;
                str = str2;
            } else {
                Sleep sleep = specifyDaySummary.sleep;
                if (sleep != null) {
                    weekSummery.dayIntoSleepCoast += sleep.is;
                    weekSummery.dayLazyBedTime += sleep.lb;
                    weekSummery.dayRem += sleep.dt;
                    weekSummery.dayScore += sleep.score;
                    int i12 = weekSummery.dayAWake;
                    int i13 = sleep.wk;
                    weekSummery.dayAWake = i12 + i13;
                    weekSummery.dayDeepSleep += sleep.dp;
                    weekSummery.dayLowSleep += sleep.lt;
                    int i14 = weekSummery.daySleep;
                    i = iOffsetDay;
                    long j = sleep.ed;
                    str = str2;
                    long j2 = sleep.st;
                    i2 = i9;
                    int i15 = i10;
                    weekSummery.daySleep = (i14 + ((int) (((j - j2) / 1000) / 60))) - i13;
                    if (j > j2) {
                        int i16 = Integer.parseInt(HMDateUtil.getHoursOnly(j2));
                        int i17 = Integer.parseInt(HMDateUtil.getMinutesOnly(specifyDaySummary.sleep.st));
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(specifyDaySummary.sleep.st);
                        i8 += (calendar.get(9) == 0 ? (i16 * 60) + 1440 : i16 * 60) + i17;
                        i6++;
                        Sleep sleep2 = specifyDaySummary.sleep;
                        if (sleep2.dp > 0) {
                            i7++;
                        }
                        if (i15 == 0 && i11 == 0) {
                            int i18 = sleep2.score;
                            String str3 = specifyDaySummary.date;
                            weekSummery.bestScoreDate = str3;
                            weekSummery.worstScoreDate = str3;
                            i10 = i18;
                            i11 = i10;
                        } else {
                            int i19 = sleep2.score;
                            i3 = i15;
                            if (i3 < i19) {
                                weekSummery.bestScoreDate = specifyDaySummary.date;
                                i10 = i19;
                            } else if (i11 > i19) {
                                weekSummery.worstScoreDate = specifyDaySummary.date;
                                i11 = i19;
                            }
                        }
                        steps = specifyDaySummary.steps;
                        if (steps != null) {
                            int i20 = weekSummery.dayActiveTime;
                            i4 = steps.activeTime;
                            weekSummery.dayActiveTime = i20 + i4;
                            weekSummery.totalSteps += steps.ttl;
                            weekSummery.totalCal += steps.cal;
                            weekSummery.totalMiles += steps.dis;
                            if (i4 > 0) {
                                i9 = i2 + 1;
                            } else {
                                i9 = i2;
                            }
                        } else {
                            i9 = i2;
                        }
                    } else {
                        i3 = i15;
                    }
                } else {
                    i = iOffsetDay;
                    str = str2;
                    i2 = i9;
                    i3 = i10;
                }
                i10 = i3;
                steps = specifyDaySummary.steps;
                if (steps != null) {
                    int i21 = weekSummery.dayActiveTime;
                    i4 = steps.activeTime;
                    weekSummery.dayActiveTime = i21 + i4;
                    weekSummery.totalSteps += steps.ttl;
                    weekSummery.totalCal += steps.cal;
                    weekSummery.totalMiles += steps.dis;
                    if (i4 > 0) {
                        i9 = i2 + 1;
                    } else {
                        i9 = i2;
                    }
                } else {
                    i9 = i2;
                }
            }
            i5++;
            iOffsetDay = i;
            str2 = str;
        }
        String str4 = str2;
        int i22 = i9;
        if (i6 > 0) {
            int i23 = weekSummery.dayAWake / i6;
            weekSummery.dayAWake = i23;
            weekSummery.dayDeepSleep = i7 > 0 ? weekSummery.dayDeepSleep / i7 : 0;
            weekSummery.dayLowSleep /= i6;
            int i24 = weekSummery.daySleep / i6;
            weekSummery.daySleep = i24;
            if (i24 > 0) {
                int i25 = i8 / i6;
                weekSummery.dayIntoSleepTime = i25;
                weekSummery.dayWakeUpTime = i25 + i24 + i23;
            }
            if (i6 < 2) {
                weekSummery.bestScoreDate = null;
                weekSummery.worstScoreDate = null;
            }
            weekSummery.dayIntoSleepCoast /= i6;
            weekSummery.dayLazyBedTime /= i6;
            weekSummery.dayRem /= i6;
            weekSummery.dayScore /= i6;
        }
        if (i22 > 0) {
            weekSummery.dayActiveTime /= i22;
            weekSummery.daySteps = weekSummery.totalSteps / i22;
        }
        weekSummery.totalStepDays = i22;
        HMLog.d(str4, "validStepsDays = " + i22 + ";validSleepDays = " + i6 + ",validDpSleepDays = " + i7 + "\n本周活动数据如下：" + weekSummery.toString() + ";totalSteps = " + weekSummery.totalSteps, new Object[0]);
        return weekSummery;
    }

    public String toString() {
        return "weekStartDate : " + this.weekStartDate + ";weekEndDate = " + this.weekEndDate + "\ndaySteps = " + this.daySteps + "\ndayActiveTime = " + this.dayActiveTime + "\ntotalMiles = " + this.totalMiles + "\ntotalCal = " + this.totalCal + "\ndaySleep = " + this.daySleep + "\ndayDeepSleep = " + this.dayDeepSleep + "\ndayLowSleep = " + this.dayLowSleep + "\ndayAWake = " + this.dayAWake + "\ndayIntoSleep = " + this.dayIntoSleepTime + "\ndayWakeUp = " + this.dayWakeUpTime;
    }
}
