package defpackage;

import org.eclipse.californium.scandium.DtlsClusterHealth;

/* JADX INFO: loaded from: classes46.dex */
public class zzx extends zzv implements DtlsClusterHealth {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzr f54851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzr f54852b;
    private final zzr d;
    private final zzr e;
    private final zzr f;
    private final zzr g;
    private final zzr h;
    private final zzr i;
    private final zzr j;
    private final zzr n;
    private final zzr o;

    public zzx() {
        this("");
    }

    public zzx(String str) {
        super(str);
        this.h = new zzr("forwarded", this.f54849c);
        this.j = new zzr("process forwarded", this.f54849c);
        this.f54851a = new zzr("bad forward", this.f54849c);
        this.g = new zzr("drop forward", this.f54849c);
        this.d = new zzr("backwarded", this.f54849c);
        this.o = new zzr("send backwarded", this.f54849c);
        this.e = new zzr("bad backward", this.f54849c);
        this.f54852b = new zzr("drop backward", this.f54849c);
        this.n = new zzr("sent cluster mgmt", this.f54849c);
        this.f = new zzr("recv cluster mgmt", this.f54849c);
        this.i = new zzr("dropped internal udp", this.f54849c);
        b();
    }

    private void b() {
        add(this.h);
        add(this.j);
        add(this.f54851a);
        add(this.g);
        add(this.d);
        add(this.o);
        add(this.e);
        add(this.f54852b);
        add(this.n);
        add(this.f);
        add(this.i);
    }

    @Override // defpackage.zzv
    protected boolean d() {
        return super.d() || this.h.c() || this.g.c() || this.f54851a.c();
    }

    @Override // defpackage.zzv
    protected void a(String str, StringBuilder sb) {
        String strC = zzp.c();
        sb.append(strC);
        sb.append(str);
        sb.append(this.h);
        sb.append(strC);
        sb.append(str);
        sb.append(this.j);
        sb.append(strC);
        sb.append(str);
        sb.append(this.f54851a);
        sb.append(strC);
        sb.append(str);
        sb.append(this.g);
        sb.append(strC);
        sb.append(str);
        sb.append(this.d);
        sb.append(strC);
        sb.append(str);
        sb.append(this.o);
        sb.append(strC);
        sb.append(str);
        sb.append(this.e);
        sb.append(strC);
        sb.append(str);
        sb.append(this.f54852b);
        sb.append(strC);
        sb.append(str);
        sb.append(this.n);
        sb.append(strC);
        sb.append(str);
        sb.append(this.f);
        if (this.i.e()) {
            sb.append(strC);
            sb.append(str);
            sb.append(this.i);
        }
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void forwardMessage() {
        this.h.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void backwardMessage() {
        this.d.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void processForwardedMessage() {
        this.j.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void sendBackwardedMessage() {
        this.o.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void dropForwardMessage() {
        this.g.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void dropBackwardMessage() {
        this.f54852b.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void badForwardMessage() {
        this.f54851a.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void badBackwardMessage() {
        this.e.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void sendingClusterManagementMessage() {
        this.n.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsClusterHealth
    public void receivingClusterManagementMessage() {
        this.f.b();
    }
}
