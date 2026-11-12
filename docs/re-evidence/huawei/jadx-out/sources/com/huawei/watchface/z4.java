package com.huawei.watchface;

import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes45.dex */
public class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.e f30697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GsonBuilder f30698b;

    public z4() {
        a5.e eVar = new a5.e();
        this.f30697a = eVar;
        eVar.f30069b = true;
        eVar.d = false;
        eVar.f30070c = true;
    }

    public void a(boolean z) {
        this.f30697a.f30070c = z;
    }

    public y4 a() {
        if (this.f30698b == null) {
            this.f30698b = new GsonBuilder();
        }
        return new y4(this.f30698b.create(), this.f30697a);
    }
}
