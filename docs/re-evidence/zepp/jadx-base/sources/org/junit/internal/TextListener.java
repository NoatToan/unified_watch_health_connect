package org.junit.internal;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import org.cybergarage.soap.SOAP;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes23.dex */
public class TextListener extends RunListener {
    private final PrintStream a;

    public TextListener(JUnitSystem jUnitSystem) {
        this(jUnitSystem.out());
    }

    private PrintStream a() {
        return this.a;
    }

    public String elapsedTimeAsString(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    public void printFailure(Failure failure, String str) {
        a().println(str + ") " + failure.getTestHeader());
        a().print(failure.getTrace());
    }

    public void printFailures(Result result) {
        List<Failure> failures = result.getFailures();
        if (failures.size() == 0) {
            return;
        }
        int i = 1;
        if (failures.size() == 1) {
            a().println("There was " + failures.size() + " failure:");
        } else {
            a().println("There were " + failures.size() + " failures:");
        }
        Iterator<Failure> it2 = failures.iterator();
        while (it2.hasNext()) {
            printFailure(it2.next(), "" + i);
            i++;
        }
    }

    public void printFooter(Result result) {
        if (result.wasSuccessful()) {
            a().println();
            a().print("OK");
            PrintStream printStreamA = a();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(result.getRunCount());
            sb.append(" test");
            sb.append(result.getRunCount() == 1 ? "" : SOAP.XMLNS);
            sb.append(")");
            printStreamA.println(sb.toString());
        } else {
            a().println();
            a().println("FAILURES!!!");
            a().println("Tests run: " + result.getRunCount() + ",  Failures: " + result.getFailureCount());
        }
        a().println();
    }

    public void printHeader(long j) {
        a().println();
        a().println("Time: " + elapsedTimeAsString(j));
    }

    @Override // org.junit.runner.notification.RunListener
    public void testFailure(Failure failure) {
        this.a.append('E');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testIgnored(Description description) {
        this.a.append('I');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testRunFinished(Result result) {
        printHeader(result.getRunTime());
        printFailures(result);
        printFooter(result);
    }

    @Override // org.junit.runner.notification.RunListener
    public void testStarted(Description description) {
        this.a.append('.');
    }

    public TextListener(PrintStream printStream) {
        this.a = printStream;
    }
}
