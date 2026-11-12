package defpackage;

import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.ChangeCipherSpecMessage;
import org.eclipse.californium.scandium.dtls.ConnectionIdGenerator;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.DTLSConnectionState;
import org.eclipse.californium.scandium.dtls.DTLSMessage;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aabr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f99a = aaex.a((Class<?>) aabr.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f100c = {-1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aaae f101b;
    private final int d;
    private final boolean e;
    private final long f;
    private DTLSMessage g;
    private InetSocketAddress h;
    private int i;
    private byte[] j;
    private boolean k;
    private InetSocketAddress l;
    private final long m;
    private ContentType n;
    private final aabl o;

    aabr(ContentType contentType, aabl aablVar, int i, long j, aaae aaaeVar, byte[] bArr, long j2, boolean z) {
        this(aablVar, i, j, j2, z);
        if (contentType == null) {
            throw new NullPointerException("Type must not be null");
        }
        if (bArr == null) {
            throw new NullPointerException("Fragment bytes must not be null");
        }
        this.n = contentType;
        this.f101b = aaaeVar;
        this.j = bArr;
    }

    public aabr(ContentType contentType, int i, DTLSMessage dTLSMessage, aaak aaakVar, boolean z, int i2) throws GeneralSecurityException {
        this(aabl.f90a, i, (aaakVar == null || i < 0) ? 0L : aaakVar.b(i), 0L, false);
        if (dTLSMessage == null) {
            throw new NullPointerException("Fragment must not be null");
        }
        if (aaakVar == null) {
            throw new NullPointerException("Context must not be null");
        }
        b(contentType);
        if (z) {
            this.f101b = aaakVar.h();
            this.k = aaakVar.m();
            this.i = i2;
        }
        d(aaakVar.d(i), dTLSMessage);
        if (this.j == null) {
            throw new IllegalArgumentException("Fragment missing encoded bytes!");
        }
    }

    public aabr(ContentType contentType, aabl aablVar, long j, DTLSMessage dTLSMessage) {
        this(aablVar, 0, j, 0L, false);
        if (dTLSMessage == null) {
            throw new NullPointerException("Fragment must not be null");
        }
        b(contentType);
        this.g = dTLSMessage;
        byte[] byteArray = dTLSMessage.toByteArray();
        this.j = byteArray;
        if (byteArray == null) {
            throw new IllegalArgumentException("Fragment missing encoded bytes!");
        }
    }

    private aabr(aabl aablVar, int i, long j, long j2, boolean z) {
        if (j > 281474976710655L) {
            throw new IllegalArgumentException("Sequence number must be 48 bits only! " + j);
        }
        if (j < 0) {
            throw new IllegalArgumentException("Sequence number must not be less than 0! " + j);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Epoch must not be less than 0! " + i);
        }
        if (aablVar == null) {
            throw new NullPointerException("Version must not be null");
        }
        this.o = aablVar;
        this.d = i;
        this.m = j;
        this.f = j2;
        this.e = z;
    }

    public void e(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        if (this.h != null) {
            throw new IllegalStateException("Peer's address already available!");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("Peer's address must not be null!");
        }
        this.h = inetSocketAddress;
        this.l = inetSocketAddress2;
    }

    public byte[] l() {
        boolean zQ = q();
        int length = this.j.length + 13;
        if (zQ) {
            length += this.f101b.c();
        }
        zzl zzlVar = new zzl(length);
        if (zQ) {
            zzlVar.d(ContentType.TLS12_CID.getCode(), 8);
        } else {
            zzlVar.d(this.n.getCode(), 8);
        }
        zzlVar.d(this.o.c(), 8);
        zzlVar.d(this.o.d(), 8);
        zzlVar.d(this.d, 16);
        zzlVar.e(this.m, 48);
        if (zQ) {
            zzlVar.a(this.f101b.d());
        }
        zzlVar.d(this.j.length, 16);
        zzlVar.a(this.j);
        return zzlVar.d();
    }

    public int k() {
        return (q() ? this.f101b.c() : 0) + 13 + e();
    }

    public static List<aabr> b(zzf zzfVar, ConnectionIdGenerator connectionIdGenerator, long j) {
        aaae aaaeVar;
        if (zzfVar == null) {
            throw new NullPointerException("Reader must not be null");
        }
        int iB = zzfVar.b() / 8;
        ArrayList arrayList = new ArrayList();
        while (zzfVar.d()) {
            if (zzfVar.b() < 104) {
                f99a.debug("Received truncated DTLS record(s). Discarding ...");
                return arrayList;
            }
            int iA = zzfVar.a(8);
            aabl aablVarA = aabl.a(zzfVar.a(8), zzfVar.a(8));
            int iA2 = zzfVar.a(16);
            long jE = zzfVar.e(48);
            if (iA != ContentType.TLS12_CID.getCode()) {
                aaaeVar = null;
            } else {
                if (connectionIdGenerator == null) {
                    f99a.debug("Received TLS_CID record, but cid is not supported. Discarding ...");
                    return arrayList;
                }
                if (connectionIdGenerator.useConnectionId()) {
                    try {
                        aaaeVar = connectionIdGenerator.read(zzfVar);
                        if (aaaeVar == null) {
                            f99a.debug("Received TLS_CID record, but cid is not matching. Discarding ...");
                            return arrayList;
                        }
                    } catch (RuntimeException e) {
                        f99a.debug("Received TLS_CID record, failed to read cid. Discarding ...", (Throwable) e);
                        return arrayList;
                    }
                } else {
                    f99a.debug("Received TLS_CID record, but cid is not used. Discarding ...");
                    return arrayList;
                }
            }
            aaae aaaeVar2 = aaaeVar;
            int iA3 = zzfVar.a(16);
            int iB2 = zzfVar.b() / 8;
            if (iB2 < iA3) {
                f99a.debug("Received truncated DTLS record(s) ({} bytes, but only {} available). {} records, {} bytes. Discarding ...", Integer.valueOf(iA3), Integer.valueOf(iB2), Integer.valueOf(arrayList.size()), Integer.valueOf(iB));
                return arrayList;
            }
            byte[] bArrB = zzfVar.b(iA3);
            ContentType typeByValue = ContentType.getTypeByValue(iA);
            if (typeByValue == null) {
                f99a.debug("Received DTLS record of unsupported type [{}]. Discarding ...", Integer.valueOf(iA));
            } else {
                arrayList.add(new aabr(typeByValue, aablVarA, iA2, jE, aaaeVar2, bArrB, j, !arrayList.isEmpty()));
            }
        }
        return arrayList;
    }

    public static aaae e(zzf zzfVar, ConnectionIdGenerator connectionIdGenerator) {
        if (zzfVar == null) {
            throw new NullPointerException("Reader must not be null");
        }
        if (connectionIdGenerator == null) {
            throw new NullPointerException("CID generator must not be null");
        }
        if (!connectionIdGenerator.useConnectionId()) {
            throw new IllegalArgumentException("CID generator must use CID");
        }
        if (zzfVar.b() < 104) {
            throw new IllegalArgumentException("Record too small for DTLS header");
        }
        if (zzfVar.a(8) != ContentType.TLS12_CID.getCode()) {
            return null;
        }
        zzfVar.d(80L);
        aaae aaaeVar = connectionIdGenerator.read(zzfVar);
        int iA = zzfVar.a(16);
        if (zzfVar.b() / 8 >= iA) {
            return aaaeVar;
        }
        throw new IllegalArgumentException("Record too small for DTLS length " + iA);
    }

    protected void e(zzl zzlVar) {
        zzlVar.d(this.d, 16);
        zzlVar.e(this.m, 48);
    }

    protected byte[] e(int i) {
        if (!q()) {
            return b(i);
        }
        if (this.k) {
            return a(i);
        }
        return c(i);
    }

    protected byte[] c(int i) {
        zzl zzlVar = new zzl(this.f101b.c() + 23);
        zzlVar.a(f100c);
        zzlVar.d(ContentType.TLS12_CID.getCode(), 8);
        zzlVar.d(this.f101b.c(), 8);
        zzlVar.d(ContentType.TLS12_CID.getCode(), 8);
        zzlVar.d(this.o.c(), 8);
        zzlVar.d(this.o.d(), 8);
        zzlVar.d(this.d, 16);
        zzlVar.e(this.m, 48);
        zzlVar.a(this.f101b.d());
        zzlVar.d(i, 16);
        return zzlVar.d();
    }

    protected byte[] a(int i) {
        zzl zzlVar = new zzl(this.f101b.c() + 14);
        zzlVar.d(this.d, 16);
        zzlVar.e(this.m, 48);
        zzlVar.d(ContentType.TLS12_CID.getCode(), 8);
        zzlVar.d(this.o.c(), 8);
        zzlVar.d(this.o.d(), 8);
        zzlVar.a(this.f101b.d());
        zzlVar.d(this.f101b.c(), 8);
        zzlVar.d(i, 16);
        return zzlVar.d();
    }

    protected byte[] b(int i) {
        zzl zzlVar = new zzl(13);
        zzlVar.d(this.d, 16);
        zzlVar.e(this.m, 48);
        zzlVar.d(this.n.getCode(), 8);
        zzlVar.d(this.o.c(), 8);
        zzlVar.d(this.o.d(), 8);
        zzlVar.d(i, 16);
        return zzlVar.d();
    }

    public boolean m() {
        return this.e;
    }

    public boolean n() {
        if (this.d <= 0 && this.n == ContentType.HANDSHAKE) {
            byte[] bArr = this.j;
            if (bArr.length != 0 && HandshakeType.getTypeByCode(bArr[0]) == HandshakeType.CLIENT_HELLO) {
                return true;
            }
        }
        return false;
    }

    public boolean o() {
        return this.g != null;
    }

    public ContentType g() {
        return this.n;
    }

    public int c() {
        return this.d;
    }

    public long f() {
        return this.m;
    }

    public int e() {
        return this.j.length;
    }

    public InetSocketAddress j() {
        return this.h;
    }

    public InetSocketAddress h() {
        return this.l;
    }

    public aaae a() {
        return this.f101b;
    }

    public long i() {
        return this.f;
    }

    public byte[] d() {
        return this.j;
    }

    public DTLSMessage b() {
        DTLSMessage dTLSMessage = this.g;
        if (dTLSMessage != null) {
            return dTLSMessage;
        }
        throw new IllegalStateException("fragment not decoded!");
    }

    public void d(boolean z) {
        this.k = z;
    }

    public void c(DTLSConnectionState dTLSConnectionState) throws GeneralSecurityException, aaay {
        if (this.g != null) {
            f99a.error("DTLS read state already applied!");
            throw new IllegalArgumentException("DTLS read state already applied!");
        }
        ContentType contentType = this.n;
        byte[] bArrDecrypt = dTLSConnectionState.decrypt(this, this.j);
        if (ContentType.TLS12_CID == this.n) {
            int length = bArrDecrypt.length - 1;
            while (length >= 0 && bArrDecrypt[length] == 0) {
                length--;
            }
            if (length < 0) {
                throw new GeneralSecurityException("no inner type!");
            }
            byte b2 = bArrDecrypt[length];
            ContentType typeByValue = ContentType.getTypeByValue(b2);
            if (typeByValue == null) {
                throw new GeneralSecurityException("unknown inner type! " + ((int) b2));
            }
            bArrDecrypt = Arrays.copyOf(bArrDecrypt, length);
            contentType = typeByValue;
        }
        int i = AnonymousClass1.d[contentType.ordinal()];
        if (i == 1) {
            this.g = AlertMessage.c(bArrDecrypt);
        } else if (i == 2) {
            this.g = zzw.e(bArrDecrypt);
        } else if (i == 3) {
            this.g = ChangeCipherSpecMessage.e(bArrDecrypt);
        } else if (i == 4) {
            this.g = HandshakeMessage.fromByteArray(bArrDecrypt);
        } else {
            f99a.debug("Cannot decrypt message of unsupported type [{}]", this.n);
        }
        this.n = contentType;
    }

    /* JADX INFO: renamed from: aabr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ContentType.values().length];
            d = iArr;
            try {
                iArr[ContentType.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ContentType.APPLICATION_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ContentType.CHANGE_CIPHER_SPEC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[ContentType.HANDSHAKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void d(DTLSConnectionState dTLSConnectionState, DTLSMessage dTLSMessage) throws GeneralSecurityException {
        byte[] byteArray = dTLSMessage.toByteArray();
        if (byteArray == null) {
            throw new NullPointerException("fragment must not return null");
        }
        if (q()) {
            int length = byteArray.length;
            byteArray = Arrays.copyOf(byteArray, length + 1 + this.i);
            byteArray[length] = (byte) this.n.getCode();
        }
        this.j = dTLSConnectionState.encrypt(this, byteArray);
        this.g = dTLSMessage;
    }

    boolean q() {
        aaae aaaeVar = this.f101b;
        return (aaaeVar == null || aaaeVar.b()) ? false : true;
    }

    private void b(ContentType contentType) {
        if (contentType == null) {
            throw new NullPointerException("Type must not be null");
        }
        int i = AnonymousClass1.d[contentType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            this.n = contentType;
        } else {
            throw new IllegalArgumentException("Not supported content type: " + contentType);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("==[ DTLS Record ]==============================================");
        sb.append(zzp.c());
        sb.append("Content Type: ");
        sb.append(this.n);
        sb.append(zzp.c());
        sb.append("Peer address: ");
        sb.append(j());
        sb.append(zzp.c());
        sb.append("Version: ");
        sb.append(this.o.c());
        sb.append(", ");
        sb.append(this.o.d());
        sb.append(zzp.c());
        sb.append("Epoch: ");
        sb.append(this.d);
        sb.append(zzp.c());
        sb.append("Sequence Number: ");
        sb.append(this.m);
        sb.append(zzp.c());
        if (this.f101b != null) {
            sb.append("connection id: ");
            sb.append(this.f101b.a());
            sb.append(zzp.c());
        }
        sb.append("Length: ");
        sb.append(this.j.length);
        sb.append(" bytes");
        sb.append(zzp.c());
        sb.append("Fragment:");
        sb.append(zzp.c());
        DTLSMessage dTLSMessage = this.g;
        if (dTLSMessage != null) {
            sb.append(dTLSMessage.toString(1));
        } else {
            sb.append("fragment is not decrypted yet");
            sb.append(zzp.c());
        }
        sb.append("===============================================================");
        sb.append(zzp.c());
        return sb.toString();
    }
}
