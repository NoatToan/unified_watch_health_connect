package com.huawei.hianalytics;

import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f11600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f11601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11602c;
    public String d;
    public String e;
    public String f;
    public String g;

    public final x a(String str) {
        if ("oper".equals(str)) {
            return this.f11601b;
        }
        if ("maint".equals(str)) {
            return this.f11600a;
        }
        HiLog.sw("HAID", "wrong type");
        return null;
    }
}
