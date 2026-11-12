package org.java_websocket.drafts;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import okhttp3.internal.ws.WebSocketProtocol;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.enums.Opcode;
import org.java_websocket.enums.ReadyState;
import org.java_websocket.enums.Role;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.NotSendableException;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.framing.BinaryFrame;
import org.java_websocket.framing.CloseFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.FramedataImpl1;
import org.java_websocket.framing.TextFrame;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.HandshakeBuilder;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.handshake.ServerHandshakeBuilder;
import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.java_websocket.util.Base64;
import org.java_websocket.util.Charsetfunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes23.dex */
public class Draft_6455 extends Draft {
    private static final String j = "Sec-WebSocket-Key";
    private static final String k = "Sec-WebSocket-Protocol";
    private static final String l = "Sec-WebSocket-Extensions";
    private static final String m = "Sec-WebSocket-Accept";
    private static final String n = "Upgrade";
    private static final String o = "Connection";
    private static final Logger p = LoggerFactory.getLogger((Class<?>) Draft_6455.class);
    public static final /* synthetic */ boolean q = false;
    private IExtension a;
    private List<IExtension> b;
    private IProtocol c;
    private List<IProtocol> d;
    private Framedata e;
    private final List<ByteBuffer> f;
    private ByteBuffer g;
    private final Random h;
    private int i;

    public class a {
        private int a;
        private int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.b;
        }
    }

    public Draft_6455() {
        this((List<IExtension>) Collections.emptyList());
    }

    private void A(int i, int i2) throws IncompleteException {
        if (i >= i2) {
            return;
        }
        p.trace("Incomplete frame: maxpacketsize < realpacketsize");
        throw new IncompleteException(i2);
    }

    private a B(ByteBuffer byteBuffer, Opcode opcode, int i, int i2, int i3) throws IncompleteException, LimitExceededException, InvalidFrameException {
        int i4;
        int iIntValue;
        if (opcode == Opcode.PING || opcode == Opcode.PONG || opcode == Opcode.CLOSING) {
            p.trace("Invalid frame: more than 125 octets");
            throw new InvalidFrameException("more than 125 octets");
        }
        if (i == 126) {
            i4 = i3 + 2;
            A(i2, i4);
            iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
        } else {
            i4 = i3 + 8;
            A(i2, i4);
            byte[] bArr = new byte[8];
            for (int i5 = 0; i5 < 8; i5++) {
                bArr[i5] = byteBuffer.get();
            }
            long jLongValue = new BigInteger(bArr).longValue();
            z(jLongValue);
            iIntValue = (int) jLongValue;
        }
        return new a(iIntValue, i4);
    }

    private void d(ByteBuffer byteBuffer) {
        synchronized (this.f) {
            this.f.add(byteBuffer);
        }
    }

    private void e() throws LimitExceededException {
        long jK = k();
        if (jK <= this.i) {
            return;
        }
        f();
        p.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.i), Long.valueOf(jK));
        throw new LimitExceededException(this.i);
    }

    private void f() {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    private HandshakeState g(String str) {
        for (IProtocol iProtocol : this.d) {
            if (iProtocol.acceptProvidedProtocol(str)) {
                this.c = iProtocol;
                p.trace("acceptHandshake - Matching protocol found: {}", iProtocol);
                return HandshakeState.MATCHED;
            }
        }
        return HandshakeState.NOT_MATCHED;
    }

    private ByteBuffer h(Framedata framedata) {
        ByteBuffer payloadData = framedata.getPayloadData();
        int i = 0;
        boolean z = this.role == Role.CLIENT;
        int iO = o(payloadData);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iO > 1 ? iO + 1 : iO) + 1 + (z ? 4 : 0) + payloadData.remaining());
        byteBufferAllocate.put((byte) (((byte) (framedata.isFin() ? com.alipay.sdk.m.n.a.g : 0)) | i(framedata.getOpcode())));
        byte[] bArrW = w(payloadData.remaining(), iO);
        if (iO == 1) {
            byteBufferAllocate.put((byte) (bArrW[0] | l(z)));
        } else if (iO == 2) {
            byteBufferAllocate.put((byte) (l(z) | 126));
            byteBufferAllocate.put(bArrW);
        } else {
            if (iO != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            byteBufferAllocate.put((byte) (l(z) | 127));
            byteBufferAllocate.put(bArrW);
        }
        if (z) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.h.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (payloadData.hasRemaining()) {
                byteBufferAllocate.put((byte) (payloadData.get() ^ byteBufferAllocate2.get(i % 4)));
                i++;
            }
        } else {
            byteBufferAllocate.put(payloadData);
            payloadData.flip();
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private byte i(Opcode opcode) {
        if (opcode == Opcode.CONTINUOUS) {
            return (byte) 0;
        }
        if (opcode == Opcode.TEXT) {
            return (byte) 1;
        }
        if (opcode == Opcode.BINARY) {
            return (byte) 2;
        }
        if (opcode == Opcode.CLOSING) {
            return (byte) 8;
        }
        if (opcode == Opcode.PING) {
            return (byte) 9;
        }
        if (opcode == Opcode.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + opcode.toString());
    }

    private String j(String str) {
        try {
            return Base64.encodeBytes(MessageDigest.getInstance("SHA1").digest((str.trim() + WebSocketProtocol.a).getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private long k() {
        long jLimit;
        synchronized (this.f) {
            Iterator<ByteBuffer> it2 = this.f.iterator();
            jLimit = 0;
            while (it2.hasNext()) {
                jLimit += (long) it2.next().limit();
            }
        }
        return jLimit;
    }

    private byte l(boolean z) {
        return z ? (byte) -128 : (byte) 0;
    }

    private ByteBuffer m() throws LimitExceededException {
        ByteBuffer byteBufferAllocate;
        synchronized (this.f) {
            Iterator<ByteBuffer> it2 = this.f.iterator();
            long jLimit = 0;
            while (it2.hasNext()) {
                jLimit += (long) it2.next().limit();
            }
            e();
            byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
            Iterator<ByteBuffer> it3 = this.f.iterator();
            while (it3.hasNext()) {
                byteBufferAllocate.put(it3.next());
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private String n() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private int o(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        return byteBuffer.remaining() <= 65535 ? 2 : 8;
    }

    private void p(WebSocketImpl webSocketImpl, RuntimeException runtimeException) {
        p.error("Runtime exception during onWebsocketMessage", (Throwable) runtimeException);
        webSocketImpl.getWebSocketListener().onWebsocketError(webSocketImpl, runtimeException);
    }

    private void q(WebSocketImpl webSocketImpl, Framedata framedata) {
        try {
            webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, framedata.getPayloadData());
        } catch (RuntimeException e) {
            p(webSocketImpl, e);
        }
    }

    private void r(WebSocketImpl webSocketImpl, Framedata framedata) {
        int closeCode;
        String message;
        if (framedata instanceof CloseFrame) {
            CloseFrame closeFrame = (CloseFrame) framedata;
            closeCode = closeFrame.getCloseCode();
            message = closeFrame.getMessage();
        } else {
            closeCode = 1005;
            message = "";
        }
        if (webSocketImpl.getReadyState() == ReadyState.CLOSING) {
            webSocketImpl.closeConnection(closeCode, message, true);
        } else if (getCloseHandshakeType() == CloseHandshakeType.TWOWAY) {
            webSocketImpl.close(closeCode, message, true);
        } else {
            webSocketImpl.flushAndClose(closeCode, message, false);
        }
    }

    private void s(WebSocketImpl webSocketImpl, Framedata framedata, Opcode opcode) throws InvalidDataException {
        Opcode opcode2 = Opcode.CONTINUOUS;
        if (opcode != opcode2) {
            u(framedata);
        } else if (framedata.isFin()) {
            t(webSocketImpl, framedata);
        } else if (this.e == null) {
            p.error("Protocol error: Continuous frame sequence was not started.");
            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        }
        if (opcode == Opcode.TEXT && !Charsetfunctions.isValidUTF8(framedata.getPayloadData())) {
            p.error("Protocol error: Payload is not UTF8");
            throw new InvalidDataException(1007);
        }
        if (opcode != opcode2 || this.e == null) {
            return;
        }
        d(framedata.getPayloadData());
    }

    private void t(WebSocketImpl webSocketImpl, Framedata framedata) throws InvalidDataException {
        if (this.e == null) {
            p.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        }
        d(framedata.getPayloadData());
        e();
        if (this.e.getOpcode() == Opcode.TEXT) {
            ((FramedataImpl1) this.e).setPayload(m());
            ((FramedataImpl1) this.e).isValid();
            try {
                webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, Charsetfunctions.stringUtf8(this.e.getPayloadData()));
            } catch (RuntimeException e) {
                p(webSocketImpl, e);
            }
        } else if (this.e.getOpcode() == Opcode.BINARY) {
            ((FramedataImpl1) this.e).setPayload(m());
            ((FramedataImpl1) this.e).isValid();
            try {
                webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, this.e.getPayloadData());
            } catch (RuntimeException e2) {
                p(webSocketImpl, e2);
            }
        }
        this.e = null;
        f();
    }

    private void u(Framedata framedata) throws InvalidDataException {
        if (this.e != null) {
            p.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
        }
        this.e = framedata;
        d(framedata.getPayloadData());
        e();
    }

    private void v(WebSocketImpl webSocketImpl, Framedata framedata) throws InvalidDataException {
        try {
            webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, Charsetfunctions.stringUtf8(framedata.getPayloadData()));
        } catch (RuntimeException e) {
            p(webSocketImpl, e);
        }
    }

    private byte[] w(long j2, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j2 >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    private Opcode x(byte b) throws InvalidFrameException {
        if (b == 0) {
            return Opcode.CONTINUOUS;
        }
        if (b == 1) {
            return Opcode.TEXT;
        }
        if (b == 2) {
            return Opcode.BINARY;
        }
        switch (b) {
            case 8:
                return Opcode.CLOSING;
            case 9:
                return Opcode.PING;
            case 10:
                return Opcode.PONG;
            default:
                throw new InvalidFrameException("Unknown opcode " + ((int) b));
        }
    }

    private Framedata y(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int iRemaining = byteBuffer.remaining();
        int iD = 2;
        A(iRemaining, 2);
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & (-128)) != 0;
        int iC = (byte) (b2 & 127);
        Opcode opcodeX = x((byte) (b & 15));
        if (iC < 0 || iC > 125) {
            a aVarB = B(byteBuffer, opcodeX, iC, iRemaining, 2);
            iC = aVarB.c();
            iD = aVarB.d();
        }
        z(iC);
        A(iRemaining, iD + (z5 ? 4 : 0) + iC);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(checkAlloc(iC));
        if (z5) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            for (int i = 0; i < iC; i++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr[i % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        FramedataImpl1 framedataImpl1 = FramedataImpl1.get(opcodeX);
        framedataImpl1.setFin(z);
        framedataImpl1.setRSV1(z2);
        framedataImpl1.setRSV2(z3);
        framedataImpl1.setRSV3(z4);
        byteBufferAllocate.flip();
        framedataImpl1.setPayload(byteBufferAllocate);
        getExtension().isFrameValid(framedataImpl1);
        getExtension().decodeFrame(framedataImpl1);
        Logger logger = p;
        if (logger.isTraceEnabled()) {
            logger.trace("afterDecoding({}): {}", Integer.valueOf(framedataImpl1.getPayloadData().remaining()), framedataImpl1.getPayloadData().remaining() > 1000 ? "too big to display" : new String(framedataImpl1.getPayloadData().array()));
        }
        framedataImpl1.isValid();
        return framedataImpl1;
    }

    private void z(long j2) throws LimitExceededException {
        if (j2 > ParserMinimalBase.MAX_INT_L) {
            p.trace("Limit exedeed: Payloadsize is to big...");
            throw new LimitExceededException("Payloadsize is to big...");
        }
        int i = this.i;
        if (j2 > i) {
            p.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j2));
            throw new LimitExceededException("Payload limit reached.", this.i);
        }
        if (j2 >= 0) {
            return;
        }
        p.trace("Limit underflow: Payloadsize is to little...");
        throw new LimitExceededException("Payloadsize is to little...");
    }

    @Override // org.java_websocket.drafts.Draft
    public HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) throws InvalidHandshakeException {
        if (!basicAccept(serverHandshake)) {
            p.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return HandshakeState.NOT_MATCHED;
        }
        if (!clientHandshake.hasFieldValue(j) || !serverHandshake.hasFieldValue(m)) {
            p.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return HandshakeState.NOT_MATCHED;
        }
        if (!j(clientHandshake.getFieldValue(j)).equals(serverHandshake.getFieldValue(m))) {
            p.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return HandshakeState.NOT_MATCHED;
        }
        HandshakeState handshakeState = HandshakeState.NOT_MATCHED;
        String fieldValue = serverHandshake.getFieldValue(l);
        for (IExtension iExtension : this.b) {
            if (iExtension.acceptProvidedExtensionAsClient(fieldValue)) {
                this.a = iExtension;
                handshakeState = HandshakeState.MATCHED;
                p.trace("acceptHandshakeAsClient - Matching extension found: {}", iExtension);
                break;
            }
        }
        HandshakeState handshakeStateG = g(serverHandshake.getFieldValue(k));
        HandshakeState handshakeState2 = HandshakeState.MATCHED;
        if (handshakeStateG == handshakeState2 && handshakeState == handshakeState2) {
            return handshakeState2;
        }
        p.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
        return HandshakeState.NOT_MATCHED;
    }

    @Override // org.java_websocket.drafts.Draft
    public HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) throws InvalidHandshakeException {
        if (a(clientHandshake) != 13) {
            p.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return HandshakeState.NOT_MATCHED;
        }
        HandshakeState handshakeState = HandshakeState.NOT_MATCHED;
        String fieldValue = clientHandshake.getFieldValue(l);
        for (IExtension iExtension : this.b) {
            if (iExtension.acceptProvidedExtensionAsServer(fieldValue)) {
                this.a = iExtension;
                handshakeState = HandshakeState.MATCHED;
                p.trace("acceptHandshakeAsServer - Matching extension found: {}", iExtension);
                break;
            }
        }
        HandshakeState handshakeStateG = g(clientHandshake.getFieldValue(k));
        HandshakeState handshakeState2 = HandshakeState.MATCHED;
        if (handshakeStateG == handshakeState2 && handshakeState == handshakeState2) {
            return handshakeState2;
        }
        p.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return HandshakeState.NOT_MATCHED;
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft copyInstance() {
        ArrayList arrayList = new ArrayList();
        Iterator<IExtension> it2 = getKnownExtensions().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().copyInstance());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<IProtocol> it3 = getKnownProtocols().iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().copyInstance());
        }
        return new Draft_6455(arrayList, arrayList2, this.i);
    }

    @Override // org.java_websocket.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        getExtension().encodeFrame(framedata);
        Logger logger = p;
        if (logger.isTraceEnabled()) {
            logger.trace("afterEnconding({}): {}", Integer.valueOf(framedata.getPayloadData().remaining()), framedata.getPayloadData().remaining() > 1000 ? "too big to display" : new String(framedata.getPayloadData().array()));
        }
        return h(framedata);
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        BinaryFrame binaryFrame = new BinaryFrame();
        binaryFrame.setPayload(byteBuffer);
        binaryFrame.setTransferemasked(z);
        try {
            binaryFrame.isValid();
            return Collections.singletonList(binaryFrame);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Draft_6455 draft_6455 = (Draft_6455) obj;
        if (this.i != draft_6455.getMaxFrameSize()) {
            return false;
        }
        IExtension iExtension = this.a;
        if (iExtension == null ? draft_6455.getExtension() != null : !iExtension.equals(draft_6455.getExtension())) {
            return false;
        }
        IProtocol iProtocol = this.c;
        IProtocol protocol = draft_6455.getProtocol();
        if (iProtocol != null) {
            return iProtocol.equals(protocol);
        }
        return protocol == null;
    }

    @Override // org.java_websocket.drafts.Draft
    public CloseHandshakeType getCloseHandshakeType() {
        return CloseHandshakeType.TWOWAY;
    }

    public IExtension getExtension() {
        return this.a;
    }

    public List<IExtension> getKnownExtensions() {
        return this.b;
    }

    public List<IProtocol> getKnownProtocols() {
        return this.d;
    }

    public int getMaxFrameSize() {
        return this.i;
    }

    public IProtocol getProtocol() {
        return this.c;
    }

    public int hashCode() {
        IExtension iExtension = this.a;
        int iHashCode = (iExtension != null ? iExtension.hashCode() : 0) * 31;
        IProtocol iProtocol = this.c;
        int iHashCode2 = (iHashCode + (iProtocol != null ? iProtocol.hashCode() : 0)) * 31;
        int i = this.i;
        return iHashCode2 + (i ^ (i >>> 32));
    }

    @Override // org.java_websocket.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        clientHandshakeBuilder.put("Upgrade", "websocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.h.nextBytes(bArr);
        clientHandshakeBuilder.put(j, Base64.encodeBytes(bArr));
        clientHandshakeBuilder.put("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (IExtension iExtension : this.b) {
            if (iExtension.getProvidedExtensionAsClient() != null && iExtension.getProvidedExtensionAsClient().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(iExtension.getProvidedExtensionAsClient());
            }
        }
        if (sb.length() != 0) {
            clientHandshakeBuilder.put(l, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (IProtocol iProtocol : this.d) {
            if (iProtocol.getProvidedProtocol().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(iProtocol.getProvidedProtocol());
            }
        }
        if (sb2.length() != 0) {
            clientHandshakeBuilder.put(k, sb2.toString());
        }
        return clientHandshakeBuilder;
    }

    @Override // org.java_websocket.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) throws InvalidHandshakeException {
        serverHandshakeBuilder.put("Upgrade", "websocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        String fieldValue = clientHandshake.getFieldValue(j);
        if (fieldValue == null) {
            throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
        }
        serverHandshakeBuilder.put(m, j(fieldValue));
        if (getExtension().getProvidedExtensionAsServer().length() != 0) {
            serverHandshakeBuilder.put(l, getExtension().getProvidedExtensionAsServer());
        }
        if (getProtocol() != null && getProtocol().getProvidedProtocol().length() != 0) {
            serverHandshakeBuilder.put(k, getProtocol().getProvidedProtocol());
        }
        serverHandshakeBuilder.setHttpStatusMessage("Web Socket Protocol Handshake");
        serverHandshakeBuilder.put("Server", "TooTallNate Java-WebSocket");
        serverHandshakeBuilder.put("Date", n());
        return serverHandshakeBuilder;
    }

    @Override // org.java_websocket.drafts.Draft
    public void processFrame(WebSocketImpl webSocketImpl, Framedata framedata) throws InvalidDataException {
        Opcode opcode = framedata.getOpcode();
        if (opcode == Opcode.CLOSING) {
            r(webSocketImpl, framedata);
            return;
        }
        if (opcode == Opcode.PING) {
            webSocketImpl.getWebSocketListener().onWebsocketPing(webSocketImpl, framedata);
            return;
        }
        if (opcode == Opcode.PONG) {
            webSocketImpl.updateLastPong();
            webSocketImpl.getWebSocketListener().onWebsocketPong(webSocketImpl, framedata);
            return;
        }
        if (!framedata.isFin() || opcode == Opcode.CONTINUOUS) {
            s(webSocketImpl, framedata, opcode);
            return;
        }
        if (this.e != null) {
            p.error("Protocol error: Continuous frame sequence not completed.");
            throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
        }
        if (opcode == Opcode.TEXT) {
            v(webSocketImpl, framedata);
        } else if (opcode == Opcode.BINARY) {
            q(webSocketImpl, framedata);
        } else {
            p.error("non control or continious frame expected");
            throw new InvalidDataException(1002, "non control or continious frame expected");
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public void reset() {
        this.g = null;
        IExtension iExtension = this.a;
        if (iExtension != null) {
            iExtension.reset();
        }
        this.a = new DefaultExtension();
        this.c = null;
    }

    @Override // org.java_websocket.drafts.Draft
    public String toString() {
        String string = super.toString();
        if (getExtension() != null) {
            string = string + " extension: " + getExtension().toString();
        }
        if (getProtocol() != null) {
            string = string + " protocol: " + getProtocol().toString();
        }
        return string + " max frame size: " + this.i;
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) throws InvalidDataException {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.g == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.g.remaining();
                if (iRemaining2 <= iRemaining) {
                    this.g.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                    byteBuffer.position(byteBuffer.position() + iRemaining2);
                    linkedList.add(y((ByteBuffer) this.g.duplicate().position(0)));
                    this.g = null;
                    break;
                }
                this.g.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                byteBuffer.position(byteBuffer.position() + iRemaining);
                return Collections.emptyList();
            } catch (IncompleteException e) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(checkAlloc(e.getPreferredSize()));
                this.g.rewind();
                byteBufferAllocate.put(this.g);
                this.g = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(y(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(checkAlloc(e2.getPreferredSize()));
                this.g = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public Draft_6455(IExtension iExtension) {
        this((List<IExtension>) Collections.singletonList(iExtension));
    }

    public Draft_6455(List<IExtension> list) {
        this(list, (List<IProtocol>) Collections.singletonList(new Protocol("")));
    }

    public Draft_6455(List<IExtension> list, List<IProtocol> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public Draft_6455(List<IExtension> list, int i) {
        this(list, Collections.singletonList(new Protocol("")), i);
    }

    public Draft_6455(List<IExtension> list, List<IProtocol> list2, int i) {
        this.a = new DefaultExtension();
        this.h = new Random();
        if (list != null && list2 != null && i >= 1) {
            this.b = new ArrayList(list.size());
            this.d = new ArrayList(list2.size());
            boolean z = false;
            this.f = new ArrayList();
            Iterator<IExtension> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getClass().equals(DefaultExtension.class)) {
                    z = true;
                }
            }
            this.b.addAll(list);
            if (!z) {
                List<IExtension> list3 = this.b;
                list3.add(list3.size(), this.a);
            }
            this.d.addAll(list2);
            this.i = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> createFrames(String str, boolean z) {
        TextFrame textFrame = new TextFrame();
        textFrame.setPayload(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(str)));
        textFrame.setTransferemasked(z);
        try {
            textFrame.isValid();
            return Collections.singletonList(textFrame);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }
}
