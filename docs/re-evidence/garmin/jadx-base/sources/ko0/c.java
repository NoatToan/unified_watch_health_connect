package ko0;

import android.content.Context;
import b00.h;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p13.h0;
import zz.j;
import zz.k;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lko0/c;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f105757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f105758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f105759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f105760d;

    public c(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f105757a = barLineChartBase;
        this.f105758b = new h(barLineChartBase, null, null, 6, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f105759c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f105760d = new u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f105760d;
    }

    @Override // qz.e
    public final j c() {
        return this.f105759c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(h0.G0(pz.d.a(this.f105757a, highlight.getX())));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f105758b;
    }
}
