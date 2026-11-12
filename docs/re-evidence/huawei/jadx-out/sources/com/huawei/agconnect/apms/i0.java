package com.huawei.agconnect.apms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.HttpEntityWrapper;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 extends HttpEntityWrapper implements p0 {
    public final HttpEntity abc;
    public final b bcd;
    public g cde;

    public i0(HttpResponse httpResponse, b bVar) {
        super(httpResponse.getEntity());
        this.abc = httpResponse.getEntity();
        this.bcd = bVar;
    }

    @Override // com.huawei.agconnect.apms.p0
    public final void abc(o0 o0Var) {
        ((r0) o0Var.getSource()).abc(this);
        b bVar = this.bcd;
        bVar.uvw = c.abc(bVar);
        this.bcd.abc(o0Var.abc);
        nop.abc(this.bcd);
    }

    @Override // com.huawei.agconnect.apms.p0
    public final void bcd(o0 o0Var) {
        ((r0) o0Var.getSource()).abc(this);
        nop.abc(this.bcd, o0Var.bcd);
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final void consumeContent() throws IOException {
        try {
            this.abc.consumeContent();
        } catch (IOException e) {
            nop.abc(this.bcd, e);
            throw e;
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final InputStream getContent() throws IllegalStateException, IOException {
        g gVar = this.cde;
        if (gVar != null) {
            return gVar;
        }
        try {
            HttpEntity httpEntity = this.abc;
            boolean zIsChunked = httpEntity instanceof HttpEntityWrapper ? true ^ ((HttpEntityWrapper) httpEntity).isChunked() : true;
            d.abc(this.bcd);
            b bVar = this.bcd;
            bVar.jkl(c.abc(bVar));
            g gVar2 = new g(this.abc.getContent(), zIsChunked);
            this.cde = gVar2;
            gVar2.bcd(this);
            return this.cde;
        } catch (IOException e) {
            nop.abc(this.bcd, e);
            throw e;
        } catch (IllegalStateException e2) {
            nop.abc(this.bcd, e2);
            throw e2;
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final Header getContentEncoding() {
        return this.abc.getContentEncoding();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final long getContentLength() {
        return this.abc.getContentLength();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final Header getContentType() {
        return this.abc.getContentType();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final boolean isChunked() {
        return this.abc.isChunked();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final boolean isRepeatable() {
        return this.abc.isRepeatable();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final boolean isStreaming() {
        return this.abc.isStreaming();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) throws IOException {
        v vVar;
        if (this.bcd.fed()) {
            this.abc.writeTo(outputStream);
            return;
        }
        try {
            d.abc(this.bcd);
            b bVar = this.bcd;
            bVar.jkl(c.abc(bVar));
            vVar = new v(outputStream);
            try {
                this.abc.writeTo(vVar);
            } catch (Exception e) {
                e = e;
                nop.abc(this.bcd, e);
            }
        } catch (Exception e2) {
            e = e2;
            vVar = null;
        }
        if (vVar != null) {
            this.bcd.abc(vVar.abc());
        }
        b bVar2 = this.bcd;
        bVar2.ijk(c.abc(bVar2));
        nop.abc(this.bcd);
    }
}
