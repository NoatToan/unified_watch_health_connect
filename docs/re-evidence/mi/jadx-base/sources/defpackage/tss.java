package defpackage;

import java.io.ByteArrayOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class tss {
    public gks c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f35006a = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayOutputStream f35007b = new ByteArrayOutputStream();
    public int d = -1;
    public gks e = null;
    public byte[] f = null;
    public int g = 0;
    public int h = -1;
    public boolean i = false;
    public boolean j = false;

    public tss(gks gksVar) {
        this.c = gksVar;
    }

    public void a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 4) {
            this.i = true;
            return;
        }
        this.f35006a.write(bArr, 0, length);
        if (bArr[0] != -128) {
            this.i = true;
            return;
        }
        this.g = bArr[1] & 255;
        int i = (bArr[2] & 255) >> 6;
        int i2 = bArr[3] & 255;
        int i3 = length - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 4, bArr2, 0, i3);
        this.f35007b.write(bArr2, 0, i3);
        if (i == 2 || i == 3) {
            this.i = true;
        }
        if (this.h + 1 != i2) {
            this.j = true;
        }
        this.h = i2;
        if (!this.i || this.j) {
            return;
        }
        c();
    }

    public byte[] b() {
        return this.f;
    }

    public final void c() {
        int size = this.f35007b.size();
        if (size < 5) {
            return;
        }
        byte[] byteArray = this.f35007b.toByteArray();
        this.e = new gks((byteArray[0] & 255) | ((byteArray[1] & 255) << 8) | ((byteArray[2] & 255) << 16) | ((byteArray[3] & 255) << 24));
        this.d = byteArray[4] & 255;
        int i = size - 5;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.f = bArr;
            System.arraycopy(byteArray, 5, bArr, 0, i);
        }
    }

    public boolean d() {
        int i = this.d;
        return (i == 1 || i == 2) && this.e.b() == this.c.b();
    }

    public boolean e() {
        return this.i;
    }

    public String toString() {
        return "HMGenericResponse{rawTransferDatas=" + tet.x(this.f35006a.toByteArray()) + ", transferDatas=" + tet.x(this.f35007b.toByteArray()) + ", commandResponseData=" + tet.x(this.f) + ", inCommand=" + this.c + ", commandResponseStatus=" + this.d + ", responseCommand=" + this.e + ", version=" + this.g + ", lastIndex=" + this.h + ", isEnd=" + this.i + ", isLossPacket=" + this.j + AbstractJsonLexerKt.END_OBJ;
    }
}
