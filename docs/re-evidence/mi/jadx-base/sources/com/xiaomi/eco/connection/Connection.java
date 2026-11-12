package com.xiaomi.eco.connection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/eco/connection/Connection;", "", "connect", "", "reset", "", "needCallback", "from", "", "isConnect", "needKeepAlive", "disconnect", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Connection {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
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
    }

    void connect(boolean reset, boolean needCallback, int from);

    void disconnect();

    boolean isConnect();

    boolean needKeepAlive();
}
