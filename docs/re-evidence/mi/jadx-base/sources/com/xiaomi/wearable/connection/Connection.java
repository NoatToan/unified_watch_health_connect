package com.xiaomi.wearable.connection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH&J\u0012\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/wearable/connection/Connection;", "", "connect", "", "reset", "", "needCallback", "from", "", "isConnect", "needKeepAlive", "needRetryConnect", "status", "disconnect", "reconnectMonitor", "callback", "Lcom/xiaomi/wearable/connection/ConnectionCallback;", "getCallback", "()Lcom/xiaomi/wearable/connection/ConnectionCallback;", "setCallback", "(Lcom/xiaomi/wearable/connection/ConnectionCallback;)V", "onBluetoothClose", "onBluetoothOpen", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Connection {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void connect(@NotNull Connection connection, boolean z, boolean z2, int i) {
        }

        public static /* synthetic */ void connect$default(Connection connection, boolean z, boolean z2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
            }
            if ((i2 & 1) != 0) {
                z = false;
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            connection.connect(z, z2, i);
        }

        public static void disconnect(@NotNull Connection connection, boolean z) {
        }

        public static /* synthetic */ void disconnect$default(Connection connection, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            connection.disconnect(z);
        }

        public static void onBluetoothClose(@NotNull Connection connection) {
        }

        public static void onBluetoothOpen(@NotNull Connection connection) {
        }
    }

    void connect();

    void connect(boolean reset, boolean needCallback, int from);

    void disconnect(boolean reconnectMonitor);

    @Nullable
    ConnectionCallback getCallback();

    boolean isConnect();

    boolean needKeepAlive();

    boolean needRetryConnect(int status);

    void onBluetoothClose();

    void onBluetoothOpen();

    void setCallback(@Nullable ConnectionCallback connectionCallback);
}
