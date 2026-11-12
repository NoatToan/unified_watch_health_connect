package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.mqk;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class InputStreamResource implements mqk, Serializable {
    private static final long serialVersionUID = 1;
    private final InputStream in;
    private final String name;

    public InputStreamResource(InputStream inputStream) {
        this(inputStream, null);
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
    public InputStream getStream() {
        return this.in;
    }

    @Override // defpackage.mqk
    public URL getUrl() {
        return null;
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

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public InputStreamResource(InputStream inputStream, String str) {
        this.in = inputStream;
        this.name = str;
    }
}
