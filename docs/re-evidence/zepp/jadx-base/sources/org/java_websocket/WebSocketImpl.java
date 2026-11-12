package org.java_websocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.enums.Opcode;
import org.java_websocket.enums.ReadyState;
import org.java_websocket.enums.Role;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.CloseFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.Handshakedata;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.util.Charsetfunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes23.dex */
public class WebSocketImpl implements WebSocket {
    public static final int DEFAULT_PORT = 80;
    public static final int DEFAULT_WSS_PORT = 443;
    public static final int RCVBUF = 16384;
    private static final Logger t = LoggerFactory.getLogger((Class<?>) WebSocketImpl.class);
    public static final /* synthetic */ boolean u = false;
    private final WebSocketListener a;
    private SelectionKey b;
    private ByteChannel c;
    private WebSocketServer.WebSocketWorker d;
    private boolean e;
    private volatile ReadyState f;
    private List<Draft> g;
    private Draft h;
    private Role i;
    public final BlockingQueue<ByteBuffer> inQueue;
    private ByteBuffer j;
    private ClientHandshake k;
    private String l;
    private Integer m;
    private Boolean n;
    private String o;
    public final BlockingQueue<ByteBuffer> outQueue;
    private long p;
    private final Object q;
    private PingFrame r;
    private Object s;

    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list) {
        this(webSocketListener, (Draft) null);
        this.i = Role.SERVER;
        if (list != null && !list.isEmpty()) {
            this.g = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.add(new Draft_6455());
    }

    private void a(RuntimeException runtimeException) {
        i(e(500));
        flushAndClose(-1, runtimeException.getMessage(), false);
    }

    private void b(InvalidDataException invalidDataException) {
        i(e(404));
        flushAndClose(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    private void c(ByteBuffer byteBuffer) {
        try {
            for (Framedata framedata : this.h.translateFrame(byteBuffer)) {
                t.trace("matched frame: {}", framedata);
                this.h.processFrame(this, framedata);
            }
        } catch (LimitExceededException e) {
            if (e.getLimit() == Integer.MAX_VALUE) {
                t.error("Closing due to invalid size of frame", (Throwable) e);
                this.a.onWebsocketError(this, e);
            }
            close(e);
        } catch (InvalidDataException e2) {
            t.error("Closing due to invalid data in frame", (Throwable) e2);
            this.a.onWebsocketError(this, e2);
            close(e2);
        }
    }

    private boolean d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.j.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.j.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.j.capacity() + byteBuffer.remaining());
                this.j.flip();
                byteBufferAllocate.put(this.j);
                this.j = byteBufferAllocate;
            }
            this.j.put(byteBuffer);
            this.j.flip();
            byteBuffer2 = this.j;
        }
        byteBuffer2.mark();
        try {
            try {
                Role role = this.i;
                if (role != Role.SERVER) {
                    if (role == Role.CLIENT) {
                        this.h.setParseMode(role);
                        Handshakedata handshakedataTranslateHandshake = this.h.translateHandshake(byteBuffer2);
                        if (!(handshakedataTranslateHandshake instanceof ServerHandshake)) {
                            t.trace("Closing due to protocol error: wrong http function");
                            flushAndClose(1002, "wrong http function", false);
                            return false;
                        }
                        ServerHandshake serverHandshake = (ServerHandshake) handshakedataTranslateHandshake;
                        if (this.h.acceptHandshakeAsClient(this.k, serverHandshake) == HandshakeState.MATCHED) {
                            try {
                                this.a.onWebsocketHandshakeReceivedAsClient(this, this.k, serverHandshake);
                                g(serverHandshake);
                                return true;
                            } catch (RuntimeException e) {
                                t.error("Closing since client was never connected", (Throwable) e);
                                this.a.onWebsocketError(this, e);
                                flushAndClose(-1, e.getMessage(), false);
                                return false;
                            } catch (InvalidDataException e2) {
                                t.trace("Closing due to invalid data exception. Possible handshake rejection", (Throwable) e2);
                                flushAndClose(e2.getCloseCode(), e2.getMessage(), false);
                                return false;
                            }
                        }
                        t.trace("Closing due to protocol error: draft {} refuses handshake", this.h);
                        close(1002, "draft " + this.h + " refuses handshake");
                    }
                    return false;
                }
                Draft draft = this.h;
                if (draft != null) {
                    Handshakedata handshakedataTranslateHandshake2 = draft.translateHandshake(byteBuffer2);
                    if (!(handshakedataTranslateHandshake2 instanceof ClientHandshake)) {
                        t.trace("Closing due to protocol error: wrong http function");
                        flushAndClose(1002, "wrong http function", false);
                        return false;
                    }
                    ClientHandshake clientHandshake = (ClientHandshake) handshakedataTranslateHandshake2;
                    if (this.h.acceptHandshakeAsServer(clientHandshake) == HandshakeState.MATCHED) {
                        g(clientHandshake);
                        return true;
                    }
                    t.trace("Closing due to protocol error: the handshake did finally not match");
                    close(1002, "the handshake did finally not match");
                    return false;
                }
                Iterator<Draft> it2 = this.g.iterator();
                while (it2.hasNext()) {
                    Draft draftCopyInstance = it2.next().copyInstance();
                    try {
                        draftCopyInstance.setParseMode(this.i);
                        byteBuffer2.reset();
                        Handshakedata handshakedataTranslateHandshake3 = draftCopyInstance.translateHandshake(byteBuffer2);
                        if (!(handshakedataTranslateHandshake3 instanceof ClientHandshake)) {
                            t.trace("Closing due to wrong handshake");
                            b(new InvalidDataException(1002, "wrong http function"));
                            return false;
                        }
                        ClientHandshake clientHandshake2 = (ClientHandshake) handshakedataTranslateHandshake3;
                        if (draftCopyInstance.acceptHandshakeAsServer(clientHandshake2) == HandshakeState.MATCHED) {
                            this.o = clientHandshake2.getResourceDescriptor();
                            try {
                                j(draftCopyInstance.createHandshake(draftCopyInstance.postProcessHandshakeResponseAsServer(clientHandshake2, this.a.onWebsocketHandshakeReceivedAsServer(this, draftCopyInstance, clientHandshake2))));
                                this.h = draftCopyInstance;
                                g(clientHandshake2);
                                return true;
                            } catch (RuntimeException e3) {
                                t.error("Closing due to internal server error", (Throwable) e3);
                                this.a.onWebsocketError(this, e3);
                                a(e3);
                                return false;
                            } catch (InvalidDataException e4) {
                                t.trace("Closing due to wrong handshake. Possible handshake rejection", (Throwable) e4);
                                b(e4);
                                return false;
                            }
                        }
                    } catch (InvalidHandshakeException unused) {
                    }
                }
                if (this.h == null) {
                    t.trace("Closing due to protocol error: no draft matches");
                    b(new InvalidDataException(1002, "no draft matches"));
                }
                return false;
            } catch (IncompleteHandshakeException e5) {
                if (this.j.capacity() == 0) {
                    byteBuffer2.reset();
                    int preferredSize = e5.getPreferredSize();
                    if (preferredSize == 0) {
                        preferredSize = byteBuffer2.capacity() + 16;
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(preferredSize);
                    this.j = byteBufferAllocate2;
                    byteBufferAllocate2.put(byteBuffer);
                } else {
                    ByteBuffer byteBuffer3 = this.j;
                    byteBuffer3.position(byteBuffer3.limit());
                    ByteBuffer byteBuffer4 = this.j;
                    byteBuffer4.limit(byteBuffer4.capacity());
                }
            }
        } catch (InvalidHandshakeException e6) {
            t.trace("Closing due to invalid handshake", (Throwable) e6);
            close(e6);
        }
    }

    private ByteBuffer e(int i) {
        String str = i != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(Charsetfunctions.asciiBytes("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    private void g(Handshakedata handshakedata) {
        t.trace("open using draft: {}", this.h);
        this.f = ReadyState.OPEN;
        try {
            this.a.onWebsocketOpen(this, handshakedata);
        } catch (RuntimeException e) {
            this.a.onWebsocketError(this, e);
        }
    }

    private void h(Collection<Framedata> collection) {
        if (!isOpen()) {
            throw new WebsocketNotConnectedException();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (Framedata framedata : collection) {
            t.trace("send frame: {}", framedata);
            arrayList.add(this.h.createBinaryFrame(framedata));
        }
        j(arrayList);
    }

    private void i(ByteBuffer byteBuffer) {
        t.trace("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
        this.outQueue.add(byteBuffer);
        this.a.onWriteDemand(this);
    }

    private void j(List<ByteBuffer> list) {
        synchronized (this.q) {
            Iterator<ByteBuffer> it2 = list.iterator();
            while (it2.hasNext()) {
                i(it2.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d A[Catch: InvalidDataException -> 0x004f, all -> 0x0084, TRY_LEAVE, TryCatch #2 {InvalidDataException -> 0x004f, blocks: (B:17:0x002b, B:21:0x0037, B:23:0x003d, B:20:0x0032), top: B:44:0x002b, outer: #0 }] */
    public synchronized void close(int i, String str, boolean z) {
        ReadyState readyState = this.f;
        ReadyState readyState2 = ReadyState.CLOSING;
        if (readyState == readyState2 || this.f == ReadyState.CLOSED) {
            return;
        }
        if (this.f == ReadyState.OPEN) {
            if (i == 1006) {
                this.f = readyState2;
                flushAndClose(i, str, false);
                return;
            }
            if (this.h.getCloseHandshakeType() != CloseHandshakeType.NONE) {
                if (!z) {
                    try {
                        try {
                            this.a.onWebsocketCloseInitiated(this, i, str);
                        } catch (RuntimeException e) {
                            this.a.onWebsocketError(this, e);
                        }
                        if (isOpen()) {
                            CloseFrame closeFrame = new CloseFrame();
                            closeFrame.setReason(str);
                            closeFrame.setCode(i);
                            closeFrame.isValid();
                            sendFrame(closeFrame);
                        }
                    } catch (InvalidDataException e2) {
                        t.error("generated frame is invalid", (Throwable) e2);
                        this.a.onWebsocketError(this, e2);
                        flushAndClose(1006, "generated frame is invalid", false);
                    }
                } else if (isOpen()) {
                    CloseFrame closeFrame2 = new CloseFrame();
                    closeFrame2.setReason(str);
                    closeFrame2.setCode(i);
                    closeFrame2.isValid();
                    sendFrame(closeFrame2);
                }
            }
            flushAndClose(i, str, z);
        } else if (i == -3) {
            flushAndClose(-3, str, true);
        } else if (i == 1002) {
            flushAndClose(i, str, z);
        } else {
            flushAndClose(-1, str, false);
        }
        this.f = ReadyState.CLOSING;
        this.j = null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0013, B:12:0x0017, B:14:0x001b, B:15:0x001e, B:17:0x0022, B:24:0x0047, B:28:0x0053, B:30:0x0057, B:31:0x005a, B:27:0x004e, B:20:0x0027, B:22:0x0033, B:23:0x003b), top: B:37:0x0001, inners: #1, #2 }] */
    public synchronized void closeConnection(int i, String str, boolean z) {
        Draft draft;
        if (this.f == ReadyState.CLOSED) {
            return;
        }
        if (this.f == ReadyState.OPEN && i == 1006) {
            this.f = ReadyState.CLOSING;
        }
        SelectionKey selectionKey = this.b;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        ByteChannel byteChannel = this.c;
        if (byteChannel == null) {
            this.a.onWebsocketClose(this, i, str, z);
            draft = this.h;
            if (draft != null) {
                draft.reset();
            }
            this.k = null;
            this.f = ReadyState.CLOSED;
            return;
        }
        try {
            byteChannel.close();
        } catch (IOException e) {
            if (e.getMessage().equals("Broken pipe")) {
                t.trace("Caught IOException: Broken pipe during closeConnection()", (Throwable) e);
            } else {
                t.error("Exception during channel.close()", (Throwable) e);
                this.a.onWebsocketError(this, e);
            }
        }
        try {
            this.a.onWebsocketClose(this, i, str, z);
        } catch (RuntimeException e2) {
            this.a.onWebsocketError(this, e2);
        }
        draft = this.h;
        if (draft != null) {
            draft.reset();
        }
        this.k = null;
        this.f = ReadyState.CLOSED;
        return;
        throw th;
    }

    public void decode(ByteBuffer byteBuffer) {
        t.trace("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        if (this.f != ReadyState.NOT_YET_CONNECTED) {
            if (this.f == ReadyState.OPEN) {
                c(byteBuffer);
            }
        } else {
            if (!d(byteBuffer) || isClosing() || isClosed()) {
                return;
            }
            if (byteBuffer.hasRemaining()) {
                c(byteBuffer);
            } else if (this.j.hasRemaining()) {
                c(this.j);
            }
        }
    }

    public void eot() {
        if (this.f == ReadyState.NOT_YET_CONNECTED) {
            closeConnection(-1, true);
            return;
        }
        if (this.e) {
            closeConnection(this.m.intValue(), this.l, this.n.booleanValue());
            return;
        }
        if (this.h.getCloseHandshakeType() == CloseHandshakeType.NONE) {
            closeConnection(1000, true);
            return;
        }
        if (this.h.getCloseHandshakeType() != CloseHandshakeType.ONEWAY) {
            closeConnection(1006, true);
        } else if (this.i == Role.SERVER) {
            closeConnection(1006, true);
        } else {
            closeConnection(1000, true);
        }
    }

    public long f() {
        return this.p;
    }

    public synchronized void flushAndClose(int i, String str, boolean z) {
        if (this.e) {
            return;
        }
        this.m = Integer.valueOf(i);
        this.l = str;
        this.n = Boolean.valueOf(z);
        this.e = true;
        this.a.onWriteDemand(this);
        try {
            this.a.onWebsocketClosing(this, i, str, z);
        } catch (RuntimeException e) {
            t.error("Exception in onWebsocketClosing", (Throwable) e);
            this.a.onWebsocketError(this, e);
        }
        Draft draft = this.h;
        if (draft != null) {
            draft.reset();
        }
        this.k = null;
    }

    @Override // org.java_websocket.WebSocket
    public <T> T getAttachment() {
        return (T) this.s;
    }

    public ByteChannel getChannel() {
        return this.c;
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        return this.h;
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress(this);
    }

    @Override // org.java_websocket.WebSocket
    public ReadyState getReadyState() {
        return this.f;
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.a.getRemoteSocketAddress(this);
    }

    @Override // org.java_websocket.WebSocket
    public String getResourceDescriptor() {
        return this.o;
    }

    public SelectionKey getSelectionKey() {
        return this.b;
    }

    public WebSocketListener getWebSocketListener() {
        return this.a;
    }

    public WebSocketServer.WebSocketWorker getWorkerThread() {
        return this.d;
    }

    @Override // org.java_websocket.WebSocket
    public boolean hasBufferedData() {
        return !this.outQueue.isEmpty();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        return this.f == ReadyState.CLOSED;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        return this.f == ReadyState.CLOSING;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isFlushAndClose() {
        return this.e;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        return this.f == ReadyState.OPEN;
    }

    @Override // org.java_websocket.WebSocket
    public void send(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        h(this.h.createFrames(str, this.i == Role.CLIENT));
    }

    @Override // org.java_websocket.WebSocket
    public void sendFragmentedFrame(Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        h(this.h.continuousFrame(opcode, byteBuffer, z));
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        h(collection);
    }

    @Override // org.java_websocket.WebSocket
    public void sendPing() {
        if (this.r == null) {
            this.r = new PingFrame();
        }
        sendFrame(this.r);
    }

    @Override // org.java_websocket.WebSocket
    public <T> void setAttachment(T t2) {
        this.s = t2;
    }

    public void setChannel(ByteChannel byteChannel) {
        this.c = byteChannel;
    }

    public void setSelectionKey(SelectionKey selectionKey) {
        this.b = selectionKey;
    }

    public void setWorkerThread(WebSocketServer.WebSocketWorker webSocketWorker) {
        this.d = webSocketWorker;
    }

    public void startHandshake(ClientHandshakeBuilder clientHandshakeBuilder) throws InvalidHandshakeException {
        this.k = this.h.postProcessHandshakeRequestAsClient(clientHandshakeBuilder);
        this.o = clientHandshakeBuilder.getResourceDescriptor();
        try {
            this.a.onWebsocketHandshakeSentAsClient(this, this.k);
            j(this.h.createHandshake(this.k));
        } catch (RuntimeException e) {
            t.error("Exception in startHandshake", (Throwable) e);
            this.a.onWebsocketError(this, e);
            throw new InvalidHandshakeException("rejected because of " + e);
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
    }

    public String toString() {
        return super.toString();
    }

    public void updateLastPong() {
        this.p = System.currentTimeMillis();
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        h(Collections.singletonList(framedata));
    }

    @Override // org.java_websocket.WebSocket
    public void send(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        h(this.h.createFrames(byteBuffer, this.i == Role.CLIENT));
    }

    @Override // org.java_websocket.WebSocket
    public void send(byte[] bArr) {
        send(ByteBuffer.wrap(bArr));
    }

    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft) {
        this.e = false;
        this.f = ReadyState.NOT_YET_CONNECTED;
        this.h = null;
        this.j = ByteBuffer.allocate(0);
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = System.currentTimeMillis();
        this.q = new Object();
        if (webSocketListener != null && (draft != null || this.i != Role.SERVER)) {
            this.outQueue = new LinkedBlockingQueue();
            this.inQueue = new LinkedBlockingQueue();
            this.a = webSocketListener;
            this.i = Role.CLIENT;
            if (draft != null) {
                this.h = draft.copyInstance();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    public void closeConnection(int i, boolean z) {
        closeConnection(i, "", z);
    }

    public void closeConnection() {
        if (this.n != null) {
            closeConnection(this.m.intValue(), this.l, this.n.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        closeConnection(i, str, false);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i, String str) {
        close(i, str, false);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        close(i, "", false);
    }

    public void close(InvalidDataException invalidDataException) {
        close(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    @Override // org.java_websocket.WebSocket
    public void close() {
        close(1000);
    }
}
