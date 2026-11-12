package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class acn extends acu {
    private final boolean d;
    private final ClassIntrospector.MixInResolver e;
    private final ahp f;

    acn(AnnotationIntrospector annotationIntrospector, ahp ahpVar, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this.f = ahpVar;
        this.e = annotationIntrospector == null ? null : mixInResolver;
        this.d = z;
    }

    public static List<acj> d(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, ahp ahpVar, JavaType javaType, boolean z) {
        return new acn(annotationIntrospector, ahpVar, mixInResolver, z).e(typeResolutionContext, javaType);
    }

    List<acj> e(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        Map<String, b> mapB = b(typeResolutionContext, javaType, null);
        if (mapB == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(mapB.size());
        Iterator<b> it = mapB.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }

    private Map<String, b> b(TypeResolutionContext typeResolutionContext, JavaType javaType, Map<String, b> map) {
        ClassIntrospector.MixInResolver mixInResolver;
        Class<?> clsFindMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map<String, b> mapB = b(new TypeResolutionContext.e(this.f, superClass.getBindings()), superClass, map);
        for (Field field : rawClass.getDeclaredFields()) {
            if (e(field)) {
                if (mapB == null) {
                    mapB = new LinkedHashMap<>();
                }
                b bVar = new b(typeResolutionContext, field);
                if (this.d) {
                    bVar.d = a(bVar.d, field.getDeclaredAnnotations());
                }
                mapB.put(field.getName(), bVar);
            }
        }
        if (mapB != null && (mixInResolver = this.e) != null && (clsFindMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) != null) {
            d(clsFindMixInClassFor, rawClass, mapB);
        }
        return mapB;
    }

    private void d(Class<?> cls, Class<?> cls2, Map<String, b> map) {
        b bVar;
        Iterator<Class<?>> it = ahw.b(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (Field field : it.next().getDeclaredFields()) {
                if (e(field) && (bVar = map.get(field.getName())) != null) {
                    bVar.d = a(bVar.d, field.getDeclaredAnnotations());
                }
            }
        }
    }

    private boolean e(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeResolutionContext f256a;
        public AnnotationCollector d = AnnotationCollector.emptyCollector();
        public final Field e;

        public b(TypeResolutionContext typeResolutionContext, Field field) {
            this.f256a = typeResolutionContext;
            this.e = field;
        }

        public acj c() {
            return new acj(this.f256a, this.e, this.d.asAnnotationMap());
        }
    }
}
