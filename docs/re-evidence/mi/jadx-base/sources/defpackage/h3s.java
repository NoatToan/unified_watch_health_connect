package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class h3s {
    public static final int i;
    public static volatile h3s j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f19662a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, HashMap<String, g3s>> f19663b = new HashMap<>();
    public HashMap<String, ArrayList<g3s>> c = new HashMap<>();
    public Context d;
    public lb4 e;
    public String f;
    public lsc g;
    public svc h;

    static {
        i = y0t.i() ? 30 : 10;
    }

    public h3s(Context context) {
        this.d = context;
    }

    public static h3s e(Context context) {
        if (j == null) {
            synchronized (h3s.class) {
                try {
                    if (j == null) {
                        j = new h3s(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public final void A() {
        if (e(this.d).c().h()) {
            yds ydsVar = new yds(this.d);
            int iE = (int) e(this.d).c().e();
            if (iE < 1800) {
                iE = 1800;
            }
            if (System.currentTimeMillis() - tfs.b(this.d).a("sp_client_report_status", "perf_last_upload_time", 0L) > iE * 1000) {
                k5s.a(this.d).h(new jzs(this, ydsVar), 15);
            }
            synchronized (h3s.class) {
                try {
                    if (!k5s.a(this.d).j(ydsVar, iE)) {
                        k5s.a(this.d).m("100887");
                        k5s.a(this.d).j(ydsVar, iE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int a() {
        HashMap<String, ArrayList<g3s>> map = this.c;
        if (map == null) {
            return 0;
        }
        Iterator<String> it = map.keySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            ArrayList<g3s> arrayList = this.c.get(it.next());
            size += arrayList != null ? arrayList.size() : 0;
        }
        return size;
    }

    public synchronized lb4 c() {
        try {
            if (this.e == null) {
                this.e = lb4.a(this.d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    public od8 d(int i2, String str) {
        od8 od8Var = new od8();
        od8Var.f29032k = str;
        od8Var.j = System.currentTimeMillis();
        od8Var.i = i2;
        od8Var.h = qcs.a(6);
        od8Var.f18566a = 1000;
        od8Var.c = 1001;
        od8Var.f18567b = "E100004";
        od8Var.a(this.d.getPackageName());
        od8Var.b(this.f);
        return od8Var;
    }

    public void g() {
        e(this.d).z();
        e(this.d).A();
    }

    public void h(lb4 lb4Var, lsc lscVar, svc svcVar) {
        this.e = lb4Var;
        this.g = lscVar;
        this.h = svcVar;
        lscVar.a(this.c);
        this.h.b(this.f19663b);
    }

    public void i(od8 od8Var) {
        if (c().g()) {
            this.f19662a.execute(new z9s(this, od8Var));
        }
    }

    public void j(rqh rqhVar) {
        if (c().h()) {
            this.f19662a.execute(new ves(this, rqhVar));
        }
    }

    public final void n(k5s.a aVar, int i2) {
        k5s.a(this.d).n(aVar, i2);
    }

    public void o(String str) {
        this.f = str;
    }

    public void p(boolean z, boolean z2, long j2, long j3) {
        lb4 lb4Var = this.e;
        if (lb4Var != null) {
            if (z == lb4Var.g() && z2 == this.e.h() && j2 == this.e.c() && j3 == this.e.e()) {
                return;
            }
            long jC = this.e.c();
            long jE = this.e.e();
            lb4 lb4VarH = lb4.b().i(ifs.b(this.d)).j(this.e.f()).l(z).k(j2).o(z2).n(j3).h(this.d);
            this.e = lb4VarH;
            if (!lb4VarH.g()) {
                k5s.a(this.d).m("100886");
            } else if (jC != lb4VarH.c()) {
                x9s.B(this.d.getPackageName() + "reset event job " + lb4VarH.c());
                z();
            }
            if (!this.e.h()) {
                k5s.a(this.d).m("100887");
                return;
            }
            if (jE != lb4VarH.e()) {
                x9s.B(this.d.getPackageName() + " reset perf job " + lb4VarH.e());
                A();
            }
        }
    }

    public final int q() {
        HashMap<String, HashMap<String, g3s>> map = this.f19663b;
        int i2 = 0;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, g3s> map2 = this.f19663b.get(it.next());
                if (map2 != null) {
                    Iterator<String> it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        g3s g3sVar = map2.get(it2.next());
                        if (g3sVar instanceof rqh) {
                            i2 = (int) (((long) i2) + ((rqh) g3sVar).i);
                        }
                    }
                }
            }
        }
        return i2;
    }

    public void s() {
        if (c().g()) {
            aes aesVar = new aes();
            aesVar.a(this.d);
            aesVar.b(this.g);
            this.f19662a.execute(aesVar);
        }
    }

    public final void t(od8 od8Var) {
        lsc lscVar = this.g;
        if (lscVar != null) {
            lscVar.c(od8Var);
            if (a() < 10) {
                n(new ejs(this), i);
            } else {
                x();
                k5s.a(this.d).m("100888");
            }
        }
    }

    public final void u(rqh rqhVar) {
        svc svcVar = this.h;
        if (svcVar != null) {
            svcVar.c(rqhVar);
            if (q() < 10) {
                n(new zrs(this), i);
            } else {
                y();
                k5s.a(this.d).m("100889");
            }
        }
    }

    public void w() {
        if (c().h()) {
            aes aesVar = new aes();
            aesVar.b(this.h);
            aesVar.a(this.d);
            this.f19662a.execute(aesVar);
        }
    }

    public final void x() {
        try {
            this.g.b();
        } catch (Exception e) {
            x9s.D("we: " + e.getMessage());
        }
    }

    public final void y() {
        try {
            this.h.b();
        } catch (Exception e) {
            x9s.D("wp: " + e.getMessage());
        }
    }

    public final void z() {
        if (e(this.d).c().g()) {
            uds udsVar = new uds(this.d);
            int iC = (int) e(this.d).c().c();
            if (iC < 1800) {
                iC = 1800;
            }
            if (System.currentTimeMillis() - tfs.b(this.d).a("sp_client_report_status", "event_last_upload_time", 0L) > iC * 1000) {
                k5s.a(this.d).h(new fxs(this, udsVar), 10);
            }
            synchronized (h3s.class) {
                try {
                    if (!k5s.a(this.d).j(udsVar, iC)) {
                        k5s.a(this.d).m("100886");
                        k5s.a(this.d).j(udsVar, iC);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
