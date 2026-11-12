package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class et1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f17036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17037b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public et1(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f17036a = list;
        this.f17037b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static byte[] a(okh okhVar) {
        int iJ = okhVar.J();
        int iE = okhVar.e();
        okhVar.Q(iJ);
        return m34.d(okhVar.d(), iE, iJ);
    }

    public static et1 b(okh okhVar) throws ParserException {
        int i;
        int i2;
        float f;
        String strA;
        try {
            okhVar.Q(4);
            int iD = (okhVar.D() & 3) + 1;
            if (iD == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iD2 = okhVar.D() & 31;
            for (int i3 = 0; i3 < iD2; i3++) {
                arrayList.add(a(okhVar));
            }
            int iD3 = okhVar.D();
            for (int i4 = 0; i4 < iD3; i4++) {
                arrayList.add(a(okhVar));
            }
            if (iD2 > 0) {
                kgg.b bVarI = kgg.i((byte[]) arrayList.get(0), iD, ((byte[]) arrayList.get(0)).length);
                int i5 = bVarI.e;
                int i6 = bVarI.f;
                float f2 = bVarI.g;
                strA = m34.a(bVarI.f23825a, bVarI.f23826b, bVarI.c);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
                strA = null;
            }
            return new et1(arrayList, iD, i, i2, f, strA);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }
}
