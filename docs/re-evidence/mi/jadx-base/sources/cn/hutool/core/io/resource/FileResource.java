package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.d8q;
import defpackage.jm9;
import defpackage.mqk;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class FileResource implements mqk, Serializable {
    private static final long serialVersionUID = 1;
    private final File file;

    public FileResource(Path path) {
        this(path.toFile());
    }

    public File getFile() {
        return this.file;
    }

    @Override // defpackage.mqk
    public String getName() {
        return this.file.getName();
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ BufferedReader getReader(Charset charset) {
        return super.getReader(charset);
    }

    @Override // defpackage.mqk
    public InputStream getStream() throws NoResourceException {
        return jm9.s(this.file);
    }

    @Override // defpackage.mqk
    public URL getUrl() {
        return d8q.j(this.file);
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
        File file = this.file;
        return file == null ? AbstractJsonLexerKt.NULL : file.toString();
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public FileResource(File file) {
        this(file, file.getName());
    }

    public FileResource(File file, String str) {
        this.file = file;
    }

    public FileResource(String str) {
        this(jm9.o(str));
    }
}
