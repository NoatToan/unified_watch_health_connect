package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes3.dex */
public class c extends PKWareExtraHeader {
    public int d;
    public PKWareExtraHeader.HashAlgorithm e;

    public c() {
        super(new ZipShort(22));
    }

    @Override // org.apache.commons.compress.archivers.zip.PKWareExtraHeader, defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        a(4, i2);
        this.d = ZipShort.getValue(bArr, i);
        this.e = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
    }
}
