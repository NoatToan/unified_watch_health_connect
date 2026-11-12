package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Platform {
    private static final PatternCompiler patternCompiler = loadPatternCompiler();

    private Platform() {
    }

    static CharMatcher precomputeCharMatcher(CharMatcher charMatcher) {
        return charMatcher.precomputedInternal();
    }

    static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = Enums.getEnumConstants(cls).get(str);
        return weakReference == null ? Optional.absent() : Optional.of(cls.cast(weakReference.get()));
    }

    static String formatCompact4Digits(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    static boolean stringIsNullOrEmpty(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }

    static String nullToEmpty(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    @CheckForNull
    static String emptyToNull(@CheckForNull String str) {
        if (stringIsNullOrEmpty(str)) {
            return null;
        }
        return str;
    }

    static CommonPattern compilePattern(String str) {
        Preconditions.checkNotNull(str);
        return patternCompiler.compile(str);
    }

    static boolean patternCompilerIsPcreLike() {
        return patternCompiler.isPcreLike();
    }

    private static PatternCompiler loadPatternCompiler() {
        return new JdkPatternCompiler();
    }

    static final class JdkPatternCompiler implements PatternCompiler {
        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
            return true;
        }

        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public CommonPattern compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }
    }
}
