package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class RnReadableMapUtil {
    private static final String TAG = "RnReadableMapUtil";

    /* JADX INFO: renamed from: com.xiaomi.smarthome.framework.plugin.rn.utils.RnReadableMapUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static ReadableArray optArray(ReadableMap readableMap, String str) {
        return (readableMap == null || !readableMap.hasKey(str)) ? Arguments.createArray() : readableMap.getArray(str);
    }

    public static boolean optBoolean(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str)) {
            return false;
        }
        return readableMap.getBoolean(str);
    }

    public static double optDouble(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str)) {
            return 0.0d;
        }
        return readableMap.getDouble(str);
    }

    public static int optInt(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str)) {
            return 0;
        }
        return readableMap.getInt(str);
    }

    public static ReadableMap optMap(ReadableMap readableMap, String str) {
        return (readableMap == null || !readableMap.hasKey(str)) ? Arguments.createMap() : readableMap.getMap(str);
    }

    public static String optString(ReadableMap readableMap, String str) {
        return (readableMap == null || !readableMap.hasKey(str)) ? "" : readableMap.getString(str);
    }

    public static Map<String, Object> toHashMap(ReadableMap readableMap) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(readableMap.toString()).getJSONObject("NativeMap");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.opt(next));
            }
        } catch (JSONException e) {
            MRnLog.w(TAG, "toHashMap error:" + Log.getStackTraceString(e));
        }
        return map;
    }

    public static JSONArray toJSONArray(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            try {
                int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()];
                if (i2 == 2) {
                    jSONArray.put(toJSONObject(readableArray.getMap(i)));
                } else if (i2 == 3) {
                    jSONArray.put(toJSONArray(readableArray.getArray(i)));
                } else if (i2 == 4) {
                    jSONArray.put(readableArray.getDouble(i));
                } else if (i2 == 5) {
                    jSONArray.put(readableArray.getString(i));
                } else if (i2 == 6) {
                    jSONArray.put(readableArray.getBoolean(i));
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public static JSONObject toJSONObject(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            try {
                int i = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(strNextKey).ordinal()];
                if (i == 2) {
                    jSONObject.putOpt(strNextKey, toJSONObject(readableMap.getMap(strNextKey)));
                } else if (i == 3) {
                    jSONObject.putOpt(strNextKey, toJSONArray(readableMap.getArray(strNextKey)));
                } else if (i == 4) {
                    jSONObject.putOpt(strNextKey, Double.valueOf(readableMap.getDouble(strNextKey)));
                } else if (i == 5) {
                    jSONObject.putOpt(strNextKey, readableMap.getString(strNextKey));
                } else if (i == 6) {
                    jSONObject.putOpt(strNextKey, Boolean.valueOf(readableMap.getBoolean(strNextKey)));
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static String toJsonString(ReadableMap readableMap) {
        try {
            return new JSONObject(readableMap.toString()).getJSONObject("NativeMap").toString();
        } catch (JSONException e) {
            MRnLog.w(TAG, "toJsonString error:" + Log.getStackTraceString(e));
            return "";
        }
    }

    public static Map<String, String> toStringHashMap(ReadableMap readableMap) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(readableMap.toString()).getJSONObject("NativeMap");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.opt(next).toString());
            }
        } catch (JSONException e) {
            MRnLog.w(TAG, "toHashMap error:" + Log.getStackTraceString(e));
        }
        return map;
    }
}
