package jw0;

import b63.o;
import b63.p;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g22.l;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB1\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ljw0/d;", "Lqz/h;", "Ld00/a;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "barDataProvider", "Lj23/g;", "Lb63/o;", "dateInterval", "", "isDaily", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lj23/g;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j23.g<o> f101338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPortHandler f101340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer f101341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h00.c f101342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f101343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d00.e f101344g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jw0/d$b", "Li00/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.e f101345i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f101345i = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: d */
        public final boolean getF160005j() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f101345i;
        }
    }

    static {
        new a(null);
    }

    public d(BarLineChartBase<?> barLineChartBase, BarDataProvider barDataProvider, j23.g<o> gVar, boolean z14) {
        barLineChartBase.getClass();
        barDataProvider.getClass();
        gVar.getClass();
        this.f101338a = gVar;
        this.f101339b = z14;
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        this.f101340c = viewPortHandler;
        Transformer transformer = barLineChartBase.getTransformer(YAxis.AxisDependency.LEFT);
        this.f101341d = transformer;
        viewPortHandler.getClass();
        XAxis xAxis = barLineChartBase.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        h00.c cVar = new h00.c(viewPortHandler, xAxis, transformer);
        int iA = p.a((o) gVar.getStart(), (o) gVar.b());
        int i14 = (z14 ? iA : iA / 7) + 1;
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add("");
        }
        j0 j0Var = j0.f23099a;
        LocalDate localDateH = l.h((o) this.f101338a.getStart());
        j0Var.getClass();
        arrayList.set(0, j0.l(localDateH));
        arrayList.set(arrayList.size() - 1, j0.l(l.h((o) this.f101338a.b())));
        cVar.f80601e = new IndexAxisValueFormatter(arrayList);
        cVar.f80601e = new IndexAxisValueFormatter(arrayList);
        cVar.f80602f = i14;
        this.f101342e = cVar;
        this.f101343f = new b(this.f101340c, barLineChartBase.getAxisLeft(), this.f101341d);
        ChartAnimator animator = barLineChartBase.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        d00.e eVar = new d00.e(barDataProvider, animator, viewPortHandler2, true, Integer.valueOf(barLineChartBase.getContext().getColor(R.color.gcm_background_hero)));
        eVar.f56990b = this.f101339b ? 0.75f : 0.33f;
        this.f101344g = eVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f101342e;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f101344g;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f101343f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljw0/d$a;", "", "<init>", "()V", "", "BAR_WIDTH_PERCENT_DAILY", "F", "BAR_WIDTH_PERCENT_WEEKLY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
