package com.amap.api.col.p0003sl;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.l0t;
import defpackage.m0t;
import defpackage.p0t;
import defpackage.t1t;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends l0t {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f6355r;
    public String s;

    public z0(byte[] bArr, String str) {
        this.s = "1";
        this.f6355r = (byte[]) bArr.clone();
        this.s = str;
        setDegradeAbility(la.a.SINGLE);
        setHttpProtocol(la.c.HTTP);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.f6355r;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/zip");
        map.put(HTTP.CONTENT_LEN, String.valueOf(this.f6355r.length));
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String strT = p0t.t(t1t.f34215b);
        String str = this.s;
        byte[] bArrN = p0t.n(t1t.f34214a);
        byte[] bArr = new byte[bArrN.length + 50];
        System.arraycopy(this.f6355r, 0, bArr, 0, 50);
        System.arraycopy(bArrN, 0, bArr, 50, bArrN.length);
        return String.format(strT, "1", str, "1", "open", m0t.b(bArr));
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isHostToIP() {
        return false;
    }
}
