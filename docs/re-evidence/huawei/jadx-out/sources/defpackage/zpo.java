package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.io.outputstream.CipherOutputStream;
import net.lingala.zip4j.model.ZipParameters;

/* JADX INFO: loaded from: classes20.dex */
class zpo extends CipherOutputStream<b> {
    public zpo(zpk zpkVar, ZipParameters zipParameters, char[] cArr) throws IOException {
        super(zpkVar, zipParameters, cArr, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.io.outputstream.CipherOutputStream
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b initializeEncrypter(OutputStream outputStream, ZipParameters zipParameters, char[] cArr, boolean z) {
        return new b();
    }

    static class b implements Encrypter {
        @Override // net.lingala.zip4j.crypto.Encrypter
        public int encryptData(byte[] bArr, int i, int i2) {
            return i2;
        }

        b() {
        }

        @Override // net.lingala.zip4j.crypto.Encrypter
        public int encryptData(byte[] bArr) {
            return encryptData(bArr, 0, bArr.length);
        }
    }
}
