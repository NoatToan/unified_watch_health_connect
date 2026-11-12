package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes11.dex */
public class nlu {
    public static <T> T b(String str, Class<T> cls) {
        T t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Gson gson = new Gson();
        try {
            t = (T) gson.fromJson(CommonUtil.ac(str), (Class) cls);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("LogEngine_t_JsonUtil", "JsonSyntaxException");
            t = (T) gson.fromJson(CommonUtil.ac("{}"), (Class) cls);
        }
        LogUtil.d("LogEngine_t_JsonUtil", "fromJson(String json, Class<T> classOfT)   time= ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return t;
    }

    public static <T> T c(String str, Type type) {
        T t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Gson gson = new Gson();
        try {
            t = (T) gson.fromJson(CommonUtil.ac(str), type);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("LogEngine_t_JsonUtil", "JsonSyntaxException");
            t = (T) gson.fromJson(CommonUtil.ac("{}"), type);
        }
        LogUtil.d("LogEngine_t_JsonUtil", "fromJson(String json, Type typeOfT)   time= ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return t;
    }

    public static String a(Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String json = new Gson().toJson(obj);
        LogUtil.d("LogEngine_t_JsonUtil", "toJson(Object object)   time= ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return json;
    }

    public static String b(Object obj, Type type) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String json = new Gson().toJson(obj, type);
        LogUtil.d("LogEngine_t_JsonUtil", "toJson(Object fromJson, Type typeOfSrc)   time= ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return json;
    }
}
