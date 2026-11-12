package com.loopj.android.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* JADX INFO: loaded from: classes18.dex */
class HmCryptoHttpEntity implements HttpEntity {
    private byte[] content;
    private HttpEntity httpEntity;

    public HmCryptoHttpEntity(HttpEntity httpEntity, byte[] bArr) {
        this.httpEntity = httpEntity;
        this.content = bArr;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() throws IOException {
        this.httpEntity.consumeContent();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IllegalStateException, IOException {
        return this.httpEntity.getContent();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.httpEntity.getContentEncoding();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.content.length;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.httpEntity.getContentType();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.httpEntity.isChunked();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return this.httpEntity.isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return this.httpEntity.isStreaming();
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
    }
}
