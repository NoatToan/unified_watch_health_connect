package org.apache.commons.io.serialization;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
final class b implements ClassNameMatcher {
    private final Pattern a;

    public b(String str) {
        this(Pattern.compile(str));
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.a.matcher(str).matches();
    }

    public b(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Null pattern");
        }
        this.a = pattern;
    }
}
