package com.xmlywind.sdk.common.e;

import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes22.dex */
public enum i {
    LOCATION("Location"),
    USER_AGENT("User-Agent"),
    ACCEPT_LANGUAGE(HttpHeaders.ACCEPT_LANGUAGE);

    private final String d;

    i(String str) {
        this.d = str;
    }

    public String a() {
        return this.d;
    }
}
