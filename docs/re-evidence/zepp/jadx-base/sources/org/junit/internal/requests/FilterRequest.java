package org.junit.internal.requests;

import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;

/* JADX INFO: loaded from: classes23.dex */
public final class FilterRequest extends Request {
    private final Request a;
    private final Filter b;

    public FilterRequest(Request request, Filter filter) {
        this.a = request;
        this.b = filter;
    }

    @Override // org.junit.runner.Request
    public Runner getRunner() {
        try {
            Runner runner = this.a.getRunner();
            this.b.apply(runner);
            return runner;
        } catch (NoTestsRemainException unused) {
            return new ErrorReportingRunner(Filter.class, new Exception(String.format("No tests found matching %s from %s", this.b.describe(), this.a.toString())));
        }
    }
}
