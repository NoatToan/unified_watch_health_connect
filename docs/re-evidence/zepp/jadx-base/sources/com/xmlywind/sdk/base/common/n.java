package com.xmlywind.sdk.base.common;

/* JADX INFO: loaded from: classes22.dex */
public class n {
    private static com.xmlywind.volley.toolbox.g a;
    private static com.xmlywind.volley.toolbox.g b;

    public static com.xmlywind.volley.toolbox.g a() {
        if (a == null) {
            synchronized (n.class) {
                if (a == null && com.xmlywind.sdk.common.e.f.d() != null) {
                    a = new com.xmlywind.volley.toolbox.g(com.xmlywind.sdk.common.e.f.d(), 3);
                }
            }
        }
        return a;
    }

    public static com.xmlywind.volley.toolbox.g b() {
        if (b == null) {
            synchronized (n.class) {
                if (b == null && com.xmlywind.sdk.common.e.f.e() != null) {
                    b = new com.xmlywind.volley.toolbox.g(com.xmlywind.sdk.common.e.f.e(), 1);
                }
            }
        }
        return b;
    }

    public static com.xmlywind.volley.toolbox.g c() {
        if (a == null) {
            synchronized (n.class) {
                if (a == null && com.xmlywind.sdk.common.e.f.e() != null) {
                    a = new com.xmlywind.volley.toolbox.g(com.xmlywind.sdk.common.e.f.e(), 1);
                }
            }
        }
        return a;
    }
}
