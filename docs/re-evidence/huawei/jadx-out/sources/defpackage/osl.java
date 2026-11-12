package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ActivityInfo;
import com.huawei.pluginachievement.manager.model.CalorieExchange;
import com.huawei.pluginachievement.manager.model.GiftInfo;
import com.huawei.pluginachievement.manager.model.GiftRecord;
import com.huawei.pluginachievement.manager.model.KakaCheckInReturnBody;
import com.huawei.pluginachievement.manager.model.KakaCheckinRecord;
import com.huawei.pluginachievement.manager.model.KakaDelayInfo;
import com.huawei.pluginachievement.manager.model.KakaLineRecord;
import com.huawei.pluginachievement.manager.model.KakaRecord;
import com.huawei.pluginachievement.manager.model.KakaRedeemGiftReturnBody;
import com.huawei.pluginachievement.manager.model.KakaRedeemInfo;
import com.huawei.pluginachievement.manager.model.KakaRedeemResult;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class osl {
    private static final Integer[] d = {10002, 10003, 10004, 10005};

    static UserAchieveWrapper c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseCalorieExchange resultCode:", strOptString);
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(5);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(5);
            CalorieExchange calorieExchange = new CalorieExchange(jSONObject.optInt("kaka"), jSONObject.optInt(ParsedFieldTag.K_CAL));
            userAchieveWrapper2.setExchange(calorieExchange);
            LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseCalorieExchange calorieExchange:", calorieExchange);
            return userAchieveWrapper2;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseCalorieExchange Exception:", e.getMessage());
            return new UserAchieveWrapper(5);
        }
    }

    static UserAchieveWrapper f(String str) {
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaRedeemInfo json:", str);
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(15);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            KakaRedeemInfo kakaRedeemInfo = new KakaRedeemInfo();
            kakaRedeemInfo.setKakaSum(jSONObject.optInt(ParsedFieldTag.KAKA_SUM));
            kakaRedeemInfo.setExchangeProportion(jSONObject.optInt(ParsedFieldTag.EXCHANGE_PROPORTION));
            kakaRedeemInfo.setDailyLimit(jSONObject.optInt(ParsedFieldTag.DAILY_LIMIT));
            kakaRedeemInfo.setRedeemTimes(jSONObject.optInt(ParsedFieldTag.TIMES_REDEEM));
            kakaRedeemInfo.setRemainingKaka(d(jSONObject));
            kakaRedeemInfo.setRedeemableKaka(jSONObject.optInt(ParsedFieldTag.REDEEMABLE_KAKA));
            userAchieveWrapper.setRedeemInfo(kakaRedeemInfo);
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaRedeemInfo:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    static UserAchieveWrapper h(String str) {
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaRedeemResult json:", str);
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            KakaRedeemResult kakaRedeemResult = new KakaRedeemResult();
            if (!osv.d(strOptString)) {
                userAchieveWrapper.setResultCode(strOptString);
                kakaRedeemResult.setRemainingKaka(d(jSONObject));
                userAchieveWrapper.setRedeemResult(kakaRedeemResult);
                return userAchieveWrapper;
            }
            kakaRedeemResult.setKakaSum(jSONObject.optInt(ParsedFieldTag.KAKA_SUM));
            kakaRedeemResult.setRedeemTimes(jSONObject.optInt(ParsedFieldTag.TIMES_REDEEM));
            kakaRedeemResult.setRemainingKaka(d(jSONObject));
            userAchieveWrapper.setRedeemResult(kakaRedeemResult);
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaRedeemResult:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    static UserAchieveWrapper e(String str) {
        LogUtil.d("PLGACHIEVE_AchieveKakaParser", "enter parseActivityInfo");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseActivityInfo resultCode:", strOptString);
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(10);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("activity");
            ActivityInfo activityInfo = new ActivityInfo();
            activityInfo.saveActivityId(osv.c("activityId", jSONObject2));
            activityInfo.saveBeginTime(osv.c(ParsedFieldTag.BEGIN_DATE, jSONObject2));
            activityInfo.saveEndTime(osv.c("endDate", jSONObject2));
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(10);
            userAchieveWrapper2.saveActivityInfo(activityInfo);
            LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseActivityInfo", activityInfo.toString());
            return userAchieveWrapper2;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseActivityInfo Exception:", e.getMessage());
            return new UserAchieveWrapper(10);
        }
    }

    static UserAchieveWrapper j(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(1);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ParsedFieldTag.KAKA_DELAY_INFO);
            KakaLineRecord kakaLineRecord = new KakaLineRecord();
            if (jSONObjectOptJSONObject != null) {
                kakaLineRecord.setKakaDelayInfo(e(jSONObject));
            }
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(1);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ParsedFieldTag.KAKAS);
            if (jSONArrayOptJSONArray == null) {
                userAchieveWrapper2.setKakaLineRecord(kakaLineRecord);
                return userAchieveWrapper2;
            }
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                Object objOpt = jSONArrayOptJSONArray.opt(i);
                if (objOpt instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objOpt;
                    KakaRecord kakaRecord = new KakaRecord();
                    kakaRecord.setDate(jSONObject2.optLong("timestamp"));
                    kakaRecord.setKakaNum(jSONObject2.optInt("kaka"));
                    kakaRecord.setDescription(jSONObject2.optInt("reason"));
                    kakaRecord.setOccurDate(jSONObject2.optLong(ParsedFieldTag.OCCUR_DATE));
                    arrayList.add(kakaRecord);
                    LogUtil.d("PLGACHIEVE_AchieveKakaParser", "parseKakaLine record:", kakaRecord);
                }
            }
            kakaLineRecord.setKakaLineRecords(arrayList);
            userAchieveWrapper2.setKakaLineRecord(kakaLineRecord);
            return userAchieveWrapper2;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaLine Exception:", e.getMessage());
            return new UserAchieveWrapper(1);
        }
    }

    private static KakaDelayInfo e(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ParsedFieldTag.KAKA_DELAY_INFO);
        if (jSONObjectOptJSONObject == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaParser", "getKakaDelay delayObj is null.");
            return null;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaDelay ", jSONObjectOptJSONObject.toString());
        int iA = osv.a(ParsedFieldTag.KAKA_EXPIRATION_KAKA, jSONObjectOptJSONObject);
        KakaDelayInfo kakaDelayInfo = new KakaDelayInfo();
        kakaDelayInfo.setExpirationKaka(iA);
        kakaDelayInfo.setUpdateTime(osv.e("updateTime", jSONObjectOptJSONObject));
        kakaDelayInfo.setBeforeYear(osv.c(ParsedFieldTag.KAKA_BEFORE_YEAR, jSONObjectOptJSONObject));
        kakaDelayInfo.setDelayRate(osv.a(ParsedFieldTag.KAKA_DELAY_RATE, jSONObjectOptJSONObject));
        return kakaDelayInfo;
    }

    static UserAchieveWrapper a(String str) {
        try {
            LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaDelay json:", str);
            String strOptString = new JSONObject(str).optString("resultCode");
            UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(26);
            userAchieveWrapper.setResultCode(strOptString);
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaDelay Exception:", e.getMessage());
            return new UserAchieveWrapper(26);
        }
    }

    static ArrayList<UserAchieveWrapper> d(String str, Context context, int i) {
        StringBuilder sb;
        JSONObject jSONObject;
        osg osgVarD;
        String str2 = "taskId";
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaTaskInfo json");
        ArrayList<UserAchieveWrapper> arrayList = new ArrayList<>(16);
        long jA = pap.a(osa.e(context, "kakaSyncDate"));
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String strOptString = jSONObject2.optString("resultCode");
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(ParsedFieldTag.TASKS);
            int i2 = 11;
            if (osv.d(strOptString) && jSONArrayOptJSONArray != null) {
                long jOptLong = jSONObject2.optLong(ParsedFieldTag.CURRENT_TIMESTAMP, 0L);
                boolean zE = pap.e(jA, jOptLong);
                int i3 = 0;
                LogUtil.a("PLGACHIEVE_AchieveKakaParser", "refreshKakaSyncDate isDifferent ", Boolean.valueOf(zE), " lastSyncDate ", Long.valueOf(jA), " curTimestamp ", Long.valueOf(jOptLong));
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                while (i3 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i3);
                    UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(i2);
                    if (jSONObject3 == null) {
                        arrayList.add(userAchieveWrapper);
                        sb = sb4;
                        i3 = i3;
                        str2 = str2;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        zE = zE;
                        sb3 = sb3;
                    } else {
                        String strC = !jSONObject3.has(str2) ? osv.c(ParsedFieldTag.KAKA_TASK_UUID, jSONObject3) : osv.c(str2, jSONObject3);
                        sb2.append(strC);
                        sb2.append(",");
                        if (pap.i(strC) || pap.g(strC)) {
                            String str3 = strC;
                            sb = sb4;
                            jSONObject = jSONObject3;
                            osgVarD = d(jSONObject, str3, jOptLong);
                        } else {
                            jSONObject = jSONObject3;
                            osgVarD = a(context, jSONObject3, strC, zE, jOptLong);
                            sb = sb4;
                        }
                        if (!fua.b(osgVarD)) {
                            e(jSONObject, sb3, sb);
                            userAchieveWrapper.saveKakaTaskInfo(osgVarD);
                            arrayList.add(userAchieveWrapper);
                        }
                    }
                    i3++;
                    str2 = str2;
                    sb4 = sb;
                    sb3 = sb3;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    zE = zE;
                    i2 = 11;
                }
                e(sb3, sb4);
                b(context, sb2);
                return arrayList;
            }
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(11);
            userAchieveWrapper2.setResultCode(strOptString);
            arrayList.add(userAchieveWrapper2);
            return arrayList;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaTaskInfo Exception:", e.getMessage());
            return arrayList;
        }
    }

    private static void b(Context context, StringBuilder sb) {
        String strE = osa.e(context, "cloudKakaTaskIds");
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "saveAllTaskId: allTaskId is empty -> ", Boolean.valueOf(TextUtils.isEmpty(strE)));
        if (TextUtils.equals(strE, sb.toString())) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "saveAllTaskId: update");
        osa.b(context, "cloudKakaTaskIds", sb.toString());
    }

    private static osg a(Context context, JSONObject jSONObject, String str, boolean z, long j) {
        osg osgVar = new osg();
        osgVar.b(str);
        String strC = osv.c(ParsedFieldTag.TASK_NAME, jSONObject);
        if (TextUtils.isEmpty(strC)) {
            strC = osv.c(ParsedFieldTag.TASK_NAME_FIRST, jSONObject);
        }
        osgVar.j(strC);
        osgVar.n(osv.a(ParsedFieldTag.KAKA_TASK_SCENARIO, jSONObject));
        osgVar.p(osv.a(ParsedFieldTag.KAKA_TASK_VIP_MATCH, jSONObject));
        String strC2 = osv.c("status", jSONObject);
        long jE = osv.e(ParsedFieldTag.TASK_MODIFY_TIME, jSONObject);
        boolean zE = pap.e(jE, j);
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "refreshKakaSyncDate name ", osgVar.i(), " isDiff ", Boolean.valueOf(z), " isDifferentDate ", Boolean.valueOf(zE), " lastModifyTime ", Long.valueOf(jE), " curTimestamp ", Long.valueOf(j), " Scenario ", Integer.valueOf(osgVar.ac()), " taskStatus ", strC2);
        if (zE) {
            LogUtil.a("PLGACHIEVE_AchieveKakaParser", "syncDate differentDays");
            b(osgVar, context, z, strC2, osv.a(ParsedFieldTag.KAKA_TASK_RULE, jSONObject));
        } else {
            osgVar.h(strC2);
            if (z) {
                osgVar.j(0);
            } else {
                osgVar.j(1);
            }
        }
        a(osgVar, jSONObject);
        osgVar.c(jE);
        osgVar.d(j);
        return osgVar;
    }

    private static osg d(JSONObject jSONObject, String str, long j) {
        String strC = osv.c("status", jSONObject);
        osg osgVar = new osg();
        osgVar.b(str);
        long jE = osv.e(ParsedFieldTag.TASK_MODIFY_TIME, jSONObject);
        boolean zE = pap.e(jE, j);
        if (pap.f(str)) {
            zE = pap.c(jE, j);
        }
        osgVar.h(strC);
        if (zE) {
            osgVar.h(String.valueOf(0));
        }
        osgVar.j(1);
        a(osgVar, jSONObject);
        osgVar.c(jE);
        osgVar.d(j);
        return osgVar;
    }

    private static void b(osg osgVar, Context context, boolean z, String str, int i) {
        if (String.valueOf(3).equals(str)) {
            osgVar.h(str);
            osgVar.j(1);
            return;
        }
        if (pap.e(i)) {
            if (!pap.h(str)) {
                osgVar.h(String.valueOf(3));
                osgVar.j(0);
                return;
            } else {
                osgVar.h(str);
                osgVar.j(1);
                return;
            }
        }
        if (z) {
            osgVar.h(String.valueOf(0));
            osgVar.j(0);
            osa.b(context, "taskReachInfo", "");
        } else {
            osgVar.h(String.valueOf(0));
            osgVar.j(1);
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "refreshKakaSyncDate UNFINISHED ", osgVar.i(), " isDiff ", Boolean.valueOf(z), " Scenario ", Integer.valueOf(osgVar.ac()));
    }

    private static void a(osg osgVar, JSONObject jSONObject) {
        osgVar.a(osv.c(ParsedFieldTag.TASK_KEY, jSONObject));
        osgVar.e(1);
        osgVar.i(0);
        osgVar.f(osv.a(ParsedFieldTag.TASK_TYPE, jSONObject));
        String strC = osv.c(ParsedFieldTag.TASK_NAME, jSONObject);
        if (TextUtils.isEmpty(strC)) {
            strC = osv.c(ParsedFieldTag.TASK_NAME_FIRST, jSONObject);
        }
        osgVar.j(strC);
        osgVar.g(osv.c(ParsedFieldTag.TASK_SPECIFICATION, jSONObject));
        String strC2 = osv.c("description", jSONObject);
        if (TextUtils.isEmpty(strC2)) {
            strC2 = osv.c(ParsedFieldTag.TASK_DESCRIPTION_FIRST, jSONObject);
        }
        osgVar.d(strC2);
        osgVar.e(osv.c(ParsedFieldTag.TASK_ICON, jSONObject));
        int iA = osv.a("kaka", jSONObject);
        if (iA == 0) {
            iA = osv.a(ParsedFieldTag.TASK_REWARD_KAKA_FIRST, jSONObject);
        }
        osgVar.d(iA);
        osgVar.a(osv.a(ParsedFieldTag.TASK_REWARD_EXPERIENCE, jSONObject));
        osgVar.e(osv.e("startTime", jSONObject));
        osgVar.b(osv.e("endTime", jSONObject));
        osgVar.b(osv.a(ParsedFieldTag.TASK_REMAIN_TIMES, jSONObject));
        int iA2 = osv.a("type", jSONObject);
        int iA3 = osv.a(ParsedFieldTag.KAKA_CONTINUOUS, jSONObject);
        osgVar.m(iA2);
        osgVar.l(iA3);
        osgVar.o(osv.c(ParsedFieldTag.KAKA_TASK_PRE_BUTTON, jSONObject));
        osgVar.n(osv.c(ParsedFieldTag.KAKA_TASK_POST_BUTTON, jSONObject));
        osgVar.c(osv.c(ParsedFieldTag.KAKA_TASK_PRE_BTN_URL, jSONObject));
        osgVar.g(osv.a("category", jSONObject));
        osgVar.r(osv.a(ParsedFieldTag.KAKA_TASK_RULE, jSONObject));
        osgVar.k(osv.a("level", jSONObject));
        osgVar.h(osv.a(ParsedFieldTag.KAKA_TASK_BONUS_TYPE, jSONObject));
        osgVar.c(osv.a("weight", jSONObject));
        osgVar.i(osv.e("updateTime", jSONObject));
        osgVar.n(osv.a(ParsedFieldTag.KAKA_TASK_SCENARIO, jSONObject));
        osgVar.p(osv.a(ParsedFieldTag.KAKA_TASK_VIP_MATCH, jSONObject));
        osgVar.f(osv.c("picture", jSONObject));
        osgVar.i(osv.c(ParsedFieldTag.KAKA_TASK_BTN_COLOR, jSONObject));
        osgVar.o(osv.a(ParsedFieldTag.KAKA_TASK_LABLE_MATCH, jSONObject));
    }

    private static void e(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int iA = osv.a(ParsedFieldTag.KAKA_TASK_RULE, jSONObject);
        int iA2 = osv.a(ParsedFieldTag.KAKA_TASK_SCENARIO, jSONObject);
        int iA3 = osv.a("status", jSONObject);
        if (iA2 == 0 && pap.e(iA) && iA3 >= 1) {
            sb.append(iA);
            sb.append(",");
        }
        if (iA2 == 2 && pap.e(iA) && iA3 >= 1) {
            sb2.append(iA);
            sb2.append(",");
        }
    }

    private static void e(StringBuilder sb, StringBuilder sb2) {
        if (sb == null || TextUtils.isEmpty(sb.toString())) {
            LogUtil.j("PLGACHIEVE_AchieveKakaParser", "handleLevelNewTask kakaNewTaskRuleStr isEmpty.");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "handleLevelNewTask kakaNewTaskRuleStr:", sb.toString(), "levelNewTaskRuleStr ", sb2.toString());
        for (Integer num : d) {
            if (a(String.valueOf(num), sb, sb2)) {
                LogUtil.a("PLGACHIEVE_AchieveKakaParser", "handleLevelNewTask taskRuleId:", num);
                oru.a(BaseApplication.getContext()).c(BaseApplication.getContext(), String.valueOf(num), new HashMap(16));
            }
        }
    }

    private static boolean a(String str, StringBuilder sb, StringBuilder sb2) {
        return (sb == null || sb2 == null || !sb.toString().contains(str) || sb2.toString().contains(str)) ? false : true;
    }

    static UserAchieveWrapper e(int i, String str) {
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(i);
        try {
            JSONObject jSONObject = new JSONObject(str);
            userAchieveWrapper.setResultCode(jSONObject.optString("resultCode"));
            osd osdVar = new osd();
            osdVar.c(osv.c("resultCode", jSONObject));
            osdVar.a(osv.c("resultDesc", jSONObject));
            osdVar.e(osv.a("kaka", jSONObject));
            osdVar.d(osv.a(ParsedFieldTag.TOTAL_KAKA, jSONObject));
            String strC = osv.c("taskId", jSONObject);
            String strC2 = osv.c(ParsedFieldTag.RESULTS, jSONObject);
            if (!TextUtils.isEmpty(strC2)) {
                osdVar.a(osv.d(strC2, new HashMap(16)));
                if (i == 12) {
                    strC = d(osdVar.a());
                }
            }
            osdVar.e(strC);
            userAchieveWrapper.saveKakaUpdateReturnBody(osdVar);
            pap.b(strC);
            LogUtil.a("PLGACHIEVE_AchieveKakaParser", "kakaUpdateReturnBody=", osdVar.toString());
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaUpdateBody Exception:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    public static UserAchieveWrapper b(String str) {
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaCheckInResult json");
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(19);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            userAchieveWrapper.setResultCode(strOptString);
            if (!osv.d(strOptString)) {
                return userAchieveWrapper;
            }
            KakaCheckInReturnBody kakaCheckInReturnBody = new KakaCheckInReturnBody();
            kakaCheckInReturnBody.setConDays(jSONObject.optInt(ParsedFieldTag.KAKA_CONSECUTIVE_DAYS));
            kakaCheckInReturnBody.setKakaSum(jSONObject.optInt(ParsedFieldTag.KAKA_SUM));
            kakaCheckInReturnBody.setKaka(jSONObject.optInt("kaka"));
            userAchieveWrapper.setKakaCheckInReturnBody(kakaCheckInReturnBody);
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaCheckInResult Exception:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    public static UserAchieveWrapper d(String str) {
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaCheckedRecords json");
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(20);
        try {
            String strOptString = new JSONObject(str).optString("resultCode");
            userAchieveWrapper.setResultCode(strOptString);
            if (!osv.d(strOptString)) {
                userAchieveWrapper.setKakaCheckinRecords(null);
                return userAchieveWrapper;
            }
            userAchieveWrapper.setKakaCheckinRecords(e(str, ParsedFieldTag.KAKA_CHECKED_IN_RECORDES, KakaCheckinRecord.class));
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaCheckedRecords Exception:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    public static UserAchieveWrapper i(String str) {
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaGiftList json");
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(21);
        try {
            String strOptString = new JSONObject(str).optString("resultCode");
            userAchieveWrapper.setResultCode(strOptString);
            if (!osv.d(strOptString)) {
                userAchieveWrapper.setKakaGiftInfos(null);
                return userAchieveWrapper;
            }
            userAchieveWrapper.setKakaGiftInfos(e(str, ParsedFieldTag.KAKA_GET_GIFTS, GiftInfo.class));
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaGiftList Exception:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    public static UserAchieveWrapper g(String str) {
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseKakaRedeemGiftResult json");
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(22);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            userAchieveWrapper.setResultCode(strOptString);
            if (!osv.d(strOptString)) {
                return userAchieveWrapper;
            }
            KakaRedeemGiftReturnBody kakaRedeemGiftReturnBody = new KakaRedeemGiftReturnBody();
            kakaRedeemGiftReturnBody.setAwardId(jSONObject.optString(ParsedFieldTag.KAKA_REDEEM_GIFT_ID));
            kakaRedeemGiftReturnBody.setSumKaka(jSONObject.optInt(ParsedFieldTag.KAKA_LEFT_POINT));
            kakaRedeemGiftReturnBody.setExchangeCode(jSONObject.optString(ParsedFieldTag.KAKA_REDEEM_EXCHANGE_CODE));
            kakaRedeemGiftReturnBody.setToUseUrl(jSONObject.optString(ParsedFieldTag.KAKA_REDEEM_TO_USE_URL));
            userAchieveWrapper.setKakaRedeemGiftReturnBody(kakaRedeemGiftReturnBody);
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseKakaRedeemGiftResult Exception:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    public static UserAchieveWrapper n(String str) {
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseRedeemGiftRecordList json");
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(23);
        try {
            String strOptString = new JSONObject(str).optString("resultCode");
            userAchieveWrapper.setResultCode(strOptString);
            if (!osv.d(strOptString)) {
                userAchieveWrapper.setRedeemGiftRecords(null);
                return userAchieveWrapper;
            }
            userAchieveWrapper.setRedeemGiftRecords(e(str, ParsedFieldTag.KAKA_CHECKED_IN_RECORDES, GiftRecord.class));
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseRedeemGiftRecordList Exception:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    public static <T> List<T> e(String str, String str2, Class<T> cls) {
        Object objFromJson;
        LogUtil.a("PLGACHIEVE_AchieveKakaParser", "parseRecordList json");
        ArrayList arrayList = new ArrayList(16);
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(str2);
            if (jSONArrayOptJSONArray != null) {
                Gson gson = new Gson();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    if (jSONObject != null && (objFromJson = gson.fromJson(jSONObject.toString(), (Class<Object>) cls)) != null) {
                        arrayList.add(objFromJson);
                    }
                }
            }
            return arrayList;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveKakaParser", "parseRecordList Exception:", e.getMessage());
            return arrayList;
        }
    }

    private static String d(Map<String, Object> map) {
        if (map != null && map.size() == 1) {
            return map.keySet().iterator().next();
        }
        return "";
    }

    private static Integer d(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(ParsedFieldTag.REMAINING_KAKA);
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }
}
