package io.sentry.transport;

import java.net.Authenticator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f21864a = new m();

    public static m a() {
        return f21864a;
    }

    public void b(@NotNull Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
