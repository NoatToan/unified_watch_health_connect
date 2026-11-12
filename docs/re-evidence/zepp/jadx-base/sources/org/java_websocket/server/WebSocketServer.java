package org.java_websocket.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.java_websocket.AbstractWebSocket;
import org.java_websocket.SocketChannelIOHelper;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketAdapter;
import org.java_websocket.WebSocketFactory;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketServerFactory;
import org.java_websocket.WrappedByteChannel;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.Handshakedata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes23.dex */
public abstract class WebSocketServer extends AbstractWebSocket implements Runnable {
    private static final Logger u = LoggerFactory.getLogger((Class<?>) WebSocketServer.class);
    private static final int v = Runtime.getRuntime().availableProcessors();
    public List<WebSocketWorker> decoders;
    private final Collection<WebSocket> i;
    private final InetSocketAddress j;
    private ServerSocketChannel k;
    private Selector l;
    private List<Draft> m;
    private Thread n;
    private final AtomicBoolean o;
    private List<WebSocketImpl> p;
    private BlockingQueue<ByteBuffer> q;
    private int r;
    private final AtomicInteger s;
    private WebSocketServerFactory t;

    public class WebSocketWorker extends Thread {
        public static final /* synthetic */ boolean c = false;
        private BlockingQueue<WebSocketImpl> a = new LinkedBlockingQueue();

        public class a implements Thread.UncaughtExceptionHandler {
            public final /* synthetic */ WebSocketServer a;

            public a(WebSocketServer webSocketServer) {
                this.a = webSocketServer;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                WebSocketServer.u.error("Uncaught exception in thread {}: {}", thread.getName(), th);
            }
        }

        public WebSocketWorker() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new a(WebSocketServer.this));
        }

        private void a(WebSocketImpl webSocketImpl, ByteBuffer byteBuffer) throws InterruptedException {
            try {
                try {
                    webSocketImpl.decode(byteBuffer);
                } catch (Exception e) {
                    WebSocketServer.u.error("Error while reading from remote connection", (Throwable) e);
                }
            } finally {
                WebSocketServer.this.u(byteBuffer);
            }
        }

        public void put(WebSocketImpl webSocketImpl) throws InterruptedException {
            this.a.put(webSocketImpl);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            WebSocketImpl webSocketImplTake;
            RuntimeException e;
            while (true) {
                try {
                    try {
                        webSocketImplTake = this.a.take();
                        try {
                            a(webSocketImplTake, webSocketImplTake.inQueue.poll());
                        } catch (RuntimeException e2) {
                            e = e2;
                            WebSocketServer.this.s(webSocketImplTake, e);
                            return;
                        }
                    } catch (RuntimeException e3) {
                        webSocketImplTake = null;
                        e = e3;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public WebSocketServer() {
        this(new InetSocketAddress(80), v, null);
    }

    private void i(SelectionKey selectionKey, Iterator<SelectionKey> it2) throws InterruptedException, IOException {
        if (!onConnect(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        SocketChannel socketChannelAccept = this.k.accept();
        if (socketChannelAccept == null) {
            return;
        }
        socketChannelAccept.configureBlocking(false);
        Socket socket = socketChannelAccept.socket();
        socket.setTcpNoDelay(isTcpNoDelay());
        socket.setKeepAlive(true);
        WebSocketImpl webSocketImplCreateWebSocket = this.t.createWebSocket((WebSocketAdapter) this, this.m);
        webSocketImplCreateWebSocket.setSelectionKey(socketChannelAccept.register(this.l, 1, webSocketImplCreateWebSocket));
        try {
            webSocketImplCreateWebSocket.setChannel(this.t.wrapChannel(socketChannelAccept, webSocketImplCreateWebSocket.getSelectionKey()));
            it2.remove();
            allocateBuffers(webSocketImplCreateWebSocket);
        } catch (IOException e) {
            if (webSocketImplCreateWebSocket.getSelectionKey() != null) {
                webSocketImplCreateWebSocket.getSelectionKey().cancel();
            }
            t(webSocketImplCreateWebSocket.getSelectionKey(), null, e);
        }
    }

    private void j() throws InterruptedException, IOException {
        while (!this.p.isEmpty()) {
            WebSocketImpl webSocketImplRemove = this.p.remove(0);
            WrappedByteChannel wrappedByteChannel = (WrappedByteChannel) webSocketImplRemove.getChannel();
            ByteBuffer byteBufferV = v();
            try {
                if (SocketChannelIOHelper.readMore(byteBufferV, webSocketImplRemove, wrappedByteChannel)) {
                    this.p.add(webSocketImplRemove);
                }
                if (byteBufferV.hasRemaining()) {
                    webSocketImplRemove.inQueue.put(byteBufferV);
                    queue(webSocketImplRemove);
                } else {
                    u(byteBufferV);
                }
            } catch (IOException e) {
                u(byteBufferV);
                throw e;
            }
        }
    }

    private void k(Object obj, Collection<WebSocket> collection) {
        String str = obj instanceof String ? (String) obj : null;
        ByteBuffer byteBuffer = obj instanceof ByteBuffer ? (ByteBuffer) obj : null;
        if (str == null && byteBuffer == null) {
            return;
        }
        HashMap map = new HashMap();
        for (WebSocket webSocket : collection) {
            if (webSocket != null) {
                Draft draft = webSocket.getDraft();
                q(draft, map, str, byteBuffer);
                try {
                    webSocket.sendFrame(map.get(draft));
                } catch (WebsocketNotConnectedException unused) {
                }
            }
        }
    }

    private boolean l() {
        synchronized (this) {
            if (this.n == null) {
                this.n = Thread.currentThread();
                return !this.o.get();
            }
            throw new IllegalStateException(getClass().getName() + " can only be started once.");
        }
    }

    private boolean m(SelectionKey selectionKey, Iterator<SelectionKey> it2) throws InterruptedException, IOException {
        WebSocketImpl webSocketImpl = (WebSocketImpl) selectionKey.attachment();
        ByteBuffer byteBufferV = v();
        if (webSocketImpl.getChannel() == null) {
            selectionKey.cancel();
            t(selectionKey, webSocketImpl, new IOException());
            return false;
        }
        try {
            if (!SocketChannelIOHelper.read(byteBufferV, webSocketImpl, webSocketImpl.getChannel())) {
                u(byteBufferV);
                return true;
            }
            if (!byteBufferV.hasRemaining()) {
                u(byteBufferV);
                return true;
            }
            webSocketImpl.inQueue.put(byteBufferV);
            queue(webSocketImpl);
            it2.remove();
            if (!(webSocketImpl.getChannel() instanceof WrappedByteChannel) || !((WrappedByteChannel) webSocketImpl.getChannel()).isNeedRead()) {
                return true;
            }
            this.p.add(webSocketImpl);
            return true;
        } catch (IOException e) {
            u(byteBufferV);
            throw e;
        }
    }

    private void n() {
        stopConnectionLostTimer();
        List<WebSocketWorker> list = this.decoders;
        if (list != null) {
            Iterator<WebSocketWorker> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().interrupt();
            }
        }
        Selector selector = this.l;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                u.error("IOException during selector.close", (Throwable) e);
                onError(null, e);
            }
        }
        ServerSocketChannel serverSocketChannel = this.k;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e2) {
                u.error("IOException during server.close", (Throwable) e2);
                onError(null, e2);
            }
        }
    }

    private boolean o() {
        this.n.setName("WebSocketSelector-" + this.n.getId());
        try {
            ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
            this.k = serverSocketChannelOpen;
            serverSocketChannelOpen.configureBlocking(false);
            ServerSocket serverSocketSocket = this.k.socket();
            serverSocketSocket.setReceiveBufferSize(16384);
            serverSocketSocket.setReuseAddress(isReuseAddr());
            serverSocketSocket.bind(this.j);
            Selector selectorOpen = Selector.open();
            this.l = selectorOpen;
            ServerSocketChannel serverSocketChannel = this.k;
            serverSocketChannel.register(selectorOpen, serverSocketChannel.validOps());
            startConnectionLostTimer();
            Iterator<WebSocketWorker> it2 = this.decoders.iterator();
            while (it2.hasNext()) {
                it2.next().start();
            }
            onStart();
            return true;
        } catch (IOException e) {
            s(null, e);
            return false;
        }
    }

    private void p(SelectionKey selectionKey) throws IOException {
        WebSocketImpl webSocketImpl = (WebSocketImpl) selectionKey.attachment();
        if (SocketChannelIOHelper.batch(webSocketImpl, webSocketImpl.getChannel()) && selectionKey.isValid()) {
            selectionKey.interestOps(1);
        }
    }

    private void q(Draft draft, Map<Draft, List<Framedata>> map, String str, ByteBuffer byteBuffer) {
        if (map.containsKey(draft)) {
            return;
        }
        List<Framedata> listCreateFrames = str != null ? draft.createFrames(str, false) : null;
        if (byteBuffer != null) {
            listCreateFrames = draft.createFrames(byteBuffer, false);
        }
        if (listCreateFrames != null) {
            map.put(draft, listCreateFrames);
        }
    }

    private Socket r(WebSocket webSocket) {
        return ((SocketChannel) ((WebSocketImpl) webSocket).getSelectionKey().channel()).socket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(WebSocket webSocket, Exception exc) {
        u.error("Shutdown due to fatal error", (Throwable) exc);
        onError(webSocket, exc);
        List<WebSocketWorker> list = this.decoders;
        if (list != null) {
            Iterator<WebSocketWorker> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().interrupt();
            }
        }
        Thread thread = this.n;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            stop();
        } catch (IOException e) {
            u.error("Error during shutdown", (Throwable) e);
            onError(null, e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            u.error("Interrupt during stop", (Throwable) exc);
            onError(null, e2);
        }
    }

    private void t(SelectionKey selectionKey, WebSocket webSocket, IOException iOException) {
        SelectableChannel selectableChannelChannel;
        if (webSocket != null) {
            webSocket.closeConnection(1006, iOException.getMessage());
        } else {
            if (selectionKey == null || (selectableChannelChannel = selectionKey.channel()) == null || !selectableChannelChannel.isOpen()) {
                return;
            }
            try {
                selectableChannelChannel.close();
            } catch (IOException unused) {
            }
            u.trace("Connection closed because of exception", (Throwable) iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.q.size() > this.s.intValue()) {
            return;
        }
        this.q.put(byteBuffer);
    }

    private ByteBuffer v() throws InterruptedException {
        return this.q.take();
    }

    public boolean addConnection(WebSocket webSocket) {
        boolean zAdd;
        if (this.o.get()) {
            webSocket.close(1001);
            return true;
        }
        synchronized (this.i) {
            zAdd = this.i.add(webSocket);
        }
        return zAdd;
    }

    public void allocateBuffers(WebSocket webSocket) throws InterruptedException {
        if (this.s.get() >= (this.decoders.size() * 2) + 1) {
            return;
        }
        this.s.incrementAndGet();
        this.q.put(createBuffer());
    }

    public void broadcast(String str) {
        broadcast(str, this.i);
    }

    public ByteBuffer createBuffer() {
        return ByteBuffer.allocate(16384);
    }

    public InetSocketAddress getAddress() {
        return this.j;
    }

    @Override // org.java_websocket.AbstractWebSocket
    public Collection<WebSocket> getConnections() {
        return Collections.unmodifiableCollection(new ArrayList(this.i));
    }

    public List<Draft> getDraft() {
        return Collections.unmodifiableList(this.m);
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        return (InetSocketAddress) r(webSocket).getLocalSocketAddress();
    }

    public int getPort() {
        ServerSocketChannel serverSocketChannel;
        int port = getAddress().getPort();
        return (port != 0 || (serverSocketChannel = this.k) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        return (InetSocketAddress) r(webSocket).getRemoteSocketAddress();
    }

    public final WebSocketFactory getWebSocketFactory() {
        return this.t;
    }

    public abstract void onClose(WebSocket webSocket, int i, String str, boolean z);

    public void onCloseInitiated(WebSocket webSocket, int i, String str) {
    }

    public void onClosing(WebSocket webSocket, int i, String str, boolean z) {
    }

    public boolean onConnect(SelectionKey selectionKey) {
        return true;
    }

    public abstract void onError(WebSocket webSocket, Exception exc);

    public abstract void onMessage(WebSocket webSocket, String str);

    public void onMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(WebSocket webSocket, ClientHandshake clientHandshake);

    public abstract void onStart();

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        this.l.wakeup();
        try {
            if (removeConnection(webSocket)) {
                onClose(webSocket, i, str, z);
            }
        } finally {
            try {
                releaseBuffers(webSocket);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        onCloseInitiated(webSocket, i, str);
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        onClosing(webSocket, i, str, z);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        onError(webSocket, exc);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        onMessage(webSocket, str);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        if (addConnection(webSocket)) {
            onOpen(webSocket, (ClientHandshake) handshakedata);
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
        WebSocketImpl webSocketImpl = (WebSocketImpl) webSocket;
        try {
            webSocketImpl.getSelectionKey().interestOps(5);
        } catch (CancelledKeyException unused) {
            webSocketImpl.outQueue.clear();
        }
        this.l.wakeup();
    }

    public void queue(WebSocketImpl webSocketImpl) throws InterruptedException {
        if (webSocketImpl.getWorkerThread() == null) {
            List<WebSocketWorker> list = this.decoders;
            webSocketImpl.setWorkerThread(list.get(this.r % list.size()));
            this.r++;
        }
        webSocketImpl.getWorkerThread().put(webSocketImpl);
    }

    public void releaseBuffers(WebSocket webSocket) throws InterruptedException {
    }

    public boolean removeConnection(WebSocket webSocket) {
        boolean zRemove;
        synchronized (this.i) {
            if (this.i.contains(webSocket)) {
                zRemove = this.i.remove(webSocket);
            } else {
                u.trace("Removing connection which is not in the connections collection! Possible no handshake recieved! {}", webSocket);
                zRemove = false;
            }
        }
        if (this.o.get() && this.i.isEmpty()) {
            this.n.interrupt();
        }
        return zRemove;
    }

    @Override // java.lang.Runnable
    public void run() {
        SelectionKey selectionKey;
        if (l() && o()) {
            int i = 0;
            int i2 = 5;
            while (!this.n.isInterrupted() && i2 != 0) {
                try {
                    try {
                        try {
                            try {
                                if (this.o.get()) {
                                    i = 5;
                                }
                                if (this.l.select(i) == 0 && this.o.get()) {
                                    i2--;
                                }
                                Iterator<SelectionKey> it2 = this.l.selectedKeys().iterator();
                                selectionKey = null;
                                while (it2.hasNext()) {
                                    try {
                                        SelectionKey next = it2.next();
                                        try {
                                            if (next.isValid()) {
                                                if (next.isAcceptable()) {
                                                    i(next, it2);
                                                } else if ((!next.isReadable() || m(next, it2)) && next.isWritable()) {
                                                    p(next);
                                                }
                                            }
                                            selectionKey = next;
                                        } catch (IOException e) {
                                            e = e;
                                            selectionKey = next;
                                            if (selectionKey != null) {
                                                selectionKey.cancel();
                                            }
                                            t(selectionKey, null, e);
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                    }
                                }
                                j();
                            } catch (IOException e3) {
                                e = e3;
                                selectionKey = null;
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        } catch (CancelledKeyException unused2) {
                        } catch (ClosedByInterruptException unused3) {
                            n();
                            return;
                        }
                    } catch (Throwable th) {
                        n();
                        throw th;
                    }
                } catch (RuntimeException e4) {
                    s(null, e4);
                }
            }
            n();
        }
    }

    public final void setWebSocketFactory(WebSocketServerFactory webSocketServerFactory) {
        WebSocketServerFactory webSocketServerFactory2 = this.t;
        if (webSocketServerFactory2 != null) {
            webSocketServerFactory2.close();
        }
        this.t = webSocketServerFactory;
    }

    public void start() {
        if (this.n == null) {
            new Thread(this).start();
            return;
        }
        throw new IllegalStateException(getClass().getName() + " can only be started once.");
    }

    public void stop(int i) throws InterruptedException {
        ArrayList arrayList;
        Selector selector;
        if (this.o.compareAndSet(false, true)) {
            synchronized (this.i) {
                arrayList = new ArrayList(this.i);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((WebSocket) it2.next()).close(1001);
            }
            this.t.close();
            synchronized (this) {
                if (this.n != null && (selector = this.l) != null) {
                    selector.wakeup();
                    this.n.join(i);
                }
            }
        }
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, v, null);
    }

    public void broadcast(byte[] bArr) {
        broadcast(bArr, this.i);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        onMessage(webSocket, byteBuffer);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null);
    }

    public void broadcast(ByteBuffer byteBuffer) {
        broadcast(byteBuffer, this.i);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, List<Draft> list) {
        this(inetSocketAddress, v, list);
    }

    public void broadcast(byte[] bArr, Collection<WebSocket> collection) {
        if (bArr != null && collection != null) {
            broadcast(ByteBuffer.wrap(bArr), collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i, List<Draft> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i, List<Draft> list, Collection<WebSocket> collection) {
        this.o = new AtomicBoolean(false);
        this.r = 0;
        this.s = new AtomicInteger(0);
        this.t = new DefaultWebSocketServerFactory();
        if (inetSocketAddress != null && i >= 1 && collection != null) {
            if (list == null) {
                this.m = Collections.emptyList();
            } else {
                this.m = list;
            }
            this.j = inetSocketAddress;
            this.i = collection;
            setTcpNoDelay(false);
            setReuseAddr(false);
            this.p = new LinkedList();
            this.decoders = new ArrayList(i);
            this.q = new LinkedBlockingQueue();
            for (int i2 = 0; i2 < i; i2++) {
                this.decoders.add(new WebSocketWorker());
            }
            return;
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }

    public void broadcast(ByteBuffer byteBuffer, Collection<WebSocket> collection) {
        if (byteBuffer != null && collection != null) {
            k(byteBuffer, collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void broadcast(String str, Collection<WebSocket> collection) {
        if (str != null && collection != null) {
            k(str, collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void stop() throws InterruptedException, IOException {
        stop(0);
    }
}
