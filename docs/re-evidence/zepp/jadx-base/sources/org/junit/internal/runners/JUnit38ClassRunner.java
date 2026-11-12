package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import junit.extensions.TestDecorator;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestListener;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.Describable;
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
public class JUnit38ClassRunner extends Runner implements Filterable, Sortable {
    private volatile Test a;

    public static final class b implements TestListener {
        private final RunNotifier a;

        private Description a(Test test) {
            return test instanceof Describable ? ((Describable) test).getDescription() : Description.createTestDescription(b(test), c(test));
        }

        private Class<? extends Test> b(Test test) {
            return test.getClass();
        }

        private String c(Test test) {
            return test instanceof TestCase ? ((TestCase) test).getName() : test.toString();
        }

        @Override // junit.framework.TestListener
        public void addError(Test test, Throwable th) {
            this.a.fireTestFailure(new Failure(a(test), th));
        }

        @Override // junit.framework.TestListener
        public void addFailure(Test test, AssertionFailedError assertionFailedError) {
            addError(test, assertionFailedError);
        }

        @Override // junit.framework.TestListener
        public void endTest(Test test) {
            this.a.fireTestFinished(a(test));
        }

        @Override // junit.framework.TestListener
        public void startTest(Test test) {
            this.a.fireTestStarted(a(test));
        }

        private b(RunNotifier runNotifier) {
            this.a = runNotifier;
        }
    }

    public JUnit38ClassRunner(Class<?> cls) {
        this(new TestSuite(cls.asSubclass(TestCase.class)));
    }

    private static String a(TestSuite testSuite) {
        int iCountTestCases = testSuite.countTestCases();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(iCountTestCases), iCountTestCases == 0 ? "" : String.format(" [example: %s]", testSuite.testAt(0)));
    }

    private static Annotation[] b(TestCase testCase) {
        try {
            return testCase.getClass().getMethod(testCase.getName(), new Class[0]).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private Test c() {
        return this.a;
    }

    private static Description d(Test test) {
        if (test instanceof TestCase) {
            TestCase testCase = (TestCase) test;
            return Description.createTestDescription(testCase.getClass(), testCase.getName(), b(testCase));
        }
        if (!(test instanceof TestSuite)) {
            if (test instanceof Describable) {
                return ((Describable) test).getDescription();
            }
            return test instanceof TestDecorator ? d(((TestDecorator) test).getTest()) : Description.createSuiteDescription(test.getClass());
        }
        TestSuite testSuite = (TestSuite) test;
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(testSuite.getName() == null ? a(testSuite) : testSuite.getName(), new Annotation[0]);
        int iTestCount = testSuite.testCount();
        for (int i = 0; i < iTestCount; i++) {
            descriptionCreateSuiteDescription.addChild(d(testSuite.testAt(i)));
        }
        return descriptionCreateSuiteDescription;
    }

    private void e(Test test) {
        this.a = test;
    }

    public TestListener createAdaptingListener(RunNotifier runNotifier) {
        return new b(runNotifier);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        if (c() instanceof Filterable) {
            ((Filterable) c()).filter(filter);
            return;
        }
        if (c() instanceof TestSuite) {
            TestSuite testSuite = (TestSuite) c();
            TestSuite testSuite2 = new TestSuite(testSuite.getName());
            int iTestCount = testSuite.testCount();
            for (int i = 0; i < iTestCount; i++) {
                Test testTestAt = testSuite.testAt(i);
                if (filter.shouldRun(d(testTestAt))) {
                    testSuite2.addTest(testTestAt);
                }
            }
            e(testSuite2);
            if (testSuite2.testCount() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return d(c());
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        TestResult testResult = new TestResult();
        testResult.addListener(createAdaptingListener(runNotifier));
        c().run(testResult);
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (c() instanceof Sortable) {
            ((Sortable) c()).sort(sorter);
        }
    }

    public JUnit38ClassRunner(Test test) {
        e(test);
    }
}
