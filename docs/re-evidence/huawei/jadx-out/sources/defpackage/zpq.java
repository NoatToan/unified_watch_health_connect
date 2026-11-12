package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.io.outputstream.CipherOutputStream;
import net.lingala.zip4j.model.ZipParameters;

/* JADX INFO: loaded from: classes20.dex */
class zpq extends CipherOutputStream<zot> {
    public zpq(zpk zpkVar, ZipParameters zipParameters, char[] cArr, boolean z) throws IOException {
        super(zpkVar, zipParameters, cArr, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.io.outputstream.CipherOutputStream
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zot initializeEncrypter(OutputStream outputStream, ZipParameters zipParameters, char[] cArr, boolean z) throws IOException {
        zot zotVar = new zot(cArr, a(zipParameters), z);
        writeHeaders(zotVar.c());
        return zotVar;
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
        super.write(bArr, i, i2);
    }

    private long a(ZipParameters zipParameters) {
        if (zipParameters.v()) {
            return (zqp.d(zipParameters.l()) & 65535) << 16;
        }
        return zipParameters.f();
    }
}
