package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.gd1;
import defpackage.h04;
import defpackage.n44;
import defpackage.ynf;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e extends n44 {
    public final f.a d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f7687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f7688b;
        public AnnotationCollector c;

        public a(g gVar, Method method, AnnotationCollector annotationCollector) {
            this.f7687a = gVar;
            this.f7688b = method;
            this.c = annotationCollector;
        }

        public AnnotatedMethod a() {
            Method method = this.f7688b;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.f7687a, method, this.c.b(), null);
        }
    }

    public e(AnnotationIntrospector annotationIntrospector, f.a aVar) {
        super(annotationIntrospector);
        this.d = annotationIntrospector == null ? null : aVar;
    }

    public static gd1 m(AnnotationIntrospector annotationIntrospector, g gVar, f.a aVar, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        return new e(annotationIntrospector, aVar).l(typeFactory, gVar, javaType, list, cls);
    }

    public final void i(g gVar, Class<?> cls, Map<ynf, a> map, Class<?> cls2) {
        if (cls2 != null) {
            j(gVar, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : h04.y(cls)) {
            if (k(method)) {
                ynf ynfVar = new ynf(method);
                a aVar = map.get(ynfVar);
                if (aVar == null) {
                    map.put(ynfVar, new a(gVar, method, this.f27527a == null ? AnnotationCollector.e() : e(method.getDeclaredAnnotations())));
                } else {
                    if (this.f27527a != null) {
                        aVar.c = f(aVar.c, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.f7688b;
                    if (method2 == null) {
                        aVar.f7688b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.f7688b = method;
                        aVar.f7687a = gVar;
                    }
                }
            }
        }
    }

    public void j(g gVar, Class<?> cls, Map<ynf, a> map, Class<?> cls2) {
        if (this.f27527a == null) {
            return;
        }
        Iterator<Class<?>> it = h04.v(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : h04.B(it.next())) {
                if (k(method)) {
                    ynf ynfVar = new ynf(method);
                    a aVar = map.get(ynfVar);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        map.put(ynfVar, new a(gVar, null, e(declaredAnnotations)));
                    } else {
                        aVar.c = f(aVar.c, declaredAnnotations);
                    }
                }
            }
        }
    }

    public final boolean k(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public gd1 l(TypeFactory typeFactory, g gVar, JavaType javaType, List<JavaType> list, Class<?> cls) {
        Class<?> clsFindMixInClassFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i(gVar, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType javaType2 : list) {
            f.a aVar = this.d;
            i(new g.a(typeFactory, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, aVar == null ? null : aVar.findMixInClassFor(javaType2.getRawClass()));
        }
        f.a aVar2 = this.d;
        if (aVar2 != null && (clsFindMixInClassFor = aVar2.findMixInClassFor(Object.class)) != null) {
            j(gVar, javaType.getRawClass(), linkedHashMap, clsFindMixInClassFor);
            if (this.f27527a != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry<ynf, a> entry : linkedHashMap.entrySet()) {
                    ynf key = entry.getKey();
                    if ("hashCode".equals(key.b()) && key.a() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(key.b(), new Class[0]);
                            if (declaredMethod != null) {
                                a value = entry.getValue();
                                value.c = f(value.c, declaredMethod.getDeclaredAnnotations());
                                value.f7688b = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new gd1();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<ynf, a> entry2 : linkedHashMap.entrySet()) {
            AnnotatedMethod annotatedMethodA = entry2.getValue().a();
            if (annotatedMethodA != null) {
                linkedHashMap2.put(entry2.getKey(), annotatedMethodA);
            }
        }
        return new gd1(linkedHashMap2);
    }
}
