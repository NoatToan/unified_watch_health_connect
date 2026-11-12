package c22;

import android.view.View;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements ActivityDetailChartDTO.b, bb.r, androidx.core.view.z, IFillFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23253a;

    public static String d(double d14, String str, StringBuilder sb3) {
        sb3.append(d14);
        sb3.append(str);
        return sb3.toString();
    }

    public static String e(int i14, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i14 + str4;
    }

    public static String f(String str, String str2, String str3, List list, List list2) {
        return str + list + str2 + list2 + str3;
    }

    public static /* synthetic */ void g() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void h(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(StringBuilder sb3, Object obj, Object obj2) {
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static void k(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.g(f16);
        eVar.o(f17);
        eVar.c();
    }

    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO.b
    public double c(int i14, List list, int i15, double d14, double d15, double d16) {
        switch (this.f23253a) {
            case 0:
                double dDoubleValue = 0.0d;
                for (int i16 = 0; i16 <= i14; i16++) {
                    Double d17 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) list.get(i16)).C().get(i15);
                    if (!d17.isNaN()) {
                        dDoubleValue = d17.doubleValue() + dDoubleValue;
                    }
                }
                return dDoubleValue;
            case 1:
                if (Double.isNaN(d14)) {
                    return 0.0d;
                }
                return d14;
            case 2:
                m3 m3Var = m3.METER;
                m3 m3Var2 = m3.FOOT;
                l3.f23124b.getClass();
                return l3.a.g(d14, m3Var, m3Var2);
            case 3:
                m3 m3Var3 = m3.CENTIMETER;
                m3 m3Var4 = m3.METER;
                l3.f23124b.getClass();
                return l3.a.g(d14, m3Var3, m3Var4);
            case 4:
                m3 m3Var5 = m3.METER;
                m3 m3Var6 = m3.CENTIMETER;
                l3.f23124b.getClass();
                return l3.a.g(d14, m3Var5, m3Var6);
            case 5:
                q3 q3Var = q3.METERS_PER_SECOND;
                q3 q3Var2 = q3.KILOMETER_PER_HOUR;
                l3.f23124b.getClass();
                return l3.a.w(d14, q3Var, q3Var2);
            case 6:
                q3 q3Var3 = q3.METERS_PER_SECOND;
                q3 q3Var4 = q3.MILE_PER_HOUR;
                l3.f23124b.getClass();
                return l3.a.w(d14, q3Var3, q3Var4);
            case 7:
                q3 q3Var5 = q3.METERS_PER_SECOND;
                q3 q3Var6 = q3.NAUTICAL_MILES_PER_HOUR;
                l3.f23124b.getClass();
                return l3.a.w(d14, q3Var5, q3Var6);
            case 8:
                double dB = o2.c.b(d15, d16, 2.0d, d15);
                if (dB - d16 < 105.0d) {
                    dB = d16 + 105.0d;
                }
                if (d14 == 0.0d) {
                    return dB;
                }
                double dRound = Math.round(1000.0d / d14);
                return dRound > dB ? dB : dRound;
            case 9:
                double dB2 = o2.c.b(d15, d16, 2.0d, d15);
                if (dB2 - d16 < 105.0d) {
                    dB2 = d16 + 105.0d;
                }
                if (d14 == 0.0d) {
                    return dB2;
                }
                double dRound2 = Math.round(1609.344d / d14);
                return dRound2 > dB2 ? dB2 : dRound2;
            case 10:
                double dB3 = o2.c.b(d15, d16, 2.0d, d15);
                if (d14 == 0.0d) {
                    return dB3;
                }
                l3.f23124b.getClass();
                return Math.min(l3.a.q(d14), dB3);
            case 11:
                double dB4 = o2.c.b(d15, d16, 2.0d, d15);
                if (d14 == 0.0d) {
                    return dB4;
                }
                l3.f23124b.getClass();
                return Math.min(l3.a.r(d14, true), dB4);
            case 12:
                double dB5 = o2.c.b(d15, d16, 2.0d, d15);
                if (d14 == 0.0d) {
                    return dB5;
                }
                l3.f23124b.getClass();
                double dR = l3.a.r(d14, false);
                return dR > dB5 ? dB5 : dR;
            case 13:
                if (d14 == 0.0d) {
                    return 300.0d;
                }
                l3.f23124b.getClass();
                double dR2 = l3.a.r(d14 * 0.02778d, true);
                if (dR2 <= 0.0d || dR2 > 300.0d) {
                    return 300.0d;
                }
                return dR2;
            case 14:
                if (d14 == 0.0d) {
                    return 300.0d;
                }
                l3.f23124b.getClass();
                double dR3 = l3.a.r(d14 * 0.02778d, false);
                if (dR3 <= 0.0d || dR3 > 300.0d) {
                    return 300.0d;
                }
                return dR3;
            case 15:
                l3.f23124b.getClass();
                return l3.a.d(d14);
            case 16:
                l3.f23124b.getClass();
                return l3.a.A(d14);
            default:
                l3.f23124b.getClass();
                return Math.round(d14);
        }
    }

    @Override // bb.r
    public bb.n[] createExtractors() {
        return new bb.n[]{new cb.a()};
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        int i14 = cm1.a.f27960f;
        return -10.0f;
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        switch (this.f23253a) {
            case 26:
                com.garmin.androiddynamicsettings.app.presentationlayer.b.a aVar = com.garmin.androiddynamicsettings.app.presentationlayer.b.f50687j;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(519);
                eVarI.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                break;
            default:
                com.garmin.androiddynamicsettings.app.presentationlayer.b.a aVar2 = com.garmin.androiddynamicsettings.app.presentationlayer.b.f50687j;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(2);
                eVarI2.getClass();
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), eVarI2.f25193d);
                break;
        }
        return m1Var;
    }
}
