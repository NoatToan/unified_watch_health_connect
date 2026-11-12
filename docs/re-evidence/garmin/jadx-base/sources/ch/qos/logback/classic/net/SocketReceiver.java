package ch.qos.logback.classic.net;

import am.j;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes7.dex */
public class SocketReceiver extends ReceiverBase implements Runnable, SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private int acceptConnectionTimeout = 5000;
    private InetAddress address;
    private Future<Socket> connectorTask;
    private int port;
    private String receiverId;
    private int reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;

    private Future<Socket> activateConnector(SocketConnector socketConnector) {
        try {
            return getContext().getScheduledExecutorService().submit(socketConnector);
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i14, int i15, int i16) {
        SocketConnector socketConnectorNewConnector = newConnector(inetAddress, i14, i15, i16);
        socketConnectorNewConnector.setExceptionHandler(this);
        socketConnectorNewConnector.setSocketFactory(getSocketFactory());
        return socketConnectorNewConnector;
    }

    private void dispatchEvents(LoggerContext loggerContext) throws Throwable {
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
        StringBuilder sb3;
        try {
            try {
                this.socket.setSoTimeout(this.acceptConnectionTimeout);
                hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(this.socket.getInputStream());
                try {
                    this.socket.setSoTimeout(0);
                    addInfo(this.receiverId + "connection established");
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
                        Logger logger = loggerContext.getLogger(iLoggingEvent.getLoggerName());
                        if (logger.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    addInfo(this.receiverId + "end-of-stream detected");
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb3 = new StringBuilder();
                    sb3.append(this.receiverId);
                    sb3.append("connection closed");
                    addInfo(sb3.toString());
                } catch (IOException e4) {
                    e = e4;
                    addInfo(this.receiverId + "connection failed: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb3 = new StringBuilder();
                    sb3.append(this.receiverId);
                    sb3.append("connection closed");
                    addInfo(sb3.toString());
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    addInfo(this.receiverId + "unknown event class: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb3 = new StringBuilder();
                    sb3.append(this.receiverId);
                    sb3.append("connection closed");
                    addInfo(sb3.toString());
                }
            } catch (Throwable th3) {
                th = th3;
                CloseUtil.closeQuietly((Closeable) null);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                addInfo(this.receiverId + "connection closed");
                throw th;
            }
        } catch (EOFException unused2) {
            hardenedLoggingEventInputStream = null;
        } catch (IOException e15) {
            e = e15;
            hardenedLoggingEventInputStream = null;
        } catch (ClassNotFoundException e16) {
            e = e16;
            hardenedLoggingEventInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            CloseUtil.closeQuietly((Closeable) null);
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            addInfo(this.receiverId + "connection closed");
            throw th;
        }
    }

    private Socket waitForConnectorToReturnASocket() throws InterruptedException {
        try {
            Socket socket = this.connectorTask.get();
            this.connectorTask = null;
            return socket;
        } catch (ExecutionException unused) {
            return null;
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb3;
        String str;
        String string;
        if (exc instanceof InterruptedException) {
            string = "connector interrupted";
        } else {
            boolean z14 = exc instanceof ConnectException;
            String str2 = this.receiverId;
            if (z14) {
                sb3 = new StringBuilder();
                sb3.append(str2);
                str = "connection refused";
            } else {
                sb3 = new StringBuilder();
                sb3.append(str2);
                str = "unspecified error";
            }
            sb3.append(str);
            string = sb3.toString();
        }
        addWarn(string, exc);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i14, int i15, int i16) {
        return new DefaultSocketConnector(inetAddress, i14, i15, i16);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        if (this.socket != null) {
            CloseUtil.closeQuietly(this.socket);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            LoggerContext loggerContext = (LoggerContext) getContext();
            while (!Thread.currentThread().isInterrupted()) {
                Future<Socket> futureActivateConnector = activateConnector(createConnector(this.address, this.port, 0, this.reconnectionDelay));
                this.connectorTask = futureActivateConnector;
                if (futureActivateConnector == null) {
                    break;
                }
                this.socket = waitForConnectorToReturnASocket();
                if (this.socket == null) {
                    break;
                } else {
                    dispatchEvents(loggerContext);
                }
            }
        } catch (InterruptedException unused) {
        }
        addInfo("shutting down");
    }

    public void setAcceptConnectionTimeout(int i14) {
        this.acceptConnectionTimeout = i14;
    }

    public void setPort(int i14) {
        this.port = i14;
    }

    public void setReconnectionDelay(int i14) {
        this.reconnectionDelay = i14;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        int i14;
        if (this.port == 0) {
            addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
            i14 = 1;
        } else {
            i14 = 0;
        }
        if (this.remoteHost == null) {
            i14++;
            addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
        }
        if (this.reconnectionDelay == 0) {
            this.reconnectionDelay = 30000;
        }
        if (i14 == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                addError("unknown host: " + this.remoteHost);
                i14++;
            }
        }
        if (i14 == 0) {
            StringBuilder sb3 = new StringBuilder("receiver ");
            sb3.append(this.remoteHost);
            sb3.append(":");
            this.receiverId = j.q(sb3, this.port, ": ");
        }
        return i14 == 0;
    }
}
