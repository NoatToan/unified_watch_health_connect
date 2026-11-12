package com.xiaomi.hm.health.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huami.account.HMLoginManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class HMPropertyUtil {
    public static final int STATUS_SYNCED = 1;
    private static final String a = "com.xiaomi.hm.health.utils.HMPropertyUtil";
    private static final String b = "huami.mifit.user.settings.york.config";

    public interface GetPropertyHandler {
        void onFailed();

        void onSuccess(@Nullable String value);
    }

    public class Permission {
        public String auth;
        public long time;
        public String underage;

        public Permission() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit c(GetPropertyHandler getPropertyHandler, FetchResult fetchResult) {
        if (fetchResult instanceof FetchResult.Success) {
            getPropertyHandler.onSuccess((String) ((FetchResult.Success) fetchResult).getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            HmProperty hmProperty = (HmProperty) it2.next();
            sb.append(String.format("[key: %s, value: %s]", hmProperty.getKey(), hmProperty.getValue()));
        }
        return "HmProperty:::  " + ((Object) sb);
    }

    public static synchronized String getProperty(@NotNull String key, String defaultValue) {
        return HMPropertyUtilExt.readLocal(key, defaultValue);
    }

    public static void getPropertyAsync(@NotNull String key, boolean cacheResult, final GetPropertyHandler handler) {
        UserPropertyManager userPropertyManager = UserPropertyManager.INSTANCE;
        String local = userPropertyManager.readLocal(key, null);
        if (local != null) {
            handler.onSuccess(local);
        } else {
            userPropertyManager.singleFetch(key).get(new Function1() { // from class: nd3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HMPropertyUtil.c(handler, (FetchResult) obj);
                }
            });
        }
    }

    public static synchronized boolean getPropertyToWeightPermission(String type) {
        boolean z;
        String local = UserPropertyManager.INSTANCE.readLocal(Property.PROPERTY_UNDER_AGE_GRANT_WEIGHT_DATA_PERMISSION);
        if (TextUtils.isEmpty(local)) {
            if (!"all_member".equals(type)) {
                return false;
            }
            List<UserInfos> allInfosNotWithSelf = UserInfoManager.getManager().getAllInfosNotWithSelf();
            if (allInfosNotWithSelf != null && !allInfosNotWithSelf.isEmpty()) {
                Iterator<UserInfos> it2 = allInfosNotWithSelf.iterator();
                while (it2.hasNext()) {
                    if (!HMLoginManager.isAdult(Birthday.fromStr(it2.next().getBirthday()).getAge())) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        try {
            JSONArray jSONArray = new JSONArray(local);
            if (!"all_member".equals(type)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (!TextUtils.isEmpty(jSONObject.optString(Constant.KEY_WEIGHT_UNDERAGE)) && jSONObject.optString(Constant.KEY_WEIGHT_UNDERAGE).equals(type)) {
                        return true;
                    }
                }
                return false;
            }
            List<UserInfos> allInfosNotWithSelf2 = UserInfoManager.getManager().getAllInfosNotWithSelf();
            if (allInfosNotWithSelf2 != null && !allInfosNotWithSelf2.isEmpty()) {
                for (UserInfos userInfos : allInfosNotWithSelf2) {
                    if (!HMLoginManager.isAdult(Birthday.fromStr(userInfos.getBirthday()).getAge())) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= jSONArray.length()) {
                                z = false;
                                break;
                            }
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            if (!TextUtils.isEmpty(jSONObject2.optString(Constant.KEY_WEIGHT_UNDERAGE)) && jSONObject2.optString(Constant.KEY_WEIGHT_UNDERAGE).equals(userInfos.getUserId())) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        if (!z) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            HMLog.i(a, "e :  " + e.toString(), new Object[0]);
            return false;
        }
    }

    public static int getRingType() {
        String local = UserPropertyManager.INSTANCE.readLocal(Property.PROPERTY_RINGTYPE);
        if (TextUtils.isEmpty(local)) {
            return 0;
        }
        try {
            return new JSONObject(local).getInt("type");
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean getSmartAnalysis(String type) {
        String property = getProperty(Property.PROPERTY_AI_ANALYSIS_SLP_BODY, "");
        if (TextUtils.isEmpty(property)) {
            return true;
        }
        try {
            return new JSONObject(property).optBoolean(type);
        } catch (JSONException e) {
            e.printStackTrace();
            setProperty(Property.PROPERTY_AI_ANALYSIS_SLP_BODY, "");
            return true;
        }
    }

    public static boolean hasYorkProperty() {
        return !TextUtils.isEmpty(getProperty(b, ""));
    }

    public static boolean isGoogleFitAuthed() {
        String property = getProperty(Property.PROPERTY_THIRD_PART_AUTH, "");
        if (!TextUtils.isEmpty(property) && property.contains("google")) {
            try {
                return new JSONObject(property).optBoolean("google", false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean isYorkLiftWristOn() {
        String property = getProperty(b, "");
        if (TextUtils.isEmpty(property)) {
            return true;
        }
        try {
            return new JSONObject(property).optBoolean("isLiftScreenOn");
        } catch (JSONException e) {
            e.printStackTrace();
            HMLog.error(new Function0() { // from class: md3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.getLocalizedMessage();
                }
            });
            return true;
        }
    }

    public static synchronized void postPropertisToServer(boolean isForce) {
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    public static synchronized void setProperties(final List<HmProperty> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                HMLog.info(a, new Function0() { // from class: ld3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMPropertyUtil.d(list);
                    }
                });
                for (HmProperty hmProperty : list) {
                    if (hmProperty.getStatus().intValue() == 1) {
                        UserPropertyManager.INSTANCE.saveLocalExcludeSync(hmProperty.getKey(), hmProperty.getValue());
                    } else {
                        setProperty(hmProperty.getKey(), hmProperty.getValue());
                    }
                    if (HMAccountWebAPI.APPS_SETTINGS_TRACK_SHARE.equals(hmProperty.getKey())) {
                        HMDaoManager.getInstance().getHmPropertyDao().insertOrReplaceInTx(hmProperty);
                    }
                }
            }
        }
    }

    public static synchronized void setProperty(@NotNull String key, String value) {
        HMPropertyUtilExt.saveLocal(key, value);
    }

    public static synchronized void setPropertyToWeightPermission(String userId) {
        HmProperty hmPropertyLoad = HMDaoManager.getInstance().getHmPropertyDao().load(Property.PROPERTY_UNDER_AGE_GRANT_WEIGHT_DATA_PERMISSION);
        JsonArray jsonArray = (hmPropertyLoad == null || TextUtils.isEmpty(hmPropertyLoad.getValue())) ? new JsonArray() : new JsonParser().parse(hmPropertyLoad.getValue()).getAsJsonArray();
        if ("all_member".equals(userId)) {
            HMLog.d(a, "TAG_ALL_MEMBER ", new Object[0]);
            List<UserInfos> allInfosNotWithSelf = UserInfoManager.getManager().getAllInfosNotWithSelf();
            if (allInfosNotWithSelf != null && !allInfosNotWithSelf.isEmpty()) {
                for (UserInfos userInfos : allInfosNotWithSelf) {
                    if (!HMLoginManager.isAdult(Birthday.fromStr(userInfos.getBirthday()).getAge())) {
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("auth", HMPersonInfo.getInstance().getUserInfo().getUserid());
                        jsonObject.addProperty(Constant.KEY_WEIGHT_UNDERAGE, userInfos.getUserId());
                        jsonObject.addProperty("time", Long.valueOf(System.currentTimeMillis() / 1000));
                        jsonArray.add(jsonObject);
                    }
                }
            }
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("auth", HMPersonInfo.getInstance().getUserInfo().getUserid());
        jsonObject2.addProperty(Constant.KEY_WEIGHT_UNDERAGE, userId);
        jsonObject2.addProperty("time", Long.valueOf(System.currentTimeMillis() / 1000));
        jsonArray.add(jsonObject2);
        HMLog.d(a, "array " + jsonArray.toString(), new Object[0]);
        HMLog.d(a, "array " + jsonArray.toString(), new Object[0]);
        setProperty(Property.PROPERTY_UNDER_AGE_GRANT_WEIGHT_DATA_PERMISSION, jsonArray.toString());
        postPropertisToServer(true);
    }

    public static void setSmartAnalysis(String slpType, boolean isSlpOpen, String bodyType, boolean isBodyOpen) {
        String property = getProperty(Property.PROPERTY_AI_ANALYSIS_SLP_BODY, "");
        if (TextUtils.isEmpty(property)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(slpType, isSlpOpen);
                jSONObject.put("slp_time", System.currentTimeMillis() / 1000);
                jSONObject.put(bodyType, isBodyOpen);
                jSONObject.put("body_time", System.currentTimeMillis() / 1000);
                setProperty(Property.PROPERTY_AI_ANALYSIS_SLP_BODY, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(property);
                jSONObject2.remove(slpType);
                jSONObject2.remove("slp_time");
                jSONObject2.remove(bodyType);
                jSONObject2.remove("body_time");
                jSONObject2.put(slpType, isSlpOpen);
                jSONObject2.put("slp_time", System.currentTimeMillis() / 1000);
                jSONObject2.put(bodyType, isBodyOpen);
                jSONObject2.put("body_time", System.currentTimeMillis() / 1000);
                setProperty(Property.PROPERTY_AI_ANALYSIS_SLP_BODY, jSONObject2.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        postPropertisToServer(true);
    }

    public static void setThirdPartyAuth(String type, boolean isOpen) {
        String property = getProperty(Property.PROPERTY_THIRD_PART_AUTH, "");
        if (TextUtils.isEmpty(property)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(type, isOpen);
                jSONObject.put("auth", HMLoginManager.getValidUid());
                jSONObject.put(Constant.KEY_THIRD_AUTH_GOOGLE_TIME, System.currentTimeMillis() / 1000);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("step", true);
                jSONObject2.put("sleep", true);
                jSONObject2.put(Constant.KEY_THIRD_AUTH_GOOGLE_TYPE_HEART, true);
                jSONObject2.put("weight", true);
                jSONObject.put(Constant.KEY_THIRD_AUTH_GOOGLE_TYPE, jSONObject2.toString());
                setProperty(Property.PROPERTY_THIRD_PART_AUTH, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            try {
                JSONObject jSONObject3 = new JSONObject(property);
                jSONObject3.remove(type);
                jSONObject3.remove(Constant.KEY_THIRD_AUTH_GOOGLE_TIME);
                jSONObject3.remove("auth");
                jSONObject3.remove(Constant.KEY_THIRD_AUTH_GOOGLE_TYPE);
                jSONObject3.put(type, isOpen);
                jSONObject3.put("auth", HMLoginManager.getValidUid());
                jSONObject3.put(Constant.KEY_THIRD_AUTH_GOOGLE_TIME, System.currentTimeMillis() / 1000);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("step", true);
                jSONObject4.put("sleep", true);
                jSONObject4.put(Constant.KEY_THIRD_AUTH_GOOGLE_TYPE_HEART, true);
                jSONObject4.put("weight", true);
                jSONObject3.put(Constant.KEY_THIRD_AUTH_GOOGLE_TYPE, jSONObject4.toString());
                setProperty(Property.PROPERTY_THIRD_PART_AUTH, jSONObject3.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        postPropertisToServer(true);
    }

    public static void setYorkLiftWristSwitch(boolean enable) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isLiftScreenOn", enable);
            setProperty(b, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        postPropertisToServer(true);
    }

    public static synchronized boolean syncPropertisToServerWhenLogout() {
        return HMPropertyUtilExt.pushAllPropertiesBlock().isSuccess();
    }
}
