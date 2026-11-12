package cn.hutool.core.convert;

import defpackage.ek4;
import defpackage.i04;
import defpackage.qj1;
import defpackage.tt3;
import defpackage.yt3;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractConverter<T> implements ek4<T>, Serializable {
    private static final long serialVersionUID = 1;

    @Override // defpackage.ek4
    public T convert(Object obj, T t) {
        Class targetType = getTargetType();
        if (targetType == null && t == null) {
            throw new NullPointerException(tt3.y("[type] and [defaultValue] are both null for Converter [{}], we can not know what type to convert !", getClass().getName()));
        }
        if (targetType == null) {
            targetType = t.getClass();
        }
        if (obj == null) {
            return t;
        }
        if (t != null && !targetType.isInstance(t)) {
            throw new IllegalArgumentException(tt3.y("Default value [{}]({}) is not the instance of [{}]", t, t.getClass(), targetType));
        }
        if (targetType.isInstance(obj) && !Map.class.isAssignableFrom(targetType)) {
            return (T) targetType.cast(obj);
        }
        T tConvertInternal = convertInternal(obj);
        return tConvertInternal == null ? t : tConvertInternal;
    }

    public abstract T convertInternal(Object obj);

    public T convertQuietly(Object obj, T t) {
        try {
            return convert(obj, t);
        } catch (Exception unused) {
            return t;
        }
    }

    public String convertToStr(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (qj1.B(obj)) {
            return qj1.Q(obj);
        }
        return yt3.e(obj) ? yt3.i(((Character) obj).charValue()) : obj.toString();
    }

    public Class<T> getTargetType() {
        return (Class<T>) i04.n(getClass());
    }
}
