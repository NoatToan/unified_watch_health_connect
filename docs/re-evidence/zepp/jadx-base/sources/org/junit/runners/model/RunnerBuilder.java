package org.junit.runners.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Runner;

/* JADX INFO: loaded from: classes23.dex */
public abstract class RunnerBuilder {
    private final Set<Class<?>> a = new HashSet();

    private List<Runner> c(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            Runner runnerSafeRunnerForClass = safeRunnerForClass(cls);
            if (runnerSafeRunnerForClass != null) {
                arrayList.add(runnerSafeRunnerForClass);
            }
        }
        return arrayList;
    }

    public Class<?> a(Class<?> cls) throws InitializationError {
        if (this.a.add(cls)) {
            return cls;
        }
        throw new InitializationError(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
    }

    public void b(Class<?> cls) {
        this.a.remove(cls);
    }

    public abstract Runner runnerForClass(Class<?> cls) throws Throwable;

    public List<Runner> runners(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        a(cls);
        try {
            return c(clsArr);
        } finally {
            b(cls);
        }
    }

    public Runner safeRunnerForClass(Class<?> cls) {
        try {
            return runnerForClass(cls);
        } catch (Throwable th) {
            return new ErrorReportingRunner(cls, th);
        }
    }

    public List<Runner> runners(Class<?> cls, List<Class<?>> list) throws InitializationError {
        return runners(cls, (Class<?>[]) list.toArray(new Class[0]));
    }
}
