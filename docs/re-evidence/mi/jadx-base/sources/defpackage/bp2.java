package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class bp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f4438a = new ByteArrayOutputStream();
    public int c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f4439b = 0;

    public void a() {
        if (this.c > 0) {
            this.f4438a.write(this.f4439b);
            this.f4439b = (byte) 0;
            this.c = 0;
        }
    }

    public byte[] b() {
        return this.f4438a.toByteArray();
    }

    public void c(int i) {
        byte b2 = this.f4439b;
        int i2 = this.c;
        byte b3 = (byte) ((i << (7 - i2)) | b2);
        this.f4439b = b3;
        int i3 = i2 + 1;
        this.c = i3;
        if (i3 == 8) {
            this.f4438a.write(b3);
            this.f4439b = (byte) 0;
            this.c = 0;
        }
    }

    public void d(boolean z) {
        c(z ? 1 : 0);
    }

    public void e(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            c((i >> i3) & 1);
        }
    }
}
