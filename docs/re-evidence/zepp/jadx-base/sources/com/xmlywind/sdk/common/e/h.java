package com.xmlywind.sdk.common.e;

import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes22.dex */
class h extends com.xmlywind.volley.toolbox.j {
    private final String a;

    public h(String str, com.xmlywind.volley.toolbox.j.b bVar, SSLSocketFactory sSLSocketFactory) {
        super(bVar, sSLSocketFactory);
        this.a = str;
    }

    @Override // com.xmlywind.volley.toolbox.j, com.xmlywind.volley.toolbox.a
    public com.xmlywind.volley.toolbox.i a(com.xmlywind.volley.l<?> lVar, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            map = new TreeMap<>();
        }
        map.put(i.USER_AGENT.a(), this.a);
        return super.a(lVar, map);
    }
}
