package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class zf4 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bf f41208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41209b = true;
    public InputStream c;

    public zf4(bf bfVar) {
        this.f41208a = bfVar;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        je jeVar;
        if (this.c == null) {
            if (!this.f41209b || (jeVar = (je) this.f41208a.b()) == null) {
                return -1;
            }
            this.f41209b = false;
            this.c = jeVar.getOctetStream();
        }
        while (true) {
            int i = this.c.read();
            if (i >= 0) {
                return i;
            }
            je jeVar2 = (je) this.f41208a.b();
            if (jeVar2 == null) {
                this.c = null;
                return -1;
            }
            this.c = jeVar2.getOctetStream();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        je jeVar;
        int i3 = 0;
        if (this.c == null) {
            if (!this.f41209b || (jeVar = (je) this.f41208a.b()) == null) {
                return -1;
            }
            this.f41209b = false;
            this.c = jeVar.getOctetStream();
        }
        while (true) {
            int i4 = this.c.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                je jeVar2 = (je) this.f41208a.b();
                if (jeVar2 == null) {
                    this.c = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.c = jeVar2.getOctetStream();
            }
        }
    }
}
