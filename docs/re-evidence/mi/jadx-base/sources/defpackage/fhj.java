package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class fhj extends ohh {
    public int d;
    public int e;
    public int f;

    public fhj(String str, int i, int i2, int i3, ByteBuffer byteBuffer) {
        super(str);
        this.e = i & 4095;
        this.d = (65535 & i) >> 12;
        this.f = i2;
        this.f29177b = i3;
    }

    public int d(int i) {
        return (i & 65535) >> 12;
    }

    public int e() {
        return this.f29177b;
    }

    public String f() {
        return this.c + this.f;
    }

    public int g(int i) {
        return i & 4095;
    }

    public abstract void h(ByteBuffer byteBuffer);
}
