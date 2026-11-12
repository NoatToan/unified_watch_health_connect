package org.junit.rules;

import java.util.Iterator;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class RunRules extends Statement {
    private final Statement a;

    public RunRules(Statement statement, Iterable<TestRule> iterable, Description description) {
        this.a = a(statement, iterable, description);
    }

    private static Statement a(Statement statement, Iterable<TestRule> iterable, Description description) {
        Iterator<TestRule> it2 = iterable.iterator();
        while (it2.hasNext()) {
            statement = it2.next().apply(statement, description);
        }
        return statement;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        this.a.evaluate();
    }
}
