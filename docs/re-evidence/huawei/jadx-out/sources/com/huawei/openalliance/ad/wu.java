package com.huawei.openalliance.ad;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class wu extends Table {
    public String g() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public wy f() {
        return a(new wy());
    }

    public xz e() {
        return a(new xz());
    }

    public xe d() {
        return a(new xe());
    }

    public xy c() {
        return a(new xy());
    }

    public String b() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public wu b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public void a(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public xz a(xz xzVar) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return xzVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public xy a(xy xyVar) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return xyVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public static final class a extends BaseVector {
        public wu a(wu wuVar, int i) {
            return wuVar.b(wu.__indirect(__element(i), this.bb), this.bb);
        }

        public wu a(int i) {
            return a(new wu(), i);
        }

        public a a(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
    }

    public xe a(xe xeVar) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return xeVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public wy a(wy wyVar) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return wyVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public long a() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }
}
