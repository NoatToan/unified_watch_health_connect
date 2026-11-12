package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile T f21891a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a<T> f21892b;

    public interface a<T> {
        @NotNull
        T a();
    }

    public m(@NotNull a<T> aVar) {
        this.f21892b = aVar;
    }

    @NotNull
    public T a() {
        if (this.f21891a == null) {
            synchronized (this) {
                try {
                    if (this.f21891a == null) {
                        this.f21891a = this.f21892b.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f21891a;
    }

    public void b() {
        synchronized (this) {
            this.f21891a = null;
        }
    }

    public void c(@Nullable T t) {
        synchronized (this) {
            this.f21891a = t;
        }
    }
}
