package com.huawei.hwcloudjs.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17056a = "JsListenerCenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f17057b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Class<? extends c>> f17058c = new ArrayList();

    public void a(String str) {
        String str2;
        com.huawei.hwcloudjs.f.d.c(f17056a, "onDestroy begin", true);
        synchronized (this.f17058c) {
            Iterator<Class<? extends c>> it = this.f17058c.iterator();
            while (it.hasNext()) {
                try {
                    it.next().newInstance().onDestroy(str);
                } catch (IllegalAccessException unused) {
                    str2 = "IllegalAccessException";
                    com.huawei.hwcloudjs.f.d.b(f17056a, str2, true);
                } catch (InstantiationException unused2) {
                    str2 = "InstantiationException";
                    com.huawei.hwcloudjs.f.d.b(f17056a, str2, true);
                }
            }
        }
    }

    public void a(Class<? extends c> cls) {
        synchronized (this.f17058c) {
            this.f17058c.add(cls);
        }
    }

    public void a(Context context, String str, String str2, String str3, List<String> list, JSONObject jSONObject) {
        String str4;
        com.huawei.hwcloudjs.f.d.c(f17056a, "onCompletedConfig begin", true);
        synchronized (this.f17058c) {
            Iterator<Class<? extends c>> it = this.f17058c.iterator();
            while (it.hasNext()) {
                try {
                    c cVarNewInstance = it.next().newInstance();
                    try {
                        if (list.contains(cVarNewInstance.getApi())) {
                            cVarNewInstance.onCompletedConfig(context, str, str2, str3, jSONObject);
                        }
                    } catch (IllegalAccessException unused) {
                        str4 = "IllegalAccessException";
                        com.huawei.hwcloudjs.f.d.b(f17056a, str4, true);
                    } catch (InstantiationException unused2) {
                        str4 = "InstantiationException";
                        com.huawei.hwcloudjs.f.d.b(f17056a, str4, true);
                    }
                } catch (IllegalAccessException unused3) {
                } catch (InstantiationException unused4) {
                }
            }
        }
    }

    public static d a() {
        return f17057b;
    }
}
