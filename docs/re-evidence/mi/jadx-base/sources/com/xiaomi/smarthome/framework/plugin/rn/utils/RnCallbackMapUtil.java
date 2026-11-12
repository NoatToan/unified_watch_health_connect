package com.xiaomi.smarthome.framework.plugin.rn.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.framework.plugin.rn.constants.RnApiErrorInfo;

/* JADX INFO: loaded from: classes2.dex */
public class RnCallbackMapUtil {
    public static WritableMap getCommonErrorMap(String str) {
        return getCommonErrorMap(-1, str);
    }

    public static WritableMap getCommonSuccessMap(Object obj) {
        return getSuccessMap(0, obj);
    }

    private static WritableMap getSuccessMap(int i, Object obj) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("code", i);
        if (obj == null) {
            writableMapCreateMap.putString("data", "");
        } else if (obj instanceof Boolean) {
            writableMapCreateMap.putBoolean("data", ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            writableMapCreateMap.putDouble("data", ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMapCreateMap.putInt("data", ((Integer) obj).intValue());
        } else if (obj instanceof WritableArray) {
            writableMapCreateMap.putArray("data", (WritableArray) obj);
        } else if (obj instanceof WritableMap) {
            writableMapCreateMap.putMap("data", (WritableMap) obj);
        } else {
            writableMapCreateMap.putString("data", obj.toString());
        }
        return writableMapCreateMap;
    }

    public static WritableMap getCommonErrorMap(int i, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("code", i);
        if (str == null) {
            str = "";
        }
        writableMapCreateMap.putString("message", str);
        return writableMapCreateMap;
    }

    public static WritableMap getCommonSuccessMap(int i, Object obj, String str) {
        WritableMap successMap = getSuccessMap(i, obj);
        successMap.putString("message", str);
        return successMap;
    }

    public static WritableMap getCommonSuccessMap(int i, Object obj) {
        return getSuccessMap(i, obj);
    }

    public static WritableMap getCommonErrorMap(RnApiErrorInfo rnApiErrorInfo) {
        return getCommonErrorMap(rnApiErrorInfo.getCode(), rnApiErrorInfo.getMessage());
    }

    public static WritableMap getCommonErrorMap(RnApiErrorInfo rnApiErrorInfo, String str) {
        return getCommonErrorMap(rnApiErrorInfo.getCode(), str);
    }
}
