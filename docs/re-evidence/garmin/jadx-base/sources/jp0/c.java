package jp0;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import f12.l;
import gg1.n;
import i3.e5;
import java.text.ParseException;
import java.util.LinkedHashMap;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f99863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f99864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f99865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f99866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f99867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f99868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double f99869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f99870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final double f99871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final double f99872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f99873k = 0;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f99876c;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.CUP_US.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.METRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.OUNCE_US.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f99874a = iArr;
            int[] iArr2 = new int[UserSettingsDTO.c.values().length];
            try {
                iArr2[UserSettingsDTO.c.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserSettingsDTO.c.NOT_SPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserSettingsDTO.c.MALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f99875b = iArr2;
            int[] iArr3 = new int[q22.b.values().length];
            try {
                iArr3[q22.b.FLUID_OUNCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[q22.b.CUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[q22.b.MILLILITER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[q22.b.LITRE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f99876c = iArr3;
        }
    }

    static {
        q22.b bVar = q22.b.CUP;
        q22.b bVar2 = q22.b.MILLILITER;
        double dA = q22.a.a(1.0d, bVar, bVar2);
        f99863a = dA;
        double dA2 = q22.a.a(1.0d, q22.b.FLUID_OUNCE, bVar2);
        f99864b = dA2;
        double dA3 = q22.a.a(1.0d, q22.b.LITRE, bVar2);
        f99865c = dA;
        f99866d = ((double) 8) * dA2;
        f99867e = dA;
        f99868f = dA2;
        f99869g = dA3;
        f99870h = ((double) 80) * dA;
        f99871i = ((double) 640) * dA2;
        f99872j = ((double) 19) * dA3;
    }

    public static final int a(double d14, double d15, q22.b bVar, wp0.a aVar) throws ParseException {
        bVar.getClass();
        aVar.getClass();
        if (d14 <= 0.0d) {
            return 0;
        }
        double dF = aVar.f(d14, bVar);
        String strC = aVar.c(d15, bVar);
        wp0.a.f186524b.getClass();
        Number number = wp0.a.C3469a.b(bVar).parse(strC);
        return (int) ((dF * ((double) 100)) / (number != null ? number.doubleValue() : 0.0d));
    }

    public static final op0.a b(int i14, op0.c cVar) {
        cVar.getClass();
        op0.a aVarF = cVar.f(i14);
        if (aVarF != null && !aVarF.j()) {
            return aVarF;
        }
        n nVarI = cVar.i();
        op0.a aVar = new op0.a(i14, null, nVarI.f77282a, Double.valueOf(c(i14, nVarI)), 2, null);
        aVar.o(nVarI);
        cVar.o(aVar);
        return aVar;
    }

    public static final double c(int i14, n nVar) {
        double d14 = f99865c;
        double d15 = f99866d;
        if (i14 == 1) {
            int i15 = a.f99874a[nVar.ordinal()];
            if (i15 == 1) {
                return d14;
            }
            if (i15 == 2) {
                return 250.0d;
            }
            if (i15 == 3) {
                return d15;
            }
            u0.r();
            return 0.0d;
        }
        if (i14 == 2) {
            int i16 = a.f99874a[nVar.ordinal()];
            if (i16 == 1) {
                return ((double) 2) * d14;
            }
            if (i16 == 2) {
                return 500.0d;
            }
            if (i16 == 3) {
                return ((double) 2) * d15;
            }
            u0.r();
            return 0.0d;
        }
        if (i14 != 3) {
            return 0.0d;
        }
        int i17 = a.f99874a[nVar.ordinal()];
        if (i17 == 1) {
            return ((double) 3) * d14;
        }
        if (i17 == 2) {
            return 750.0d;
        }
        if (i17 == 3) {
            return ((double) 3) * d15;
        }
        u0.r();
        return 0.0d;
    }

    public static final double d(n nVar, UserSettingsDTO.c cVar) {
        nVar.getClass();
        cVar.getClass();
        int i14 = a.f99875b[cVar.ordinal()];
        double d14 = f99863a;
        double d15 = f99864b;
        if (i14 == 1 || i14 == 2) {
            int i15 = a.f99874a[nVar.ordinal()];
            if (i15 == 1) {
                return ((double) 9) * d14;
            }
            if (i15 == 2) {
                return 2100.0d;
            }
            if (i15 == 3) {
                return ((double) 72) * d15;
            }
            u0.r();
            return 0.0d;
        }
        if (i14 != 3) {
            u0.r();
            return 0.0d;
        }
        int i16 = a.f99874a[nVar.ordinal()];
        if (i16 == 1) {
            return ((double) 12) * d14;
        }
        if (i16 == 2) {
            return 2800.0d;
        }
        if (i16 == 3) {
            return ((double) 96) * d15;
        }
        u0.r();
        return 0.0d;
    }

    public static /* synthetic */ double e(n nVar, UserSettingsDTO.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            nVar = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).d0();
        }
        if ((i14 & 2) != 0) {
            cVar = UserSettingsDTO.c.NOT_SPECIFIED;
        }
        return d(nVar, cVar);
    }

    public static final n f(q22.b bVar) {
        bVar.getClass();
        int i14 = a.f99876c[bVar.ordinal()];
        if (i14 == 1) {
            return n.OUNCE_US;
        }
        if (i14 == 2) {
            return n.CUP_US;
        }
        if (i14 != 3 && i14 != 4) {
            u0.r();
            return null;
        }
        return n.METRIC;
    }

    public static final LinkedHashMap g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q22.b.CUP, Double.valueOf(f99870h));
        linkedHashMap.put(q22.b.FLUID_OUNCE, Double.valueOf(f99871i));
        linkedHashMap.put(q22.b.MILLILITER, Double.valueOf(19000.0d));
        linkedHashMap.put(q22.b.LITRE, Double.valueOf(f99872j));
        return linkedHashMap;
    }

    public static final q22.b h(n nVar) {
        nVar.getClass();
        int i14 = a.f99874a[nVar.ordinal()];
        if (i14 == 1) {
            return q22.b.CUP;
        }
        if (i14 == 2) {
            return q22.b.MILLILITER;
        }
        if (i14 == 3) {
            return q22.b.FLUID_OUNCE;
        }
        u0.r();
        return null;
    }

    public static final double i(q22.b bVar) {
        bVar.getClass();
        int i14 = a.f99876c[bVar.ordinal()];
        if (i14 == 1) {
            return f99868f;
        }
        if (i14 == 2) {
            return f99867e;
        }
        if (i14 == 3) {
            return 1.0d;
        }
        if (i14 == 4) {
            return f99869g;
        }
        u0.r();
        return 0.0d;
    }

    public static final q22.b j(n nVar) {
        nVar.getClass();
        int i14 = a.f99874a[nVar.ordinal()];
        if (i14 == 1) {
            return q22.b.CUP;
        }
        if (i14 == 2) {
            return q22.b.MILLILITER;
        }
        if (i14 == 3) {
            return q22.b.FLUID_OUNCE;
        }
        u0.r();
        return null;
    }

    public static final String l(Context context, q22.b bVar) {
        double d14;
        double d15;
        bVar.getClass();
        if (bVar == q22.b.MILLILITER) {
            bVar = q22.b.LITRE;
        }
        int i14 = a.f99876c[bVar.ordinal()];
        if (i14 == 1) {
            d14 = 91.0d;
            d15 = 125.0d;
        } else if (i14 == 2) {
            d14 = 10.0d;
            d15 = 15.0d;
        } else if (i14 != 4) {
            d14 = 0.0d;
            d15 = 0.0d;
        } else {
            d14 = 2.5d;
            d15 = 3.5d;
        }
        String string = context.getString(R.string.string_space_string_pattern, e5.g(l3.f23126d.format(d14), "-", l3.f23126d.format(d15)), context.getString(bVar.f142315d));
        string.getClass();
        return string;
    }

    public static final String m(wp0.a aVar, q22.b bVar) {
        double d14;
        double d15;
        double d16;
        bVar.getClass();
        if (bVar == q22.b.MILLILITER) {
            bVar = q22.b.LITRE;
        }
        int i14 = a.f99876c[bVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                d16 = 2000.0d;
            } else {
                d14 = 8;
                d15 = f99863a;
            }
            return aVar.c(d16, bVar);
        }
        d14 = 64;
        d15 = f99864b;
        d16 = d14 * d15;
        return aVar.c(d16, bVar);
    }

    public static final double n(q22.b bVar) {
        bVar.getClass();
        int i14 = a.f99876c[bVar.ordinal()];
        if (i14 == 1) {
            return 80.0d;
        }
        if (i14 != 2) {
            return i14 != 3 ? 80.0d : 2366.0d;
        }
        return 10.0d;
    }

    public static double o(double d14, String str, Logger logger) {
        double dPow = Math.pow(10.0d, 4);
        double dB = ((double) MathKt.b(d14 * dPow)) / dPow;
        if (logger != null) {
            logger.debug("Convert " + str + " from " + d14 + ", to " + dB);
        }
        return dB;
    }
}
