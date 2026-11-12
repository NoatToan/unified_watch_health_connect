package org.junit.rules;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class TestWatchman implements MethodRule {

    public class a extends Statement {
        public final /* synthetic */ FrameworkMethod a;
        public final /* synthetic */ Statement b;

        public a(FrameworkMethod frameworkMethod, Statement statement) throws Throwable {
            this.a = frameworkMethod;
            this.b = statement;
        }

        @Override // org.junit.runners.model.Statement
        public void evaluate() throws Throwable {
            TestWatchman.this.starting(this.a);
            try {
                try {
                    this.b.evaluate();
                    TestWatchman.this.succeeded(this.a);
                    TestWatchman.this.finished(this.a);
                } catch (Throwable th) {
                    TestWatchman.this.finished(this.a);
                    throw th;
                }
            } catch (AssumptionViolatedException e) {
                throw e;
            } catch (Throwable th2) {
                TestWatchman.this.failed(th2, this.a);
                throw th2;
            }
        }
    }

    @Override // org.junit.rules.MethodRule
    public Statement apply(Statement statement, FrameworkMethod frameworkMethod, Object obj) {
        return new a(frameworkMethod, statement);
    }

    public void failed(Throwable th, FrameworkMethod frameworkMethod) {
    }

    public void finished(FrameworkMethod frameworkMethod) {
    }

    public void starting(FrameworkMethod frameworkMethod) {
    }

    public void succeeded(FrameworkMethod frameworkMethod) {
    }
}
