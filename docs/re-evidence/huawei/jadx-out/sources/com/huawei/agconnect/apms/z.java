package com.huawei.agconnect.apms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements HttpEntity, p0 {
    public final HttpEntity abc;
    public final b bcd;

    public z(HttpEntity httpEntity, b bVar) {
        this.abc = httpEntity;
        this.bcd = bVar;
    }

    @Override // com.huawei.agconnect.apms.p0
    public final void abc(o0 o0Var) {
        ((r0) o0Var.getSource()).abc(this);
        this.bcd.bcd(o0Var.abc);
    }

    @Override // com.huawei.agconnect.apms.p0
    public final void bcd(o0 o0Var) {
        ((r0) o0Var.getSource()).abc(this);
        nop.abc(this.bcd, o0Var.bcd);
    }

    @Override // org.apache.http.HttpEntity
    public final void consumeContent() throws IOException {
        try {
            this.abc.consumeContent();
        } catch (IOException e) {
            nop.abc(this.bcd, e);
            throw e;
        }
    }

    @Override // org.apache.http.HttpEntity
    public final InputStream getContent() throws IllegalStateException, IOException {
        try {
            if (this.bcd.g()) {
                return this.abc.getContent();
            }
            g gVar = new g(this.abc.getContent());
            gVar.bcd(this);
            return gVar;
        } catch (IOException e) {
            nop.abc(this.bcd, e);
            throw e;
        } catch (IllegalStateException e2) {
            nop.abc(this.bcd, e2);
            throw e2;
        }
    }

    @Override // org.apache.http.HttpEntity
    public final Header getContentEncoding() {
        return this.abc.getContentEncoding();
    }

    @Override // org.apache.http.HttpEntity
    public final long getContentLength() {
        return this.abc.getContentLength();
    }

    @Override // org.apache.http.HttpEntity
    public final Header getContentType() {
        return this.abc.getContentType();
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isChunked() {
        return this.abc.isChunked();
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isRepeatable() {
        return this.abc.isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isStreaming() {
        return this.abc.isStreaming();
    }

    @Override // org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) throws IOException {
        try {
            if (this.bcd.g()) {
                this.abc.writeTo(outputStream);
                return;
            }
            v vVar = new v(outputStream);
            this.abc.writeTo(vVar);
            this.bcd.bcd(vVar.abc());
        } catch (IOException e) {
            nop.abc(this.bcd, e);
            throw e;
        }
    }
}
