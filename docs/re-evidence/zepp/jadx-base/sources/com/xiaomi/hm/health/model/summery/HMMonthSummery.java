package com.xiaomi.hm.health.model.summery;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes21.dex */
public class HMMonthSummery extends Summery {
    private static final String a = "HMMonthSummery";
    public String bestDate;
    public int bestSteps;
    public int dayAWake;
    public int dayActiveTime;
    public int dayDeepSleep;
    public int dayIntoSleepTime;
    public int dayLowSleep;
    public int daySleep;
    public int daySteps;
    public int dayWakeUpTime;
    public String month;
    public String monthEndDate;
    public String monthStartDate;
    public int totalCal;
    public int totalMiles;
    public int totalStepDays;
    public int totalSteps;
    public String worstDate;
    public int worstSteps;
    public int mStatus = 0;
    public int dayIntoSleepCoast = 0;
    public int dayLazyBedTime = 0;
    public int dayRem = 0;
    public int dayScore = 0;

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
        this.totalSteps = 0;
        this.mStatus = 0;
        this.totalStepDays = 0;
        this.dayIntoSleepCoast = 0;
        this.dayLazyBedTime = 0;
        this.dayRem = 0;
        this.dayScore = 0;
    }

    public static HMMonthSummery fillMonth(HMMonthSummery monthSummery) {
        SportDay sportDay;
        int i;
        int i2;
        monthSummery.a();
        monthSummery.month = "" + (SportDay.fromString(monthSummery.monthStartDate).mon + 1);
        SportDay sportDayFromString = SportDay.fromString(monthSummery.monthStartDate);
        int iOffsetDay = SportDay.fromString(monthSummery.monthEndDate).offsetDay(SportDay.fromString(monthSummery.monthStartDate));
        monthSummery.mStatus = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 <= iOffsetDay) {
            HMSummery specifyDaySummary = HMDataCacheCenter.getInstance().getSpecifyDaySummary(sportDayFromString.addDay(i3).getKey());
            if (specifyDaySummary == null) {
                sportDay = sportDayFromString;
                i = iOffsetDay;
                i2 = i3;
            } else {
                Sleep sleep = specifyDaySummary.sleep;
                if (sleep != null) {
                    monthSummery.dayIntoSleepCoast += sleep.is;
                    monthSummery.dayLazyBedTime += sleep.lb;
                    monthSummery.dayRem += sleep.dt;
                    monthSummery.dayScore += sleep.score;
                    int i8 = monthSummery.dayAWake;
                    int i9 = sleep.wk;
                    monthSummery.dayAWake = i8 + i9;
                    monthSummery.dayDeepSleep += sleep.dp;
                    monthSummery.dayLowSleep += sleep.lt;
                    int i10 = monthSummery.daySleep;
                    long j = sleep.ed;
                    i2 = i3;
                    long j2 = sleep.st;
                    sportDay = sportDayFromString;
                    i = iOffsetDay;
                    monthSummery.daySleep = (i10 + ((int) (((j - j2) / 1000) / 60))) - i9;
                    if (j > j2) {
                        int i11 = Integer.parseInt(HMDateUtil.getHoursOnly(j2));
                        int i12 = Integer.parseInt(HMDateUtil.getMinutesOnly(specifyDaySummary.sleep.st));
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(specifyDaySummary.sleep.st);
                        i7 += (calendar.get(9) == 0 ? (i11 * 60) + 1440 : i11 * 60) + i12;
                        i4++;
                        if (specifyDaySummary.sleep.dp > 0) {
                            i5++;
                        }
                    }
                } else {
                    sportDay = sportDayFromString;
                    i = iOffsetDay;
                    i2 = i3;
                }
                Steps steps = specifyDaySummary.steps;
                if (steps != null) {
                    int i13 = monthSummery.dayActiveTime;
                    int i14 = steps.activeTime;
                    monthSummery.dayActiveTime = i13 + i14;
                    int i15 = monthSummery.totalSteps;
                    int i16 = steps.ttl;
                    monthSummery.totalSteps = i15 + i16;
                    monthSummery.totalCal += steps.cal;
                    monthSummery.totalMiles += steps.dis;
                    if (i14 > 0) {
                        i6++;
                        int i17 = monthSummery.bestSteps;
                        if (i17 == 0 && monthSummery.worstSteps == 0) {
                            monthSummery.bestSteps = i16;
                            String str = specifyDaySummary.date;
                            monthSummery.bestDate = str;
                            monthSummery.worstSteps = i16;
                            monthSummery.worstDate = str;
                        } else if (i17 < i16) {
                            monthSummery.bestSteps = i16;
                            monthSummery.bestDate = specifyDaySummary.date;
                        } else if (monthSummery.worstSteps > i16) {
                            monthSummery.worstSteps = i16;
                            monthSummery.worstDate = specifyDaySummary.date;
                        }
                    }
                }
            }
            i3 = i2 + 1;
            sportDayFromString = sportDay;
            iOffsetDay = i;
        }
        if (i4 > 0) {
            int i18 = monthSummery.dayAWake / i4;
            monthSummery.dayAWake = i18;
            monthSummery.dayDeepSleep = i5 > 0 ? monthSummery.dayDeepSleep / i5 : 0;
            monthSummery.dayLowSleep /= i4;
            int i19 = monthSummery.daySleep / i4;
            monthSummery.daySleep = i19;
            if (i19 > 0) {
                int i20 = i7 / i4;
                monthSummery.dayIntoSleepTime = i20;
                monthSummery.dayWakeUpTime = i20 + i19 + i18;
            }
            monthSummery.dayIntoSleepCoast /= i4;
            monthSummery.dayLazyBedTime /= i4;
            monthSummery.dayRem /= i4;
            monthSummery.dayScore /= i4;
        }
        if (i6 > 0) {
            monthSummery.dayActiveTime /= i6;
            monthSummery.daySteps = monthSummery.totalSteps / i6;
        }
        monthSummery.totalStepDays = i6;
        HMLog.d(a, "validStepsDays = " + i6 + ";validSleepDays = " + i4 + ",validDpSleepDays = " + i5 + "\n本月活动数据如下：" + monthSummery.toString() + ";totalSteps = " + monthSummery.totalSteps, new Object[0]);
        return monthSummery;
    }

    public String toString() {
        return "monthStartDate : " + this.monthStartDate + ";monthEndDate = " + this.monthEndDate + "\nmonth = " + this.month + "\ndaySteps = " + this.daySteps + "\ndayActiveTime = " + this.dayActiveTime + "\ntotalMiles = " + this.totalMiles + "\ntotalCal = " + this.totalCal + "\ndaySleep = " + this.daySleep + "\ndayDeepSleep = " + this.dayDeepSleep + "\ndayLowSleep = " + this.dayLowSleep + "\ndayAWake = " + this.dayAWake + "\ndayIntoSleep = " + this.dayIntoSleepTime + "\ndayIntoSleepCoast = " + this.dayIntoSleepCoast + "\ndayLazyBedTime = " + this.dayLazyBedTime + "\ndayRem = " + this.dayRem + "\ndayWakeUp = " + this.dayWakeUpTime;
    }
}
