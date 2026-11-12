package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class x4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38699b;

    public x4q(byte[] bArr, int i) {
        this.f38698a = bArr;
        this.f38699b = i;
    }

    public static void d(x4q x4qVar, z73 z73Var) {
        if (x4qVar == null) {
            z73Var.g(0);
            return;
        }
        byte[] bArr = x4qVar.f38698a;
        int i = x4qVar.f38699b;
        z73Var.h(bArr, i, (bArr[i] * 2) + 1);
    }

    public int a() {
        return this.f38698a[this.f38699b];
    }

    public int b(int i) {
        return this.f38698a[this.f38699b + (i * 2) + 1];
    }

    public int c(int i) {
        return this.f38698a[this.f38699b + (i * 2) + 2];
    }

    public String toString() {
        int iA = a();
        StringBuilder sb = new StringBuilder(iA * 2);
        for (int i = 0; i < iA; i++) {
            int iB = b(i);
            if (iB == 0) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            } else if (iB == 1) {
                sb.append('.');
            } else if (iB == 2) {
                sb.append('*');
            } else {
                if (iB != 3) {
                    throw new AssertionError();
                }
                sb.append(c(i));
                sb.append(';');
            }
        }
        return sb.toString();
    }
}
