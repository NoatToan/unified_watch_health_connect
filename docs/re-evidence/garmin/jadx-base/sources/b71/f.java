package b71;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000eB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lb71/f;", "Lqz/c;", "La71/e;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lo82/g;", "intervalType", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lo82/g;)V", "b", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.c<a71.e, ILineDataSet> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f16322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f16323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f16324l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f16326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f16327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o82.g f16328d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb71/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        ACUTE_LOAD_VALUE,
        ACUTE_LOAD_IDEAL_MIN,
        ACUTE_LOAD_IDEAL_MAX,
        PAUSE,
        CHRONIC_LOAD
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16336b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ACUTE_LOAD_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CHRONIC_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.ACUTE_LOAD_IDEAL_MIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.ACUTE_LOAD_IDEAL_MAX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16335a = iArr;
            int[] iArr2 = new int[o82.g.values().length];
            try {
                iArr2[o82.g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            f16336b = iArr2;
        }
    }

    static {
        new a(null);
        f16317e = R.color.gcm_training_load_acute_color;
        f16318f = R.color.gcm_training_load_acute_with_chronic_color;
        f16319g = R.color.gcm_training_load_chronic_color;
        f16320h = R.color.gcm_seven_day_load_chart_gradient_start;
        f16321i = R.color.gcm_seven_day_load_chart_gradient_end;
        f16322j = R.color.gray_55_static;
        f16323k = R.color.gcm_background_hero;
        f16324l = R.color.gcm_chart_highlight_line;
    }

    public f(Context context, DateTime dateTime, DateTime dateTime2, o82.g gVar) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        gVar.getClass();
        this.f16325a = context;
        this.f16326b = dateTime;
        this.f16327c = dateTime2;
        this.f16328d = gVar;
    }

    public static float A(a71.e eVar) {
        List<a71.d> list = eVar.f1751a;
        double dY = y(list, b.ACUTE_LOAD_VALUE);
        double[] dArr = {y(list, b.ACUTE_LOAD_IDEAL_MAX), y(list, b.PAUSE), eVar.f1762l ? y(list, b.CHRONIC_LOAD) : 0.0d};
        for (int i14 = 0; i14 < 3; i14++) {
            dY = Math.max(dY, dArr[i14]);
        }
        return (float) dY;
    }

    public static double B(a71.d dVar, b bVar) {
        int i14 = c.f16335a[bVar.ordinal()];
        if (i14 == 1) {
            return dVar.f1737a;
        }
        if (i14 == 2) {
            return dVar.f1738b;
        }
        if (i14 == 3) {
            return dVar.f1740d;
        }
        if (i14 != 4 && i14 != 5) {
            u0.r();
            return 0.0d;
        }
        return dVar.f1741e;
    }

    public static double y(List list, b bVar) {
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(B((a71.d) it.next(), bVar)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            double dDoubleValue = ((Number) obj).doubleValue();
            if (!Double.isNaN(dDoubleValue) && dDoubleValue >= 0.0d) {
                arrayList2.add(obj);
            }
        }
        Double dP0 = h0.p0(arrayList2);
        if (dP0 != null) {
            return dP0.doubleValue();
        }
        return 0.0d;
    }

    public static double z(List list, b bVar) {
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(B((a71.d) it.next(), bVar)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            double dDoubleValue = ((Number) obj).doubleValue();
            if (!Double.isNaN(dDoubleValue) && dDoubleValue >= 0.0d) {
                arrayList2.add(obj);
            }
        }
        Double dU0 = h0.u0(arrayList2);
        if (dU0 != null) {
            return dU0.doubleValue();
        }
        return Double.MAX_VALUE;
    }

    @Override // qz.c
    public final List<ILineDataSet> a(a71.e eVar) {
        a71.d dVar;
        a71.e eVar2 = eVar;
        List list = eVar2 != null ? eVar2.f1751a : null;
        if (list == null || list.isEmpty()) {
            return j0.f134944a;
        }
        boolean z14 = eVar2.f1762l;
        ArrayList arrayListX = x(list, b.ACUTE_LOAD_VALUE, z14);
        if (arrayListX.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        Context context = this.f16325a;
        int i14 = f16323k;
        int color = a7.b.getColor(context, i14);
        LineDataSet lineDataSet = new LineDataSet(x(list, b.ACUTE_LOAD_IDEAL_MAX, z14), "Upper Bounds");
        lineDataSet.setDrawValues(false);
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        lineDataSet.setAxisDependency(axisDependency);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setLineWidth(0.0f);
        lineDataSet.setColor(color);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i15 = f16322j;
        int color2 = a7.b.getColor(context, z14 ? i15 : f16320h);
        if (!z14) {
            i15 = f16321i;
        }
        lineDataSet.setFillDrawable(new GradientDrawable(orientation, new int[]{color2, a7.b.getColor(context, i15)}));
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setHighlightEnabled(false);
        arrayList.add(lineDataSet);
        LineDataSet lineDataSet2 = new LineDataSet(x(list, b.ACUTE_LOAD_IDEAL_MIN, z14), "Lower Bounds");
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setAxisDependency(axisDependency);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setLineWidth(0.0f);
        lineDataSet2.setColor(color);
        lineDataSet2.setFillColor(color);
        lineDataSet2.setFillAlpha(255);
        lineDataSet2.setDrawFilled(true);
        lineDataSet2.setDrawCircleHole(false);
        lineDataSet2.setHighlightEnabled(false);
        arrayList.add(lineDataSet2);
        ArrayList arrayList2 = new ArrayList();
        Stack stack = new Stack();
        for (int size = list.size() - 1; -1 < size; size--) {
            stack.push(list.get(size));
        }
        loop1: while (true) {
            boolean z15 = false;
            while (true) {
                if (stack.isEmpty()) {
                    break loop1;
                }
                dVar = (a71.d) stack.pop();
                if (z15) {
                    if (!dVar.f1746j) {
                        break;
                    }
                } else if (dVar.f1746j) {
                    arrayList2.add(dVar);
                    z15 = true;
                }
            }
            arrayList2.add(dVar);
        }
        List listX = arrayList2.isEmpty() ? j0.f134944a : x(arrayList2, b.PAUSE, false);
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            ((Entry) it.next()).setY(A(eVar2));
        }
        int i16 = 0;
        for (int i17 = 1; i16 < listX.size() && i17 < listX.size(); i17 += 2) {
            List listK = x.k((Entry) listX.get(i16), (Entry) listX.get(i17));
            int color3 = a7.b.getColor(context, i14);
            LineDataSet lineDataSet3 = new LineDataSet(listK, "Pause Bounds");
            lineDataSet3.setDrawValues(false);
            lineDataSet3.setDrawCircles(false);
            lineDataSet3.setLineWidth(0.0f);
            lineDataSet3.setColor(color3);
            lineDataSet3.setFillColor(color3);
            lineDataSet3.setFillAlpha(255);
            lineDataSet3.setDrawFilled(true);
            lineDataSet3.setDrawCircleHole(false);
            lineDataSet3.setHighlightEnabled(false);
            arrayList.add(lineDataSet3);
            i16 += 2;
        }
        LineDataSet lineDataSet4 = new LineDataSet(arrayListX, "Acute Load");
        lineDataSet4.setDrawValues(false);
        int color4 = a7.b.getColor(context, z14 ? f16318f : f16317e);
        lineDataSet4.setColor(color4);
        lineDataSet4.setDrawCircles(true);
        lineDataSet4.setCircleColor(color4);
        lineDataSet4.setCircleRadius(4.0f);
        lineDataSet4.setDrawCircleHole(false);
        lineDataSet4.setLineWidth(2.0f);
        lineDataSet4.setDrawFilled(false);
        lineDataSet4.setHighlightEnabled(true);
        lineDataSet4.setDrawHorizontalHighlightIndicator(false);
        lineDataSet4.setHighlightLineWidth(1.0f);
        int i18 = f16324l;
        lineDataSet4.setHighLightColor(a7.b.getColor(context, i18));
        arrayList.add(lineDataSet4);
        if (z14) {
            xz.c cVar = new xz.c(x(list, b.CHRONIC_LOAD, true), "Chronic Load", a7.b.getDrawable(context, R.drawable.square_chronic_load_chart_metric));
            cVar.setDrawValues(false);
            int color5 = a7.b.getColor(context, f16319g);
            cVar.setColor(color5);
            cVar.setDrawCircles(true);
            cVar.setCircleColor(color5);
            cVar.setCircleRadius(4.0f);
            cVar.setDrawCircleHole(false);
            cVar.setLineWidth(2.0f);
            cVar.setDrawFilled(false);
            cVar.setHighlightEnabled(true);
            cVar.setDrawHorizontalHighlightIndicator(false);
            cVar.setHighlightLineWidth(1.0f);
            cVar.setHighLightColor(a7.b.getColor(context, i18));
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(a71.e eVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(a71.e eVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final float i(a71.e eVar) {
        a71.e eVar2 = eVar;
        if ((eVar2 != null ? eVar2.f1751a : null) == null) {
            return 0.0f;
        }
        float fA = A(eVar2);
        fz.a.f73959a.getClass();
        return (float) fz.a.h(((double) fA) * 1.1d);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(a71.e eVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final float q(a71.e eVar) {
        if (c.f16336b[this.f16328d.ordinal()] == 1) {
            return Days.daysBetween(this.f16326b, this.f16327c).getDays();
        }
        return 27.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final float t(a71.e eVar) {
        a71.e eVar2 = eVar;
        if ((eVar2 != null ? eVar2.f1751a : null) == null) {
            return 0.0f;
        }
        List<a71.d> list = eVar2.f1751a;
        double dZ = z(list, b.ACUTE_LOAD_VALUE);
        double[] dArr = {z(list, b.ACUTE_LOAD_IDEAL_MIN), z(list, b.PAUSE), eVar2.f1762l ? z(list, b.CHRONIC_LOAD) : Double.MAX_VALUE};
        for (int i14 = 0; i14 < 3; i14++) {
            dZ = Math.min(dZ, dArr[i14]);
        }
        float f14 = (float) dZ;
        if (f14 == 0.0f) {
            return -0.1f;
        }
        return f14;
    }

    @Override // qz.c
    public final List u(a71.e eVar) {
        a71.e eVar2 = eVar;
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        if (eVar2 != null && eVar2.f1762l) {
            z14 = true;
        }
        List<a71.d> list = eVar2 != null ? eVar2.f1751a : null;
        Context context = this.f16325a;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((a71.d) it.next()).f1746j) {
                    String string = context.getString(R.string.lbl_optimal_range);
                    string.getClass();
                    arrayList.add(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, z14 ? f16322j : f16320h)), null, xz.g.a.f192745a, null, null, 106, null));
                    break;
                }
            }
        }
        String string2 = context.getString(R.string.tr_factor_acute_load);
        string2.getClass();
        arrayList.add(new xz.f(string2, null, Integer.valueOf(a7.b.getColor(context, z14 ? f16318f : f16317e)), null, xz.g.a.f192745a, null, context.getString(R.string.lbl_chart_ada_circle_primary_color_legend, string2), 42, null));
        if (z14) {
            String string3 = context.getString(R.string.chronic_load_title);
            string3.getClass();
            arrayList.add(new xz.f(string3, null, Integer.valueOf(a7.b.getColor(context, f16319g)), null, xz.g.C3605g.f192752a, null, null, 106, null));
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(a71.e eVar) {
        return 0.0f;
    }

    public final ArrayList x(List list, b bVar, boolean z14) {
        int i14;
        zz.l lVar;
        ArrayList arrayList = new ArrayList();
        DateTime dateTime = this.f16326b;
        DateTime dateTimePlusDays = dateTime;
        while (true) {
            DateTime dateTime2 = this.f16327c;
            if (!dateTimePlusDays.isBefore(dateTime2)) {
                c22.j0.f23099a.getClass();
                if (!c22.j0.F(dateTimePlusDays, dateTime2)) {
                    return arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a71.d dVar = (a71.d) it.next();
                DateTime dateTime3 = dVar.f1742f;
                c22.j0.f23099a.getClass();
                if (c22.j0.F(dateTimePlusDays, dateTime3)) {
                    double dB = B(dVar, bVar);
                    if ((!Double.isNaN(dB) && dB >= 0.0d) || bVar == b.PAUSE) {
                        int i15 = c.f16335a[bVar.ordinal()];
                        Context context = this.f16325a;
                        if (i15 != 1) {
                            lVar = i15 != 2 ? null : new zz.l(dVar.f1743g, dVar.f1745i, context.getString(R.string.chronic_load_title), null, null, null, Integer.valueOf(R.drawable.square_chronic_load_chart_metric), null, SyslogConstants.LOG_LOCAL7, null);
                        } else {
                            if (z14) {
                                i14 = R.string.tr_factor_acute_load;
                            } else {
                                i14 = dVar.f1749m ? R.string.lbl_training_status_load : R.string.lbl_seven_day_load;
                            }
                            lVar = new zz.l(dVar.f1743g, dVar.f1744h, dVar.f1750n, context.getString(i14), null, null, Integer.valueOf(R.drawable.gcm_chart_metric_bullet), Integer.valueOf(z14 ? R.color.gcm_training_load_acute_with_chronic_color : R.color.gcm_text_primary), 48, null);
                        }
                        arrayList.add(new Entry(Days.daysBetween(dateTime, dateTimePlusDays).getDays(), (float) dB, lVar));
                    }
                }
            }
            dateTimePlusDays = dateTimePlusDays.plusDays(1);
            dateTimePlusDays.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lb71/f$a;", "", "<init>", "()V", "", "LINE_WIDTH", "F", "CIRCLE_RADIUS", "", "ACUTE_LOAD_LINE_COLOR_RES_ID", "I", "ACUTE_WITH_CHRONIC_OVERLAY_LINE_COLOR_RES_ID", "CHRONIC_LINE_COLOR_RES_ID", "OPTIMAL_RANGE_GRADIENT_COLOR_START", "OPTIMAL_RANGE_GRADIENT_COLOR_END", "OPTIMAL_RANGE_CHRONIC_OVERLAY_BACKGROUND_COLOR", "OPTIMAL_RANGE_MASK_COLOR", "HIGHLIGHT_LINE_COLOR", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f(Context context, DateTime dateTime, DateTime dateTime2, o82.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, dateTime, dateTime2, (i14 & 8) != 0 ? o82.g.f130853f : gVar);
    }
}
