package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.core.util.CloseUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes7.dex */
class RemoteAppenderStreamClient implements RemoteAppenderClient {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f27277id;
    private final InputStream inputStream;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    private LoggerContext f27278lc;
    private Logger logger;
    private final Socket socket;

    public RemoteAppenderStreamClient(String str, InputStream inputStream) {
        this.f27277id = str;
        this.socket = null;
        this.inputStream = inputStream;
    }

    private HardenedObjectInputStream createObjectInputStream() {
        return this.inputStream != null ? new HardenedLoggingEventInputStream(this.inputStream) : new HardenedLoggingEventInputStream(this.socket.getInputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.socket;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        StringBuilder sb3;
        this.logger.info(this + ": connected");
        HardenedObjectInputStream hardenedObjectInputStreamCreateObjectInputStream = null;
        try {
            try {
                try {
                    hardenedObjectInputStreamCreateObjectInputStream = createObjectInputStream();
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedObjectInputStreamCreateObjectInputStream.readObject();
                        Logger logger2 = this.f27278lc.getLogger(iLoggingEvent.getLoggerName());
                        if (logger2.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger2.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                    }
                    close();
                    logger = this.logger;
                    sb3 = new StringBuilder();
                    sb3.append(this);
                    sb3.append(": connection closed");
                    logger.info(sb3.toString());
                } catch (ClassNotFoundException unused2) {
                    this.logger.error(this + ": unknown event class");
                    if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                    }
                    close();
                    logger = this.logger;
                    sb3 = new StringBuilder();
                    sb3.append(this);
                    sb3.append(": connection closed");
                    logger.info(sb3.toString());
                }
            } catch (IOException e4) {
                this.logger.info(this + ": " + e4);
                if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                }
                close();
                logger = this.logger;
                sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append(": connection closed");
                logger.info(sb3.toString());
            } catch (RuntimeException e14) {
                this.logger.error(this + ": " + e14);
                if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                }
                close();
                logger = this.logger;
                sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append(": connection closed");
                logger.info(sb3.toString());
            }
        } catch (Throwable th3) {
            if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
            }
            close();
            this.logger.info(this + ": connection closed");
            throw th3;
        }
    }

    @Override // ch.qos.logback.classic.net.server.RemoteAppenderClient
    public void setLoggerContext(LoggerContext loggerContext) {
        this.f27278lc = loggerContext;
        this.logger = loggerContext.getLogger(getClass().getPackage().getName());
    }

    public String toString() {
        return "client " + this.f27277id;
    }

    public RemoteAppenderStreamClient(String str, Socket socket) {
        this.f27277id = str;
        this.socket = socket;
        this.inputStream = null;
    }
}
