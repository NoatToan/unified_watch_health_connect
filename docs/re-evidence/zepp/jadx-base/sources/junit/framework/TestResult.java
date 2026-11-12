package junit.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class TestResult {
    public List<TestFailure> fFailures = new ArrayList();
    public List<TestFailure> fErrors = new ArrayList();
    public List<TestListener> fListeners = new ArrayList();
    public int fRunTests = 0;
    private boolean a = false;

    public class a implements Protectable {
        public final /* synthetic */ TestCase a;

        public a(TestCase testCase) throws Throwable {
            this.a = testCase;
        }

        @Override // junit.framework.Protectable
        public void protect() throws Throwable {
            this.a.runBare();
        }
    }

    private synchronized List<TestListener> a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.fListeners);
        return arrayList;
    }

    public synchronized void addError(Test test, Throwable th) {
        this.fErrors.add(new TestFailure(test, th));
        Iterator<TestListener> it2 = a().iterator();
        while (it2.hasNext()) {
            it2.next().addError(test, th);
        }
    }

    public synchronized void addFailure(Test test, AssertionFailedError assertionFailedError) {
        this.fFailures.add(new TestFailure(test, assertionFailedError));
        Iterator<TestListener> it2 = a().iterator();
        while (it2.hasNext()) {
            it2.next().addFailure(test, assertionFailedError);
        }
    }

    public synchronized void addListener(TestListener testListener) {
        this.fListeners.add(testListener);
    }

    public void endTest(Test test) {
        Iterator<TestListener> it2 = a().iterator();
        while (it2.hasNext()) {
            it2.next().endTest(test);
        }
    }

    public synchronized int errorCount() {
        return this.fErrors.size();
    }

    public synchronized Enumeration<TestFailure> errors() {
        return Collections.enumeration(this.fErrors);
    }

    public synchronized int failureCount() {
        return this.fFailures.size();
    }

    public synchronized Enumeration<TestFailure> failures() {
        return Collections.enumeration(this.fFailures);
    }

    public synchronized void removeListener(TestListener testListener) {
        this.fListeners.remove(testListener);
    }

    public void run(TestCase testCase) {
        startTest(testCase);
        runProtected(testCase, new a(testCase));
        endTest(testCase);
    }

    public synchronized int runCount() {
        return this.fRunTests;
    }

    public void runProtected(Test test, Protectable protectable) {
        try {
            protectable.protect();
        } catch (ThreadDeath e) {
            throw e;
        } catch (AssertionFailedError e2) {
            addFailure(test, e2);
        } catch (Throwable th) {
            addError(test, th);
        }
    }

    public synchronized boolean shouldStop() {
        return this.a;
    }

    public void startTest(Test test) {
        int iCountTestCases = test.countTestCases();
        synchronized (this) {
            this.fRunTests += iCountTestCases;
        }
        Iterator<TestListener> it2 = a().iterator();
        while (it2.hasNext()) {
            it2.next().startTest(test);
        }
    }

    public synchronized void stop() {
        this.a = true;
    }

    public synchronized boolean wasSuccessful() {
        return failureCount() == 0 && errorCount() == 0;
    }
}
