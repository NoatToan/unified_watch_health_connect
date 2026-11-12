package defpackage;

import java.net.InetSocketAddress;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.MessageCallback;

/* JADX INFO: loaded from: classes20.dex */
public final class zxx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f54757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EndpointContext f54758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f54759c;
    private final MessageCallback d;
    public final byte[] e;
    private final long i;

    private zxx(byte[] bArr, EndpointContext endpointContext, MessageCallback messageCallback, boolean z, long j, InetSocketAddress inetSocketAddress) {
        if (bArr == null) {
            throw new NullPointerException("Data must not be null");
        }
        if (endpointContext == null) {
            throw new NullPointerException("Peer's EndpointContext must not be null");
        }
        this.e = bArr;
        this.f54758b = endpointContext;
        this.d = messageCallback;
        this.f54757a = z;
        this.i = j;
        this.f54759c = inetSocketAddress;
    }

    public static zxx c(byte[] bArr, EndpointContext endpointContext, boolean z, long j, InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null) {
            throw new NullPointerException("Connectors's address must not be null");
        }
        return new zxx(bArr, endpointContext, null, z, j, inetSocketAddress);
    }

    public static zxx b(byte[] bArr, EndpointContext endpointContext, MessageCallback messageCallback, boolean z) {
        return new zxx(bArr, endpointContext, messageCallback, z, 0L, null);
    }

    public byte[] b() {
        return this.e;
    }

    public int g() {
        return this.e.length;
    }

    public long a() {
        return this.i;
    }

    public boolean f() {
        return this.f54757a;
    }

    public InetSocketAddress e() {
        return this.f54759c;
    }

    public InetSocketAddress d() {
        return this.f54758b.getPeerAddress();
    }

    public EndpointContext c() {
        return this.f54758b;
    }

    public void j() {
        MessageCallback messageCallback = this.d;
        if (messageCallback != null) {
            messageCallback.onConnecting();
        }
    }

    public void a(int i) {
        MessageCallback messageCallback = this.d;
        if (messageCallback != null) {
            messageCallback.onDtlsRetransmission(i);
        }
    }

    public void d(EndpointContext endpointContext) {
        MessageCallback messageCallback = this.d;
        if (messageCallback != null) {
            messageCallback.onContextEstablished(endpointContext);
        }
    }

    public void h() {
        MessageCallback messageCallback = this.d;
        if (messageCallback != null) {
            messageCallback.onSent();
        }
    }

    public void c(Throwable th) {
        if (this.d != null) {
            if (th == null) {
                th = new UnknownError();
            }
            this.d.onError(th);
        }
    }
}
