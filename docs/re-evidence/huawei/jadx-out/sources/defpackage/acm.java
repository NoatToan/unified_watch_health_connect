package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class acm extends acu {
    private final ClassIntrospector.MixInResolver d;
    private final boolean e;

    acm(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this.d = annotationIntrospector == null ? null : mixInResolver;
        this.e = z;
    }

    public static acl c(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, ahp ahpVar, JavaType javaType, List<JavaType> list, Class<?> cls, boolean z) {
        return new acm(annotationIntrospector, mixInResolver, z).c(ahpVar, typeResolutionContext, javaType, list, cls);
    }

    acl c(ahp ahpVar, TypeResolutionContext typeResolutionContext, JavaType javaType, List<JavaType> list, Class<?> cls) {
        Class<?> clsFindMixInClassFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType javaType2 : list) {
            ClassIntrospector.MixInResolver mixInResolver = this.d;
            e(new TypeResolutionContext.e(ahpVar, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, mixInResolver == null ? null : mixInResolver.findMixInClassFor(javaType2.getRawClass()));
        }
        ClassIntrospector.MixInResolver mixInResolver2 = this.d;
        if (mixInResolver2 != null && (clsFindMixInClassFor = mixInResolver2.findMixInClassFor(Object.class)) != null) {
            a(typeResolutionContext, javaType.getRawClass(), linkedHashMap, clsFindMixInClassFor);
            if (this.f274a != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry<acz, a> entry : linkedHashMap.entrySet()) {
                    acz key = entry.getKey();
                    if (WatchFaceConstant.HASHCODE.equals(key.a()) && key.b() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(key.a(), new Class[0]);
                            if (declaredMethod != null) {
                                a value = entry.getValue();
                                value.f254b = b(value.f254b, declaredMethod.getDeclaredAnnotations());
                                value.e = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new acl();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<acz, a> entry2 : linkedHashMap.entrySet()) {
            aco acoVarB = entry2.getValue().b();
            if (acoVarB != null) {
                linkedHashMap2.put(entry2.getKey(), acoVarB);
            }
        }
        return new acl(linkedHashMap2);
    }

    private void e(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<acz, a> map, Class<?> cls2) {
        if (cls2 != null) {
            a(typeResolutionContext, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : ahw.c(cls)) {
            if (e(method)) {
                acz aczVar = new acz(method);
                a aVar = map.get(aczVar);
                if (aVar == null) {
                    map.put(aczVar, new a(typeResolutionContext, method, this.f274a == null ? AnnotationCollector.emptyCollector() : e(method.getDeclaredAnnotations())));
                } else {
                    if (this.e) {
                        aVar.f254b = b(aVar.f254b, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.e;
                    if (method2 == null) {
                        aVar.e = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.e = method;
                        aVar.f255c = typeResolutionContext;
                    }
                }
            }
        }
    }

    protected void a(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<acz, a> map, Class<?> cls2) {
        if (this.f274a == null) {
            return;
        }
        Iterator<Class<?>> it = ahw.c(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : it.next().getDeclaredMethods()) {
                if (e(method)) {
                    acz aczVar = new acz(method);
                    a aVar = map.get(aczVar);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        map.put(aczVar, new a(typeResolutionContext, null, e(declaredAnnotations)));
                    } else {
                        aVar.f254b = b(aVar.f254b, declaredAnnotations);
                    }
                }
            }
        }
    }

    private static boolean e(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AnnotationCollector f254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TypeResolutionContext f255c;
        public Method e;

        public a(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.f255c = typeResolutionContext;
            this.e = method;
            this.f254b = annotationCollector;
        }

        public aco b() {
            Method method = this.e;
            if (method == null) {
                return null;
            }
            return new aco(this.f255c, method, this.f254b.asAnnotationMap(), null);
        }
    }
}
