package org.junit.internal;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;
import org.hamcrest.StringDescription;

/* JADX INFO: loaded from: classes23.dex */
public class AssumptionViolatedException extends RuntimeException implements SelfDescribing {
    private static final long serialVersionUID = 2;
    private final String a;
    private final boolean b;
    private final Object c;
    private final Matcher<?> d;

    @Deprecated
    public AssumptionViolatedException(String str, boolean z, Object obj, Matcher<?> matcher) {
        this.a = str;
        this.c = obj;
        this.d = matcher;
        this.b = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        String str = this.a;
        if (str != null) {
            description.appendText(str);
        }
        if (this.b) {
            if (this.a != null) {
                description.appendText(": ");
            }
            description.appendText("got: ");
            description.appendValue(this.c);
            if (this.d != null) {
                description.appendText(", expected: ");
                description.appendDescriptionOf(this.d);
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return StringDescription.asString(this);
    }

    @Deprecated
    public AssumptionViolatedException(Object obj, Matcher<?> matcher) {
        this(null, true, obj, matcher);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Object obj, Matcher<?> matcher) {
        this(str, true, obj, matcher);
    }

    @Deprecated
    public AssumptionViolatedException(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Throwable th) {
        this(str, false, null, null);
        initCause(th);
    }
}
