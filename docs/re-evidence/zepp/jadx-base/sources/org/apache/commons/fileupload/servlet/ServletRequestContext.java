package org.apache.commons.fileupload.servlet;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.UploadContext;

/* JADX INFO: loaded from: classes23.dex */
public class ServletRequestContext implements UploadContext {
    private final HttpServletRequest a;

    public ServletRequestContext(HttpServletRequest httpServletRequest) {
        this.a = httpServletRequest;
    }

    @Override // org.apache.commons.fileupload.UploadContext
    public long contentLength() {
        try {
            return Long.parseLong(this.a.getHeader(FileUploadBase.CONTENT_LENGTH));
        } catch (NumberFormatException unused) {
            return this.a.getContentLength();
        }
    }

    @Override // org.apache.commons.fileupload.RequestContext
    public String getCharacterEncoding() {
        return this.a.getCharacterEncoding();
    }

    @Override // org.apache.commons.fileupload.RequestContext
    @Deprecated
    public int getContentLength() {
        return this.a.getContentLength();
    }

    @Override // org.apache.commons.fileupload.RequestContext
    public String getContentType() {
        return this.a.getContentType();
    }

    @Override // org.apache.commons.fileupload.RequestContext
    public InputStream getInputStream() throws IOException {
        return this.a.getInputStream();
    }

    public String toString() {
        return String.format("ContentLength=%s, ContentType=%s", Long.valueOf(contentLength()), getContentType());
    }
}
