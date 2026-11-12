package com.huawei.maps.offlinedata.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.json.JsonSanitizer;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Gson f18023a = a().create();

    private static GsonBuilder a() {
        return new GsonBuilder().enableComplexMapKeySerialization().serializeSpecialFloatingPointValues().disableHtmlEscaping().setLenient();
    }

    private static Gson b() {
        return f18023a;
    }

    public static JsonObject b(String str) {
        return JsonParser.parseString(str).getAsJsonObject();
    }

    public static String a(Object obj) {
        try {
            return b().toJson(obj);
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object a(String str, Class cls) {
        try {
            return b().fromJson(a(str), cls);
        } catch (Exception e) {
            g.d("GsonUtil", "parseSanitizeJson e: " + e.getMessage());
            return null;
        }
    }

    public static Object a(String str, Type type) {
        try {
            return b().fromJson(a(str), type);
        } catch (Exception e) {
            g.d("GsonUtil", "parseSanitizeJson e: " + e.getMessage());
            return null;
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.valueOf(JsonSanitizer.sanitize(str));
    }
}
