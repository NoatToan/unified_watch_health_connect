package org.junit.internal.runners.statements;

import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class RunBefores extends Statement {
    private final Statement a;
    private final Object b;
    private final List<FrameworkMethod> c;

    public RunBefores(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.a = statement;
        this.c = list;
        this.b = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        Iterator<FrameworkMethod> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().invokeExplosively(this.b, new Object[0]);
        }
        this.a.evaluate();
    }
}
