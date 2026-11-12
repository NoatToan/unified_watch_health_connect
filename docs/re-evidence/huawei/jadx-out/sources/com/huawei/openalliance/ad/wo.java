package com.huawei.openalliance.ad;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class wo extends Table {
    public xc h() {
        return a(new xc());
    }

    public wr.a g() {
        return a(new wr.a());
    }

    public int f() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public xg.a e() {
        return a(new xg.a());
    }

    public wx.a d() {
        return a(new wx.a());
    }

    public String c() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public wo b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public int b() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
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

    public xg.a a(xg.a aVar) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public static final class a extends BaseVector {
        public wo a(wo woVar, int i) {
            return woVar.b(wo.__indirect(__element(i), this.bb), this.bb);
        }

        public wo a(int i) {
            return a(new wo(), i);
        }

        public a a(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
    }

    public xc a(xc xcVar) {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return xcVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public wx.a a(wx.a aVar) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public wr.a a(wr.a aVar) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }
}
