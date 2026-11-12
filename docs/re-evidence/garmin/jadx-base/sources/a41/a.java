package a41;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import c22.p2;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import i3.e5;
import i41.d;
import i41.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lc.u0;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import qz.c;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"La41/a;", "Lqz/c;", "Lz31/b;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineScatterCandleRadarDataSet;", "Lcom/github/mikephil/charting/data/Entry;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<z31.b, ILineScatterCandleRadarDataSet<Entry>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<t31.c> f952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f959i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f960a;

        static {
            int[] iArr = new int[t31.c.values().length];
            try {
                iArr[t31.c.BALANCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t31.c.UNBALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t31.c.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t31.c.POOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t31.c.NO_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t31.c.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t31.c.OVERNIGHT_AVG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f960a = iArr;
        }
    }

    static {
        new C0010a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f951a = context;
        this.f952b = new LinkedHashSet();
        t31.a aVar = t31.a.f162199a;
        p2 p2VarA = aVar.a(d.BALANCED.f90923a);
        this.f953c = p2VarA != null ? zf.b.y(p2VarA, context) : null;
        p2 p2VarA2 = aVar.a(d.UNBALANCED.f90923a);
        this.f954d = p2VarA2 != null ? zf.b.y(p2VarA2, context) : null;
        p2 p2VarA3 = aVar.a(d.LOW.f90923a);
        this.f955e = p2VarA3 != null ? zf.b.y(p2VarA3, context) : null;
        p2 p2VarA4 = aVar.a(d.POOR.f90923a);
        this.f956f = p2VarA4 != null ? zf.b.y(p2VarA4, context) : null;
        p2 p2VarA5 = aVar.a(d.NONE.f90923a);
        this.f957g = p2VarA5 != null ? zf.b.y(p2VarA5, context) : null;
        this.f958h = a7.b.getColor(context, R.color.gcm_chart_hrv_baseline);
        this.f959i = a7.b.getColor(context, R.color.gcm_chart_highlight_line);
    }

    public static l A(a aVar, String str, String str2, String str3, Integer num, int i14) {
        return new l(str, e5.g(str2, StringUtils.SPACE, aVar.f951a.getString(R.string.lbl_ms)), str3, null, null, null, (i14 & 16) != 0 ? null : num, null, SyslogConstants.LOG_LOCAL3, null);
    }

    public static void x(String str, Set set) {
        t31.c cVar;
        t31.c[] cVarArrValues = t31.c.values();
        int length = cVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i14];
            if (s.g(cVar.f162209a, str)) {
                break;
            } else {
                i14++;
            }
        }
        if (cVar == null || set.contains(cVar)) {
            return;
        }
        set.add(cVar);
    }

    public static Entry z(float f14, float f15, l lVar, Drawable drawable) {
        if (lVar != null && drawable != null) {
            return new Entry(f14, f15, drawable, lVar);
        }
        if (lVar != null || drawable == null) {
            return (lVar == null || drawable != null) ? new Entry(f14, f15) : new Entry(f14, f15, lVar);
        }
        return new Entry(f14, f15, drawable);
    }

    public final LineDataSet B(List<? extends Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(list, "OVERNIGHT_AVG_DATA_SET");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.enableDashedLine(4.0f, 10.0f, 0.0f);
        lineDataSet.setHighLightColor(this.f959i);
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setColor(this.f951a.getColor(R.color.gcm_chart_hrv_overnight_average_data_set));
        lineDataSet.setLineWidth(2.0f);
        return lineDataSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final List<ILineScatterCandleRadarDataSet<Entry>> a(z31.b bVar) {
        String string;
        List<f> list;
        a aVar = this;
        z31.b bVar2 = bVar;
        aVar.f952b.clear();
        List<f> list2 = bVar2 != null ? bVar2.f202146h : null;
        ArrayList<Entry> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Context context = aVar.f951a;
        if (list2 != null && !list2.isEmpty()) {
            int i14 = 0;
            while (i14 < list2.size()) {
                f fVar = list2.get(i14);
                i41.a baseline = fVar.getBaseline();
                Integer lastNightAvg = fVar.getLastNightAvg();
                String status = fVar.getStatus();
                Integer weeklyAvg = fVar.getWeeklyAvg();
                LocalDate localDateF = list2.get(i14).f();
                if (localDateF == null || (string = localDateF.toString("MMMM d")) == null) {
                    string = "";
                }
                if (baseline == null || !t31.b.c(baseline, status)) {
                    list = list2;
                    status = status;
                } else {
                    Integer balancedLow = baseline.getBalancedLow();
                    if (balancedLow != null) {
                        int iIntValue = balancedLow.intValue();
                        String str = baseline.getBalancedLow() + "-" + baseline.getBalancedUpper();
                        if (s.g(status, x31.b.POOR.toString())) {
                            list = list2;
                            arrayList3.add(null);
                        } else {
                            float f14 = iIntValue;
                            String string2 = context.getString(R.string.ohrv_baseline);
                            string2.getClass();
                            list = list2;
                            arrayList3.add(z(i14, f14, A(aVar, string, str, string2, Integer.valueOf(R.drawable.circle_gray_fixed_size), 8), null));
                        }
                        x(t31.c.BASELINE.f162209a, aVar.f952b);
                    } else {
                        baseline = baseline;
                        list = list2;
                        status = status;
                    }
                    Integer balancedUpper = baseline.getBalancedUpper();
                    if (balancedUpper != null) {
                        int iIntValue2 = balancedUpper.intValue();
                        if (s.g(status, x31.b.POOR.toString())) {
                            arrayList4.add(null);
                        } else {
                            arrayList4.add(z(i14, iIntValue2, null, null));
                        }
                    }
                }
                if (weeklyAvg != null && status != null) {
                    x(status, aVar.f952b);
                    p2 p2VarA = t31.a.f162199a.a(status);
                    p pVar = new p(p2VarA != null ? zf.b.y(p2VarA, context) : null, p2VarA != null ? p2VarA.f23192a : null);
                    float fIntValue = weeklyAvg.intValue();
                    Drawable drawable = (Drawable) pVar.f128594a;
                    String strValueOf = String.valueOf(weeklyAvg.intValue());
                    String string3 = context.getString(R.string.lbl_7d_avg);
                    string3.getClass();
                    arrayList.add(z(i14, fIntValue, A(aVar, string, strValueOf, string3, (Integer) pVar.f128595b, 8), drawable));
                }
                if (lastNightAvg == null || !bVar2.f202147i) {
                    aVar = this;
                    if (bVar2.f202147i) {
                        arrayList2.add(null);
                    }
                } else {
                    float fIntValue2 = lastNightAvg.intValue();
                    String strValueOf2 = String.valueOf(lastNightAvg.intValue());
                    String string4 = context.getString(R.string.overnight_avg);
                    string4.getClass();
                    aVar = this;
                    arrayList2.add(z(i14, fIntValue2, A(aVar, string, strValueOf2, string4, null, 24), null));
                    x(t31.c.OVERNIGHT_AVG.f162209a, aVar.f952b);
                }
                i14++;
                list2 = list;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (arrayList2.contains(null)) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < arrayList2.size()) {
                if (arrayList2.get(i15) == null) {
                    arrayList5.add(aVar.B(arrayList2.subList(i16, i15)));
                    i16 = i15 + 1;
                    i15 = i16;
                } else {
                    i15++;
                }
            }
            List<? extends Entry> listSubList = arrayList2.subList(i16, i15);
            if (!listSubList.isEmpty()) {
                arrayList5.add(aVar.B(listSubList));
            }
        } else {
            arrayList5.add(aVar.B(arrayList2));
        }
        for (Entry entry : arrayList) {
            Object data = entry.getData();
            l lVar = data instanceof l ? (l) data : null;
            Integer num = lVar != null ? lVar.f207550g : null;
            if (num != null) {
                entry.setIcon(r0.c(r0.f23226a, context, num.intValue(), context.getResources().getDimensionPixelSize(R.dimen.chart_value_item_size)));
            }
        }
        ScatterDataSet scatterDataSet = new ScatterDataSet(arrayList, "WEEKLY_AVG_DATA_SET");
        scatterDataSet.setDrawValues(false);
        scatterDataSet.setDrawHorizontalHighlightIndicator(false);
        scatterDataSet.setDrawIcons(true);
        scatterDataSet.setHighLightColor(aVar.f959i);
        scatterDataSet.setHighlightLineWidth(1.0f);
        scatterDataSet.setScatterShapeSize(0.0f);
        arrayList6.add(scatterDataSet);
        if (arrayList3.contains(null)) {
            int i17 = 0;
            int i18 = 0;
            while (i17 < arrayList3.size()) {
                if (arrayList3.get(i17) == null) {
                    ArrayList arrayListY = aVar.y(arrayList3.subList(i18, i17), arrayList4.subList(i18, i17));
                    arrayList5.add(arrayListY.get(0));
                    arrayList5.add(arrayListY.get(1));
                    i18 = i17 + 1;
                    i17 = i18;
                } else {
                    i17++;
                }
            }
            if (!arrayList3.subList(i18, i17).isEmpty()) {
                ArrayList arrayListY2 = aVar.y(arrayList3.subList(i18, i17), arrayList4.subList(i18, i17));
                arrayList5.add(arrayListY2.get(0));
                arrayList5.add(arrayListY2.get(1));
            }
        } else {
            ArrayList arrayListY3 = aVar.y(arrayList3, arrayList4);
            arrayList5.add(arrayListY3.get(0));
            arrayList5.add(arrayListY3.get(1));
        }
        arrayList7.addAll(arrayList6);
        arrayList7.addAll(arrayList5);
        return arrayList7;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(z31.b bVar) {
        z31.b bVar2 = bVar;
        if (bVar2 != null) {
            return Integer.valueOf(bVar2.f202145g);
        }
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(z31.b bVar) {
        return false;
    }

    @Override // qz.c
    public final float e(z31.b bVar) {
        Float f14;
        z31.b bVar2 = bVar;
        return ((bVar2 == null || (f14 = bVar2.f202141c) == null) ? 0.0f : f14.floatValue()) - 0.07f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(z31.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(z31.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float i(z31.b bVar) {
        Float f14;
        z31.b bVar2 = bVar;
        if (bVar2 == null || (f14 = bVar2.f202139a) == null) {
            return 110.0f;
        }
        return f14.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(z31.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(z31.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(z31.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(z31.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float q(z31.b bVar) {
        Float f14;
        z31.b bVar2 = bVar;
        return ((bVar2 == null || (f14 = bVar2.f202142d) == null) ? 6.0f : f14.floatValue() - 1) + 0.07f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(z31.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float t(z31.b bVar) {
        Float f14;
        z31.b bVar2 = bVar;
        if (bVar2 == null || (f14 = bVar2.f202140b) == null) {
            return 0.0f;
        }
        return f14.floatValue();
    }

    @Override // qz.c
    public final List u(z31.b bVar) {
        xz.f fVar;
        ArrayList arrayList = new ArrayList();
        Set<t31.c> setF1 = h0.f1(h0.N0(this.f952b, new a41.b()));
        this.f952b = setF1;
        Iterator<T> it = setF1.iterator();
        while (it.hasNext()) {
            int i14 = b.f960a[((t31.c) it.next()).ordinal()];
            Context context = this.f951a;
            switch (i14) {
                case 1:
                    String string = context.getString(R.string.ohrv_summary_status_balanced);
                    string.getClass();
                    fVar = new xz.f(string, this.f953c, null, null, null, null, null, 124, null);
                    break;
                case 2:
                    String string2 = context.getString(R.string.ohrv_summary_status_unbalanced);
                    string2.getClass();
                    fVar = new xz.f(string2, this.f954d, null, null, null, null, null, 124, null);
                    break;
                case 3:
                    String string3 = context.getString(R.string.gcm_body_battery_lbl_low);
                    string3.getClass();
                    fVar = new xz.f(string3, this.f955e, null, null, null, null, null, 124, null);
                    break;
                case 4:
                    String string4 = context.getString(R.string.ohrv_summary_status_poor);
                    string4.getClass();
                    fVar = new xz.f(string4, this.f956f, null, null, null, null, null, 124, null);
                    break;
                case 5:
                    String string5 = context.getString(R.string.ohrv_summary_status_no_status);
                    string5.getClass();
                    fVar = new xz.f(string5, this.f957g, null, null, null, null, null, 124, null);
                    break;
                case 6:
                    String string6 = context.getString(R.string.ohrv_baseline);
                    string6.getClass();
                    fVar = new xz.f(string6, null, Integer.valueOf(this.f958h), null, g.a.f192745a, null, null, 106, null);
                    break;
                case 7:
                    String string7 = context.getString(R.string.overnight_avg);
                    string7.getClass();
                    fVar = new xz.f(string7, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_hrv_overnight_average_data_set)), null, new g.c(2, 0.0f, 2, null), null, null, 106, null);
                    break;
                default:
                    u0.r();
                    return null;
            }
            arrayList.add(fVar);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(z31.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(z31.b bVar) {
        return 0.0f;
    }

    public final ArrayList y(List list, List list2) {
        LineDataSet lineDataSet = new LineDataSet(list, "BASELINE_DATA_SET");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setFillAlpha(178);
        int i14 = this.f958h;
        lineDataSet.setFillColor(i14);
        lineDataSet.setColor(i14);
        int i15 = this.f959i;
        lineDataSet.setHighLightColor(i15);
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setLineWidth(0.5f);
        LineDataSet lineDataSet2 = new LineDataSet(list2, "");
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setDrawCircleHole(false);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setFillAlpha(178);
        lineDataSet2.setFillColor(i14);
        lineDataSet2.setDrawFilled(true);
        lineDataSet2.setFillFormatter(new yz.a(lineDataSet));
        lineDataSet2.setDrawHorizontalHighlightIndicator(false);
        lineDataSet2.setHighLightColor(i15);
        lineDataSet2.setHighlightLineWidth(2.0f);
        lineDataSet2.setColor(i14);
        lineDataSet2.setLineWidth(0.5f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineDataSet);
        arrayList.add(lineDataSet2);
        return arrayList;
    }

    /* JADX INFO: renamed from: a41.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La41/a$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_OFFSET", "F", "", "BASELINE_OPACITY", "I", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0010a {
        public /* synthetic */ C0010a(j jVar) {
            this();
        }

        private C0010a() {
        }
    }
}
