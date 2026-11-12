package org.java_websocket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractWebSocket extends WebSocketAdapter {
    private static final Logger h = LoggerFactory.getLogger((Class<?>) AbstractWebSocket.class);
    private boolean a;
    private boolean b;
    private Timer c;
    private TimerTask d;
    private int e = 60;
    private boolean f = false;
    private final Object g = new Object();

    public class a extends TimerTask {
        private ArrayList<WebSocket> a = new ArrayList<>();

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.clear();
            try {
                this.a.addAll(AbstractWebSocket.this.getConnections());
                long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (AbstractWebSocket.this.e * 1500));
                Iterator<WebSocket> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    AbstractWebSocket.this.d(it2.next(), jCurrentTimeMillis);
                }
            } catch (Exception unused) {
            }
            this.a.clear();
        }
    }

    private void c() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
        TimerTask timerTask = this.d;
        if (timerTask != null) {
            timerTask.cancel();
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(WebSocket webSocket, long j) {
        if (webSocket instanceof WebSocketImpl) {
            WebSocketImpl webSocketImpl = (WebSocketImpl) webSocket;
            if (webSocketImpl.f() < j) {
                h.trace("Closing connection due to no pong received: {}", webSocketImpl);
                webSocketImpl.closeConnection(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (webSocketImpl.isOpen()) {
                webSocketImpl.sendPing();
            } else {
                h.trace("Trying to ping a non open connection: {}", webSocketImpl);
            }
        }
    }

    private void e() {
        c();
        this.c = new Timer("WebSocketTimer");
        a aVar = new a();
        this.d = aVar;
        Timer timer = this.c;
        int i = this.e;
        timer.scheduleAtFixedRate(aVar, ((long) i) * 1000, 1000 * ((long) i));
    }

    public int getConnectionLostTimeout() {
        int i;
        synchronized (this.g) {
            i = this.e;
        }
        return i;
    }

    public abstract Collection<WebSocket> getConnections();

    public boolean isReuseAddr() {
        return this.b;
    }

    public boolean isTcpNoDelay() {
        return this.a;
    }

    public void setConnectionLostTimeout(int i) {
        synchronized (this.g) {
            this.e = i;
            if (i <= 0) {
                h.trace("Connection lost timer stopped");
                c();
                return;
            }
            if (this.f) {
                h.trace("Connection lost timer restarted");
                try {
                    for (WebSocket webSocket : new ArrayList(getConnections())) {
                        if (webSocket instanceof WebSocketImpl) {
                            ((WebSocketImpl) webSocket).updateLastPong();
                        }
                    }
                } catch (Exception e) {
                    h.error("Exception during connection lost restart", (Throwable) e);
                }
                e();
            }
        }
    }

    public void setReuseAddr(boolean z) {
        this.b = z;
    }

    public void setTcpNoDelay(boolean z) {
        this.a = z;
    }

    public void startConnectionLostTimer() {
        synchronized (this.g) {
            if (this.e <= 0) {
                h.trace("Connection lost timer deactivated");
                return;
            }
            h.trace("Connection lost timer started");
            this.f = true;
            e();
        }
    }

    public void stopConnectionLostTimer() {
        synchronized (this.g) {
            if (this.c != null || this.d != null) {
                this.f = false;
                h.trace("Connection lost timer stopped");
                c();
            }
        }
    }
}
