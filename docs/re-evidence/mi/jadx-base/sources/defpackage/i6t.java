package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class i6t extends o6t {
    public ByteArrayOutputStream c;

    public i6t(o6t o6tVar) {
        super(o6tVar);
        this.c = new ByteArrayOutputStream();
    }

    @Override // defpackage.o6t
    public final byte[] b(byte[] bArr) {
        byte[] byteArray = this.c.toByteArray();
        try {
            this.c.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.c = new ByteArrayOutputStream();
        return byteArray;
    }

    @Override // defpackage.o6t
    public final void c(byte[] bArr) {
        try {
            this.c.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
