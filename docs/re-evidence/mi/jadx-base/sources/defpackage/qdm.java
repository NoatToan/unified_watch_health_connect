package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class qdm extends aip {
    public final short c;
    public final short d;

    public qdm(aip aipVar, int i, int i2) {
        super(aipVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.aip
    public void c(zo2 zo2Var, byte[] bArr) {
        zo2Var.c(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.d)).substring(1) + Typography.greater;
    }
}
