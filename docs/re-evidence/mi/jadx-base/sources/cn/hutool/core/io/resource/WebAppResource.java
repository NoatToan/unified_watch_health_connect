package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.jm9;
import java.io.BufferedReader;
import java.io.File;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class WebAppResource extends FileResource {
    private static final long serialVersionUID = 1;

    public WebAppResource(String str) {
        super(new File(jm9.x(), str));
    }

    @Override // cn.hutool.core.io.resource.FileResource, defpackage.mqk
    public /* bridge */ /* synthetic */ BufferedReader getReader(Charset charset) {
        return super.getReader(charset);
    }

    @Override // cn.hutool.core.io.resource.FileResource, defpackage.mqk
    public /* bridge */ /* synthetic */ byte[] readBytes() throws IORuntimeException {
        return super.readBytes();
    }

    @Override // cn.hutool.core.io.resource.FileResource, defpackage.mqk
    public /* bridge */ /* synthetic */ String readStr(Charset charset) throws IORuntimeException {
        return super.readStr(charset);
    }

    @Override // cn.hutool.core.io.resource.FileResource, defpackage.mqk
    public /* bridge */ /* synthetic */ String readUtf8Str() throws IORuntimeException {
        return super.readUtf8Str();
    }

    @Override // cn.hutool.core.io.resource.FileResource, defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }
}
