package com.autonavi.aps.amapapi.storage;

import com.amap.api.location.AMapLocation;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.c4t;
import defpackage.e4t;

/* JADX INFO: loaded from: classes4.dex */
@c4t(a = PluginDeviceInfo.FICONON)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e4t(a = "a2", b = 6)
    private String f6882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e4t(a = "a3", b = 5)
    private long f6883b;

    @e4t(a = "a4", b = 6)
    private String c;
    private AMapLocation d;

    public final AMapLocation a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f6882a;
    }

    public final long d() {
        return this.f6883b;
    }

    public final void a(AMapLocation aMapLocation) {
        this.d = aMapLocation;
    }

    public final void b(String str) {
        this.f6882a = str;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void a(long j) {
        this.f6883b = j;
    }
}
