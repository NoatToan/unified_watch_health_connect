package org.hamcrest;

import org.hamcrest.internal.ReflectiveTypeFinder;

/* JADX INFO: loaded from: classes23.dex */
public abstract class FeatureMatcher<T, U> extends TypeSafeDiagnosingMatcher<T> {
    private static final ReflectiveTypeFinder f = new ReflectiveTypeFinder("featureValueOf", 1, 0);
    private final Matcher<? super U> c;
    private final String d;
    private final String e;

    public FeatureMatcher(Matcher<? super U> matcher, String str, String str2) {
        super(f);
        this.c = matcher;
        this.d = str;
        this.e = str2;
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.d).appendText(" ").appendDescriptionOf(this.c);
    }

    public abstract U featureValueOf(T t);

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    public boolean matchesSafely(T t, Description description) {
        U uFeatureValueOf = featureValueOf(t);
        if (this.c.matches(uFeatureValueOf)) {
            return true;
        }
        description.appendText(this.e).appendText(" ");
        this.c.describeMismatch(uFeatureValueOf, description);
        return false;
    }
}
