package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConverterRegistry;
import defpackage.i5q;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class AtomicReferenceConverter extends AbstractConverter<AtomicReference> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public AtomicReference convertInternal(Object obj) {
        Type typeN = i5q.n(AtomicReference.class);
        Object objConvert = !i5q.r(typeN) ? ConverterRegistry.getInstance().convert(typeN, obj) : null;
        if (objConvert != null) {
            obj = objConvert;
        }
        return new AtomicReference(obj);
    }
}
