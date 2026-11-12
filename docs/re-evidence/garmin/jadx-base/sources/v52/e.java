package v52;

import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import f12.l;
import j20.x;
import java.text.DecimalFormat;
import m52.j;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv52/e;", "", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f175761a = new e();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv52/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        DISTANCE,
        TIME,
        BOTH,
        NONE
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f175768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f175769c;

        static {
            int[] iArr = new int[m52.a.values().length];
            try {
                iArr[m52.a.f116650f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.a.f116649e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f175767a = iArr;
            int[] iArr2 = new int[m3.values().length];
            try {
                iArr2[m3.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[m3.YARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m3.KILOMETER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f175768b = iArr2;
            int[] iArr3 = new int[j.values().length];
            try {
                iArr3[j.f116747g.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[j.f116746f.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[j.f116745e.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f175769c = iArr3;
        }
    }

    private e() {
    }

    public static String a(Context context, Double d14, boolean z14, m52.a aVar, j jVar, boolean z15, boolean z16, int i14) {
        String string;
        String strE1;
        double dDoubleValue;
        m3 m3VarD;
        DecimalFormat decimalFormat;
        j jVar2 = (i14 & 16) != 0 ? null : jVar;
        boolean z17 = (i14 & 32) != 0 ? false : z15;
        boolean z18 = (i14 & 64) != 0 ? false : z16;
        context.getClass();
        if (d14 == null || d14.doubleValue() <= 0.0d) {
            return context.getString(R.string.no_value);
        }
        if (z14) {
            string = z18 ? context.getString(R.string.lbl_approximately) : "~";
        } else {
            string = "";
        }
        string.getClass();
        int i15 = aVar == null ? -1 : b.f175767a[aVar.ordinal()];
        if (i15 == 1) {
            if (z18) {
                l3.a aVar2 = l3.f23124b;
                l22.a aVar3 = new l22.a(context);
                int iB = MathKt.b(d14.doubleValue());
                aVar2.getClass();
                strE1 = l3.a.k1(aVar3, true, iB);
            } else {
                l3.a aVar4 = l3.f23124b;
                long jD = MathKt.d(d14.doubleValue());
                aVar4.getClass();
                strE1 = l3.a.e1(jD);
            }
            return k.g(string, strE1);
        }
        if (i15 != 2) {
            return null;
        }
        j jVar3 = j.f116748h;
        if (jVar2 == jVar3) {
            l3.a aVar5 = l3.f23124b;
            double dDoubleValue2 = d14.doubleValue();
            aVar5.getClass();
            dDoubleValue = dDoubleValue2 * 0.9144d;
        } else {
            dDoubleValue = d14.doubleValue();
        }
        boolean z19 = jVar2 == jVar3 || jVar2 == j.f116747g || z17;
        l3.a aVar6 = l3.f23124b;
        if (z17) {
            m3VarD = m3.METER;
        } else {
            f175761a.getClass();
            m3VarD = d(jVar2);
        }
        if (z19) {
            aVar6.getClass();
            decimalFormat = l3.f23131i;
        } else {
            decimalFormat = l3.f23138p;
        }
        aVar6.getClass();
        return string.concat(l3.a.O(context, dDoubleValue, m3VarD, decimalFormat, !z17));
    }

    public static final String b(Context context, double d14, m52.a aVar, j jVar, boolean z14, boolean z15) {
        context.getClass();
        if ((aVar == m52.a.f116649e || aVar == m52.a.f116650f) && d14 > 0.0d) {
            return x.d(z14 ? context.getResources().getString(R.string.common_lbl_estimated) : context.getResources().getString(R.string.lbl_estimated_abbrev), StringUtils.SPACE, aVar == m52.a.f116650f ? context.getResources().getString(R.string.lbl_time) : context.getResources().getString(R.string.lbl_distance), ": ", a(context, Double.valueOf(d14), false, aVar, jVar, z15, false, 64));
        }
        return null;
    }

    public static final String c(Context context, Double d14, boolean z14, boolean z15) {
        context.getClass();
        return a(context, d14, z14, m52.a.f116650f, null, false, z15, 48);
    }

    public static m3 d(j jVar) {
        if (jVar == null) {
            return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
        }
        int i14 = b.f175769c[jVar.ordinal()];
        if (i14 == 1) {
            return m3.METER;
        }
        if (i14 != 2) {
            return i14 != 3 ? m3.YARD : m3.MILE;
        }
        return m3.KILOMETER;
    }

    public static final a e(Integer num, Double d14, m52.b bVar) {
        e eVar = f175761a;
        if (bVar == null) {
            eVar.getClass();
            return h(d14, num);
        }
        if (num != null && num.intValue() > 0 && d14 != null && d14.doubleValue() > 0.0d) {
            return a.BOTH;
        }
        if (bVar == m52.b.DISTANCE_ESTIMATED && d14 != null && d14.doubleValue() > 0.0d) {
            return a.BOTH;
        }
        if (bVar == m52.b.TIME_ESTIMATED && num != null && num.intValue() > 0) {
            return a.BOTH;
        }
        eVar.getClass();
        return h(d14, num);
    }

    public static final double f(j0 j0Var, Double d14) {
        double dN;
        j0Var.getClass();
        if (j0Var.E == m52.g.PACE) {
            dN = j0Var.F;
        } else {
            l3.f23124b.getClass();
            dN = l3.a.n(120, true);
        }
        double d15 = j0Var.f48229n * dN;
        double dDoubleValue = zf.b.D(d14) ? d14.doubleValue() : 25.0d;
        double d16 = d15 / dDoubleValue;
        f175761a.getClass();
        double d17 = d16 % 1.0d;
        if (d17 != 0.0d && Math.signum(d17) != Math.signum(1.0d)) {
            d17 += 1.0d;
        }
        int iFloor = (int) (d17 <= 0.5d ? Math.floor(d16) : Math.ceil(d16));
        if (iFloor % 2 != 0) {
            iFloor++;
        }
        return ((double) iFloor) * dDoubleValue;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static final double g(j0 j0Var, Double d14) {
        double d15;
        m52.g gVar;
        double dT1;
        j0Var.getClass();
        if (d14.doubleValue() > 0.0d) {
            m52.a aVar = j0Var.f48227l;
            double dDoubleValue = d14.doubleValue();
            m52.d dVar = j0Var.f48217c;
            m52.b bVar = null;
            if (dVar != m52.d.WALK) {
                m52.a aVar2 = j0Var.f48227l;
                if (aVar2 == m52.a.f116649e) {
                    bVar = m52.b.DISTANCE_ESTIMATED;
                } else if (aVar2 == m52.a.f116650f) {
                    bVar = m52.b.TIME_ESTIMATED;
                }
            }
            if (bVar != null) {
                m52.g gVar2 = j0Var.f48232q;
                if (gVar2 == m52.g.PACE || gVar2 == (gVar = m52.g.SPEED)) {
                    dDoubleValue = j0Var.h(j0Var.f48233r, j0Var.f48234t);
                } else if (j0Var.E == gVar) {
                    dDoubleValue = j0Var.h(j0Var.F, j0Var.I);
                } else if (dVar == m52.d.REST) {
                    d15 = 0.0d;
                }
                m52.b bVar2 = m52.b.DISTANCE_ESTIMATED;
                double d16 = j0Var.f48229n;
                d15 = bVar == bVar2 ? d16 * dDoubleValue : d16 / dDoubleValue;
            } else {
                d15 = 0.0d;
            }
            if (d15 > 0.0d && aVar != null) {
                int i14 = b.f175767a[aVar.ordinal()];
                e eVar = f175761a;
                if (i14 == 1) {
                    eVar.getClass();
                    if (d15 <= 1200.0d) {
                        l3.f23124b.getClass();
                        return l3.a.T1(d15 / 10.0d, 0) * 10.0d;
                    }
                    l3.f23124b.getClass();
                    return l3.a.y(0, (int) l3.a.T1(d15 / 60.0d, 0), 0);
                }
                if (i14 == 2) {
                    j jVar = j0Var.f48231p;
                    eVar.getClass();
                    m3 m3VarD = d(jVar);
                    int[] iArr = b.f175768b;
                    int i15 = iArr[m3VarD.ordinal()];
                    if (i15 != 1 && i15 != 2) {
                        if (i15 != 3) {
                            l3.f23124b.getClass();
                            d15 /= 1609.344d;
                        } else {
                            l3.f23124b.getClass();
                            d15 /= 1000.0d;
                        }
                    }
                    int i16 = iArr[m3VarD.ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        l3.f23124b.getClass();
                        dT1 = l3.a.T1(d15, 0);
                    } else {
                        l3.f23124b.getClass();
                        dT1 = l3.a.T1(d15, 1);
                    }
                    int i17 = iArr[m3VarD.ordinal()];
                    if (i17 == 1) {
                        return dT1;
                    }
                    if (i17 == 2) {
                        l3.f23124b.getClass();
                        return dT1 * 0.9144d;
                    }
                    if (i17 != 3) {
                        l3.f23124b.getClass();
                        return dT1 * 1609.344d;
                    }
                    l3.f23124b.getClass();
                    return dT1 * 1000.0d;
                }
            }
        }
        return 0.0d;
    }

    public static a h(Double d14, Integer num) {
        if (num != null && num.intValue() > 0 && (d14 == null || d14.doubleValue() <= 0.0d)) {
            return a.TIME;
        }
        if ((num == null || num.intValue() <= 0) && d14 != null && d14.doubleValue() > 0.0d) {
            return a.DISTANCE;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.WORKOUTS, "WorkoutEstimateUtil", "[getTimeOrDistanceEstimateDisplay] estimateType is null, estimatedTime is " + num + ", and estimatedDistance is " + d14 + ". Displaying nothing.");
        return a.NONE;
    }

    public static final boolean i(j0 j0Var, m52.k kVar) {
        m52.a aVar;
        kVar.getClass();
        return (kVar == m52.k.f116758r && j0Var.f48217c == m52.d.REST) || (aVar = j0Var.f48227l) == m52.a.f116649e || aVar == m52.a.f116650f;
    }

    public static final boolean j(boolean z14, m52.b bVar) {
        if (z14) {
            return bVar == m52.b.DISTANCE_ESTIMATED || bVar == m52.b.TIME_AND_DISTANCE_ESTIMATED;
        }
        return bVar == m52.b.TIME_ESTIMATED || bVar == m52.b.TIME_AND_DISTANCE_ESTIMATED;
    }
}
