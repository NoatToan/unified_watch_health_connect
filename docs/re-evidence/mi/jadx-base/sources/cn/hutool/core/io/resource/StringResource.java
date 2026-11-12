package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.au3;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class StringResource extends CharSequenceResource {
    private static final long serialVersionUID = 1;

    public StringResource(String str) {
        super(str, null);
    }

    @Override // cn.hutool.core.io.resource.CharSequenceResource, defpackage.mqk
    public /* bridge */ /* synthetic */ String readUtf8Str() throws IORuntimeException {
        return super.readUtf8Str();
    }

    @Override // cn.hutool.core.io.resource.CharSequenceResource, defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public StringResource(String str, String str2) {
        super(str, str2, au3.f3449b);
    }

    public StringResource(String str, String str2, Charset charset) {
        super(str, str2, charset);
    }
}
