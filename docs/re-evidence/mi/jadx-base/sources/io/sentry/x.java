package io.sentry;

import defpackage.cyc;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Deque<a> f21921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ILogger f21922b;

    public x(@NotNull ILogger iLogger, @NotNull a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f21921a = linkedBlockingDeque;
        this.f21922b = (ILogger) io.sentry.util.p.c(iLogger, "logger is required");
        linkedBlockingDeque.push((a) io.sentry.util.p.c(aVar, "rootStackItem is required"));
    }

    @NotNull
    public a a() {
        return this.f21921a.peek();
    }

    public void b(@NotNull a aVar) {
        this.f21921a.push(aVar);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SentryOptions f21923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public volatile cyc f21924b;

        @NotNull
        public volatile e c;

        public a(@NotNull SentryOptions sentryOptions, @NotNull cyc cycVar, @NotNull e eVar) {
            this.f21924b = (cyc) io.sentry.util.p.c(cycVar, "ISentryClient is required.");
            this.c = (e) io.sentry.util.p.c(eVar, "Scope is required.");
            this.f21923a = (SentryOptions) io.sentry.util.p.c(sentryOptions, "Options is required");
        }

        @NotNull
        public cyc a() {
            return this.f21924b;
        }

        @NotNull
        public SentryOptions b() {
            return this.f21923a;
        }

        @NotNull
        public e c() {
            return this.c;
        }

        public a(@NotNull a aVar) {
            this.f21923a = aVar.f21923a;
            this.f21924b = aVar.f21924b;
            this.c = aVar.c.m881clone();
        }
    }

    public x(@NotNull x xVar) {
        this(xVar.f21922b, new a(xVar.f21921a.getLast()));
        Iterator<a> itDescendingIterator = xVar.f21921a.descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            b(new a(itDescendingIterator.next()));
        }
    }
}
