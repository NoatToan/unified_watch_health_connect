package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ExternalResource implements TestRule {

    public class a extends Statement {
        public final /* synthetic */ Statement a;

        public a(Statement statement) throws Throwable {
            this.a = statement;
        }

        @Override // org.junit.runners.model.Statement
        public void evaluate() throws Throwable {
            ExternalResource.this.before();
            try {
                this.a.evaluate();
            } finally {
                ExternalResource.this.after();
            }
        }
    }

    private Statement a(Statement statement) {
        return new a(statement);
    }

    public void after() {
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return a(statement);
    }

    public void before() throws Throwable {
    }
}
