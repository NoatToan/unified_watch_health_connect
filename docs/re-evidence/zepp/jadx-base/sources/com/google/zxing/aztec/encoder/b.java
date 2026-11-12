package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import kotlin.text.Typography;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes4.dex */
final class b extends d {
    private final short c;
    private final short d;

    public b(d dVar, int i, int i2) {
        super(dVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.d
    public void c(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        return SearchCriteria.LT + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.d)).substring(1) + Typography.greater;
    }
}
