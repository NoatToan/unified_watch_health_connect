package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: classes3.dex */
public class HttpResponse {
    private final int a;
    private final String b;

    public HttpResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public String body() {
        return this.b;
    }

    public int code() {
        return this.a;
    }
}
