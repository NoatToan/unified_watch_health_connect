package com.huawei.openalliance.ad;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class ws extends Table {
    public ws b(int i, ByteBuffer byteBuffer) {
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

    public static final class a extends BaseVector {
        public ws a(ws wsVar, int i) {
            return wsVar.b(ws.__indirect(__element(i), this.bb), this.bb);
        }

        public ws a(int i) {
            return a(new ws(), i);
        }

        public a a(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
    }

    public void a(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public StringVector a(StringVector stringVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public StringVector a() {
        return a(new StringVector());
    }
}
