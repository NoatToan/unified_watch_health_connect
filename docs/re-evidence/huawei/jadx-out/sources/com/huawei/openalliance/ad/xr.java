package com.huawei.openalliance.ad;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class xr extends Table {
    public int m() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public xw.a l() {
        return a(new xw.a());
    }

    public int k() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public wu.a j() {
        return a(new wu.a());
    }

    public xw i() {
        return a(new xw());
    }

    public int h() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public ya g() {
        return a(new ya());
    }

    public xk.a f() {
        return a(new xk.a());
    }

    public String e() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xf.a d() {
        return a(new xf.a());
    }

    public int c() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String b() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xr b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
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
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return yaVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xw a(xw xwVar) {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return xwVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xw.a a(xw.a aVar) {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public static final class a extends BaseVector {
        public xr a(xr xrVar, int i) {
            return xrVar.b(xr.__indirect(__element(i), this.bb), this.bb);
        }

        public xr a(int i) {
            return a(new xr(), i);
        }

        public a a(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
    }

    public xk.a a(xk.a aVar) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public xf.a a(xf.a aVar) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public wu.a a(wu.a aVar) {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }
}
