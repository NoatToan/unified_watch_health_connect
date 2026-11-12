package in2;

import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.device.nfc.g;
import com.garmin.device.nfc.i;
import i3.f2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o13.m;
import o13.t;
import o62.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lin2/d;", "Lcom/garmin/device/nfc/g$d;", "", "macAddress", "<init>", "(Ljava/lang/String;)V", "a", "c", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements g.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f94559c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f94561b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin2/d$a;", "Lin2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements in2.a {
        @Override // in2.a
        public final int close(int i14) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for close()");
            return -1;
        }

        @Override // in2.a
        public final int connectByName(int i14, int i15, int i16, int i17, String str, String str2, byte[] bArr) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for connectByName()");
            return -1;
        }

        @Override // in2.a
        public final int read(int i14, byte[] bArr) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for read()");
            return -1;
        }

        @Override // in2.a
        public final int recv(int i14, byte[] bArr, int i15) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for recv()");
            return -1;
        }

        @Override // in2.a
        public final int select(int i14) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for select()");
            return -1;
        }

        @Override // in2.a
        public final int send(int i14, byte[] bArr, int i15) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for send()");
            return -1;
        }

        @Override // in2.a
        public final int setRecvTimeout(int i14, int i15) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for setRecvTimeout()");
            return -1;
        }

        @Override // in2.a
        public final int socket(int i14, int i15, int i16) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for socket()");
            return -1;
        }

        @Override // in2.a
        public final int write(int i14, byte[] bArr) {
            d.f94559c.warn("Failed to retrieve unit ID, return -1 for write()");
            return -1;
        }
    }

    /* JADX INFO: renamed from: in2.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C1806d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94574a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.SOCKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CONNECT_BY_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.RECV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.SEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.WRITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.SELECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.CLOSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.SET_RECV_TIMEOUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f94574a = iArr;
        }
    }

    static {
        new b(null);
        int i14 = gt2.c.f79010a;
        f94559c = gt2.b.f79005a.h("PAY#NFC#DeviceDrivenSocketRequestCallback");
    }

    public d(String str) {
        str.getClass();
        this.f94560a = str;
        this.f94561b = m.b(new f2(this, 10));
    }

    @Override // com.garmin.device.nfc.g.d
    public final void a(i iVar, b0 b0Var) {
        c cVar;
        i iVar2;
        Logger logger = f94559c;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(iVar.d()).order(ByteOrder.LITTLE_ENDIAN);
        try {
            c.a aVar = c.f94562b;
            byte b14 = byteBufferOrder.get();
            aVar.getClass();
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i14];
                if (cVar.f94573a == b14) {
                    break;
                } else {
                    i14++;
                }
            }
            if (cVar == null) {
                throw new RuntimeException("No corresponding Type value for " + ((int) b14));
            }
            byte b15 = cVar.f94573a;
            logger.trace("Received " + iVar + " of type " + cVar + " as a device driven socket request");
            switch (C1806d.f94574a[cVar.ordinal()]) {
                case 1:
                    int iSocket = b().socket(byteBufferOrder.getInt(), byteBufferOrder.getInt(), byteBufferOrder.getInt());
                    ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder2.put(b15);
                    byteBufferOrder2.putInt(iSocket);
                    NfcCommandHandler.b bVar = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder2.position(0);
                    byte[] bArr = new byte[byteBufferOrder2.remaining()];
                    byteBufferOrder2.get(bArr);
                    iVar2 = new i(bVar, bArr);
                    break;
                case 2:
                    int i15 = byteBufferOrder.getInt();
                    int i16 = byteBufferOrder.getInt();
                    int i17 = byteBufferOrder.getInt();
                    int i18 = byteBufferOrder.getInt();
                    byte[] bArr2 = new byte[byteBufferOrder.getInt()];
                    byteBufferOrder.get(bArr2);
                    Charset charset = d53.c.f57667c;
                    String str = new String(bArr2, charset);
                    byte[] bArr3 = new byte[byteBufferOrder.getInt()];
                    byteBufferOrder.get(bArr3);
                    byte[] bArr4 = new byte[4];
                    int iConnectByName = b().connectByName(i15, i16, i17, i18, str, new String(bArr3, charset), bArr4);
                    ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(9).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder3.put(b15);
                    byteBufferOrder3.putInt(iConnectByName);
                    byteBufferOrder3.put(bArr4);
                    NfcCommandHandler.b bVar2 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder3.position(0);
                    byte[] bArr5 = new byte[byteBufferOrder3.remaining()];
                    byteBufferOrder3.get(bArr5);
                    iVar2 = new i(bVar2, bArr5);
                    break;
                case 3:
                    int i19 = byteBufferOrder.getInt();
                    byte[] bArr6 = new byte[byteBufferOrder.getInt()];
                    int iRecv = b().recv(i19, bArr6, byteBufferOrder.getInt());
                    ByteBuffer byteBufferOrder4 = ByteBuffer.allocate(Math.max(iRecv, 0) + 5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder4.put(b15);
                    byteBufferOrder4.putInt(iRecv);
                    if (iRecv > 0) {
                        byteBufferOrder4.put(bArr6, 0, iRecv);
                    }
                    NfcCommandHandler.b bVar3 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder4.position(0);
                    byte[] bArr7 = new byte[byteBufferOrder4.remaining()];
                    byteBufferOrder4.get(bArr7);
                    iVar2 = new i(bVar3, bArr7);
                    break;
                case 4:
                    int i24 = byteBufferOrder.getInt();
                    byte[] bArr8 = new byte[byteBufferOrder.getInt()];
                    byteBufferOrder.get(bArr8);
                    int iSend = b().send(i24, bArr8, byteBufferOrder.getInt());
                    ByteBuffer byteBufferOrder5 = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder5.put(b15);
                    byteBufferOrder5.putInt(iSend);
                    NfcCommandHandler.b bVar4 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder5.position(0);
                    byte[] bArr9 = new byte[byteBufferOrder5.remaining()];
                    byteBufferOrder5.get(bArr9);
                    iVar2 = new i(bVar4, bArr9);
                    break;
                case 5:
                    int i25 = byteBufferOrder.getInt();
                    byte[] bArr10 = new byte[byteBufferOrder.getInt()];
                    int i26 = b().read(i25, bArr10);
                    ByteBuffer byteBufferOrder6 = ByteBuffer.allocate(Math.max(i26, 0) + 5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder6.put(b15);
                    byteBufferOrder6.putInt(i26);
                    if (i26 > 0) {
                        byteBufferOrder6.put(bArr10, 0, i26);
                    }
                    NfcCommandHandler.b bVar5 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder6.position(0);
                    byte[] bArr11 = new byte[byteBufferOrder6.remaining()];
                    byteBufferOrder6.get(bArr11);
                    iVar2 = new i(bVar5, bArr11);
                    break;
                case 6:
                    int i27 = byteBufferOrder.getInt();
                    byte[] bArr12 = new byte[byteBufferOrder.getInt()];
                    byteBufferOrder.get(bArr12);
                    int iWrite = b().write(i27, bArr12);
                    ByteBuffer byteBufferOrder7 = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder7.put(b15);
                    byteBufferOrder7.putInt(iWrite);
                    NfcCommandHandler.b bVar6 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder7.position(0);
                    byte[] bArr13 = new byte[byteBufferOrder7.remaining()];
                    byteBufferOrder7.get(bArr13);
                    iVar2 = new i(bVar6, bArr13);
                    break;
                case 7:
                    int iSelect = b().select(byteBufferOrder.getInt());
                    ByteBuffer byteBufferOrder8 = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder8.put(b15);
                    byteBufferOrder8.putInt(iSelect);
                    NfcCommandHandler.b bVar7 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder8.position(0);
                    byte[] bArr14 = new byte[byteBufferOrder8.remaining()];
                    byteBufferOrder8.get(bArr14);
                    iVar2 = new i(bVar7, bArr14);
                    break;
                case 8:
                    int iClose = b().close(byteBufferOrder.getInt());
                    ByteBuffer byteBufferOrder9 = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder9.put(b15);
                    byteBufferOrder9.putInt(iClose);
                    NfcCommandHandler.b bVar8 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder9.position(0);
                    byte[] bArr15 = new byte[byteBufferOrder9.remaining()];
                    byteBufferOrder9.get(bArr15);
                    iVar2 = new i(bVar8, bArr15);
                    break;
                case 9:
                    int recvTimeout = b().setRecvTimeout(byteBufferOrder.getInt(), byteBufferOrder.getInt());
                    ByteBuffer byteBufferOrder10 = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder10.put(b15);
                    byteBufferOrder10.putInt(recvTimeout);
                    NfcCommandHandler.b bVar9 = NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET;
                    byteBufferOrder10.position(0);
                    byte[] bArr16 = new byte[byteBufferOrder10.remaining()];
                    byteBufferOrder10.get(bArr16);
                    iVar2 = new i(bVar9, bArr16);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (byteBufferOrder.hasRemaining()) {
                throw new RuntimeException("Malformed request: " + iVar);
            }
            iVar2.e(iVar.c(), i.a.COMPANION_APPLICATION);
            logger.trace("Respond " + iVar2);
            b0Var.m(iVar2);
        } catch (Throwable th3) {
            logger.trace("Respond protocol error caused by", th3);
            b0Var.m(new i(NfcCommandHandler.b.PROTOCOL_ERROR, (byte) 6));
        }
    }

    public final in2.a b() {
        return (in2.a) this.f94561b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lin2/d$c;", "", "", "byte", "<init>", "(Ljava/lang/String;IB)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        SOCKET((byte) 0),
        CONNECT_BY_NAME((byte) 1),
        RECV((byte) 2),
        SEND((byte) 3),
        READ((byte) 4),
        WRITE((byte) 5),
        SELECT((byte) 6),
        CLOSE((byte) 7),
        SET_RECV_TIMEOUT((byte) 8);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f94562b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f94573a;

        c(byte b14) {
            this.f94573a = b14;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin2/d$c$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lin2/d$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
