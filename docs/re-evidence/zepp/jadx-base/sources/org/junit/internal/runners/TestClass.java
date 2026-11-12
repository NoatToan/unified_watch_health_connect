package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class TestClass {
    private final Class<?> a;

    public TestClass(Class<?> cls) {
        this.a = cls;
    }

    private List<Class<?>> c(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private boolean d(Method method, Method method2) {
        if (!method2.getName().equals(method.getName()) || method2.getParameterTypes().length != method.getParameterTypes().length) {
            return false;
        }
        for (int i = 0; i < method2.getParameterTypes().length; i++) {
            if (!method2.getParameterTypes()[i].equals(method.getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean e(Method method, List<Method> list) {
        Iterator<Method> it2 = list.iterator();
        while (it2.hasNext()) {
            if (d(method, it2.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean f(Class<? extends Annotation> cls) {
        return cls.equals(Before.class) || cls.equals(BeforeClass.class);
    }

    public List<Method> a() {
        return getAnnotatedMethods(AfterClass.class);
    }

    public List<Method> b() {
        return getAnnotatedMethods(BeforeClass.class);
    }

    public List<Method> getAnnotatedMethods(Class<? extends Annotation> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it2 = c(this.a).iterator();
        while (it2.hasNext()) {
            for (Method method : MethodSorter.getDeclaredMethods(it2.next())) {
                if (method.getAnnotation(cls) != null && !e(method, arrayList)) {
                    arrayList.add(method);
                }
            }
        }
        if (f(cls)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public Constructor<?> getConstructor() throws NoSuchMethodException, SecurityException {
        return this.a.getConstructor(new Class[0]);
    }

    public Class<?> getJavaClass() {
        return this.a;
    }

    public String getName() {
        return this.a.getName();
    }

    public List<Method> getTestMethods() {
        return getAnnotatedMethods(Test.class);
    }
}
