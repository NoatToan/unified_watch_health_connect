package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.ha;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.service.u;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class zvs extends sws {
    public Thread D;
    public qvs E;
    public svs F;
    public byte[] G;

    public zvs(XMPushService xMPushService, jws jwsVar) {
        super(xMPushService, jwsVar);
    }

    @Override // defpackage.sws
    public synchronized void I() {
        Z();
        this.F.b();
    }

    @Override // defpackage.sws
    public synchronized void J(int i, Exception exc) {
        try {
            qvs qvsVar = this.E;
            if (qvsVar != null) {
                qvsVar.e();
                this.E = null;
            }
            svs svsVar = this.F;
            if (svsVar != null) {
                try {
                    svsVar.c();
                } catch (Exception e) {
                    x9s.D("SlimConnection shutdown cause exception: " + e);
                }
                this.F = null;
            }
            this.G = null;
            super.J(i, exc);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.sws
    public void O(boolean z) throws ha {
        if (this.F == null) {
            throw new ha("The BlobWriter is null.");
        }
        mvs mvsVarU = U(z);
        x9s.o("[Slim] SND ping id=" + mvsVarU.D());
        w(mvsVarU);
        S();
    }

    public final mvs U(boolean z) {
        yvs yvsVar = new yvs();
        if (z) {
            yvsVar.k("1");
        }
        byte[] bArrI = gvs.i();
        if (bArrI != null) {
            nqs nqsVar = new nqs();
            nqsVar.l(l3s.b(bArrI));
            yvsVar.n(nqsVar.h(), null);
        }
        return yvsVar;
    }

    public void W(mvs mvsVar) {
        if (mvsVar == null) {
            return;
        }
        if (css.a(mvsVar)) {
            mvs mvsVar2 = new mvs();
            mvsVar2.h(mvsVar.a());
            mvsVar2.l("SYNC", "ACK_RTT");
            mvsVar2.k(mvsVar.D());
            mvsVar2.u(mvsVar.s());
            mvsVar2.i(mvsVar.y());
            XMPushService xMPushService = this.o;
            xMPushService.a(new u(xMPushService, mvsVar2));
        }
        if (mvsVar.o()) {
            x9s.o("[Slim] RCV blob chid=" + mvsVar.a() + "; id=" + mvsVar.D() + "; errCode=" + mvsVar.r() + "; err=" + mvsVar.z());
        }
        if (mvsVar.a() == 0) {
            if ("PING".equals(mvsVar.e())) {
                x9s.o("[Slim] RCV ping id=" + mvsVar.D());
                T();
            } else if ("CLOSE".equals(mvsVar.e())) {
                Q(13, null);
            }
        }
        Iterator<gws.a> it = this.g.values().iterator();
        while (it.hasNext()) {
            it.next().a(mvsVar);
        }
    }

    public synchronized byte[] X() {
        try {
            if (this.G == null && !TextUtils.isEmpty(this.j)) {
                String strG = rds.g();
                StringBuilder sb = new StringBuilder();
                String str = this.j;
                sb.append(str.substring(str.length() / 2));
                sb.append(strG.substring(strG.length() / 2));
                this.G = rcs.i(this.j.getBytes(), sb.toString().getBytes());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.G;
    }

    public void Y(fys fysVar) {
        if (fysVar == null) {
            return;
        }
        Iterator<gws.a> it = this.g.values().iterator();
        while (it.hasNext()) {
            it.next().b(fysVar);
        }
    }

    public final void Z() throws ha {
        try {
            this.E = new qvs(this.u.getInputStream(), this);
            this.F = new svs(this.u.getOutputStream(), this);
            aws awsVar = new aws(this, "Blob Reader (" + this.m + ")");
            this.D = awsVar;
            awsVar.start();
        } catch (Exception e) {
            throw new ha("Error to init reader and writer", e);
        }
    }

    @Override // defpackage.gws
    public synchronized void i(bg.b bVar) {
        hvs.a(bVar, P(), this);
    }

    @Override // defpackage.gws
    @Deprecated
    public void m(fys fysVar) throws ha {
        w(mvs.c(fysVar, null));
    }

    @Override // defpackage.gws
    public synchronized void o(String str, String str2) {
        hvs.b(str, str2, this);
    }

    @Override // defpackage.gws
    public void p(mvs[] mvsVarArr) throws ha {
        for (mvs mvsVar : mvsVarArr) {
            w(mvsVar);
        }
    }

    @Override // defpackage.gws
    public boolean q() {
        return true;
    }

    @Override // defpackage.gws
    public void w(mvs mvsVar) throws ha {
        svs svsVar = this.F;
        if (svsVar == null) {
            throw new ha("the writer is null.");
        }
        try {
            int iA = svsVar.a(mvsVar);
            this.q = SystemClock.elapsedRealtime();
            String strE = mvsVar.E();
            if (!TextUtils.isEmpty(strE)) {
                xys.j(this.o, strE, iA, false, true, System.currentTimeMillis());
            }
            Iterator<gws.a> it = this.h.values().iterator();
            while (it.hasNext()) {
                it.next().a(mvsVar);
            }
        } catch (Exception e) {
            throw new ha(e);
        }
    }
}
