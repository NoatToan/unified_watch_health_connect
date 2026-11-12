package com.huawei.openalliance.ad;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.up.model.UserInfomation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class wx extends Table {
    public String z() {
        int i__offset = __offset(76);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String y() {
        int i__offset = __offset(70);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int x() {
        int i__offset = __offset(68);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public IntVector w() {
        return b(new IntVector());
    }

    public String v() {
        int i__offset = __offset(62);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String u() {
        int i__offset = __offset(60);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public IntVector t() {
        return a(new IntVector());
    }

    public int s() {
        int i__offset = __offset(56);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String r() {
        int i__offset = __offset(54);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String q() {
        int i__offset = __offset(52);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ww p() {
        return a(new ww());
    }

    public String o() {
        int i__offset = __offset(48);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xj.a n() {
        return a(new xj.a());
    }

    public xm.a m() {
        return a(new xm.a());
    }

    public StringVector l() {
        return b(new StringVector());
    }

    public StringVector k() {
        return a(new StringVector());
    }

    public long j() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return this.bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public String i() {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int h() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String g() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xl f() {
        return a(new xl());
    }

    public xp e() {
        return a(new xp());
    }

    public int d() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int c() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public wx b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public StringVector b(StringVector stringVector) {
        int i__offset = __offset(42);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public IntVector b(IntVector intVector) {
        int i__offset = __offset(66);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.bb);
        }
        return null;
    }

    public long b() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public String af() {
        int i__offset = __offset(170);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int ae() {
        int i__offset = __offset(168);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String ad() {
        int i__offset = __offset(MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String ac() {
        int i__offset = __offset(MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String ab() {
        int i__offset = __offset(MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String aa() {
        int i__offset = __offset(160);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
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

    public xw a(xw xwVar) {
        int i__offset = __offset(128);
        if (i__offset != 0) {
            return xwVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xt a(xt xtVar) {
        int i__offset = __offset(82);
        if (i__offset != 0) {
            return xtVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xp a(xp xpVar) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return xpVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xo.a a(xo.a aVar) {
        int i__offset = __offset(126);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public xm.a a(xm.a aVar) {
        int i__offset = __offset(44);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public xl a(xl xlVar) {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return xlVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xj.a a(xj.a aVar) {
        int i__offset = __offset(46);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public xi a(xi xiVar) {
        int i__offset = __offset(AgrConstant.HEALTH_AGREEMENT_CODE);
        if (i__offset != 0) {
            return xiVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xg.a a(xg.a aVar) {
        int i__offset = __offset(102);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public xb.a a(xb.a aVar) {
        int i__offset = __offset(114);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public xa a(xa xaVar) {
        int i__offset = __offset(152);
        if (i__offset != 0) {
            return xaVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public wz a(wz wzVar) {
        int i__offset = __offset(140);
        if (i__offset != 0) {
            return wzVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public ww a(ww wwVar) {
        int i__offset = __offset(50);
        if (i__offset != 0) {
            return wwVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public wu.a a(wu.a aVar) {
        int i__offset = __offset(130);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public wr.a a(wr.a aVar) {
        int i__offset = __offset(154);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public StringVector a(StringVector stringVector) {
        int i__offset = __offset(40);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public IntVector a(IntVector intVector) {
        int i__offset = __offset(58);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.bb);
        }
        return null;
    }

    public String Z() {
        int i__offset = __offset(156);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public wr.a Y() {
        return a(new wr.a());
    }

    public xa X() {
        return a(new xa());
    }

    public String W() {
        int i__offset = __offset(148);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public wz V() {
        return a(new wz());
    }

    public String U() {
        int i__offset = __offset(TsExtractor.TS_STREAM_TYPE_DTS_HD);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String T() {
        int i__offset = __offset(134);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int S() {
        int i__offset = __offset(UserInfomation.WEIGHT_DEFAULT_ENGLISH);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public wu.a R() {
        return a(new wu.a());
    }

    public xw Q() {
        return a(new xw());
    }

    public xo.a P() {
        return a(new xo.a());
    }

    public xi O() {
        return a(new xi());
    }

    public xb.a N() {
        return a(new xb.a());
    }

    public String M() {
        int i__offset = __offset(112);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String L() {
        int i__offset = __offset(108);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int K() {
        int i__offset = __offset(106);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int J() {
        int i__offset = __offset(104);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public xg.a I() {
        return a(new xg.a());
    }

    public int H() {
        int i__offset = __offset(98);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String G() {
        int i__offset = __offset(94);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public float F() {
        int i__offset = __offset(92);
        if (i__offset != 0) {
            return this.bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public int E() {
        int i__offset = __offset(90);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String D() {
        int i__offset = __offset(84);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public static final class a extends BaseVector {
        public wx a(wx wxVar, int i) {
            return wxVar.b(wx.__indirect(__element(i), this.bb), this.bb);
        }

        public wx a(int i) {
            return a(new wx(), i);
        }

        public a a(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
    }

    public xt C() {
        return a(new xt());
    }

    public String B() {
        int i__offset = __offset(80);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String A() {
        int i__offset = __offset(78);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }
}
