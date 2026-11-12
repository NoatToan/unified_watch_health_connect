package gt;

import android.content.Context;
import android.text.format.DateFormat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;
import yz.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgt/g;", "Lqz/h;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "barDataProvider", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.h f78916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i00.e f78917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.a f78918c;

    static {
        new a(null);
    }

    public g(BarLineChartBase<?> barLineChartBase, BarDataProvider barDataProvider) {
        barLineChartBase.getClass();
        barDataProvider.getClass();
        Context context = barLineChartBase.getContext();
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        Transformer transformer = barLineChartBase.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.h hVar = new h00.h(viewPortHandler, xAxis, transformer);
        hVar.f80601e = new k(DateFormat.is24HourFormat(context));
        hVar.f80603g = true;
        this.f78916a = hVar;
        YAxis axisLeft = barLineChartBase.getAxisLeft();
        axisLeft.getClass();
        this.f78917b = new i00.e(viewPortHandler, axisLeft, transformer);
        d00.a aVar = new d00.a(barDataProvider, barLineChartBase.getAnimator(), barLineChartBase.getViewPortHandler());
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        aVar.f56992d = new c00.c(viewPortHandler2);
        aVar.f56990b = 3.0f;
        this.f78918c = aVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF69204a() {
        return this.f78916a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f78918c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f78917b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgt/g$a;", "", "<init>", "()V", "", "BAR_WIDTH_PERCENT_DAILY", "F", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
