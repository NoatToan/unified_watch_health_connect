package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f21872b;

    public v(@NotNull String str, @NotNull String str2) {
        this.f21871a = (String) io.sentry.util.p.c(str, "user is required");
        this.f21872b = (String) io.sentry.util.p.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    @Nullable
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f21871a, this.f21872b.toCharArray());
        }
        return null;
    }
}
