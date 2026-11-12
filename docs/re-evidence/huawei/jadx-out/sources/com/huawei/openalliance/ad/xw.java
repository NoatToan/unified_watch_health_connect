package com.huawei.openalliance.ad;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class xw extends Table {
    public String e() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String d() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xv c() {
        return a(new xv());
    }

    public String b() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xw b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public static final class a extends BaseVector {
        public xw a(xw xwVar, int i) {
            return xwVar.b(xw.__indirect(__element(i), this.bb), this.bb);
        }

        public xw a(int i) {
            return a(new xw(), i);
        }

        public a a(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
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

    public xv a(xv xvVar) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return xvVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }
}
