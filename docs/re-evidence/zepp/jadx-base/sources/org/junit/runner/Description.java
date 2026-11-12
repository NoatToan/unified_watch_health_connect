package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public class Description implements Serializable {
    private static final long serialVersionUID = 1;
    private final Collection<Description> a;
    private final String b;
    private final Serializable c;
    private final Annotation[] d;
    private volatile Class<?> e;
    private static final Pattern f = Pattern.compile("([\\s\\S]*)\\((.*)\\)");
    public static final Description EMPTY = new Description(null, "No Tests", new Annotation[0]);
    public static final Description TEST_MECHANISM = new Description(null, "Test mechanism", new Annotation[0]);

    private Description(Class<?> cls, String str, Annotation... annotationArr) {
        this(cls, str, str, annotationArr);
    }

    private static String a(String str, String str2) {
        return String.format("%s(%s)", str, str2);
    }

    private String b(int i, String str) {
        Matcher matcher = f.matcher(toString());
        return matcher.matches() ? matcher.group(i) : str;
    }

    public static Description createSuiteDescription(String str, Annotation... annotationArr) {
        return new Description(null, str, annotationArr);
    }

    public static Description createTestDescription(String str, String str2, Annotation... annotationArr) {
        return new Description(null, a(str2, str), annotationArr);
    }

    public void addChild(Description description) {
        this.a.add(description);
    }

    public Description childlessCopy() {
        return new Description(this.e, this.b, this.d);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Description) {
            return this.c.equals(((Description) obj).c);
        }
        return false;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : this.d) {
            if (annotation.annotationType().equals(cls)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.d);
    }

    public ArrayList<Description> getChildren() {
        return new ArrayList<>(this.a);
    }

    public String getClassName() {
        return this.e != null ? this.e.getName() : b(2, toString());
    }

    public String getDisplayName() {
        return this.b;
    }

    public String getMethodName() {
        return b(1, null);
    }

    public Class<?> getTestClass() {
        if (this.e != null) {
            return this.e;
        }
        String className = getClassName();
        if (className == null) {
            return null;
        }
        try {
            this.e = Class.forName(className, false, getClass().getClassLoader());
            return this.e;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean isEmpty() {
        return equals(EMPTY);
    }

    public boolean isSuite() {
        return !isTest();
    }

    public boolean isTest() {
        return this.a.isEmpty();
    }

    public int testCount() {
        if (isTest()) {
            return 1;
        }
        int iTestCount = 0;
        Iterator<Description> it2 = this.a.iterator();
        while (it2.hasNext()) {
            iTestCount += it2.next().testCount();
        }
        return iTestCount;
    }

    public String toString() {
        return getDisplayName();
    }

    private Description(Class<?> cls, String str, Serializable serializable, Annotation... annotationArr) {
        this.a = new ConcurrentLinkedQueue();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        }
        if (serializable == null) {
            throw new IllegalArgumentException("The unique id must not be null.");
        }
        this.e = cls;
        this.b = str;
        this.c = serializable;
        this.d = annotationArr;
    }

    public static Description createSuiteDescription(String str, Serializable serializable, Annotation... annotationArr) {
        return new Description(null, str, serializable, annotationArr);
    }

    public static Description createTestDescription(Class<?> cls, String str, Annotation... annotationArr) {
        return new Description(cls, a(str, cls.getName()), annotationArr);
    }

    public static Description createSuiteDescription(Class<?> cls) {
        return new Description(cls, cls.getName(), cls.getAnnotations());
    }

    public static Description createTestDescription(Class<?> cls, String str) {
        return new Description(cls, a(str, cls.getName()), new Annotation[0]);
    }

    public static Description createTestDescription(String str, String str2, Serializable serializable) {
        return new Description(null, a(str2, str), serializable, new Annotation[0]);
    }
}
