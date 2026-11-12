package org.hamcrest;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Condition<T> {
    public static final c<Object> NOT_MATCHED = new c<>();

    public interface Step<I, O> {
        Condition<O> apply(I i, Description description);
    }

    public static final class b<T> extends Condition<T> {
        private final T a;
        private final Description b;

        @Override // org.hamcrest.Condition
        public <U> Condition<U> and(Step<? super T, U> step) {
            return step.apply(this.a, this.b);
        }

        @Override // org.hamcrest.Condition
        public boolean matching(Matcher<T> matcher, String str) {
            if (matcher.matches(this.a)) {
                return true;
            }
            this.b.appendText(str);
            matcher.describeMismatch(this.a, this.b);
            return false;
        }

        private b(T t, Description description) {
            super();
            this.a = t;
            this.b = description;
        }
    }

    public static final class c<T> extends Condition<T> {
        private c() {
            super();
        }

        @Override // org.hamcrest.Condition
        public <U> Condition<U> and(Step<? super T, U> step) {
            return Condition.notMatched();
        }

        @Override // org.hamcrest.Condition
        public boolean matching(Matcher<T> matcher, String str) {
            return false;
        }
    }

    public static <T> Condition<T> matched(T t, Description description) {
        return new b(t, description);
    }

    public static <T> Condition<T> notMatched() {
        return NOT_MATCHED;
    }

    public abstract <U> Condition<U> and(Step<? super T, U> step);

    public final boolean matching(Matcher<T> matcher) {
        return matching(matcher, "");
    }

    public abstract boolean matching(Matcher<T> matcher, String str);

    public final <U> Condition<U> then(Step<? super T, U> step) {
        return and(step);
    }

    private Condition() {
    }
}
