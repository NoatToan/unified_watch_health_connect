package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class JUnit4ClassRunner extends Runner implements Filterable, Sortable {
    private final List<Method> a = getTestMethods();
    private TestClass b;

    public class a implements Runnable {
        public final /* synthetic */ RunNotifier a;

        public a(RunNotifier runNotifier) {
            this.a = runNotifier;
        }

        @Override // java.lang.Runnable
        public void run() {
            JUnit4ClassRunner.this.runMethods(this.a);
        }
    }

    public class b implements Comparator<Method> {
        public final /* synthetic */ Sorter a;

        public b(Sorter sorter) {
            this.a = sorter;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            return this.a.compare(JUnit4ClassRunner.this.methodDescription(method), JUnit4ClassRunner.this.methodDescription(method2));
        }
    }

    public JUnit4ClassRunner(Class<?> cls) throws InitializationError {
        this.b = new TestClass(cls);
        validate();
    }

    private void a(RunNotifier runNotifier, Description description, Throwable th) {
        runNotifier.fireTestStarted(description);
        runNotifier.fireTestFailure(new Failure(description, th));
        runNotifier.fireTestFinished(description);
    }

    public Annotation[] classAnnotations() {
        return this.b.getJavaClass().getAnnotations();
    }

    public Object createTest() throws Exception {
        return getTestClass().getConstructor().newInstance(new Object[0]);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        Iterator<Method> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (!filter.shouldRun(methodDescription(it2.next()))) {
                it2.remove();
            }
        }
        if (this.a.isEmpty()) {
            throw new NoTestsRemainException();
        }
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(getName(), classAnnotations());
        Iterator<Method> it2 = this.a.iterator();
        while (it2.hasNext()) {
            descriptionCreateSuiteDescription.addChild(methodDescription(it2.next()));
        }
        return descriptionCreateSuiteDescription;
    }

    public String getName() {
        return getTestClass().getName();
    }

    public TestClass getTestClass() {
        return this.b;
    }

    public List<Method> getTestMethods() {
        return this.b.getTestMethods();
    }

    public void invokeTestMethod(Method method, RunNotifier runNotifier) {
        Description descriptionMethodDescription = methodDescription(method);
        try {
            new MethodRoadie(createTest(), wrapMethod(method), runNotifier, descriptionMethodDescription).run();
        } catch (InvocationTargetException e) {
            a(runNotifier, descriptionMethodDescription, e.getCause());
        } catch (Exception e2) {
            a(runNotifier, descriptionMethodDescription, e2);
        }
    }

    public Description methodDescription(Method method) {
        return Description.createTestDescription(getTestClass().getJavaClass(), testName(method), testAnnotations(method));
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        new ClassRoadie(runNotifier, this.b, getDescription(), new a(runNotifier)).runProtected();
    }

    public void runMethods(RunNotifier runNotifier) {
        Iterator<Method> it2 = this.a.iterator();
        while (it2.hasNext()) {
            invokeTestMethod(it2.next(), runNotifier);
        }
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        Collections.sort(this.a, new b(sorter));
    }

    public Annotation[] testAnnotations(Method method) {
        return method.getAnnotations();
    }

    public String testName(Method method) {
        return method.getName();
    }

    public void validate() throws InitializationError {
        MethodValidator methodValidator = new MethodValidator(this.b);
        methodValidator.validateMethodsForDefaultRunner();
        methodValidator.assertValid();
    }

    public TestMethod wrapMethod(Method method) {
        return new TestMethod(method, this.b);
    }
}
