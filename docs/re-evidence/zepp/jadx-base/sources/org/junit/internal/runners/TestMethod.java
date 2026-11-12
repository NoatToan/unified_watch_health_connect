package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class TestMethod {
    private final Method a;
    private TestClass b;

    public TestMethod(Method method, TestClass testClass) {
        this.a = method;
        this.b = testClass;
    }

    public boolean a() {
        return getExpectedException() != null;
    }

    public List<Method> b() {
        return this.b.getAnnotatedMethods(After.class);
    }

    public List<Method> c() {
        return this.b.getAnnotatedMethods(Before.class);
    }

    public boolean d(Throwable th) {
        return !getExpectedException().isAssignableFrom(th.getClass());
    }

    public Class<? extends Throwable> getExpectedException() {
        Test test = (Test) this.a.getAnnotation(Test.class);
        if (test == null || test.expected() == Test.None.class) {
            return null;
        }
        return test.expected();
    }

    public long getTimeout() {
        Test test = (Test) this.a.getAnnotation(Test.class);
        if (test == null) {
            return 0L;
        }
        return test.timeout();
    }

    public void invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.a.invoke(obj, new Object[0]);
    }

    public boolean isIgnored() {
        return this.a.getAnnotation(Ignore.class) != null;
    }
}
