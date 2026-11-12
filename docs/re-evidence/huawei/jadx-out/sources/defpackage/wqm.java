package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import health.compact.a.CommonUtil;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes19.dex */
public class wqm {
    public static String d(Object obj) {
        return new Gson().toJson(obj);
    }

    public static <T> T d(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) new Gson().fromJson(CommonUtil.ac(str), (Class) cls);
    }

    public static <T> T e(String str, Type type) throws JsonSyntaxException {
        return (T) new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().fromJson(CommonUtil.ac(str), type);
    }
}
