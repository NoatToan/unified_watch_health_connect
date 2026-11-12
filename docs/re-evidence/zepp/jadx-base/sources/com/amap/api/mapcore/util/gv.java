package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class gv extends ir {
    private String f;
    private Map<String, String> e = new HashMap();
    private Map<String, String> g = new HashMap();

    public final void a(Map<String, String> map) {
        this.e.clear();
        this.e.putAll(map);
    }

    public final void b(Map<String, String> map) {
        this.g.clear();
        this.g.putAll(map);
    }

    @Override // com.amap.api.mapcore.util.ir
    public final Map<String, String> getParams() {
        return this.g;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final Map<String, String> getRequestHead() {
        return this.e;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        return this.f;
    }

    public final void a(String str) {
        this.f = str;
    }
}
