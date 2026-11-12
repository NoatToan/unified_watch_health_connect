package org.hamcrest;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CustomMatcher<T> extends BaseMatcher<T> {
    private final String a;

    public CustomMatcher(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description should be non null!");
        }
        this.a = str;
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.a);
    }
}
