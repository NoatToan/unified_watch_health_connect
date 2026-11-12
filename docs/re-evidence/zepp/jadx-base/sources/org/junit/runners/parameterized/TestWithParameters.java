package org.junit.runners.parameterized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes23.dex */
public class TestWithParameters {
    private final String a;
    private final TestClass b;
    private final List<Object> c;

    public TestWithParameters(String str, TestClass testClass, List<Object> list) {
        a(str, "The name is missing.");
        a(testClass, "The test class is missing.");
        a(list, "The parameters are missing.");
        this.a = str;
        this.b = testClass;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    private static void a(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestWithParameters testWithParameters = (TestWithParameters) obj;
        return this.a.equals(testWithParameters.a) && this.c.equals(testWithParameters.c) && this.b.equals(testWithParameters.b);
    }

    public String getName() {
        return this.a;
    }

    public List<Object> getParameters() {
        return this.c;
    }

    public TestClass getTestClass() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.a.hashCode() + 14747) * 14747) + this.b.hashCode()) * 14747) + this.c.hashCode();
    }

    public String toString() {
        return this.b.getName() + " '" + this.a + "' with parameters " + this.c;
    }
}
