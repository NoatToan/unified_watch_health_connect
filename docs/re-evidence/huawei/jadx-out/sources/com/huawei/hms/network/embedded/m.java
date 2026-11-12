package com.huawei.hms.network.embedded;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f15070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Object> f15071b;

    public abstract q b();

    public boolean d() {
        return this.f15071b.isEmpty();
    }

    public l c() {
        return this.f15070a;
    }

    public void a(Map<String, Object> map) {
        this.f15071b.putAll(map);
    }

    public void a(String str, Object obj) {
        if (str == null) {
            return;
        }
        this.f15071b.put(str.toLowerCase(Locale.ENGLISH), obj);
    }

    public void a(l lVar) {
        this.f15070a = lVar;
    }

    public Map<String, Object> a() {
        return this.f15071b;
    }

    public Object a(String str) {
        if (str == null) {
            return null;
        }
        return this.f15071b.get(str);
    }

    public m(l lVar) {
        this.f15070a = lVar;
        this.f15071b = new ConcurrentHashMap();
    }

    public m() {
        this(null);
    }
}
