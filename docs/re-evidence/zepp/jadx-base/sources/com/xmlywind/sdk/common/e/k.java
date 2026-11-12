package com.xmlywind.sdk.common.e;

import android.text.TextUtils;
import com.xmlywind.volley.p;
import com.xmlywind.volley.s;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes22.dex */
public abstract class k<T> extends com.xmlywind.volley.l<T> {
    private final String b;

    public k(String str, int i, com.xmlywind.volley.n.a aVar) {
        super(i, str, aVar);
        this.b = str;
        a((p) new com.xmlywind.volley.c(10000, 2, 0.0f));
        a(false);
    }

    @Override // com.xmlywind.volley.l
    public com.xmlywind.volley.n<T> a(com.xmlywind.volley.i iVar) {
        return com.xmlywind.volley.n.a(iVar, com.xmlywind.volley.toolbox.h.a(iVar));
    }

    @Override // com.xmlywind.volley.l
    public String a() {
        return super.a();
    }

    @Override // com.xmlywind.volley.l
    public s b(s sVar) {
        return super.b(sVar);
    }

    @Override // com.xmlywind.volley.l
    public byte[] b() {
        String strA = m.a(l(), h());
        if (strA == null) {
            return null;
        }
        return strA.getBytes();
    }

    @Override // com.xmlywind.volley.l
    public Map<String, String> c() {
        TreeMap treeMap = new TreeMap();
        if (m.a(this.b)) {
            String language = Locale.getDefault().getLanguage();
            String strA = null;
            if (com.xmlywind.sdk.common.a.n() != null) {
                Locale localeX = com.xmlywind.sdk.common.a.n().X();
                if (!localeX.getLanguage().trim().isEmpty()) {
                    language = localeX.getLanguage().trim();
                }
                if (!TextUtils.isEmpty(com.xmlywind.sdk.common.a.n().t())) {
                    strA = com.xmlywind.sdk.common.utils.k.a(com.xmlywind.sdk.common.a.n().t());
                }
            }
            if (!TextUtils.isEmpty(language)) {
                treeMap.put(i.ACCEPT_LANGUAGE.a(), language);
            }
            if (!TextUtils.isEmpty(strA)) {
                treeMap.put("token", strA);
            }
        }
        return treeMap;
    }
}
