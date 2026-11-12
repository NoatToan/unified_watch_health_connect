package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.matchers.JUnitMatchers;

/* JADX INFO: loaded from: classes23.dex */
class a {
    private final List<Matcher<?>> a = new ArrayList();

    private Matcher<Throwable> b() {
        return this.a.size() == 1 ? d(this.a.get(0)) : CoreMatchers.allOf(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Matcher<Throwable> d(Matcher<?> matcher) {
        return matcher;
    }

    private List<Matcher<? super Throwable>> e() {
        return new ArrayList(this.a);
    }

    public void a(Matcher<?> matcher) {
        this.a.add(matcher);
    }

    public Matcher<Throwable> c() {
        return JUnitMatchers.isThrowable(b());
    }

    public boolean f() {
        return !this.a.isEmpty();
    }
}
