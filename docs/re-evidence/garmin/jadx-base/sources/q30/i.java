package q30;

import am.x0;
import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e23.l;
import java.text.DecimalFormat;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.w;
import p13.x;
import zz.j;
import zz.k;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lq30/i;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f142394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f142395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m00.a f142396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3 f142397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b00.e f142398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f142399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zz.g f142400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f142401h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<MotionEvent, Unit> {
        public b(Object obj) {
            super(1, obj, pz.d.class, "toggleDoubleHighlight", "toggleDoubleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.g((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public i(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f142394a = barLineChartBase;
        Context context = barLineChartBase.getContext();
        this.f142395b = context;
        context.getClass();
        this.f142396c = new m00.a(context, null, 2, null);
        m3 m3VarB = ar.b.b(x0.f4312o, null);
        m3VarB.getClass();
        this.f142397d = m3VarB;
        this.f142398e = new b00.e(barLineChartBase, new b(barLineChartBase), null, 4, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f142399f = new v(viewPortHandler, 0.0f, 2, null);
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a7.b.getColor(context, R.color.white));
        paint.setAlpha(128);
        paint.setPathEffect(null);
        Unit unit = Unit.INSTANCE;
        this.f142400g = new zz.g(viewPortHandler2, paint);
        this.f142401h = new u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f142401h;
    }

    @Override // qz.e
    public final j c() {
        return this.f142399f;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Object data = ((BarLineScatterCandleBubbleData) this.f142394a.getData()).getEntryForHighlight(highlight).getData();
        data.getClass();
        r30.c cVar = (r30.c) data;
        double d14 = cVar.f149984b;
        if (!zf.b.D(Double.valueOf(cVar.f149983a)) || !zf.b.D(Double.valueOf(d14))) {
            return new Entry();
        }
        m3 m3VarB = ar.b.b(x0.f4312o, null);
        m3VarB.getClass();
        l3.a aVar = l3.f23124b;
        double d15 = cVar.f149983a;
        DecimalFormat decimalFormat = l3.f23126d;
        aVar.getClass();
        String strP = l3.a.P(this.f142395b, d15, m3VarB, decimalFormat, true, null);
        String strA = this.f142396c.a(Double.valueOf(d14), true);
        Entry entry = new Entry();
        entry.setData(w.c(new zz.l(strP, strA, this.f142395b.getString(R.string.activity_details_elevation), null, null, Integer.valueOf(R.color.palette_swagger_2), null, null, 216, null)));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return this.f142400g;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f */
    public final b00.b getF179435c() {
        return this.f142398e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.e
    public final Entry g(Highlight[] highlightArr) {
        highlightArr.getClass();
        if (highlightArr.length != 2) {
            return new Entry();
        }
        float x14 = highlightArr[0].getX();
        float x15 = highlightArr[1].getX();
        BarLineChartBase<?> barLineChartBase = this.f142394a;
        List listK = x14 < x15 ? x.k(((BarLineScatterCandleBubbleData) barLineChartBase.getData()).getEntryForHighlight(highlightArr[0]), ((BarLineScatterCandleBubbleData) barLineChartBase.getData()).getEntryForHighlight(highlightArr[1])) : x.k(((BarLineScatterCandleBubbleData) barLineChartBase.getData()).getEntryForHighlight(highlightArr[1]), ((BarLineScatterCandleBubbleData) barLineChartBase.getData()).getEntryForHighlight(highlightArr[0]));
        Entry entry = (Entry) listK.get(0);
        Entry entry2 = (Entry) listK.get(1);
        Object data = entry.getData();
        data.getClass();
        Object data2 = entry2.getData();
        data2.getClass();
        List listK2 = x.k(data, data2);
        r30.c cVar = (r30.c) listK2.get(0);
        r30.c cVar2 = (r30.c) listK2.get(1);
        double d14 = cVar.f149983a;
        double d15 = cVar.f149984b;
        if (zf.b.D(Double.valueOf(d14)) && zf.b.D(Double.valueOf(d15))) {
            double d16 = cVar2.f149983a;
            double d17 = cVar2.f149984b;
            if (zf.b.D(Double.valueOf(d16)) && zf.b.D(Double.valueOf(d17))) {
                com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
                double d18 = cVar.f149983a;
                double d19 = cVar2.f149983a;
                companion.getClass();
                double dAbs = Double.NaN;
                if (!Double.isNaN(d15) && !Double.isNaN(d17) && !Double.isNaN(d18) && !Double.isNaN(d19)) {
                    double dAbs2 = Math.abs(d18 - d19);
                    if (dAbs2 != 0.0d) {
                        dAbs = (Math.abs(d15 - d17) / dAbs2) * ((double) 100);
                    }
                }
                if (!zf.b.D(Double.valueOf(dAbs))) {
                    return new Entry();
                }
                l3.a aVar = l3.f23124b;
                double d24 = cVar.f149983a;
                DecimalFormat decimalFormat = l3.f23126d;
                aVar.getClass();
                String strO = l3.a.O(this.f142395b, d24, this.f142397d, decimalFormat, false);
                String strO2 = l3.a.O(this.f142395b, cVar2.f149983a, this.f142397d, l3.f23126d, false);
                int i14 = this.f142397d.f23164e;
                Context context = this.f142395b;
                String string = context.getString(i14);
                string.getClass();
                String str = strO + " - " + strO2 + StringUtils.SPACE + string;
                String strA = this.f142396c.a(Double.valueOf(Math.abs(d15 - d17)), true);
                String string2 = context.getString(R.string.grade_percent, l3.f23130h.format(dAbs));
                string2.getClass();
                Entry entry3 = new Entry();
                entry3.setData(x.k(new zz.l(str, strA, context.getString(R.string.lbl_delta_elevation), null, null, null, null, null, 248, null), new zz.l(str, string2, context.getString(R.string.lbl_avg_grade), null, null, null, null, null, 248, null)));
                return entry3;
            }
        }
        return new Entry();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq30/i$a;", "", "<init>", "()V", "", "HIGHLIGHT_OVERLAY_ALPHA", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
