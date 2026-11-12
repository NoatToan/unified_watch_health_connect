package org.apache.commons.fileupload.portlet;

import java.io.IOException;
import java.io.InputStream;
import javax.portlet.ActionRequest;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.UploadContext;

/* JADX INFO: loaded from: classes23.dex */
public class PortletRequestContext implements UploadContext {
    private final ActionRequest a;

    public PortletRequestContext(ActionRequest actionRequest) {
        this.a = actionRequest;
    }

    @Override // org.apache.commons.fileupload.UploadContext
    public long contentLength() {
        try {
            return Long.parseLong(this.a.getProperty(FileUploadBase.CONTENT_LENGTH));
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
        return this.a.getPortletInputStream();
    }

    public String toString() {
        return String.format("ContentLength=%s, ContentType=%s", Long.valueOf(contentLength()), getContentType());
    }
}
