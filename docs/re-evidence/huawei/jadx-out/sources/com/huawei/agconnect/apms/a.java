package com.huawei.agconnect.apms;

import com.google.gson.JsonArray;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Object abc = new Object();
    public long bcd;
    public String cde;
    public String def;
    public String efg;
    public String fgh;
    public long ghi;
    public String hij;
    public String ijk;
    public String jih;
    public int jkl;
    public String kji;
    public long klm;
    public String lkj;
    public int lmn;
    public String mlk;
    public long mno;
    public String nml;
    public long nop;
    public String onm;
    public long opq;
    public String pon;
    public long pqr;
    public String qpo;
    public long qrs;
    public String rqp;
    public long rst;
    public String srq;
    public long stu;
    public String tsr;
    public long tuv;
    public JsonArray uts;
    public long uvw;
    public int vut;
    public long vwx;
    public String wvu;
    public int wxy;
    public String xwv;
    public int xyz;
    public CopyOnWriteArrayList yxw;
    public CopyOnWriteArrayList yza;
    public int zab;
    public int zyx;

    public a(b bVar) {
        this.nml = "";
        this.mlk = "";
        this.lkj = "0";
        this.kji = "";
        this.jih = "";
        String strNml = bVar.nml();
        int iIndexOf = strNml.indexOf(63);
        if (iIndexOf < 0 && (iIndexOf = strNml.indexOf(59)) < 0) {
            iIndexOf = strNml.length();
        }
        bVar.abc();
        this.cde = strNml.substring(0, iIndexOf);
        this.def = bVar.fgh();
        this.efg = bVar.qrs();
        this.fgh = bVar.jkl();
        this.ghi = bVar.ijk();
        this.bcd = bVar.efg() == -1 ? bVar.pon() : bVar.efg();
        this.klm = bcd(bVar);
        if (bVar.f()) {
            this.klm = abc(bVar) + this.klm;
        }
        this.jkl = bVar.onm();
        this.xwv = bVar.opq();
        this.qrs = bVar.cde();
        this.vwx = bVar.bcd();
        this.hij = bVar.nop();
        this.lmn = bVar.pqr();
        this.ijk = bVar.xwv();
        this.yza = bVar.lmn();
        this.wxy = bVar.klm();
        this.xyz = bVar.mno();
        this.yxw = bVar.rqp();
        this.zab = bVar.ghi();
        this.zyx = bVar.hij();
        this.mno = bVar.xyz();
        this.nop = bVar.wxy();
        this.opq = bVar.vwx();
        this.pqr = bVar.uvw();
        this.rst = bVar.yxw();
        this.stu = bVar.zyx();
        this.tuv = bVar.zab();
        this.uvw = bVar.yza();
        this.wvu = bVar.qpo();
        this.vut = bVar.tuv();
        this.uts = bVar.srq();
        this.qpo = bVar.wvu();
        this.srq = bVar.vut();
        this.rqp = bVar.tsr();
        this.tsr = bVar.uts();
        this.pon = bVar.kji();
        this.onm = bVar.lkj();
        this.nml = bVar.jih();
        this.mlk = bVar.ihg();
        this.lkj = bVar.mlk();
        this.kji = bVar.hgf();
        this.jih = bVar.gfe();
    }

    public final long abc() {
        return this.vwx;
    }

    public final long bcd() {
        return this.qrs;
    }

    public final String cde() {
        return this.def;
    }

    public final int def() {
        return this.zab;
    }

    public final int efg() {
        return this.zyx;
    }

    public final long fgh() {
        return this.ghi;
    }

    public final String ghi() {
        return this.fgh;
    }

    public final int hij() {
        return this.wxy;
    }

    public final CopyOnWriteArrayList ijk() {
        return this.yza;
    }

    public final int jkl() {
        return this.xyz;
    }

    public final String kji() {
        return this.cde;
    }

    public final String klm() {
        return this.hij;
    }

    public final long lkj() {
        return this.klm;
    }

    public final String lmn() {
        String str;
        synchronized (this.abc) {
            str = this.xwv;
        }
        return str;
    }

    public final int mlk() {
        return this.jkl;
    }

    public final int mno() {
        return this.lmn;
    }

    public final long nml() {
        return this.bcd;
    }

    public final String nop() {
        return this.efg;
    }

    public final String onm() {
        return this.wvu;
    }

    public final int opq() {
        return this.vut;
    }

    public final CopyOnWriteArrayList pon() {
        return this.yxw;
    }

    public final String pqr() {
        return this.lkj;
    }

    public final JsonArray qpo() {
        return this.uts;
    }

    public final String qrs() {
        return this.onm;
    }

    public final String rqp() {
        return this.rqp;
    }

    public final String rst() {
        return this.pon;
    }

    public final String srq() {
        return this.tsr;
    }

    public final String stu() {
        return this.nml;
    }

    public final String tsr() {
        return this.srq;
    }

    public final String tuv() {
        return this.mlk;
    }

    public final String uts() {
        return this.qpo;
    }

    public final String uvw() {
        return this.kji;
    }

    public final String vut() {
        return this.ijk;
    }

    public final String vwx() {
        return this.jih;
    }

    public final long wvu() {
        return this.rst;
    }

    public final long wxy() {
        return this.pqr;
    }

    public final long xwv() {
        return this.stu;
    }

    public final long xyz() {
        return this.opq;
    }

    public final long yxw() {
        return this.tuv;
    }

    public final long yza() {
        return this.nop;
    }

    public final long zab() {
        return this.mno;
    }

    public final long zyx() {
        return this.uvw;
    }

    public static long abc(b bVar) {
        jih jihVarRst = bVar.rst();
        if (jihVarRst != null && jihVarRst.efg()) {
            return jihVarRst.cde - jihVarRst.bcd;
        }
        return 0L;
    }

    public final long bcd(b bVar) {
        long j = bVar.lmn;
        long j2 = this.bcd;
        if (j > j2) {
            return (int) (j - j2);
        }
        return -1L;
    }
}
