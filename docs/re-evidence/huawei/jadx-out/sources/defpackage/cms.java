package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;

/* JADX INFO: loaded from: classes4.dex */
public class cms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandshakeCommandBase f1797a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1798c;

    public cms(boolean z) {
        this(z, null);
    }

    public cms(boolean z, HandshakeCommandBase handshakeCommandBase) {
        this.f1798c = z;
        this.f1797a = handshakeCommandBase;
    }

    public boolean c() {
        return this.f1798c;
    }

    public void a(boolean z) {
        this.f1798c = z;
    }

    public HandshakeCommandBase e() {
        return this.f1797a;
    }

    public void b(HandshakeCommandBase handshakeCommandBase) {
        this.f1797a = handshakeCommandBase;
    }
}
