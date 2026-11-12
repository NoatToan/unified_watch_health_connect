package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConverterRegistry;
import defpackage.i5q;
import defpackage.tt3;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class ReferenceConverter extends AbstractConverter<Reference> {
    private static final long serialVersionUID = 1;
    private final Class<? extends Reference> targetType;

    public ReferenceConverter(Class<? extends Reference> cls) {
        this.targetType = cls;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Reference convertInternal(Object obj) {
        Type typeN = i5q.n(this.targetType);
        Object objConvert = !i5q.r(typeN) ? ConverterRegistry.getInstance().convert(typeN, obj) : null;
        if (objConvert != null) {
            obj = objConvert;
        }
        Class<? extends Reference> cls = this.targetType;
        if (cls == WeakReference.class) {
            return new WeakReference(obj);
        }
        if (cls == SoftReference.class) {
            return new SoftReference(obj);
        }
        throw new UnsupportedOperationException(tt3.y("Unsupport Reference type: {}", this.targetType.getName()));
    }
}
