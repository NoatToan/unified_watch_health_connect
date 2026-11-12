package org.junit.internal.runners.statements;

import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class Fail extends Statement {
    private final Throwable a;

    public Fail(Throwable th) {
        this.a = th;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        throw this.a;
    }
}
