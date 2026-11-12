package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.impl.EnumConverter;
import cn.hutool.core.lang.EnumItem;
import cn.hutool.core.lang.SimpleCache;
import cn.hutool.core.util.ModifierUtil;
import defpackage.bbk;
import defpackage.i04;
import defpackage.pc8;
import defpackage.qc8;
import defpackage.v4f;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes.dex */
public class EnumConverter extends AbstractConverter<Object> {
    private static final SimpleCache<Class<?>, Map<Class<?>, Method>> VALUE_OF_METHOD_CACHE = new SimpleCache<>();
    private static final long serialVersionUID = 1;
    private final Class enumClass;

    public EnumConverter(Class cls) {
        this.enumClass = cls;
    }

    private static Map<Class<?>, Method> getMethodMap(Class<?> cls) {
        return VALUE_OF_METHOD_CACHE.get(cls, new pc8(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getMethodMap$73a18c6f$1(final Class cls) throws Exception {
        return (Map) Arrays.stream(cls.getMethods()).filter(new Predicate() { // from class: jc8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ModifierUtil.e((Method) obj);
            }
        }).filter(new Predicate() { // from class: kc8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumConverter.lambda$null$0(cls, (Method) obj);
            }
        }).filter(new Predicate() { // from class: lc8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumConverter.lambda$null$1((Method) obj);
            }
        }).filter(new Predicate() { // from class: mc8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumConverter.lambda$null$2((Method) obj);
            }
        }).collect(Collectors.toMap(new Function() { // from class: nc8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EnumConverter.lambda$null$3((Method) obj);
            }
        }, new Function() { // from class: oc8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EnumConverter.lambda$null$4((Method) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$0(Class cls, Method method) {
        return method.getReturnType() == cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$1(Method method) {
        return method.getParameterCount() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$2(Method method) {
        return !"valueOf".equals(method.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$null$3(Method method) {
        return method.getParameterTypes()[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Method lambda$null$4(Method method) {
        return method;
    }

    public static Enum tryConvertEnum(Object obj, Class cls) {
        EnumItem enumItem;
        Enum r0 = null;
        if (obj == null) {
            return null;
        }
        if (EnumItem.class.isAssignableFrom(cls) && (enumItem = (EnumItem) qc8.a(cls, 0)) != null) {
            if (obj instanceof Integer) {
                return (Enum) enumItem.fromInt((Integer) obj);
            }
            if (obj instanceof String) {
                return (Enum) enumItem.fromStr(obj.toString());
            }
        }
        Map<Class<?>, Method> methodMap = getMethodMap(cls);
        if (v4f.p(methodMap)) {
            Class<?> cls2 = obj.getClass();
            for (Map.Entry<Class<?>, Method> entry : methodMap.entrySet()) {
                if (i04.r(entry.getKey(), cls2)) {
                    r0 = (Enum) bbk.r(entry.getValue(), obj);
                }
            }
        }
        if (r0 != null) {
            return r0;
        }
        if (obj instanceof Integer) {
            return qc8.a(cls, ((Integer) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return r0;
        }
        try {
            return Enum.valueOf(cls, (String) obj);
        } catch (IllegalArgumentException unused) {
            return r0;
        }
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Object convertInternal(Object obj) {
        Enum enumTryConvertEnum = tryConvertEnum(obj, this.enumClass);
        return (enumTryConvertEnum != null || (obj instanceof String)) ? enumTryConvertEnum : Enum.valueOf(this.enumClass, convertToStr(obj));
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Object> getTargetType() {
        return this.enumClass;
    }
}
