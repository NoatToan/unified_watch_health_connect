package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.manager.service.AchievePersonalDataObserver;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osp {
    public static boolean e(int i) {
        return i == 15 || i == 16;
    }

    private static UserAchieveWrapper d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(0);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            AchieveInfo achieveInfo = new AchieveInfo();
            achieveInfo.setUserLevel(jSONObject.optInt(ParsedFieldTag.USER_LEVEL));
            achieveInfo.saveMedals(osv.c(jSONObject.optJSONArray(ParsedFieldTag.USER_MEDALS)));
            achieveInfo.setUserPoint(jSONObject.optInt(ParsedFieldTag.KAKA_SUM));
            achieveInfo.setUserReachStandardDays(jSONObject.optDouble(ParsedFieldTag.DAY_LEVEL));
            achieveInfo.setSyncTimestamp(jSONObject.optLong("timestamp"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ParsedFieldTag.KAKA_DELAY_INFO);
            if (jSONObjectOptJSONObject != null) {
                achieveInfo.setExpirationKaka(osv.a(ParsedFieldTag.KAKA_EXPIRATION_KAKA, jSONObjectOptJSONObject));
            }
            LogUtil.a("PLGACHIEVE_AchievePersonalParser", "parsePersonal mds of achieveInfo:", achieveInfo.acquireMedals());
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(ParsedFieldTag.ACHIEVEMENT_REPORT);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(ParsedFieldTag.ACHIEVEMENT_REPORT_EXTEND);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(ParsedFieldTag.NPES_BEST_RESULT);
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(0);
            if (jSONObjectOptJSONObject2 == null) {
                userAchieveWrapper2.setAchieveInfo(achieveInfo);
                return userAchieveWrapper2;
            }
            if (Utils.o()) {
                LogUtil.j("PLGACHIEVE_AchievePersonalParser", "parseTotalRecord is isOverseaAndNoOperation.");
                if (jSONObjectOptJSONObject2.has(ParsedFieldTag.TOTAL_DAYS)) {
                    AchievePersonalDataObserver.d(jSONObjectOptJSONObject2.optInt(ParsedFieldTag.TOTAL_DAYS));
                }
            }
            TotalRecord totalRecord = new TotalRecord();
            a(totalRecord, jSONObjectOptJSONObject2, jSONObjectOptJSONObject3);
            userAchieveWrapper2.setTotalRecord(totalRecord);
            SingleDayRecord singleDayRecord = new SingleDayRecord();
            d(singleDayRecord, jSONObjectOptJSONObject2, jSONObjectOptJSONObject3, jSONObjectOptJSONObject4);
            userAchieveWrapper2.setSingleDayRecord(singleDayRecord);
            userAchieveWrapper2.setAchieveInfo(achieveInfo);
            return userAchieveWrapper2;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchievePersonalParser", "parsePersonal Exception:", e.getMessage());
            return new UserAchieveWrapper(0);
        }
    }

    public static double c(double d) {
        try {
            return Double.parseDouble(NumberFormat.getInstance().parse(UnitUtil.e(d / 1000.0d, 1, 2)).toString());
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchievePersonalParser", "NumberFormatException error");
            return 0.0d;
        } catch (ParseException unused2) {
            LogUtil.e("PLGACHIEVE_AchievePersonalParser", "ParseException error");
            return 0.0d;
        }
    }

    public static UserAchieveWrapper c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i == 10) {
            return osl.e(str);
        }
        if (i != 12) {
            if (i == 14) {
                return osq.b(str);
            }
            if (i != 18) {
                if (i != 26) {
                    switch (i) {
                        case 0:
                            return d(str);
                        case 1:
                            return osl.j(str);
                        case 2:
                            return osm.d(str);
                        case 3:
                            return osm.c(str);
                        case 4:
                            return osn.a(str);
                        case 5:
                            return osl.c(str);
                        case 6:
                            return osn.e(str);
                        case 7:
                            return osn.d(str);
                        default:
                            UserAchieveWrapper userAchieveWrapperB = b(i, str);
                            LogUtil.a("PLGACHIEVE_AchievePersonalParser", "continue doParse content type");
                            return userAchieveWrapperB;
                    }
                }
                return osl.a(str);
            }
        }
        return osl.e(i, str);
    }

    private static UserAchieveWrapper b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i == 24) {
            osq.d(str);
            return null;
        }
        if (i == 25) {
            return osq.e(str);
        }
        UserAchieveWrapper userAchieveWrapperA = a(i, str);
        LogUtil.a("PLGACHIEVE_AchievePersonalParser", "continue doParse content type");
        return userAchieveWrapperA;
    }

    public static UserAchieveWrapper e(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i == 15) {
            return osl.f(str);
        }
        if (i == 16) {
            return osl.h(str);
        }
        LogUtil.j("PLGACHIEVE_AchievePersonalParser", "doKakaParse invalide content type");
        return null;
    }

    private static UserAchieveWrapper a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        switch (i) {
            case 19:
                return osl.b(str);
            case 20:
                return osl.d(str);
            case 21:
                return osl.i(str);
            case 22:
                return osl.g(str);
            case 23:
                return osl.n(str);
            default:
                LogUtil.j("PLGACHIEVE_AchievePersonalParser", "parseKakaCheckInOrGiftResult invalide content type");
                return null;
        }
    }

    public static ArrayList<UserAchieveWrapper> c(int i, String str, Context context) {
        ArrayList<UserAchieveWrapper> arrayList = new ArrayList<>(0);
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        if (i == 0) {
            return osn.c(str);
        }
        if (i == 8) {
            return osn.d(str, context);
        }
        if (i == 11) {
            return osl.d(str, context, 11);
        }
        if (i == 13) {
            return osq.a(str);
        }
        if (i == 17) {
            return osl.d(str, context, 17);
        }
        LogUtil.a("PLGACHIEVE_AchievePersonalParser", "doParse invalide content type");
        return arrayList;
    }

    private static void d(SingleDayRecord singleDayRecord, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        singleDayRecord.setSteps(osv.a(ParsedFieldTag.MAX_STEPS, jSONObject));
        singleDayRecord.setStepsDate(jSONObject.optLong(ParsedFieldTag.MAX_STEPS_DATE));
        if (jSONObject.has(ParsedFieldTag.MAX_DISTANCE)) {
            singleDayRecord.saveDistance(c(jSONObject.optDouble(ParsedFieldTag.MAX_DISTANCE)));
        }
        if (jSONObject.has(ParsedFieldTag.MAX_DISTANCE_DATE)) {
            singleDayRecord.setDistanceDate(jSONObject.optLong(ParsedFieldTag.MAX_DISTANCE_DATE));
        }
        if (jSONObject.has(ParsedFieldTag.MAX_PACE)) {
            singleDayRecord.saveMatchSpeed(jSONObject.optInt(ParsedFieldTag.MAX_PACE));
        }
        if (jSONObject.has(ParsedFieldTag.MAX_PACE_DATE)) {
            singleDayRecord.setMatchSpeedDate(jSONObject.optLong(ParsedFieldTag.MAX_PACE_DATE));
        }
        singleDayRecord.saveBestRunDistance(osv.c(ParsedFieldTag.BEST_RUN_DISTANCE, jSONObject2));
        singleDayRecord.saveBestRunPace(osv.c(ParsedFieldTag.BEST_RUN_PACE, jSONObject2));
        singleDayRecord.saveBestStepDay(osv.c(ParsedFieldTag.BEST_DAY_STEP, jSONObject2));
        singleDayRecord.saveBestCycleDistance(osv.c(ParsedFieldTag.BEST_CYCLE_DISTANCE, jSONObject2));
        singleDayRecord.saveBestCycleSpeed(osv.c(ParsedFieldTag.BEST_CYCLE_SPEED, jSONObject2));
        singleDayRecord.saveBestWalkDistance(osv.c(ParsedFieldTag.BEST_WALK_DISTANCE, jSONObject2));
        singleDayRecord.saveBestRun3KMPace(osv.c(ParsedFieldTag.BEST_RUN_3KM_PACE, jSONObject2));
        singleDayRecord.saveBestRun5KMPace(osv.c(ParsedFieldTag.BEST_RUN_5KM_PACE, jSONObject2));
        singleDayRecord.saveBestRun10KMPace(osv.c(ParsedFieldTag.BEST_RUN_10KM_PACE, jSONObject2));
        singleDayRecord.saveBestRunHMPace(osv.c(ParsedFieldTag.BEST_RUN_HM_PACE, jSONObject2));
        singleDayRecord.saveBestRunFMPace(osv.c(ParsedFieldTag.BEST_RUN_FM_PACE, jSONObject2));
        singleDayRecord.saveBestRopeContinuousCount(osv.c(ParsedFieldTag.BEST_ROPE_CONTINUOUS_COUNT, jSONObject2));
        singleDayRecord.saveBestRopeDuration(osv.c(ParsedFieldTag.BEST_ROPE_DURATION, jSONObject2));
        singleDayRecord.saveBestRopeSingCount(osv.c(ParsedFieldTag.BEST_ROPE_SINGLE_COUNT, jSONObject2));
        singleDayRecord.saveBestRopeSpeed(osv.c(ParsedFieldTag.BEST_ROPE_SPEED, jSONObject2));
        if (jSONObject3 != null) {
            singleDayRecord.setNpeBestResult(jSONObject3.toString());
        }
        LogUtil.a("PLGACHIEVE_AchievePersonalParser", "myAchieveCloud parseSingleRecord ", singleDayRecord.toString());
    }

    private static void a(TotalRecord totalRecord, JSONObject jSONObject, JSONObject jSONObject2) {
        osf osfVarB = otl.b(BaseApplication.b()).b(1, new HashMap(16));
        if (!(osfVarB instanceof TotalRecord) || ((TotalRecord) osfVarB).getSteps() <= 0.0d) {
            totalRecord.setDistance(jSONObject.optDouble(ParsedFieldTag.SUM_DISTANCE));
            totalRecord.setSteps(jSONObject.optDouble(ParsedFieldTag.SUM_STEPS));
            totalRecord.saveCalorie(jSONObject.optDouble(ParsedFieldTag.ORIGINAL_SUM_KCAL));
            LogUtil.a("PLGACHIEVE_AchievePersonalParser", "parseTotalRecord data from reportObj.");
        } else {
            totalRecord.setDistance(-0.1d);
            totalRecord.setSteps(-0.1d);
            totalRecord.saveCalorie(-0.1d);
        }
        totalRecord.setDays(jSONObject.optInt(ParsedFieldTag.TOTAL_DAYS));
        totalRecord.setStartDate(jSONObject.optLong(ParsedFieldTag.FIRST_DATE));
        totalRecord.setEndDate(jSONObject.optLong(ParsedFieldTag.LAST_DATE));
        totalRecord.setStepsRanking(jSONObject.optDouble(ParsedFieldTag.SUM_STEPS_DESC));
        totalRecord.saveAccumulatedHealthTime(osv.c(ParsedFieldTag.TOTAL_FITNESS_DURATION, jSONObject2));
        totalRecord.saveAccumulatedCycleDistance(osv.c(ParsedFieldTag.TOTAL_CYCLE_DISTANCE, jSONObject2));
        totalRecord.saveAccumulatedRunDistance(osv.c(ParsedFieldTag.TOTAL_RUN_DISTANCE, jSONObject2));
        totalRecord.saveAccumulatedWalkDistance(osv.c(ParsedFieldTag.TOTAL_WALK_DISTANCE, jSONObject2));
        LogUtil.a("PLGACHIEVE_AchievePersonalParser", "myAchieveCloud parseTotalRecord: ", totalRecord.toString());
    }
}
