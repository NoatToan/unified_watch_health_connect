package za1;

import android.content.Context;
import android.view.MotionEvent;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.x;
import zz.j;
import zz.k;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lza1/f;", "Lqz/e;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomLineChart f203306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.b f203307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f203308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f203309d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<MotionEvent, Unit> {
        public a(Object obj) {
            super(1, obj, pz.d.class, "toggleSingleHighlight", "toggleSingleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.h((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    public f(CustomLineChart customLineChart) {
        CustomLineChart customLineChart2;
        b00.b hVar;
        customLineChart.getClass();
        this.f203306a = customLineChart;
        if (customLineChart.getContext().getResources().getConfiguration().orientation == 2) {
            customLineChart2 = customLineChart;
            hVar = new b00.e(customLineChart2, new a(customLineChart), null, 4, null);
        } else {
            customLineChart2 = customLineChart;
            hVar = new h(customLineChart2);
        }
        this.f203307b = hVar;
        ViewPortHandler viewPortHandler = customLineChart2.getViewPortHandler();
        viewPortHandler.getClass();
        this.f203308c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = customLineChart2.getContext();
        context.getClass();
        this.f203309d = new u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f203309d;
    }

    @Override // qz.e
    public final j c() {
        return this.f203308c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.mikephil.charting.data.ChartData] */
    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Object data = this.f203306a.getData().getEntryForHighlight(highlight).getData();
        data.getClass();
        g gVar = (g) data;
        Entry entry = new Entry();
        String str = gVar.f203310a;
        entry.setData(x.k(new zz.l(str, gVar.f203311b, gVar.f203313d, gVar.f203312c, null, gVar.f203314e, null, null, 208, null), new zz.l(str, gVar.f203315f, gVar.f203317h, gVar.f203316g, null, Integer.valueOf(gVar.f203318i), null, null, 208, null)));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final b00.b getF203307b() {
        return this.f203307b;
    }
}
