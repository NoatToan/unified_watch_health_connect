package com.amap.api.col.p0003sl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ju extends is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f2918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f2919b;

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isHostToIP() {
        return false;
    }

    public ju(byte[] bArr, String str) {
        this.f2919b = "1";
        this.f2918a = (byte[]) bArr.clone();
        this.f2919b = str;
        setDegradeAbility(la.a.SINGLE);
        setHttpProtocol(la.c.HTTP);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/zip");
        map.put("Content-Length", String.valueOf(this.f2918a.length));
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String strC = iy.c(jg.f2878b);
        String str = this.f2919b;
        byte[] bArrA = iy.a(jg.f2877a);
        byte[] bArr = new byte[bArrA.length + 50];
        System.arraycopy(this.f2918a, 0, bArr, 0, 50);
        System.arraycopy(bArrA, 0, bArr, 50, bArrA.length);
        return String.format(strC, "1", str, "1", "open", it.a(bArr));
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.f2918a;
    }
}
