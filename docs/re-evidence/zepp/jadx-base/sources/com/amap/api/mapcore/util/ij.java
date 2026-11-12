package com.amap.api.mapcore.util;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ij extends ir {
    private byte[] e;
    private Map<String, String> f;

    public ij(byte[] bArr, Map<String, String> map) {
        this.e = bArr;
        this.f = map;
        setDegradeAbility(ir.a.SINGLE);
        setHttpProtocol(ir.c.HTTPS);
    }

    @Override // com.amap.api.mapcore.util.ir
    public final byte[] getEntityBytes() {
        return this.e;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final Map<String, String> getParams() {
        return this.f;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final Map<String, String> getRequestHead() {
        return null;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        return "https://adiu.amap.com/ws/device/adius";
    }
}
