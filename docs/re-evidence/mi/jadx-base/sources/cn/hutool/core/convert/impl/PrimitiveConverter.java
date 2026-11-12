package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import defpackage.g4h;
import defpackage.tt3;
import defpackage.yj4;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class PrimitiveConverter extends AbstractConverter<Object> {
    private static final long serialVersionUID = 1;
    private final Class<?> targetType;

    public PrimitiveConverter(Class<?> cls) {
        if (cls == null) {
            throw new NullPointerException("PrimitiveConverter not allow null target type!");
        }
        if (cls.isPrimitive()) {
            this.targetType = cls;
            return;
        }
        throw new IllegalArgumentException("[" + cls + "] is not a primitive class!");
    }

    public static Object convert(Object obj, Class<?> cls, Function<Object, String> function) {
        if (Byte.TYPE == cls) {
            return g4h.e(NumberConverter.convert(obj, Byte.class, function), 0);
        }
        if (Short.TYPE == cls) {
            return g4h.e(NumberConverter.convert(obj, Short.class, function), 0);
        }
        if (Integer.TYPE == cls) {
            return g4h.e(NumberConverter.convert(obj, Integer.class, function), 0);
        }
        if (Long.TYPE == cls) {
            return g4h.e(NumberConverter.convert(obj, Long.class, function), 0);
        }
        if (Float.TYPE == cls) {
            return g4h.e(NumberConverter.convert(obj, Float.class, function), 0);
        }
        if (Double.TYPE == cls) {
            return g4h.e(NumberConverter.convert(obj, Double.class, function), 0);
        }
        if (Character.TYPE == cls) {
            return yj4.a(Character.class, obj);
        }
        if (Boolean.TYPE == cls) {
            return yj4.a(Boolean.class, obj);
        }
        throw new ConvertException("Unsupported target type: {}", cls);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Object convertInternal(Object obj) {
        return convert(obj, this.targetType, new Function() { // from class: q8i
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return this.f31230a.convertToStr(obj2);
            }
        });
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public String convertToStr(Object obj) {
        return tt3.r0(super.convertToStr(obj));
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Object> getTargetType() {
        return this.targetType;
    }
}
