package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.h04;
import defpackage.n44;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d extends n44 {
    public final TypeFactory d;
    public final f.a e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f7685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f7686b;
        public AnnotationCollector c = AnnotationCollector.e();

        public a(g gVar, Field field) {
            this.f7685a = gVar;
            this.f7686b = field;
        }

        public AnnotatedField a() {
            return new AnnotatedField(this.f7685a, this.f7686b, this.c.b());
        }
    }

    public d(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, f.a aVar) {
        super(annotationIntrospector);
        this.d = typeFactory;
        this.e = annotationIntrospector == null ? null : aVar;
    }

    public static List<AnnotatedField> m(AnnotationIntrospector annotationIntrospector, g gVar, f.a aVar, TypeFactory typeFactory, JavaType javaType) {
        return new d(annotationIntrospector, typeFactory, aVar).l(gVar, javaType);
    }

    public final void i(Class<?> cls, Class<?> cls2, Map<String, a> map) {
        a aVar;
        Iterator<Class<?>> it = h04.w(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (Field field : h04.A(it.next())) {
                if (k(field) && (aVar = map.get(field.getName())) != null) {
                    aVar.c = d(aVar.c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    public final Map<String, a> j(g gVar, JavaType javaType, Map<String, a> map) {
        Class<?> clsFindMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map<String, a> mapJ = j(new g.a(this.d, superClass.getBindings()), superClass, map);
        for (Field field : h04.A(rawClass)) {
            if (k(field)) {
                if (mapJ == null) {
                    mapJ = new LinkedHashMap<>();
                }
                a aVar = new a(gVar, field);
                if (this.f27527a != null) {
                    aVar.c = d(aVar.c, field.getDeclaredAnnotations());
                }
                mapJ.put(field.getName(), aVar);
            }
        }
        f.a aVar2 = this.e;
        if (aVar2 != null && (clsFindMixInClassFor = aVar2.findMixInClassFor(rawClass)) != null) {
            i(clsFindMixInClassFor, rawClass, mapJ);
        }
        return mapJ;
    }

    public final boolean k(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    public List<AnnotatedField> l(g gVar, JavaType javaType) {
        Map<String, a> mapJ = j(gVar, javaType, null);
        if (mapJ == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(mapJ.size());
        Iterator<a> it = mapJ.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }
}
