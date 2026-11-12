package org.java_websocket.framing;

import java.nio.ByteBuffer;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.util.ByteBufferUtils;

/* JADX INFO: loaded from: classes23.dex */
public abstract class FramedataImpl1 implements Framedata {
    private Opcode b;
    private ByteBuffer c = ByteBufferUtils.getEmptyByteBuffer();
    private boolean a = true;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Opcode.values().length];
            a = iArr;
            try {
                iArr[Opcode.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Opcode.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Opcode.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Opcode.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Opcode.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Opcode.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public FramedataImpl1(Opcode opcode) {
        this.b = opcode;
    }

    public static FramedataImpl1 get(Opcode opcode) {
        if (opcode == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (a.a[opcode.ordinal()]) {
            case 1:
                return new PingFrame();
            case 2:
                return new PongFrame();
            case 3:
                return new TextFrame();
            case 4:
                return new BinaryFrame();
            case 5:
                return new CloseFrame();
            case 6:
                return new ContinuousFrame();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }

    @Override // org.java_websocket.framing.Framedata
    public void append(Framedata framedata) {
        ByteBuffer payloadData = framedata.getPayloadData();
        if (this.c == null) {
            this.c = ByteBuffer.allocate(payloadData.remaining());
            payloadData.mark();
            this.c.put(payloadData);
            payloadData.reset();
        } else {
            payloadData.mark();
            ByteBuffer byteBuffer = this.c;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.c;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (payloadData.remaining() > this.c.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(payloadData.remaining() + this.c.capacity());
                this.c.flip();
                byteBufferAllocate.put(this.c);
                byteBufferAllocate.put(payloadData);
                this.c = byteBufferAllocate;
            } else {
                this.c.put(payloadData);
            }
            this.c.rewind();
            payloadData.reset();
        }
        this.a = framedata.isFin();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FramedataImpl1 framedataImpl1 = (FramedataImpl1) obj;
        if (this.a != framedataImpl1.a || this.d != framedataImpl1.d || this.e != framedataImpl1.e || this.f != framedataImpl1.f || this.g != framedataImpl1.g || this.b != framedataImpl1.b) {
            return false;
        }
        ByteBuffer byteBuffer = this.c;
        ByteBuffer byteBuffer2 = framedataImpl1.c;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        return byteBuffer2 == null;
    }

    @Override // org.java_websocket.framing.Framedata
    public Opcode getOpcode() {
        return this.b;
    }

    @Override // org.java_websocket.framing.Framedata
    public ByteBuffer getPayloadData() {
        return this.c;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean getTransfereMasked() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = (((this.a ? 1 : 0) * 31) + this.b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.c;
        return ((((((((iHashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isFin() {
        return this.a;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isRSV1() {
        return this.e;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isRSV2() {
        return this.f;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isRSV3() {
        return this.g;
    }

    public abstract void isValid() throws InvalidDataException;

    public void setFin(boolean z) {
        this.a = z;
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }

    public void setRSV1(boolean z) {
        this.e = z;
    }

    public void setRSV2(boolean z) {
        this.f = z;
    }

    public void setRSV3(boolean z) {
        this.g = z;
    }

    public void setTransferemasked(boolean z) {
        this.d = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ optcode:");
        sb.append(getOpcode());
        sb.append(", fin:");
        sb.append(isFin());
        sb.append(", rsv1:");
        sb.append(isRSV1());
        sb.append(", rsv2:");
        sb.append(isRSV2());
        sb.append(", rsv3:");
        sb.append(isRSV3());
        sb.append(", payloadlength:[pos:");
        sb.append(this.c.position());
        sb.append(", len:");
        sb.append(this.c.remaining());
        sb.append("], payload:");
        sb.append(this.c.remaining() > 1000 ? "(too big to display)" : new String(this.c.array()));
        sb.append('}');
        return sb.toString();
    }
}
