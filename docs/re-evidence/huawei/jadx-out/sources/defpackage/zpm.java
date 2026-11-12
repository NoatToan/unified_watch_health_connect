package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;
import net.lingala.zip4j.io.outputstream.CipherOutputStream;
import net.lingala.zip4j.io.outputstream.CompressedOutputStream;
import net.lingala.zip4j.model.enums.CompressionLevel;

/* JADX INFO: loaded from: classes20.dex */
class zpm extends CompressedOutputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f54442c;
    protected Deflater e;

    public zpm(CipherOutputStream<?> cipherOutputStream, CompressionLevel compressionLevel, int i) {
        super(cipherOutputStream);
        this.e = new Deflater(compressionLevel.getLevel(), true);
        this.f54442c = new byte[i];
    }

    @Override // net.lingala.zip4j.io.outputstream.CompressedOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.outputstream.CompressedOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // net.lingala.zip4j.io.outputstream.CompressedOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.e.setInput(bArr, i, i2);
        while (!this.e.needsInput()) {
            d();
        }
    }

    private void d() throws IOException {
        Deflater deflater = this.e;
        byte[] bArr = this.f54442c;
        int iDeflate = deflater.deflate(bArr, 0, bArr.length);
        if (iDeflate > 0) {
            super.write(this.f54442c, 0, iDeflate);
        }
    }

    @Override // net.lingala.zip4j.io.outputstream.CompressedOutputStream
    public void closeEntry() throws IOException {
        if (!this.e.finished()) {
            this.e.finish();
            while (!this.e.finished()) {
                d();
            }
        }
        this.e.end();
        super.closeEntry();
    }
}
