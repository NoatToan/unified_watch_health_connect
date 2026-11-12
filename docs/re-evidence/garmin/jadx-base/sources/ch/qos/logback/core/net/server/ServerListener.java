package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.server.Client;
import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
public interface ServerListener<T extends Client> extends Closeable {
    T acceptClient();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
