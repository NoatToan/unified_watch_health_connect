package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class jls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22915b;
    public int c;

    public jls(int i, int i2, int i3) {
        this.f22914a = i;
        this.f22915b = i2;
        this.c = i3;
    }

    public static jls b(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        if (bArr[1] == i && (bArr[2] & 255) == i2) {
            return new jls(bArr[3] & 255, bArr.length >= 5 ? bArr[4] & 255 : 1, bArr.length >= 7 ? ((bArr[6] & 255) << 8) | (bArr[5] & 255) : 0);
        }
        return null;
    }

    public int a() {
        return this.f22915b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.f22914a == 1;
    }

    public boolean e() {
        return this.f22915b == 1;
    }

    public String toString() {
        return "PieceResult{pieceState=" + this.f22914a + ", profileState=" + this.f22915b + ", timeout=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
