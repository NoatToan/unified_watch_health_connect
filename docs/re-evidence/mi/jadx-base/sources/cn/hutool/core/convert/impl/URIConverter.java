package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class URIConverter extends AbstractConverter<URI> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public URI convertInternal(Object obj) {
        try {
            if (obj instanceof File) {
                return ((File) obj).toURI();
            }
            return obj instanceof URL ? ((URL) obj).toURI() : new URI(convertToStr(obj));
        } catch (Exception unused) {
            return null;
        }
    }
}
