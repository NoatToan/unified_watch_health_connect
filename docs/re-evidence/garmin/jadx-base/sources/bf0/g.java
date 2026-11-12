package bf0;

import android.content.Context;
import b21.s4;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zz.j;
import zz.k;
import zz.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbf0/g;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lkotlin/Function0;", "", "onChartInteraction", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Le23/a;)V", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f17817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f17818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b00.h f17819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f17820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f17821e;

    public g(BarLineChartBase<?> barLineChartBase, e23.a<Unit> aVar) {
        barLineChartBase.getClass();
        this.f17817a = barLineChartBase;
        this.f17818b = aVar;
        this.f17819c = new b00.h(barLineChartBase, new s4(this, 14), null, 4, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f17820d = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f17821e = new b(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f17821e;
    }

    @Override // qz.e
    public final j c() {
        return this.f17820d;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        return xy2.b.x(highlight, this.f17817a);
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f */
    public final b00.b getF203307b() {
        return this.f17819c;
    }

    public /* synthetic */ g(BarLineChartBase barLineChartBase, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(barLineChartBase, (i14 & 2) != 0 ? null : aVar);
    }
}
