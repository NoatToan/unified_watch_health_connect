package com.xiaomi.hm.health.speech.utils;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.speech.constant.BandSeriesDeviceSkill;
import com.xiaomi.hm.health.speech.entity.AlarmEventSkill;
import com.xiaomi.hm.health.speech.entity.AlarmTimerOffset;
import com.xiaomi.hm.health.speech.entity.DeployCustomReply;
import com.xiaomi.hm.health.speech.entity.PayLoad;
import com.xiaomi.hm.health.speech.entity.SmartMiotAnswer;
import com.xiaomi.hm.health.speech.entity.SmartMiotAnswerIntention;
import com.xiaomi.hm.health.speech.entity.SmartMiotSkill;
import com.xiaomi.hm.health.speech.entity.SmartMiotStatusExtend;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class JsonParseUtils {
    public static final String AIR_INQUIRY = "air_inquiry";
    public static final String ANSWER_TYPE = "answer_type";
    public static final String CIRCLE = "circle";
    public static final String CIRCLE_EVERYDAY = "everyday";
    public static final String CIRCLE_EVERYWEEK = "everyweek";
    public static final String CIRCLE_EXTRA = "circle_extra";
    public static final String CIRCLE_MONTHLY = "monthly";
    public static final String CIRCLE_ONCE = "once";
    public static final String CIRCLE_WEEKEND = "weekend";
    public static final String CIRCLE_WORKING_DAY = "montofri";
    public static final String CIRCLE_YEARLY = "yearly";
    public static final String CURRENT = "CURRENT";
    public static final String DEVICE_COMMAND_PAYLOAD_BUNDLE_FALLBACK = "";
    public static final String DEVICE_COMMAND_PAYLOAD_EXTENSION_FALLBACK = "";
    public static final int DEVICE_COMMAND_PAYLOAD_REPLAY_TYPE_FALLBACK = 0;
    public static final String DEVICE_COMMAND_PAYLOAD_REPLY_TEXT_FALLBACK = "";
    public static final int DEVICE_COMMAND_PAYLOAD_VERSION_FALLBACK = 1;
    public static final String FORECAST = "FORECAST";
    public static final String JSON_KEY_DEVICE_COMMAND = "device_command";
    public static final String JSON_KEY_DEVICE_COMMAND_PAYLOAD_BUNDLE = "bundle";
    public static final String JSON_KEY_DEVICE_COMMAND_PAYLOAD_EXTENSION = "extension";
    public static final String JSON_KEY_DEVICE_COMMAND_PAYLOAD_INTENT = "intent";
    public static final String JSON_KEY_DEVICE_COMMAND_PAYLOAD_REPLEY_TEXT = "text";
    public static final String JSON_KEY_DEVICE_COMMAND_PAYLOAD_REPLY = "reply";
    public static final String JSON_KEY_DEVICE_COMMAND_PAYLOAD_REPLY_TYPE = "type";
    public static final String JSON_KEY_DEVICE_COMMAND_PAYLOAD_VERSION = "version";
    public static final String JSON_KEY_OPEN_MIC = "open_mic";
    public static final String JSON_KEY_TTS_TEXT = "to_speak";
    public static final String JSON_KEY_UNKNOWN_DOMAIN_ACTION = "unknown_domain_action";
    public static final String JSON_KEY_USER_INTENT = "intent";
    public static final String SUB_INTENT = "sub_intent";
    public static final String TAG = "speech_json_parse";
    public static final String WEATHER_INQUIRY = "weather_inquiry";
    public static final String WEEK_FRI = "Fri";
    public static final String WEEK_MON = "Mon";
    public static final String WEEK_SAT = "Sat";
    public static final String WEEK_SUN = "Sun";
    public static final String WEEK_THU = "Thu";
    public static final String WEEK_TUE = "Tue";
    public static final String WEEK_WED = "Wed";
    private static final String a = "operation";
    private static final String b = "circle";
    private static final String c = "relative_timestamp";
    private static final String d = "action";
    private static final String e = "dialog_status";
    private static final String f = "complete";
    private static final String g = "offset";
    private static final String h = "date_time";
    private static final String i = "value";
    private static final String j = "value_timestamp";
    private static final String k = "";
    private static final String l = "";
    private static final long m = 0;
    private static final long n = 0;
    private static final String o = "status";
    private static final String p = "extend";
    private static final String q = "code";
    private static final String r = "name";
    private static final String s = "answer";
    private static final String t = "domain";
    private static final String u = "action";
    private static final String v = "text";
    private static final String w = "intention";
    private static final String x = "query";
    private static final String y = "entity";
    private static final String z = "is_device_list_empty";

    public static AlarmEventSkill parseIntentionContentJsonStrToAlarmEventSkill(String intentionJsonStr) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(intentionJsonStr)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(intentionJsonStr);
            AlarmEventSkill alarmEventSkill = new AlarmEventSkill();
            alarmEventSkill.setOperation(jSONObject2.optString(a));
            alarmEventSkill.setDialogStatus(jSONObject2.optString(e));
            alarmEventSkill.setComplete(jSONObject2.optBoolean("complete"));
            alarmEventSkill.setAction(jSONObject2.optString("action", ""));
            alarmEventSkill.setCircle(jSONObject2.optString("circle", ""));
            alarmEventSkill.setRelativeTimestamp(jSONObject2.optLong(c, 0L));
            String strOptString = jSONObject2.optString("offset");
            if (TextUtils.isEmpty(strOptString)) {
                alarmEventSkill.setOffset(null);
            } else {
                try {
                    jSONObject = new JSONObject(strOptString);
                } catch (JSONException unused) {
                    HMLog.d(TAG, strOptString, new Object[0]);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    AlarmTimerOffset alarmTimerOffset = new AlarmTimerOffset();
                    alarmTimerOffset.setTimeDesc(jSONObject.optString("value"));
                    alarmTimerOffset.setTimestamp(jSONObject.optLong(j, 0L));
                    alarmEventSkill.setOffset(alarmTimerOffset);
                } else {
                    alarmEventSkill.setOffset(null);
                }
            }
            if (jSONObject2.optJSONObject(h) == null) {
                alarmEventSkill.setDateTime(null);
            }
            return alarmEventSkill;
        } catch (JSONException unused2) {
            HMLog.d(TAG, intentionJsonStr, new Object[0]);
            return null;
        }
    }

    public static PayLoad parseResponseContentJsonStrToDevicePayLoad(String responseContentJsonStr) {
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(responseContentJsonStr)) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(responseContentJsonStr).optJSONObject("intent");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("device_command")) == null) {
                return null;
            }
            PayLoad payLoad = new PayLoad();
            payLoad.setVersion(jSONObjectOptJSONObject.optInt("version", 1));
            payLoad.setIntent(jSONObjectOptJSONObject.optString("intent", BandSeriesDeviceSkill.DEFAULT_SKILL.getBandSeriesDeviceSkillDesc()));
            payLoad.setBundle(jSONObjectOptJSONObject.optString("bundle", ""));
            payLoad.setExtension(jSONObjectOptJSONObject.optString("extension", ""));
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("reply");
            DeployCustomReply deployCustomReply = new DeployCustomReply();
            deployCustomReply.setText(jSONObjectOptJSONObject3.optString("text"));
            deployCustomReply.setType(jSONObjectOptJSONObject3.optInt("type", 0));
            payLoad.setDeployCustomReply(deployCustomReply);
            return payLoad;
        } catch (JSONException unused) {
            HMLog.d(TAG, responseContentJsonStr, new Object[0]);
            return null;
        }
    }

    public static SmartMiotSkill parseResponseContentJsonStrToSmartMiotSkill(String smartMiotResponseContentJsonStr) {
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(smartMiotResponseContentJsonStr)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(smartMiotResponseContentJsonStr);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("status");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(p)) == null) {
                return null;
            }
            SmartMiotStatusExtend smartMiotStatusExtend = new SmartMiotStatusExtend();
            smartMiotStatusExtend.setCode(jSONObjectOptJSONObject.optInt("code"));
            smartMiotStatusExtend.setName(jSONObjectOptJSONObject.optString("name"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("answer");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            ArrayList<SmartMiotAnswer> arrayList = new ArrayList<>();
            if (jSONArrayOptJSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    SmartMiotAnswer smartMiotAnswer = new SmartMiotAnswer();
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(i2);
                        smartMiotAnswer.setDomain(jSONObject2.optString("domain"));
                        smartMiotAnswer.setAction(jSONObject2.optString("action"));
                        smartMiotAnswer.setText(jSONObject2.optString("text"));
                        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("intention");
                        if (jSONObjectOptJSONObject3 == null) {
                            smartMiotAnswer.setSmartMiotAnswerIntention(null);
                        } else {
                            SmartMiotAnswerIntention smartMiotAnswerIntention = new SmartMiotAnswerIntention();
                            smartMiotAnswerIntention.setQuery(jSONObjectOptJSONObject3.optString("query"));
                            smartMiotAnswerIntention.setEntity(jSONObjectOptJSONObject3.optString(y));
                            smartMiotAnswerIntention.setDeviceListEmpty(jSONObjectOptJSONObject3.optBoolean(z));
                            smartMiotAnswer.setSmartMiotAnswerIntention(smartMiotAnswerIntention);
                        }
                        arrayList.add(smartMiotAnswer);
                    } catch (JSONException unused) {
                        HMLog.d(TAG, smartMiotResponseContentJsonStr, new Object[0]);
                    }
                }
            }
            SmartMiotSkill smartMiotSkill = new SmartMiotSkill();
            smartMiotSkill.setStatusExtend(smartMiotStatusExtend);
            smartMiotSkill.setSmartMiotAnswerArr(arrayList);
            return smartMiotSkill;
        } catch (JSONException unused2) {
            HMLog.d(TAG, smartMiotResponseContentJsonStr, new Object[0]);
            return null;
        }
    }
}
