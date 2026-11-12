package com.huawei.updatesdk.service.appmgr.keyset;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0293a f29933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29935c;

    public String c() {
        return this.f29934b;
    }

    public long b() {
        return this.f29935c;
    }

    public void a(String str) {
        this.f29934b = str;
    }

    /* JADX INFO: renamed from: com.huawei.updatesdk.service.appmgr.keyset.a$a, reason: collision with other inner class name */
    public static class C0293a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f29936a;

        public void a(List<String> list) {
            this.f29936a = list;
        }

        public List<String> a() {
            return this.f29936a;
        }
    }

    public void a(C0293a c0293a) {
        this.f29933a = c0293a;
    }

    public void a(long j) {
        this.f29935c = j;
    }

    public C0293a a() {
        return this.f29933a;
    }
}
