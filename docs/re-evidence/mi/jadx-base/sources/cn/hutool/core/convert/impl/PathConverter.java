package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes.dex */
public class PathConverter extends AbstractConverter<Path> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public Path convertInternal(Object obj) {
        try {
            if (obj instanceof URI) {
                return Paths.get((URI) obj);
            }
            if (obj instanceof URL) {
                return Paths.get(((URL) obj).toURI());
            }
            return obj instanceof File ? ((File) obj).toPath() : Paths.get(convertToStr(obj), new String[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
