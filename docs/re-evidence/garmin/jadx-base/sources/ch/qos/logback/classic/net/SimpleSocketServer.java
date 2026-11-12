package ch.qos.logback.classic.net;

import c22.t;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import javax.net.ServerSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleSocketServer extends Thread {
    private CountDownLatch latch;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    private final LoggerContext f27276lc;
    private final int port;
    private ServerSocket serverSocket;
    Logger logger = LoggerFactory.getLogger((Class<?>) SimpleSocketServer.class);
    private boolean closed = false;
    private List<SocketNode> socketNodeList = new ArrayList();

    public SimpleSocketServer(LoggerContext loggerContext, int i14) {
        this.f27276lc = loggerContext;
        this.port = i14;
    }

    public static void configureLC(LoggerContext loggerContext, String str) throws Throwable {
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        loggerContext.reset();
        joranConfigurator.setContext(loggerContext);
        joranConfigurator.doConfigure(str);
    }

    public static void doMain(Class<? extends SimpleSocketServer> cls, String[] strArr) throws Throwable {
        int portNumber;
        if (strArr.length == 2) {
            portNumber = parsePortNumber(strArr[0]);
        } else {
            usage("Wrong number of arguments.");
            portNumber = -1;
        }
        String str = strArr[1];
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        configureLC(loggerContext, str);
        new SimpleSocketServer(loggerContext, portNumber).start();
    }

    public static void main(String[] strArr) throws Throwable {
        doMain(SimpleSocketServer.class, strArr);
    }

    public static int parsePortNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            usage("Could not interpret port number [" + str + "].");
            return -1;
        }
    }

    public static void usage(String str) {
        System.err.println(str);
        System.err.println("Usage: java " + SimpleSocketServer.class.getName() + " port configFile");
        System.exit(1);
    }

    public void close() {
        this.closed = true;
        ServerSocket serverSocket = this.serverSocket;
        if (serverSocket != null) {
            try {
                try {
                    serverSocket.close();
                } catch (IOException e4) {
                    this.logger.error("Failed to close serverSocket", (Throwable) e4);
                }
                this.serverSocket = null;
            } catch (Throwable th3) {
                this.serverSocket = null;
                throw th3;
            }
        }
        this.logger.info("closing this server");
        synchronized (this.socketNodeList) {
            try {
                Iterator<SocketNode> it = this.socketNodeList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (this.socketNodeList.size() != 0) {
            this.logger.warn("Was expecting a 0-sized socketNodeList after server shutdown");
        }
    }

    public String getClientThreadName(Socket socket) {
        return String.format(Locale.US, "Logback SocketNode (client: %s)", socket.getRemoteSocketAddress());
    }

    public CountDownLatch getLatch() {
        return this.latch;
    }

    public ServerSocketFactory getServerSocketFactory() {
        return ServerSocketFactory.getDefault();
    }

    public String getServerThreadName() {
        Locale locale = Locale.US;
        return t.e(this.port, "Logback ", getClass().getSimpleName(), " (port ", ")");
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            try {
                Thread.currentThread().setName(getServerThreadName());
                this.logger.info("Listening on port " + this.port);
                this.serverSocket = getServerSocketFactory().createServerSocket(this.port);
                while (!this.closed) {
                    this.logger.info("Waiting to accept a new client.");
                    signalAlmostReadiness();
                    Socket socketAccept = this.serverSocket.accept();
                    this.logger.info("Connected to client at " + socketAccept.getInetAddress());
                    this.logger.info("Starting new socket node.");
                    SocketNode socketNode = new SocketNode(this, socketAccept, this.f27276lc);
                    synchronized (this.socketNodeList) {
                        this.socketNodeList.add(socketNode);
                    }
                    new Thread(socketNode, getClientThreadName(socketAccept)).start();
                }
            } catch (Exception e4) {
                boolean z14 = this.closed;
                Logger logger = this.logger;
                if (z14) {
                    logger.info("Exception in run method for a closed server. This is normal.");
                } else {
                    logger.error("Unexpected failure in run method", (Throwable) e4);
                }
            }
            Thread.currentThread().setName(name);
        } catch (Throwable th3) {
            Thread.currentThread().setName(name);
            throw th3;
        }
    }

    public void setLatch(CountDownLatch countDownLatch) {
        this.latch = countDownLatch;
    }

    public void signalAlmostReadiness() {
        CountDownLatch countDownLatch = this.latch;
        if (countDownLatch == null || countDownLatch.getCount() == 0) {
            return;
        }
        this.latch.countDown();
    }

    public void socketNodeClosing(SocketNode socketNode) {
        this.logger.debug("Removing {}", socketNode);
        synchronized (this.socketNodeList) {
            this.socketNodeList.remove(socketNode);
        }
    }
}
