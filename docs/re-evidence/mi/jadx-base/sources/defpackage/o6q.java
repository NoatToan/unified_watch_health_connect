package defpackage;

import com.miui.tsmclient.model.ErrorCode;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes11.dex */
public class o6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l7q f28801a;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile f7q f28802b = null;
    public volatile h7q c = null;
    public volatile i7q d = null;
    public volatile h7q e = null;
    public byte[] j = new byte[1];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f28803k = new byte[1];

    public o6q(int i, int i2, int i3, int i4, l7q l7qVar) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.f28801a = l7qVar;
    }

    public int a() {
        if (this.d == null) {
            return -1;
        }
        this.d.i();
        return 0;
    }

    public int b(boolean z) {
        InetAddress inetAddressE = n6q.e(this.g);
        SocketChannel socketChannelC = c(inetAddressE, this.h);
        if (socketChannelC == null || !socketChannelC.isConnected()) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Create ctrl connection with ");
                sb.append(inetAddressE.getHostName());
                sb.append(" failed!");
                return -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Create data connection with ");
            sb2.append(inetAddressE.getHostName());
            sb2.append(" failed!");
            return -1;
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Create ctrl connection with ");
            sb3.append(inetAddressE.getHostName());
            sb3.append(" success");
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Create data connection with ");
            sb4.append(inetAddressE.getHostName());
            sb4.append(" success");
        }
        if (z) {
            this.f28802b = new f7q(socketChannelC, this.f, this.i);
            this.c = new h7q(socketChannelC, this.f28801a, z);
            new Thread(this.c).start();
            this.f28802b.c(this);
            this.c.b(this);
            this.f28801a.f(this.f, this.g, this.h, this.i, z);
            return 0;
        }
        this.d = new i7q(socketChannelC, this.f, this.i);
        new Thread(this.d).start();
        this.e = new h7q(socketChannelC, this.f28801a, z);
        new Thread(this.e).start();
        this.d.l(this);
        this.e.b(this);
        this.f28801a.f(this.f, this.g, this.h, this.i, z);
        return 0;
    }

    public final SocketChannel c(InetAddress inetAddress, int i) {
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            socketChannelOpen.configureBlocking(true);
            socketChannelOpen.socket().connect(new InetSocketAddress(inetAddress, i), ErrorCode.ERROR_CODE_INVALID_PARAM);
            if (socketChannelOpen.finishConnect()) {
                return socketChannelOpen;
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
            return null;
        }
    }

    public f7q d() {
        return this.f28802b;
    }

    public i7q e() {
        return this.d;
    }

    public void f(f7q f7qVar, h7q h7qVar) {
        synchronized (this.j) {
            try {
                if (this.f28802b == null) {
                    this.f28802b = f7qVar;
                    this.f28802b.c(this);
                } else {
                    this.f28802b.a();
                    this.f28802b = f7qVar;
                    this.f28802b.c(this);
                }
                if (this.c == null) {
                    this.c = h7qVar;
                    this.c.b(this);
                } else {
                    this.c.a();
                    this.c = h7qVar;
                    this.c.b(this);
                }
                this.f28801a.f(this.f, this.g, this.h, this.i, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(i7q i7qVar, h7q h7qVar) {
        synchronized (this.f28803k) {
            try {
                if (this.d == null) {
                    this.d = i7qVar;
                    this.d.l(this);
                } else {
                    this.d.j();
                    this.d = i7qVar;
                    this.d.l(this);
                }
                if (this.e == null) {
                    this.e = h7qVar;
                    this.e.b(this);
                } else {
                    this.e.a();
                    this.e = h7qVar;
                    this.e.b(this);
                }
                this.f28801a.f(this.f, this.g, this.h, this.i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int h(boolean z) {
        if (z) {
            f7q f7qVar = this.f28802b;
            this.f28802b = null;
            if (f7qVar != null) {
                f7qVar.a();
            }
            h7q h7qVar = this.c;
            this.c = null;
            if (h7qVar != null) {
                h7qVar.a();
            }
            this.f28801a.g(this.f, this.g, this.h, this.i, z);
            return 0;
        }
        i7q i7qVar = this.d;
        this.d = null;
        if (i7qVar != null) {
            i7qVar.j();
        }
        h7q h7qVar2 = this.e;
        this.e = null;
        if (h7qVar2 != null) {
            h7qVar2.a();
        }
        this.f28801a.g(this.f, this.g, this.h, this.i, z);
        return 0;
    }

    public void i(f7q f7qVar) {
        f7q f7qVar2 = this.f28802b;
        this.f28802b = null;
        if (f7qVar != f7qVar2 || f7qVar2 == null) {
            return;
        }
        f7qVar2.a();
        h7q h7qVar = this.c;
        this.c = null;
        if (h7qVar != null) {
            h7qVar.a();
        }
        this.f28801a.g(this.f, this.g, this.h, this.i, true);
    }

    public void j(h7q h7qVar) {
        h7q h7qVar2 = this.c;
        if (h7qVar == h7qVar2) {
            this.c = null;
            if (h7qVar2 != null) {
                h7qVar2.a();
            }
            f7q f7qVar = this.f28802b;
            this.f28802b = null;
            if (f7qVar != null) {
                f7qVar.a();
            }
            this.f28801a.g(this.f, this.g, this.h, this.i, true);
        }
        h7q h7qVar3 = this.e;
        if (h7qVar == h7qVar3) {
            this.e = null;
            if (h7qVar3 != null) {
                h7qVar3.a();
            }
            i7q i7qVar = this.d;
            this.d = null;
            if (i7qVar != null) {
                i7qVar.j();
            }
            this.f28801a.g(this.f, this.g, this.h, this.i, false);
        }
    }

    public void k(i7q i7qVar) {
        i7q i7qVar2 = this.d;
        this.d = null;
        if (i7qVar != i7qVar2 || i7qVar2 == null) {
            return;
        }
        i7qVar2.j();
        h7q h7qVar = this.e;
        this.e = null;
        if (h7qVar != null) {
            h7qVar.a();
        }
        this.f28801a.g(this.f, this.g, this.h, this.i, false);
    }

    public int l(int i, int i2, byte[] bArr) {
        if (this.f28802b != null) {
            return this.f28802b.b(i, i2, bArr);
        }
        return -1;
    }

    public int m(int i, int i2, byte[] bArr) {
        if (this.d != null) {
            return this.d.k(i, i2, bArr);
        }
        return -1;
    }

    public int n() {
        l7q l7qVar = this.f28801a;
        if (l7qVar == null) {
            return -1;
        }
        l7qVar.l(this.f, this.g, this.h, this.i);
        return 0;
    }
}
