package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.util.Session;
import com.squareup.okhttp.Call;
import java.net.URL;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements l0 {
    public String bcd;
    public String cde;
    public String def;
    public String efg;
    public long fgh;
    public Object lkj;
    public a nml;
    public int ghi = 0;
    public final Object onm = new Object();
    public boolean mlk = false;
    public String jih = "";
    public String ihg = "";
    public String hgf = "";
    public String gfe = "";
    public String fed = "";
    public String edc = "";
    public String dcb = "";
    public String cba = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4797a = "0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4798b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4799c = "";
    public long klm = System.currentTimeMillis();
    public int jkl = 0;
    public long qrs = 0;
    public long vwx = 0;
    public long lmn = -1;
    public int abc = 0;
    public int wxy = 0;
    public String hij = "";
    public String ijk = "";
    public String qpo = "";
    public String rqp = "";
    public int zab = -1;
    public int vut = -1;
    public CopyOnWriteArrayList wvu = new CopyOnWriteArrayList();
    public CopyOnWriteArrayList srq = new CopyOnWriteArrayList();
    public int xwv = 0;
    public int yxw = 0;
    public int tsr = 0;
    public int uts = 0;
    public long mno = -1;
    public long nop = -1;
    public long pqr = -1;
    public long opq = -1;
    public long stu = -1;
    public long rst = -1;
    public long tuv = -1;
    public long uvw = -1;
    public long yza = -1;
    public long xyz = -1;
    public long zyx = -1;
    public JsonArray kji = new JsonArray();
    public boolean pon = false;

    public b() {
        Session sessionLmn = m0.klm().lmn();
        m0.klm().abc(this);
        this.kji.add(sessionLmn.asJsonArray());
        this.cde = "";
    }

    public final void a() {
        if (b()) {
            return;
        }
        this.wxy++;
    }

    public final void abc(Call call) {
        this.lkj = call;
    }

    public final boolean b() {
        return this.abc >= 2;
    }

    public final void bcd(long j) {
        if (b()) {
            return;
        }
        this.qrs = j;
        this.abc = 1;
    }

    public final boolean c() {
        return d() || e();
    }

    public final void cba() {
        if (b()) {
            return;
        }
        this.xwv++;
    }

    public final void cde(String str) {
        if (b()) {
            return;
        }
        this.hij = str;
    }

    public final boolean d() {
        return ((long) this.jkl) >= 400;
    }

    public final void dcb() {
        if (b()) {
            return;
        }
        this.yxw++;
    }

    public final Object def() {
        return this.lkj;
    }

    public final boolean e() {
        String str = this.rqp;
        if (str == null) {
            return false;
        }
        return !"".equals(str);
    }

    public final void edc() {
        if (b()) {
            return;
        }
        this.uts++;
    }

    public final void efg(String str) {
        if (g()) {
            return;
        }
        this.def = str;
    }

    public final boolean f() {
        return this.mlk;
    }

    public final boolean fed() {
        boolean z;
        synchronized (this.onm) {
            z = this.pon;
        }
        return z;
    }

    public final String fgh() {
        return this.cde;
    }

    public final boolean g() {
        return this.abc >= 1;
    }

    public final String gfe() {
        return this.f4799c;
    }

    public final void ghi(String str) {
        this.gfe = str;
    }

    public final void h() {
        if (b()) {
            return;
        }
        this.tsr++;
    }

    public final String hgf() {
        return this.f4798b;
    }

    public final int hij() {
        return this.tsr;
    }

    public final void i() {
        int iAbc = c.abc(this);
        if (b()) {
            return;
        }
        this.zyx = iAbc;
    }

    public final String ihg() {
        return this.cba;
    }

    public final void ijk(long j) {
        this.uvw = j;
    }

    public final void j() {
        cba();
        if (this.zab > 0) {
            if (this.zyx == -1) {
                dcb();
            }
            if (b()) {
                return;
            }
            this.zyx = -1;
        }
    }

    public final String jih() {
        return this.dcb;
    }

    public final void jkl(long j) {
        this.tuv = j;
    }

    public final void k() {
        if (b()) {
            return;
        }
        this.abc = 2;
        this.lmn = System.currentTimeMillis();
    }

    public final String kji() {
        return this.fed;
    }

    public final int klm() {
        return this.yxw;
    }

    public final void l() {
        synchronized (this.onm) {
            this.pon = true;
        }
    }

    public final String lkj() {
        return this.edc;
    }

    public final void lmn(String str) {
        String string;
        if (str == null) {
            string = null;
        } else {
            try {
                URL url = new URL(str.replaceAll("[\\\\#]", "/"));
                StringBuilder sb = new StringBuilder();
                sb.append(url.getProtocol());
                sb.append("://");
                sb.append(url.getHost());
                if (url.getPort() != -1) {
                    sb.append(":");
                    sb.append(url.getPort());
                }
                sb.append(url.getPath());
                string = sb.toString();
            } catch (Throwable unused) {
                string = null;
            }
        }
        if (string == null || g()) {
            return;
        }
        this.bcd = string;
    }

    public final void m() {
        this.mlk = true;
    }

    public final String mlk() {
        return this.f4797a;
    }

    public final int mno() {
        return this.xwv;
    }

    public final a n() {
        m0 m0Var = m0.cde;
        synchronized (m0Var.bcd) {
            m0Var.bcd.remove(this);
        }
        if (this.bcd == null) {
            return null;
        }
        if (this.nml == null) {
            this.nml = new a(this);
        }
        return this.nml;
    }

    public final String nml() {
        return this.bcd;
    }

    public final String nop() {
        return this.hij;
    }

    public final int onm() {
        return this.jkl;
    }

    public final String opq() {
        return this.rqp;
    }

    public final long pon() {
        return this.klm;
    }

    public final int pqr() {
        return this.wxy;
    }

    public final String qpo() {
        return this.qpo;
    }

    public final String qrs() {
        return this.def;
    }

    public final CopyOnWriteArrayList rqp() {
        return this.srq;
    }

    public final jih rst() {
        int size = this.zab;
        if (size < 0) {
            size = this.wvu.size() - 1;
            this.zab = size;
        }
        this.zab = size;
        if (size < 0) {
            return null;
        }
        return (jih) this.wvu.get(size);
    }

    public final JsonArray srq() {
        return this.kji;
    }

    public final n0 stu() {
        int size = this.vut;
        if (size < 0) {
            size = this.srq.size() - 1;
            this.vut = size;
        }
        this.vut = size;
        if (size < 0) {
            return null;
        }
        return (n0) this.srq.get(size);
    }

    public final String tsr() {
        return this.hgf;
    }

    public final int tuv() {
        return this.ghi;
    }

    public final String uts() {
        return this.jih;
    }

    public final long uvw() {
        return this.opq;
    }

    public final String vut() {
        return this.ihg;
    }

    public final long vwx() {
        return this.pqr;
    }

    public final String wvu() {
        return this.gfe;
    }

    public final long wxy() {
        return this.nop;
    }

    public final String xwv() {
        return this.ijk;
    }

    public final long xyz() {
        return this.mno;
    }

    public final long yxw() {
        return this.stu;
    }

    public final long yza() {
        return this.uvw;
    }

    public final long zab() {
        return this.tuv;
    }

    public final long zyx() {
        return this.rst;
    }

    public final void abc(String str) {
        this.cde = str;
    }

    public final void def(long j) {
        if (b() || j < 0) {
            return;
        }
        this.fgh = j;
    }

    public final void fgh(String str) {
        if (str == null || b()) {
            return;
        }
        this.ijk = str;
    }

    public final int ghi() {
        return this.uts;
    }

    public final void hij(long j) {
        if (b()) {
            return;
        }
        this.mno = j;
    }

    public final long ijk() {
        return this.fgh;
    }

    public final String jkl() {
        return this.efg;
    }

    public final void klm(String str) {
        this.qpo = str;
    }

    public final void mno(String str) {
        this.f4797a = str;
    }

    public final void nop(String str) {
        this.edc = str;
    }

    public final void opq(String str) {
        this.fed = str;
    }

    public final void pqr(String str) {
        this.dcb = str;
    }

    public final void qrs(String str) {
        this.cba = str;
    }

    public final void abc(jih jihVar) {
        if (b()) {
            return;
        }
        this.wvu.add(jihVar);
        this.zab++;
    }

    public final void cde(long j) {
        if (b()) {
            return;
        }
        this.xyz = j;
    }

    public final void ghi(long j) {
        if (b()) {
            return;
        }
        this.nop = j;
    }

    public final void ijk(String str) {
        this.jih = str;
    }

    public final void jkl(String str) {
        this.hgf = str;
    }

    public final void klm(long j) {
        if (b()) {
            return;
        }
        this.rst = j;
    }

    public final long bcd() {
        return this.vwx;
    }

    public final void def(String str) {
        if (!b()) {
            this.rqp = str;
            return;
        }
        a aVar = this.nml;
        if (aVar != null) {
            synchronized (aVar.abc) {
                aVar.xwv = str;
            }
        }
    }

    public final void fgh(long j) {
        if (b()) {
            return;
        }
        this.pqr = j;
    }

    public final void hij(String str) {
        this.ihg = str;
    }

    public final void bcd(String str) {
        this.efg = str;
    }

    public final void cde(int i) {
        if (b()) {
            return;
        }
        this.jkl = i;
    }

    public final long efg() {
        return this.xyz;
    }

    public final void abc(n0 n0Var) {
        if (b()) {
            return;
        }
        this.srq.add(n0Var);
        this.vut++;
    }

    public final void bcd(int i) {
        this.ghi = i;
    }

    public final void efg(long j) {
        if (b()) {
            return;
        }
        this.opq = j;
    }

    public final long cde() {
        return this.qrs;
    }

    public final void rst(String str) {
        this.f4798b = str;
    }

    public final void abc(int i) {
        long j = i;
        if (j > this.yza) {
            this.yza = j;
        }
    }

    public final void abc(long j) {
        if (j >= 0) {
            this.vwx = j;
        }
    }

    @Override // com.huawei.agconnect.apms.l0
    public final void abc(Session session) {
        if (session == null) {
            return;
        }
        this.kji.add(session.asJsonArray());
    }

    public final void abc() {
        jih jihVarRst = rst();
        if (jihVarRst != null && !jihVarRst.efg()) {
            this.yxw++;
        }
        if (this.tsr - 1 != this.uts) {
            int i = 0;
            for (n0 n0Var : this.srq) {
                if (n0Var != null && !n0Var.jkl) {
                    i++;
                }
            }
            this.uts = i;
        }
        if (TextUtils.isEmpty(this.hij)) {
            try {
                this.hij = new URL(this.bcd).getHost();
            } catch (Throwable unused) {
                this.hij = "";
            }
        }
        if (TextUtils.isEmpty(this.hij) && TextUtils.isEmpty(this.hij)) {
            try {
                this.hij = new URL(this.bcd).getHost();
            } catch (Throwable unused2) {
                this.hij = "";
            }
        }
        if (TextUtils.isEmpty(this.ijk)) {
            String str = c.bcd.get(this.hij);
            this.ijk = str != null ? str : "";
        }
    }

    public final CopyOnWriteArrayList lmn() {
        return this.wvu;
    }

    public final void lmn(long j) {
        if (b()) {
            return;
        }
        this.stu = j;
    }
}
