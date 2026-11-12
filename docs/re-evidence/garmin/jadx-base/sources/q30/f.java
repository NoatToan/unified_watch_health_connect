package q30;

import am.x0;
import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;
import p005kotlin.Metadata;
import p13.w;
import zz.j;
import zz.k;
import zz.l;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq30/f;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f142384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f142385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m00.a f142386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b00.h f142387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f142388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f142389f;

    public f(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f142384a = barLineChartBase;
        Context context = barLineChartBase.getContext();
        this.f142385b = context;
        context.getClass();
        this.f142386c = new m00.a(context, null, 2, null);
        this.f142387d = new b00.h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f142388e = new v(viewPortHandler, 0.0f, 2, null);
        Context context2 = barLineChartBase.getContext();
        context2.getClass();
        this.f142389f = new u(context2, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f142389f;
    }

    @Override // qz.e
    public final j c() {
        return this.f142388e;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Object data = ((BarLineScatterCandleBubbleData) this.f142384a.getData()).getEntryForHighlight(highlight).getData();
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
        String strP = l3.a.P(this.f142385b, d15, m3VarB, decimalFormat, true, null);
        String strA = this.f142386c.a(Double.valueOf(d14), true);
        Entry entry = new Entry();
        entry.setData(w.c(new l(strP, strA, this.f142385b.getString(R.string.activity_details_elevation), null, null, Integer.valueOf(R.color.palette_swagger_2), null, null, 216, null)));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f */
    public final b00.b getF179435c() {
        return this.f142387d;
    }
}
