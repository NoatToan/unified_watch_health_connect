package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public interface IConnectionStatusProvider {

    public enum ConnectionStatus {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface a {
        void onConnectionStatusChanged(@NotNull ConnectionStatus connectionStatus);
    }

    @Nullable
    String a();

    @NotNull
    ConnectionStatus b();

    void c(@NotNull a aVar);

    boolean d(@NotNull a aVar);
}
