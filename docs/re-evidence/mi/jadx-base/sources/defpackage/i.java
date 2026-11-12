package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class i implements Serializable {
    private static final long serialVersionUID = 1;
    public int t;
    public int u;
    public int v;
    public int w;

    public i(byte b2, byte b3, byte b4) {
        this.w = 254;
        this.t = b2;
        this.u = b3;
        this.v = b4;
    }

    public byte[] a() {
        return new byte[]{(byte) this.v, (byte) this.t, (byte) this.u};
    }

    public int b() {
        return 3;
    }

    public String toString() {
        return "ActivityData [intensity=" + this.t + ", steps=" + this.u + ", category=" + this.v + "]";
    }

    public i(byte b2, int i, byte b3) {
        this.w = 254;
        this.t = b2;
        this.u = i;
        this.v = b3;
    }

    public i(byte b2, int i, byte b3, int i2) {
        this(b2, i, b3);
        this.w = i2;
    }
}
