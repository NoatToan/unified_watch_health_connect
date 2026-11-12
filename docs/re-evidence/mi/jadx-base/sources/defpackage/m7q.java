package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class m7q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l7q f25857b;
    public int d;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile AtomicBoolean f25856a = new AtomicBoolean(false);
    public DatagramSocket e = null;
    public DatagramPacket f = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f25858k = new byte[256];
    public c7q c = new c7q(false);

    public m7q(l7q l7qVar, int i) {
        this.f25857b = l7qVar;
        this.d = i;
    }

    public void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Try to close UDTUDPServer on port ");
        sb.append(this.d);
        if (!this.f25856a.compareAndSet(true, false)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Close UDTUDPServer failed, UDTUDPServer on port ");
            sb2.append(this.d);
            sb2.append(" not running");
            return;
        }
        try {
            this.e.close();
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception: ");
            sb3.append(e.toString());
        }
        this.e = null;
        this.f = null;
    }

    public final void b() {
        l7q l7qVar = this.f25857b;
        if (l7qVar != null) {
            l7qVar.j(this.j, this.g, this.h, this.i, this.c.a(), this.c.d());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.e = new DatagramSocket(this.d);
            byte[] bArr = this.f25858k;
            this.f = new DatagramPacket(bArr, bArr.length);
            this.f25856a.set(true);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
            e.printStackTrace();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UDTUDPServer on port ");
        sb2.append(this.d);
        sb2.append(" started!");
        while (this.f25856a.get()) {
            try {
                this.e.receive(this.f);
            } catch (Exception e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Exception: ");
                sb3.append(e2.toString());
                e2.printStackTrace();
            }
            if (!this.f25856a.get()) {
                break;
            }
            this.g = n6q.d(this.e.getInetAddress());
            this.h = this.e.getPort();
            if (this.c.j(this.f.getData())) {
                this.i = this.c.h();
                this.j = this.c.b();
                b();
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("UDTUDPServer on port ");
        sb4.append(this.d);
        sb4.append(" stopped");
        a();
    }
}
