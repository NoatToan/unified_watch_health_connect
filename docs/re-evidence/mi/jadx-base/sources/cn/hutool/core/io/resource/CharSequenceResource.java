package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.au3;
import defpackage.cid;
import defpackage.mqk;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class CharSequenceResource implements mqk, Serializable {
    private static final long serialVersionUID = 1;
    private final Charset charset;
    private final CharSequence data;
    private final CharSequence name;

    public CharSequenceResource(CharSequence charSequence) {
        this(charSequence, null);
    }

    @Override // defpackage.mqk
    public String getName() {
        return this.name.toString();
    }

    @Override // defpackage.mqk
    public BufferedReader getReader(Charset charset) {
        return cid.f(new StringReader(this.data.toString()));
    }

    @Override // defpackage.mqk
    public InputStream getStream() {
        return new ByteArrayInputStream(readBytes());
    }

    @Override // defpackage.mqk
    public URL getUrl() {
        return null;
    }

    @Override // defpackage.mqk
    public byte[] readBytes() throws IORuntimeException {
        return this.data.toString().getBytes(this.charset);
    }

    @Override // defpackage.mqk
    public String readStr(Charset charset) throws IORuntimeException {
        return this.data.toString();
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ String readUtf8Str() throws IORuntimeException {
        return super.readUtf8Str();
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public CharSequenceResource(CharSequence charSequence, String str) {
        this(charSequence, str, au3.f3449b);
    }

    public CharSequenceResource(CharSequence charSequence, CharSequence charSequence2, Charset charset) {
        this.data = charSequence;
        this.name = charSequence2;
        this.charset = charset;
    }
}
