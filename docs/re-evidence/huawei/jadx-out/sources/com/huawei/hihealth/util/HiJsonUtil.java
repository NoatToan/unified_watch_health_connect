package com.huawei.hihealth.util;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import health.compact.a.util.LogUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HiJsonUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static GsonBuilder f12337b;
    private static GsonBuilder d;

    private HiJsonUtil() {
    }

    public static <T> T d(String str, Class<T> cls) {
        try {
            return (T) c().fromJson(c(str), (Class) cls);
        } catch (JsonSyntaxException e) {
            LogUtil.c("HiJsonUtil", "JsonSyntaxException:", e.getMessage());
            return (T) c().fromJson(c("{}"), (Class) cls);
        }
    }

    public static <T> T d(String str, Type type) {
        try {
            return (T) c().fromJson(c(str), type);
        } catch (JsonSyntaxException unused) {
            LogUtil.c("HiJsonUtil", "JsonSyntaxException");
            return (T) c().fromJson(c("{}"), type);
        }
    }

    public static <T> T a(String str, Type type) {
        try {
            return (T) c().fromJson(c(str), type);
        } catch (JsonSyntaxException unused) {
            LogUtil.c("HiJsonUtil", "JsonSyntaxException");
            return (T) c().fromJson(c(d(type)), type);
        }
    }

    private static String d(Type type) {
        if (type != null && (type instanceof ParameterizedType)) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                    return "[]";
                }
            }
        }
        return "{}";
    }

    public static <T> T a(String str, Class<T> cls) {
        return (T) a().fromJson(c(str), (Class) cls);
    }

    public static String d(Object obj) {
        return c().toJson(obj);
    }

    public static String e(Object obj, Type type) {
        return c().toJson(obj, type);
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new StringBuffer(JsonSanitizer.sanitize(str)).toString();
    }

    private static Gson c() {
        GsonBuilder gsonBuilderB = f12337b;
        if (gsonBuilderB == null) {
            gsonBuilderB = b(false);
            f12337b = gsonBuilderB;
        }
        return gsonBuilderB.create();
    }

    private static Gson a() {
        GsonBuilder gsonBuilderB = d;
        if (gsonBuilderB == null) {
            gsonBuilderB = b(true);
            d = gsonBuilderB;
        }
        return gsonBuilderB.create();
    }

    private static GsonBuilder b(boolean z) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        if (z) {
            gsonBuilder.enableComplexMapKeySerialization();
        }
        if (Build.VERSION.SDK_INT > 28) {
            gsonBuilder.registerTypeAdapterFactory(new ContentValuesTypeAdapterFactory());
        }
        return gsonBuilder;
    }
}
