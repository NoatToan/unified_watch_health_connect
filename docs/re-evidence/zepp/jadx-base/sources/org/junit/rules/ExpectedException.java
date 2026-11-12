package org.junit.rules;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Assert;
import org.junit.internal.matchers.ThrowableCauseMatcher;
import org.junit.internal.matchers.ThrowableMessageMatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class ExpectedException implements TestRule {
    private final org.junit.rules.a a = new org.junit.rules.a();
    private String b = "Expected test to throw %s";

    public class a extends Statement {
        private final Statement a;

        public a(Statement statement) {
            this.a = statement;
        }

        @Override // org.junit.runners.model.Statement
        public void evaluate() throws Throwable {
            try {
                this.a.evaluate();
                if (ExpectedException.this.f()) {
                    ExpectedException.this.d();
                }
            } catch (Throwable th) {
                ExpectedException.this.e(th);
            }
        }
    }

    private ExpectedException() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws AssertionError {
        Assert.fail(g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Throwable th) throws Throwable {
        if (!f()) {
            throw th;
        }
        Assert.assertThat(th, this.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return this.a.f();
    }

    private String g() {
        return String.format(this.b, StringDescription.toString(this.a.c()));
    }

    public static ExpectedException none() {
        return new ExpectedException();
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return new a(statement);
    }

    public void expect(Matcher<?> matcher) {
        this.a.a(matcher);
    }

    public void expectCause(Matcher<? extends Throwable> matcher) {
        expect(ThrowableCauseMatcher.hasCause(matcher));
    }

    public void expectMessage(String str) {
        expectMessage(CoreMatchers.containsString(str));
    }

    @Deprecated
    public ExpectedException handleAssertionErrors() {
        return this;
    }

    @Deprecated
    public ExpectedException handleAssumptionViolatedExceptions() {
        return this;
    }

    public ExpectedException reportMissingExceptionWithMessage(String str) {
        this.b = str;
        return this;
    }

    public void expect(Class<? extends Throwable> cls) {
        expect(CoreMatchers.instanceOf(cls));
    }

    public void expectMessage(Matcher<String> matcher) {
        expect(ThrowableMessageMatcher.hasMessage(matcher));
    }
}
