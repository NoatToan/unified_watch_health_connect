package com.huami.watch.dataflow.sync.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.huami.passport.AccountManager;
import com.huami.watch.dataflow.model.firstbeat.FirstbeatParams;
import com.huami.watch.dataflow.sync.bean.AtrialFibrillationData;
import com.huami.watch.dataflow.sync.bean.ComplexSportData;
import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import com.huami.watch.dataflow.sync.bean.HealthData;
import com.huami.watch.dataflow.sync.bean.HeartRateData;
import com.huami.watch.dataflow.sync.bean.SingleSportData;
import com.huami.watch.dataflow.sync.bean.SportData;
import com.huami.watch.dataflow.sync.bean.SyncData;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.Constant;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SyncParser {
    private static final String a = "SyncWatch-Parser";

    private static Long a(long j, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        DateDay dateDayFrom = DateDay.from(str);
        calendar.set(1, dateDayFrom.year());
        calendar.set(2, dateDayFrom.month() - 1);
        calendar.set(5, dateDayFrom.day());
        return Long.valueOf(calendar.getTimeInMillis());
    }

    private static void b(SingleSportData singleSportData, JSONObject jSONObject) {
        singleSportData.setTrackid(jSONObject.optLong("trackid"));
        singleSportData.setSummary(jSONObject.optString("summary"));
        singleSportData.setDetail(jSONObject.optString("detail"));
    }

    private static void c(JSONArray jSONArray, List<FirstbeatData.Item> list) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            FirstbeatData.Item item = new FirstbeatData.Item();
            item.setData(jSONObject.toString());
            item.setDayId(jSONObject.optString(FirstbeatParams.PARAM_DAY_ID));
            list.add(item);
        }
    }

    private static void d(Context context, HealthData.Item item, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("metadata");
            if (jSONArrayOptJSONArray != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString("date");
                    if (!DateDay.checkIsLegal(strOptString)) {
                        Log.d(a, "Summary date is illegal : " + strOptString, new Object[0]);
                        return;
                    }
                    long jDayStartMills = DateDay.from(strOptString).dayStartMills();
                    String strOptString2 = jSONObject2.optString("summary");
                    if (!TextUtils.isEmpty(strOptString2) && (jSONObjectOptJSONObject = new JSONObject(strOptString2).optJSONObject("pai")) != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        if (jSONObjectOptJSONObject.optInt("ver") >= 5) {
                            jSONObject3.put("userId", AccountManager.getDefault(context).getCurrentUid());
                            jSONObject3.put("eventType", jSONObjectOptJSONObject.optString("et"));
                            jSONObject3.put("timestamp", jDayStartMills);
                            jSONObject3.put("time", a(jSONObjectOptJSONObject.optLong("tm"), strOptString));
                            jSONObject3.put("timeZone", jSONObjectOptJSONObject.optInt("tz"));
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(Constant.PAI_KEY_ACTIVITY_SCORES);
                            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                jSONObject3.put("activityScores", jSONArrayOptJSONArray2.toString());
                            }
                            jSONObject3.put("lowZonePai", jSONObjectOptJSONObject.optDouble(Constant.PAI_KEY_LOW_ZONE_PAI));
                            jSONObject3.put("mediumZonePai", jSONObjectOptJSONObject.optDouble(Constant.PAI_KEY_MEDIUM_ZONE_PAI));
                            jSONObject3.put("highZonePai", jSONObjectOptJSONObject.optDouble(Constant.PAI_KEY_HIGH_ZONE_PAI));
                            jSONObject3.put("lowZoneMinutes", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_LOW_ZONE_MINUTES));
                            jSONObject3.put("mediumZoneMinutes", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES));
                            jSONObject3.put("highZoneMinutes", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_HIGH_ZONE_MINUTES));
                            jSONObject3.put("dailyPai", jSONObjectOptJSONObject.optDouble(Constant.PAI_KEY_DAILY_PAI));
                            jSONObject3.put("totalPai", jSONObjectOptJSONObject.optDouble("tp"));
                            jSONObject3.put(Constant.PAI_KEY_RHR, jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_RHR));
                            jSONObject3.put(Constant.PAI_KEY_MAX_HR, jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_MAX_HR));
                            jSONObject3.put("index", jSONObjectOptJSONObject.optInt("idx"));
                            jSONObject3.put("age", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_AGE));
                            jSONObject3.put("gender", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_GENDER));
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("nas");
                            if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                                jSONObject3.put("nextActivityScores", jSONArrayOptJSONArray3.toString());
                            }
                            jSONObject3.put("version", jSONObjectOptJSONObject.optInt("ver"));
                            jSONObject3.put("uploadTimestamp", System.currentTimeMillis());
                            jSONObject3.put("deviceSource", jSONObjectOptJSONObject.optString("ds"));
                            jSONObject3.put("deviceId", jSONObjectOptJSONObject.optString("did"));
                            jSONObject3.put("sn", jSONObjectOptJSONObject.optString("sn"));
                            jSONObject3.put("lowZoneLowerLimit", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_LHR));
                            jSONObject3.put("mediumZoneLowerLimit", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_MHR));
                            jSONObject3.put("highZoneLowerLimit", jSONObjectOptJSONObject.optInt(Constant.PAI_KEY_HHR));
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
                if (jSONArray.length() > 0) {
                    item.paiData = jSONArray.toString();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public static AtrialFibrillationData toAtrialFibrillationData(@NonNull String str) {
        try {
            return (AtrialFibrillationData) new Gson().fromJson(str, AtrialFibrillationData.class);
        } catch (Exception e) {
            Log.e(a, "ParseAtrialFibrillationDataErr", e, new Object[0]);
            return null;
        }
    }

    @Nullable
    public static FirstbeatData toFirstbeatData(@NonNull String str) {
        FirstbeatData firstbeatData = new FirstbeatData();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("firstbeatconfig");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                firstbeatData.firstbeatconfig = jSONObjectOptJSONObject.toString();
            }
            c(jSONObject.optJSONArray("vo2max"), firstbeatData.getVo2max());
            c(jSONObject.optJSONArray("sportThaInfo"), firstbeatData.getSportThaInfo());
            return firstbeatData;
        } catch (Exception e) {
            Log.e(a, "ParseFirstbeatDataErr", e, new Object[0]);
            return null;
        }
    }

    @Nullable
    public static HealthData toHealthData(Context context, @NonNull String str) {
        HealthData healthData = new HealthData();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return healthData;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                HealthData.Item item = new HealthData.Item();
                item.setLastSyncTime(jSONObject.optLong("lastSyncTime"));
                item.setData(jSONObject.toString());
                d(context, item, jSONObject);
                healthData.items.add(item);
            }
            return healthData;
        } catch (JSONException e) {
            Log.e(a, "ParseHealthDataErr", e, new Object[0]);
            return null;
        }
    }

    public static HeartRateData toHeartRateData(@NonNull String str) {
        HeartRateData heartRateData = new HeartRateData();
        try {
            JSONObject jSONObject = new JSONObject(str);
            heartRateData.setSyncTime(jSONObject.optLong("syncTime"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return heartRateData;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                heartRateData.getItems().add(new HeartRateData.Item(jSONObject2.optLong("generatedTime"), jSONObject2.toString()));
            }
            return heartRateData;
        } catch (JSONException e) {
            Log.w(a, "ParseHeartRateDataErr", e, new Object[0]);
            return null;
        }
    }

    @Nullable
    public static SportData toSportData(@NonNull String str) {
        SportData sportData = new SportData();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optBoolean("isSingle")) {
                SingleSportData singleSportData = new SingleSportData();
                b(singleSportData, jSONObject);
                sportData.items.add(singleSportData);
                return sportData;
            }
            ComplexSportData complexSportData = new ComplexSportData();
            b(complexSportData.getParent(), new JSONObject(jSONObject.optString("parent")));
            JSONArray jSONArray = new JSONArray(jSONObject.optString("children"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                SingleSportData singleSportData2 = new SingleSportData();
                b(singleSportData2, jSONObject2);
                complexSportData.getChildren().add(singleSportData2);
            }
            sportData.items.add(complexSportData);
            return sportData;
        } catch (Exception e) {
            Log.e(a, "ParseSportDataErr", e, new Object[0]);
            return null;
        }
    }

    @Nullable
    public static SyncData toSyncData(HashMap map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        SyncData syncData = new SyncData();
        syncData.setSessionId((String) map.get("sessionId"));
        try {
            JSONObject jSONObject = new JSONObject(str);
            syncData.setDataType(jSONObject.optString("dataType"));
            syncData.setData(jSONObject.optString("data"));
            return syncData;
        } catch (JSONException e) {
            e.printStackTrace();
            return syncData;
        }
    }
}
