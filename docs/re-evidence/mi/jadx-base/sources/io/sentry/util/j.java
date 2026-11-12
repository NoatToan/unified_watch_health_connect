package io.sentry.util;

import defpackage.c8c;
import io.sentry.ILogger;
import io.sentry.hints.EventDropReason;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class j {

    @FunctionalInterface
    public interface a<T> {
        void accept(@NotNull T t);
    }

    @FunctionalInterface
    public interface b {
        void a(@Nullable Object obj, @NotNull Class<?> cls);
    }

    @FunctionalInterface
    public interface c<T> {
        void accept(@Nullable T t);
    }

    public static c8c e(Object obj) {
        c8c c8cVar = new c8c();
        t(c8cVar, obj);
        return c8cVar;
    }

    @Nullable
    public static EventDropReason f(@NotNull c8c c8cVar) {
        return (EventDropReason) c8cVar.e("sentry:eventDropReason", EventDropReason.class);
    }

    @Nullable
    public static Object g(@NotNull c8c c8cVar) {
        return c8cVar.d("sentry:typeCheckHint");
    }

    public static boolean h(@NotNull c8c c8cVar, @NotNull Class<?> cls) {
        return cls.isInstance(g(c8cVar));
    }

    public static boolean i(@NotNull c8c c8cVar) {
        return Boolean.TRUE.equals(c8cVar.e("sentry:isFromHybridSdk", Boolean.class));
    }

    public static /* synthetic */ void j(Object obj) {
    }

    public static /* synthetic */ void l(Object obj, Class cls) {
    }

    public static <T> void n(@NotNull c8c c8cVar, @NotNull Class<T> cls, final c<Object> cVar) {
        p(c8cVar, cls, new a() { // from class: io.sentry.util.h
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                j.j(obj);
            }
        }, new b() { // from class: io.sentry.util.i
            @Override // io.sentry.util.j.b
            public final void a(Object obj, Class cls2) {
                cVar.accept(obj);
            }
        });
    }

    public static <T> void o(@NotNull c8c c8cVar, @NotNull Class<T> cls, a<T> aVar) {
        p(c8cVar, cls, aVar, new b() { // from class: io.sentry.util.f
            @Override // io.sentry.util.j.b
            public final void a(Object obj, Class cls2) {
                j.l(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void p(@NotNull c8c c8cVar, @NotNull Class<T> cls, a<T> aVar, b bVar) {
        Object objG = g(c8cVar);
        if (!h(c8cVar, cls) || objG == null) {
            bVar.a(objG, cls);
        } else {
            aVar.accept(objG);
        }
    }

    public static <T> void q(@NotNull c8c c8cVar, @NotNull Class<T> cls, final ILogger iLogger, a<T> aVar) {
        p(c8cVar, cls, aVar, new b() { // from class: io.sentry.util.g
            @Override // io.sentry.util.j.b
            public final void a(Object obj, Class cls2) {
                n.a(cls2, obj, iLogger);
            }
        });
    }

    public static void r(@NotNull c8c c8cVar, @NotNull EventDropReason eventDropReason) {
        c8cVar.l("sentry:eventDropReason", eventDropReason);
    }

    public static void s(@NotNull c8c c8cVar, @NotNull String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            c8cVar.l("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void t(@NotNull c8c c8cVar, Object obj) {
        c8cVar.l("sentry:typeCheckHint", obj);
    }

    public static boolean u(@NotNull c8c c8cVar) {
        return !(h(c8cVar, io.sentry.hints.e.class) || h(c8cVar, io.sentry.hints.c.class)) || h(c8cVar, io.sentry.hints.b.class);
    }
}
