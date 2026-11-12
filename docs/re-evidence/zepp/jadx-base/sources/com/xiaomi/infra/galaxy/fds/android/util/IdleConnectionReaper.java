package com.xiaomi.infra.galaxy.fds.android.util;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionManager;

/* JADX INFO: loaded from: classes22.dex */
public final class IdleConnectionReaper extends Thread {
    private static final int b = 60000;
    private final ClientConnectionManager a;

    public IdleConnectionReaper(ClientConnectionManager clientConnectionManager) {
        super("java-sdk-http-connection-reaper");
        this.a = clientConnectionManager;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000L);
                this.a.closeIdleConnections(60L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
