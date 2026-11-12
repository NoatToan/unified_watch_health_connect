package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.AchieveLevelTotalInfo;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.manager.model.ExperienceHistoryBean;
import com.huawei.pluginachievement.manager.model.LevelLineRecord;
import com.huawei.pluginachievement.manager.model.LevelUpdateReturnBody;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class osq {
    static ArrayList<UserAchieveWrapper> a(String str) {
        ArrayList<UserAchieveWrapper> arrayList = new ArrayList<>(16);
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(13);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                userAchieveWrapper.setResultCode(strOptString);
                arrayList.add(userAchieveWrapper);
                return arrayList;
            }
            AchieveUserLevelInfo achieveUserLevelInfo = new AchieveUserLevelInfo();
            double d = osv.d(ParsedFieldTag.DAY_LEVEL, jSONObject);
            int iA = osv.a(ParsedFieldTag.USER_LEVEL, jSONObject);
            int iA2 = osv.a(ParsedFieldTag.USER_EXPERIENCE, jSONObject);
            long jE = osv.e("timestamp", jSONObject);
            achieveUserLevelInfo.saveUserLevel(iA);
            achieveUserLevelInfo.saveUserExperience(iA2);
            achieveUserLevelInfo.saveSyncTimestamp(jE);
            achieveUserLevelInfo.saveUserReachDays(d);
            userAchieveWrapper.saveAchieveUserLevelInfo(achieveUserLevelInfo);
            arrayList.add(userAchieveWrapper);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ParsedFieldTag.LEVEL_USER_COUNT_LIST);
            if (jSONArrayOptJSONArray == null) {
                LogUtil.a("PLGACHIEVE_AchieveLevelParser", "array is null");
            } else {
                e(arrayList, jSONArrayOptJSONArray, jE, jSONObject);
            }
            LogUtil.a("PLGACHIEVE_AchieveLevelParser", "parseLevelInfo get userLevel ", Integer.valueOf(iA), " userExperience ", Integer.valueOf(iA2));
            return arrayList;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveLevelParser", "parseLevelInfo Exception:", e.getMessage());
            return arrayList;
        }
    }

    private static void e(ArrayList<UserAchieveWrapper> arrayList, JSONArray jSONArray, long j, JSONObject jSONObject) {
        LogUtil.a("PLGACHIEVE_AchieveLevelParser", "array size=", Integer.valueOf(jSONArray.length()));
        ArrayList arrayList2 = new ArrayList(8);
        int i = 0;
        int i2 = 0;
        while (i < jSONArray.length()) {
            AchieveLevelTotalInfo achieveLevelTotalInfo = new AchieveLevelTotalInfo();
            int i3 = i + 1;
            achieveLevelTotalInfo.saveLevel(i3);
            try {
                i2 += jSONArray.getInt(i);
                achieveLevelTotalInfo.saveUserNumber(jSONArray.getInt(i));
            } catch (JSONException e) {
                LogUtil.e("PLGACHIEVE_AchieveLevelParser", "parseLevelList Exception:", e.getMessage());
            }
            achieveLevelTotalInfo.saveSyncTime(j);
            UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(13);
            userAchieveWrapper.saveAchieveLevelTotalInfo(achieveLevelTotalInfo);
            arrayList.add(userAchieveWrapper);
            arrayList2.add(oyy.b(achieveLevelTotalInfo, i2));
            i = i3;
        }
        double d = osv.d(ParsedFieldTag.LEVEL_VIP_RATE, jSONObject);
        LogUtil.a("PLGACHIEVE_AchieveLevelParser", "parseLevelList ruleRate ", Double.valueOf(d));
        int iA = osv.a(ParsedFieldTag.USER_LEVEL, jSONObject);
        osa.b(BaseApplication.getContext(), "levelTypeData", "[" + iA + "," + osv.a(ParsedFieldTag.USER_EXPERIENCE, jSONObject) + "," + paq.b(iA, arrayList2, 1) + "," + paq.b(iA, arrayList2, 2) + "," + paq.b(iA, arrayList2, 3) + "," + paq.b(iA, arrayList2, 4) + "," + paq.b(iA, arrayList2, 5) + "," + paq.b(iA, arrayList2, 6) + "," + paq.b(iA, arrayList2, 7) + "," + d + "]");
    }

    static UserAchieveWrapper b(String str) {
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(14);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            LevelUpdateReturnBody levelUpdateReturnBody = new LevelUpdateReturnBody();
            levelUpdateReturnBody.saveResultDes(osv.c("resultDesc", jSONObject));
            levelUpdateReturnBody.saveRewardExperience(osv.a(ParsedFieldTag.EXPERIENCE, jSONObject));
            levelUpdateReturnBody.saveTotalExperience(osv.a(ParsedFieldTag.TOTAL_EXPERIENCE, jSONObject));
            userAchieveWrapper.saveLevelUpdateReturnBody(levelUpdateReturnBody);
            LogUtil.a("PLGACHIEVE_AchieveLevelParser", "levelUpdateReturnBody=", levelUpdateReturnBody.toString());
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveLevelParser", "parseLevelUpdateInfo Exception:", e.getMessage());
            return userAchieveWrapper;
        }
    }

    public static void d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            LogUtil.a("PLGACHIEVE_AchieveLevelParser", "parseLevelImageLabelInfo json:", str);
            if (osv.d(strOptString)) {
                String strC = osv.c("label", jSONObject);
                if (!TextUtils.isEmpty(strC)) {
                    osa.b(BaseApplication.getContext(), "AchieveLevelLabel", strC);
                    return;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("labels");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        sb.append(jSONArray.getInt(i));
                        sb.append(",");
                    } catch (JSONException e) {
                        LogUtil.e("PLGACHIEVE_AchieveLevelParser", "parseLevelList Exception:", e.getMessage());
                    }
                }
                String string = sb.toString();
                LogUtil.a("PLGACHIEVE_AchieveLevelParser", "parseLevelImageLabelInfo labels:", string);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                osa.b(BaseApplication.getContext(), "AchieveLevelLabel", string);
            }
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveLevelParser", "parseLevelUpdateInfo Exception:", e2.getMessage());
        }
    }

    public static UserAchieveWrapper e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            LogUtil.a("PLGACHIEVE_AchieveLevelParser", "parseLevelHistoryRecord json:", str);
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(25);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ParsedFieldTag.KAKA_CHECKED_IN_RECORDES);
            if (jSONArrayOptJSONArray == null) {
                return new UserAchieveWrapper(25);
            }
            ArrayList arrayList = new ArrayList(8);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                Object objOpt = jSONArrayOptJSONArray.opt(i);
                if (objOpt instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objOpt;
                    ExperienceHistoryBean experienceHistoryBean = new ExperienceHistoryBean();
                    long jOptLong = jSONObject2.optLong(ParsedFieldTag.TASK_COMPLETE_TIME);
                    experienceHistoryBean.setCompleteTime(jOptLong);
                    experienceHistoryBean.setExperienceValue(jSONObject2.optInt(ParsedFieldTag.TASK_EXPERIENCE_VALUE));
                    experienceHistoryBean.setReasonId(jSONObject2.optInt(ParsedFieldTag.TASK_REASON_ID));
                    experienceHistoryBean.setNewLevel(jSONObject2.optInt(ParsedFieldTag.TASK_NEW_LEVEL));
                    experienceHistoryBean.setReasonDesc(jSONObject2.optString(ParsedFieldTag.TASK_REASON_DESC));
                    experienceHistoryBean.setMonthOfYear(paw.d(jOptLong, 0));
                    experienceHistoryBean.setDayOfMonth(paw.d(jOptLong, 1));
                    experienceHistoryBean.setTime(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(jOptLong)));
                    arrayList.add(experienceHistoryBean);
                }
            }
            LevelLineRecord levelLineRecord = new LevelLineRecord();
            levelLineRecord.setRecords(arrayList);
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(25);
            userAchieveWrapper2.setLevelLineRecord(levelLineRecord);
            return userAchieveWrapper2;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveLevelParser", "parseLevelUpdateInfo Exception:", e.getMessage());
            return new UserAchieveWrapper(25);
        }
    }
}
