package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ll8 {
    public static int a(jl8 jl8Var, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iG = jl8Var.g(bArr, i + i3, i2 - i3);
            if (iG == -1) {
                break;
            }
            i3 += iG;
        }
        return i3;
    }
}
