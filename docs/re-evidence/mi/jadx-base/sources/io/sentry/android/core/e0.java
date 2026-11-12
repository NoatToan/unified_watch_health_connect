package io.sentry.android.core;

import io.sentry.IConnectionStatusProvider;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements io.sentry.transport.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21456a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21457a;

        static {
            int[] iArr = new int[IConnectionStatusProvider.ConnectionStatus.values().length];
            f21457a = iArr;
            try {
                iArr[IConnectionStatusProvider.ConnectionStatus.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21457a[IConnectionStatusProvider.ConnectionStatus.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21457a[IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e0(@NotNull SentryOptions sentryOptions) {
        this.f21456a = sentryOptions;
    }

    @TestOnly
    public boolean a(@NotNull IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        int i = a.f21457a[connectionStatus.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    @Override // io.sentry.transport.r
    public boolean isConnected() {
        return a(this.f21456a.getConnectionStatusProvider().b());
    }
}
