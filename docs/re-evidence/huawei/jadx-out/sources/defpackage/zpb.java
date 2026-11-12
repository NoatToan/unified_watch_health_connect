package defpackage;

import java.io.IOException;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.io.inputstream.CipherInputStream;

/* JADX INFO: loaded from: classes46.dex */
class zpb extends CipherInputStream<c> {
    public zpb(zpi zpiVar, zpz zpzVar, char[] cArr, int i) throws IOException {
        super(zpiVar, zpzVar, cArr, i, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c initializeDecrypter(zpz zpzVar, char[] cArr, boolean z) {
        return new c();
    }

    static class c implements Decrypter {
        @Override // net.lingala.zip4j.crypto.Decrypter
        public int decryptData(byte[] bArr, int i, int i2) {
            return i2;
        }

        c() {
        }
    }
}
