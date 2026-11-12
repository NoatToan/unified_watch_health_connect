package com.huawei.operation.operationactivity;

import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import defpackage.njy;
import defpackage.nsj;
import defpackage.nsq;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class OperationActivityParser {
    private static final String TAG = "OperationActivity_OperationActivityParser";

    private OperationActivityParser() {
    }

    public static nsq analyzeOperationActivityResponse(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "analyzeOperationActivityResponse json is empty.");
            return null;
        }
        nsq nsqVar = new nsq();
        try {
            JSONObject jSONObject = new JSONObject(str);
            nsqVar.b(getStringValue(jSONObject, "resultCode"));
            nsqVar.d(getStringValue(jSONObject, "resultDesc"));
            nsqVar.c(getStringValue(jSONObject, "currentTime"));
            nsqVar.e(getIntValue(jSONObject, "hasMore"));
            nsqVar.d(getIntValue(jSONObject, "pageNo"));
            nsqVar.a(getIntValue(jSONObject, IAchieveDBMgr.PARAM_PAGE_SIZE));
            List<nsj> listAnalyzeActivities = analyzeActivities(jSONObject);
            if (njy.b(listAnalyzeActivities)) {
                nsqVar.e(listAnalyzeActivities);
            }
            return nsqVar;
        } catch (JSONException e) {
            LogUtil.e(TAG, "getActivities Json data error! JSONException:", e.getMessage());
            return null;
        }
    }

    public static List<nsj> analyzeActivities(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONObject == null) {
            LogUtil.j(TAG, "analyzeActivities() jsonObject is null.");
            return arrayList;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("activities");
        if (jSONArrayOptJSONArray == null) {
            LogUtil.j(TAG, "analyzeActivities() activityJsonArray is null.");
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (jSONObject2 == null) {
                    LogUtil.j(TAG, "analyzeActivities() jsonObjectActivity is null.");
                } else {
                    nsj nsjVarAnalyzeActivitySimpleObject = analyzeActivitySimpleObject(jSONObject2);
                    if (nsjVarAnalyzeActivitySimpleObject == null) {
                        LogUtil.j(TAG, "analyzeActivities() activitySimple is null.");
                    } else if (!arrayList.contains(nsjVarAnalyzeActivitySimpleObject)) {
                        arrayList.add(nsjVarAnalyzeActivitySimpleObject);
                    }
                }
            } catch (JSONException e) {
                LogUtil.e(TAG, "analyzeActivities meet json exception: ", e.getMessage());
            }
        }
        return arrayList;
    }

    private static nsj analyzeActivitySimpleObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j(TAG, "analyzeActivitySimpleObject() jsonObject is null.");
            return null;
        }
        nsj nsjVar = new nsj();
        try {
            nsjVar.b(getStringValue(jSONObject, "activityId"));
            nsjVar.a(getStringValue(jSONObject, "activityName"));
            nsjVar.i(getStringValue(jSONObject, "description"));
            nsjVar.l(getStringValue(jSONObject, "imgUrl"));
            nsjVar.h(getStringValue(jSONObject, ParsedFieldTag.BEGIN_DATE));
            analyzeCommonFields(jSONObject, nsjVar);
            analyzeOtherFields(jSONObject, nsjVar);
            return nsjVar;
        } catch (JSONException e) {
            LogUtil.e(TAG, "analyzeActivitySimpleObject meet json exception: ", e.getMessage());
            return null;
        }
    }

    private static void analyzeCommonFields(JSONObject jSONObject, nsj nsjVar) throws JSONException {
        if (jSONObject == null || nsjVar == null) {
            return;
        }
        nsjVar.g(getStringValue(jSONObject, "endDate"));
        nsjVar.j(getIntValue(jSONObject, "numberOfPeople"));
        nsjVar.d(getIntValue(jSONObject, "activityStatus"));
        nsjVar.e(getIntValue(jSONObject, SyncDataConstant.BI_KEY_ACTIVITY_TYPE));
        nsjVar.n(getIntValue(jSONObject, BleConstants.SPORT_TYPE));
        nsjVar.k(getIntValue(jSONObject, "templateType"));
        nsjVar.r(getStringValue(jSONObject, "wordDesc"));
        nsjVar.c(getIntValue(jSONObject, "activityBrand"));
        nsjVar.b(getIntValue(jSONObject, "activitySubdivided"));
        nsjVar.e(getStringValue(jSONObject, "activityLink"));
        nsjVar.k(getStringValue(jSONObject, "lastModifyTime"));
        nsjVar.a(getIntValue(jSONObject, "activityPosition"));
        nsjVar.o(getIntValue(jSONObject, "rotinePosition"));
        nsjVar.d(getStringValue(jSONObject, "appVersion"));
    }

    private static void analyzeOtherFields(JSONObject jSONObject, nsj nsjVar) throws JSONException {
        if (jSONObject == null || nsjVar == null) {
            return;
        }
        nsjVar.c(getStringValue(jSONObject, "activityContext"));
        nsjVar.o(getStringValue(jSONObject, "matchBeginDate"));
        nsjVar.i(getIntValue(jSONObject, "isMedal"));
        if (!jSONObject.isNull("attendDate")) {
            nsjVar.c(jSONObject.getLong("attendDate"));
        }
        nsjVar.j(getStringValue(jSONObject, "attendTimeZone"));
        nsjVar.q(getStringValue(jSONObject, "workoutUserLable"));
        nsjVar.t(getStringValue(jSONObject, CommonUtil.PAGE_TYPE));
        nsjVar.f(getIntValue(jSONObject, CommonUtil.IMAGE_TEXT_SEPARATE_SWITCH));
        nsjVar.p(getStringValue(jSONObject, "ux10ImgUrl"));
        nsjVar.s(getStringValue(jSONObject, "timeZone"));
        nsjVar.g(getIntValue(jSONObject, "isFree"));
        nsjVar.h(getIntValue(jSONObject, "isMultiLevelFlag"));
        nsjVar.m(getStringValue(jSONObject, "joinDeadLine"));
        nsjVar.n(getStringValue(jSONObject, "lotteryTime"));
        nsjVar.f(getStringValue(jSONObject, "countryCodes"));
    }

    private static String getStringValue(JSONObject jSONObject, String str) {
        if (jSONObject != null && !jSONObject.isNull(str)) {
            try {
                if (jSONObject.isNull(str)) {
                    return "";
                }
                return jSONObject.getString(str);
            } catch (JSONException e) {
                LogUtil.e(TAG, "getJsonValue meet json exception: ", e.getMessage());
            }
        }
        return "";
    }

    private static int getIntValue(JSONObject jSONObject, String str) {
        if (jSONObject != null && !jSONObject.isNull(str)) {
            try {
                if (jSONObject.isNull(str)) {
                    return 0;
                }
                return jSONObject.getInt(str);
            } catch (JSONException e) {
                LogUtil.e(TAG, "getJsonValue meet json exception: ", e.getMessage());
            }
        }
        return 0;
    }
}
