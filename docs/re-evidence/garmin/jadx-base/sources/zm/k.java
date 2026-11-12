package zm;

import am.x0;
import am.z0;
import android.content.Context;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    public static double[] a(double d14, double d15, p pVar, int i14, boolean z14, boolean z15, int i15) {
        double d16;
        double d17;
        int iG1;
        int i16 = (i15 & 8) != 0 ? -1 : i14;
        boolean z16 = (i15 & 32) != 0 ? false : z15;
        pVar.getClass();
        double d18 = z14 ? (d15 - d14) / 7.5d : 0.0d;
        int iG2 = pVar.getB1();
        if (iG2 != 1 && iG2 != 50 && iG2 != 52 && iG2 != 64) {
            switch (iG2) {
                case 67:
                case 68:
                case 69:
                    d16 = d14 - d18;
                    d17 = d15;
                    break;
                default:
                    d17 = d15 + d18;
                    d16 = d14;
                    break;
            }
        } else {
            d16 = d14 - d18;
            d17 = d15;
        }
        if (i16 == -1) {
            i16 = 4;
        }
        double dH4 = pVar.getF113499i1();
        if (pVar.getB1() != 20 && !Double.isNaN(dH4) && Math.abs(dH4 - d16) <= 1.0d && Math.abs(dH4 - d17) <= 1.0d) {
            d17 = dH4 * ((double) 2);
            d16 = 0.0d;
        }
        if (z16 && (pVar instanceof lm.d)) {
            return ((lm.d) pVar).f1(i16, -0.5d, 15.5d, 0.0d);
        }
        List<o20.a> listP = pVar.P(0);
        ArrayList arrayList = new ArrayList(p13.y.r(listP, 10));
        Iterator<T> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((o20.a) it.next()).D()));
        }
        if (arrayList.isEmpty()) {
            iG1 = pVar.getB1();
            if (iG1 != 0 || iG1 == 10 || iG1 == 65 || iG1 == 2 || iG1 == 3 || iG1 == 4 || iG1 == 6 || iG1 == 7 || iG1 == 8 || iG1 == 87 || iG1 == 88) {
                return new double[]{-10.0d, 0.0d, 10.0d};
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    iG1 = pVar.getB1();
                    if (iG1 != 0) {
                    }
                    return new double[]{-10.0d, 0.0d, 10.0d};
                }
                if (((Number) it3.next()).doubleValue() == 0.0d) {
                }
            }
        }
        return pVar.getB1() == 54 ? pVar.f1(i16, 0.0d, 100.0d, 0.0d) : pVar.f1(i16, d16, d17, 0.05d);
    }

    public static final double b(double d14, int i14) {
        if (i14 == 0 || i14 == 41 || i14 == 81 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5 || i14 == 6 || i14 == 10 || i14 == 11 || i14 == 65 || i14 == 66 || i14 == 87 || i14 == 88) {
            return 0.0d;
        }
        return d14;
    }

    public static final int c(float f14) {
        if (0.0f <= f14 && f14 <= 5.0f) {
            return 1;
        }
        if (5.0f <= f14 && f14 <= 20.0f) {
            return 2;
        }
        if (50.0f > f14 || f14 > 1000.0f) {
            return f14 > 1000.0f ? 100 : 5;
        }
        return 10;
    }

    public static final boolean d(p pVar) {
        pVar.getClass();
        int iG1 = pVar.getB1();
        String strU = pVar.getF113501k1();
        if ((pVar.getB1() != 1 && pVar.getB1() != 68) || strU == null) {
            return p13.x.k(7, 65, 9, 10, 51, 62, 63, 52, 55, 43, 57, 60, 40, 39).contains(Integer.valueOf(iG1));
        }
        z0 z0Var = z0.f4390a;
        return z0.b(x0.f4313o1, strU);
    }

    public static final boolean e(p pVar) {
        pVar.getClass();
        int iG1 = pVar.getB1();
        String strU = pVar.getF113501k1();
        if ((iG1 != 1 && iG1 != 68) || strU == null) {
            return p13.x.k(7, 65, 9, 10, 51, 62, 63, 52, 55, 43, 57, 60, 40, 39).contains(Integer.valueOf(iG1));
        }
        z0 z0Var = z0.f4390a;
        return z0.b(x0.f4313o1, strU);
    }

    public static final void f(BarLineChartBase<?> barLineChartBase, int i14) {
        barLineChartBase.getClass();
        if (i14 != 14 && i14 != 19) {
            switch (i14) {
                case 23:
                case 25:
                case 26:
                    barLineChartBase.setExtraLeftOffset(15.0f);
                    break;
            }
            return;
        }
        barLineChartBase.setExtraLeftOffset(25.0f);
        barLineChartBase.setRendererLeftYAxis(new ym.b(barLineChartBase, YAxis.AxisDependency.LEFT, i14));
    }

    public static final void g(YAxis yAxis, float f14, float f15, int i14, Integer num) {
        float fFloor;
        if (i14 <= 0) {
            yAxis.setAxisMinimum(f14);
            yAxis.setAxisMaximum(f15);
            return;
        }
        float fIntValue = num != null ? num.intValue() : c(Math.abs(f15 - f14));
        if (f14 < fIntValue) {
            fFloor = (int) f14;
        } else {
            fFloor = f14 % fIntValue == 0.0f ? f14 - fIntValue : ((float) Math.floor(f14 / fIntValue)) * fIntValue;
        }
        yAxis.setAxisMinimum(fFloor);
        float fAbs = Math.abs(f15 - yAxis.getAxisMinimum());
        int iIntValue = num != null ? num.intValue() : c(fAbs);
        float f16 = i14 - 1;
        float fCeil = fAbs / f16;
        float f17 = iIntValue;
        if (fCeil % f17 != 0.0f) {
            fCeil = ((float) Math.ceil(fCeil / f17)) * f17;
        }
        if (f17 < fCeil) {
            f17 = fCeil;
        }
        yAxis.setAxisMaximum((f16 * f17) + yAxis.getAxisMinimum());
        if (yAxis.getAxisMaximum() < f15) {
            if (f15 % fIntValue != 0.0f) {
                f15 = ((float) Math.ceil(f15 / fIntValue)) * fIntValue;
            }
            yAxis.setAxisMaximum(f15);
        }
        yAxis.setLabelCount(i14, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void h(Context context, YAxis yAxis, double[] dArr, p pVar, km.a aVar) {
        Float f14;
        int f134973e;
        context.getClass();
        dArr.getClass();
        pVar.getClass();
        if (dArr.length == 0) {
            return;
        }
        float f15 = (float) dArr[dArr.length - 1];
        float f16 = (float) dArr[0];
        float f17 = (f15 - f16) + 1;
        yAxis.setAxisMaximum(f15);
        yAxis.setAxisMinimum(f16);
        if (aVar != null) {
            yAxis.setTextColor(a7.b.getColor(context, aVar.f105276a));
        }
        int iG1 = pVar.getB1();
        if (iG1 != 10 && iG1 != 11) {
            if (iG1 != 14) {
                if (iG1 != 15) {
                    if (iG1 == 28) {
                        lm.c cVar = pVar instanceof lm.c ? (lm.c) pVar : null;
                        im.n nVar = cVar != null ? cVar.X : null;
                        boolean z14 = yAxis.getAxisDependency() == YAxis.AxisDependency.LEFT;
                        yAxis.setDrawLabels(z14);
                        rz.a.f155189g.getClass();
                        yAxis.setGridColor(a7.b.getColor(context, rz.a.f155190h));
                        yAxis.setDrawLimitLinesBehindData(true);
                        float f18 = !z14 ? 6.67f : 1.0f;
                        yAxis.setAxisMinimum(-1.0f);
                        yAxis.setAxisMaximum(f18 * 2.0f);
                        if (z14) {
                            for (int i14 = 0; i14 < 3; i14++) {
                                LimitLine limitLine = new LimitLine(i14);
                                rz.a.f155189g.getClass();
                                limitLine.setLineColor(a7.b.getColor(context, rz.a.f155190h));
                                yAxis.addLimitLine(limitLine);
                            }
                        }
                        yAxis.setLabelCount(4, true);
                        rz.a.f155189g.getClass();
                        yAxis.setTextColor(a7.b.getColor(context, rz.a.f155191i));
                        yAxis.setValueFormatter(new g(nVar, context));
                        return;
                    }
                    float fFloatValue = 0.0f;
                    if (iG1 == 35) {
                        rm.a aVarU3 = pVar.U3();
                        if (aVarU3 != null && (f14 = aVarU3.f153493g) != null) {
                            fFloatValue = f14.floatValue();
                        }
                        yAxis.setValueFormatter(new xm.a(context, fFloatValue));
                        return;
                    }
                    if (iG1 != 41) {
                        if (iG1 == 43) {
                            yAxis.setAxisMaximum(100.0f);
                            yAxis.setAxisMinimum(0.0f);
                            yAxis.setLabelCount(5, true);
                            return;
                        }
                        if (iG1 != 50 && iG1 != 52) {
                            if (iG1 != 71) {
                                if (iG1 == 92) {
                                    g(yAxis, yAxis.getAxisMinimum(), yAxis.getAxisMaximum(), 4, null);
                                    yAxis.setValueFormatter(new yz.e());
                                    return;
                                }
                                switch (iG1) {
                                    case 0:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        break;
                                    case 1:
                                        break;
                                    default:
                                        switch (iG1) {
                                            case 19:
                                                break;
                                            case 20:
                                                if (pVar.t2() == 0) {
                                                    yAxis.setLabelCount(Math.min((int) f17, 6), true);
                                                }
                                                break;
                                            case 21:
                                                yAxis.setAxisMaximum((float) pVar.getF113510t1());
                                                yAxis.setAxisMinimum((float) pVar.getF113509s1());
                                                yAxis.setLabelCount(5, true);
                                                yAxis.setGranularityEnabled(true);
                                                yAxis.setGranularity(5.0f);
                                                break;
                                            case 22:
                                                yAxis.setAxisMaximum((float) pVar.getF113510t1());
                                                yAxis.setAxisMinimum((float) pVar.getF113509s1());
                                                yAxis.setLabelCount(5, true);
                                                yAxis.setGranularityEnabled(true);
                                                yAxis.setGranularity(5.0f);
                                                yAxis.setInverted(true);
                                                break;
                                            case 23:
                                                yAxis.setAxisMaximum((float) pVar.getF113510t1());
                                                yAxis.setAxisMinimum((float) pVar.getF113509s1());
                                                yAxis.setLabelCount(5, true);
                                                yAxis.setValueFormatter(new xm.d(pVar.getB1()));
                                                yAxis.setGranularityEnabled(true);
                                                yAxis.setGranularity(45.0f);
                                                yAxis.setInverted(true);
                                                break;
                                            case 24:
                                                yAxis.setAxisMaximum((float) pVar.getF113510t1());
                                                yAxis.setAxisMinimum((float) pVar.getF113509s1());
                                                yAxis.setLabelCount(5, true);
                                                yAxis.setGranularityEnabled(true);
                                                yAxis.setGranularity(45.0f);
                                                break;
                                            case 25:
                                            case 26:
                                                yAxis.setAxisMaximum((float) pVar.getF113510t1());
                                                yAxis.setAxisMinimum((float) pVar.getF113509s1());
                                                yAxis.setLabelCount(4, true);
                                                yAxis.setValueFormatter(new xm.d(pVar.getB1()));
                                                yAxis.setGranularityEnabled(true);
                                                yAxis.setInverted(true);
                                                break;
                                            default:
                                                switch (iG1) {
                                                    case 54:
                                                        yAxis.setAxisMaximum(100.49f);
                                                        yAxis.setAxisMinimum(0.0f);
                                                        yAxis.setLabelCount(5, true);
                                                        break;
                                                    case 55:
                                                        yAxis.setAxisMinimum(60.0f);
                                                        yAxis.setAxisMaximum(100.0f);
                                                        yAxis.setLabelCount(5, true);
                                                        break;
                                                    case 56:
                                                        boolean z15 = yAxis.getAxisDependency() == YAxis.AxisDependency.LEFT;
                                                        yAxis.setDrawLabels(z15);
                                                        rz.a.f155189g.getClass();
                                                        yAxis.setGridColor(a7.b.getColor(context, rz.a.f155190h));
                                                        yAxis.setDrawLimitLinesBehindData(true);
                                                        float f19 = !z15 ? 6.67f : 1.0f;
                                                        yAxis.setAxisMinimum(-1.0f);
                                                        yAxis.setAxisMaximum(f19 * (pVar.D3() - 1));
                                                        if (z15) {
                                                            for (int i15 = 0; i15 < 3; i15++) {
                                                                LimitLine limitLine2 = new LimitLine(i15);
                                                                rz.a.f155189g.getClass();
                                                                limitLine2.setLineColor(a7.b.getColor(context, rz.a.f155190h));
                                                                yAxis.addLimitLine(limitLine2);
                                                            }
                                                        }
                                                        yAxis.setLabelCount(4, true);
                                                        rz.a.f155189g.getClass();
                                                        yAxis.setTextColor(a7.b.getColor(context, rz.a.f155191i));
                                                        yAxis.setValueFormatter(new i(context));
                                                        break;
                                                    default:
                                                        switch (iG1) {
                                                            case 58:
                                                            case 59:
                                                                yAxis.setAxisMaximum(100.0f);
                                                                yAxis.setAxisMinimum(0.0f);
                                                                yAxis.setLabelCount(6, true);
                                                                yAxis.setValueFormatter(new xm.c(context));
                                                                break;
                                                            case 60:
                                                                yAxis.setAxisMaximum((float) pVar.getF113510t1());
                                                                yAxis.setAxisMinimum((float) pVar.getF113509s1());
                                                                yAxis.setLabelCount((((int) pVar.getF113510t1()) - ((int) pVar.getF113509s1())) + 1, true);
                                                                yAxis.setValueFormatter(new xm.b(context, pVar.I2(), (float) pVar.getF113509s1()));
                                                                break;
                                                            default:
                                                                switch (iG1) {
                                                                    case 64:
                                                                    case 67:
                                                                    case 68:
                                                                    case 69:
                                                                        break;
                                                                    default:
                                                                        switch (iG1) {
                                                                            case 80:
                                                                                boolean z16 = yAxis.getAxisDependency() == YAxis.AxisDependency.LEFT;
                                                                                yAxis.setDrawLabels(z16);
                                                                                rz.a.f155189g.getClass();
                                                                                yAxis.setGridColor(a7.b.getColor(context, rz.a.f155190h));
                                                                                yAxis.setDrawLimitLinesBehindData(true);
                                                                                yAxis.setAxisMinimum(-2.0f);
                                                                                yAxis.setAxisMaximum(1.0f);
                                                                                if (z16) {
                                                                                    for (int i16 = -2; i16 < 2; i16++) {
                                                                                        LimitLine limitLine3 = new LimitLine(i16);
                                                                                        rz.a.f155189g.getClass();
                                                                                        limitLine3.setLineColor(a7.b.getColor(context, rz.a.f155190h));
                                                                                        yAxis.addLimitLine(limitLine3);
                                                                                    }
                                                                                }
                                                                                yAxis.setLabelCount(4, true);
                                                                                rz.a.f155189g.getClass();
                                                                                yAxis.setTextColor(a7.b.getColor(context, rz.a.f155191i));
                                                                                yAxis.setValueFormatter(new h(context));
                                                                                break;
                                                                            case 81:
                                                                                break;
                                                                            case 82:
                                                                                g(yAxis, yAxis.getAxisMinimum(), yAxis.getAxisMaximum(), 4, null);
                                                                                yAxis.setValueFormatter(new yz.e());
                                                                                break;
                                                                            default:
                                                                                switch (iG1) {
                                                                                    case 85:
                                                                                        yAxis.setInverted(true);
                                                                                        break;
                                                                                    case 87:
                                                                                        float fFloor = ((int) Math.floor(((double) yAxis.getAxisMinimum()) / 100.0d)) * 100;
                                                                                        float fCeil = ((int) Math.ceil(((double) yAxis.getAxisMaximum()) / 100.0d)) * 100;
                                                                                        yAxis.setAxisMinimum(fFloor);
                                                                                        yAxis.setAxisMaximum(fFloor + ((float) (((double) ((int) Math.ceil(((double) (fCeil - fFloor)) / 500.0d))) * 500.0d)));
                                                                                        g(yAxis, yAxis.getAxisMinimum(), yAxis.getAxisMaximum(), 6, 100);
                                                                                        yAxis.setValueFormatter(new yz.e());
                                                                                        break;
                                                                                    case 89:
                                                                                        boolean z17 = yAxis.getAxisDependency() == YAxis.AxisDependency.LEFT;
                                                                                        yAxis.setDrawLabels(true);
                                                                                        rz.a.f155189g.getClass();
                                                                                        yAxis.setGridColor(a7.b.getColor(context, rz.a.f155190h));
                                                                                        yAxis.setDrawLimitLinesBehindData(true);
                                                                                        yAxis.setAxisMinimum(0.0f);
                                                                                        w13.c cVar2 = zp1.a.f206594h;
                                                                                        yAxis.setAxisMaximum(cVar2.getF134973e() + 0.1f);
                                                                                        if (z17 && 1 <= (f134973e = cVar2.getF134973e())) {
                                                                                            int i17 = 1;
                                                                                            while (true) {
                                                                                                LimitLine limitLine4 = new LimitLine(i17);
                                                                                                rz.a.f155189g.getClass();
                                                                                                limitLine4.setLineColor(a7.b.getColor(context, rz.a.f155190h));
                                                                                                yAxis.addLimitLine(limitLine4);
                                                                                                if (i17 != f134973e) {
                                                                                                    i17++;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        yAxis.setLabelCount(zp1.a.f206594h.getF134973e() + 1, true);
                                                                                        rz.a.f155189g.getClass();
                                                                                        yAxis.setTextColor(a7.b.getColor(context, rz.a.f155191i));
                                                                                        yAxis.setValueFormatter(new j(context));
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    case 65:
                                                                    case 66:
                                                                        g(yAxis, yAxis.getAxisMinimum(), yAxis.getAxisMaximum(), 6, null);
                                                                        yAxis.setValueFormatter(new yz.e());
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                        yAxis.setAxisMaximum(f16);
                        yAxis.setAxisMinimum(f15);
                        yAxis.setValueFormatter(new yz.j());
                        yAxis.setInverted(true);
                        return;
                    }
                }
                yAxis.setValueFormatter(new yz.b(1));
                return;
            }
            yAxis.setLabelCount(3, true);
            return;
        }
        g(yAxis, yAxis.getAxisMinimum(), yAxis.getAxisMaximum(), 6, null);
        yAxis.setValueFormatter(new yz.e());
    }
}
