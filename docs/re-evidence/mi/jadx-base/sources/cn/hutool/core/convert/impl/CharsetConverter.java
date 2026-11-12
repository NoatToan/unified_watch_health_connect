package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import defpackage.au3;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class CharsetConverter extends AbstractConverter<Charset> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public Charset convertInternal(Object obj) {
        return au3.a(convertToStr(obj));
    }
}
