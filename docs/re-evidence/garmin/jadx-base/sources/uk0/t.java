package uk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import c80.w;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import gl1.y;
import java.text.NumberFormat;
import lc.u0;
import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk0/t;", "", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f171871a = new t();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f171873b;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Distance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.Duration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.Date.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f171872a = iArr;
            int[] iArr2 = new int[o0.values().length];
            try {
                iArr2[o0.STATUTE_US.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o0.STATUTE_UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[o0.METRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f171873b = iArr2;
        }
    }

    private t() {
    }

    public static String a(w wVar, b63.o oVar, Double d14, Long l14, Long l15, Double d15, o0 o0Var, p3.m mVar, int i14) {
        String strP;
        wVar.getClass();
        o0Var.getClass();
        x1 x1Var = p3.n.f135158a;
        int i15 = a.f171872a[wVar.ordinal()];
        String strP2 = null;
        if (i15 == 1) {
            mVar.C(-6445388);
            mVar.f();
            return null;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                if (i15 != 4) {
                    throw n23.j.m(mVar, 831076934);
                }
                mVar.C(-4270334);
                if (oVar == null) {
                    mVar.C(-4270335);
                    mVar.f();
                } else {
                    mVar.C(-4270334);
                    strP2 = y.P(R.string.max_use_date_value, new Object[]{new pi0.e((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b)).d(g22.l.h(oVar), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY)}, mVar);
                    mVar.f();
                }
                mVar.f();
                return strP2;
            }
            mVar.C(-5005158);
            if (l15 == null) {
                mVar.C(-5005159);
                mVar.f();
            } else {
                mVar.C(-5005158);
                long jLongValue = l15.longValue();
                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                l3.f23124b.getClass();
                String str = integerInstance.format(jLongValue / 3600);
                if (l14 == null || l14.longValue() <= 0) {
                    l14 = null;
                }
                if (l14 == null) {
                    mVar.C(-1410017734);
                    mVar.f();
                } else {
                    mVar.C(-1410017733);
                    String str2 = integerInstance.format(l14.longValue() / 3600);
                    str.getClass();
                    str2.getClass();
                    strP2 = y.P(R.string.badges_lbl_progress_description_hours_2, new Object[]{str, str2}, mVar);
                    mVar.f();
                }
                if (strP2 == null) {
                    mVar.C(-1409764556);
                    String strQ = y.Q(mVar, R.string.lbl_hours);
                    str.getClass();
                    String strP3 = y.P(R.string.value_unit, new Object[]{str, strQ}, mVar);
                    mVar.f();
                    strP2 = strP3;
                } else {
                    mVar.C(-2123695620);
                    mVar.f();
                }
                mVar.f();
            }
            mVar.f();
            return strP2;
        }
        mVar.C(-6342529);
        if (d15 == null) {
            mVar.C(-6342530);
            mVar.f();
        } else {
            mVar.C(-6342529);
            double dDoubleValue = d15.doubleValue();
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMinimumFractionDigits(1);
            numberInstance.setMaximumFractionDigits(1);
            if (d14 == null || d14.doubleValue() <= 0.0d) {
                d14 = null;
            }
            if (d14 == null) {
                mVar.C(2008344869);
                mVar.f();
            } else {
                mVar.C(2008344870);
                double dDoubleValue2 = d14.doubleValue();
                int i16 = a.f171873b[o0Var.ordinal()];
                if (i16 == 1 || i16 == 2) {
                    mVar.C(-292982997);
                    l3.f23124b.getClass();
                    String str3 = numberInstance.format(dDoubleValue / 1609.344d);
                    String str4 = numberInstance.format(dDoubleValue2 / 1609.344d);
                    str3.getClass();
                    str4.getClass();
                    strP = y.P(R.string.current_of_max_miles, new Object[]{str3, str4}, mVar);
                    mVar.f();
                } else {
                    if (i16 != 3) {
                        throw n23.j.m(mVar, -563642354);
                    }
                    mVar.C(-292585112);
                    l3.f23124b.getClass();
                    String str5 = numberInstance.format(dDoubleValue / 1000.0d);
                    String str6 = numberInstance.format(dDoubleValue2 / 1000.0d);
                    str5.getClass();
                    str6.getClass();
                    strP = y.P(R.string.current_of_max_kilometers, new Object[]{str5, str6}, mVar);
                    mVar.f();
                }
                strP2 = strP;
                mVar.f();
            }
            if (strP2 == null) {
                mVar.C(1865930025);
                i.f171830a.getClass();
                String strE = i.e(dDoubleValue, o0Var, numberInstance, mVar, ((i14 >> 15) & 112) | 3072);
                mVar.f();
                strP2 = strE;
            } else {
                mVar.C(1865899397);
                mVar.f();
            }
            mVar.f();
        }
        mVar.f();
        return strP2;
    }

    public static Double b(w wVar, b63.o oVar, Double d14, Long l14, Long l15, Double d15, b63.o oVar2, b63.o oVar3) {
        wVar.getClass();
        oVar2.getClass();
        oVar3.getClass();
        int i14 = a.f171872a[wVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                if (d14 == null || d14.doubleValue() <= 0.0d) {
                    d14 = null;
                }
                if (d15 != null && d14 != null) {
                    return Double.valueOf((d15.doubleValue() / d14.doubleValue()) * 100.0d);
                }
            } else if (i14 == 3) {
                if (l14 == null || l14.longValue() <= 0) {
                    l14 = null;
                }
                if (l15 != null && l14 != null) {
                    return Double.valueOf((l15.longValue() / l14.longValue()) * 100.0d);
                }
            } else {
                if (i14 != 4) {
                    u0.r();
                    return null;
                }
                if (oVar != null) {
                    return Double.valueOf((((double) Math.abs(b63.p.a(oVar2, oVar3))) / ((double) Math.abs(b63.p.a(oVar2, oVar)))) * 100.0d);
                }
            }
        }
        return null;
    }
}
