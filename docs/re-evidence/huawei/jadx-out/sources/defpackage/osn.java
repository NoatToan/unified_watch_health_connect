package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.AchieveMessage;
import com.huawei.pluginachievement.manager.model.EventRecord;
import com.huawei.pluginachievement.manager.model.MedalBasic;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.MessageReminder;
import com.huawei.pluginachievement.manager.model.MultiLanguageRes;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class osn {
    static UserAchieveWrapper d(String str) {
        try {
            String strOptString = new JSONObject(str).optString("resultCode");
            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "parseTakeMedal resultCode:", strOptString);
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(7);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            return new UserAchieveWrapper(7);
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParser", "parseTakeMedal Exception:", e.getMessage());
            return new UserAchieveWrapper(7);
        }
    }

    static UserAchieveWrapper a(String str) {
        try {
            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "parseMsgRemind result:", str);
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(4);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
            if (jSONArrayOptJSONArray == null) {
                return new UserAchieveWrapper(4);
            }
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                Object objOpt = jSONArrayOptJSONArray.opt(i);
                if (!(objOpt instanceof JSONObject)) {
                    LogUtil.j("PLGACHIEVE_AchieveMedalParser", "parseMsgRemind not JSONObject ");
                } else {
                    arrayList.add(b((JSONObject) objOpt));
                }
            }
            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "parseMsgRemind messages:", arrayList);
            MessageReminder messageReminder = new MessageReminder(arrayList);
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(4);
            userAchieveWrapper2.setMsgReminder(messageReminder);
            return userAchieveWrapper2;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParser", "parseMsgRemind Exception:", e.getMessage());
            return new UserAchieveWrapper(4);
        }
    }

    private static AchieveMessage b(JSONObject jSONObject) {
        AchieveMessage achieveMessage = new AchieveMessage();
        int iOptInt = jSONObject.optInt("msgType");
        achieveMessage.setMsgType(iOptInt);
        if (iOptInt == 2) {
            achieveMessage.saveMedalType(jSONObject.optString(ParsedFieldTag.MEDAL_TYPE));
            achieveMessage.saveGainCount(osv.a(ParsedFieldTag.GAIN_COUNT, jSONObject));
        } else if (iOptInt == 4) {
            a(jSONObject);
        } else if (iOptInt == 3) {
            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "new level upgrade，level = ", achieveMessage.getContent());
            osa.b(BaseApplication.getContext(), "levelTypeUpgraded", "" + System.currentTimeMillis());
        } else {
            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "parseMsgRemind msgType = ", Integer.valueOf(iOptInt));
        }
        achieveMessage.saveMedalLevel(jSONObject.optInt("level"));
        achieveMessage.saveMedalId(osv.c(ParsedFieldTag.MEDAL_ID, jSONObject));
        achieveMessage.setGainTime(osv.c(ParsedFieldTag.TAKE_DATE, jSONObject));
        String strC = osv.c(ParsedFieldTag.LAST_TAKE_DATE, jSONObject);
        String strC2 = osv.c(ParsedFieldTag.MEDAL_TYPE, jSONObject);
        if (!TextUtils.isEmpty(strC) && pax.n(strC2)) {
            achieveMessage.setGainTime(strC);
        }
        achieveMessage.setContent(osv.c("content", jSONObject));
        return achieveMessage;
    }

    static UserAchieveWrapper e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(6);
                userAchieveWrapper.setResultCode(strOptString);
                return userAchieveWrapper;
            }
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(6);
            MultiLanguageRes multiLanguageRes = new MultiLanguageRes(jSONObject.optString(ParsedFieldTag.LANGUAGE_VERSION), jSONObject.optString("url"));
            userAchieveWrapper2.setLanguageRes(multiLanguageRes);
            LogUtil.d("PLGACHIEVE_AchieveMedalParser", "parseLanguageResUrl languageRes:", multiLanguageRes);
            return userAchieveWrapper2;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParser", "parseLanguageResUrl Exception:", e.getMessage());
            return new UserAchieveWrapper(6);
        }
    }

    static ArrayList<UserAchieveWrapper> d(String str, Context context) {
        LogUtil.a("PLGACHIEVE_AchieveMedalParser", "enter parseMedalBasic");
        ArrayList<UserAchieveWrapper> arrayList = new ArrayList<>(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(8);
                userAchieveWrapper.setResultCode(strOptString);
                arrayList.add(userAchieveWrapper);
                return arrayList;
            }
            JSONArray jSONArray = jSONObject.getJSONArray(ParsedFieldTag.MEDAL_INFO);
            if (jSONArray == null) {
                arrayList.add(new UserAchieveWrapper(8));
                return arrayList;
            }
            return d(context, jSONArray);
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParser", "parseMedalBasic Exception");
            return arrayList;
        }
    }

    private static void a(JSONObject jSONObject) {
        LogUtil.a("PLGACHIEVE_AchieveMedalParser", "enter insertKakaExpirationMessage.");
        if (jSONObject == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalParser", "msgObj is null.");
            return;
        }
        String strOptString = jSONObject.optString("content");
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalParser", "insertKakaExpirationMessage, contentStr is null or empty.");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            String strOptString2 = jSONObject2.optString(ParsedFieldTag.KAKA_EXPIRATION_KAKA);
            long jOptLong = jSONObject2.optLong("updateTime");
            Long lValueOf = Long.valueOf(jOptLong);
            try {
                int i = Integer.parseInt(strOptString2);
                if (i > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    lValueOf.getClass();
                    if (jCurrentTimeMillis <= jOptLong) {
                        String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_kaka_unit, i, strOptString2);
                        Resources resources = BaseApplication.getContext().getResources();
                        int i2 = R.string.IDS_hw_kaka_expire_content;
                        lValueOf.getClass();
                        String string = resources.getString(i2, quantityString, qrk.c(jOptLong));
                        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
                        lValueOf.getClass();
                        MessageObject messageObjectC = c(string, jOptLong);
                        if (messageObjectC != null) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(messageObjectC);
                            boolean zInsertMessages = messageCenterApi.insertMessages(arrayList);
                            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "insertKakaExpirationMessage, insert KakaMessages to DB, success is: ", Boolean.valueOf(zInsertMessages));
                            if (zInsertMessages) {
                                messageCenterApi.showNotification(BaseApplication.getContext(), messageObjectC);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                LogUtil.j("PLGACHIEVE_AchieveMedalParser", "expirationKaka is: ", strOptString2, "currentTime: ", Long.valueOf(System.currentTimeMillis()));
            } catch (NumberFormatException e) {
                LogUtil.e("PLGACHIEVE_AchieveMedalParser", "insertKakaExpirationMessage: exception -> " + e.getMessage());
            }
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParser", "insertKakaExpirationMessage, contentJsonObj JSONException, e is: ", e2.getMessage());
        }
    }

    private static MessageObject c(String str, long j) {
        MessageObject messageObject = new MessageObject();
        messageObject.setPosition(3);
        messageObject.setMsgType(2);
        messageObject.setDetailUri("messagecenter://kakaMessage?module=17&type=kakaExpiration");
        messageObject.setModule(String.valueOf(17));
        messageObject.setMsgTitle(BaseApplication.getContext().getString(R.string.IDS_hw_kaka_expire_title));
        messageObject.setMsgContent(str);
        messageObject.setExpireTime(j);
        messageObject.setMsgId("17");
        messageObject.setReceiveTime(System.currentTimeMillis());
        messageObject.setReadFlag(0);
        messageObject.setType("kakaExpiration");
        return messageObject;
    }

    private static ArrayList<UserAchieveWrapper> d(Context context, JSONArray jSONArray) {
        String str;
        long j;
        String str2;
        StringBuilder sb;
        String str3 = "PLGACHIEVE_AchieveMedalParser";
        ArrayList<UserAchieveWrapper> arrayList = new ArrayList<>(16);
        StringBuilder sb2 = new StringBuilder(16);
        StringBuilder sb3 = new StringBuilder(16);
        HashMap<String, String> map = new HashMap<>(16);
        StringBuilder sb4 = new StringBuilder(16);
        String strE = osa.e(context, "activity_medal_id_shown_name");
        String strE2 = osa.e(BaseApplication.getContext(), "MedalConfigTime");
        List<osf> listD = otl.b(context.getApplicationContext()).d(9, new HashMap(2));
        long jD = oxi.d(strE2);
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONObject jSONObject2 = jSONObject.getJSONObject(ParsedFieldTag.MEDAL_BASIC);
                JSONObject jSONObject3 = jSONObject.getJSONObject(ParsedFieldTag.MEDAL_RULE);
                String str4 = str3;
                if (jSONObject2 == null || jSONObject3 == null) {
                    arrayList.add(new UserAchieveWrapper(8));
                    return arrayList;
                }
                try {
                    String string = jSONObject2.getString("type");
                    int i2 = i;
                    String str5 = strE;
                    StringBuilder sb5 = sb2;
                    long jE = osv.e("timestamp", jSONObject2);
                    if (a(jE, jD, string)) {
                        j = jD;
                    } else {
                        String string2 = jSONObject3.getString("level");
                        j = jD;
                        String string3 = jSONObject.getString(ParsedFieldTag.MEDAL_ID);
                        if (osu.d(string2, string, jSONObject2.getString(ParsedFieldTag.MEDAL_URL))) {
                            arrayList.add(new UserAchieveWrapper(8));
                            return arrayList;
                        }
                        if (!pax.i(string)) {
                            e(context, string3, jSONObject2, listD);
                            sb3.append(string3);
                            sb3.append(",");
                            str2 = str5;
                            b(jSONObject3, str2, sb4);
                            String strC = osv.c("name", jSONObject2);
                            MedalLocation medalLocationB = b(jSONObject.getJSONObject(ParsedFieldTag.MEDAL_LOCATION), string3, strC, jE);
                            MedalConfigInfo medalConfigInfoB = b(jSONObject2, jSONObject3, string3, strC, jE);
                            if (osu.a(string3, osv.c("endTime", jSONObject3), osv.c(ParsedFieldTag.TAKE_EFFECT_TIME, jSONObject3))) {
                                medalConfigInfoB.saveIsNewConfig(1);
                                sb = sb5;
                                sb.append(string3);
                                sb.append(",");
                                map = osv.b(map, medalLocationB.acquireFirstTabDesc(), string3);
                            } else {
                                sb = sb5;
                                medalConfigInfoB.saveIsNewConfig(0);
                            }
                            arrayList.add(e(jSONObject, medalLocationB, medalConfigInfoB, jE));
                        }
                        i = i2 + 1;
                        strE = str2;
                        sb2 = sb;
                        listD = listD;
                        str3 = str4;
                        jD = j;
                    }
                    sb = sb5;
                    str2 = str5;
                    i = i2 + 1;
                    strE = str2;
                    sb2 = sb;
                    listD = listD;
                    str3 = str4;
                    jD = j;
                } catch (JSONException unused) {
                    str = str4;
                    LogUtil.e(str, "parseMedalBasic Exception");
                    return arrayList;
                }
            } catch (JSONException unused2) {
                str = str3;
            }
        }
        String str6 = str3;
        String str7 = strE;
        StringBuilder sb6 = sb2;
        str = str6;
        try {
            LogUtil.a(str, "getUserAchieveWrapperList:", Integer.valueOf(arrayList.size()), " cloudDownMedals ", sb3.toString());
            if (arrayList.size() != 0) {
                c(context, sb6, map, str7, sb4);
                return arrayList;
            }
        } catch (JSONException unused3) {
            LogUtil.e(str, "parseMedalBasic Exception");
        }
        return arrayList;
    }

    private static void b(JSONObject jSONObject, String str, StringBuilder sb) {
        int iA = osv.a("activityId", jSONObject);
        String strC = osv.c("activityName", jSONObject);
        String str2 = iA + "_" + strC;
        if (iA == 0 || TextUtils.isEmpty(strC) || str.contains(str2) || sb.toString().contains(str2)) {
            return;
        }
        sb.append(str2);
        sb.append(",");
    }

    private static boolean a(long j, long j2, String str) {
        return (j > j2 || "A5".equals(str) || pax.n(str)) ? false : true;
    }

    private static UserAchieveWrapper e(JSONObject jSONObject, MedalLocation medalLocation, MedalConfigInfo medalConfigInfo, long j) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ParsedFieldTag.MEDAL_BASIC);
            JSONObject jSONObject3 = jSONObject.getJSONObject(ParsedFieldTag.MEDAL_RULE);
            String string = jSONObject2.getString("type");
            String string2 = jSONObject3.getString("level");
            String string3 = jSONObject2.getString(ParsedFieldTag.MEDAL_URL);
            String string4 = jSONObject.getString(ParsedFieldTag.MEDAL_ID);
            return b(b(string3, osv.e(string, string2), string4, j), medalLocation, medalConfigInfo, a(jSONObject3, string4, osv.c("name", jSONObject2), j));
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParser", "parseMedalBasic Exception");
            return null;
        }
    }

    private static MedalConfigInfo b(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, long j) {
        MedalConfigInfo medalConfigInfoD = d(jSONObject, jSONObject2);
        medalConfigInfoD.saveMedalID(str);
        medalConfigInfoD.saveMedalName(str2);
        medalConfigInfoD.saveTimestamp(j);
        return medalConfigInfoD;
    }

    private static void c(Context context, StringBuilder sb, HashMap<String, String> map, String str, StringBuilder sb2) {
        LogUtil.a("PLGACHIEVE_AchieveMedalParser", "myMedalRedPointShow str =", sb.toString());
        osa.b(context, "medalIsException", "");
        osa.b(context, "my_medal_red_point", sb.toString());
        osu.b(context, map);
        if (TextUtils.isEmpty(sb2)) {
            return;
        }
        String str2 = str + "," + ((Object) sb2);
        LogUtil.a("PLGACHIEVE_AchieveMedalParser", "getUserAchieveWrapperList activityList :", str2);
        osa.b(context, "activity_medal_id_shown_name", str2);
    }

    private static MedalLocation b(JSONObject jSONObject, String str, String str2, long j) {
        MedalLocation medalLocationE = e(jSONObject);
        medalLocationE.saveMedalID(str);
        medalLocationE.saveMedalName(str2);
        medalLocationE.saveTimestamp(j);
        return medalLocationE;
    }

    private static void e(Context context, String str, JSONObject jSONObject, List<osf> list) {
        if (TextUtils.isEmpty(osa.e(context, "medalIsException"))) {
            osu.b(str, jSONObject, list);
            osu.e(str, context);
        }
    }

    private static MedalBasic b(String str, String str2, String str3, long j) {
        LogUtil.d("PLGACHIEVE_AchieveMedalParser", "medalName=", str2, ParsedFieldTag.MEDAL_URL, str);
        MedalBasic medalBasic = new MedalBasic();
        medalBasic.saveVeinUrl(str);
        medalBasic.saveMedalName(str2);
        medalBasic.saveMedalID(str3);
        medalBasic.saveTimestamp(j);
        return medalBasic;
    }

    private static UserAchieveWrapper b(MedalBasic medalBasic, MedalLocation medalLocation, MedalConfigInfo medalConfigInfo, EventRecord eventRecord) {
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(8);
        userAchieveWrapper.saveMedalTexture(medalBasic);
        userAchieveWrapper.saveMedalLocation(medalLocation);
        userAchieveWrapper.saveMedalConfigInfo(medalConfigInfo);
        userAchieveWrapper.saveEventRecord(eventRecord);
        return userAchieveWrapper;
    }

    private static EventRecord a(JSONObject jSONObject, String str, String str2, long j) {
        EventRecord eventRecordB = osv.b(jSONObject);
        if (eventRecordB != null) {
            eventRecordB.saveMedalID(str);
            eventRecordB.saveMedalName(str2);
            eventRecordB.saveTimestamp(j);
        }
        return eventRecordB;
    }

    private static MedalConfigInfo d(JSONObject jSONObject, JSONObject jSONObject2) {
        MedalConfigInfo medalConfigInfo = new MedalConfigInfo();
        medalConfigInfo.saveMedalType(osv.c("type", jSONObject));
        medalConfigInfo.saveMessage(osv.c("message", jSONObject));
        medalConfigInfo.saveGrayDescription(osv.c(ParsedFieldTag.GRAY_DESC, jSONObject));
        medalConfigInfo.saveGrayDetailStyle(osv.c(ParsedFieldTag.GRAY_DETAIL_STYLE, jSONObject));
        medalConfigInfo.saveGrayPromotionName(osv.c(ParsedFieldTag.GRAY_PRO_NAME, jSONObject));
        medalConfigInfo.saveGrayPromotionUrl(osv.c(ParsedFieldTag.GARY_PRO_URL, jSONObject));
        medalConfigInfo.saveGrayListStyle(osv.c(ParsedFieldTag.GRAY_LIST_STYLE, jSONObject));
        medalConfigInfo.saveLightDescription(osv.c(ParsedFieldTag.LIGHT_DESC, jSONObject));
        medalConfigInfo.saveLightDetailStyle(osv.c(ParsedFieldTag.LIGHT_DETAIL_STYLE, jSONObject));
        medalConfigInfo.saveLightPromotionName(osv.c(ParsedFieldTag.LIGHT_PRO_NAME, jSONObject));
        medalConfigInfo.saveLightPromotionUrl(osv.c(ParsedFieldTag.LIGHT_PRO_URL, jSONObject));
        medalConfigInfo.saveLightListStyle(osv.c(ParsedFieldTag.LIGHT_LIST_STYLE, jSONObject));
        medalConfigInfo.saveShareImageUrl(osv.c(ParsedFieldTag.SHARE_IMAGE_URL, jSONObject));
        medalConfigInfo.saveMedalLabel(osv.a("label", jSONObject));
        medalConfigInfo.saveActionType(osv.a(ParsedFieldTag.ACTION_TYPE, jSONObject2));
        medalConfigInfo.saveGoal(osv.a(ParsedFieldTag.GOAL, jSONObject2));
        medalConfigInfo.saveLocation(osv.c("location", jSONObject2));
        medalConfigInfo.saveActivityId(osv.a("activityId", jSONObject2));
        medalConfigInfo.saveMedalLevel(osv.a("level", jSONObject2));
        medalConfigInfo.saveMedalUnit(osv.a("unit", jSONObject2));
        medalConfigInfo.saveStartTime(osv.c("startTime", jSONObject2));
        medalConfigInfo.saveEndTime(osv.c("endTime", jSONObject2));
        medalConfigInfo.saveTakeEffectTime(osv.c(ParsedFieldTag.TAKE_EFFECT_TIME, jSONObject2));
        medalConfigInfo.saveRepeatable(osv.a(ParsedFieldTag.REPEATABLE, jSONObject2));
        medalConfigInfo.setClientTypes(osv.c(ParsedFieldTag.CLIENT_TYPES, jSONObject2));
        medalConfigInfo.setPhoneTypes(osv.c(ParsedFieldTag.PHONE_TYPES, jSONObject2));
        medalConfigInfo.saveEventStatus(0);
        return medalConfigInfo;
    }

    private static MedalLocation e(JSONObject jSONObject) {
        MedalLocation medalLocation = new MedalLocation();
        medalLocation.saveMedalWeight(osv.a(ParsedFieldTag.MEDAL_WEIGHT, jSONObject));
        medalLocation.saveFirstTabPriority(osv.a(ParsedFieldTag.FIRST_TAB_PRIORITY, jSONObject));
        medalLocation.saveSecondTabPriority(osv.a(ParsedFieldTag.SECOND_TAB_PRIORITY, jSONObject));
        medalLocation.saveFirstTabDesc(osv.c(ParsedFieldTag.FIRST_TAB_DESC, jSONObject));
        medalLocation.saveSecondTabDesc(osv.c(ParsedFieldTag.SECOND_TAB_DESC, jSONObject));
        medalLocation.saveMedalGainedTime("");
        medalLocation.saveGainedCount(0);
        return medalLocation;
    }

    static ArrayList<UserAchieveWrapper> c(String str) {
        LogUtil.a("PLGACHIEVE_AchieveMedalParser", "enter parsePersonal UserAchieveWrapper");
        ArrayList<UserAchieveWrapper> arrayList = new ArrayList<>(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!osv.d(strOptString)) {
                UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(0);
                userAchieveWrapper.setResultCode(strOptString);
                arrayList.add(userAchieveWrapper);
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(16);
            StringBuilder sb = new StringBuilder(16);
            JSONArray jSONArray = jSONObject.getJSONArray(ParsedFieldTag.USER_MEDALS);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objOpt = jSONArray.opt(i);
                if (!(objOpt instanceof JSONObject)) {
                    LogUtil.j("PLGACHIEVE_AchieveMedalParser", "parsePersonal: not JSONObject");
                } else {
                    arrayList.add(d(arrayList2, sb, (JSONObject) objOpt));
                }
            }
            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "parsePersonal threeCircleBuilder:", sb.toString());
            if (d(jSONArray.toString(), (ArrayList<String>) arrayList2)) {
                return arrayList;
            }
            ArrayList<UserAchieveWrapper> arrayList3 = new ArrayList<>(16);
            UserAchieveWrapper userAchieveWrapper2 = new UserAchieveWrapper(0);
            userAchieveWrapper2.setResultCode(strOptString);
            arrayList3.add(userAchieveWrapper2);
            return arrayList3;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_AchieveMedalParser", "parsePersonal Exception:", e.getMessage());
            return arrayList;
        }
    }

    private static UserAchieveWrapper d(ArrayList<String> arrayList, StringBuilder sb, JSONObject jSONObject) {
        MedalLocation medalLocation = new MedalLocation();
        medalLocation.saveMedalID(osv.c(ParsedFieldTag.MEDAL_ID, jSONObject));
        arrayList.add(osv.c(ParsedFieldTag.MEDAL_ID, jSONObject));
        medalLocation.saveMedalGainedTime(osv.c(ParsedFieldTag.TAKE_DATE, jSONObject));
        medalLocation.saveGainedCount(osv.a(ParsedFieldTag.GAIN_COUNT, jSONObject));
        String strC = osv.c(ParsedFieldTag.LAST_TAKE_DATE, jSONObject);
        String strC2 = osv.c(ParsedFieldTag.MEDAL_TYPE, jSONObject);
        if (!TextUtils.isEmpty(strC) && pax.n(strC2)) {
            sb.append(medalLocation.acquireMedalID());
            sb.append("_");
            sb.append(strC);
            sb.append("_");
            sb.append(medalLocation.acquireGainedCount());
            sb.append(",");
            medalLocation.saveMedalGainedTime(strC);
        }
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(0);
        LogUtil.d("PLGACHIEVE_AchieveMedalParser", "location=", medalLocation.toString());
        userAchieveWrapper.saveMedalLocation(medalLocation);
        return userAchieveWrapper;
    }

    private static boolean d(String str, ArrayList<String> arrayList) {
        String strE = osa.e(BaseApplication.getContext(), "_medalGainLoadInfo");
        LogUtil.a("PLGACHIEVE_AchieveMedalParser", "isLoadChanged medalGainStr.size ", Integer.valueOf(arrayList.size()));
        if (strE.equals(str) && arrayList.size() == otl.b(BaseApplication.getContext()).t().size()) {
            LogUtil.a("PLGACHIEVE_AchieveMedalParser", "isLoadChanged medalGainStr=lastGainStr,return!");
            return false;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalParser", "isLoadChanged medalGainStr=", str);
        osa.b(BaseApplication.getContext(), "_medalGainLoadInfo", str);
        return true;
    }
}
