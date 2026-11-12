package bb;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f17276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f17284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ga.e.k f17287l;

    private z(List<byte[]> list, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, float f14, int i27, String str, ga.e.k kVar) {
        this.f17276a = list;
        this.f17277b = i14;
        this.f17278c = i17;
        this.f17279d = i18;
        this.f17280e = i19;
        this.f17281f = i24;
        this.f17282g = i25;
        this.f17283h = i26;
        this.f17284i = f14;
        this.f17285j = i27;
        this.f17286k = str;
        this.f17287l = kVar;
    }

    public static z a(fa.r rVar, boolean z14, ga.e.k kVar) throws ParserException {
        boolean z15;
        ga.e.g gVarF;
        int i14 = 4;
        try {
            if (z14) {
                rVar.H(4);
            } else {
                rVar.H(21);
            }
            int iU = rVar.u() & 3;
            int iU2 = rVar.u();
            int i15 = rVar.f70055b;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                z15 = true;
                if (i17 >= iU2) {
                    break;
                }
                rVar.H(1);
                int iA = rVar.A();
                for (int i19 = 0; i19 < iA; i19++) {
                    int iA2 = rVar.A();
                    i18 += iA2 + 4;
                    rVar.H(iA2);
                }
                i17++;
            }
            rVar.G(i15);
            byte[] bArr = new byte[i18];
            ga.e.k kVar2 = kVar;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            int i30 = -1;
            int i34 = -1;
            int i35 = -1;
            float f14 = 1.0f;
            String strA = null;
            int i36 = 0;
            int i37 = 0;
            while (i36 < iU2) {
                int iU3 = rVar.u() & 63;
                int iA3 = rVar.A();
                int i38 = i16;
                ga.e.k kVarH = kVar2;
                while (i38 < iA3) {
                    boolean z16 = z15;
                    int iA4 = rVar.A();
                    int i39 = iU;
                    System.arraycopy(ga.e.f76514a, i16, bArr, i37, i14);
                    int i44 = i37 + 4;
                    System.arraycopy(rVar.f70054a, rVar.f70055b, bArr, i44, iA4);
                    if (iU3 == 32 && i38 == 0) {
                        kVarH = ga.e.h(i44, i44 + iA4, bArr);
                    } else {
                        if (iU3 == 33 && i38 == 0) {
                            ga.e.h hVarG = ga.e.g(bArr, i44, i44 + iA4, kVarH);
                            i24 = hVarG.f76541d;
                            i25 = hVarG.f76542e;
                            i26 = hVarG.f76539b + 8;
                            i27 = hVarG.f76540c + 8;
                            int i45 = hVarG.f76545h;
                            int i46 = hVarG.f76546i;
                            i28 = i45;
                            int i47 = hVarG.f76547j;
                            float f15 = hVarG.f76543f;
                            int i48 = hVarG.f76544g;
                            ga.e.c cVar = hVarG.f76538a;
                            if (cVar != null) {
                                strA = fa.d.a(cVar.f76522a, cVar.f76523b, cVar.f76524c, cVar.f76525d, cVar.f76526e, cVar.f76527f);
                            }
                            i35 = i48;
                            f14 = f15;
                            i30 = i47;
                            i29 = i46;
                        } else if (iU3 == 39 && i38 == 0 && (gVarF = ga.e.f(i44, i44 + iA4, bArr)) != null && kVarH != null) {
                            i16 = 0;
                            i34 = gVarF.f76537a == kVarH.f76553a.get(0).f76519b ? 4 : 5;
                        }
                        i16 = 0;
                    }
                    i37 = i44 + iA4;
                    rVar.H(iA4);
                    i38++;
                    z15 = z16;
                    iU = i39;
                    i14 = 4;
                }
                i36++;
                kVar2 = kVarH;
                i14 = 4;
            }
            return new z(i18 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i24, i25, i26, i27, i28, i29, i30, i34, f14, i35, strA, kVar2);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw ParserException.createForMalformedContainer("Error parsing".concat(z14 ? "L-HEVC config" : "HEVC config"), e4);
        }
    }
}
