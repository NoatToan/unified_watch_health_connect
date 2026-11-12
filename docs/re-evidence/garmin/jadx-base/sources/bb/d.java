package bb;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f17132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f17142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17143l;

    private d(List<byte[]> list, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, float f14, String str) {
        this.f17132a = list;
        this.f17133b = i14;
        this.f17134c = i15;
        this.f17135d = i16;
        this.f17136e = i17;
        this.f17137f = i18;
        this.f17138g = i19;
        this.f17139h = i24;
        this.f17140i = i25;
        this.f17141j = i26;
        this.f17142k = f14;
        this.f17143l = str;
    }

    public static d a(fa.r rVar) throws ParserException {
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f14;
        int i24;
        int i25;
        try {
            rVar.H(4);
            int iU = (rVar.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = rVar.u() & 31;
            for (int i26 = 0; i26 < iU2; i26++) {
                int iA = rVar.A();
                int i27 = rVar.f70055b;
                rVar.H(iA);
                byte[] bArr = rVar.f70054a;
                byte[] bArr2 = new byte[iA + 4];
                System.arraycopy(fa.d.f70005a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i27, bArr2, 4, iA);
                arrayList.add(bArr2);
            }
            int iU3 = rVar.u();
            for (int i28 = 0; i28 < iU3; i28++) {
                int iA2 = rVar.A();
                int i29 = rVar.f70055b;
                rVar.H(iA2);
                byte[] bArr3 = rVar.f70054a;
                byte[] bArr4 = new byte[iA2 + 4];
                System.arraycopy(fa.d.f70005a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i29, bArr4, 4, iA2);
                arrayList.add(bArr4);
            }
            if (iU2 > 0) {
                ga.e.m mVarI = ga.e.i(iU, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i30 = mVarI.f76564e;
                int i34 = mVarI.f76565f;
                int i35 = mVarI.f76567h + 8;
                int i36 = mVarI.f76568i + 8;
                int i37 = mVarI.f76575p;
                int i38 = mVarI.f76576q;
                int i39 = mVarI.f76577r;
                int i44 = mVarI.f76578s;
                float f15 = mVarI.f76566g;
                int i45 = mVarI.f76560a;
                int i46 = mVarI.f76561b;
                int i47 = mVarI.f76562c;
                byte[] bArr5 = fa.d.f70005a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i45), Integer.valueOf(i46), Integer.valueOf(i47));
                i17 = i38;
                i18 = i39;
                i19 = i44;
                f14 = f15;
                i15 = i34;
                i16 = i35;
                i24 = i36;
                i25 = i37;
                i14 = i30;
            } else {
                str = null;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                i17 = -1;
                i18 = -1;
                i19 = 16;
                f14 = 1.0f;
                i24 = -1;
                i25 = -1;
            }
            return new d(arrayList, iU, i14, i15, i16, i24, i25, i17, i18, i19, f14, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e4);
        }
    }
}
