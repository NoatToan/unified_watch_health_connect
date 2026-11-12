package defpackage;

import com.xiaomi.push.b;
import com.xiaomi.push.fs;
import com.xiaomi.push.ft;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;

/* JADX INFO: loaded from: classes11.dex */
public class zts implements bg.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMPushService f41673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bg.b f41674b;
    public gws c;
    public int e;
    public boolean f = false;
    public bg.c d = bg.c.binding;

    public zts(XMPushService xMPushService, bg.b bVar) {
        this.f41673a = xMPushService;
        this.f41674b = bVar;
    }

    @Override // com.xiaomi.push.service.bg.b.a
    public void a(bg.c cVar, bg.c cVar2, int i) {
        if (!this.f && cVar == bg.c.binding) {
            this.d = cVar2;
            this.e = i;
            this.f = true;
        }
        this.f41673a.a(new bus(this, 4));
    }

    public void b() {
        this.f41674b.i(this);
        this.c = this.f41673a.m829a();
    }

    public final void d() {
        this.f41674b.n(this);
    }

    public final void e() {
        d();
        if (this.f && this.e != 11) {
            ft ftVarA = b.e().a();
            int i = eus.f17086a[this.d.ordinal()];
            if (i == 1) {
                int i2 = this.e;
                if (i2 == 17) {
                    ftVarA.f67a = fs.BIND_TCP_READ_TIMEOUT.a();
                } else if (i2 == 21) {
                    ftVarA.f67a = fs.BIND_TIMEOUT.a();
                } else {
                    try {
                        fus.a aVarD = fus.d(b.f().a());
                        ftVarA.f67a = aVarD.f18270a.a();
                        ftVarA.c(aVarD.f18271b);
                    } catch (NullPointerException unused) {
                        ftVarA = null;
                    }
                }
            } else if (i == 3) {
                ftVarA.f67a = fs.BIND_SUCCESS.a();
            }
            if (ftVarA != null) {
                ftVarA.b(this.c.d());
                ftVarA.d(this.f41674b.f14197b);
                ftVarA.f70b = 1;
                try {
                    ftVarA.a((byte) Integer.parseInt(this.f41674b.h));
                } catch (NumberFormatException unused2) {
                }
                b.e().i(ftVarA);
            }
        }
    }
}
