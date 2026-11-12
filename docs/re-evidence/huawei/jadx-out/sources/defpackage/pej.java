package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.hihealth.util.ContentValuesTypeAdapterFactory;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes14.dex */
public class pej {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static GsonBuilder f45237b;

    public static <T> T b(String str, Class<T> cls) {
        try {
            return (T) a().fromJson(a(str), (Class) cls);
        } catch (JsonSyntaxException e) {
            LogUtil.c("HiJsonUtil", "JsonSyntaxException:", e.getMessage());
            return (T) a().fromJson(a("{}"), (Class) cls);
        }
    }

    public static String c(Object obj) {
        return a().toJson(obj);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new StringBuffer(JsonSanitizer.sanitize(str)).toString();
    }

    private static Gson a() {
        GsonBuilder gsonBuilderD = f45237b;
        if (gsonBuilderD == null) {
            gsonBuilderD = d(false);
            f45237b = gsonBuilderD;
        }
        return gsonBuilderD.create();
    }

    private static GsonBuilder d(boolean z) {
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
