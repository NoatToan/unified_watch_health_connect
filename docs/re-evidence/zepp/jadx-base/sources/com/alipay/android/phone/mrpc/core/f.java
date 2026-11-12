package com.alipay.android.phone.mrpc.core;

import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements ConnectionKeepAliveStrategy {
    public final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return MediaRecorderHelper.MAX_RECORD_TIME;
    }
}
