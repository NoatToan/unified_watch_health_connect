package com.huawei.openalliance.ad;

import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class xe extends Table {
    public xd d() {
        return a(new xd());
    }

    public int c() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public xe b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public int b() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public void a(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public String a() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public xd a(xd xdVar) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return xdVar.b(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }
}
