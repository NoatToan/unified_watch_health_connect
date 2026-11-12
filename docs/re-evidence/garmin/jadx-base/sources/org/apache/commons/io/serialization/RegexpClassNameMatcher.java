package org.apache.commons.io.serialization;

import java.util.regex.Pattern;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
final class RegexpClassNameMatcher implements ClassNameMatcher {
    private final Pattern pattern;

    public RegexpClassNameMatcher(Pattern pattern) {
        if (pattern != null) {
            this.pattern = pattern;
        } else {
            h.s("Null pattern");
            throw null;
        }
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.pattern.matcher(str).matches();
    }

    public RegexpClassNameMatcher(String str) {
        this(Pattern.compile(str));
    }
}
