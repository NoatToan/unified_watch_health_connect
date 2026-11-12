package org.junit.runner;

/* JADX INFO: loaded from: classes23.dex */
public final class FilterFactoryParams {
    private final Description a;
    private final String b;

    public FilterFactoryParams(Description description, String str) {
        if (str == null || description == null) {
            throw null;
        }
        this.a = description;
        this.b = str;
    }

    public String getArgs() {
        return this.b;
    }

    public Description getTopLevelDescription() {
        return this.a;
    }
}
