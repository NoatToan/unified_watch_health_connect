package com.autonavi.aps.amapapi.restruct;

import android.net.wifi.WifiInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WifiInfo f3962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3964c;
    private int d = -1;

    public j(WifiInfo wifiInfo) {
        this.f3962a = wifiInfo;
    }

    public final String a() {
        if (this.f3964c == null) {
            this.f3964c = h.a(this.f3962a);
        }
        return this.f3964c;
    }

    public final String b() {
        if (this.f3963b == null) {
            this.f3963b = h.b(this.f3962a);
        }
        return this.f3963b;
    }

    public final int c() {
        if (this.d == -1) {
            this.d = h.c(this.f3962a);
        }
        return this.d;
    }

    public final boolean d() {
        return (this.f3962a == null || TextUtils.isEmpty(b()) || !com.autonavi.aps.amapapi.utils.k.a(a())) ? false : true;
    }
}
