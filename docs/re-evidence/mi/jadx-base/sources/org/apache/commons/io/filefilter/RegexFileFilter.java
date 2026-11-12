package org.apache.commons.io.filefilter;

import defpackage.r00;
import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;

/* JADX INFO: loaded from: classes3.dex */
public class RegexFileFilter extends r00 implements Serializable {
    private final Pattern pattern;

    public RegexFileFilter(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.pattern = Pattern.compile(str);
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }

    public RegexFileFilter(String str, IOCase iOCase) {
        if (str != null) {
            this.pattern = Pattern.compile(str, (iOCase == null || iOCase.isCaseSensitive()) ? 0 : 2);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public RegexFileFilter(String str, int i) {
        if (str != null) {
            this.pattern = Pattern.compile(str, i);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public RegexFileFilter(Pattern pattern) {
        if (pattern != null) {
            this.pattern = pattern;
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }
}
