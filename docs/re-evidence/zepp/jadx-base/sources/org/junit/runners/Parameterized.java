package org.junit.runners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Runner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/* JADX INFO: loaded from: classes23.dex */
public class Parameterized extends Suite {
    private static final ParametersRunnerFactory h = new BlockJUnit4ClassRunnerWithParametersFactory();
    private static final List<Runner> i = Collections.emptyList();
    private final List<Runner> g;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        int value() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameters {
        String name() default "{index}";
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UseParametersRunnerFactory {
        Class<? extends ParametersRunnerFactory> value() default BlockJUnit4ClassRunnerWithParametersFactory.class;
    }

    public Parameterized(Class<?> cls) throws Throwable {
        super(cls, i);
        this.g = Collections.unmodifiableList(l(k(), ((Parameters) p().getAnnotation(Parameters.class)).name(), q(cls)));
    }

    private Iterable<Object> k() throws Exception {
        Object objInvokeExplosively = p().invokeExplosively(null, new Object[0]);
        if (objInvokeExplosively instanceof Iterable) {
            return (Iterable) objInvokeExplosively;
        }
        if (objInvokeExplosively instanceof Object[]) {
            return Arrays.asList((Object[]) objInvokeExplosively);
        }
        throw r();
    }

    private List<Runner> l(Iterable<Object> iterable, String str, ParametersRunnerFactory parametersRunnerFactory) throws Exception {
        try {
            List<TestWithParameters> listO = o(iterable, str);
            ArrayList arrayList = new ArrayList();
            Iterator<TestWithParameters> it2 = listO.iterator();
            while (it2.hasNext()) {
                arrayList.add(parametersRunnerFactory.createRunnerForTestWithParameters(it2.next()));
            }
            return arrayList;
        } catch (ClassCastException unused) {
            throw r();
        }
    }

    private TestWithParameters m(String str, int i2, Object obj) {
        return n(getTestClass(), str, i2, obj instanceof Object[] ? (Object[]) obj : new Object[]{obj});
    }

    private static TestWithParameters n(TestClass testClass, String str, int i2, Object[] objArr) {
        return new TestWithParameters("[" + MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i2)), objArr) + "]", testClass, Arrays.asList(objArr));
    }

    private List<TestWithParameters> o(Iterable<Object> iterable, String str) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it2 = iterable.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(m(str, i2, it2.next()));
            i2++;
        }
        return arrayList;
    }

    private FrameworkMethod p() throws Exception {
        for (FrameworkMethod frameworkMethod : getTestClass().getAnnotatedMethods(Parameters.class)) {
            if (frameworkMethod.isStatic() && frameworkMethod.isPublic()) {
                return frameworkMethod;
            }
        }
        throw new Exception("No public static parameters method on class " + getTestClass().getName());
    }

    private ParametersRunnerFactory q(Class<?> cls) throws IllegalAccessException, InstantiationException {
        UseParametersRunnerFactory useParametersRunnerFactory = (UseParametersRunnerFactory) cls.getAnnotation(UseParametersRunnerFactory.class);
        return useParametersRunnerFactory == null ? h : useParametersRunnerFactory.value().newInstance();
    }

    private Exception r() throws Exception {
        return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", getTestClass().getName(), p().getName()));
    }

    @Override // org.junit.runners.Suite, org.junit.runners.ParentRunner
    public List<Runner> getChildren() {
        return this.g;
    }
}
