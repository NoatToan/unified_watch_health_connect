package com.huawei.maps.offlinedata.service.cloud;

import com.huawei.maps.offlinedata.service.cloud.dto.AuthResponseDTO;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private static volatile a h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17878c;
    private String d;
    private String e;
    private String f;
    private boolean g = true;

    public static a c() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public boolean a() {
        AuthResponseDTO authResponseDTOA = c.b().a();
        if (authResponseDTOA == null) {
            return false;
        }
        this.f17878c = authResponseDTOA.getP();
        this.f17876a = authResponseDTOA.getPoliticalView();
        this.f17877b = authResponseDTOA.getReviewNumberOfWatchMap();
        this.d = authResponseDTOA.getWatchMapVersion();
        this.e = authResponseDTOA.getWatchMapContourVersion();
        this.f = authResponseDTOA.getWatchMapSkiVersion();
        Boolean enableAutoUpdates = authResponseDTOA.getEnableAutoUpdates();
        if (enableAutoUpdates == null) {
            g.d("AuthClient", "the cloud don't has field: enableAutoUpdates.");
            enableAutoUpdates = Boolean.TRUE;
        }
        this.g = enableAutoUpdates.booleanValue();
        g.c("AuthClient", "response body p:" + this.f17878c);
        g.c("AuthClient", "response body reviewNumberOfWatchMap:" + this.f17877b);
        return true;
    }

    public boolean b() {
        return this.g;
    }

    public String d() {
        return this.f17878c;
    }

    public String e() {
        return this.f17876a;
    }

    public String f() {
        return this.f17877b;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.d;
    }
}
