package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class u5t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35438a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35439b = -1;
    public int c = 0;
    public int d = 0;

    public static u5t b(byte[] bArr) {
        if (bArr != null) {
            int i = 3;
            if (bArr.length >= 3) {
                try {
                    int i2 = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
                    u5t u5tVar = new u5t();
                    u5tVar.g(bArr[2] & 255);
                    if ((i2 & 1) != 0) {
                        u5tVar.f(bArr[3] & 255);
                        i = 4;
                    }
                    if ((i2 & 2) != 0) {
                        int i3 = i + 3;
                        int i4 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
                        i += 4;
                        u5tVar.c(i4 | ((bArr[i3] & 255) << 24));
                    }
                    if ((i2 & 4) != 0) {
                        u5tVar.e(bArr[i]);
                    }
                    return u5tVar;
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public int a() {
        return this.f35439b;
    }

    public final void c(int i) {
        this.f35439b = i;
    }

    public int d() {
        return this.c;
    }

    public void e(int i) {
        this.c = i;
    }

    public final void f(int i) {
        this.f35438a = i;
    }

    public void g(int i) {
        this.d = i;
    }

    public String toString() {
        return "DfuConfig{type=" + this.f35438a + ", flushSize=" + this.f35439b + ", flushType=" + this.c + ", version=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
