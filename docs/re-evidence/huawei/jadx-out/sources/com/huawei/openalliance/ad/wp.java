package com.huawei.openalliance.ad;

import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes12.dex */
public final class wp extends Table {
    public String n() {
        int i__offset = __offset(50);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public String m() {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int l() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int k() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int j() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int i() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public ws.a h() {
        return a(new ws.a());
    }

    public String g() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public StringVector f() {
        return b(new StringVector());
    }

    public xr.a e() {
        return a(new xr.a());
    }

    public StringVector d() {
        return a(new StringVector());
    }

    public wo.a c() {
        return a(new wo.a());
    }

    public String b() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public wp b(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer);
        return this;
    }

    public StringVector b(StringVector stringVector) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public void a(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public xr.a a(xr.a aVar) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public ws.a a(ws.a aVar) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return aVar.a(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public wo.a a(wo.a aVar) {
        int i__offset = __offset(10);
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

    public int a() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static wp a(ByteBuffer byteBuffer, wp wpVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return wpVar.b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static wp a(ByteBuffer byteBuffer) {
        return a(byteBuffer, new wp());
    }
}
