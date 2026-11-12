package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class gj2 extends aip {
    public final short c;
    public final short d;

    public gj2(aip aipVar, int i, int i2) {
        super(aipVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.aip
    public void c(zo2 zo2Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                zo2Var.c(31, 5);
                short s2 = this.d;
                if (s2 > 62) {
                    zo2Var.c(s2 - 31, 16);
                } else if (i == 0) {
                    zo2Var.c(Math.min((int) s2, 31), 5);
                } else {
                    zo2Var.c(s2 - 31, 5);
                }
            }
            zo2Var.c(bArr[this.c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
