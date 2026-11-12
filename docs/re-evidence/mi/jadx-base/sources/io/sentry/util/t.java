package io.sentry.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f21898a = new b();

    public static class b extends ThreadLocal<Random> {
        public b() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @NotNull
    public static Random a() {
        return f21898a.get();
    }
}
