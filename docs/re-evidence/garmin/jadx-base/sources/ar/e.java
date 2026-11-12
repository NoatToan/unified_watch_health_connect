package ar;

import am.j;
import am.x0;
import am.z0;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.m;
import aq.r3;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;
import com.garmin.android.apps.connectmobile.activities.newmodel.z;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.chartingv2.data.Entry;
import f12.l;
import gl1.y;
import im.b0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import qm.c0;
import qm.g0;
import qm.p0;
import qm.v;
import qm.w;
import zm.f0;
import zm.p;
import zm.q;
import zm.u;
import zm.x;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private e() {
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(0);
        for (int i14 = 0; i14 < size; i14++) {
            if (!Double.isNaN(((o20.a) list.get(i14)).D())) {
                arrayList.add(new Entry((float) ((o20.a) list.get(i14)).D(), i14));
            }
        }
        return arrayList;
    }

    public static ArrayList b(List list, List list2) {
        Entry entry = null;
        if (list2 == null || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0);
        int i14 = 0;
        while (i14 < list.size()) {
            double dC = ((o20.a) list.get(i14)).C();
            int xIndex = entry != null ? entry.getXIndex() : 0;
            Entry entry2 = new Entry(0.0f, xIndex);
            while (true) {
                if (xIndex >= list2.size()) {
                    entry2.setVal(0.0f);
                    entry2.setXIndex(xIndex);
                    break;
                }
                o20.a aVar = (o20.a) list2.get(xIndex);
                if (dC == aVar.C()) {
                    entry2.setVal((float) aVar.D());
                    entry2.setXIndex(xIndex);
                    break;
                }
                if (dC < aVar.C()) {
                    entry2.setVal(0.0f);
                    entry2.setXIndex(xIndex);
                    break;
                }
                xIndex++;
            }
            arrayList.add(new Entry(entry2.getVal(), i14));
            i14++;
            entry = entry2;
        }
        return arrayList;
    }

    public static ArrayList c(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(0);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new com.github.mikephil.charting.data.Entry((float) ((o20.a) list.get(i14)).C(), (float) ((o20.a) list.get(i14)).D()));
        }
        return arrayList;
    }

    public static ArrayList d(List list) {
        int i14 = 0;
        if (list != null && !list.isEmpty() && ((o20.a) list.get(0)).C() > 0.0d) {
            ArrayList arrayList = new ArrayList(list.size() * 2);
            arrayList.add(new com.github.mikephil.charting.data.Entry(0.0f, (float) ((o20.a) list.get(0)).D()));
            while (i14 < list.size() - 1) {
                o20.a aVar = (o20.a) list.get(i14);
                i14++;
                o20.a aVar2 = (o20.a) list.get(i14);
                arrayList.add(new com.github.mikephil.charting.data.Entry((float) aVar.C(), (float) aVar.D()));
                arrayList.add(new com.github.mikephil.charting.data.Entry((float) aVar.C(), (float) aVar2.D()));
            }
            o20.a aVar3 = (o20.a) com.airbnb.lottie.animation.keyframe.a.c(1, list);
            arrayList.add(new com.github.mikephil.charting.data.Entry((float) aVar3.C(), (float) aVar3.D()));
            return arrayList;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList(0);
        while (true) {
            int i15 = size - 1;
            if (i14 >= i15) {
                arrayList2.add(new com.github.mikephil.charting.data.Entry((float) ((o20.a) list.get(i15)).C(), (float) ((o20.a) list.get(i15)).D()));
                return arrayList2;
            }
            float fC = (float) ((o20.a) list.get(i14)).C();
            float fD = (float) ((o20.a) list.get(i14)).D();
            i14++;
            float fD2 = (float) ((o20.a) list.get(i14)).D();
            com.github.mikephil.charting.data.Entry entry = new com.github.mikephil.charting.data.Entry(fC, fD);
            com.github.mikephil.charting.data.Entry entry2 = new com.github.mikephil.charting.data.Entry(fC, fD2);
            arrayList2.add(entry);
            arrayList2.add(entry2);
        }
    }

    public static ArrayList e(List list, int i14, fz.c cVar) {
        int i15 = 0;
        if (cVar != fz.c.TIME) {
            if (list == null) {
                return null;
            }
            int size = list.size();
            switch (i14) {
                case 23:
                case 24:
                case 25:
                case 26:
                    size /= 2;
                    break;
            }
            ArrayList arrayList = new ArrayList(size);
            m3 m3Var = j.z(l.f68084a) ? m3.KILOMETER : m3.MILE;
            while (i15 < size) {
                double dC = (float) ((o20.a) list.get(i15)).C();
                DecimalFormat decimalFormat = l3.f23129g;
                l3.f23124b.getClass();
                arrayList.add(l3.a.N(dC, m3Var, decimalFormat));
                i15++;
            }
            return arrayList;
        }
        if (list == null) {
            return null;
        }
        int size2 = list.size();
        switch (i14) {
            case 23:
            case 24:
            case 25:
            case 26:
                size2 /= 2;
                break;
        }
        ArrayList arrayList2 = new ArrayList(size2);
        new mm.e();
        while (i15 < size2) {
            arrayList2.add(mm.e.a((int) ((o20.a) list.get(i15)).C()));
            i15++;
        }
        if (!y.B(i14) && i14 != 52 && i14 != 64) {
            return arrayList2;
        }
        double dC2 = ((o20.a) com.airbnb.lottie.animation.keyframe.a.c(1, list)).C();
        arrayList2.add(mm.e.a((int) ((dC2 - ((o20.a) com.airbnb.lottie.animation.keyframe.a.c(2, list)).C()) + dC2)));
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x007b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [zm.q] */
    /* JADX WARN: Type inference failed for: r10v13 */
    public static q f(m mVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, p pVar, int i14, p pVar2, SparseArray<q0> sparseArray, boolean z14, com.garmin.android.apps.connectmobile.activities.charts.c cVar, int[] iArr, fz.c cVar2) {
        qm.j jVar;
        r3 r3Var;
        com.garmin.android.apps.connectmobile.activities.newmodel.l zVar;
        zm.c cVar3;
        ?? r14;
        p pVar3;
        Object obj;
        Object f0Var;
        Object cVar4;
        if (z14) {
            jVar = new qm.j(true, false, false);
        } else {
            qm.j.f145390d.getClass();
            jVar = new qm.j(false, false, false);
        }
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        int iG1 = pVar.getB1();
        r3.f12178c.getClass();
        Object zVar2 = null;
        if (iG1 == 0) {
            r3Var = r3.SPEED;
        } else if (iG1 == 1) {
            r3Var = r3.PACE;
        } else if (iG1 == 3) {
            r3Var = r3.HEART_RATE;
        } else if (iG1 == 4) {
            r3Var = r3.CADENCE;
        } else if (iG1 == 5) {
            r3Var = r3.POWER;
        } else if (iG1 == 11) {
            r3Var = r3.CADENCE;
        } else if (iG1 != 54) {
            switch (iG1) {
                case 61:
                    r3Var = r3.POWER_PER_KG;
                    break;
                case 62:
                    r3Var = r3.SPLIT_AVG_POWER;
                    break;
                case 63:
                    r3Var = r3.SPLIT_AVG_POWER_PER_KG;
                    break;
                default:
                    switch (iG1) {
                        case 66:
                            r3Var = r3.CADENCE;
                            break;
                        case 67:
                        case 68:
                        case 69:
                            r3Var = r3.PACE;
                            break;
                        default:
                            r3Var = null;
                            break;
                    }
                    break;
            }
        } else {
            r3Var = r3.STAMINA;
        }
        q0 q0Var = (r3Var == null || sparseArray == null) ? null : sparseArray.get(r3Var.f12190a);
        int i15 = -2;
        switch (iG1) {
            case 0:
            case 3:
            case 4:
            case 8:
            case 11:
            case 50:
            case 64:
            case 66:
            case 71:
            case 72:
            case 77:
            case 88:
                zVar = q0Var;
                cVar3 = new zm.c(mVar, pVar, pVar2, zVar, z14, cVar2);
                i15 = i14;
                r14 = cVar3;
                break;
            case 1:
            case 67:
            case 68:
            case 69:
                String strU = pVar.getF113501k1();
                z0 z0Var = z0.f4390a;
                if (!z0.b(x0.f4313o1, strU)) {
                    if (!(pVar instanceof b0) || linearLayout2 == null) {
                        zVar = q0Var;
                        cVar3 = new zm.c(mVar, pVar, pVar2, zVar, z14, cVar2);
                    } else {
                        zVar = new z(((b0) pVar).X0);
                        cVar3 = new zm.c(mVar, pVar, pVar2, zVar, z14, cVar2);
                    }
                    i15 = i14;
                    r14 = cVar3;
                } else {
                    zVar2 = z14 ? new zm.z(mVar, pVar, pVar2, jVar) : new x(mVar, pVar);
                    i15 = i14;
                    obj = zVar2;
                    zVar = q0Var;
                    r14 = obj;
                }
                break;
            case 2:
            case 6:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 34:
            case 39:
            case 40:
            case 41:
            case 44:
            case 51:
            case 55:
            case 58:
            case 59:
            case 60:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 96:
                pVar3 = pVar2;
                cVar4 = new zm.c(mVar, pVar, pVar3, null, z14, cVar2);
                f0Var = cVar4;
                i15 = i14;
                obj = f0Var;
                zVar = q0Var;
                r14 = obj;
                break;
            case 5:
            case 57:
            case 61:
            case 62:
            case 63:
            case 81:
                zVar2 = pVar instanceof b0 ? new zm.c(mVar, pVar, pVar2, new com.garmin.android.apps.connectmobile.activities.newmodel.b0(((b0) pVar).X0), z14, cVar2) : new zm.c(mVar, pVar, pVar2, q0Var, z14, cVar2);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 7:
            case 10:
            case 65:
                zVar2 = z14 ? new zm.z(mVar, pVar, pVar2, jVar) : new x(mVar, pVar);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 17:
            case 18:
            case 78:
            case 79:
            case 90:
            case 91:
            case 95:
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 27:
                zVar2 = new v(mVar, pVar);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 28:
            case 54:
            case 56:
            case 80:
            case 89:
            case 92:
                tm.a aVar = new tm.a(mVar, pVar, pVar2, z14, cVar2);
                aVar.S();
                f0Var = aVar;
                i15 = i14;
                obj = f0Var;
                zVar = q0Var;
                r14 = obj;
                break;
            case 29:
                zVar2 = new qm.f(mVar, pVar);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 30:
            case 31:
            case 70:
            case 73:
            case 74:
            case 75:
            case 76:
            default:
                i2.f(a2.ACTIVITIES, "LegacyChartHelper", "setChartGraph(" + iG1 + ") not supported");
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 32:
                zVar2 = new p0(mVar, pVar);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 33:
                zVar2 = z14 ? new qm.x(mVar, pVar, pVar2, jVar) : new w(mVar, pVar);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 35:
                zVar2 = !z14 ? new qm.p(mVar, pVar, pVar2) : new qm.m(mVar, pVar, pVar2);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 36:
            case 37:
            case 38:
                zVar2 = z14 ? new qm.c(mVar, pVar, pVar2, jVar) : new qm.e(mVar, pVar);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 42:
                c0 c0Var = new c0(mVar, pVar, jVar, i14, z14);
                c0Var.f145356k = new jm.b(mVar);
                f0Var = c0Var;
                i15 = i14;
                obj = f0Var;
                zVar = q0Var;
                r14 = obj;
                break;
            case 43:
            case 53:
                f0Var = new f0(mVar, pVar, pVar2, z14, cVar2);
                i15 = i14;
                obj = f0Var;
                zVar = q0Var;
                r14 = obj;
                break;
            case 45:
                g0 g0Var = new g0(mVar, pVar, pVar2, z14, iArr);
                f0Var = g0Var;
                if (cVar != null) {
                    cVar.f28973b = g0Var;
                    f0Var = g0Var;
                }
                i15 = i14;
                obj = f0Var;
                zVar = q0Var;
                r14 = obj;
                break;
            case 46:
                if (pVar instanceof wm.a) {
                    zVar2 = new u(mVar, (wm.a) pVar);
                }
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 47:
                zVar2 = z14 ? new qm.q(mVar, pVar, pVar2, jVar) : new qm.e(mVar, pVar);
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 48:
                if (pVar instanceof wm.a) {
                    zVar2 = new zm.g0(mVar, (wm.a) pVar);
                }
                i15 = i14;
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
            case 49:
                if (pVar instanceof b0) {
                    b0 b0Var = (b0) pVar;
                    Object q0Var2 = new qm.q0(mVar, b0Var, z14);
                    if (linearLayout2 != null) {
                        LinearLayout linearLayout4 = (LinearLayout) mVar.getLayoutInflater().inflate(R.layout.wave_distance_chart_legend, (ViewGroup) null);
                        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        if (b0Var.A()) {
                            linearLayout4.findViewById(R.id.unmeasurable_label).setVisibility(0);
                        }
                        if (!z0.X(b0Var.getF113501k1())) {
                            TextView textView = (TextView) linearLayout4.findViewById(R.id.wave_label);
                            TextView textView2 = (TextView) linearLayout4.findViewById(R.id.longest_wave_label);
                            textView.setText(R.string.lbl_wakesports_run);
                            textView2.setText(R.string.activity_wakesports_run_distance_longest_run);
                        }
                        linearLayout2.addView(linearLayout4);
                    }
                    i15 = i14;
                    obj = q0Var2;
                } else {
                    i15 = i14;
                    obj = zVar2;
                }
                zVar = q0Var;
                r14 = obj;
                break;
            case 52:
                pVar3 = pVar2;
                cVar4 = new zm.w(mVar, pVar, pVar3, q0Var, z14, cVar2);
                f0Var = cVar4;
                i15 = i14;
                obj = f0Var;
                zVar = q0Var;
                r14 = obj;
                break;
            case 93:
            case 94:
                zVar2 = new qm.y(mVar, pVar);
                obj = zVar2;
                zVar = q0Var;
                r14 = obj;
                break;
        }
        if (r14 != 0 && linearLayout != null) {
            if (r14 instanceof zm.c) {
                if (sm.c.d(pVar)) {
                    ((zm.c) r14).f205216o = sm.c.f160062a;
                }
                ((zm.c) r14).f205217p = true;
            }
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
                linearLayout2.addView(new nm.c(mVar, pVar, pVar2, zVar, sparseArray, z14).b());
            }
            r14.a(linearLayout2);
            r14.c(linearLayout3);
            linearLayout.addView(r14.d(linearLayout), new ViewGroup.LayoutParams(-1, i15));
        }
        return r14;
    }

    public static q g(FullscreenChartActivity fullscreenChartActivity, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, p pVar, p pVar2, SparseArray sparseArray, fz.c cVar) {
        return f(fullscreenChartActivity, linearLayout, linearLayout2, linearLayout3, pVar, -1, pVar2, sparseArray, true, null, null, cVar);
    }
}
