package com.huawei.agconnect.apms;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 extends ResponseBody {
    public b abc;
    public ResponseBody bcd;
    public BufferedSource cde;

    public e0(ResponseBody responseBody, b bVar) {
        this.abc = bVar;
        this.bcd = responseBody;
    }

    public final void close() throws IOException {
        this.bcd.close();
    }

    public final long contentLength() throws IOException {
        return this.bcd.contentLength();
    }

    public final MediaType contentType() {
        return this.bcd.contentType();
    }

    public final BufferedSource source() throws IOException {
        if (this.cde == null) {
            this.cde = Okio.buffer(new c0(this, this.bcd.source()));
        }
        return this.cde;
    }

    public final ResponseBody abc() {
        return this.bcd;
    }
}
