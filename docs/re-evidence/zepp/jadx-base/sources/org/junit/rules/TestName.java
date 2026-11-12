package org.junit.rules;

import org.junit.runner.Description;

/* JADX INFO: loaded from: classes23.dex */
public class TestName extends TestWatcher {
    private String a;

    public String getMethodName() {
        return this.a;
    }

    @Override // org.junit.rules.TestWatcher
    public void starting(Description description) {
        this.a = description.getMethodName();
    }
}
