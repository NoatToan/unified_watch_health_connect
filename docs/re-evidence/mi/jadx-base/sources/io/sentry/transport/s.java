package io.sentry.transport;

import defpackage.c8c;
import defpackage.jul;
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements io.sentry.cache.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f21868a = new s();

    public static s e() {
        return f21868a;
    }

    @Override // io.sentry.cache.g
    public void O(@NotNull jul julVar) {
    }

    @Override // io.sentry.cache.g
    public void S(@NotNull jul julVar, @NotNull c8c c8cVar) {
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<jul> iterator() {
        return Collections.emptyIterator();
    }
}
