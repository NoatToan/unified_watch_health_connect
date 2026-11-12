package com.amap.api.col.p0003sl;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ks extends la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f2981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f2982b;

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return null;
    }

    public ks(byte[] bArr, Map<String, String> map) {
        this.f2981a = bArr;
        this.f2982b = map;
        setDegradeAbility(la.a.SINGLE);
        setHttpProtocol(la.c.HTTPS);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.f2982b;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "https://adiu.amap.com/ws/device/adius";
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.f2981a;
    }
}
