package org.junit.internal.runners.statements;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class ExpectException extends Statement {
    private final Statement a;
    private final Class<? extends Throwable> b;

    public ExpectException(Statement statement, Class<? extends Throwable> cls) {
        this.a = statement;
        this.b = cls;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Exception {
        boolean z;
        try {
            this.a.evaluate();
            z = true;
        } catch (AssumptionViolatedException e) {
            throw e;
        } catch (Throwable th) {
            if (!this.b.isAssignableFrom(th.getClass())) {
                throw new Exception("Unexpected exception, expected<" + this.b.getName() + "> but was<" + th.getClass().getName() + SearchCriteria.GT, th);
            }
            z = false;
        }
        if (z) {
            throw new AssertionError("Expected exception: " + this.b.getName());
        }
    }
}
