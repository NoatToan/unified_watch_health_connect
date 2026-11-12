package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hm extends gq {
    private byte[] e;
    private String f;

    public hm(byte[] bArr, String str) {
        this.f = "1";
        this.e = (byte[]) bArr.clone();
        this.f = str;
        setDegradeAbility(ir.a.SINGLE);
        setHttpProtocol(ir.c.HTTP);
    }

    @Override // com.amap.api.mapcore.util.ir
    public final byte[] getEntityBytes() {
        return this.e;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/zip");
        map.put("Content-Length", String.valueOf(this.e.length));
        return map;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        String strC = gu.c(hj.b);
        byte[] bArrA = gu.a(hj.a);
        byte[] bArr = new byte[bArrA.length + 50];
        System.arraycopy(this.e, 0, bArr, 0, 50);
        System.arraycopy(bArrA, 0, bArr, 50, bArrA.length);
        return String.format(strC, "1", this.f, "1", "open", gr.a(bArr));
    }

    @Override // com.amap.api.mapcore.util.ir
    public final boolean isHostToIP() {
        return false;
    }
}
