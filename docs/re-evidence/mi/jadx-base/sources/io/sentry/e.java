package io.sentry;

import defpackage.ae8;
import defpackage.c8c;
import defpackage.dm1;
import defpackage.idi;
import defpackage.qyc;
import defpackage.wzc;
import io.sentry.protocol.Contexts;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface e {
    void a(@NotNull String str, @NotNull String str2);

    @ApiStatus.Internal
    @NotNull
    Queue<a> b();

    @ApiStatus.Internal
    void c(@NotNull io.sentry.protocol.p pVar);

    void clear();

    @NotNull
    /* JADX INFO: renamed from: clone */
    e m881clone();

    @Nullable
    Session d(@NotNull m.b bVar);

    @ApiStatus.Internal
    @NotNull
    Map<String, String> e();

    @NotNull
    Contexts f();

    @Nullable
    io.sentry.protocol.y g();

    @ApiStatus.Internal
    @NotNull
    Map<String, Object> getExtras();

    @Nullable
    SentryLevel getLevel();

    @Nullable
    io.sentry.protocol.k getRequest();

    @Nullable
    qyc getSpan();

    void h();

    @ApiStatus.Internal
    @Nullable
    Session i();

    @Nullable
    wzc j();

    @Nullable
    m.d k();

    @ApiStatus.Internal
    @NotNull
    io.sentry.protocol.p l();

    @ApiStatus.Internal
    void m(@Nullable String str);

    @Nullable
    Session n();

    void o(@NotNull a aVar, @Nullable c8c c8cVar);

    void p(@Nullable wzc wzcVar);

    @NotNull
    List<ae8> q();

    @ApiStatus.Internal
    @Nullable
    String r();

    @ApiStatus.Internal
    @NotNull
    List<String> s();

    @Nullable
    String t();

    @ApiStatus.Internal
    void u(@NotNull idi idiVar);

    @ApiStatus.Internal
    @NotNull
    idi v();

    @NotNull
    List<dm1> w();

    @ApiStatus.Internal
    @NotNull
    idi x(@NotNull m.a aVar);

    @ApiStatus.Internal
    void y(@NotNull m.c cVar);
}
