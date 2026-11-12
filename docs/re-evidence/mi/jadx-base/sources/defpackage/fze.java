package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class fze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f18391a = new ByteArrayOutputStream();
    public int c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f18392b = 0;

    public void a() {
        if (this.c > 0) {
            this.f18391a.write(this.f18392b);
            this.f18392b = (byte) 0;
            this.c = 0;
        }
    }

    public byte[] b() {
        return this.f18391a.toByteArray();
    }

    public final void c(int i) {
        byte b2 = this.f18392b;
        int i2 = this.c;
        byte b3 = (byte) ((i << i2) | b2);
        this.f18392b = b3;
        int i3 = i2 + 1;
        this.c = i3;
        if (i3 == 8) {
            this.f18391a.write(b3);
            this.f18392b = (byte) 0;
            this.c = 0;
        }
    }

    public void d(int i) {
        if (i == 0) {
            c(0);
            return;
        }
        int iAbs = Math.abs(i);
        for (int i2 = 0; i2 < iAbs; i2++) {
            c(1);
        }
        c(0);
        c(i <= 0 ? 1 : 0);
    }
}
