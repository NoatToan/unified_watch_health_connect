package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public abstract class TestWatcher implements TestRule {

    public class a extends Statement {
        public final /* synthetic */ Description a;
        public final /* synthetic */ Statement b;

        public a(Description description, Statement statement) throws Exception {
            this.a = description;
            this.b = statement;
        }

        @Override // org.junit.runners.model.Statement
        public void evaluate() throws Exception {
            ArrayList arrayList = new ArrayList();
            TestWatcher.this.i(this.a, arrayList);
            try {
                try {
                    this.b.evaluate();
                    TestWatcher.this.j(this.a, arrayList);
                } catch (Throwable th) {
                    TestWatcher.this.g(this.a, arrayList);
                    throw th;
                }
            } catch (AssumptionViolatedException e) {
                arrayList.add(e);
                TestWatcher.this.h(e, this.a, arrayList);
            } catch (Throwable th2) {
                arrayList.add(th2);
                TestWatcher.this.f(th2, this.a, arrayList);
            }
            TestWatcher.this.g(this.a, arrayList);
            MultipleFailureException.assertEmpty(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Throwable th, Description description, List<Throwable> list) {
        try {
            failed(th, description);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Description description, List<Throwable> list) {
        try {
            finished(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(AssumptionViolatedException assumptionViolatedException, Description description, List<Throwable> list) {
        try {
            if (assumptionViolatedException instanceof org.junit.AssumptionViolatedException) {
                skipped((org.junit.AssumptionViolatedException) assumptionViolatedException, description);
            } else {
                skipped(assumptionViolatedException, description);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Description description, List<Throwable> list) {
        try {
            starting(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Description description, List<Throwable> list) {
        try {
            succeeded(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return new a(description, statement);
    }

    public void failed(Throwable th, Description description) {
    }

    public void finished(Description description) {
    }

    public void skipped(org.junit.AssumptionViolatedException assumptionViolatedException, Description description) {
        skipped((AssumptionViolatedException) assumptionViolatedException, description);
    }

    @Deprecated
    public void skipped(AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    public void starting(Description description) {
    }

    public void succeeded(Description description) {
    }
}
