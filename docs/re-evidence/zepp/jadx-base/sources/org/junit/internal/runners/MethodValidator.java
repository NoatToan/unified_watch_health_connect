package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class MethodValidator {
    private final List<Throwable> a = new ArrayList();
    private TestClass b;

    public MethodValidator(TestClass testClass) {
        this.b = testClass;
    }

    private void a(Class<? extends Annotation> cls, boolean z) {
        for (Method method : this.b.getAnnotatedMethods(cls)) {
            if (Modifier.isStatic(method.getModifiers()) != z) {
                String str = z ? "should" : "should not";
                this.a.add(new Exception("Method " + method.getName() + "() " + str + " be static"));
            }
            if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                this.a.add(new Exception("Class " + method.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(method.getModifiers())) {
                this.a.add(new Exception("Method " + method.getName() + " should be public"));
            }
            if (method.getReturnType() != Void.TYPE) {
                this.a.add(new Exception("Method " + method.getName() + " should be void"));
            }
            if (method.getParameterTypes().length != 0) {
                this.a.add(new Exception("Method " + method.getName() + " should have no parameters"));
            }
        }
    }

    public void assertValid() throws InitializationError {
        if (!this.a.isEmpty()) {
            throw new InitializationError(this.a);
        }
    }

    public void validateInstanceMethods() {
        a(After.class, false);
        a(Before.class, false);
        a(Test.class, false);
        if (this.b.getAnnotatedMethods(Test.class).size() == 0) {
            this.a.add(new Exception("No runnable methods"));
        }
    }

    public List<Throwable> validateMethodsForDefaultRunner() {
        validateNoArgConstructor();
        validateStaticMethods();
        validateInstanceMethods();
        return this.a;
    }

    public void validateNoArgConstructor() {
        try {
            this.b.getConstructor();
        } catch (Exception e) {
            this.a.add(new Exception("Test class should have public zero-argument constructor", e));
        }
    }

    public void validateStaticMethods() {
        a(BeforeClass.class, true);
        a(AfterClass.class, true);
    }
}
