package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kb extends il {
    public Map<String, String> g;
    public String h;
    public String i;
    public byte[] j;
    public byte[] k;
    public boolean l;
    public String m;
    public Map<String, String> n;
    public boolean o;
    private String p;

    public kb(Context context, gt gtVar) {
        super(context, gtVar);
        this.g = null;
        this.p = "";
        this.h = "";
        this.i = "";
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = null;
        this.n = null;
        this.o = false;
    }

    @Override // com.amap.api.mapcore.util.il
    public final byte[] d() {
        return this.j;
    }

    @Override // com.amap.api.mapcore.util.il
    public final byte[] e() {
        return this.k;
    }

    @Override // com.amap.api.mapcore.util.il
    public final boolean g() {
        return this.l;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getIPDNSName() {
        return this.p;
    }

    @Override // com.amap.api.mapcore.util.gq, com.amap.api.mapcore.util.ir
    public final String getIPV6URL() {
        return this.i;
    }

    @Override // com.amap.api.mapcore.util.il, com.amap.api.mapcore.util.ir
    public final Map<String, String> getParams() {
        return this.n;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final Map<String, String> getRequestHead() {
        return this.g;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getSDKName() {
        return "loc";
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        return this.h;
    }

    @Override // com.amap.api.mapcore.util.il
    public final String h() {
        return this.m;
    }

    @Override // com.amap.api.mapcore.util.il
    public final boolean i() {
        return this.o;
    }
}
