package com.xiaomi.hm.health.manager;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.CompareModel;
import com.xiaomi.hm.health.databases.model.CompareModelDao;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.dataprocess.ActiveItem;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesDaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.dataprocess.StageSteps;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.jobcenter.job.HMCompareModelInjectJob;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.model.summery.Steps;
import com.xiaomi.hm.health.ui.information.DetailInfoCompareHelper;
import com.xiaomi.hm.health.ui.information.modle.StepDetailInfo;
import com.xiaomi.hm.health.ui.information.modle.StepTimeLineInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class SportDataManager {
    private static final String o = "SportDataManager";
    private static final int p = 255;
    private static final String q = "2016-01-01";
    private Context a;
    private CopyOnWriteArrayList<HMSummery> b;
    private CopyOnWriteArrayList<HMWeekSummery> c;
    private CopyOnWriteArrayList<HMMonthSummery> d;
    private RealtimeStep e;
    private int f;
    private DaySportData g;
    private DaySportData h;
    private ShoesDaySportData i;
    private List<CompareModel> j;
    private float k;
    private List<CompareModel> l;
    private List<CompareModel> m;
    private List<CompareModel> n;

    public class SleepShowData {
        public String awakeTime;
        public String awakeTimeReg;
        public String time;
        public String timeReg;
        public int durationHour = 0;
        public int durationMin = 0;
        public int deepDurationHour = 0;
        public int deepDurationMin = 0;
        public int lightDurationHour = 0;
        public int lightDurationMin = 0;
        public int awakeDuration = 0;
        public int awakeNum = 0;
        public int sleepFeeling = 0;
        public int intoSleepTime = 0;
        public int lazyBedTime = 0;
        public int turnOverTime = 0;
        public int dreamTime = 0;
        public int sleepScore = 0;
        public boolean isEmpty = true;
        public boolean isRemSupported = false;

        public SleepShowData() {
        }

        public int getDeepDuration() {
            return (this.deepDurationHour * 60) + this.deepDurationMin;
        }

        public int getDuration() {
            return (this.durationHour * 60) + this.durationMin;
        }

        public int getLightDuration() {
            return (this.lightDurationHour * 60) + this.lightDurationMin;
        }

        public String toString() {
            return "    \nsleep duration : " + this.durationHour + ":" + this.durationMin + "\n sleep deep duration : " + this.deepDurationHour + ":" + this.deepDurationMin + "\nsleep light duration : " + this.lightDurationHour + ":" + this.lightDurationMin + "\n          sleep time : " + this.time + "\n          awake time : " + this.awakeTime + "\n      awake duration : " + this.awakeDuration + "min \n             isEmpty : " + this.isEmpty + "\n             awakeNum : " + this.awakeNum + "\n";
        }
    }

    public class StepShowData {
        public int activeHour;
        public int activeMin;
        public int calorie;
        public String calorieUnit;
        public String distance;
        public String distanceUnit;
        public boolean isEmpty;
        public int stepCount;

        public StepShowData() {
        }

        public String toString() {
            return "\n      stepCount : " + this.stepCount + "\nactive duration : " + this.activeHour + ":" + this.activeMin + "\n       distance : " + this.distance + ":" + this.distanceUnit + "\n        calorie : " + this.calorie + this.calorieUnit + "\n";
        }
    }

    public static class a {
        public static final SportDataManager a = new SportDataManager();

        private a() {
        }
    }

    private SportDataManager() {
        this.b = new CopyOnWriteArrayList<>();
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        this.a = BraceletApp.getContext();
    }

    private StepsInfo a() {
        StepsInfo stepsInfo = new StepsInfo();
        stepsInfo.copy(HMDataCacheCenter.getInstance().getTodaySportData().getStepsInfo());
        HMLog.d(o, "raw step info : " + stepsInfo.toString(), new Object[0]);
        stepsInfo.setStepsCount(this.e.getTotalStep() > stepsInfo.getStepsCount() ? this.e.getTotalStep() : stepsInfo.getStepsCount());
        if (this.e.isSupportStepExtra()) {
            stepsInfo.setDistance(this.e.getTotalDis() > stepsInfo.getDistance() ? this.e.getTotalDis() : stepsInfo.getDistance());
            stepsInfo.setCalories(this.e.getTotalCal() > stepsInfo.getCalories() ? this.e.getTotalCal() : stepsInfo.getCalories());
        }
        HMLog.d(o, "cover step info : " + stepsInfo.toString(), new Object[0]);
        return stepsInfo;
    }

    private HMSummery b() {
        HMSummery hMSummery = new HMSummery();
        hMSummery.copy(p());
        Steps steps = hMSummery.steps;
        if (steps != null) {
            steps.ttl = this.e.getWalking();
            if (this.e.isSupportStepExtra()) {
                hMSummery.steps.dis = this.e.getTotalDis();
                hMSummery.steps.cal = this.e.getTotalCal();
            }
        }
        return hMSummery;
    }

    private String c(int index, int type) {
        String str;
        if (type != 0) {
            str = type != 1 ? getMonthSummery().get(index).monthStartDate : getWeekSummery().get(index).weekStartDate;
        } else {
            str = getDaySummery().get(index).date;
        }
        HMLog.d(o, "key : " + str, new Object[0]);
        return str;
    }

    private HMSummery d(int position) {
        return position < 0 ? new HMSummery() : this.b.get(position);
    }

    private int e(int type) {
        return type != 2 ? R.string.step_chart_no_data : R.string.sleep_chart_no_data;
    }

    private int f(String key, int type) {
        int iOffsetDay;
        int size;
        Calendar calendar = Calendar.getInstance();
        SportDay sportDay = new SportDay(calendar.get(1), calendar.get(2), calendar.get(5));
        SportDay sportDayFromString = SportDay.fromString(key);
        if (type == 0) {
            iOffsetDay = sportDay.offsetDay(sportDayFromString);
            size = getDaySummery().size();
        } else if (type != 1) {
            iOffsetDay = sportDay.offsetMonth(sportDayFromString);
            size = getMonthSummery().size();
        } else {
            iOffsetDay = sportDay.offsetWeek(sportDayFromString);
            size = getWeekSummery().size();
        }
        int i = size - 1;
        int i2 = i - iOffsetDay;
        HMLog.d(o, "size: " + i + ",index:" + i2, new Object[0]);
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    private String g(SportDay day) {
        return TimeUtils.formatDate_no_y(BraceletApp.getContext(), day.calendar.getTime(), false);
    }

    public static SportDataManager getInstance() {
        return a.a;
    }

    private static long h() {
        int i = Calendar.getInstance().get(7) - 1;
        int i2 = i == 1 ? 0 : 1 - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(5, i2);
        return gregorianCalendar.getTimeInMillis();
    }

    private int[] i(int fromIndex, int fromType, int toType) {
        int[] iArr = new int[2];
        if (fromType == 0) {
            iArr[0] = fromIndex;
        } else if (fromType == 1) {
            HMWeekSummery weekSummery = getWeekSummery(fromIndex);
            iArr[0] = f(weekSummery.weekStartDate, toType);
            iArr[1] = f(weekSummery.weekEndDate, toType);
        } else if (fromType == 2) {
            HMMonthSummery monthSummery = getMonthSummery(fromIndex);
            iArr[0] = f(monthSummery.monthStartDate, toType);
            iArr[1] = f(monthSummery.monthEndDate, toType);
        }
        return iArr;
    }

    private SportDay j() {
        long registerDate = AccountModuleKt.getAccountService().getRegisterDate() / 1000;
        return registerDate == -1 ? SportDay.fromString(q) : SportDay.fromString(HMDateUtil.formatDateSimple(registerDate * 1000));
    }

    private double k() {
        Calendar calendar = Calendar.getInstance();
        double d = ((calendar.get(11) * 60) + calendar.get(12)) / 10;
        return ((((((Math.pow(10.0d, -12.0d) * (-5.5399043142d)) * Math.pow(d, 6.0d)) + ((Math.pow(10.0d, -9.0d) * 2.3441969739d) * Math.pow(d, 5.0d))) - ((Math.pow(10.0d, -7.0d) * 3.6491149548d) * Math.pow(d, 4.0d))) + ((Math.pow(10.0d, -5.0d) * 2.5253739015d) * Math.pow(d, 3.0d))) - ((Math.pow(10.0d, -4.0d) * 6.9177143123d) * Math.pow(d, 2.0d))) + (d * 0.0075491425943d);
    }

    private int[] l(String key, int type) {
        int[] iArr = {R.string.loading, R.drawable.slp_empty_warning};
        String downloadDataStartDate = (type == 0 || type == 2 || type == 3) ? HMDataCacheCenter.getInstance().getDownloadDataStartDate() : HMDataCacheCenter.getInstance().getShoesDownloadDataStartDate();
        SportDay sportDayFromString = SportDay.fromString(downloadDataStartDate);
        SportDay sportDayFromString2 = SportDay.fromString(key);
        HMLog.i(o, "DownloadDataStartDate : " + downloadDataStartDate, new Object[0]);
        if (TextUtils.isEmpty(downloadDataStartDate)) {
            if (HMDataCacheCenter.getInstance().isActivDataSynced()) {
                HMLog.i(o, "isActivDataSynced ", new Object[0]);
                if (TextUtils.isEmpty(downloadDataStartDate) || sportDayFromString2.getCalendar().getTimeInMillis() >= sportDayFromString.getCalendar().getTimeInMillis()) {
                    iArr[0] = e(type);
                    iArr[1] = R.drawable.slp_empty_warning;
                } else if (NetUtil.isNetworkConnected(this.a)) {
                    iArr[0] = R.string.load_failed;
                    iArr[1] = R.drawable.slp_empty_warning;
                } else {
                    iArr[0] = R.string.no_network;
                    iArr[1] = R.drawable.slp_empty_warning;
                }
            } else if (NetUtil.isNetworkConnected(this.a)) {
                iArr[0] = R.string.loading;
                iArr[1] = R.drawable.slp_empty_warning;
            } else {
                iArr[0] = R.string.no_network;
                iArr[1] = R.drawable.slp_empty_warning;
            }
        } else if (sportDayFromString2.getCalendar().getTimeInMillis() >= sportDayFromString.getCalendar().getTimeInMillis()) {
            iArr[0] = e(type);
            iArr[1] = R.drawable.slp_empty_warning;
        } else if (NetUtil.isNetworkConnected(this.a)) {
            iArr[0] = R.string.load_failed;
            iArr[1] = R.drawable.slp_empty_warning;
        } else {
            iArr[0] = R.string.no_network;
            iArr[1] = R.drawable.slp_empty_warning;
        }
        return iArr;
    }

    private Steps m(int position) {
        Steps steps = d(position).steps;
        return steps == null ? new Steps(0, 0, 0, 0, 0, 0, 0, 0) : steps;
    }

    private static long n() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        return calendar.getTimeInMillis();
    }

    private String o(ActiveItem item) {
        return BraceletApp.getContext().getString(R.string.time_line_start_end, TimeUtils.formatTime(BraceletApp.getContext(), item.start), TimeUtils.formatTime(BraceletApp.getContext(), item.stop));
    }

    private HMSummery p() {
        return d(this.b.size() - 1);
    }

    private String q(SportDay day) {
        return TimeUtils.formatDate(BraceletApp.getContext(), day.calendar.getTime());
    }

    private SleepShowData r(HMMonthSummery info) {
        SleepShowData sleepShowData = new SleepShowData();
        if (info == null || info.daySleep <= 0) {
            sleepShowData.time = "00:00";
            sleepShowData.awakeTime = "00:00";
            sleepShowData.awakeDuration = 0;
            sleepShowData.durationHour = 0;
            sleepShowData.durationMin = 0;
            sleepShowData.deepDurationHour = 0;
            sleepShowData.deepDurationMin = 0;
            sleepShowData.lightDurationHour = 0;
            sleepShowData.lightDurationMin = 0;
            sleepShowData.isEmpty = true;
            sleepShowData.intoSleepTime = 0;
            sleepShowData.lazyBedTime = 0;
            sleepShowData.dreamTime = 0;
        } else {
            sleepShowData.time = TimeUtils.formatTime_zh(TimeUtils.getDate(info.dayIntoSleepTime));
            sleepShowData.timeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(info.dayIntoSleepTime));
            sleepShowData.awakeTime = TimeUtils.formatTime_zh(TimeUtils.getDate(info.dayWakeUpTime));
            sleepShowData.awakeTimeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(info.dayWakeUpTime));
            sleepShowData.awakeDuration = info.dayAWake;
            int i = info.daySleep;
            sleepShowData.durationHour = i / 60;
            sleepShowData.durationMin = i % 60;
            int i2 = info.dayDeepSleep;
            sleepShowData.deepDurationHour = i2 / 60;
            sleepShowData.deepDurationMin = i2 % 60;
            int i3 = info.dayLowSleep;
            sleepShowData.lightDurationHour = i3 / 60;
            sleepShowData.lightDurationMin = i3 % 60;
            sleepShowData.isEmpty = false;
            sleepShowData.intoSleepTime = info.dayIntoSleepCoast;
            sleepShowData.lazyBedTime = info.dayLazyBedTime;
            sleepShowData.dreamTime = info.dayRem;
        }
        return sleepShowData;
    }

    private SleepShowData s(HMWeekSummery info) {
        SleepShowData sleepShowData = new SleepShowData();
        if (info == null || info.daySleep <= 0) {
            sleepShowData.time = "00:00";
            sleepShowData.awakeTime = "00:00";
            sleepShowData.awakeDuration = 0;
            sleepShowData.durationHour = 0;
            sleepShowData.durationMin = 0;
            sleepShowData.deepDurationHour = 0;
            sleepShowData.deepDurationMin = 0;
            sleepShowData.lightDurationHour = 0;
            sleepShowData.lightDurationMin = 0;
            sleepShowData.isEmpty = true;
            sleepShowData.intoSleepTime = 0;
            sleepShowData.lazyBedTime = 0;
            sleepShowData.dreamTime = 0;
        } else {
            sleepShowData.time = TimeUtils.formatTime_zh(TimeUtils.getDate(info.dayIntoSleepTime));
            sleepShowData.timeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(info.dayIntoSleepTime));
            sleepShowData.awakeTime = TimeUtils.formatTime_zh(TimeUtils.getDate(info.dayWakeUpTime));
            sleepShowData.awakeTimeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), TimeUtils.getDate(info.dayWakeUpTime));
            sleepShowData.awakeDuration = info.dayAWake;
            int i = info.daySleep;
            sleepShowData.durationHour = i / 60;
            sleepShowData.durationMin = i % 60;
            int i2 = info.dayDeepSleep;
            sleepShowData.deepDurationHour = i2 / 60;
            sleepShowData.deepDurationMin = i2 % 60;
            int i3 = info.dayLowSleep;
            sleepShowData.lightDurationHour = i3 / 60;
            sleepShowData.lightDurationMin = i3 % 60;
            sleepShowData.isEmpty = false;
            sleepShowData.intoSleepTime = info.dayIntoSleepCoast;
            sleepShowData.lazyBedTime = info.dayLazyBedTime;
            sleepShowData.dreamTime = info.dayRem;
        }
        HMLog.d(o, "SleepShowData : " + sleepShowData.toString(), new Object[0]);
        return sleepShowData;
    }

    private StepShowData t(HMMonthSummery info) {
        int i;
        StepShowData stepShowData = new StepShowData();
        if (info == null || (i = info.daySteps) <= 0) {
            stepShowData.stepCount = 0;
            stepShowData.activeHour = 0;
            stepShowData.activeMin = 0;
            stepShowData.distance = "0";
            stepShowData.distanceUnit = UnitManager.getInstance().getUnit(0);
            stepShowData.calorie = 0;
            stepShowData.isEmpty = true;
        } else {
            stepShowData.stepCount = i;
            int i2 = info.dayActiveTime;
            stepShowData.activeHour = i2 / 60;
            stepShowData.activeMin = i2 % 60;
            stepShowData.distance = UnitManager.getInstance().formatValue(info.totalMiles);
            stepShowData.distanceUnit = UnitManager.getInstance().getUnit(info.totalMiles);
            stepShowData.calorie = info.totalCal;
            stepShowData.isEmpty = false;
        }
        HMLog.d(o, "day StepShowData :" + stepShowData.toString(), new Object[0]);
        return stepShowData;
    }

    private StepShowData u(HMWeekSummery info) {
        int i;
        StepShowData stepShowData = new StepShowData();
        if (info == null || (i = info.daySteps) <= 0) {
            stepShowData.stepCount = 0;
            stepShowData.activeHour = 0;
            stepShowData.activeMin = 0;
            stepShowData.distance = "0";
            stepShowData.distanceUnit = UnitManager.getInstance().getUnit(0);
            stepShowData.calorie = 0;
            stepShowData.isEmpty = true;
        } else {
            stepShowData.stepCount = i;
            int i2 = info.dayActiveTime;
            stepShowData.activeHour = i2 / 60;
            stepShowData.activeMin = i2 % 60;
            stepShowData.distance = UnitManager.getInstance().formatValue(info.totalMiles);
            stepShowData.distanceUnit = UnitManager.getInstance().getUnit(info.totalMiles);
            stepShowData.calorie = info.totalCal;
            stepShowData.isEmpty = false;
        }
        HMLog.d(o, "day StepShowData :" + stepShowData.toString(), new Object[0]);
        return stepShowData;
    }

    private StepShowData v(Steps info) {
        int i;
        StepShowData stepShowData = new StepShowData();
        if (info == null || (i = info.ttl) <= 0) {
            stepShowData.stepCount = 0;
            stepShowData.activeHour = 0;
            stepShowData.activeMin = 0;
            stepShowData.distance = "0";
            stepShowData.distanceUnit = UnitManager.getInstance().getUnit(0);
            stepShowData.calorie = 0;
            stepShowData.isEmpty = true;
        } else {
            stepShowData.stepCount = i;
            int i2 = info.activeTime;
            stepShowData.activeHour = i2 / 60;
            stepShowData.activeMin = i2 % 60;
            stepShowData.distance = UnitManager.getInstance().formatValue(info.dis);
            stepShowData.distanceUnit = UnitManager.getInstance().getUnit(info.dis);
            stepShowData.calorie = info.cal;
            stepShowData.isEmpty = false;
        }
        HMLog.d(o, "day StepShowData :" + stepShowData.toString(), new Object[0]);
        return stepShowData;
    }

    private ArrayList<StepTimeLineInfo> w(ArrayList<ActiveItem> activeItems, String key) {
        ArrayList<StepTimeLineInfo> arrayList = new ArrayList<>();
        SportDay sportDayFromString = !TextUtils.isEmpty(key) ? SportDay.fromString(key) : null;
        if (activeItems != null) {
            for (ActiveItem activeItem : activeItems) {
                if (sportDayFromString == null || TrackRecordManager.getInstance().getTrackRecordsCountByTimeRange(sportDayFromString.getTimestamp() + ((long) (activeItem.start * 60 * 1000)), sportDayFromString.getTimestamp() + ((long) (activeItem.stop * 60 * 1000))) <= 0) {
                    StepTimeLineInfo stepTimeLineInfo = new StepTimeLineInfo();
                    int i = activeItem.stop - activeItem.start;
                    stepTimeLineInfo.durationHour = i / 60;
                    stepTimeLineInfo.durationMin = i % 60;
                    stepTimeLineInfo.step = activeItem.steps;
                    stepTimeLineInfo.stepUnit = this.a.getString(R.string.unit_step);
                    stepTimeLineInfo.distance = UnitManager.getInstance().formatValue(activeItem.distance);
                    stepTimeLineInfo.distanceUnit = UnitManager.getInstance().getUnit(activeItem.distance);
                    stepTimeLineInfo.calorie = activeItem.calories;
                    stepTimeLineInfo.calorieUnit = this.a.getString(R.string.unit_kc);
                    String[] stringArray = this.a.getResources().getStringArray(R.array.timeline_type);
                    int i2 = activeItem.mode;
                    if (i2 >= 0 && i2 < stringArray.length) {
                        stepTimeLineInfo.title = stringArray[activeItem.mode] + " " + o(activeItem);
                        int i3 = -1;
                        int i4 = activeItem.mode;
                        if (i4 == 1) {
                            i3 = R.drawable.icon_step_slow_walk;
                        } else if (i4 == 2 || i4 == 3) {
                            i3 = R.drawable.icon_step_walk;
                        } else if (i4 == 4) {
                            i3 = R.drawable.icon_step_run;
                        } else if (i4 == 7) {
                            i3 = R.drawable.mode_step_micro_activie;
                        }
                        if (i3 > 0) {
                            stepTimeLineInfo.icon = ContextCompat.getDrawable(this.a, i3);
                            arrayList.add(stepTimeLineInfo);
                        }
                    }
                } else {
                    HMLog.d(o, "item.start : " + activeItem.start + "," + activeItem.stop, new Object[0]);
                }
            }
        }
        return arrayList;
    }

    public void deinitDetailPage() {
        List<CompareModel> list = this.j;
        if (list != null) {
            list.clear();
            this.j = null;
        }
        List<CompareModel> list2 = this.l;
        if (list2 != null) {
            list2.clear();
            this.l = null;
        }
        List<CompareModel> list3 = this.m;
        if (list3 != null) {
            list3.clear();
            this.m = null;
        }
        List<CompareModel> list4 = this.n;
        if (list4 != null) {
            list4.clear();
            this.n = null;
        }
    }

    public int getCount() {
        int iOffsetDay = SportDay.getToday().offsetDay(j());
        StringBuilder sb = new StringBuilder();
        sb.append("  all count:");
        int i = iOffsetDay + 1;
        sb.append(i);
        HMLog.d(o, sb.toString(), new Object[0]);
        if (this.f != i) {
            this.f = i;
        }
        return i;
    }

    public SleepShowData getDaySleepShow(int position) {
        return parse2Sleep(d(position).sleep);
    }

    public StepShowData getDayStepShow(int position) {
        return v(m(position));
    }

    public CopyOnWriteArrayList<HMSummery> getDaySummery() {
        return this.b;
    }

    public String getDaySummeryStr(int position) {
        String str = d(position).date;
        Calendar calendar = Calendar.getInstance();
        HMLog.d(o, "mCurrentDay key :" + str, new Object[0]);
        SportDay sportDayFromString = SportDay.fromString(str);
        return sportDayFromString.year == calendar.get(1) ? g(sportDayFromString) : q(sportDayFromString);
    }

    public int getIndex(String key) {
        return SportDay.fromString(key).offsetDay(j());
    }

    public String getKey(int position) {
        return getSportDay(position).getKey();
    }

    public String getLastDataDate() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            if (this.b.get(size) != null && this.b.get(size).sleep != null && this.b.get(size).sleep.sleepMinutes > 0) {
                return this.b.get(size).date;
            }
            if (this.b.get(size) != null && this.b.get(size).nap != null && this.b.get(size).nap.getNapDuration() > 0) {
                return this.b.get(size).date;
            }
        }
        return null;
    }

    public String getLastNapDataDate() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            if (this.b.get(size) != null && this.b.get(size).nap != null && this.b.get(size).nap.getNapDuration() > 0) {
                return this.b.get(size).date;
            }
        }
        return null;
    }

    public SleepShowData getMonthSleepShow(int position) {
        return r(getMonthSummery(position));
    }

    public StepShowData getMonthStepShow(int position) {
        return t(getMonthSummery(position));
    }

    public CopyOnWriteArrayList<HMMonthSummery> getMonthSummery() {
        return this.d;
    }

    public String getMonthSummeryStr(int position) {
        return TimeUtils.formatDate_no_d(BraceletApp.getContext(), SportDay.fromString(getMonthSummery(position).monthStartDate).calendar.getTime());
    }

    public int[] getNormandyStatus(String key) {
        return l(key, 3);
    }

    public int[] getShoesStatus(String key) {
        return l(key, 1);
    }

    public int[] getSleepStatus(String key) {
        return l(key, 2);
    }

    public SportDay getSportDay(int position) {
        HMLog.d(o, "first position : " + position, new Object[0]);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int count = (getCount() - 1) - position;
        calendar.add(6, -count);
        HMLog.d(o, " last position : " + count, new Object[0]);
        return new SportDay(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    public SportDay getStartDay() {
        return j();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    public int getStepCompareRate(int steps, boolean isToday) {
        int iIntValue;
        HMPersonInfo.getInstance().getUserInfo().getUserInfos(new UserInfos());
        float f = isToday ? this.k : 1.0f;
        List<CompareModel> list = this.j;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            int iIntValue2 = 0;
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                iIntValue2 += this.j.get(i2).count.intValue();
                if (i2 < this.j.size() - 1) {
                    float f2 = steps;
                    if (f2 >= this.j.get(i2).category.intValue() * f && f2 >= this.j.get(i2 + 1).category.intValue() * f) {
                        iIntValue = this.j.get(i2).count.intValue();
                    } else if (i2 != this.j.size() - 1 && steps >= this.j.get(i2).category.intValue() * f) {
                        iIntValue = this.j.get(i2).count.intValue();
                    }
                    i += iIntValue;
                } else if (i2 != this.j.size() - 1) {
                }
            }
            int i3 = (int) ((i / iIntValue2) * 100.0f);
            if (isToday) {
                HMKeeper.saveStepCompareRate(i3);
            }
            if (i3 > 0) {
                return i3;
            }
        }
        return 0;
    }

    public int[] getStepStatus(String key) {
        return l(key, 0);
    }

    public HMWeekSummery getThisWeekSummery() {
        return getWeekSummery(this.c.size() - 1);
    }

    public HMSummery getTodayShareSummary() {
        return shouldCover() ? b() : p();
    }

    public SleepShowData getTodaySleep() {
        return parse2Sleep(d(this.b.size() - 1).sleep);
    }

    public StepShowData getTodayStep() {
        return v(shouldCover() ? b().steps : m(this.b.size() - 1));
    }

    public StepsInfo getTodayStepInfo() {
        return shouldCover() ? a() : HMDataCacheCenter.getInstance().getTodaySportData().getStepsInfo();
    }

    public SleepShowData getWeekSleepShow(int position) {
        return s(getWeekSummery(position));
    }

    public StepShowData getWeekStepShow(int position) {
        return u(getWeekSummery(position));
    }

    public CopyOnWriteArrayList<HMWeekSummery> getWeekSummery() {
        return this.c;
    }

    public String getWeekSummeryStr(int position) {
        StringBuilder sb = new StringBuilder();
        SportDay sportDayFromString = SportDay.fromString(getWeekSummery(position).weekStartDate);
        SportDay weekEndDay = sportDayFromString.getWeekEndDay();
        if (sportDayFromString.year == Calendar.getInstance().get(1)) {
            sb.append(g(sportDayFromString));
            sb.append(" - ");
            sb.append(g(weekEndDay));
        } else if (sportDayFromString.year == weekEndDay.year) {
            sb.append(q(sportDayFromString));
            sb.append(" - ");
            sb.append(g(weekEndDay));
        } else {
            sb.append(q(sportDayFromString));
            sb.append(" - ");
            sb.append(q(weekEndDay));
        }
        return sb.toString();
    }

    public List<CompareModel> getmCompareDpSlplist() {
        return this.m;
    }

    public List<CompareModel> getmCompareIntoSlplist() {
        return this.l;
    }

    public List<CompareModel> getmCompareScoreSlplist() {
        return this.n;
    }

    public synchronized DaySportData getmCurrentEarbudShowDaySportData() {
        return this.h;
    }

    public ShoesDaySportData getmCurrentShoeShoesData() {
        return this.i;
    }

    public synchronized DaySportData getmCurrentShowDaySportData() {
        return this.g;
    }

    public void init() {
        this.b = HMDataCacheCenter.getInstance().getmBandUint().getmDaySummeryArrayList();
        this.c = HMDataCacheCenter.getInstance().getmBandUint().getmWeekSummeryArrayList();
        this.d = HMDataCacheCenter.getInstance().getmBandUint().getmMonthSummeryArrayList();
    }

    public void initDetailPage() {
        UserInfos userInfos = new UserInfos();
        HMPersonInfo.getInstance().getUserInfo().getUserInfos(userInfos);
        int ageByDate = HMUserInfo.getAgeByDate(userInfos.getBirthday());
        int iIntValue = (userInfos.getGender() == null || userInfos.getGender().intValue() < 0) ? 0 : userInfos.getGender().intValue();
        String loactionProvinceSpell = DetailInfoCompareHelper.getLoactionProvinceSpell();
        int ageRegion = DetailInfoCompareHelper.getAgeRegion(ageByDate);
        HMLog.i(o, "pro = " + loactionProvinceSpell + "," + ageByDate + "," + iIntValue + "," + ageRegion, new Object[0]);
        QueryBuilder<CompareModel> queryBuilder = HMDaoManager.getInstance().getCompareModelDao().queryBuilder();
        Property property = CompareModelDao.Properties.Location;
        if (queryBuilder.where(property.eq(loactionProvinceSpell), new WhereCondition[0]).count() <= 0) {
            HMLog.i(o, "use default regions", new Object[0]);
            loactionProvinceSpell = "zhongguo";
        }
        this.k = new BigDecimal(k()).setScale(2, 1).floatValue();
        QueryBuilder<CompareModel> queryBuilder2 = HMDaoManager.getInstance().getCompareModelDao().queryBuilder();
        Property property2 = CompareModelDao.Properties.AgeGroup;
        WhereCondition whereConditionEq = property2.eq(Integer.valueOf(ageRegion));
        Property property3 = CompareModelDao.Properties.Gender;
        Property property4 = CompareModelDao.Properties.ItemType;
        QueryBuilder<CompareModel> queryBuilderWhere = queryBuilder2.where(whereConditionEq, property3.eq(Integer.valueOf(iIntValue)), property.eq(loactionProvinceSpell), property4.eq("activity_step_ttl"));
        Property property5 = CompareModelDao.Properties.Category;
        this.j = queryBuilderWhere.orderAsc(property5).list();
        this.l = HMDaoManager.getInstance().getCompareModelDao().queryBuilder().where(property2.eq(Integer.valueOf(ageRegion)), property3.eq(Integer.valueOf(iIntValue)), property.eq(loactionProvinceSpell), property4.eq("sleep_start")).orderAsc(property5).list();
        this.m = HMDaoManager.getInstance().getCompareModelDao().queryBuilder().where(property2.eq(Integer.valueOf(ageRegion)), property3.eq(Integer.valueOf(iIntValue)), property.eq(loactionProvinceSpell), property4.eq("sleep_deep_duration")).orderAsc(property5).list();
        this.n = HMDaoManager.getInstance().getCompareModelDao().queryBuilder().where(property2.eq(Integer.valueOf(ageRegion)), property3.eq(Integer.valueOf(iIntValue)), property.eq(loactionProvinceSpell), property4.eq("sleep_score_v2")).orderAsc(property5).list();
        List<CompareModel> list = this.j;
        if (list == null || list.isEmpty()) {
            HMLog.i(o, "error with compare model,reinject datas", new Object[0]);
            HMKeeper.saveOfflineModelInjectResult("");
            new HMCompareModelInjectJob().start();
        }
    }

    public boolean isEmpty(DaySportData data) {
        return data.getmDatastatus() != 3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0025  */
    public boolean isInRange(int nowIndex, int nowType, int fromIndex, int fromType) {
        int[] iArrI = i(fromIndex, fromType, nowType);
        boolean z = true;
        if (fromType != 0) {
            if (fromType != 1) {
                if (fromType != 2) {
                    return false;
                }
                if (nowIndex < iArrI[0] || nowIndex > iArrI[1]) {
                    z = false;
                }
            } else if (nowIndex < iArrI[0] || nowIndex > iArrI[1]) {
                z = false;
            }
        } else if (nowIndex != iArrI[0]) {
            z = false;
        }
        return z;
    }

    public boolean isThisMonth(int position) {
        return getSportDay(position).calendar.getTimeInMillis() >= n();
    }

    public boolean isThisWeek(int position) {
        return getSportDay(position).calendar.getTimeInMillis() >= h();
    }

    @NotNull
    public SleepShowData parse2Nap(SleepInfo info) {
        SleepShowData sleepShowData = new SleepShowData();
        if (info != null) {
            if (info.getOddStageSleep() != null && info.getOddStageSleep().size() > 0) {
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (StageSleep stageSleep : info.getOddStageSleep()) {
                    int i5 = stageSleep.mode;
                    if (i5 == 5) {
                        i += (stageSleep.stop - stageSleep.start) + 1;
                    } else if (i5 == 4) {
                        i2 += (stageSleep.stop - stageSleep.start) + 1;
                    } else if (i5 == 7) {
                        i3 += (stageSleep.stop - stageSleep.start) + 1;
                    } else if (i5 == 8) {
                        i4 += (stageSleep.stop - stageSleep.start) + 1;
                    }
                }
                sleepShowData.deepDurationHour = i / 60;
                sleepShowData.deepDurationMin = i % 60;
                sleepShowData.lightDurationHour = i2 / 60;
                sleepShowData.lightDurationMin = i2 % 60;
                sleepShowData.awakeDuration = i3;
                sleepShowData.dreamTime = i4;
                int i6 = i + i2 + i4;
                sleepShowData.durationHour = i6 / 60;
                sleepShowData.durationMin = i6 % 60;
            }
            sleepShowData.isRemSupported = info.isRemSupport();
        }
        return sleepShowData;
    }

    public SleepShowData parse2Sleep(Sleep info) {
        SleepShowData sleepShowData = new SleepShowData();
        if (info == null || info.sleepMinutes <= 0) {
            sleepShowData.time = "00:00";
            sleepShowData.awakeTime = "00:00";
            sleepShowData.awakeDuration = 0;
            sleepShowData.durationHour = 0;
            sleepShowData.durationMin = 0;
            sleepShowData.deepDurationHour = 0;
            sleepShowData.deepDurationMin = 0;
            sleepShowData.lightDurationHour = 0;
            sleepShowData.lightDurationMin = 0;
            sleepShowData.isEmpty = true;
            sleepShowData.intoSleepTime = 0;
            sleepShowData.lazyBedTime = 0;
            sleepShowData.turnOverTime = 0;
            sleepShowData.dreamTime = 0;
        } else {
            HMLog.d(o, "sleep data : " + info.toString(), new Object[0]);
            sleepShowData.time = TimeUtils.formatTime_zh(new Date(info.st));
            sleepShowData.timeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), new Date(info.st));
            sleepShowData.awakeTime = TimeUtils.formatTime_zh(new Date(info.ed));
            sleepShowData.awakeTimeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), new Date(info.ed));
            sleepShowData.awakeDuration = info.wk;
            int i = info.sleepMinutes;
            sleepShowData.durationHour = i / 60;
            sleepShowData.durationMin = i % 60;
            int i2 = info.dp;
            sleepShowData.deepDurationHour = i2 / 60;
            sleepShowData.deepDurationMin = i2 % 60;
            int i3 = info.lt;
            sleepShowData.lightDurationHour = i3 / 60;
            sleepShowData.lightDurationMin = i3 % 60;
            sleepShowData.isEmpty = false;
            sleepShowData.intoSleepTime = info.is;
            sleepShowData.lazyBedTime = info.lb;
            sleepShowData.dreamTime = info.dt;
        }
        HMLog.d(o, "sleep show data : " + sleepShowData.toString(), new Object[0]);
        return sleepShowData;
    }

    public StepDetailInfo parse2Step(StepsInfo data, String key) {
        int i;
        StepDetailInfo stepDetailInfo = new StepDetailInfo();
        if (data == null || data.getStepsCount() <= 0) {
            HMLog.d(o, " StepsInfo is null", new Object[0]);
            stepDetailInfo.stepCount = "0";
            stepDetailInfo.stepUnit = this.a.getString(R.string.unit_step);
            stepDetailInfo.distance = "0";
            stepDetailInfo.distanceUnit = UnitManager.getInstance().getUnit(0);
            stepDetailInfo.distanceOil = "0";
            stepDetailInfo.calorie = "0";
            stepDetailInfo.calorieFat = "0";
            stepDetailInfo.calorieUnit = this.a.getString(R.string.unit_kc);
            stepDetailInfo.timeLineInfo = w(null, key);
            stepDetailInfo.isEmpty = true;
        } else {
            HMLog.d(o, "StepsInfo not null", new Object[0]);
            stepDetailInfo.stepCount = data.getStepsCount() + "";
            stepDetailInfo.stepUnit = this.a.getString(R.string.unit_step);
            stepDetailInfo.distance = UnitManager.getInstance().formatValue(data.getDistance());
            stepDetailInfo.distanceUnit = UnitManager.getInstance().getUnit(data.getDistance());
            stepDetailInfo.distanceOil = UnitManager.getInstance().formatOilValue(data.getDistance());
            stepDetailInfo.calorieFat = UnitManager.getInstance().formatFatValue(data.getCalories());
            stepDetailInfo.calorieUnit = this.a.getString(R.string.unit_kc);
            stepDetailInfo.timeLineInfo = w(new ArrayList<>(data.getActiveList()), key);
            stepDetailInfo.isEmpty = false;
            ArrayList<StageSteps> stageSteps = data.getStageSteps();
            if (stageSteps != null) {
                Iterator<StageSteps> it2 = stageSteps.iterator();
                i = 0;
                while (it2.hasNext()) {
                    i += it2.next().cal;
                }
            } else {
                i = 0;
            }
            stepDetailInfo.calorie = String.valueOf(i);
        }
        HMLog.d(o, "StepDetailInfo : " + stepDetailInfo.toString(), new Object[0]);
        return stepDetailInfo;
    }

    public synchronized void setmCurrentEarbudShowDaySportData(DaySportData mCurrentEarbudShowDaySportData) {
        this.h = mCurrentEarbudShowDaySportData;
    }

    public void setmCurrentShoeShoesData(ShoesDaySportData mCurrentShoeShoesData) {
        this.i = mCurrentShoeShoesData;
    }

    public synchronized void setmCurrentShowDaySportData(DaySportData mCurrentShowDaySportData) {
        this.g = mCurrentShowDaySportData;
    }

    public boolean shouldCover() {
        StepsInfo stepsInfo;
        if (HMDeviceManager.getInstance().getMajorDeviceType() == HMDeviceType.SENSORHUB || this.e == null || (stepsInfo = HMDataCacheCenter.getInstance().getTodaySportData().getStepsInfo()) == null) {
            return false;
        }
        HMLog.d(o, "real time step : " + this.e.getWalking() + ",detail step : " + stepsInfo.getStepsCount(), new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("real time step : ");
        sb.append(this.e.toString());
        HMLog.d(o, sb.toString(), new Object[0]);
        return this.e.getTotalStep() - stepsInfo.getStepsCount() > 0 || this.e.getTotalCal() - stepsInfo.getCalories() > 0;
    }

    public void updateRealtimeStep(RealtimeStep step) {
        this.e = step;
    }

    public HMMonthSummery getMonthSummery(int index) {
        if (index >= 0) {
            return this.d.get(index);
        }
        HMMonthSummery hMMonthSummery = new HMMonthSummery();
        hMMonthSummery.mStatus = 0;
        return hMMonthSummery;
    }

    public HMWeekSummery getWeekSummery(int index) {
        if (index >= 0) {
            return this.c.get(index);
        }
        HMWeekSummery hMWeekSummery = new HMWeekSummery();
        hMWeekSummery.mStatus = 0;
        return hMWeekSummery;
    }

    public int getIndex(int nowIndex, int from, int to) {
        return from == to ? nowIndex : f(c(nowIndex, from), to);
    }

    public SleepShowData parse2Sleep(SleepInfo info) {
        StringBuilder sb = new StringBuilder();
        sb.append("sleep info : ");
        sb.append(info == null ? "null" : info.toString());
        HMLog.d(o, sb.toString(), new Object[0]);
        SleepShowData sleepShowData = new SleepShowData();
        if (info != null && info.getSleepCount() > 0) {
            sleepShowData.time = TimeUtils.formatTime_zh(info.getStartDate());
            sleepShowData.timeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), info.getStartDate());
            sleepShowData.awakeTime = TimeUtils.formatTime_zh(info.getStopDate());
            sleepShowData.awakeTimeReg = TimeUtils.getPrefix_zh(BraceletApp.getContext(), info.getStopDate());
            sleepShowData.awakeDuration = info.getAwakeCount();
            sleepShowData.awakeNum = info.getAwakeNum();
            int time = ((int) (((info.getStopDate().getTime() - info.getStartDate().getTime()) / 1000) / 60)) - info.getAwakeCount();
            sleepShowData.durationHour = time / 60;
            sleepShowData.durationMin = time % 60;
            sleepShowData.deepDurationHour = info.getNonRemCount() / 60;
            sleepShowData.deepDurationMin = info.getNonRemCount() % 60;
            sleepShowData.lightDurationHour = info.getRemCount() / 60;
            sleepShowData.lightDurationMin = info.getRemCount() % 60;
            sleepShowData.sleepFeeling = info.getSleepFeeling();
            sleepShowData.intoSleepTime = info.getIntoSleepCount();
            sleepShowData.lazyBedTime = info.getLazyBedCount();
            sleepShowData.turnOverTime = info.getTurnOverCount();
            sleepShowData.dreamTime = info.getDreamTime();
            sleepShowData.sleepScore = info.getSleepScore();
            sleepShowData.isEmpty = false;
            sleepShowData.isRemSupported = info.isRemSupport();
        } else {
            sleepShowData.time = "00:00";
            sleepShowData.awakeTime = "00:00";
            sleepShowData.awakeDuration = 0;
            sleepShowData.durationHour = 0;
            sleepShowData.durationMin = 0;
            sleepShowData.deepDurationHour = 0;
            sleepShowData.deepDurationMin = 0;
            sleepShowData.lightDurationHour = 0;
            sleepShowData.lightDurationMin = 0;
            sleepShowData.sleepFeeling = 0;
            sleepShowData.intoSleepTime = 0;
            sleepShowData.lazyBedTime = 0;
            sleepShowData.turnOverTime = 0;
            sleepShowData.dreamTime = 0;
            sleepShowData.sleepScore = 0;
            sleepShowData.isEmpty = true;
        }
        HMLog.d(o, "sleep data : " + sleepShowData.toString(), new Object[0]);
        return sleepShowData;
    }
}
