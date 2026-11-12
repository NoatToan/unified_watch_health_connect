package com.xiaomi.hm.health.share;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huami.step.model.StepInfo;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.share.WeightShare;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesDaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.model.summery.Steps;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class ShareAdapter {
    private static final String c = "ShareAdapter";
    private final Context a = BraceletApp.getContext();
    private final SportDataManager b = SportDataManager.getInstance();

    private ShareAdapter() {
    }

    private String a(Calendar calendar) {
        return TimeUtils.formatDate("MMM", calendar.getTime());
    }

    private String b(String startKey, String stopKey) {
        return l(startKey, stopKey);
    }

    private String c(String startKey) {
        Calendar calendar = SportDay.fromString(startKey).calendar;
        Calendar calendar2 = Calendar.getInstance();
        int i = (calendar.get(1) * 12) + calendar.get(2);
        int i2 = (calendar2.get(1) * 12) + calendar2.get(2);
        if (i == i2) {
            return this.a.getString(R.string.share_sleep_this_month_title_v3);
        }
        return i + 1 == i2 ? this.a.getString(R.string.share_sleep_last_month_title_v3) : this.a.getString(R.string.share_sleep_month_title_v3, a(calendar));
    }

    private String d(SportDay day) {
        int timeInMillis = (int) ((Calendar.getInstance().getTimeInMillis() - day.getTimestamp()) / 86400000);
        HMLog.d(c, "sport day : " + day.toString() + ", count :" + timeInMillis, new Object[0]);
        return timeInMillis < 1 ? this.a.getString(R.string.share_sleep_tonight_v3) : this.a.getString(R.string.share_sleep);
    }

    private String e(int index, int size) {
        HMLog.d(c, "week count: " + index + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + size, new Object[0]);
        if (index == size - 1) {
            return this.a.getString(R.string.share_sleep_this_week_title_v3);
        }
        return index == size + (-2) ? this.a.getString(R.string.share_sleep_last_week_title_v3) : this.a.getString(R.string.share_sleep_week_title_v3);
    }

    private String f(long startTime, long endTime) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (endTime > jCurrentTimeMillis) {
            endTime = jCurrentTimeMillis;
        }
        return TimeUtils.formatDate_y(BraceletApp.getContext(), new Date(startTime)) + Constants.WAVE_SEPARATOR + TimeUtils.formatDate_y(BraceletApp.getContext(), new Date(endTime));
    }

    private String g(String startKey) {
        Calendar calendar = SportDay.fromString(startKey).calendar;
        Calendar calendar2 = Calendar.getInstance();
        int i = (calendar.get(1) * 12) + calendar.get(2);
        int i2 = (calendar2.get(1) * 12) + calendar2.get(2);
        if (i == i2) {
            return this.a.getString(R.string.share_step_this_month_title);
        }
        return i + 1 == i2 ? this.a.getString(R.string.share_step_last_month_title) : this.a.getString(R.string.share_step_month_title, a(calendar));
    }

    private String h(Calendar calendar) {
        return m(calendar) ? this.a.getString(R.string.share_today_step) : this.a.getString(R.string.share_step);
    }

    private String i(int index, int size) {
        HMLog.d(c, "week index: " + index + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + size, new Object[0]);
        if (index == size - 1) {
            return this.a.getString(R.string.share_step_this_week_title);
        }
        return index == size + (-2) ? this.a.getString(R.string.share_step_last_week_title) : this.a.getString(R.string.share_step_week_title);
    }

    private String j(Calendar calendar) {
        int i = Calendar.getInstance().get(3);
        int i2 = calendar.get(3);
        if (i == i2) {
            return this.a.getString(R.string.share_step_this_week_title);
        }
        return i2 == i + (-1) ? this.a.getString(R.string.share_step_last_week_title) : this.a.getString(R.string.share_step_week_title);
    }

    private String k(Calendar calendar) {
        return this.a.getString(R.string.share_step_month_title, HealthDataTimeUtils.INSTANCE.getYear(calendar.getTimeInMillis()));
    }

    private String l(String startKey, String stopKey) {
        SportDay sportDayFromString = SportDay.fromString(startKey);
        SportDay sportDayFromString2 = SportDay.fromString(stopKey);
        return TimeUtils.formatDate_y(BraceletApp.getContext(), sportDayFromString.calendar.getTime()) + " ~ " + (sportDayFromString2.offsetYear(sportDayFromString) == 0 ? TimeUtils.formatDate_y(BraceletApp.getContext(), sportDayFromString2.calendar.getTime()) : TimeUtils.formatDate(BraceletApp.getContext(), sportDayFromString2.calendar.getTime()));
    }

    private boolean m(Calendar calendar) {
        return Calendar.getInstance().get(6) == calendar.get(6);
    }

    public static ShareAdapter newInstance() {
        return new ShareAdapter();
    }

    public ShareContinue getShareContinue() {
        String beforeRecentReachGoalsStartDate;
        String beforeRecentReachGoalsEndDate;
        ShareContinue shareContinue = new ShareContinue();
        shareContinue.days = HMKeeper.getRecentReachGoals();
        shareContinue.a = HMKeeper.getMaxReachGoals();
        shareContinue.d = HMKeeper.recentReachGoalsIsFirst();
        HMLog.d(c, "days : " + shareContinue.days, new Object[0]);
        HMLog.d(c, "getShareContinue: isFirst : " + shareContinue.d, new Object[0]);
        if (shareContinue.days >= 1) {
            beforeRecentReachGoalsStartDate = HMKeeper.getRecentReachGoalsStart();
            beforeRecentReachGoalsEndDate = HMKeeper.getRecentReachGoalsStop();
            shareContinue.title = this.a.getString(R.string.share_continue);
            if (shareContinue.d) {
                if (shareContinue.days >= 7) {
                    shareContinue.text = this.a.getString(R.string.share_continue_make_new);
                }
            } else if (shareContinue.days > shareContinue.a) {
                shareContinue.text = this.a.getString(R.string.share_continue_make_new);
            } else {
                Resources resources = this.a.getResources();
                int i = shareContinue.a;
                shareContinue.text = resources.getQuantityString(R.plurals.share_continue_max_day, i, Integer.valueOf(i));
            }
        } else {
            int beforeRecentReachGoals = HMKeeper.getBeforeRecentReachGoals();
            shareContinue.days = beforeRecentReachGoals;
            if (beforeRecentReachGoals >= 2) {
                shareContinue.title = this.a.getString(R.string.share_last_continue);
            } else {
                shareContinue.title = this.a.getString(R.string.share_continue);
            }
            beforeRecentReachGoalsStartDate = HMKeeper.getBeforeRecentReachGoalsStartDate();
            beforeRecentReachGoalsEndDate = HMKeeper.getBeforeRecentReachGoalsEndDate();
            if (TextUtils.isEmpty(beforeRecentReachGoalsEndDate) || !SportDay.fromString(beforeRecentReachGoalsEndDate).isYesterday()) {
                shareContinue.days = 0;
            }
        }
        if (shareContinue.days == 0) {
            shareContinue.text = this.a.getString(R.string.share_continue_null);
        }
        if (TextUtils.isEmpty(beforeRecentReachGoalsStartDate)) {
            shareContinue.b = TimeUtils.formatDate_y(BraceletApp.getContext(), new Date(System.currentTimeMillis()));
        } else {
            shareContinue.b = TimeUtils.formatDate_y(BraceletApp.getContext(), new Date(SportDay.fromString(beforeRecentReachGoalsStartDate).getTimestamp()));
        }
        HMLog.d(c, "continue start : " + shareContinue.b, new Object[0]);
        if (TextUtils.isEmpty(beforeRecentReachGoalsEndDate)) {
            shareContinue.c = TimeUtils.formatDate_y(BraceletApp.getContext(), new Date(System.currentTimeMillis()));
        } else {
            shareContinue.c = TimeUtils.formatDate_y(BraceletApp.getContext(), new Date(SportDay.fromString(beforeRecentReachGoalsEndDate).getTimestamp()));
        }
        HMLog.d(c, "continue stop : " + shareContinue.c, new Object[0]);
        return shareContinue;
    }

    public ShareWeight parse2BodyFat(WeightShare bodyFat) {
        ShareWeight shareWeight = new ShareWeight();
        if (bodyFat != null) {
            HMLog.d(c, "bodyFat data : " + bodyFat.toString(), new Object[0]);
            shareWeight.userid = bodyFat.getUserid();
            shareWeight.bmi = bodyFat.getBmi();
            shareWeight.bodyFat = bodyFat.getBodyFat();
            shareWeight.weightValue = bodyFat.getWeightValue();
            shareWeight.g = bodyFat.getScore();
            shareWeight.a = bodyFat.getWeightUnitStr();
            shareWeight.c = TimeUtils.formatDateTime_y_12(BraceletApp.getContext(), new Date(bodyFat.getWeightTime()));
            shareWeight.b = this.a.getString(R.string.body_score_desc);
            shareWeight.e = bodyFat.getFigure();
        }
        return shareWeight;
    }

    public ShareSleep parse2MonthSleep(int index) {
        HMMonthSummery monthSummery = this.b.getMonthSummery(index);
        ShareSleep shareSleep = new ShareSleep();
        if (monthSummery == null) {
            return shareSleep;
        }
        shareSleep.date = b(monthSummery.monthStartDate, monthSummery.monthEndDate);
        shareSleep.valueTitle = c(monthSummery.monthStartDate);
        if (monthSummery.daySleep > 0) {
            shareSleep.sleepDeepHour = (monthSummery.dayDeepSleep / 60) + "";
            shareSleep.sleepDeepMin = (monthSummery.dayDeepSleep % 60) + "";
            shareSleep.sleepDurationHour = (monthSummery.daySleep / 60) + "";
            shareSleep.sleepDurationMin = (monthSummery.daySleep % 60) + "";
            shareSleep.start = TimeUtils.formatTime_zh(TimeUtils.getDate(monthSummery.dayIntoSleepTime));
            shareSleep.startUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(monthSummery.dayIntoSleepTime));
            shareSleep.stop = TimeUtils.formatTime_zh(TimeUtils.getDate(monthSummery.dayWakeUpTime));
            shareSleep.stopUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(monthSummery.dayWakeUpTime));
            shareSleep.sleepScore = monthSummery.dayScore;
        }
        HMLog.d(c, "ShareSleep : " + shareSleep.toString(), new Object[0]);
        return shareSleep;
    }

    public ShareStep parse2MonthStep(int index) {
        HMMonthSummery monthSummery = this.b.getMonthSummery(index);
        ShareStep shareStep = new ShareStep();
        if (monthSummery == null) {
            return shareStep;
        }
        shareStep.d = g(monthSummery.monthStartDate);
        shareStep.date = b(monthSummery.monthStartDate, monthSummery.monthEndDate);
        if (monthSummery.daySteps > 0) {
            shareStep.step = monthSummery.totalSteps;
            shareStep.cal = monthSummery.totalCal + "";
            int i = monthSummery.dayActiveTime * monthSummery.totalStepDays;
            shareStep.a = (i / 60) + "";
            shareStep.b = (i % 60) + "";
            shareStep.distance = UnitManager.getInstance().formatValue(monthSummery.totalMiles);
            shareStep.distanceUnit = UnitManager.getInstance().getUnit(monthSummery.totalMiles);
        }
        HMLog.d(c, "ShareStep : " + shareStep.toString(), new Object[0]);
        return shareStep;
    }

    public ShareStep parse2Shoes(ShoesDaySportData shoesDaySportData) {
        StepsInfo stepsInfo = shoesDaySportData.getStepsInfo();
        ShareStep shareStep = new ShareStep();
        Calendar calendar = shoesDaySportData.getSportDay().calendar;
        shareStep.date = TimeUtils.formatDate_y(BraceletApp.getContext(), calendar.getTime());
        shareStep.time = calendar.getTimeInMillis();
        shareStep.d = h(calendar);
        if (stepsInfo != null && stepsInfo.getStepsCount() > 0) {
            shareStep.step = stepsInfo.getStepsCount();
            shareStep.cal = stepsInfo.getCalories() + "";
            shareStep.a = (stepsInfo.getActMinutes() / 60) + "";
            shareStep.b = (stepsInfo.getActMinutes() % 60) + "";
            shareStep.distance = UnitManager.getInstance().formatValue(stepsInfo.getDistance());
            shareStep.distanceUnit = UnitManager.getInstance().getUnit(stepsInfo.getDistance());
        }
        HMLog.d(c, "ShareStep : " + shareStep.toString(), new Object[0]);
        return shareStep;
    }

    public ShareSleep parse2Sleep(DaySportData data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        ShareSleep shareSleep = new ShareSleep();
        SportDay sportDay = data.getSportDay();
        shareSleep.date = TimeUtils.formatDate_y(BraceletApp.getContext(), sportDay.calendar.getTime());
        shareSleep.time = sportDay.calendar.getTimeInMillis();
        shareSleep.valueTitle = d(sportDay);
        SleepInfo sleepInfo = data.getSleepInfo();
        if (sleepInfo != null && sleepInfo.getHasSleep()) {
            shareSleep.sleepDeepHour = (sleepInfo.getNonRemCount() / 60) + "";
            shareSleep.sleepDeepMin = (sleepInfo.getNonRemCount() % 60) + "";
            shareSleep.sleepDurationHour = (sleepInfo.getSleepCount() / 60) + "";
            shareSleep.sleepDurationMin = (sleepInfo.getSleepCount() % 60) + "";
            shareSleep.start = TimeUtils.formatTime_zh(sleepInfo.getStartDate());
            shareSleep.startUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), sleepInfo.getStartDate());
            shareSleep.stop = TimeUtils.formatTime_zh(sleepInfo.getStopDate());
            shareSleep.stopUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), sleepInfo.getStopDate());
            shareSleep.sleepScore = sleepInfo.getSleepScore();
        }
        HMLog.d(c, "ShareSleep : " + shareSleep.toString(), new Object[0]);
        return shareSleep;
    }

    public ShareStep parse2Step(DaySportData daySportData) {
        if (daySportData == null || daySportData.isEmpty()) {
            HMLog.d(c, "DaySportData is null or empty", new Object[0]);
            return new ShareStep();
        }
        ShareStep shareStep = new ShareStep();
        SportDay sportDay = daySportData.getSportDay();
        shareStep.d = h(sportDay.calendar);
        shareStep.date = TimeUtils.formatDate_y(BraceletApp.getContext(), sportDay.calendar.getTime());
        shareStep.time = sportDay.calendar.getTimeInMillis();
        StepsInfo stepsInfo = TextUtils.equals(daySportData.getKey(), SportDay.getToday().getKey()) ? HMDataCacheCenter.getInstance().getTodaySportData().getStepsInfo() : daySportData.getStepsInfo();
        if (stepsInfo != null && stepsInfo.getStepsCount() > 0) {
            shareStep.step = stepsInfo.getStepsCount();
            StringBuilder sb = new StringBuilder();
            sb.append(stepsInfo.getCalories());
            String string = "";
            sb.append("");
            shareStep.cal = sb.toString();
            shareStep.a = (stepsInfo.getActMinutes() / 60) + "";
            shareStep.b = (stepsInfo.getActMinutes() % 60) + "";
            shareStep.distance = UnitManager.getInstance().formatValue(stepsInfo.getDistance());
            shareStep.distanceUnit = UnitManager.getInstance().getUnit(stepsInfo.getDistance());
            int goalStepsCount = HMPersonInfo.getInstance().getMiliConfig().getGoalStepsCount();
            HMLog.d(c, "stepGoal : " + goalStepsCount, new Object[0]);
            HMLog.d(c, "this day : " + stepsInfo.getSportDay().getKey(), new Object[0]);
            if (TextUtils.equals(SportDay.getToday().getKey(), stepsInfo.getSportDay().getKey()) && stepsInfo.getStepsCount() >= goalStepsCount) {
                string = this.a.getString(R.string.share_achieve_goal_equal);
            }
            shareStep.c = string;
            shareStep.d = h(stepsInfo.getSportDay().calendar);
        }
        HMLog.d(c, "ShareStep : " + shareStep.toString(), new Object[0]);
        return shareStep;
    }

    public ShareSleep parse2WeekSleep(int index) {
        HMWeekSummery weekSummery = this.b.getWeekSummery(index);
        ShareSleep shareSleep = new ShareSleep();
        if (weekSummery == null) {
            return shareSleep;
        }
        shareSleep.date = l(weekSummery.weekStartDate, weekSummery.weekEndDate);
        shareSleep.valueTitle = e(index, this.b.getWeekSummery().size());
        if (weekSummery.daySleep > 0) {
            shareSleep.sleepDeepHour = (weekSummery.dayDeepSleep / 60) + "";
            shareSleep.sleepDeepMin = (weekSummery.dayDeepSleep % 60) + "";
            shareSleep.sleepDurationHour = (weekSummery.daySleep / 60) + "";
            shareSleep.sleepDurationMin = (weekSummery.daySleep % 60) + "";
            shareSleep.start = TimeUtils.formatTime_zh(TimeUtils.getDate(weekSummery.dayIntoSleepTime));
            shareSleep.startUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(weekSummery.dayIntoSleepTime));
            shareSleep.stop = TimeUtils.formatTime_zh(TimeUtils.getDate(weekSummery.dayWakeUpTime));
            shareSleep.stopUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(weekSummery.dayWakeUpTime));
            shareSleep.sleepScore = weekSummery.dayScore;
        }
        HMLog.d(c, "ShareSleep : " + shareSleep.toString(), new Object[0]);
        return shareSleep;
    }

    public ShareStep parse2WeekStep(int index) {
        HMWeekSummery weekSummery = this.b.getWeekSummery(index);
        ShareStep shareStep = new ShareStep();
        if (weekSummery == null) {
            return shareStep;
        }
        shareStep.date = l(weekSummery.weekStartDate, weekSummery.weekEndDate);
        shareStep.d = i(index, this.b.getWeekSummery().size());
        if (weekSummery.daySteps > 0) {
            shareStep.step = weekSummery.totalSteps;
            shareStep.cal = weekSummery.totalCal + "";
            int i = weekSummery.dayActiveTime * weekSummery.totalStepDays;
            shareStep.a = (i / 60) + "";
            shareStep.b = (i % 60) + "";
            shareStep.distance = UnitManager.getInstance().formatValue(weekSummery.totalMiles);
            shareStep.distanceUnit = UnitManager.getInstance().getUnit(weekSummery.totalMiles);
        }
        HMLog.d(c, "ShareStep : " + shareStep.toString(), new Object[0]);
        return shareStep;
    }

    public ShareWeight parse2Weight(WeightShare weight) {
        ShareWeight shareWeight = new ShareWeight();
        if (weight != null) {
            HMLog.d(c, "weight data : " + weight.toString(), new Object[0]);
            shareWeight.userid = weight.getUserid();
            shareWeight.bmi = weight.getBmi();
            shareWeight.bodyFat = weight.getBodyFat();
            shareWeight.weightValue = weight.getWeightValue();
            shareWeight.d = weight.getCompareValue();
            shareWeight.a = weight.getWeightUnitStr();
            shareWeight.c = TimeUtils.formatDate_y(BraceletApp.getContext(), new Date(weight.getWeightTime()));
            if (weight.getType() == 1) {
                shareWeight.b = this.a.getString(R.string.share_weight_last_title);
            } else {
                shareWeight.b = this.a.getString(R.string.share_weight_target_title);
            }
            HMLog.d(c, "weight share : " + shareWeight.b, new Object[0]);
            shareWeight.e = weight.getFigure();
        }
        return shareWeight;
    }

    public ShareSleep parse2Sleep(HMSummery data) {
        Sleep sleep = data.sleep;
        ShareSleep shareSleep = new ShareSleep();
        SportDay sportDayFromString = SportDay.fromString(data.date);
        shareSleep.date = TimeUtils.formatDate_y(BraceletApp.getContext(), sportDayFromString.calendar.getTime());
        shareSleep.time = sportDayFromString.calendar.getTimeInMillis();
        shareSleep.valueTitle = d(sportDayFromString);
        if (sleep != null && sleep.sleepMinutes > 0) {
            shareSleep.sleepDeepHour = (sleep.dp / 60) + "";
            shareSleep.sleepDeepMin = (sleep.dp % 60) + "";
            shareSleep.sleepDurationHour = (sleep.sleepMinutes / 60) + "";
            shareSleep.sleepDurationMin = (sleep.sleepMinutes % 60) + "";
            shareSleep.start = TimeUtils.formatTime_zh(new Date(sleep.st));
            shareSleep.startUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), new Date(sleep.st));
            shareSleep.stop = TimeUtils.formatTime_zh(new Date(sleep.ed));
            shareSleep.stopUnit = TimeUtils.getPrefix_zh(BraceletApp.getContext(), new Date(sleep.ed));
            shareSleep.sleepScore = sleep.score;
        }
        HMLog.d(c, "ShareSleep : " + shareSleep.toString(), new Object[0]);
        return shareSleep;
    }

    public ShareStep parse2Step(int index) {
        StepsInfo stepsInfo;
        DaySportData todaySportData = HMDataCacheCenter.getInstance().getTodaySportData();
        ShareStep shareStep = new ShareStep();
        SportDay sportDay = this.b.getSportDay(index);
        shareStep.d = h(sportDay.calendar);
        shareStep.date = TimeUtils.formatDate_y(BraceletApp.getContext(), sportDay.calendar.getTime());
        shareStep.time = sportDay.calendar.getTimeInMillis();
        if (todaySportData != null && !todaySportData.isEmpty()) {
            if (TextUtils.equals(todaySportData.getKey(), SportDay.getToday().getKey())) {
                stepsInfo = HMDataCacheCenter.getInstance().getTodaySportData().getStepsInfo();
            } else {
                stepsInfo = todaySportData.getStepsInfo();
            }
            if (stepsInfo != null && stepsInfo.getStepsCount() > 0) {
                shareStep.step = stepsInfo.getStepsCount();
                StringBuilder sb = new StringBuilder();
                sb.append(stepsInfo.getCalories());
                String string = "";
                sb.append("");
                shareStep.cal = sb.toString();
                shareStep.a = (stepsInfo.getActMinutes() / 60) + "";
                shareStep.b = (stepsInfo.getActMinutes() % 60) + "";
                shareStep.distance = UnitManager.getInstance().formatValue(stepsInfo.getDistance());
                shareStep.distanceUnit = UnitManager.getInstance().getUnit(stepsInfo.getDistance());
                int goalStepsCount = HMPersonInfo.getInstance().getMiliConfig().getGoalStepsCount();
                HMLog.d(c, "stepGoal : " + goalStepsCount, new Object[0]);
                HMLog.d(c, "this day : " + stepsInfo.getSportDay().getKey(), new Object[0]);
                if (TextUtils.equals(SportDay.getToday().getKey(), stepsInfo.getSportDay().getKey()) && stepsInfo.getStepsCount() >= goalStepsCount) {
                    string = this.a.getString(R.string.share_achieve_goal_equal);
                }
                shareStep.c = string;
                shareStep.d = h(stepsInfo.getSportDay().calendar);
            }
            HMLog.d(c, "ShareStep : " + shareStep.toString(), new Object[0]);
            return shareStep;
        }
        HMLog.d(c, "DaySportData is null or empty", new Object[0]);
        return shareStep;
    }

    public ShareStep parse2Step(HMSummery data) {
        int i;
        Steps steps = data.steps;
        ShareStep shareStep = new ShareStep();
        Calendar calendar = SportDay.fromString(data.date).calendar;
        shareStep.date = TimeUtils.formatDate_y(BraceletApp.getContext(), calendar.getTime());
        shareStep.time = calendar.getTimeInMillis();
        shareStep.d = h(calendar);
        if (steps != null && (i = steps.ttl) > 0) {
            shareStep.step = i;
            StringBuilder sb = new StringBuilder();
            sb.append(steps.cal);
            String string = "";
            sb.append("");
            shareStep.cal = sb.toString();
            shareStep.a = (steps.activeTime / 60) + "";
            shareStep.b = (steps.activeTime % 60) + "";
            shareStep.distance = UnitManager.getInstance().formatValue(steps.dis);
            shareStep.distanceUnit = UnitManager.getInstance().getUnit(steps.dis);
            int goalStepsCount = HMPersonInfo.getInstance().getMiliConfig().getGoalStepsCount();
            HMLog.d(c, " HMSummery stepGoal : " + data.goal, new Object[0]);
            if (TimeUtils.isToday(calendar) && steps.ttl >= goalStepsCount) {
                string = this.a.getString(R.string.share_achieve_goal_equal);
            }
            shareStep.c = string;
            shareStep.d = h(calendar);
        }
        HMLog.d(c, "ShareStep : " + shareStep.toString(), new Object[0]);
        return shareStep;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ShareStep parse2Step(StepInfo stepInfo, int timeType) {
        ShareStep shareStep = new ShareStep();
        shareStep.step = stepInfo.getSteps();
        shareStep.cal = String.valueOf(stepInfo.getCal());
        shareStep.distance = UnitManager.getInstance().formatValue(stepInfo.getDistance());
        shareStep.distanceUnit = UnitManager.getInstance().getUnit(stepInfo.getDistance());
        int walkTime = stepInfo.getWalkTime() + stepInfo.getRunTime();
        shareStep.a = String.valueOf(walkTime / 60);
        shareStep.b = String.valueOf(walkTime % 60);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(stepInfo.getTime());
        switch (timeType) {
            case 16:
                shareStep.date = TimeUtils.formatDate_y(BraceletApp.getContext(), calendar.getTime());
                shareStep.time = calendar.getTimeInMillis();
                shareStep.d = h(calendar);
                shareStep.c = (!TimeUtils.isToday(calendar) || shareStep.step < HMPersonInfo.getInstance().getMiliConfig().getGoalStepsCount()) ? "" : this.a.getString(R.string.share_achieve_goal_equal);
                return shareStep;
            case 17:
                shareStep.d = j(calendar);
                HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
                shareStep.date = f(healthDataTimeUtils.getFirstDayOfWeekTime(stepInfo.getTime()), healthDataTimeUtils.getLastDayOfWeekTime(stepInfo.getTime()));
                return shareStep;
            case 18:
                shareStep.d = g(TimeUtils.formatDate("yyyy-MM-dd", stepInfo.getTime()));
                HealthDataTimeUtils healthDataTimeUtils2 = HealthDataTimeUtils.INSTANCE;
                shareStep.date = f(healthDataTimeUtils2.getFirstDayOfMonthTime(stepInfo.getTime()), healthDataTimeUtils2.getLastDayOfMonthTime(stepInfo.getTime()));
                return shareStep;
            case 19:
                shareStep.d = k(calendar);
                HealthDataTimeUtils healthDataTimeUtils3 = HealthDataTimeUtils.INSTANCE;
                shareStep.date = f(healthDataTimeUtils3.getFirstDayOfYearTime(stepInfo.getTime()), healthDataTimeUtils3.getLastDayOfYearTime(stepInfo.getTime()));
                return shareStep;
            default:
                return shareStep;
        }
    }
}
