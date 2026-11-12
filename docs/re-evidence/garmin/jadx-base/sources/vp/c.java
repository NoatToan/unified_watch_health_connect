package vp;

import android.content.Context;
import android.graphics.Shader;
import c22.l3;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.u;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import zz.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\u0012B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lvp/c;", "Lqz/c;", "Lyp/b;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "intervalType", "Lorg/joda/time/LocalDate;", "startDate", "Lmp/k;", "metricType", "", "Lmp/j;", "", "chipsStatus", "<init>", "(Landroid/content/Context;ILorg/joda/time/LocalDate;Lmp/k;Ljava/util/Map;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<yp.b, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f179266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f179267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f179268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mp.k f179269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<mp.j, Boolean> f179270e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f179272b;

        static {
            int[] iArr = new int[mp.k.values().length];
            try {
                iArr[mp.k.WIN_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mp.k.STRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mp.k.BODY_BATTERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mp.k.PACK_WEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mp.k.GAMES_AVG_WON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mp.k.AVG_WIN_STRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mp.k.AVG_LOSS_STRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mp.k.AVG_DRAW_STRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mp.k.PACE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mp.k.GAMES_NOT_WON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mp.k.GAMES_WON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f179271a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[k.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[k.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[k.CROSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[k.X.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[k.CHEVRON_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[k.CHEVRON_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[k.DIAMOND.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            f179272b = iArr2;
        }
    }

    static {
        new a(null);
    }

    public c(Context context, int i14, LocalDate localDate, mp.k kVar, Map<mp.j, Boolean> map) {
        context.getClass();
        localDate.getClass();
        kVar.getClass();
        map.getClass();
        this.f179266a = context;
        this.f179267b = i14;
        this.f179268c = localDate;
        this.f179269d = kVar;
        this.f179270e = map;
    }

    public static ArrayList B(i53.d dVar, mp.k... kVarArr) {
        if (dVar == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (mp.k kVar : kVarArr) {
            List<yp.c> list = (List) dVar.get(kVar);
            if (list != null) {
                for (yp.c cVar : list) {
                    int i14 = cVar.f198607b;
                    Double d14 = cVar.f198606a;
                    Double d15 = (Double) linkedHashMap.get(Integer.valueOf(i14));
                    if (d15 != null) {
                        linkedHashMap.put(Integer.valueOf(i14), Double.valueOf(d15.doubleValue() + (d14 != null ? d14.doubleValue() : 0.0d)));
                    } else if (d14 != null) {
                        linkedHashMap.put(Integer.valueOf(i14), d14);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new yp.c((Double) entry.getValue(), ((Number) entry.getKey()).intValue()));
        }
        return arrayList;
    }

    public static float C(c cVar, float f14) {
        return ((float) Math.ceil(f14 / 4.0f)) * 4.0f;
    }

    public static /* synthetic */ ArrayList y(c cVar, List list, mp.k kVar, int i14, int i15) {
        if ((i15 & 4) != 0) {
            i14 = R.color.gcm_chart_highlight_line;
        }
        return cVar.x(list, kVar, i14, false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList z(c cVar, List list, mp.k kVar, int i14, int i15, boolean z14, u uVar, YAxis.AxisDependency axisDependency, int i16) {
        int i17 = (i16 & 4) != 0 ? R.color.gcm_chart_highlight_line : i14;
        int i18 = (i16 & 8) != 0 ? R.color.gcm_chart_highlight_line : i15;
        boolean z15 = (i16 & 16) != 0 ? false : z14;
        boolean z16 = (i16 & 32) != 0;
        u uVar2 = (i16 & 64) != 0 ? null : uVar;
        float f14 = (i16 & 128) != 0 ? 2.0f : 1.0f;
        boolean z17 = (i16 & 256) != 0;
        YAxis.AxisDependency axisDependency2 = (i16 & 512) != 0 ? YAxis.AxisDependency.LEFT : axisDependency;
        k kVar2 = k.SQUARE;
        Context context = cVar.f179266a;
        int i19 = i18;
        ArrayList<xz.a> arrayListX = cVar.x(list, kVar, i19, z15, z17);
        ArrayList arrayList = new ArrayList(y.r(arrayListX, 10));
        for (xz.a aVar : arrayListX) {
            int i24 = cVar.f179267b;
            LocalDate localDate = cVar.f179268c;
            arrayList.add(new Entry(i24 == 6 ? Months.monthsBetween(localDate, aVar.f192729a).getMonths() : Days.daysBetween(localDate, aVar.f192729a).getDays(), aVar.f192730b, aVar.f192731c));
        }
        ArrayList arrayListB = pz.d.b(1, arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            LineDataSet lineDataSet = new LineDataSet((List) it.next(), "");
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircles(z16);
            lineDataSet.setDrawCircleHole(!z16);
            lineDataSet.setAxisDependency(axisDependency2);
            lineDataSet.setCircleColor(a7.b.getColor(context, i17));
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            if (uVar2 != null) {
                lineDataSet.enableDashedLine(((Number) uVar2.f128605a).floatValue(), ((Number) uVar2.f128606b).floatValue(), ((Number) uVar2.f128607c).floatValue());
            }
            lineDataSet.setColor(a7.b.getColor(context, i19));
            lineDataSet.setHighlightLineWidth(1.0f);
            lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
            lineDataSet.setLineWidth(f14);
            arrayList2.add(lineDataSet);
        }
        return arrayList2;
    }

    public final ArrayList A(List list, mp.k kVar, int i14, k kVar2, YAxis.AxisDependency axisDependency) {
        int i15;
        int i16;
        ArrayList arrayListY = y(this, list, kVar, i14, 24);
        ArrayList arrayList = new ArrayList(y.r(arrayListY, 10));
        Iterator it = arrayListY.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i15 = 6;
            i16 = this.f179267b;
            if (!zHasNext) {
                break;
            }
            xz.a aVar = (xz.a) it.next();
            LocalDate localDate = this.f179268c;
            arrayList.add(new Entry(i16 == 6 ? Months.monthsBetween(localDate, aVar.f192729a).getMonths() : Days.daysBetween(localDate, aVar.f192729a).getDays(), aVar.f192730b, aVar.f192731c));
        }
        ArrayList<List> arrayListB = pz.d.b(1, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : arrayListB) {
            int i17 = b.f179271a[kVar.ordinal()];
            if ((i17 == 2 || i17 == i15 || i17 == 7 || i17 == 8) && (i16 == 5 || i16 == 3)) {
                ArrayList arrayList3 = new ArrayList();
                int i18 = 0;
                for (Object obj : list2) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        x.q();
                        throw null;
                    }
                    Entry entry = (Entry) obj;
                    if (i18 == 0 || i18 == list2.size() - 1) {
                        arrayList3.add(entry);
                    } else {
                        float f14 = 1;
                        if (((Entry) list2.get(i18 - 1)).getX() != entry.getX() - f14 || ((Entry) list2.get(i19)).getX() != entry.getX() + f14) {
                            arrayList3.add(entry);
                        }
                    }
                    i18 = i19;
                }
                list2 = arrayList3;
            }
            ScatterDataSet scatterDataSet = new ScatterDataSet(list2, "");
            scatterDataSet.setDrawValues(false);
            scatterDataSet.setColor(a7.b.getColor(this.f179266a, i14));
            scatterDataSet.setScatterShapeSize(20.0f);
            scatterDataSet.setAxisDependency(axisDependency);
            scatterDataSet.getFormLineWidth();
            switch (b.f179272b[kVar2.ordinal()]) {
                case 1:
                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.SQUARE);
                    break;
                case 2:
                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
                    break;
                case 3:
                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.TRIANGLE);
                    break;
                case 4:
                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CROSS);
                    break;
                case 5:
                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.X);
                    break;
                case 6:
                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CHEVRON_UP);
                    break;
                case 7:
                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CHEVRON_DOWN);
                    break;
                case 8:
                    scatterDataSet.setShapeRenderer(new c00.b());
                    break;
                default:
                    u0.r();
                    return null;
            }
            arrayList2.add(scatterDataSet);
            i15 = 6;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    @Override // qz.c
    public final List<IBarLineScatterCandleBubbleDataSet<?>> a(yp.b bVar) {
        float f14;
        ArrayList arrayListZ;
        Object next;
        List<yp.c> list;
        k kVar;
        ArrayList arrayListZ2;
        ArrayList arrayListZ3;
        ArrayList arrayListA;
        c cVar = this;
        yp.b bVar2 = bVar;
        int[] iArr = b.f179271a;
        mp.k kVar2 = cVar.f179269d;
        int i14 = iArr[kVar2.ordinal()];
        Map<mp.j, Boolean> map = cVar.f179270e;
        if (i14 != 1) {
            if (i14 == 2) {
                ArrayList arrayList = new ArrayList();
                if (bVar2 != null) {
                    i53.d<mp.k, List<yp.c>> dVar = bVar2.f198605a;
                    i53.e<mp.k> eVar = (i53.e) dVar.keySet();
                    if (eVar != null) {
                        for (mp.k kVar3 : eVar) {
                            if ((kVar3 != mp.k.AVG_WIN_STRESS || !s.g(map.get(mp.j.AVG_WIN_STRESS), Boolean.FALSE)) && ((kVar3 != mp.k.AVG_LOSS_STRESS || !s.g(map.get(mp.j.AVG_LOSS_STRESS), Boolean.FALSE)) && ((kVar3 != mp.k.AVG_DRAW_STRESS || !s.g(map.get(mp.j.AVG_DRAW_STRESS), Boolean.FALSE)) && (list = dVar.get(kVar3)) != null))) {
                                mp.k.f120007d.getClass();
                                arrayList.addAll(z(this, list, kVar3, 0, mp.k.a.a(kVar3), false, null, null, 2004));
                                int iA = mp.k.a.a(kVar3);
                                switch (kVar3 == null ? -1 : mp.k.a.C2279a.f120031a[kVar3.ordinal()]) {
                                    case 1:
                                        kVar = k.DIAMOND;
                                        break;
                                    case 2:
                                        kVar = k.TRIANGLE;
                                        break;
                                    case 3:
                                        kVar = k.SQUARE;
                                        break;
                                    case 4:
                                        kVar = k.CIRCLE;
                                        break;
                                    case 5:
                                        kVar = k.SQUARE;
                                        break;
                                    case 6:
                                        kVar = k.CIRCLE;
                                        break;
                                    default:
                                        kVar = k.CIRCLE;
                                        break;
                                }
                                arrayList.addAll(A(list, kVar3, iA, kVar, YAxis.AxisDependency.LEFT));
                            }
                        }
                    }
                }
                return arrayList;
            }
            if (i14 == 3) {
                ArrayList arrayList2 = new ArrayList();
                if (bVar2 != null) {
                    i53.d<mp.k, List<yp.c>> dVar2 = bVar2.f198605a;
                    i53.e<mp.k> eVar2 = (i53.e) dVar2.keySet();
                    if (eVar2 != null) {
                        for (mp.k kVar4 : eVar2) {
                            List<yp.c> list2 = dVar2.get(kVar4);
                            if (list2 != null) {
                                arrayList2.addAll(z(this, list2, kVar4, 0, 0, true, null, null, 2028));
                            }
                        }
                    }
                }
                return arrayList2;
            }
            if (i14 != 4) {
                return j0.f134944a;
            }
            if (bVar2 != null) {
                i53.d<mp.k, List<yp.c>> dVar3 = bVar2.f198605a;
                mp.k kVar5 = mp.k.PACK_WEIGHT;
                List<yp.c> list3 = dVar3.get(kVar5);
                if (list3 != null) {
                    mp.k.f120007d.getClass();
                    arrayListZ2 = z(cVar, list3, kVar5, mp.k.a.a(kVar5), mp.k.a.a(kVar5), false, null, YAxis.AxisDependency.LEFT, 1504);
                } else {
                    arrayListZ2 = null;
                }
            } else {
                arrayListZ2 = null;
            }
            if (bVar2 != null) {
                i53.d<mp.k, List<yp.c>> dVar4 = bVar2.f198605a;
                mp.k kVar6 = mp.k.PACE;
                List<yp.c> list4 = dVar4.get(kVar6);
                if (list4 != null) {
                    mp.k.f120007d.getClass();
                    arrayListZ3 = z(this, list4, kVar6, 0, mp.k.a.a(kVar6), true, null, YAxis.AxisDependency.RIGHT, 1476);
                } else {
                    arrayListZ3 = null;
                }
            } else {
                arrayListZ3 = null;
            }
            if (bVar2 != null) {
                i53.d<mp.k, List<yp.c>> dVar5 = bVar2.f198605a;
                mp.k kVar7 = mp.k.PACE;
                List<yp.c> list5 = dVar5.get(kVar7);
                if (list5 != null) {
                    mp.k.f120007d.getClass();
                    arrayListA = A(list5, kVar7, mp.k.a.a(kVar7), k.SQUARE, YAxis.AxisDependency.RIGHT);
                } else {
                    arrayListA = null;
                }
            } else {
                arrayListA = null;
            }
            ArrayList arrayList3 = new ArrayList();
            if (arrayListZ2 != null) {
                arrayList3.addAll(arrayListZ2);
            }
            if (arrayListZ3 != null) {
                arrayList3.addAll(arrayListZ3);
            }
            if (arrayListA != null) {
                arrayList3.addAll(arrayListA);
            }
            return arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        if (bVar2 != null) {
            i53.d<mp.k, List<yp.c>> dVar6 = bVar2.f198605a;
            if (s.g(map.get(mp.j.MATCHES), Boolean.TRUE)) {
                mp.k kVar8 = mp.k.GAMES_WON;
                List<yp.c> list6 = dVar6.get(kVar8);
                LocalDate localDate = cVar.f179268c;
                int i15 = cVar.f179267b;
                f14 = 0.0f;
                Context context = cVar.f179266a;
                if (list6 != null) {
                    ArrayList arrayListY = y(cVar, dVar6.get(mp.k.GAMES_NOT_WON), kVar2, 0, 28);
                    YAxis.AxisDependency axisDependency = YAxis.AxisDependency.RIGHT;
                    ArrayList<xz.a> arrayListY2 = y(cVar, list6, kVar8, R.color.gcm_chart_win_rate_matches_data_set, 24);
                    ArrayList arrayList5 = new ArrayList(y.r(arrayListY2, 10));
                    for (xz.a aVar : arrayListY2) {
                        float months = i15 == 6 ? Months.monthsBetween(localDate, aVar.f192729a).getMonths() : Days.daysBetween(localDate, aVar.f192729a).getDays();
                        Iterator it = arrayListY.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!s.g(((xz.a) next).f192729a, aVar.f192729a));
                        xz.a aVar2 = (xz.a) next;
                        arrayList5.add(new xz.e(months, aVar.f192730b + (aVar2 != null ? aVar2.f192730b : 0.0f), aVar.f192731c, new int[]{a7.b.getColor(context, R.color.gcm_chart_win_rate_matches_data_set)}, 0.0f, false, false, 80, (p005kotlin.jvm.internal.j) null));
                    }
                    List listC = w.c(arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it3 = listC.iterator();
                    while (it3.hasNext()) {
                        BarDataSet barDataSet = new BarDataSet((List) it3.next(), "");
                        barDataSet.setDrawValues(false);
                        barDataSet.setColor(a7.b.getColor(context, R.color.gcm_chart_win_rate_matches_data_set));
                        barDataSet.setAxisDependency(axisDependency);
                        arrayList6.add(barDataSet);
                    }
                    arrayList4.addAll(arrayList6);
                }
                mp.k kVar9 = mp.k.GAMES_NOT_WON;
                List<yp.c> list7 = dVar6.get(kVar9);
                if (list7 != null) {
                    YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
                    ArrayList<xz.a> arrayListY3 = y(cVar, list7, kVar9, R.color.gcm_chart_win_rate_other_data_set, 24);
                    ArrayList arrayList7 = new ArrayList(y.r(arrayListY3, 10));
                    for (xz.a aVar3 : arrayListY3) {
                        arrayList7.add(new xz.e(i15 == 6 ? Months.monthsBetween(localDate, aVar3.f192729a).getMonths() : Days.daysBetween(localDate, aVar3.f192729a).getDays(), aVar3.f192730b, aVar3.f192731c, new int[]{a7.b.getColor(context, R.color.gcm_chart_win_rate_other_data_set)}, 0.0f, false, false, 80, (p005kotlin.jvm.internal.j) null));
                    }
                    List listC2 = w.c(arrayList7);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it4 = listC2.iterator();
                    while (it4.hasNext()) {
                        BarDataSet barDataSet2 = new BarDataSet((List) it4.next(), "");
                        barDataSet2.setDrawValues(false);
                        barDataSet2.setColor(a7.b.getColor(context, R.color.gcm_chart_win_rate_other_data_set));
                        barDataSet2.setAxisDependency(axisDependency2);
                        arrayList8.add(barDataSet2);
                    }
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f14 = 0.0f;
            }
            i53.e<mp.k> eVar3 = (i53.e) dVar6.keySet();
            if (eVar3 != null) {
                for (mp.k kVar10 : eVar3) {
                    List<yp.c> list8 = dVar6.get(kVar10);
                    if (list8 != null) {
                        int i16 = b.f179271a[kVar10.ordinal()];
                        if (i16 != 1) {
                            arrayListZ = i16 != 5 ? null : z(cVar, list8, kVar10, 0, 0, false, null, null, 2044);
                        } else if (s.g(map.get(mp.j.MATCHES), Boolean.FALSE)) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj : list8) {
                                yp.c cVar2 = (yp.c) obj;
                                if (!s.c(cVar2.f198606a, 0.0d) && cVar2.f198606a != null) {
                                    arrayList9.add(obj);
                                }
                            }
                            ArrayList arrayList10 = new ArrayList(y.r(arrayList9, 10));
                            Iterator it5 = arrayList9.iterator();
                            while (it5.hasNext()) {
                                arrayList10.add(((yp.c) it5.next()).f198606a);
                            }
                            Double d14 = (Double) h0.d0(arrayList10);
                            ArrayList arrayList11 = new ArrayList(y.r(list8, 10));
                            Iterator<T> it6 = list8.iterator();
                            while (it6.hasNext()) {
                                arrayList11.add(new yp.c(d14, ((yp.c) it6.next()).f198607b));
                            }
                            arrayListZ = z(this, arrayList11, kVar10, 0, 0, false, new u(Float.valueOf(26.0f), Float.valueOf(23.0f), Float.valueOf(f14)), null, 1564);
                        } else {
                            arrayListZ = null;
                        }
                        if (arrayListZ != null) {
                            arrayList4.addAll(arrayListZ);
                        }
                    }
                    cVar = this;
                }
            }
        }
        return arrayList4;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(yp.b bVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(yp.b bVar) {
        return -0.1f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(yp.b bVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0122  */
    @Override // qz.c
    public final float i(yp.b bVar) {
        double dDoubleValue;
        List<yp.c> list;
        Number numberValueOf;
        yp.b bVar2 = bVar;
        int i14 = b.f179271a[this.f179269d.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return 100.0f;
        }
        if (i14 == 4) {
            if (bVar2 == null || (list = bVar2.f198605a.get(mp.k.PACK_WEIGHT)) == null) {
                dDoubleValue = 0.0d;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Double d14 = ((yp.c) it.next()).f198606a;
                    if (d14 != null) {
                        arrayList.add(d14);
                    }
                }
                Double dP0 = h0.p0(arrayList);
                if (dP0 != null) {
                    dDoubleValue = dP0.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
            }
            return C(this, (float) (dDoubleValue / ((double) 1000))) * 1000;
        }
        float f14 = 0.0f;
        if (bVar2 != null) {
            i53.d<mp.k, List<yp.c>> dVar = bVar2.f198605a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<mp.k, List<yp.c>> entry : dVar.entrySet()) {
                List<yp.c> value = entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = value.iterator();
                while (it3.hasNext()) {
                    Double d15 = ((yp.c) it3.next()).f198606a;
                    if (d15 != null) {
                        arrayList2.add(d15);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                C(this, 0.0f);
            } else {
                Iterator<Map.Entry<mp.k, List<yp.c>>> it4 = dVar.entrySet().iterator();
                while (it4.hasNext()) {
                    List<yp.c> value2 = it4.next().getValue();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it5 = value2.iterator();
                    while (it5.hasNext()) {
                        Double d16 = ((yp.c) it5.next()).f198606a;
                        if (d16 != null) {
                            arrayList3.add(d16);
                        }
                    }
                    Iterator it6 = arrayList3.iterator();
                    if (it6.hasNext()) {
                        double dDoubleValue2 = ((Number) it6.next()).doubleValue();
                        while (it6.hasNext()) {
                            dDoubleValue2 = Math.max(dDoubleValue2, ((Number) it6.next()).doubleValue());
                        }
                        numberValueOf = Double.valueOf(dDoubleValue2);
                    } else {
                        numberValueOf = null;
                    }
                    if (numberValueOf == null) {
                        numberValueOf = Float.valueOf(f14);
                    }
                    float fFloatValue = numberValueOf.floatValue();
                    if (fFloatValue > f14) {
                        f14 = fFloatValue;
                    }
                }
            }
        }
        return C(this, f14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float m(yp.b bVar) {
        yp.b bVar2 = bVar;
        float fDoubleValue = 0.0f;
        if (this.f179269d != mp.k.PACK_WEIGHT) {
            return 0.0f;
        }
        Double dValueOf = null;
        ArrayList arrayListB = B(bVar2 != null ? bVar2.f198605a : null, mp.k.PACE);
        if (arrayListB != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                Double d14 = ((yp.c) it.next()).f198606a;
                if (d14 != null) {
                    arrayList.add(d14);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                double dDoubleValue = ((Number) it3.next()).doubleValue();
                while (it3.hasNext()) {
                    dDoubleValue = Math.min(dDoubleValue, ((Number) it3.next()).doubleValue());
                }
                dValueOf = Double.valueOf(dDoubleValue);
            }
            if (dValueOf != null) {
                fDoubleValue = (float) dValueOf.doubleValue();
            }
        }
        return 0.9f * fDoubleValue;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float q(yp.b bVar) {
        float fM;
        int i14 = this.f179267b;
        if (i14 != 3) {
            fM = 6.0f;
            if (i14 != 4) {
                if (i14 == 5) {
                    fM = 27.0f;
                } else if (i14 == 6) {
                    fM = 11.0f;
                }
            }
        } else {
            LocalDate localDate = this.f179268c;
            LocalDate localDateMinusDays = localDate.plusMonths(1).minusDays(1);
            localDateMinusDays.getClass();
            fM = oc.b.m(localDate, localDateMinusDays) - 1.0f;
        }
        return fM + 0.1f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float t(yp.b bVar) {
        Number numberValueOf;
        yp.b bVar2 = bVar;
        int i14 = b.f179271a[this.f179269d.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 4 || bVar2 == null) {
            return 0.0f;
        }
        i53.d<mp.k, List<yp.c>> dVar = bVar2.f198605a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<mp.k, List<yp.c>> entry : dVar.entrySet()) {
            List<yp.c> value = entry.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                Double d14 = ((yp.c) it.next()).f198606a;
                if (d14 != null) {
                    arrayList.add(d14);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return 0.0f;
        }
        Iterator<Map.Entry<mp.k, List<yp.c>>> it3 = dVar.entrySet().iterator();
        float f14 = Float.MAX_VALUE;
        float f15 = -1.4E-45f;
        while (it3.hasNext()) {
            List<yp.c> value2 = it3.next().getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = value2.iterator();
            while (it4.hasNext()) {
                Double d15 = ((yp.c) it4.next()).f198606a;
                if (d15 != null) {
                    arrayList2.add(d15);
                }
            }
            Iterator it5 = arrayList2.iterator();
            Number numberValueOf2 = null;
            if (it5.hasNext()) {
                double dDoubleValue = ((Number) it5.next()).doubleValue();
                while (it5.hasNext()) {
                    dDoubleValue = Math.min(dDoubleValue, ((Number) it5.next()).doubleValue());
                }
                numberValueOf = Double.valueOf(dDoubleValue);
            } else {
                numberValueOf = null;
            }
            if (numberValueOf == null) {
                numberValueOf = Float.valueOf(f14);
            }
            float fFloatValue = numberValueOf.floatValue();
            Iterator it6 = arrayList2.iterator();
            if (it6.hasNext()) {
                double dDoubleValue2 = ((Number) it6.next()).doubleValue();
                while (it6.hasNext()) {
                    dDoubleValue2 = Math.max(dDoubleValue2, ((Number) it6.next()).doubleValue());
                }
                numberValueOf2 = Double.valueOf(dDoubleValue2);
            }
            if (numberValueOf2 == null) {
                numberValueOf2 = Float.valueOf(f15);
            }
            float fFloatValue2 = numberValueOf2.floatValue();
            if (fFloatValue < f14) {
                f14 = fFloatValue;
            }
            if (fFloatValue2 > f15) {
                f15 = fFloatValue2;
            }
        }
        return f15 - f14 > 4.0f ? f14 : f14 - 4.0f;
    }

    @Override // qz.c
    public final List u(yp.b bVar) {
        List listK;
        yp.b bVar2 = bVar;
        int i14 = b.f179271a[this.f179269d.ordinal()];
        Context context = this.f179266a;
        if (i14 == 1) {
            i53.d<mp.k, List<yp.c>> dVar = bVar2 != null ? bVar2.f198605a : null;
            if (dVar != null) {
                if (dVar.containsKey(mp.k.GAMES_NOT_WON)) {
                    String string = context.getString(R.string.lbl_win_rate);
                    string.getClass();
                    xz.f fVar = new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_daily_body_battery_data_set)), null, xz.g.a.f192745a, null, null, 106, null);
                    String string2 = context.getString(R.string.activities_gaming_status_win);
                    string2.getClass();
                    xz.g.C3605g c3605g = xz.g.C3605g.f192752a;
                    xz.f fVar2 = new xz.f(string2, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_win_rate_matches_data_set)), null, c3605g, null, null, 106, null);
                    String string3 = context.getString(R.string.lbl_other);
                    string3.getClass();
                    listK = x.k(fVar, fVar2, new xz.f(string3, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_win_rate_other_data_set)), null, c3605g, null, null, 106, null));
                } else {
                    String string4 = context.getString(R.string.lbl_win_rate);
                    string4.getClass();
                    xz.f fVar3 = new xz.f(string4, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_daily_body_battery_data_set)), null, xz.g.a.f192745a, null, null, 106, null);
                    String string5 = context.getString(R.string.gaming_avg_win_rate);
                    string5.getClass();
                    listK = x.k(fVar3, new xz.f(string5, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_daily_body_battery_data_set)), null, new xz.g.c(0, 1.0f, 1, null), null, null, 106, null));
                }
                if (listK != null) {
                    return listK;
                }
            }
            return j0.f134944a;
        }
        if (i14 != 2) {
            if (i14 == 3) {
                if ((bVar2 != null ? bVar2.f198605a : null) == null) {
                    return j0.f134944a;
                }
                String string6 = context.getString(R.string.activity_details_net_impact);
                string6.getClass();
                return w.c(new xz.f(string6, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_daily_body_battery_data_set)), null, xz.g.a.f192745a, null, null, 106, null));
            }
            if (i14 != 4) {
                return j0.f134944a;
            }
            if ((bVar2 != null ? bVar2.f198605a : null) != null) {
                String string7 = context.getString(R.string.lbl_weight);
                string7.getClass();
                xz.g.a aVar = xz.g.a.f192745a;
                mp.k.a aVar2 = mp.k.f120007d;
                mp.k kVar = mp.k.PACK_WEIGHT;
                aVar2.getClass();
                xz.f fVar4 = new xz.f(string7, null, Integer.valueOf(a7.b.getColor(context, mp.k.a.a(kVar))), null, aVar, null, null, 106, null);
                String string8 = context.getString(R.string.lbl_pace);
                string8.getClass();
                List listK2 = x.k(fVar4, new xz.f(string8, null, Integer.valueOf(a7.b.getColor(context, mp.k.a.a(mp.k.PACE))), null, xz.g.C3605g.f192752a, null, null, 106, null));
                if (listK2 != null) {
                    return listK2;
                }
            }
            return j0.f134944a;
        }
        i53.d<mp.k, List<yp.c>> dVar2 = bVar2 != null ? bVar2.f198605a : null;
        String string9 = context.getString(R.string.activity_details_average_stress);
        string9.getClass();
        xz.g.a aVar3 = xz.g.a.f192745a;
        mp.k.a aVar4 = mp.k.f120007d;
        mp.k kVar2 = mp.k.STRESS;
        aVar4.getClass();
        ArrayList arrayListM = x.m(new xz.f(string9, null, Integer.valueOf(a7.b.getColor(context, mp.k.a.a(kVar2))), null, aVar3, null, null, 106, null));
        if (dVar2 != null) {
            for (mp.k kVar3 : dVar2.keySet()) {
                int i15 = b.f179271a[kVar3.ordinal()];
                Map<mp.j, Boolean> map = this.f179270e;
                if (i15 != 6) {
                    if (i15 != 7) {
                        if (i15 == 8 && s.g(map.get(mp.j.AVG_DRAW_STRESS), Boolean.TRUE)) {
                            String string10 = context.getString(R.string.gaming_avg_tie_stress);
                            string10.getClass();
                            xz.g.C3605g c3605g2 = xz.g.C3605g.f192752a;
                            mp.k.f120007d.getClass();
                            arrayListM.add(new xz.f(string10, null, Integer.valueOf(a7.b.getColor(context, mp.k.a.a(kVar3))), null, c3605g2, null, null, 106, null));
                        }
                    } else if (s.g(map.get(mp.j.AVG_LOSS_STRESS), Boolean.TRUE)) {
                        String string11 = context.getString(R.string.gaming_avg_loss_stress);
                        string11.getClass();
                        arrayListM.add(new xz.f(string11, null, null, null, new xz.g.b(a7.b.getDrawable(context, R.drawable.chart_legend_triangle)), null, null, 110, null));
                    }
                } else if (s.g(map.get(mp.j.AVG_WIN_STRESS), Boolean.TRUE)) {
                    String string12 = context.getString(R.string.gaming_avg_win_stress);
                    string12.getClass();
                    arrayListM.add(new xz.f(string12, null, null, null, new xz.g.b(a7.b.getDrawable(context, R.drawable.chart_legend_diamond)), null, null, 110, null));
                }
            }
        }
        return arrayListM;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float w(yp.b bVar) {
        yp.b bVar2 = bVar;
        int i14 = b.f179271a[this.f179269d.ordinal()];
        Double dValueOf = null;
        float fDoubleValue = 0.0f;
        if (i14 != 1) {
            if (i14 == 4) {
                ArrayList arrayListB = B(bVar2 != null ? bVar2.f198605a : null, mp.k.PACE);
                if (arrayListB != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        Double d14 = ((yp.c) it.next()).f198606a;
                        if (d14 != null) {
                            arrayList.add(d14);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        double dDoubleValue = ((Number) it3.next()).doubleValue();
                        while (it3.hasNext()) {
                            dDoubleValue = Math.max(dDoubleValue, ((Number) it3.next()).doubleValue());
                        }
                        dValueOf = Double.valueOf(dDoubleValue);
                    }
                    if (dValueOf != null) {
                        fDoubleValue = (float) dValueOf.doubleValue();
                    }
                }
                return 1.1f * fDoubleValue;
            }
        } else if (s.g(this.f179270e.get(mp.j.MATCHES), Boolean.TRUE)) {
            ArrayList arrayListB2 = B(bVar2 != null ? bVar2.f198605a : null, mp.k.GAMES_WON, mp.k.GAMES_NOT_WON);
            if (arrayListB2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = arrayListB2.iterator();
                while (it4.hasNext()) {
                    Double d15 = ((yp.c) it4.next()).f198606a;
                    if (d15 != null) {
                        arrayList2.add(d15);
                    }
                }
                Iterator it5 = arrayList2.iterator();
                if (!it5.hasNext()) {
                    t.g();
                    return 0.0f;
                }
                double dDoubleValue2 = ((Number) it5.next()).doubleValue();
                while (it5.hasNext()) {
                    dDoubleValue2 = Math.max(dDoubleValue2, ((Number) it5.next()).doubleValue());
                }
                return C(this, (float) dDoubleValue2);
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    public final ArrayList x(List list, mp.k kVar, int i14, boolean z14, boolean z15) {
        l lVar;
        xz.a aVar;
        String strD;
        String strC1;
        mp.k kVar2;
        String string;
        String str;
        String string2;
        Integer num;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yp.c cVar = (yp.c) it.next();
                if (z14 || !s.c(cVar.f198606a, 0.0d)) {
                    int i15 = this.f179267b;
                    LocalDate localDate = this.f179268c;
                    LocalDate localDatePlusMonths = i15 == 6 ? localDate.plusMonths(cVar.f198607b) : localDate.plusDays(cVar.f198607b);
                    Double d14 = cVar.f198606a;
                    Float fValueOf = d14 != null ? Float.valueOf((float) d14.doubleValue()) : null;
                    if (fValueOf != null) {
                        if (z15) {
                            localDatePlusMonths.getClass();
                            Context context = this.f179266a;
                            if (i15 != 6) {
                                strD = new pi0.e(context).d(localDatePlusMonths, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                            } else if (this.f179269d == mp.k.PACK_WEIGHT) {
                                pi0.e eVar = new pi0.e(context);
                                DateTime dateTime = localDatePlusMonths.toDateTime(LocalTime.MIDNIGHT);
                                dateTime.getClass();
                                strD = eVar.j(dateTime, pi0.d.DATE_FULL_MONTH_NO_PAST_YEAR);
                            } else {
                                pi0.e eVar2 = new pi0.e(context);
                                LocalDate localDatePlusMonths2 = localDatePlusMonths.plusMonths(1);
                                localDatePlusMonths2.getClass();
                                strD = eVar2.m(localDatePlusMonths, localDatePlusMonths2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                            }
                            double dDoubleValue = d14.doubleValue();
                            boolean z16 = am.j.z(f12.l.f68084a);
                            int[] iArr = b.f179271a;
                            int i16 = iArr[kVar.ordinal()];
                            if (i16 == 4) {
                                strC1 = l3.a.C1(l3.f23124b, context, dDoubleValue / 1000.0d, z16, false, null, 56);
                            } else if (i16 == 5) {
                                l3.f23124b.getClass();
                                strC1 = l3.a.D1(dDoubleValue, true);
                            } else if (i16 != 9) {
                                l3.f23124b.getClass();
                                strC1 = l3.a.B(dDoubleValue);
                            } else {
                                l3.a aVar2 = l3.f23124b;
                                aVar2.getClass();
                                strC1 = aVar2.r0(context, l3.a.p(dDoubleValue, z16), z16, true, "");
                            }
                            String str2 = strC1;
                            double dDoubleValue2 = d14.doubleValue();
                            switch (iArr[kVar.ordinal()]) {
                                case 2:
                                    kVar2 = kVar;
                                    string = context.getString(R.string.common_avg);
                                    str = string;
                                    break;
                                case 3:
                                    kVar2 = kVar;
                                    string = context.getString(R.string.activity_details_net_impact);
                                    str = string;
                                    break;
                                case 4:
                                    kVar2 = kVar;
                                    string = context.getString(R.string.lbl_weight);
                                    str = string;
                                    break;
                                case 5:
                                    kVar2 = kVar;
                                    string = context.getString(R.string.lbl_win_rate);
                                    str = string;
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                    kVar2 = kVar;
                                    string = dh.b.A(context, kVar2.f120028a);
                                    str = string;
                                    break;
                                case 10:
                                    string2 = context.getString(R.string.lbl_other);
                                    str = string2;
                                    kVar2 = kVar;
                                    break;
                                case 11:
                                    string2 = dDoubleValue2 > 1.0d ? context.getString(R.string.gaming_wins) : context.getString(R.string.activities_gaming_status_win);
                                    str = string2;
                                    kVar2 = kVar;
                                    break;
                                default:
                                    kVar2 = kVar;
                                    str = null;
                                    break;
                            }
                            Integer numValueOf = Integer.valueOf(R.drawable.chart_item_rectangle);
                            switch (iArr[kVar2.ordinal()]) {
                                case 6:
                                    numValueOf = Integer.valueOf(R.drawable.chart_item_rhombus);
                                    num = numValueOf;
                                    break;
                                case 7:
                                    numValueOf = Integer.valueOf(R.drawable.chart_item_triangle);
                                    num = numValueOf;
                                    break;
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                    num = numValueOf;
                                    break;
                                default:
                                    num = null;
                                    break;
                            }
                            lVar = new l(strD, str2, str, null, null, Integer.valueOf(i14), num, Integer.valueOf(i14), 24, null);
                        } else {
                            lVar = null;
                        }
                        localDatePlusMonths.getClass();
                        aVar = new xz.a(localDatePlusMonths, fValueOf.floatValue(), lVar);
                    } else {
                        aVar = null;
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lvp/c$a;", "", "<init>", "()V", "", "Y_AXIS_INTERVALS_COUNT", "F", "SCATTER_SHAPE_SIZE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
