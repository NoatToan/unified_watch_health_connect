package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class gks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f19092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19093b;
    public byte[] c = null;

    public gks(int i) {
        if (i == 15) {
            this.f19092a = (byte) -3;
        } else if (i == 7) {
            this.f19092a = (byte) -2;
        } else if (i == 16) {
            this.f19092a = (byte) -4;
        } else {
            this.f19092a = (byte) -1;
        }
        this.f19093b = i;
    }

    public byte[] a() {
        byte[] bArr = this.c;
        int length = bArr == null ? 0 : bArr.length;
        byte[] bArr2 = new byte[length + 5];
        bArr2[0] = this.f19092a;
        int i = this.f19093b;
        bArr2[1] = (byte) (i & 255);
        bArr2[2] = (byte) ((i >> 8) & 255);
        bArr2[3] = (byte) ((i >> 16) & 255);
        bArr2[4] = (byte) ((i >> 24) & 255);
        if (bArr != null && bArr.length > 0) {
            System.arraycopy(bArr, 0, bArr2, 5, length);
        }
        return bArr2;
    }

    public byte b() {
        return this.f19092a;
    }

    public String toString() {
        return "HMGenericCommand{type=" + ((int) this.f19092a) + ", op=" + this.f19093b + ", commandExtend: " + tet.x(this.c) + AbstractJsonLexerKt.END_OBJ;
    }
}
