package defpackage;

import io.sentry.SentryOptions;
import io.sentry.transport.q;
import io.sentry.transport.t;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class kvg implements yzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kvg f24337a = new kvg();

    public static kvg b() {
        return f24337a;
    }

    @Override // defpackage.yzc
    @NotNull
    public q a(@NotNull SentryOptions sentryOptions, @NotNull iok iokVar) {
        return t.a();
    }
}
