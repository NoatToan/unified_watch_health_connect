package com.huawei.openalliance.ad;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class xx extends Table {
    public int e() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public String d() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String c() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xx b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public static final class a extends BaseVector {
        public xx a(xx xxVar, int i) {
            return xxVar.b(xx.__indirect(__element(i), this.bb), this.bb);
        }

        public xx a(int i) {
            return a(new xx(), i);
        }

        public a a(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
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

    public int a() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }
}
