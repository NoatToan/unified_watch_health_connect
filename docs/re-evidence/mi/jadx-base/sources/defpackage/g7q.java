package defpackage;

import java.net.InetAddress;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes11.dex */
public class g7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l7q f18695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h7q f18696b;
    public SocketChannel c;
    public c7q d = new c7q(true);
    public p6q e = new p6q();
    public boolean f;
    public int g;
    public int h;

    public g7q(l7q l7qVar, SocketChannel socketChannel, h7q h7qVar) {
        this.f18695a = l7qVar;
        this.c = socketChannel;
        this.f18696b = h7qVar;
        InetAddress inetAddress = this.c.socket().getInetAddress();
        this.g = 0;
        if (inetAddress != null) {
            this.g = n6q.d(inetAddress);
        }
        this.h = this.c.socket().getPort();
    }

    public int a() {
        return this.d.g();
    }

    public boolean b(byte[] bArr) {
        return this.d.b() == 0 ? d(bArr) : e(bArr);
    }

    public boolean c(byte[] bArr) {
        return this.d.k(bArr);
    }

    public final boolean d(byte[] bArr) {
        if (this.e.g(bArr) == 0) {
            this.f = this.e.c() == 0;
            f(this.e.d(), this.e.b());
        }
        return true;
    }

    public final boolean e(byte[] bArr) {
        this.d.j(bArr);
        int iF = this.d.f();
        if (iF == 0) {
            if (this.f) {
                this.f18695a.h(this.g, this.h, this.d.h(), this.d.b(), this.d.a(), this.d.i());
            } else {
                this.f18695a.k(this.g, this.h, this.d.h(), this.d.b());
                this.f18695a.i(this.g, this.h, this.d.h(), this.d.b(), this.d.a(), this.d.i());
            }
            return true;
        }
        if (iF != 1) {
            return false;
        }
        if (this.f) {
            this.f18695a.h(this.g, this.h, this.d.h(), this.d.b(), this.d.a(), this.d.i());
        } else {
            this.f18695a.i(this.g, this.h, this.d.h(), this.d.b(), this.d.a(), this.d.i());
        }
        return true;
    }

    public void f(int i, int i2) {
        if (this.f) {
            this.f18695a.n(i2, this.g, this.h, i, new f7q(this.c), this.f18696b);
        } else {
            i7q i7qVar = new i7q(this.c);
            new Thread(i7qVar).start();
            this.f18695a.o(i2, this.g, this.h, i, i7qVar, this.f18696b);
        }
    }

    public void g(boolean z) {
        this.f = z;
    }
}
