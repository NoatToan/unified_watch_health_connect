package defpackage;

import io.sentry.a;
import io.sentry.e;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.p;
import io.sentry.v;
import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface xxc {
    void a(@NotNull String str, @NotNull String str2);

    void b(@NotNull Map<String, String> map);

    void c(@NotNull p pVar);

    void d(@NotNull Collection<a> collection);

    void e(@NotNull Contexts contexts);

    void f(@Nullable v vVar, @NotNull e eVar);

    void g(@Nullable String str);

    void m(@NotNull a aVar);
}
