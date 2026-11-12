package org.hamcrest.core;

import java.util.ArrayList;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

/* JADX INFO: loaded from: classes23.dex */
public class CombinableMatcher<T> extends TypeSafeDiagnosingMatcher<T> {
    private final Matcher<? super T> c;

    public static final class CombinableBothMatcher<X> {
        private final Matcher<? super X> a;

        public CombinableBothMatcher(Matcher<? super X> matcher) {
            this.a = matcher;
        }

        public CombinableMatcher<X> and(Matcher<? super X> matcher) {
            return new CombinableMatcher(this.a).and(matcher);
        }
    }

    public static final class CombinableEitherMatcher<X> {
        private final Matcher<? super X> a;

        public CombinableEitherMatcher(Matcher<? super X> matcher) {
            this.a = matcher;
        }

        public CombinableMatcher<X> or(Matcher<? super X> matcher) {
            return new CombinableMatcher(this.a).or(matcher);
        }
    }

    public CombinableMatcher(Matcher<? super T> matcher) {
        this.c = matcher;
    }

    private ArrayList<Matcher<? super T>> a(Matcher<? super T> matcher) {
        ArrayList<Matcher<? super T>> arrayList = new ArrayList<>();
        arrayList.add(this.c);
        arrayList.add(matcher);
        return arrayList;
    }

    @Factory
    public static <LHS> CombinableBothMatcher<LHS> both(Matcher<? super LHS> matcher) {
        return new CombinableBothMatcher<>(matcher);
    }

    @Factory
    public static <LHS> CombinableEitherMatcher<LHS> either(Matcher<? super LHS> matcher) {
        return new CombinableEitherMatcher<>(matcher);
    }

    public CombinableMatcher<T> and(Matcher<? super T> matcher) {
        return new CombinableMatcher<>(new AllOf(a(matcher)));
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendDescriptionOf(this.c);
    }

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    public boolean matchesSafely(T t, Description description) {
        if (this.c.matches(t)) {
            return true;
        }
        this.c.describeMismatch(t, description);
        return false;
    }

    public CombinableMatcher<T> or(Matcher<? super T> matcher) {
        return new CombinableMatcher<>(new AnyOf(a(matcher)));
    }
}
