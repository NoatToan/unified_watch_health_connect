package com.huawei.health.h5pro.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GsonUtil {
    private static GsonBuilder d;

    private GsonUtil() {
    }

    private static GsonBuilder a() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(new ContentValuesTypeAdapterFactory());
        return gsonBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object a(JsonElement jsonElement) {
        if (jsonElement.isJsonArray()) {
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }
        if (jsonElement.isJsonObject()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                map.put(entry.getKey(), a(entry.getValue()));
            }
            return map;
        }
        if (!jsonElement.isJsonPrimitive()) {
            return null;
        }
        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
        if (asJsonPrimitive.isBoolean()) {
            return Boolean.valueOf(asJsonPrimitive.getAsBoolean());
        }
        if (asJsonPrimitive.isString()) {
            return asJsonPrimitive.getAsString();
        }
        if (!asJsonPrimitive.isNumber()) {
            return null;
        }
        Number asNumber = asJsonPrimitive.getAsNumber();
        if (Math.ceil(asNumber.doubleValue()) == asNumber.intValue()) {
            return Integer.valueOf(asNumber.intValue());
        }
        return Math.ceil(asNumber.doubleValue()) == ((double) asNumber.longValue()) ? Long.valueOf(asNumber.longValue()) : Double.valueOf(asNumber.doubleValue());
    }

    private static Gson b() {
        GsonBuilder gsonBuilderA = d;
        if (gsonBuilderA == null) {
            gsonBuilderA = a();
            d = gsonBuilderA;
        }
        return gsonBuilderA.create();
    }

    private static Gson d() {
        return new GsonBuilder().registerTypeAdapter(new TypeToken<Map<String, Object>>() { // from class: com.huawei.health.h5pro.utils.GsonUtil.3
        }.getType(), new JsonDeserializer<Map<String, Object>>() { // from class: com.huawei.health.h5pro.utils.GsonUtil.2
            @Override // com.google.gson.JsonDeserializer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                Object objA = GsonUtil.a(jsonElement);
                return objA instanceof Map ? (Map) objA : Collections.EMPTY_MAP;
            }
        }).create();
    }

    private static <T> T e(String str, Class<T> cls, Gson gson) {
        if (TextUtils.isEmpty(str) || gson == null) {
            return null;
        }
        try {
            return (T) gson.fromJson(str, (Class) cls);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("H5pro_GsonUtil", "parseJson: JsonSyntaxException ".concat(cls.getSimpleName()));
            return null;
        }
    }

    public static <T> T parseContainsMapJson(String str, Class<T> cls) {
        return (T) e(str, cls, d());
    }

    public static Map<String, Object> parseMapJson(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return (Map) d().fromJson(str, new TypeToken<Map<String, Object>>() { // from class: com.huawei.health.h5pro.utils.GsonUtil.1
                }.getType());
            } catch (JsonSyntaxException unused) {
                LogUtil.e("H5pro_GsonUtil", "parseMapJson: JsonSyntaxException");
            }
        }
        return new HashMap();
    }

    public static <T> String contentValueToJson(T t) {
        if (t == null) {
            return "";
        }
        try {
            return b().toJson(t);
        } catch (JsonIOException | IllegalArgumentException unused) {
            LogUtil.e("H5pro_GsonUtil", "toJson: JsonIOException");
            return "";
        }
    }

    public static <T> String toJson(T t) {
        if (t == null) {
            return "";
        }
        try {
            return new Gson().toJson(t);
        } catch (JsonIOException unused) {
            LogUtil.e("H5pro_GsonUtil", "toJson: JsonIOException");
            return "";
        }
    }

    public static <T> T parseJson(String str, Class<T> cls) {
        return (T) e(str, cls, new Gson());
    }
}
