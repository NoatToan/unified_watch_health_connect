package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.d8q;
import defpackage.g4h;
import defpackage.jm9;
import defpackage.mqk;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class UrlResource implements mqk, Serializable {
    private static final long serialVersionUID = 1;
    protected String name;
    protected URL url;

    public UrlResource(URL url) {
        this(url, null);
    }

    public File getFile() {
        return jm9.p(this.url);
    }

    @Override // defpackage.mqk
    public String getName() {
        return this.name;
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ BufferedReader getReader(Charset charset) {
        return super.getReader(charset);
    }

    @Override // defpackage.mqk
    public InputStream getStream() throws NoResourceException {
        URL url = this.url;
        if (url != null) {
            return d8q.i(url);
        }
        throw new NoResourceException("Resource URL is null!");
    }

    @Override // defpackage.mqk
    public URL getUrl() {
        return this.url;
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ byte[] readBytes() throws IORuntimeException {
        return super.readBytes();
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ String readStr(Charset charset) throws IORuntimeException {
        return super.readStr(charset);
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ String readUtf8Str() throws IORuntimeException {
        return super.readUtf8Str();
    }

    public String toString() {
        URL url = this.url;
        return url == null ? AbstractJsonLexerKt.NULL : url.toString();
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public UrlResource(URL url, String str) {
        this.url = url;
        this.name = (String) g4h.e(str, url != null ? jm9.t(url.getPath()) : null);
    }

    @Deprecated
    public UrlResource(File file) {
        this.url = d8q.j(file);
    }
}
