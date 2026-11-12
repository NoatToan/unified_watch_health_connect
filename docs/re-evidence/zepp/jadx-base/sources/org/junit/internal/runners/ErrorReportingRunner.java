package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes23.dex */
public class ErrorReportingRunner extends Runner {
    private final List<Throwable> a;
    private final Class<?> b;

    public ErrorReportingRunner(Class<?> cls, Throwable th) {
        Objects.requireNonNull(cls, "Test class cannot be null");
        this.b = cls;
        this.a = b(th);
    }

    private Description a(Throwable th) {
        return Description.createTestDescription(this.b, "initializationError");
    }

    private List<Throwable> b(Throwable th) {
        if (th instanceof InvocationTargetException) {
            return b(th.getCause());
        }
        if (th instanceof org.junit.runners.model.InitializationError) {
            return ((org.junit.runners.model.InitializationError) th).getCauses();
        }
        return th instanceof InitializationError ? ((InitializationError) th).getCauses() : Arrays.asList(th);
    }

    private void c(Throwable th, RunNotifier runNotifier) {
        Description descriptionA = a(th);
        runNotifier.fireTestStarted(descriptionA);
        runNotifier.fireTestFailure(new Failure(descriptionA, th));
        runNotifier.fireTestFinished(descriptionA);
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(this.b);
        Iterator<Throwable> it2 = this.a.iterator();
        while (it2.hasNext()) {
            descriptionCreateSuiteDescription.addChild(a(it2.next()));
        }
        return descriptionCreateSuiteDescription;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        Iterator<Throwable> it2 = this.a.iterator();
        while (it2.hasNext()) {
            c(it2.next(), runNotifier);
        }
    }
}
