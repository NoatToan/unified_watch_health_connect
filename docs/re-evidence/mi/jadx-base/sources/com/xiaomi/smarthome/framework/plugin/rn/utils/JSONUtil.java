package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.Gson;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JSONUtil {
    private static final String TAG = "JSONUtil";
    private static Gson mGson = new Gson();

    public static JSONObject fromFile(File file) {
        return fromFile(file.getAbsolutePath());
    }

    public static JSONObject getJSONObjectFromJSONArrayWithKeyValue(JSONArray jSONArray, String str, String str2) {
        if (jSONArray == null || jSONArray.length() == 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (TextUtils.equals(str2, (String) jSONObject.get(str))) {
                    return jSONObject;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean jsonArrayHasKey(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                if (str.equals(jSONArray.getString(i))) {
                    return true;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }

    public static Object parse(String str, Class cls) {
        try {
            return mGson.fromJson(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> String toJsonString(T t) {
        try {
            return new Gson().toJsonTree(t).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> toStringList(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() < 1) {
            return Collections.emptyList();
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    public static WritableArray toWritableArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    writableArrayCreateArray.pushString((String) obj);
                } else if (obj instanceof Integer) {
                    writableArrayCreateArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    writableArrayCreateArray.pushDouble(((Long) obj).doubleValue());
                } else if (obj instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONArray) {
                    writableArrayCreateArray.pushArray(toWritableArray((JSONArray) obj));
                } else if (obj instanceof JSONObject) {
                    writableArrayCreateArray.pushMap(toWritableMap((JSONObject) obj));
                } else {
                    MRnLog.w(TAG, "toWritableArray, unknown data type:" + obj);
                }
            } catch (JSONException e) {
                MRnLog.w(TAG, "toWritableArray error:", e);
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap toWritableMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return toWritableMap(new JSONObject(str));
        } catch (JSONException e) {
            MRnLog.d(TAG, "toWritableMap error:", e);
            return null;
        }
    }

    public static JSONObject fromFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String txtFromFile = com.xiaomi.smarthome.framework.plugin.FileUtils.readTxtFromFile(str);
        if (TextUtils.isEmpty(txtFromFile)) {
            return null;
        }
        try {
            return new JSONObject(txtFromFile);
        } catch (JSONException e) {
            MRnLog.w(TAG, "fromFile:", e);
            return null;
        }
    }

    public static WritableMap toWritableMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    writableMapCreateMap.putString(next, (String) obj);
                } else if (obj instanceof Long) {
                    writableMapCreateMap.putDouble(next, ((Long) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    writableMapCreateMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableMapCreateMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    writableMapCreateMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONArray) {
                    writableMapCreateMap.putArray(next, toWritableArray((JSONArray) obj));
                } else if (obj instanceof JSONObject) {
                    writableMapCreateMap.putMap(next, toWritableMap((JSONObject) obj));
                } else {
                    MRnLog.w(TAG, "toWritableArray, unknown data type:" + obj);
                }
            } catch (JSONException e) {
                MRnLog.w(TAG, "toWritableMap error:", e);
            }
        }
        return writableMapCreateMap;
    }
}
