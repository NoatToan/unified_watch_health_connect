package org.junit.internal.runners.model;

import java.util.Iterator;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes23.dex */
public class EachTestNotifier {
    private final RunNotifier a;
    private final Description b;

    public EachTestNotifier(RunNotifier runNotifier, Description description) {
        this.a = runNotifier;
        this.b = description;
    }

    private void a(org.junit.runners.model.MultipleFailureException multipleFailureException) {
        Iterator<Throwable> it2 = multipleFailureException.getFailures().iterator();
        while (it2.hasNext()) {
            addFailure(it2.next());
        }
    }

    public void addFailedAssumption(AssumptionViolatedException assumptionViolatedException) {
        this.a.fireTestAssumptionFailed(new Failure(this.b, assumptionViolatedException));
    }

    public void addFailure(Throwable th) {
        if (th instanceof org.junit.runners.model.MultipleFailureException) {
            a((org.junit.runners.model.MultipleFailureException) th);
        } else {
            this.a.fireTestFailure(new Failure(this.b, th));
        }
    }

    public void fireTestFinished() {
        this.a.fireTestFinished(this.b);
    }

    public void fireTestIgnored() {
        this.a.fireTestIgnored(this.b);
    }

    public void fireTestStarted() {
        this.a.fireTestStarted(this.b);
    }
}
