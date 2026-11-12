package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
final class RtspRequest {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 9;
    public static final int o = 10;
    public static final int p = 11;
    public static final int q = 12;
    public final Uri a;
    public final int b;
    public final RtspHeaders c;
    public final String d;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Method {
    }

    public RtspRequest(Uri uri, int method, RtspHeaders headers, String messageBody) {
        this.a = uri;
        this.b = method;
        this.c = headers;
        this.d = messageBody;
    }
}
