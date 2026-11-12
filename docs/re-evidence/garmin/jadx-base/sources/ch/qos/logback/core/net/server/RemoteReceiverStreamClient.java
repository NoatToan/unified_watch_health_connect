package ch.qos.logback.core.net.server;

import am.j;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
class RemoteReceiverStreamClient extends ContextAwareBase implements RemoteReceiverClient {
    private final String clientId;
    private final OutputStream outputStream;
    private BlockingQueue<Serializable> queue;
    private final Socket socket;

    public RemoteReceiverStreamClient(String str, OutputStream outputStream) {
        this.clientId = j.m("client ", str, ": ");
        this.socket = null;
        this.outputStream = outputStream;
    }

    private ObjectOutputStream createObjectOutputStream() {
        return this.socket == null ? new ObjectOutputStream(this.outputStream) : new ObjectOutputStream(this.socket.getOutputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.socket;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // ch.qos.logback.core.net.server.RemoteReceiverClient
    public boolean offer(Serializable serializable) {
        BlockingQueue<Serializable> blockingQueue = this.queue;
        if (blockingQueue != null) {
            return blockingQueue.offer(serializable);
        }
        h.z("client has no event queue");
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb3;
        addInfo(this.clientId + "connected");
        ObjectOutputStream objectOutputStreamCreateObjectOutputStream = null;
        try {
            try {
                try {
                    try {
                        objectOutputStreamCreateObjectOutputStream = createObjectOutputStream();
                        loop0: while (true) {
                            int i14 = 0;
                            while (true) {
                                if (Thread.currentThread().isInterrupted()) {
                                    break loop0;
                                }
                                try {
                                    objectOutputStreamCreateObjectOutputStream.writeObject(this.queue.take());
                                    objectOutputStreamCreateObjectOutputStream.flush();
                                    i14++;
                                    if (i14 >= 70) {
                                        try {
                                            objectOutputStreamCreateObjectOutputStream.reset();
                                            break;
                                        } catch (InterruptedException unused) {
                                            i14 = 0;
                                            Thread.currentThread().interrupt();
                                        }
                                    } else {
                                        continue;
                                    }
                                } catch (InterruptedException unused2) {
                                }
                            }
                        }
                        if (objectOutputStreamCreateObjectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                        }
                        close();
                        sb3 = new StringBuilder();
                    } catch (SocketException e4) {
                        addInfo(this.clientId + e4);
                        if (objectOutputStreamCreateObjectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                        }
                        close();
                        sb3 = new StringBuilder();
                    }
                } catch (IOException e14) {
                    addError(this.clientId + e14);
                    if (objectOutputStreamCreateObjectOutputStream != null) {
                        CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                    }
                    close();
                    sb3 = new StringBuilder();
                }
            } catch (RuntimeException e15) {
                addError(this.clientId + e15);
                if (objectOutputStreamCreateObjectOutputStream != null) {
                    CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                }
                close();
                sb3 = new StringBuilder();
            }
            sb3.append(this.clientId);
            sb3.append("connection closed");
            addInfo(sb3.toString());
        } catch (Throwable th3) {
            if (objectOutputStreamCreateObjectOutputStream != null) {
                CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
            }
            close();
            addInfo(this.clientId + "connection closed");
            throw th3;
        }
    }

    @Override // ch.qos.logback.core.net.server.RemoteReceiverClient
    public void setQueue(BlockingQueue<Serializable> blockingQueue) {
        this.queue = blockingQueue;
    }

    public RemoteReceiverStreamClient(String str, Socket socket) {
        this.clientId = j.m("client ", str, ": ");
        this.socket = socket;
        this.outputStream = null;
    }
}
