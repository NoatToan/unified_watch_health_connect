package com.huawei.watchface;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.watchface.utils.HwLog;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c5 f30113a = new c5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f30114b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Gson f30115c = new Gson();

    public static c5 a() {
        c5 c5Var;
        synchronized (f30114b) {
            c5Var = f30113a;
        }
        return c5Var;
    }

    public String a(Object obj) {
        return f30115c.toJson(obj);
    }

    public Object a(String str, Class cls) {
        try {
            HwLog.i("WatchFaceJsonUtil", "fromJson is called");
            if (!a(str)) {
                HwLog.w("WatchFaceJsonUtil", "fromJson no valid , return null");
                return null;
            }
            return f30115c.fromJson(str, cls);
        } catch (JsonSyntaxException e) {
            HwLog.i("WatchFaceJsonUtil", "fromJson JsonSyntaxException:" + HwLog.printException((Exception) e));
            return null;
        }
    }

    public Object a(String str, Type type) {
        try {
            HwLog.i("WatchFaceJsonUtil", "fromJson is called");
            if (!a(str)) {
                HwLog.w("WatchFaceJsonUtil", "fromJson no valid , return null");
                return null;
            }
            return f30115c.fromJson(str, type);
        } catch (JsonSyntaxException e) {
            HwLog.i("WatchFaceJsonUtil", "fromJson JsonSyntaxException:" + HwLog.printException((Exception) e));
            return null;
        }
    }

    public static boolean a(String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (JSONException unused) {
                new JSONArray(str);
                return true;
            }
        } catch (JSONException unused2) {
            return false;
        }
    }

    public static List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            HwLog.i("WatchFaceJsonUtil", "parseStringList stringListJson is null");
            return null;
        }
        int length = jSONArray.length();
        if (length == 0) {
            HwLog.i("WatchFaceJsonUtil", "parseStringList stringListJson size is 0");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }
}
