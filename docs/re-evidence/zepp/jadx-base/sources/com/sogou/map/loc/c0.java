package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class c0 implements u {
    private /* synthetic */ r1 a;

    public c0(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // com.sogou.map.loc.u
    public final /* synthetic */ void a(Object obj) {
        if (Boolean.TRUE != ((Boolean) obj)) {
            if (this.a.p != null) {
                r0.b("force fail, scan reject");
                this.a.p.b(null);
                return;
            }
            return;
        }
        synchronized (this.a.o) {
            boolean zStartScan = this.a.b.startScan();
            StringBuilder sb = new StringBuilder("startScan() ");
            sb.append(zStartScan);
            sb.append((zStartScan || this.a.p == null) ? "" : ", scan reject");
            r0.a(4, "locate", sb.toString());
            if (zStartScan) {
                this.a.g = j0.q();
                r1 r1Var = this.a;
                r1Var.b(r1Var.t, 2500L);
            } else if (this.a.p != null) {
                this.a.p.b(null);
            }
        }
    }
}
