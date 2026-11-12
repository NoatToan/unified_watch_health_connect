package org.hamcrest.core;

import java.lang.reflect.Array;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes23.dex */
public class IsEqual<T> extends BaseMatcher<T> {
    private final Object a;

    public IsEqual(T t) {
        this.a = t;
    }

    private static boolean a(Object obj, Object obj2) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (!d(Array.get(obj, i), Array.get(obj2, i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(Object obj, Object obj2) {
        return Array.getLength(obj) == Array.getLength(obj2);
    }

    private static boolean c(Object obj, Object obj2) {
        return b(obj, obj2) && a(obj, obj2);
    }

    private static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null || !e(obj)) {
            return obj.equals(obj2);
        }
        return e(obj2) && c(obj, obj2);
    }

    private static boolean e(Object obj) {
        return obj.getClass().isArray();
    }

    @Factory
    public static <T> Matcher<T> equalTo(T t) {
        return new IsEqual(t);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendValue(this.a);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return d(obj, this.a);
    }
}
