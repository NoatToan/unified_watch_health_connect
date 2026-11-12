package com.huawei.maps.offlinedata.jsbridge;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.maps.offlinedata.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f17840a = new a();

    private a() {
    }

    public static a a() {
        return f17840a;
    }

    private void b(long j, int i, Object obj) {
        b.a().b("window.h5proRuntime.bridge.consumeCallback", a(j, i, obj));
    }

    public void a(Object obj, long j) {
        b(j, 0, obj);
    }

    public void a(int i, String str, long j) {
        b(j, i, str);
    }

    private C0184a a(long j, int i, Object obj) {
        g.a("PromiseInvoker", "triggerCallback enter, callback id:" + j + " errorCode:" + i);
        C0184a c0184a = new C0184a();
        c0184a.f17841a = j;
        c0184a.f17842b = i;
        if (obj instanceof JSONObject) {
            c0184a.f17843c = new Gson().fromJson(obj.toString(), JsonObject.class);
            return c0184a;
        }
        c0184a.f17843c = obj;
        return c0184a;
    }

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.jsbridge.a$a, reason: collision with other inner class name */
    static class C0184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("callback_id")
        long f17841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("err_code")
        int f17842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("data")
        Object f17843c;

        C0184a() {
        }
    }
}
