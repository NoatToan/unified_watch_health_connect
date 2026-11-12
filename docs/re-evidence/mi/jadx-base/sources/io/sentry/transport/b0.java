package io.sentry.transport;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {

    public static final class b extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21848a;

        public b(int i) {
            super();
            this.f21848a = i;
        }

        @Override // io.sentry.transport.b0
        public int c() {
            return this.f21848a;
        }

        @Override // io.sentry.transport.b0
        public boolean d() {
            return false;
        }
    }

    public static final class c extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f21849a = new c();

        public c() {
            super();
        }

        @Override // io.sentry.transport.b0
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.b0
        public boolean d() {
            return true;
        }
    }

    public b0() {
    }

    @NotNull
    public static b0 a() {
        return b(-1);
    }

    @NotNull
    public static b0 b(int i) {
        return new b(i);
    }

    @NotNull
    public static b0 e() {
        return c.f21849a;
    }

    public abstract int c();

    public abstract boolean d();
}
