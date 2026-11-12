package com.huawei.updatesdk.service.device;

import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29948b;

    abstract String a();

    public abstract String b();

    abstract String c();

    public abstract List<String> f();

    public String e() {
        if (!TextUtils.isEmpty(this.f29947a)) {
            return this.f29947a;
        }
        String strA = a();
        this.f29947a = strA;
        if (TextUtils.isEmpty(strA) || TextUtils.equals(this.f29947a, "unknown")) {
            this.f29947a = Build.MODEL;
        }
        return this.f29947a;
    }

    public String d() {
        if (!TextUtils.isEmpty(this.f29948b)) {
            return this.f29948b;
        }
        String strC = c();
        this.f29948b = strC;
        if (TextUtils.isEmpty(strC)) {
            this.f29948b = Build.MANUFACTURER;
        }
        return this.f29948b;
    }
}
