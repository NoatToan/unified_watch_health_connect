package com.autonavi.aps.amapapi.restruct;

import android.net.wifi.WifiInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WifiInfo f6869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6870b;
    private String c;
    private int d = -1;

    public j(WifiInfo wifiInfo) {
        this.f6869a = wifiInfo;
    }

    public final String a() {
        if (this.c == null) {
            this.c = h.a(this.f6869a);
        }
        return this.c;
    }

    public final String b() {
        if (this.f6870b == null) {
            this.f6870b = h.b(this.f6869a);
        }
        return this.f6870b;
    }

    public final int c() {
        if (this.d == -1) {
            this.d = h.c(this.f6869a);
        }
        return this.d;
    }

    public final boolean d() {
        return (this.f6869a == null || TextUtils.isEmpty(b()) || !com.autonavi.aps.amapapi.utils.k.a(a())) ? false : true;
    }
}
