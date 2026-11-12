package com.huawei.openalliance.ad;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f20315b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f20316c = true;
    private List<String> d;

    public List<String> d() {
        return this.d;
    }

    public Boolean c() {
        return this.f20316c;
    }

    public Boolean b() {
        return this.f20315b;
    }

    public void a(List<String> list) {
        this.d = list;
    }

    public void a(String str) {
        this.f20314a = str;
    }

    public void a(Boolean bool) {
        this.f20315b = bool;
    }

    public String a() {
        return this.f20314a;
    }
}
