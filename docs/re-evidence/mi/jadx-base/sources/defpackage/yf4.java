package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class yf4 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af f40121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40122b = true;
    public InputStream c;

    public yf4(af afVar) {
        this.f40121a = afVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        ie ieVar;
        int i3 = 0;
        if (this.c == null) {
            if (!this.f40122b || (ieVar = (ie) this.f40121a.b()) == null) {
                return -1;
            }
            this.f40122b = false;
            this.c = ieVar.getOctetStream();
        }
        while (true) {
            int i4 = this.c.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                ie ieVar2 = (ie) this.f40121a.b();
                if (ieVar2 == null) {
                    this.c = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.c = ieVar2.getOctetStream();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        ie ieVar;
        if (this.c == null) {
            if (!this.f40122b || (ieVar = (ie) this.f40121a.b()) == null) {
                return -1;
            }
            this.f40122b = false;
            this.c = ieVar.getOctetStream();
        }
        while (true) {
            int i = this.c.read();
            if (i >= 0) {
                return i;
            }
            ie ieVar2 = (ie) this.f40121a.b();
            if (ieVar2 == null) {
                this.c = null;
                return -1;
            }
            this.c = ieVar2.getOctetStream();
        }
    }
}
