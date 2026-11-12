package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f18675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18676b;
    public final String c;

    public g7c(List<byte[]> list, int i, String str) {
        this.f18675a = list;
        this.f18676b = i;
        this.c = str;
    }

    public static g7c a(okh okhVar) throws ParserException {
        try {
            okhVar.Q(21);
            int iD = okhVar.D() & 3;
            int iD2 = okhVar.D();
            int iE = okhVar.e();
            int i = 0;
            for (int i2 = 0; i2 < iD2; i2++) {
                okhVar.Q(1);
                int iJ = okhVar.J();
                for (int i3 = 0; i3 < iJ; i3++) {
                    int iJ2 = okhVar.J();
                    i += iJ2 + 4;
                    okhVar.Q(iJ2);
                }
            }
            okhVar.P(iE);
            byte[] bArr = new byte[i];
            int i4 = 0;
            String strC = null;
            for (int i5 = 0; i5 < iD2; i5++) {
                int iD3 = okhVar.D() & 127;
                int iJ3 = okhVar.J();
                for (int i6 = 0; i6 < iJ3; i6++) {
                    int iJ4 = okhVar.J();
                    byte[] bArr2 = kgg.f23821a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(okhVar.d(), okhVar.e(), bArr, length, iJ4);
                    if (iD3 == 33 && i6 == 0) {
                        strC = m34.c(new pkh(bArr, length, length + iJ4));
                    }
                    i4 = length + iJ4;
                    okhVar.Q(iJ4);
                }
            }
            return new g7c(i == 0 ? null : Collections.singletonList(bArr), iD + 1, strC);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
