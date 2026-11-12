package org.junit.runner;

import junit.framework.Test;
import junit.runner.Version;
import org.junit.internal.JUnitSystem;
import org.junit.internal.RealSystem;
import org.junit.internal.TextListener;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes23.dex */
public class JUnitCore {
    private final RunNotifier a = new RunNotifier();

    public static Computer a() {
        return new Computer();
    }

    public static void main(String... strArr) {
        System.exit(!new JUnitCore().b(new RealSystem(), strArr).wasSuccessful() ? 1 : 0);
    }

    public static Result runClasses(Class<?>... clsArr) {
        return runClasses(a(), clsArr);
    }

    public void addListener(RunListener runListener) {
        this.a.addListener(runListener);
    }

    public Result b(JUnitSystem jUnitSystem, String... strArr) {
        jUnitSystem.out().println("JUnit version " + Version.id());
        JUnitCommandLineParseResult jUnitCommandLineParseResultG = JUnitCommandLineParseResult.g(strArr);
        addListener(new TextListener(jUnitSystem));
        return run(jUnitCommandLineParseResultG.c(a()));
    }

    public String getVersion() {
        return Version.id();
    }

    public void removeListener(RunListener runListener) {
        this.a.removeListener(runListener);
    }

    public Result run(Class<?>... clsArr) {
        return run(a(), clsArr);
    }

    public static Result runClasses(Computer computer, Class<?>... clsArr) {
        return new JUnitCore().run(computer, clsArr);
    }

    public Result run(Computer computer, Class<?>... clsArr) {
        return run(Request.classes(computer, clsArr));
    }

    public Result run(Request request) {
        return run(request.getRunner());
    }

    public Result run(Test test) {
        return run(new JUnit38ClassRunner(test));
    }

    public Result run(Runner runner) {
        Result result = new Result();
        RunListener runListenerCreateListener = result.createListener();
        this.a.addFirstListener(runListenerCreateListener);
        try {
            this.a.fireTestRunStarted(runner.getDescription());
            runner.run(this.a);
            this.a.fireTestRunFinished(result);
            return result;
        } finally {
            removeListener(runListenerCreateListener);
        }
    }
}
