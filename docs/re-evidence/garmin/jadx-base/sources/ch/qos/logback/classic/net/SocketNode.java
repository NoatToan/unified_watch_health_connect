package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

/* JADX INFO: loaded from: classes7.dex */
public class SocketNode implements Runnable {
    boolean closed = false;
    LoggerContext context;
    HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
    Logger logger;
    SocketAddress remoteSocketAddress;
    Socket socket;
    SimpleSocketServer socketServer;

    public SocketNode(SimpleSocketServer simpleSocketServer, Socket socket, LoggerContext loggerContext) {
        this.socketServer = simpleSocketServer;
        this.socket = socket;
        this.remoteSocketAddress = socket.getRemoteSocketAddress();
        this.context = loggerContext;
        this.logger = loggerContext.getLogger(SocketNode.class);
    }

    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream = this.hardenedLoggingEventInputStream;
        if (hardenedLoggingEventInputStream != null) {
            try {
                hardenedLoggingEventInputStream.close();
            } catch (IOException e4) {
                this.logger.warn("Could not close connection.", (Throwable) e4);
            } finally {
                this.hardenedLoggingEventInputStream = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        String str;
        try {
            this.hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(new BufferedInputStream(this.socket.getInputStream()));
        } catch (Exception e4) {
            this.logger.error("Could not open ObjectInputStream to " + this.socket, (Throwable) e4);
            this.closed = true;
        }
        while (!this.closed) {
            try {
                ILoggingEvent iLoggingEvent = (ILoggingEvent) this.hardenedLoggingEventInputStream.readObject();
                Logger logger2 = this.context.getLogger(iLoggingEvent.getLoggerName());
                if (logger2.isEnabledFor(iLoggingEvent.getLevel())) {
                    logger2.callAppenders(iLoggingEvent);
                }
            } catch (EOFException unused) {
                logger = this.logger;
                str = "Caught java.io.EOFException closing connection.";
                logger.info(str);
            } catch (SocketException unused2) {
                logger = this.logger;
                str = "Caught java.net.SocketException closing connection.";
                logger.info(str);
            } catch (IOException e14) {
                this.logger.info("Caught java.io.IOException: " + e14);
                logger = this.logger;
                str = "Closing connection.";
                logger.info(str);
            } catch (Exception e15) {
                this.logger.error("Unexpected exception. Closing connection.", (Throwable) e15);
            }
        }
        this.socketServer.socketNodeClosing(this);
        close();
    }

    public String toString() {
        return getClass().getName() + this.remoteSocketAddress.toString();
    }
}
