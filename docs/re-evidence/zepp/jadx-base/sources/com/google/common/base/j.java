package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class j {
    private static final Logger a = Logger.getLogger(j.class.getName());
    private static final i b = e();

    public static final class b implements i {
        private b() {
        }

        @Override // com.google.common.base.i
        public d a(String str) {
            return new g(Pattern.compile(str));
        }

        @Override // com.google.common.base.i
        public boolean b() {
            return true;
        }
    }

    private j() {
    }

    public static d a(String str) {
        Preconditions.checkNotNull(str);
        return b.a(str);
    }

    public static String b(@NullableDecl String str) {
        if (j(str)) {
            return null;
        }
        return str;
    }

    public static String c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static <T extends Enum<T>> Optional<T> d(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = Enums.a(cls).get(str);
        return weakReference == null ? Optional.absent() : Optional.of(cls.cast(weakReference.get()));
    }

    private static i e() {
        return new b();
    }

    private static void f(ServiceConfigurationError serviceConfigurationError) {
        a.log(Level.WARNING, "Error loading regex compiler, falling back to next option", (Throwable) serviceConfigurationError);
    }

    public static String g(@NullableDecl String str) {
        return str == null ? "" : str;
    }

    public static boolean h() {
        return b.b();
    }

    public static CharMatcher i(CharMatcher charMatcher) {
        return charMatcher.e();
    }

    public static boolean j(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    public static long k() {
        return System.nanoTime();
    }
}
