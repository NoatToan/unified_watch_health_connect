package cn.hutool.core.convert.impl;

import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import cn.hutool.core.map.MapProxy;
import defpackage.bbk;
import defpackage.g4h;
import defpackage.i5q;
import defpackage.rh2;
import defpackage.tnq;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BeanConverter<T> extends AbstractConverter<T> {
    private static final long serialVersionUID = 1;
    private final Class<T> beanClass;
    private final Type beanType;
    private final CopyOptions copyOptions;

    public BeanConverter(Type type) {
        this(type, CopyOptions.create().setIgnoreError(true));
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public T convertInternal(Object obj) {
        boolean z = obj instanceof Map;
        if (z || (obj instanceof tnq) || rh2.t(obj.getClass())) {
            return (z && this.beanClass.isInterface()) ? (T) MapProxy.create((Map) obj).toProxyBean(this.beanClass) : (T) BeanCopier.create(obj, bbk.u(this.beanClass), this.beanType, this.copyOptions).copy();
        }
        if (obj instanceof byte[]) {
            return (T) g4h.f((byte[]) obj);
        }
        throw new ConvertException("Unsupported source type: {}", obj.getClass());
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<T> getTargetType() {
        return this.beanClass;
    }

    public BeanConverter(Class<T> cls) {
        this(cls, CopyOptions.create().setIgnoreError(true));
    }

    public BeanConverter(Type type, CopyOptions copyOptions) {
        this.beanType = type;
        this.beanClass = (Class<T>) i5q.e(type);
        this.copyOptions = copyOptions;
    }
}
