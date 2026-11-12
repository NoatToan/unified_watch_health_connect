package defpackage;

import io.sentry.protocol.q;
import io.sentry.util.p;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class kvl {

    @Nullable
    public static volatile kvl c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f24342a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<q> f24343b = new CopyOnWriteArraySet();

    @NotNull
    public static kvl c() {
        if (c == null) {
            synchronized (kvl.class) {
                try {
                    if (c == null) {
                        c = new kvl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a(@NotNull String str) {
        p.c(str, "integration is required.");
        this.f24342a.add(str);
    }

    public void b(@NotNull String str, @NotNull String str2) {
        p.c(str, "name is required.");
        p.c(str2, "version is required.");
        this.f24343b.add(new q(str, str2));
    }

    @NotNull
    public Set<String> d() {
        return this.f24342a;
    }

    @NotNull
    public Set<q> e() {
        return this.f24343b;
    }
}
