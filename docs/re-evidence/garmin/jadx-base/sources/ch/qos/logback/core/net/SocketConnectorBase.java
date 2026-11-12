package ch.qos.logback.core.net;

import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class SocketConnectorBase implements SocketConnector {
    private final InetAddress address;
    private final Condition connectCondition;
    private DelayStrategy delayStrategy;
    private SocketConnector.ExceptionHandler exceptionHandler;
    private final Lock lock;
    private final int port;
    private Socket socket;
    private SocketFactory socketFactory;

    public static class ConsoleExceptionHandler implements SocketConnector.ExceptionHandler {
        private ConsoleExceptionHandler() {
        }

        @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
        public void connectionFailed(SocketConnector socketConnector, Exception exc) {
            System.out.println(exc);
        }
    }

    public interface DelayStrategy {
        int nextDelay();
    }

    public static class FixedDelay implements DelayStrategy {
        private int nextDelay;
        private final int retryDelay;

        public FixedDelay(int i14, int i15) {
            this.nextDelay = i14;
            this.retryDelay = i15;
        }

        @Override // ch.qos.logback.core.net.SocketConnectorBase.DelayStrategy
        public int nextDelay() {
            int i14 = this.nextDelay;
            this.nextDelay = this.retryDelay;
            return i14;
        }
    }

    public SocketConnectorBase(InetAddress inetAddress, int i14, DelayStrategy delayStrategy) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.connectCondition = reentrantLock.newCondition();
        this.address = inetAddress;
        this.port = i14;
        this.delayStrategy = delayStrategy;
    }

    private void signalConnected() {
        this.lock.lock();
        try {
            this.connectCondition.signalAll();
        } finally {
            this.lock.unlock();
        }
    }

    public Socket awaitConnection(long j8) {
        Socket socket;
        this.lock.lock();
        boolean z14 = false;
        while (true) {
            try {
                socket = this.socket;
                if (socket != null || z14) {
                    break;
                }
                z14 = !this.connectCondition.await(j8, TimeUnit.MILLISECONDS);
            } catch (Throwable th3) {
                this.lock.unlock();
                throw th3;
            }
        }
        this.lock.unlock();
        return socket;
    }

    public void run() {
        if (this.socket != null) {
            h.z("connector cannot be reused");
            return;
        }
        if (this.exceptionHandler == null) {
            this.exceptionHandler = new ConsoleExceptionHandler();
        }
        if (this.socketFactory == null) {
            this.socketFactory = SocketFactory.getDefault();
        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(this.delayStrategy.nextDelay());
                try {
                    this.socket = this.socketFactory.createSocket(this.address, this.port);
                    signalConnected();
                    return;
                } catch (Exception e4) {
                    this.exceptionHandler.connectionFailed(this, e4);
                }
            } catch (InterruptedException e14) {
                this.exceptionHandler.connectionFailed(this, e14);
                return;
            }
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }

    @Override // java.util.concurrent.Callable
    public Socket call() {
        return null;
    }

    public SocketConnectorBase(InetAddress inetAddress, int i14, int i15, int i16) {
        this(inetAddress, i14, new FixedDelay(i15, i16));
    }

    public Socket awaitConnection() {
        return awaitConnection(Long.MAX_VALUE);
    }
}
