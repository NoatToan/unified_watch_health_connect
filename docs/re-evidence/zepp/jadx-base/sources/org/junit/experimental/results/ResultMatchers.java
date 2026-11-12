package org.junit.experimental.results;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/* JADX INFO: loaded from: classes23.dex */
public class ResultMatchers {

    public static class a extends TypeSafeMatcher<PrintableResult> {
        public final /* synthetic */ int c;

        public a(int i) {
            this.c = i;
        }

        @Override // org.hamcrest.TypeSafeMatcher
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean matchesSafely(PrintableResult printableResult) {
            return printableResult.failureCount() == this.c;
        }

        @Override // org.hamcrest.SelfDescribing
        public void describeTo(Description description) {
            description.appendText("has " + this.c + " failures");
        }
    }

    public static class b extends BaseMatcher<Object> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // org.hamcrest.SelfDescribing
        public void describeTo(Description description) {
            description.appendText("has single failure containing " + this.a);
        }

        @Override // org.hamcrest.Matcher
        public boolean matches(Object obj) {
            return obj.toString().contains(this.a) && ResultMatchers.failureCountIs(1).matches(obj);
        }
    }

    public static class c extends BaseMatcher<PrintableResult> {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // org.hamcrest.SelfDescribing
        public void describeTo(Description description) {
            description.appendText("has failure containing " + this.a);
        }

        @Override // org.hamcrest.Matcher
        public boolean matches(Object obj) {
            return obj.toString().contains(this.a);
        }
    }

    public static Matcher<PrintableResult> failureCountIs(int i) {
        return new a(i);
    }

    public static Matcher<PrintableResult> hasFailureContaining(String str) {
        return new c(str);
    }

    public static Matcher<Object> hasSingleFailureContaining(String str) {
        return new b(str);
    }

    public static Matcher<PrintableResult> isSuccessful() {
        return failureCountIs(0);
    }
}
