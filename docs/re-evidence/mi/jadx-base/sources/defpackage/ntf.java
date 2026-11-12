package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ntf extends ezo {
    public ntf f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public int h(int i) {
        int iB = b(16);
        if (iB != 0) {
            return this.f17233b.getInt(d(iB) + (i * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f17233b.get(iB + this.f17232a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f17233b.getShort(iB + this.f17232a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f17233b.getInt(iB + this.f17232a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f17233b.getShort(iB + this.f17232a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f17233b.getShort(iB + this.f17232a);
        }
        return (short) 0;
    }
}
