package com.huawei.agconnect.apms;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends ResponseBody {
    public b abc;
    public ResponseBody bcd;
    public BufferedSource cde;

    public d0(ResponseBody responseBody, b bVar) {
        this.abc = bVar;
        this.bcd = responseBody;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.bcd.close();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public final long getContentLength() {
        return this.bcd.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType get$contentType() {
        return this.bcd.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public final BufferedSource getBodySource() {
        if (this.cde == null) {
            this.cde = Okio.buffer(new b0(this, this.bcd.getBodySource()));
        }
        return this.cde;
    }
}
