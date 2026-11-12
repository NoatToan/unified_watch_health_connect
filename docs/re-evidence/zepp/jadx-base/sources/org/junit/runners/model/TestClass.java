package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes23.dex */
public class TestClass implements Annotatable {
    private static final b d;
    private static final c e;
    private final Class<?> a;
    private final Map<Class<? extends Annotation>, List<FrameworkMethod>> b;
    private final Map<Class<? extends Annotation>, List<FrameworkField>> c;

    public static class b implements Comparator<Field> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    }

    public static class c implements Comparator<FrameworkMethod> {
        private c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(FrameworkMethod frameworkMethod, FrameworkMethod frameworkMethod2) {
            return MethodSorter.NAME_ASCENDING.compare(frameworkMethod.getMethod(), frameworkMethod2.getMethod());
        }
    }

    static {
        d = new b();
        e = new c();
    }

    public TestClass(Class<?> cls) {
        this.a = cls;
        if (cls != null && cls.getConstructors().length > 1) {
            throw new IllegalArgumentException("Test class can only have one constructor");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        scanAnnotatedMembers(linkedHashMap, linkedHashMap2);
        this.b = e(linkedHashMap);
        this.c = e(linkedHashMap2);
    }

    private <T> List<T> a(Map<?, List<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<List<T>> it2 = map.values().iterator();
        while (it2.hasNext()) {
            linkedHashSet.addAll(it2.next());
        }
        return new ArrayList(linkedHashSet);
    }

    public static <T extends FrameworkMember<T>> void addToAnnotationLists(T t, Map<Class<? extends Annotation>, List<T>> map) {
        for (Annotation annotation : t.getAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            List<T> listB = b(map, clsAnnotationType, true);
            if (t.a(listB)) {
                return;
            }
            if (f(clsAnnotationType)) {
                listB.add(0, t);
            } else {
                listB.add(t);
            }
        }
    }

    private static <T> List<T> b(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z) {
        if (!map.containsKey(cls) && z) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    private static Field[] c(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, d);
        return declaredFields;
    }

    private static List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private static <T extends FrameworkMember<T>> Map<Class<? extends Annotation>, List<T>> e(Map<Class<? extends Annotation>, List<T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Class<? extends Annotation>, List<T>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static boolean f(Class<? extends Annotation> cls) {
        return cls.equals(Before.class) || cls.equals(BeforeClass.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((TestClass) obj).a;
    }

    public <T> List<T> getAnnotatedFieldValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkField> it2 = getAnnotatedFields(cls).iterator();
        while (it2.hasNext()) {
            try {
                Object obj2 = it2.next().get(obj);
                if (cls2.isInstance(obj2)) {
                    arrayList.add(cls2.cast(obj2));
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e2);
            }
        }
        return arrayList;
    }

    public List<FrameworkField> getAnnotatedFields() {
        return a(this.c);
    }

    public <T> List<T> getAnnotatedMethodValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        for (FrameworkMethod frameworkMethod : getAnnotatedMethods(cls)) {
            try {
                if (cls2.isAssignableFrom(frameworkMethod.getReturnType())) {
                    arrayList.add(cls2.cast(frameworkMethod.invokeExplosively(obj, new Object[0])));
                }
            } catch (Throwable th) {
                throw new RuntimeException("Exception in " + frameworkMethod.getName(), th);
            }
        }
        return arrayList;
    }

    public List<FrameworkMethod> getAnnotatedMethods() {
        List<FrameworkMethod> listA = a(this.b);
        Collections.sort(listA, e);
        return listA;
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Class<?> cls2 = this.a;
        if (cls2 == null) {
            return null;
        }
        return (T) cls2.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        Class<?> cls = this.a;
        return cls == null ? new Annotation[0] : cls.getAnnotations();
    }

    public Class<?> getJavaClass() {
        return this.a;
    }

    public String getName() {
        Class<?> cls = this.a;
        return cls == null ? "null" : cls.getName();
    }

    public Constructor<?> getOnlyConstructor() {
        Constructor<?>[] constructors = this.a.getConstructors();
        Assert.assertEquals(1L, constructors.length);
        return constructors[0];
    }

    public int hashCode() {
        Class<?> cls = this.a;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    public boolean isANonStaticInnerClass() {
        return this.a.isMemberClass() && !Modifier.isStatic(this.a.getModifiers());
    }

    public boolean isPublic() {
        return Modifier.isPublic(this.a.getModifiers());
    }

    public void scanAnnotatedMembers(Map<Class<? extends Annotation>, List<FrameworkMethod>> map, Map<Class<? extends Annotation>, List<FrameworkField>> map2) {
        for (Class<?> cls : d(this.a)) {
            for (Method method : MethodSorter.getDeclaredMethods(cls)) {
                addToAnnotationLists(new FrameworkMethod(method), map);
            }
            for (Field field : c(cls)) {
                addToAnnotationLists(new FrameworkField(field), map2);
            }
        }
    }

    public List<FrameworkField> getAnnotatedFields(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(b(this.c, cls, false));
    }

    public List<FrameworkMethod> getAnnotatedMethods(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(b(this.b, cls, false));
    }
}
