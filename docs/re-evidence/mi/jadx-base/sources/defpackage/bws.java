package defpackage;

import com.xiaomi.push.service.bg;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class bws implements rxs {
    public static boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gws f4683b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleDateFormat f4682a = new SimpleDateFormat("hh:mm:ss aaa");
    public a c = null;
    public a d = null;
    public nws e = null;
    public final String f = "[Slim] ";

    public class a implements pws, txs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4685b;

        public a(boolean z) {
            this.f4685b = z;
            this.f4684a = z ? " RCV " : " Sent ";
        }

        @Override // defpackage.txs
        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean mo65a(fys fysVar) {
            return true;
        }

        @Override // defpackage.pws
        public void b(mvs mvsVar) {
            if (bws.g) {
                x9s.B("[Slim] " + bws.this.f4682a.format(new Date()) + this.f4684a + mvsVar.toString());
            } else {
                x9s.B("[Slim] " + bws.this.f4682a.format(new Date()) + this.f4684a + " Blob [" + mvsVar.e() + "," + mvsVar.a() + "," + gbs.b(mvsVar.D()) + "]");
            }
            if (mvsVar == null || mvsVar.a() != 99999) {
                return;
            }
            String strE = mvsVar.e();
            mvs mvsVar2 = null;
            if (!this.f4685b) {
                if ("BIND".equals(strE)) {
                    x9s.o("build binded result for loopback.");
                    hqs hqsVar = new hqs();
                    hqsVar.l(true);
                    hqsVar.s("login success.");
                    hqsVar.p("success");
                    hqsVar.k("success");
                    mvs mvsVar3 = new mvs();
                    mvsVar3.n(hqsVar.h(), null);
                    mvsVar3.m((short) 2);
                    mvsVar3.h(99999);
                    mvsVar3.l("BIND", null);
                    mvsVar3.k(mvsVar.D());
                    mvsVar3.v(null);
                    mvsVar3.B(mvsVar.F());
                    mvsVar2 = mvsVar3;
                } else if (!"UBND".equals(strE) && "SECMSG".equals(strE)) {
                    mvs mvsVar4 = new mvs();
                    mvsVar4.h(99999);
                    mvsVar4.l("SECMSG", null);
                    mvsVar4.B(mvsVar.F());
                    mvsVar4.k(mvsVar.D());
                    mvsVar4.m(mvsVar.g());
                    mvsVar4.v(mvsVar.E());
                    mvsVar4.n(mvsVar.q(bg.c().b(String.valueOf(99999), mvsVar.F()).i), null);
                    mvsVar2 = mvsVar4;
                }
            }
            if (mvsVar2 != null) {
                for (Map.Entry<pws, gws.a> entry : bws.this.f4683b.f().entrySet()) {
                    if (bws.this.c != entry.getKey()) {
                        entry.getValue().a(mvsVar2);
                    }
                }
            }
        }

        @Override // defpackage.pws
        public void a(fys fysVar) {
            if (bws.g) {
                x9s.B("[Slim] " + bws.this.f4682a.format(new Date()) + this.f4684a + " PKT " + fysVar.f());
                return;
            }
            x9s.B("[Slim] " + bws.this.f4682a.format(new Date()) + this.f4684a + " PKT [" + fysVar.m() + "," + fysVar.l() + "]");
        }
    }

    public bws(gws gwsVar) {
        this.f4683b = gwsVar;
        d();
    }

    public final void d() {
        this.c = new a(true);
        this.d = new a(false);
        gws gwsVar = this.f4683b;
        a aVar = this.c;
        gwsVar.l(aVar, aVar);
        gws gwsVar2 = this.f4683b;
        a aVar2 = this.d;
        gwsVar2.z(aVar2, aVar2);
        this.e = new dws(this);
    }
}
