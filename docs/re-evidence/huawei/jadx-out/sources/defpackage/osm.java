package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.RecentMonthRecord;
import com.huawei.pluginachievement.manager.model.RecentWeekRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class osm {
    static UserAchieveWrapper c(String str) {
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(3);
        RecentMonthRecord recentMonthRecord = new RecentMonthRecord();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            userAchieveWrapper.setResultCode(strOptString);
            int iOptInt = jSONObject.optInt("reportNo");
            recentMonthRecord.setReportNo(iOptInt);
            int iOptInt2 = jSONObject.optInt(ParsedFieldTag.MIN_REPORT_NO);
            recentMonthRecord.setMinReportNo(iOptInt2);
            recentMonthRecord.saveEndDate(jSONObject.optLong("endDate"));
            recentMonthRecord.saveFirstDate(jSONObject.optLong(ParsedFieldTag.FIRST_DATE));
            recentMonthRecord.setEndUtcDate(jSONObject.optLong(ParsedFieldTag.END_UTC_DATE));
            if (!osv.d(strOptString)) {
                if (iOptInt2 != 0) {
                    iOptInt = iOptInt2;
                }
                recentMonthRecord.setMinReportNo(iOptInt);
                userAchieveWrapper.setRecentMonthRecord(recentMonthRecord);
                return userAchieveWrapper;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ParsedFieldTag.USER_REPORT);
            if (jSONObjectOptJSONObject == null) {
                userAchieveWrapper.setRecentMonthRecord(recentMonthRecord);
                return userAchieveWrapper;
            }
            recentMonthRecord.setSteps(jSONObjectOptJSONObject.optDouble(ParsedFieldTag.SUM_STEPS_NEW));
            double dC = osp.c(jSONObjectOptJSONObject.optDouble(ParsedFieldTag.SUM_RUN_DISTANCE));
            recentMonthRecord.setDistance(dC);
            recentMonthRecord.setKakaNum(jSONObjectOptJSONObject.optInt("kaka"));
            recentMonthRecord.setPrice(jSONObjectOptJSONObject.optInt(ParsedFieldTag.PRICE));
            recentMonthRecord.setMedals(osv.e(jSONObjectOptJSONObject.optJSONArray(ParsedFieldTag.USER_MEDALS)));
            recentMonthRecord.setDistanceRanking(osv.c(ParsedFieldTag.SUM_RUN_DISTANCE_DESC, jSONObjectOptJSONObject, dC, 1));
            recentMonthRecord.setStepsRanking(jSONObjectOptJSONObject.optDouble(ParsedFieldTag.SUM_STEPS_DESC));
            userAchieveWrapper.setRecentMonthRecord(recentMonthRecord);
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveReportParser", "parseMonthly Exception:", e.getMessage());
            userAchieveWrapper.setRecentMonthRecord(recentMonthRecord);
            return userAchieveWrapper;
        }
    }

    static UserAchieveWrapper d(String str) {
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(2);
        RecentWeekRecord recentWeekRecord = new RecentWeekRecord();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            userAchieveWrapper.setResultCode(strOptString);
            int iOptInt = jSONObject.optInt("reportNo");
            recentWeekRecord.setReportNo(iOptInt);
            int iOptInt2 = jSONObject.optInt(ParsedFieldTag.MIN_REPORT_NO);
            recentWeekRecord.setMinReportNo(iOptInt2);
            recentWeekRecord.saveEndDate(jSONObject.optLong("endDate"));
            recentWeekRecord.saveFirstDate(jSONObject.optLong(ParsedFieldTag.FIRST_DATE));
            recentWeekRecord.setEndUtcDate(jSONObject.optLong(ParsedFieldTag.END_UTC_DATE));
            if (!osv.d(strOptString)) {
                if (iOptInt2 != 0) {
                    iOptInt = iOptInt2;
                }
                recentWeekRecord.setMinReportNo(iOptInt);
                userAchieveWrapper.setRecentWeekRecord(recentWeekRecord);
                return userAchieveWrapper;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ParsedFieldTag.USER_REPORT);
            if (jSONObjectOptJSONObject == null) {
                userAchieveWrapper.setRecentWeekRecord(recentWeekRecord);
                return userAchieveWrapper;
            }
            recentWeekRecord.setSteps(jSONObjectOptJSONObject.optDouble(ParsedFieldTag.SUM_STEPS_NEW));
            double dC = osp.c(jSONObjectOptJSONObject.optDouble(ParsedFieldTag.SUM_RUN_DISTANCE));
            recentWeekRecord.setDistance(dC);
            recentWeekRecord.setKakaNum(jSONObjectOptJSONObject.optInt("kaka"));
            recentWeekRecord.setPrice(jSONObjectOptJSONObject.optInt(ParsedFieldTag.PRICE));
            recentWeekRecord.setUserMedals(osv.e(jSONObjectOptJSONObject.optJSONArray(ParsedFieldTag.USER_MEDALS)));
            recentWeekRecord.setDistanceRanking(osv.c(ParsedFieldTag.SUM_RUN_DISTANCE_DESC, jSONObjectOptJSONObject, dC, 0));
            recentWeekRecord.setStepsRanking(jSONObjectOptJSONObject.optDouble(ParsedFieldTag.SUM_STEPS_DESC));
            userAchieveWrapper.setRecentWeekRecord(recentWeekRecord);
            return userAchieveWrapper;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveReportParser", "parseWeekly Exception:", e.getMessage());
            userAchieveWrapper.setRecentWeekRecord(recentWeekRecord);
            return userAchieveWrapper;
        }
    }
}
