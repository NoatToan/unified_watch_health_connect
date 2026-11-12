package zh0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import gs1.l;
import gs1.t;
import gs1.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import yc.l2;
import yz.k;
import zx0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzh0/c;", "Lqz/c;", "Lsh0/d;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyz/k;", "timeFormatter", "Lxh0/c;", "dataFormatter", "<init>", "(Landroid/content/Context;Lyz/k;Lxh0/c;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<sh0.d, ILineDataSet> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f204780l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f204781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f204782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh0.c f204783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f204784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f204785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f204786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f204787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f204788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LayerDrawable f204789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f204790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LineDataSet f204791k;

    static {
        new a(null);
    }

    public c(Context context, k kVar, xh0.c cVar) {
        context.getClass();
        kVar.getClass();
        cVar.getClass();
        this.f204781a = context;
        this.f204782b = kVar;
        this.f204783c = cVar;
        String string = context.getString(R.string.lbl_climbed);
        string.getClass();
        this.f204784d = string;
        String string2 = context.getString(R.string.lbl_descended);
        string2.getClass();
        this.f204785e = string2;
        String string3 = context.getString(R.string.lbl_goal);
        string3.getClass();
        this.f204786f = string3;
        this.f204787g = a7.b.getColor(context, R.color.transparent);
        int color = a7.b.getColor(context, R.color.gcm_surface_1);
        this.f204788h = c7.d.e(color, MathKt.c(Color.alpha(color) * 0.1f));
        Resources resources = context.getResources();
        resources.getClass();
        this.f204789i = r0.a(context, R.drawable.check, R.color.gcm_icon_background_goal_on_chart, R.color.gcm_icon_success, (int) xy2.b.n(resources, 2.0f), R.color.gcm_icon_success, r0.a.SMALL);
    }

    public static float y(sh0.d dVar) {
        t tVar;
        z userDailySummary;
        l payload;
        Double userFloorsAscendedGoal;
        sh0.c.d dVar2;
        Double d14;
        sh0.c.d dVar3;
        Double d15;
        sh0.c cVar;
        List<sh0.c.d> listD = (dVar == null || (cVar = dVar.f159292a) == null) ? null : cVar.d();
        double dMax = Math.max(Math.max((listD == null || (dVar3 = (sh0.c.d) h0.n0(listD)) == null || (d15 = dVar3.f159290c) == null) ? 0.0d : d15.doubleValue(), (listD == null || (dVar2 = (sh0.c.d) h0.n0(listD)) == null || (d14 = dVar2.f159291d) == null) ? 0.0d : d14.doubleValue()), (dVar == null || (tVar = dVar.f159293b) == null || (userDailySummary = tVar.getUserDailySummary()) == null || (payload = userDailySummary.getPayload()) == null || (userFloorsAscendedGoal = payload.getUserFloorsAscendedGoal()) == null) ? 0.0d : userFloorsAscendedGoal.doubleValue());
        if (listD == null || !(!listD.isEmpty()) || dMax <= 0.0d) {
            return 20.0f;
        }
        fz.a.f73959a.getClass();
        return (float) fz.a.h(dMax);
    }

    public static boolean z(Double d14) {
        return (d14 != null ? d14.doubleValue() : -1.0d) >= 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    @Override // qz.c
    public final List<ILineDataSet> a(sh0.d dVar) {
        List<sh0.c.d> listD;
        DateTime dateTimeWithTimeAtStartOfDay;
        k kVar;
        xh0.c cVar;
        Entry entry;
        t tVar;
        z userDailySummary;
        l payload;
        Double userFloorsAscendedGoal;
        sh0.c cVar2;
        sh0.c cVar3;
        sh0.d dVar2 = dVar;
        Number numberValueOf = Float.valueOf(20.0f);
        ArrayList arrayList = new ArrayList();
        if (dVar2 == null || (cVar3 = dVar2.f159292a) == null || (listD = cVar3.d()) == null) {
            listD = j0.f134944a;
        }
        if (dVar2 == null || (cVar2 = dVar2.f159292a) == null) {
            dateTimeWithTimeAtStartOfDay = new DateTime().withTimeAtStartOfDay();
        } else {
            dateTimeWithTimeAtStartOfDay = c22.j0.N(cVar2.f159282a, true);
            if (dateTimeWithTimeAtStartOfDay == null) {
                dateTimeWithTimeAtStartOfDay = DateTime.now();
                dateTimeWithTimeAtStartOfDay.getClass();
            }
        }
        if (!listD.isEmpty()) {
            Number number = ((sh0.c.d) h0.m0(listD)).f159291d;
            if (number == null) {
                number = numberValueOf;
            }
            float fY = y(dVar2);
            dateTimeWithTimeAtStartOfDay.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listD.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                kVar = this.f204782b;
                cVar = this.f204783c;
                if (!zHasNext) {
                    break;
                }
                sh0.c.d dVar3 = (sh0.c.d) it.next();
                DateTime dateTime = dVar3.f159288a;
                Double d14 = dVar3.f159291d;
                float minutes = Minutes.minutesBetween(dateTimeWithTimeAtStartOfDay, dateTime).getMinutes();
                DateTime dateTime2 = dateTimeWithTimeAtStartOfDay;
                arrayList2.add(new Entry(minutes, -((float) Math.abs(d14 != null ? d14.doubleValue() : 0.0d)), new zz.l(kVar.a(minutes), xh0.c.b(d14 != null ? d14.doubleValue() : 0.0d), this.f204785e, cVar.f190980c, null, null, Integer.valueOf(R.drawable.gcm_floors_descended_metric_bullet), null, SyslogConstants.LOG_LOCAL6, null)));
                dateTimeWithTimeAtStartOfDay = dateTime2;
            }
            DateTime dateTime3 = dateTimeWithTimeAtStartOfDay;
            int i14 = 15;
            ArrayList arrayListB = pz.d.b(15, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayListB.iterator();
            while (it3.hasNext()) {
                LineDataSet lineDataSetX = x(R.color.gcm_chart_floors_descended, (List) it3.next());
                e eVar = new e(this, pz.d.c(0.0f, fY, Integer.valueOf(number.intValue())));
                PaintDrawable paintDrawable = new PaintDrawable();
                paintDrawable.setShape(new RectShape());
                paintDrawable.setShaderFactory(eVar);
                lineDataSetX.setFillDrawable(paintDrawable);
                lineDataSetX.setFillFormatter(new l2(28));
                arrayList3.add(lineDataSetX);
            }
            arrayList.addAll(arrayList3);
            int iDoubleValue = (dVar2 == null || (tVar = dVar2.f159293b) == null || (userDailySummary = tVar.getUserDailySummary()) == null || (payload = userDailySummary.getPayload()) == null || (userFloorsAscendedGoal = payload.getUserFloorsAscendedGoal()) == null) ? 0 : (int) userFloorsAscendedGoal.doubleValue();
            Double d15 = ((sh0.c.d) h0.m0(listD)).f159290c;
            if (d15 != null) {
                numberValueOf = d15;
            }
            ArrayList arrayList4 = new ArrayList();
            for (sh0.c.d dVar4 : listD) {
                DateTime dateTime4 = dVar4.f159288a;
                Double d16 = dVar4.f159290c;
                DateTime dateTime5 = dateTime3;
                float minutes2 = Minutes.minutesBetween(dateTime5, dateTime4).getMinutes();
                Entry entry2 = new Entry(minutes2, d16 != null ? (float) d16.doubleValue() : 0.0f, new zz.l(kVar.a(minutes2), xh0.c.b(d16 != null ? d16.doubleValue() : 0.0d), this.f204784d, cVar.f190979b, null, Integer.valueOf(R.color.gcm_chart_floors_climbed), null, null, 208, null));
                if (iDoubleValue < 0) {
                    numberValueOf = numberValueOf;
                } else if ((d16 != null ? d16.doubleValue() : -1.0d) < iDoubleValue || this.f204790j) {
                    numberValueOf = numberValueOf;
                } else {
                    Entry entry3 = (Entry) h0.n0(arrayList4);
                    this.f204790j = true;
                    LayerDrawable layerDrawable = this.f204789i;
                    if (entry3 == null) {
                        entry = new Entry(entry2.getX(), iDoubleValue, (Drawable) layerDrawable);
                    } else {
                        float y14 = entry3.getY();
                        float f14 = iDoubleValue;
                        entry = new Entry(entry3.getX() + (((f14 - y14) * (entry2.getX() - entry3.getX())) / (entry2.getY() - y14)), f14, (Drawable) layerDrawable);
                    }
                    LineDataSet lineDataSet = new LineDataSet(w.c(entry), "");
                    lineDataSet.setDrawValues(false);
                    lineDataSet.setDrawCircleHole(false);
                    lineDataSet.setDrawCircles(false);
                    lineDataSet.setDrawIcons(true);
                    lineDataSet.setHighlightEnabled(false);
                    this.f204791k = lineDataSet;
                }
                arrayList4.add(entry2);
                dateTime3 = dateTime5;
                numberValueOf = numberValueOf;
                i14 = 15;
            }
            Number number2 = numberValueOf;
            ArrayList arrayListB2 = pz.d.b(i14, arrayList4);
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayListB2.iterator();
            while (it4.hasNext()) {
                LineDataSet lineDataSetX2 = x(R.color.gcm_chart_floors_climbed, (List) it4.next());
                d dVar5 = new d(this, pz.d.c(0.0f, fY, Integer.valueOf(number2.intValue())));
                PaintDrawable paintDrawable2 = new PaintDrawable();
                paintDrawable2.setShape(new RectShape());
                paintDrawable2.setShaderFactory(dVar5);
                lineDataSetX2.setFillDrawable(paintDrawable2);
                lineDataSetX2.setFillFormatter(new l2(28));
                arrayList5.add(lineDataSetX2);
            }
            arrayList.addAll(arrayList5);
        }
        LineDataSet lineDataSet2 = this.f204791k;
        if (lineDataSet2 != null) {
            arrayList.add(lineDataSet2);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(sh0.d dVar) {
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(sh0.d dVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(sh0.d dVar) {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    @Override // qz.c
    public final List f(sh0.d dVar) {
        boolean z14;
        Double userFloorsAscendedGoal;
        t tVar;
        z userDailySummary;
        sh0.d dVar2 = dVar;
        l payload = (dVar2 == null || (tVar = dVar2.f159293b) == null || (userDailySummary = tVar.getUserDailySummary()) == null) ? null : userDailySummary.getPayload();
        double dDoubleValue = (payload == null || (userFloorsAscendedGoal = payload.getUserFloorsAscendedGoal()) == null) ? -1.0d : userFloorsAscendedGoal.doubleValue();
        if (z(payload != null ? payload.getFloorsAscended() : null)) {
            z14 = true;
        } else {
            if (z(payload != null ? payload.getFloorsDescended() : null)) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        if (dDoubleValue < 0.0d || !z14) {
            return null;
        }
        LimitLine limitLine = new LimitLine((float) dDoubleValue);
        limitLine.setLineWidth(2.0f);
        limitLine.setLineColor(a7.b.getColor(this.f204781a, R.color.gcm_chart_floors_goal));
        limitLine.enableDashedLine(10.0f, 10.0f, 1.0f);
        return w.c(limitLine);
    }

    @Override // qz.c
    public final List g(sh0.d dVar) {
        sh0.d dVar2 = dVar;
        return m.g(this.f204781a, dVar2 != null ? dVar2.f159293b : null, new z81.b(10));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(sh0.d dVar) {
        return y(dVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(sh0.d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(sh0.d dVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(sh0.d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(sh0.d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(sh0.d dVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(sh0.d dVar) {
        return null;
    }

    @Override // qz.c
    public final float t(sh0.d dVar) {
        return -Math.abs(y(dVar));
    }

    @Override // qz.c
    public final List u(sh0.d dVar) {
        t tVar;
        z userDailySummary;
        sh0.d dVar2 = dVar;
        l payload = (dVar2 == null || (tVar = dVar2.f159293b) == null || (userDailySummary = tVar.getUserDailySummary()) == null) ? null : userDailySummary.getPayload();
        if (!z(payload != null ? payload.getFloorsAscended() : null)) {
            if (!z(payload != null ? payload.getFloorsDescended() : null)) {
                return j0.f134944a;
            }
        }
        Context context = this.f204781a;
        return x.k(new xz.f(this.f204784d, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_floors_climbed)), null, xz.g.a.f192745a, null, null, 106, null), new xz.f(this.f204785e, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_floors_descended)), null, xz.g.d.f192749a, null, null, 106, null), new xz.f(this.f204786f, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_floors_goal)), null, new xz.g.c(0, 0.0f, 3, null), null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(sh0.d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(sh0.d dVar) {
        return 0.0f;
    }

    public final LineDataSet x(int i14, List list) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setMode(LineDataSet.Mode.STEPPED);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        Context context = this.f204781a;
        lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setHighlightEnabled(!list.isEmpty());
        lineDataSet.setColor(a7.b.getColor(context, i14));
        lineDataSet.setLineWidth(2.0f);
        return lineDataSet;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzh0/c$a;", "", "<init>", "()V", "", "CHART_LINE_WIDTH", "F", "CHART_GRID_LINE_WIDTH", "DEFAULT_Y_LABEL_VALUE", "", "MINUTES_BETWEEN_ENTRIES", "I", "Y_AXIS_MIDDLE_VALUE", "", "NO_DATA", "D", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
