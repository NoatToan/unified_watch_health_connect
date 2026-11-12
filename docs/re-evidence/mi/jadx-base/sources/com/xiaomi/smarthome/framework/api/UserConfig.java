package com.xiaomi.smarthome.framework.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UserConfig {
    public static final int COMPONENT_ID_1 = 1;
    public static final int COMPONENT_ID_7 = 7;
    public static final int COMPONENT_ID_XIAOMI = 0;
    public static final int CUSTOM_TAG_VER_KEY = 1000;
    public static final int HOME_CATEGORY_SORT_KEY = 6000;
    public static final int HOME_ROOM_SORT_KEY = 4000;
    public static final String KEY_CAMERA_LIST_SORT_ORDER = "20";
    public static final String KEY_CLIENT_ALL_COLUMN = "4";
    public static final String KEY_CUSTOM_TAG_INFO = "2";
    public static final String KEY_DEVICE_LITE_SORT_GROUP = "5";
    public static final String KEY_DEVICE_SORT = "0";
    public static final String KEY_HOME_SCENE_FRAGMENT_TOP = "7";
    public static final String KEY_LITE_SCENE_ORDER = "9";
    public static final String KEY_MI_BRAIN_SETTING = "8";
    public static final int KEY_MOST_LITE_SCENE_ORDER = 1;
    public static final String KEY_SMART_LIFE_DEVICES = "3";
    public static final int MOST_USED_DEVICE_KEY = 100;
    public static final int MOST_USED_DEVICE_KEY_V2 = 5001;
    public static final int MOST_USED_DEVICE_SORT_IOS_KEY = 2001;
    public static final int MOST_USED_DEVICE_SORT_IOS_KEY_V2 = 7001;
    public static final int MOST_USED_DEVICE_SORT_KEY = 1001;
    public static final int MOST_USED_DEVICE_SORT_KEY_V2 = 6001;
    public static final int MULTI_KEY_MAX_KEY_COUNT = 1000;
    public static final int ORDER_KEY = 2000;
    public static final int ROUTER_KEY = 3000;
    public static final int SENSOR_SORT_KEY = 3001;
    public static final int SENSOR_SORT_KEY_V2 = 4001;
    public ArrayList<UserConfigAttr> attrs;
    public int compoentId;
    public String key;

    public static class UserConfigAttr {
        public String attr;
        public String value;

        public UserConfigAttr(String str, String str2) {
            this.attr = str;
            this.value = str2;
        }
    }

    public static class UserConfigData {
        public String componentID;
        public String data;
        public int key;

        public static UserConfigData parseFromJson(JSONObject jSONObject) {
            UserConfigData userConfigData = new UserConfigData();
            userConfigData.componentID = jSONObject.optString("component_id");
            try {
                userConfigData.key = Integer.valueOf(jSONObject.optString("key")).intValue();
                String strOptString = jSONObject.optString("data");
                userConfigData.data = strOptString;
                if (TextUtils.isEmpty(strOptString)) {
                    return null;
                }
                return userConfigData;
            } catch (Exception unused) {
                return null;
            }
        }

        public static JSONObject toJsonObject(UserConfigData userConfigData) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("component_id", userConfigData.componentID);
            jSONObject.put("key", userConfigData.key);
            jSONObject.put("data", userConfigData.data);
            return jSONObject;
        }
    }

    public static UserConfig parseFromJson(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("component_id");
        String strOptString = jSONObject.optString("key");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (TextUtils.isEmpty(strOptString) || jSONObjectOptJSONObject == null) {
            return null;
        }
        UserConfig userConfig = new UserConfig();
        userConfig.compoentId = iOptInt;
        userConfig.key = strOptString;
        userConfig.attrs = new ArrayList<>();
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys != null && itKeys.hasNext()) {
            String next = itKeys.next();
            userConfig.attrs.add(new UserConfigAttr(next, jSONObjectOptJSONObject.optString(next)));
        }
        return userConfig;
    }

    public static JSONObject toJsonObject(UserConfig userConfig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (userConfig == null) {
            return jSONObject;
        }
        jSONObject.put("component_id", userConfig.compoentId);
        jSONObject.put("key", userConfig.key);
        JSONObject jSONObject2 = new JSONObject();
        for (int i = 0; i < userConfig.attrs.size(); i++) {
            jSONObject2.put(userConfig.attrs.get(i).attr, userConfig.attrs.get(i).value);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }
}
