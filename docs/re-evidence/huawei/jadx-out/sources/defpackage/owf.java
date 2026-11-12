package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.transformer.ExportException;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class owf {
    private final int ef;
    private final int eh;
    private final String ej;
    public static final owf aj = e("firstUseDate", 9001);
    public static final owf dt = a(ParsedFieldTag.TOTAL_DAYS, 9002);
    public static final owf eg = a("totalActiveDaysCurrentYear", 10015);
    public static final owf dr = a(BleConstants.TOTAL_CALORIES, 6005);
    public static final owf aa = a("distanceCompare", 9009);
    public static final owf g = a("caloriesCompare", 9010);
    public static final owf dv = a("totalStep", 3001);
    public static final owf ec = a("totalStepDistance", 3002);
    public static final owf bs = a("maxStepContinuousDays", 10026);
    public static final owf dh = a("stepCompare", IEventListener.EVENT_ID_DEVICE_SCAN_FINISH);
    public static final owf dg = a("stepOverTenThousand", IEventListener.EVENT_ID_DEVICE_RTSP_CONN);
    public static final owf bv = a("maxStep", 3003);
    public static final owf bt = g("maxStepDay", 3004);
    public static final owf ad = g("exceedTenThousandStepList", 10072);
    public static final owf at = g("fullYearSportDuration", 9011);
    public static final owf bn = g("maxSportDurationMonths", 9012);
    public static final owf bz = a("maxWalkMonth", IEventListener.EVENT_ID_DEVICE_DISCONN_SUCC);
    public static final owf bx = a("maxWalkSeason", IEventListener.EVENT_ID_DEVICE_UPDATE);
    public static final owf bo = a("maxWalkSeasonSteps", 3009);
    public static final owf ee = a("walkCount", 3010);
    public static final owf da = a(KakaConstants.SLEEP_DURATION, 8002);
    public static final owf cy = a("sleepCount", MainLoginCallBack.MSG_START_APK_SERVICE_ERROR);
    public static final owf cx = d("sleepScore", 8001);
    public static final owf df = d("maxSleepScoreOfSeason", 10017);
    public static final owf dd = d("maxSleepScoreValueOfSeason", 10018);
    public static final owf de = d("fallAsleepTimeLess24", 10019);
    public static final owf cw = d("minSleepDurationDay", 10020);
    public static final owf cc = d("minSleepDuration", 10021);
    public static final owf cv = g("fallAsleepTime", MainLoginCallBack.MSG_HWID_ACCOUNT_NOT_LOGIN);
    public static final owf dc = g("wakeupTime", MainLoginCallBack.MSG_NO_NETWORK);
    public static final owf cr = d("breLevel", MainLoginCallBack.MSG_HMS_VERSION_ERROR);
    public static final owf cz = a("sleepScoreCompare", MainLoginCallBack.MSG_SHOW_HMS_DIALOG);
    public static final owf dy = a("totalRunDistance", 2001);
    public static final owf cn = a("runDistanceCompare", 2007);
    public static final owf ct = a("runNumberOfTimes", 2002);
    public static final owf cu = a("runNumberOfDays", 10022);
    public static final owf cm = a("maxRunContinuousDays", 10023);
    public static final owf cl = a("bestPace", 10024);
    public static final owf co = a("bestPaceCompare", 10025);
    public static final owf cp = a("runMaxDistance", 2003);
    public static final owf cq = e("runMaxDistanceDay", 2004);
    public static final owf cs = a("timeOfDay", 2005);
    public static final owf ba = a("halfMarathonCount", 9004);
    public static final owf ar = a("fullMarathonCount", 9005);
    public static final owf ax = a("halfMarathonBestPace", 2008);
    public static final owf bc = e("halfMarathonTimestamp", 2009);
    public static final owf bk = a("marathonBestPace", 2010);
    public static final owf bj = e("marathonTimestamp", 2011);
    public static final owf dq = a("totalCycleDistance", 1001);
    public static final owf v = a("cycleDistanceCompare", 1005);
    public static final owf ab = a("cycleNumberOfTimes", 1002);
    public static final owf br = a("maxCycleContinuousDays", PrebakedEffectId.RT_SPEED_UP);
    public static final owf w = a("cycleMaxDistance", 1003);
    public static final owf x = e("cycleMaxDistanceDay", 1004);
    public static final owf dx = a("totalDuration", 4001);
    public static final owf dw = a("totalDurationExcludeRunCourse", PrebakedEffectId.RT_JUMP);
    public static final owf ds = a("totalCourseDay", 10029);
    public static final owf am = a("maxFitnessContinuousDays", PrebakedEffectId.RT_COIN_DROP);
    public static final owf ag = g("favoriteCourseName", PrebakedEffectId.RT_HEARTBEAT);
    public static final owf dk = a("maxSwimContinuousDays", 10032);
    public static final owf as = a("fitnessNumberOfTimes", 4002);
    public static final owf ak = a("fitnessDurationCompare", 4006);
    public static final owf aq = a("fitnessMaxDuration", 4003);
    public static final owf bq = e("fitnessMaxDurationDay", 4004);
    public static final owf af = a("favoriteCourses", 4007);
    public static final owf an = g("favoriteSportType", WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED);
    public static final owf ai = a("favoriteSportSumDuration", 4013);
    public static final owf ao = b("fitnessTypeMap", 4014);
    public static final owf bw = e("swimMaxDistanceDay", 4009);
    public static final owf bu = a("swimMaxDistance", 4010);
    public static final owf dm = a("swimSumDistance", 4011);
    public static final owf dn = a("swimSumTime", PrebakedEffectId.RT_FOOTSTEP);
    public static final owf dp = a("swimSumDistanceCompare", PrebakedEffectId.RT_ICE);
    public static final owf dl = a("swimSumCount", 4012);
    public static final owf ca = g("medalIdList", 5001);
    public static final owf ap = a("annualFlagNum", PrebakedEffectId.RT_DRAWING_ARROW);
    public static final owf ck = a("annualReachFlagNum", 10034);
    public static final owf ay = a("headlineNum", 10035);
    public static final owf r = a("maxContinuousHeadlineDay", PrebakedEffectId.RT_SNIPER_RIFLE);
    public static final owf bb = a("headlineDayNum", PrebakedEffectId.RT_ASSAULT_RIFLE);
    public static final owf az = a("hypnoticMusicNum", 10038);
    public static final owf ah = a("favoriteHypnoticMusicType", 10039);
    public static final owf dz = g("totalNumOfMusicType", 10050);
    public static final owf al = e("firstBeVipTime", PrebakedEffectId.RT_FAST_MOVING);
    public static final owf y = a("currentVipstatus", PrebakedEffectId.RT_FLY);
    public static final owf bd = a("joinActivityNum", 10001);
    public static final owf bh = c("JoinActivityCompletionRate", 10002);
    public static final owf ae = a("favoriteActivityType", 10003);
    public static final owf dj = b("starAcquired", 6006);
    public static final owf du = a(BleConstants.TOTAL_DISTANCE, 9003);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final owf f44911c = a("bloodPressureTotalNum", 10004);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final owf f44910b = a("bloodPressureNormalNum", 10005);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final owf f44909a = c("bloodPressureNormalRatio", 10006);
    public static final owf d = c("bloodPressureNormalRatioCompare", 10007);
    public static final owf i = a("bloodSugarTotalNum", 10008);
    public static final owf h = a("bloodSugarNormalNum", 10009);
    public static final owf f = c("bloodSugarNormalRatio", 10010);
    public static final owf j = c("bloodSugarNormalRatioCompare", 10011);
    public static final owf e = d("averageWeightThisYear", 10012);
    public static final owf eb = a("weightMeasureTimes", 10013);
    public static final owf ed = c("BMI", PrebakedEffectId.RT_LIGHTNING);
    public static final owf ea = d("weightCompare", PrebakedEffectId.RT_CALENDAR_DATE);
    public static final owf ac = a("dietRecordDayNum", 10016);

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final owf f8do = e("threeRingReachNum", PrebakedEffectId.RT_SPRING);
    public static final owf bp = a("maxContinuousThreeRingDay", PrebakedEffectId.RT_SWING);
    public static final owf cd = a("perfectCloverReachNum", PrebakedEffectId.RT_WIND);
    public static final owf bm = a("maxContinuousPerfectCloverDay", PrebakedEffectId.RT_VICTORY);
    public static final owf s = a("cloverLeafReachNum", PrebakedEffectId.RT_AWARD);
    public static final owf o = a("climbHillCount", 10051);
    public static final owf k = a("climbHillDistance", 10052);
    public static final owf m = c("climbHillAltitude", 10053);
    public static final owf l = c("climbHillMaxAltitude", 10054);
    public static final owf t = e("climbHillMaxAltitudeDay", 10055);
    public static final owf q = a("climbHillMaxAltitudeDistance", 10056);
    public static final owf p = a("climbHillMaxAltitudeDuration", 10057);
    public static final owf n = c("climbHillMaxAltitudeCreepingWave", 10058);
    public static final owf cf = a("playBadmintonCount", 10059);
    public static final owf ch = a("playBadmintonDuration", 10060);
    public static final owf cj = a("playBadmintonMaxDuration", 10061);
    public static final owf ci = e("playBadmintonMaxDurationDay", 10062);
    public static final owf be = a("jumpRopeCount", 10063);
    public static final owf bl = e("jumpRopeNum", 10064);
    public static final owf bf = a("jumpRopeMaxNum", 10065);
    public static final owf bi = e("jumpRopeMaxNumDay", 10066);
    public static final owf bg = a("jumpRopeMaxContinuousDays", 10067);
    public static final owf by = d("maxWeightThisYear", ExportException.ERROR_CODE_MUXING_TIMEOUT);
    public static final owf cg = d("minWeightThisYear", ExportException.ERROR_CODE_MUXING_APPEND);
    public static final owf z = g("emotionData", 10068);
    public static final owf di = g("stressData", 10069);
    public static final owf cb = g("microCheckupData", 10070);
    public static final owf u = g("cycleCalendarData", 10071);
    public static final owf ce = g("newlyTriedSports", 4015);
    public static final owf db = g("sportTypeMap", 4016);
    public static final owf aw = d("fullYearGolfCount", 10073);
    public static final owf au = d("fullYearGolfSwingCount", 10074);
    public static final owf av = d("fullYearGolfDuration", 10075);

    public owf(String str, int i2, int i3) {
        Preconditions.checkNotNull(str);
        this.ej = str;
        this.ef = i2;
        this.eh = i3;
    }

    public int d() {
        return this.eh;
    }

    public String a() {
        return this.ej;
    }

    public int e() {
        return this.ef;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%s(%s)", this.ej, this.eh == 1 ? CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT : "f");
    }

    public static owf a(String str, int i2) {
        return new owf(str, i2, 1);
    }

    public static owf c(String str, int i2) {
        return new owf(str, i2, 2);
    }

    public static owf g(String str, int i2) {
        return new owf(str, i2, 3);
    }

    public static owf e(String str, int i2) {
        return new owf(str, i2, 4);
    }

    public static owf d(String str, int i2) {
        return new owf(str, i2, 5);
    }

    public static owf b(String str, int i2) {
        return new owf(str, i2, 6);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof owf)) {
            return false;
        }
        owf owfVar = (owf) obj;
        return this.ej.equals(owfVar.ej) && this.eh == owfVar.eh;
    }

    public final int hashCode() {
        return this.ej.hashCode();
    }
}
