package com.amap.api.col.p0003sl;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends la {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f5951r;
    public Map<String, String> s;

    public a1(byte[] bArr, Map<String, String> map) {
        this.f5951r = bArr;
        this.s = map;
        setDegradeAbility(la.a.SINGLE);
        setHttpProtocol(la.c.HTTPS);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.f5951r;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.s;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "https://adiu.amap.com/ws/device/adius";
    }
}
