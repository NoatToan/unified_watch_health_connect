package com.amap.api.col.p0003sl;

import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cd extends df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2307a;

    @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return false;
    }

    public cd(String str) {
        this.f2307a = str;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        Hashtable hashtable = new Hashtable(32);
        hashtable.put("User-Agent", "MAC=channel:amapapi");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.f2307a;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return getURL();
    }
}
