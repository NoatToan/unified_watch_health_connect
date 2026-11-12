package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.lio;
import defpackage.mqk;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class BytesResource implements mqk, Serializable {
    private static final long serialVersionUID = 1;
    private final byte[] bytes;
    private final String name;

    public BytesResource(byte[] bArr) {
        this(bArr, null);
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
        return new ByteArrayInputStream(this.bytes);
    }

    @Override // defpackage.mqk
    public URL getUrl() {
        return null;
    }

    @Override // defpackage.mqk
    public byte[] readBytes() throws IORuntimeException {
        return this.bytes;
    }

    @Override // defpackage.mqk
    public String readStr(Charset charset) throws IORuntimeException {
        return lio.F0(this.bytes, charset);
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ String readUtf8Str() throws IORuntimeException {
        return super.readUtf8Str();
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public BytesResource(byte[] bArr, String str) {
        this.bytes = bArr;
        this.name = str;
    }
}
