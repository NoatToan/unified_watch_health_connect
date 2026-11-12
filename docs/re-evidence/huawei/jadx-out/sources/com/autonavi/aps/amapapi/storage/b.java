package com.autonavi.aps.amapapi.storage;

import com.amap.api.col.p0003sl.kf;
import com.amap.api.col.p0003sl.kg;
import com.amap.api.location.AMapLocation;

/* JADX INFO: loaded from: classes4.dex */
@kf(a = "c")
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @kg(a = "a2", b = 6)
    private String f3976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @kg(a = "a3", b = 5)
    private long f3977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @kg(a = "a4", b = 6)
    private String f3978c;
    private AMapLocation d;

    public final AMapLocation a() {
        return this.d;
    }

    public final void a(AMapLocation aMapLocation) {
        this.d = aMapLocation;
    }

    public final String b() {
        return this.f3978c;
    }

    public final void a(String str) {
        this.f3978c = str;
    }

    public final String c() {
        return this.f3976a;
    }

    public final void b(String str) {
        this.f3976a = str;
    }

    public final long d() {
        return this.f3977b;
    }

    public final void a(long j) {
        this.f3977b = j;
    }
}
