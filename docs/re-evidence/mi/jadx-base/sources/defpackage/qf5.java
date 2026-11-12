package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class qf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f31475a = new ByteArrayOutputStream();

    public void a(rj4 rj4Var) {
        int iM = rj4Var.m();
        this.f31475a.write(iM >> 8);
        this.f31475a.write(iM & 255);
        int i = 0;
        int i2 = 0;
        while (i < iM) {
            int iL = rj4Var.l(i * 2);
            short s = (short) (iL - i2);
            int iAbs = Math.abs((int) s);
            int i3 = iAbs / 238;
            if (i3 > 8) {
                this.f31475a.write(238);
                this.f31475a.write(s >> 8);
                this.f31475a.write(s & 255);
            } else if (s < 0) {
                this.f31475a.write(i3 + 239);
                this.f31475a.write(iAbs - (i3 * 238));
            } else {
                if (i3 > 0) {
                    this.f31475a.write(i3 + 247);
                }
                this.f31475a.write(iAbs - (i3 * 238));
            }
            i++;
            i2 = iL;
        }
    }

    public byte[] b() {
        return this.f31475a.toByteArray();
    }
}
