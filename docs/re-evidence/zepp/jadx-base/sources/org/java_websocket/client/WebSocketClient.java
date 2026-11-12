package org.java_websocket.client;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import org.java_websocket.AbstractWebSocket;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.Opcode;
import org.java_websocket.enums.ReadyState;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.java_websocket.handshake.Handshakedata;
import org.java_websocket.handshake.ServerHandshake;

/* JADX INFO: loaded from: classes23.dex */
public abstract class WebSocketClient extends AbstractWebSocket implements Runnable, WebSocket {
    private WebSocketImpl i;
    private Socket j;
    private SocketFactory k;
    private OutputStream l;
    private Proxy m;
    private Thread n;
    private Thread o;
    private Draft p;
    private Map<String, String> q;
    private CountDownLatch r;
    private CountDownLatch s;
    private int t;
    public URI uri;

    public class a implements Runnable {
        private final WebSocketClient a;

        public a(WebSocketClient webSocketClient) {
            this.a = webSocketClient;
        }

        private void a() {
            try {
                if (WebSocketClient.this.j != null) {
                    WebSocketClient.this.j.close();
                }
            } catch (IOException e) {
                WebSocketClient.this.onWebsocketError(this.a, e);
            }
        }

        private void b() throws IOException {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBufferTake = WebSocketClient.this.i.outQueue.take();
                    WebSocketClient.this.l.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                    WebSocketClient.this.l.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : WebSocketClient.this.i.outQueue) {
                        WebSocketClient.this.l.write(byteBuffer.array(), 0, byteBuffer.limit());
                        WebSocketClient.this.l.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    b();
                } catch (IOException e) {
                    WebSocketClient.this.k(e);
                }
            } finally {
                a();
                WebSocketClient.this.n = null;
            }
        }
    }

    public WebSocketClient(URI uri) {
        this(uri, new Draft_6455());
    }

    private int getPort() {
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(IOException iOException) {
        if (iOException instanceof SSLException) {
            onError(iOException);
        }
        this.i.eot();
    }

    private void l() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread == this.n || threadCurrentThread == this.o) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
        }
        try {
            closeBlocking();
            Thread thread = this.n;
            if (thread != null) {
                thread.interrupt();
                this.n = null;
            }
            Thread thread2 = this.o;
            if (thread2 != null) {
                thread2.interrupt();
                this.o = null;
            }
            this.p.reset();
            Socket socket = this.j;
            if (socket != null) {
                socket.close();
                this.j = null;
            }
            this.r = new CountDownLatch(1);
            this.s = new CountDownLatch(1);
            this.i = new WebSocketImpl(this, this.p);
        } catch (Exception e) {
            onError(e);
            this.i.closeConnection(1006, e.getMessage());
        }
    }

    private void m() throws InvalidHandshakeException {
        String rawPath = this.uri.getRawPath();
        String rawQuery = this.uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int port = getPort();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        sb.append((port == 80 || port == 443) ? "" : ":" + port);
        String string = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(rawPath);
        handshakeImpl1Client.put("Host", string);
        Map<String, String> map = this.q;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                handshakeImpl1Client.put(entry.getKey(), entry.getValue());
            }
        }
        this.i.startHandshake(handshakeImpl1Client);
    }

    @Override // org.java_websocket.WebSocket
    public void close() {
        if (this.n != null) {
            this.i.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.s.await();
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        this.i.closeConnection(i, str);
    }

    public void connect() {
        if (this.o != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.o = thread;
        thread.setName("WebSocketConnectReadThread-" + this.o.getId());
        this.o.start();
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.r.await();
        return this.i.isOpen();
    }

    @Override // org.java_websocket.WebSocket
    public <T> T getAttachment() {
        return (T) this.i.getAttachment();
    }

    public WebSocket getConnection() {
        return this.i;
    }

    @Override // org.java_websocket.AbstractWebSocket
    public Collection<WebSocket> getConnections() {
        return Collections.singletonList(this.i);
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        return this.p;
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        Socket socket = this.j;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // org.java_websocket.WebSocket
    public ReadyState getReadyState() {
        return this.i.getReadyState();
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        Socket socket = this.j;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // org.java_websocket.WebSocket
    public String getResourceDescriptor() {
        return this.uri.getPath();
    }

    public Socket getSocket() {
        return this.j;
    }

    public URI getURI() {
        return this.uri;
    }

    @Override // org.java_websocket.WebSocket
    public boolean hasBufferedData() {
        return this.i.hasBufferedData();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        return this.i.isClosed();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        return this.i.isClosing();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isFlushAndClose() {
        return this.i.isFlushAndClose();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        return this.i.isOpen();
    }

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
    }

    public void onClosing(int i, String str, boolean z) {
    }

    public abstract void onError(Exception exc);

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(ServerHandshake serverHandshake);

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        stopConnectionLostTimer();
        Thread thread = this.n;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.r.countDown();
        this.s.countDown();
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        onCloseInitiated(i, str);
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        onError(exc);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        onMessage(str);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        startConnectionLostTimer();
        onOpen((ServerHandshake) handshakedata);
        this.r.countDown();
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
    }

    public void reconnect() {
        l();
        connect();
    }

    public boolean reconnectBlocking() throws InterruptedException {
        l();
        return connectBlocking();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[Catch: Exception -> 0x00e7, TryCatch #1 {Exception -> 0x00e7, blocks: (B:3:0x0001, B:5:0x0007, B:12:0x0024, B:14:0x003e, B:17:0x0057, B:19:0x0065, B:20:0x0084, B:6:0x000e, B:8:0x0012, B:9:0x001d, B:37:0x00e1, B:38:0x00e6), top: B:42:0x0001 }] */
    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        byte[] bArr;
        int i;
        try {
            SocketFactory socketFactory = this.k;
            if (socketFactory == null) {
                Socket socket = this.j;
                if (socket == null) {
                    this.j = new Socket(this.m);
                    z = true;
                } else if (socket.isClosed()) {
                    throw new IOException();
                }
                this.j.setTcpNoDelay(isTcpNoDelay());
                this.j.setReuseAddress(isReuseAddr());
                if (!this.j.isBound()) {
                    this.j.connect(new InetSocketAddress(this.uri.getHost(), getPort()), this.t);
                }
                if (z && "wss".equals(this.uri.getScheme())) {
                    SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                    sSLContext.init(null, null, null);
                    this.j = sSLContext.getSocketFactory().createSocket(this.j, this.uri.getHost(), getPort(), true);
                }
                InputStream inputStream = this.j.getInputStream();
                this.l = this.j.getOutputStream();
                m();
                Thread thread = new Thread(new a(this));
                this.n = thread;
                thread.start();
                bArr = new byte[16384];
                while (!isClosing() && !isClosed() && (i = inputStream.read(bArr)) != -1) {
                    try {
                        this.i.decode(ByteBuffer.wrap(bArr, 0, i));
                    } catch (IOException e) {
                        k(e);
                    } catch (RuntimeException e2) {
                        onError(e2);
                        this.i.closeConnection(1006, e2.getMessage());
                    }
                }
                this.i.eot();
                this.o = null;
            }
            this.j = socketFactory.createSocket();
            z = false;
            this.j.setTcpNoDelay(isTcpNoDelay());
            this.j.setReuseAddress(isReuseAddr());
            if (!this.j.isBound()) {
                this.j.connect(new InetSocketAddress(this.uri.getHost(), getPort()), this.t);
            }
            if (z) {
                SSLContext sSLContext2 = SSLContext.getInstance("TLSv1.2");
                sSLContext2.init(null, null, null);
                this.j = sSLContext2.getSocketFactory().createSocket(this.j, this.uri.getHost(), getPort(), true);
            }
            InputStream inputStream2 = this.j.getInputStream();
            this.l = this.j.getOutputStream();
            m();
            Thread thread2 = new Thread(new a(this));
            this.n = thread2;
            thread2.start();
            bArr = new byte[16384];
            while (!isClosing()) {
                this.i.decode(ByteBuffer.wrap(bArr, 0, i));
            }
            this.i.eot();
            this.o = null;
        } catch (Exception e3) {
            onWebsocketError(this.i, e3);
            this.i.closeConnection(-1, e3.getMessage());
        }
    }

    @Override // org.java_websocket.WebSocket
    public void send(String str) {
        this.i.send(str);
    }

    @Override // org.java_websocket.WebSocket
    public void sendFragmentedFrame(Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        this.i.sendFragmentedFrame(opcode, byteBuffer, z);
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        this.i.sendFrame(framedata);
    }

    @Override // org.java_websocket.WebSocket
    public void sendPing() {
        this.i.sendPing();
    }

    @Override // org.java_websocket.WebSocket
    public <T> void setAttachment(T t) {
        this.i.setAttachment(t);
    }

    public void setProxy(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.m = proxy;
    }

    @Deprecated
    public void setSocket(Socket socket) {
        if (this.j != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.j = socket;
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        this.k = socketFactory;
    }

    public WebSocketClient(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    @Override // org.java_websocket.WebSocket
    public void send(byte[] bArr) {
        this.i.send(bArr);
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        this.i.sendFrame(collection);
    }

    public WebSocketClient(URI uri, Map<String, String> map) {
        this(uri, new Draft_6455(), map);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        this.i.close(i);
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.i.getLocalSocketAddress();
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.i.getRemoteSocketAddress();
    }

    @Override // org.java_websocket.WebSocket
    public void send(ByteBuffer byteBuffer) {
        this.i.send(byteBuffer);
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map) {
        this(uri, draft, map, 0);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i, String str) {
        this.i.close(i, str);
    }

    public boolean connectBlocking(long j, TimeUnit timeUnit) throws InterruptedException {
        connect();
        return this.r.await(j, timeUnit) && this.i.isOpen();
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map, int i) {
        this.uri = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = Proxy.NO_PROXY;
        this.r = new CountDownLatch(1);
        this.s = new CountDownLatch(1);
        this.t = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (draft != null) {
            this.uri = uri;
            this.p = draft;
            this.q = map;
            this.t = i;
            setTcpNoDelay(false);
            setReuseAddr(false);
            this.i = new WebSocketImpl(this, draft);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }
}
