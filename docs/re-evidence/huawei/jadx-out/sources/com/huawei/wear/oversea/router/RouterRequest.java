package com.huawei.wear.oversea.router;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class RouterRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f30705a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f30707c;
    private Map<String, String> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30706b = null;
    private String i = null;
    private String d = null;

    public RouterRequest(Context context) {
        this.f30707c = null;
        this.e = null;
        this.f30705a = context;
        this.f30707c = new HashMap();
        this.e = new HashMap();
    }

    public Context c() {
        return this.f30705a;
    }

    public String b() {
        return this.d;
    }

    public RouterRequest c(String str) {
        this.d = str;
        return this;
    }

    public Map<String, Object> d() {
        return this.f30707c;
    }

    public String a() {
        return this.f30706b + "_" + this.i;
    }

    public RouterRequest a(String str) {
        this.f30706b = str;
        return this;
    }

    public RouterRequest d(String str) {
        this.i = str;
        return this;
    }

    public String e() {
        return a() + ":" + b();
    }
}
