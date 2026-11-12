package org.apache.commons.io.serialization;

import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes23.dex */
final class c implements ClassNameMatcher {
    private final String a;

    public c(String str) {
        this.a = str;
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return FilenameUtils.wildcardMatch(str, this.a);
    }
}
