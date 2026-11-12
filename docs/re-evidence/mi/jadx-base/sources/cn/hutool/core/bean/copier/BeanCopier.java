package cn.hutool.core.bean.copier;

import cn.hutool.core.bean.BeanException;
import cn.hutool.core.bean.DynaBean;
import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.core.collection.CollUtil;
import defpackage.a5f;
import defpackage.fdi;
import defpackage.i5q;
import defpackage.rh2;
import defpackage.sh2;
import defpackage.tnq;
import defpackage.tt3;
import defpackage.y67;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class BeanCopier<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private final CopyOptions copyOptions;
    private final T dest;
    private final Type destType;
    private final Object source;

    public BeanCopier(Object obj, T t, Type type, CopyOptions copyOptions) {
        this.source = obj;
        this.dest = t;
        this.destType = type;
        this.copyOptions = copyOptions;
    }

    private void beanToBean(Object obj, Object obj2) {
        CopyOptions copyOptions = this.copyOptions;
        valueProviderToBean(new sh2(obj, copyOptions.ignoreCase, copyOptions.ignoreError), obj2);
    }

    private void beanToMap(final Object obj, final Map map) {
        String[] strArr = this.copyOptions.ignoreProperties;
        final HashSet hashSetQ = strArr != null ? CollUtil.q(strArr) : null;
        final CopyOptions copyOptions = this.copyOptions;
        rh2.j(obj.getClass(), new Consumer() { // from class: eh2
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                BeanCopier.lambda$beanToMap$0(copyOptions, hashSetQ, obj, map, (fdi) obj2);
            }
        });
    }

    public static <T> BeanCopier<T> create(Object obj, T t, CopyOptions copyOptions) {
        return create(obj, t, t.getClass(), copyOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$beanToMap$0(CopyOptions copyOptions, HashSet hashSet, Object obj, Map map, fdi fdiVar) {
        String strEditFieldName;
        if (fdiVar.m(copyOptions.isTransientSupport())) {
            String strE = fdiVar.e();
            if (CollUtil.c(hashSet, strE) || (strEditFieldName = copyOptions.editFieldName(copyOptions.getMappedFieldName(strE, false))) == null) {
                return;
            }
            try {
                Object objI = fdiVar.i(obj);
                BiPredicate<Field, Object> biPredicate = copyOptions.propertiesFilter;
                if (biPredicate == null || biPredicate.test(fdiVar.c(), objI)) {
                    if ((objI == null && copyOptions.ignoreNullValue) || obj == objI) {
                        return;
                    }
                    map.put(strEditFieldName, objI);
                }
            } catch (Exception e) {
                if (!copyOptions.ignoreError) {
                    throw new BeanException(e, "Get value of [{}] error!", fdiVar.e());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$valueProviderToBean$1(HashSet hashSet, CopyOptions copyOptions, tnq tnqVar, Object obj, fdi fdiVar) throws Exception {
        String strEditFieldName;
        if (fdiVar.p(this.copyOptions.isTransientSupport())) {
            String strE = fdiVar.e();
            if (CollUtil.c(hashSet, strE) || (strEditFieldName = copyOptions.editFieldName(copyOptions.getMappedFieldName(strE, true))) == null || !tnqVar.containsKey(strEditFieldName)) {
                return;
            }
            Object objA = tnqVar.a(strEditFieldName, i5q.b(this.destType, fdiVar.f()));
            BiPredicate<Field, Object> biPredicate = copyOptions.propertiesFilter;
            if (biPredicate == null || biPredicate.test(fdiVar.c(), objA)) {
                if ((objA == null && copyOptions.ignoreNullValue) || obj == objA) {
                    return;
                }
                fdiVar.r(obj, objA, copyOptions.ignoreNullValue, copyOptions.ignoreError);
            }
        }
    }

    private void mapToBean(Map<?, ?> map, Object obj) {
        CopyOptions copyOptions = this.copyOptions;
        valueProviderToBean(new a5f(map, copyOptions.ignoreCase, copyOptions.ignoreError), obj);
    }

    private void mapToMap(Map map, Map map2) {
        if (map2 == null || map == null) {
            return;
        }
        map2.putAll(map);
    }

    private void valueProviderToBean(final tnq<String> tnqVar, final Object obj) {
        if (tnqVar == null) {
            return;
        }
        final CopyOptions copyOptions = this.copyOptions;
        Class<?> cls = obj.getClass();
        Class<?> cls2 = copyOptions.editable;
        if (cls2 != null) {
            if (!cls2.isInstance(obj)) {
                throw new IllegalArgumentException(tt3.y("Target class [{}] not assignable to Editable class [{}]", obj.getClass().getName(), copyOptions.editable.getName()));
            }
            cls = copyOptions.editable;
        }
        Class<?> cls3 = cls;
        String[] strArr = copyOptions.ignoreProperties;
        final HashSet hashSetQ = strArr != null ? CollUtil.q(strArr) : null;
        rh2.j(cls3, new Consumer() { // from class: dh2
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f15524a.lambda$valueProviderToBean$1(hashSetQ, copyOptions, tnqVar, obj, (fdi) obj2);
            }
        });
    }

    public T copy() {
        Object obj = this.source;
        if (obj != null) {
            if (obj instanceof tnq) {
                valueProviderToBean((tnq) obj, this.dest);
            } else if (obj instanceof DynaBean) {
                valueProviderToBean(new y67((DynaBean) obj, this.copyOptions.ignoreError), this.dest);
            } else if (obj instanceof Map) {
                T t = this.dest;
                if (t instanceof Map) {
                    mapToMap((Map) obj, (Map) t);
                } else {
                    mapToBean((Map) obj, t);
                }
            } else {
                T t2 = this.dest;
                if (t2 instanceof Map) {
                    beanToMap(obj, (Map) t2);
                } else {
                    beanToBean(obj, t2);
                }
            }
        }
        return this.dest;
    }

    public static <T> BeanCopier<T> create(Object obj, T t, Type type, CopyOptions copyOptions) {
        return new BeanCopier<>(obj, t, type, copyOptions);
    }
}
