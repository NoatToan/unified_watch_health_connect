package cn.hutool.core.io.file;

import defpackage.jm9;
import java.io.File;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public class FileWrapper implements Serializable {
    public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    private static final long serialVersionUID = 1;
    protected Charset charset;
    protected File file;

    public FileWrapper(File file, Charset charset) {
        this.file = file;
        this.charset = charset;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public File getFile() {
        return this.file;
    }

    public String readableFileSize() {
        return jm9.I(this.file.length());
    }

    public FileWrapper setCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    public FileWrapper setFile(File file) {
        this.file = file;
        return this;
    }
}
