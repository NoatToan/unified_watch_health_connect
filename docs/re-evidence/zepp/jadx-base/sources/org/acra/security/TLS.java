package org.acra.security;

/* JADX INFO: loaded from: classes23.dex */
public enum TLS {
    V1("TLSv1"),
    V1_1("TLSv1.1"),
    V1_2("TLSv1.2"),
    V1_3("TLSv1.3");

    private final String id;

    TLS(String str) {
        this.id = str;
    }

    public String getId() {
        return this.id;
    }
}
