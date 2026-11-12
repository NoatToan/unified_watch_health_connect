package com.huawei.openalliance.ad;

import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class xl extends Table {
    public String z() {
        int i__offset = __offset(62);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String y() {
        int i__offset = __offset(60);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xk x() {
        return a(new xk());
    }

    public long w() {
        int i__offset = __offset(52);
        if (i__offset != 0) {
            return this.bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public String v() {
        int i__offset = __offset(46);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public wt u() {
        return a(new wt());
    }

    public xu t() {
        return a(new xu());
    }

    public wv s() {
        return a(new wv());
    }

    public ya r() {
        return a(new ya());
    }

    public String q() {
        int i__offset = __offset(36);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String p() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String o() {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String n() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xf m() {
        return a(new xf());
    }

    public int l() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int k() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String j() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String i() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xf.a h() {
        return b(new xf.a());
    }

    public xf.a g() {
        return a(new xf.a());
    }

    public StringVector f() {
        return a(new StringVector());
    }

    public String e() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int d() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String c() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xx.a b() {
        return a(new xx.a());
    }

    public xl b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public xf.a b(xf.a aVar) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public StringVector b(StringVector stringVector) {
        int i__offset = __offset(70);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public void a(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public String a() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ya a(ya yaVar) {
        int i__offset = __offset(38);
        if (i__offset != 0) {
            return yaVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xx.a a(xx.a aVar) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public xu a(xu xuVar) {
        int i__offset = __offset(42);
        if (i__offset != 0) {
            return xuVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xs a(xs xsVar) {
        int i__offset = __offset(90);
        if (i__offset != 0) {
            return xsVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xk a(xk xkVar) {
        int i__offset = __offset(54);
        if (i__offset != 0) {
            return xkVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xf a(xf xfVar) {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return xfVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xf.a a(xf.a aVar) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public wv a(wv wvVar) {
        int i__offset = __offset(40);
        if (i__offset != 0) {
            return wvVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public wt a(wt wtVar) {
        int i__offset = __offset(44);
        if (i__offset != 0) {
            return wtVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public wq.a a(wq.a aVar) {
        int i__offset = __offset(86);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public StringVector a(StringVector stringVector) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public int M() {
        int i__offset = __offset(98);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public xs L() {
        return a(new xs());
    }

    public int K() {
        int i__offset = __offset(88);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public wq.a J() {
        return a(new wq.a());
    }

    public String I() {
        int i__offset = __offset(84);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String H() {
        int i__offset = __offset(82);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int G() {
        int i__offset = __offset(80);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int F() {
        int i__offset = __offset(78);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int E() {
        int i__offset = __offset(76);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int D() {
        int i__offset = __offset(72);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public StringVector C() {
        return b(new StringVector());
    }

    public String B() {
        int i__offset = __offset(66);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String A() {
        int i__offset = __offset(64);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }
}
