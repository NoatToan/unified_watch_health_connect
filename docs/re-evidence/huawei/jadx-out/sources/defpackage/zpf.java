package defpackage;

import java.io.IOException;
import net.lingala.zip4j.io.inputstream.CipherInputStream;

/* JADX INFO: loaded from: classes46.dex */
class zpf extends CipherInputStream<zos> {
    public zpf(zpi zpiVar, zpz zpzVar, char[] cArr, int i, boolean z) throws IOException {
        super(zpiVar, zpzVar, cArr, i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zos initializeDecrypter(zpz zpzVar, char[] cArr, boolean z) throws IOException {
        return new zos(cArr, zpzVar.getCrc(), zpzVar.getLastModifiedTime(), b(), z);
    }

    private byte[] b() throws IOException {
        byte[] bArr = new byte[12];
        readRaw(bArr);
        return bArr;
    }
}
