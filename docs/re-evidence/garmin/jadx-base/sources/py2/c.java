package py2;

import java.util.ArrayList;
import java.util.Map;
import lc.u0;
import n23.j;
import o13.p;
import o4.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141884a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.ON_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.ON_BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.SURFACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.SURFACE_VARIANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.SURFACE_VARIANT_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.ON_SURFACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[e.ON_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[e.SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[e.ON_SUCCESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f141884a = iArr;
        }
    }

    public static final Map<e, py2.a> a(oy2.a aVar) {
        d0 d0VarA;
        p pVar;
        w13.c cVar = e.f141902n;
        ArrayList arrayListK = j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            e eVar = (e) bVar.next();
            switch (a.f141884a[eVar.ordinal()]) {
                case 1:
                    d0VarA = d0.a(aVar.f134424a);
                    break;
                case 2:
                    d0VarA = aVar.f134425b;
                    break;
                case 3:
                    d0VarA = aVar.f134426c;
                    break;
                case 4:
                    d0VarA = aVar.f134427d;
                    break;
                case 5:
                    d0VarA = aVar.f134428e;
                    break;
                case 6:
                    d0VarA = aVar.f134429f;
                    break;
                case 7:
                    d0VarA = aVar.f134430g;
                    break;
                case 8:
                    d0VarA = aVar.f134431h;
                    break;
                case 9:
                    d0VarA = aVar.f134432i;
                    break;
                case 10:
                    d0VarA = aVar.f134433j;
                    break;
                case 11:
                    d0VarA = aVar.f134434k;
                    break;
                case 12:
                    d0VarA = aVar.f134435l;
                    break;
                default:
                    u0.r();
                    return null;
            }
            if (d0VarA != null) {
                long j8 = d0VarA.f128833a;
                float f14 = 255;
                pVar = new p(eVar, new py2.a((int) (d0.i(j8) * f14), (int) (d0.h(j8) * f14), (int) (d0.f(j8) * f14), d0.e(j8)));
            } else {
                pVar = null;
            }
            if (pVar != null) {
                arrayListK.add(pVar);
            }
        }
        return p13.u0.l(arrayListK);
    }
}
