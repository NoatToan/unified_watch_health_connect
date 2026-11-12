package org.junit.internal.runners.statements;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class InvokeMethod extends Statement {
    private final FrameworkMethod a;
    private final Object b;

    public InvokeMethod(FrameworkMethod frameworkMethod, Object obj) {
        this.a = frameworkMethod;
        this.b = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        this.a.invokeExplosively(this.b, new Object[0]);
    }
}
