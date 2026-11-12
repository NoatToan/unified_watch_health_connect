package com.twitter.sdk.android.core;

import okhttp3.Headers;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterRateLimit {
    private static final String d = "x-rate-limit-limit";
    private static final String e = "x-rate-limit-remaining";
    private static final String f = "x-rate-limit-reset";
    private int a;
    private int b;
    private long c;

    public TwitterRateLimit(Headers headers) {
        if (headers == null) {
            throw new IllegalArgumentException("headers must not be null");
        }
        for (int i = 0; i < headers.size(); i++) {
            if (d.equals(headers.name(i))) {
                this.a = Integer.valueOf(headers.value(i)).intValue();
            } else if (e.equals(headers.name(i))) {
                this.b = Integer.valueOf(headers.value(i)).intValue();
            } else if (f.equals(headers.name(i))) {
                this.c = Long.valueOf(headers.value(i)).longValue();
            }
        }
    }

    public int getLimit() {
        return this.a;
    }

    public int getRemaining() {
        return this.b;
    }

    public long getReset() {
        return this.c;
    }
}
