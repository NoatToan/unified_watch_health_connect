package b71;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import androidx.room.w0;
import c22.l3;
import c53.b0;
import c53.c0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lb71/j;", "Lqz/c;", "La71/e;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "La71/i;", "formatter", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;La71/i;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements qz.c<a71.e, ILineDataSet> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f16342m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f16343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f16344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a71.i f16345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xz.f f16346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xz.f f16347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f16353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o13.p<Float, Float> f16354l;

    public j(Context context, LocalDate localDate, LocalDate localDate2, a71.i iVar) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        iVar.getClass();
        this.f16343a = localDate;
        this.f16344b = localDate2;
        this.f16345c = iVar;
        String string = context.getString(R.string.lbl_optimal_range);
        string.getClass();
        xz.g.a aVar = xz.g.a.f192745a;
        this.f16346d = new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.green_10_static)), null, aVar, null, null, 106, null);
        String string2 = context.getString(R.string.load_ratio_title);
        string2.getClass();
        this.f16347e = new xz.f(string2, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_training_load_ratio_color)), null, aVar, null, null, 106, null);
        this.f16348f = context.getColor(R.color.gcm_seven_day_load_chart_gradient_start);
        this.f16349g = context.getColor(R.color.gcm_seven_day_load_chart_gradient_end);
        this.f16350h = a7.b.getColor(context, R.color.gcm_training_load_ratio_color);
        this.f16351i = context.getColor(R.color.gcm_chart_highlight_line);
        this.f16352j = R.drawable.circle_white;
        String string3 = context.getString(R.string.load_ratio_title);
        string3.getClass();
        this.f16353k = string3;
        this.f16354l = new o13.p<>(Float.valueOf(0.0f), Float.valueOf(2.3f));
    }

    public static boolean x(a71.e eVar) {
        List<a71.d> list;
        if (eVar == null || (list = eVar.f1751a) == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!Double.isNaN(((a71.d) it.next()).f1739c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [b71.j] */
    /* JADX WARN: Type inference failed for: r1v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    @Override // qz.c
    public final List<ILineDataSet> a(a71.e eVar) {
        ?? arrayList;
        int i14;
        LineDataSet lineDataSet;
        List<a71.d> list;
        a71.e eVar2 = eVar;
        if (!x(eVar2)) {
            return j0.f134944a;
        }
        ArrayList arrayList2 = new ArrayList();
        if (eVar2 == null || (list = eVar2.f1751a) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Double.isNaN(((a71.d) obj).f1739c)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayListY = y(arrayList);
        LineDataSet lineDataSet2 = null;
        c53.g gVarH = c0.h(new c53.m(new b0(new g0((Iterable) arrayList), new c50.a(1), null)), new w0(29));
        List<o13.p> listC0 = j0.f134944a;
        c53.g.a aVar = new c53.g.a(gVarH);
        while (aVar.hasNext()) {
            o13.p pVar = (o13.p) aVar.next();
            listC0 = (listC0.isEmpty() || !s.g(((a71.d) ((o13.p) h0.m0(listC0)).f128595b).f1742f, ((a71.d) pVar.f128594a).f1742f)) ? h0.C0(listC0, w.c(pVar)) : h0.C0(h0.V(1, listC0), w.c(new o13.p(((o13.p) h0.m0(listC0)).f128594a, pVar.f128595b)));
        }
        ArrayList arrayList3 = new ArrayList(y.r(listC0, 10));
        for (o13.p pVar2 : listC0) {
            pVar2.getClass();
            arrayList3.add(y(x.k(pVar2.f128594a, pVar2.f128595b)));
        }
        ArrayList<ILineDataSet> arrayList4 = new ArrayList(y.r(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i14 = this.f16351i;
            if (!zHasNext) {
                break;
            }
            List list2 = (List) it.next();
            if (list2.isEmpty()) {
                lineDataSet = null;
            } else {
                Entry entry = (Entry) h0.b0(list2);
                Entry entry2 = (Entry) h0.m0(list2);
                lineDataSet = new LineDataSet(x.k(new Entry(entry.getX(), 1.5f, entry.getData()), new Entry(entry2.getX(), 1.5f, entry2.getData())), "");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setColor(0);
                lineDataSet.setHighLightColor(i14);
                lineDataSet.setFillDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f16348f, this.f16349g}));
                lineDataSet.setFillAlpha(255);
                lineDataSet.setFillFormatter(new i(0));
            }
            arrayList4.add(lineDataSet);
        }
        for (ILineDataSet iLineDataSet : arrayList4) {
            if (iLineDataSet != null) {
                arrayList2.add(iLineDataSet);
            }
        }
        if (!arrayListY.isEmpty()) {
            lineDataSet2 = new LineDataSet(arrayListY, "");
            lineDataSet2.setDrawValues(false);
            lineDataSet2.setDrawHorizontalHighlightIndicator(false);
            lineDataSet2.setDrawCircles(true);
            lineDataSet2.setCircleRadius(4.0f);
            lineDataSet2.setDrawCircleHole(false);
            int i15 = this.f16350h;
            lineDataSet2.setCircleColor(i15);
            lineDataSet2.setColor(i15);
            lineDataSet2.setHighLightColor(i14);
            lineDataSet2.setLineWidth(2.0f);
        }
        if (lineDataSet2 != null) {
            arrayList2.add(lineDataSet2);
        }
        return arrayList2;
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
        return this.f16354l.f128595b.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(a71.e eVar) {
        return 4;
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
        return Days.daysBetween(this.f16343a, this.f16344b).getDays();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final float t(a71.e eVar) {
        return this.f16354l.f128594a.floatValue();
    }

    @Override // qz.c
    public final List u(a71.e eVar) {
        List<a71.d> list;
        a71.e eVar2 = eVar;
        boolean zX = x(eVar2);
        boolean z14 = false;
        if (eVar2 != null && (list = eVar2.f1751a) != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((a71.d) it.next()).f1746j) {
                    z14 = true;
                    break;
                }
            }
        }
        if (!zX) {
            return j0.f134944a;
        }
        xz.f fVar = this.f16347e;
        return !z14 ? w.c(fVar) : x.k(this.f16346d, fVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(a71.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(a71.e eVar) {
        return 0.0f;
    }

    public final ArrayList y(List list) {
        String str;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a71.d dVar = (a71.d) it.next();
            LocalDate localDate = dVar.f1742f.toLocalDate();
            float f14 = (float) dVar.f1739c;
            localDate.getClass();
            float days = Days.daysBetween(this.f16343a, localDate).getDays();
            float f15 = f14 >= 2.0f ? 2.29f : f14;
            a71.i iVar = this.f16345c;
            String strD = iVar.f1774a.d(localDate, qi0.a.NUMERIC_YEAR_MONTH_DAY);
            String str2 = l3.f23126d.format(Float.valueOf(f14));
            str2.getClass();
            if (f14 < 0.8f) {
                str = iVar.f1775b;
            } else if (f14 < 0.8f || f14 >= 1.5f) {
                str = (f14 < 1.5f || f14 >= 2.0f) ? iVar.f1778e : iVar.f1777d;
            } else {
                str = iVar.f1776c;
            }
            arrayList.add(new Entry(days, f15, new zz.l(strD, str2, str, this.f16353k, null, null, Integer.valueOf(this.f16352j), null, SyslogConstants.LOG_LOCAL6, null)));
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lb71/j$a;", "", "<init>", "()V", "", "MIN_LOAD_RATIO", "F", "", "NO_OF_INTERVALS", "I", "Y_AXIS_MAX_LOAD_RATIO", "Y_AXIS_ACTUAL_MAX_LOAD_RATIO_VALUE", "DATAPOINT_CIRCLE_RADIUS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
