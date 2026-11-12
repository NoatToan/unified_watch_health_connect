package com.huawei.maps.offlinedata.service.config;

import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.maps.offlinedata.service.cloud.GrsMapClient;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private static volatile a h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f17889a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17891c;
    private String[] d;
    private boolean e;
    private boolean f;
    private boolean g;

    private a() {
    }

    public static a h() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public Set d() {
        return this.f17889a;
    }

    public String e() {
        return GrsMapClient.getInstance().getServerAddress();
    }

    public String f() {
        return this.f17891c;
    }

    public String g() {
        return this.f17890b;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.f;
    }

    public String k() {
        return com.huawei.maps.offlinedata.service.cloud.a.c().d();
    }

    public String[] l() {
        return this.d;
    }

    public void a(String[] strArr) {
        this.d = strArr;
    }

    public void b(String str) {
        this.f17891c = str;
    }

    public boolean c() {
        return this.e;
    }

    public void a(String str) {
        this.f17889a.add(str);
    }

    public String b() {
        return com.huawei.maps.offlinedata.service.cloud.utils.a.a(com.huawei.maps.offlinedata.utils.a.b(), AgConnectInfo.AgConnectKey.API_KEY);
    }

    public void c(String str) {
        this.f17890b = str;
    }

    public void a() {
        this.f17889a.clear();
    }
}
