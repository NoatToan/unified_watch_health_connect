package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class otf extends ezo {
    public static otf h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new otf());
    }

    public static otf i(ByteBuffer byteBuffer, otf otfVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return otfVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public otf f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public ntf j(ntf ntfVar, int i) {
        int iB = b(6);
        if (iB != 0) {
            return ntfVar.f(a(d(iB) + (i * 4)), this.f17233b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f17233b.getInt(iB + this.f17232a);
        }
        return 0;
    }
}
