package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.io.outputstream.CipherOutputStream;
import net.lingala.zip4j.model.ZipParameters;

/* JADX INFO: loaded from: classes20.dex */
class zpj extends CipherOutputStream<zon> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f54436a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54437c;

    public zpj(zpk zpkVar, ZipParameters zipParameters, char[] cArr, boolean z) throws IOException {
        super(zpkVar, zipParameters, cArr, z);
        this.f54436a = new byte[16];
        this.f54437c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.io.outputstream.CipherOutputStream
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zon initializeEncrypter(OutputStream outputStream, ZipParameters zipParameters, char[] cArr, boolean z) throws IOException {
        zon zonVar = new zon(cArr, zipParameters.b(), z);
        c(zonVar);
        return zonVar;
    }

    private void c(zon zonVar) throws IOException {
        writeHeaders(zonVar.e());
        writeHeaders(zonVar.b());
    }

    @Override // net.lingala.zip4j.io.outputstream.CipherOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // net.lingala.zip4j.io.outputstream.CipherOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.outputstream.CipherOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f54437c;
        int i5 = 16 - i4;
        if (i2 >= i5) {
            System.arraycopy(bArr, i, this.f54436a, i4, i5);
            byte[] bArr2 = this.f54436a;
            super.write(bArr2, 0, bArr2.length);
            int i6 = 16 - this.f54437c;
            int i7 = i2 - i6;
            this.f54437c = 0;
            if (i7 != 0 && (i3 = i7 % 16) != 0) {
                System.arraycopy(bArr, (i7 + i6) - i3, this.f54436a, 0, i3);
                this.f54437c = i3;
                i7 -= i3;
            }
            super.write(bArr, i6, i7);
            return;
        }
        System.arraycopy(bArr, i, this.f54436a, i4, i2);
        this.f54437c += i2;
    }

    @Override // net.lingala.zip4j.io.outputstream.CipherOutputStream
    public void closeEntry() throws IOException {
        int i = this.f54437c;
        if (i != 0) {
            super.write(this.f54436a, 0, i);
            this.f54437c = 0;
        }
        writeHeaders(getEncrypter().a());
        super.closeEntry();
    }
}
