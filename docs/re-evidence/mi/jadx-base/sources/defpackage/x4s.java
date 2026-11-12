package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class x4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38700a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38701b = 0;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;

    public static x4s b(byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            return null;
        }
        x4s x4sVar = new x4s();
        x4sVar.f38700a = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        x4sVar.f38701b = (bArr[4] & 255) | ((bArr[5] & 255) << 8) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 24);
        x4sVar.c = (bArr[8] & 255) | ((bArr[9] & 255) << 8);
        x4sVar.d = (bArr[10] & 255) | ((bArr[11] & 255) << 8) | ((bArr[12] & 255) << 16) | ((bArr[13] & 255) << 24);
        x4sVar.e = (bArr[14] & 255) | ((bArr[15] & 255) << 8) | ((bArr[16] & 255) << 16) | ((bArr[17] & 255) << 24);
        x4sVar.f = (bArr[18] & 255) | ((bArr[19] & 255) << 8) | ((bArr[20] & 255) << 16) | ((bArr[21] & 255) << 24);
        x4sVar.g = (bArr[22] & 255) | ((bArr[23] & 255) << 8);
        x4sVar.h = (bArr[24] & 255) | ((bArr[25] & 255) << 8);
        x4sVar.i = ((bArr[27] & 255) << 8) | (bArr[26] & 255);
        return x4sVar;
    }

    public int a() {
        return this.i;
    }

    public boolean c() {
        return this.f38700a == 1464225096 && this.f38701b == 1313294675;
    }

    public String toString() {
        return "HMFwHeader{magicL=" + this.f38700a + ", magicH=" + this.f38701b + ", headerSize=" + this.c + ", fwSize=" + this.d + ", fwType=" + this.e + ", fwVersion=" + this.f + ", pnpId=" + this.g + ", pnpVersion=" + this.h + ", fwOrder=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }
}
