package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class ClassRoadie {
    private RunNotifier a;
    private TestClass b;
    private Description c;
    private final Runnable d;

    public ClassRoadie(RunNotifier runNotifier, TestClass testClass, Description description, Runnable runnable) {
        this.a = runNotifier;
        this.b = testClass;
        this.c = description;
        this.d = runnable;
    }

    private void a() {
        Iterator<Method> it2 = this.b.a().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().invoke(null, new Object[0]);
            } catch (InvocationTargetException e) {
                addFailure(e.getTargetException());
            } catch (Throwable th) {
                addFailure(th);
            }
        }
    }

    private void b() throws a {
        try {
            try {
                Iterator<Method> it2 = this.b.b().iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(null, new Object[0]);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new a();
        } catch (Throwable th) {
            addFailure(th);
            throw new a();
        }
    }

    public void addFailure(Throwable th) {
        this.a.fireTestFailure(new Failure(this.c, th));
    }

    public void runProtected() {
        try {
            b();
            runUnprotected();
        } catch (a unused) {
        } finally {
            a();
        }
    }

    public void runUnprotected() {
        this.d.run();
    }
}
