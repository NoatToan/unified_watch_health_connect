package com.xiaomi.push;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bh;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public class bp extends bz {
    private Thread q;
    private f0 r;
    private bl s;
    private byte[] t;

    public bp(XMPushService xMPushService, bu buVar) {
        super(xMPushService, buVar);
    }

    private bi h(boolean z) {
        bo boVar = new bo();
        if (z) {
            boVar.a("1");
        }
        return boVar;
    }

    private void m() throws cd {
        try {
            this.r = new f0(((bz) this).f60a.getInputStream(), this);
            this.s = new bl(((bz) this).f60a.getOutputStream(), this);
            g0 g0Var = new g0(this, "Blob Reader (" + ((bt) this).b + ")");
            this.q = g0Var;
            g0Var.start();
        } catch (Exception e) {
            throw new cd("Error to init reader and writer", e);
        }
    }

    @Override // com.xiaomi.push.bz
    /* JADX INFO: renamed from: a */
    public synchronized void mo3615a() {
        m();
        this.s.a();
    }

    @Override // com.xiaomi.push.bz
    public synchronized void a(int i, Exception exc) {
        f0 f0Var = this.r;
        if (f0Var != null) {
            f0Var.e();
            this.r = null;
        }
        bl blVar = this.s;
        if (blVar != null) {
            try {
                blVar.b();
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
            this.s = null;
        }
        this.t = null;
        super.a(i, exc);
    }

    @Override // com.xiaomi.push.bt
    @Deprecated
    public void a(cj cjVar) throws cd {
        b(bi.a(cjVar, (String) null));
    }

    @Override // com.xiaomi.push.bt
    public synchronized void a(com.xiaomi.push.service.az.b bVar) {
        d0.a(bVar, c(), this);
    }

    @Override // com.xiaomi.push.bt
    public synchronized void a(String str, String str2) {
        d0.b(str, str2, this);
    }

    @Override // com.xiaomi.push.bz
    public void a(boolean z) throws cd {
        if (this.s == null) {
            throw new cd("The BlobWriter is null.");
        }
        bi biVarH = h(z);
        com.xiaomi.channel.commonutils.logger.b.m3434a("[Slim] SND ping id=" + biVarH.e());
        b(biVarH);
        f();
    }

    @Override // com.xiaomi.push.bz, com.xiaomi.push.bt
    public void a(bi[] biVarArr) throws cd {
        for (bi biVar : biVarArr) {
            b(biVar);
        }
    }

    @Override // com.xiaomi.push.bt
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo3603a() {
        return true;
    }

    @Override // com.xiaomi.push.bt
    public void b(bi biVar) throws cd {
        bl blVar = this.s;
        if (blVar == null) {
            throw new cd("the writer is null.");
        }
        try {
            int iA = blVar.a(biVar);
            this.d = SystemClock.elapsedRealtime();
            String strF = biVar.f();
            if (!TextUtils.isEmpty(strF)) {
                cx.a(((bt) this).f54a, strF, iA, false, true, System.currentTimeMillis());
            }
            Iterator<bt.a> it2 = ((bt) this).f59b.values().iterator();
            while (it2.hasNext()) {
                it2.next().a(biVar);
            }
        } catch (Exception e) {
            throw new cd(e);
        }
    }

    public void j(bi biVar) {
        if (biVar == null) {
            return;
        }
        if (biVar.m3597a()) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("[Slim] RCV blob chid=" + biVar.a() + "; id=" + biVar.e() + "; errCode=" + biVar.b() + "; err=" + biVar.m3601c());
        }
        if (biVar.a() == 0) {
            if ("PING".equals(biVar.m3595a())) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("[Slim] RCV ping id=" + biVar.e());
                g();
            } else if ("CLOSE".equals(biVar.m3595a())) {
                c(13, null);
            }
        }
        Iterator<bt.a> it2 = ((bt) this).f56a.values().iterator();
        while (it2.hasNext()) {
            it2.next().a(biVar);
        }
    }

    public synchronized byte[] k() {
        if (this.t == null && !TextUtils.isEmpty(((bt) this).f55a)) {
            String strM3832a = com.xiaomi.push.service.bn.m3832a();
            StringBuilder sb = new StringBuilder();
            String str = ((bt) this).f55a;
            sb.append(str.substring(str.length() / 2));
            sb.append(strM3832a.substring(strM3832a.length() / 2));
            this.t = bh.a(((bt) this).f55a.getBytes(), sb.toString().getBytes());
        }
        return this.t;
    }

    public void l(cj cjVar) {
        if (cjVar == null) {
            return;
        }
        Iterator<bt.a> it2 = ((bt) this).f56a.values().iterator();
        while (it2.hasNext()) {
            it2.next().a(cjVar);
        }
    }
}
