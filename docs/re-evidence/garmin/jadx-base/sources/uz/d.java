package uz;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luz/d;", "ChartType", "OverlayType", "Lsz/b;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "chartType", "Luz/e;", "rendererConfigFactory", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Ljava/lang/Object;Luz/e;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d<ChartType, OverlayType> extends sz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomCombinedChart f173479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChartType f173480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e<ChartType, OverlayType> f173481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h<?> f173482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h<?> f173483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f173484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f173485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c00.a f173486i;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"uz/d$a", "Lqz/h;", "Ld00/a;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements h<d00.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h00.b f173487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i00.b f173488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d00.a f173489c;

        public a(d<ChartType, OverlayType> dVar) {
            this.f173487a = dVar.f173482e.getF69204a();
            this.f173488b = dVar.f173482e.getF101352b();
            CustomCombinedChart customCombinedChart = dVar.f173479b;
            this.f173489c = new d00.a(customCombinedChart, customCombinedChart.getAnimator(), customCombinedChart.getViewPortHandler());
        }

        @Override // qz.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final h00.b getF69204a() {
            return this.f173487a;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: c */
        public final DataRenderer getF142393c() {
            return this.f173489c;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public final i00.b getF101352b() {
            return this.f173488b;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"uz/d$b", "Lqz/h;", "Lf00/c;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements h<f00.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h00.b f173490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i00.b f173491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f00.c f173492c;

        public b(d<ChartType, OverlayType> dVar) {
            this.f173490a = dVar.f173482e.getF69204a();
            this.f173491b = dVar.f173482e.getF101352b();
            CustomCombinedChart customCombinedChart = dVar.f173479b;
            ChartAnimator animator = customCombinedChart.getAnimator();
            animator.getClass();
            ViewPortHandler viewPortHandler = customCombinedChart.getViewPortHandler();
            viewPortHandler.getClass();
            this.f173492c = new f00.c(customCombinedChart, animator, viewPortHandler);
        }

        @Override // qz.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final h00.b getF69204a() {
            return this.f173490a;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: c */
        public final DataRenderer getF142393c() {
            return this.f173492c;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public final i00.b getF101352b() {
            return this.f173491b;
        }
    }

    public d(CustomCombinedChart customCombinedChart, ChartType charttype, e<ChartType, OverlayType> eVar) {
        customCombinedChart.getClass();
        eVar.getClass();
        this.f173479b = customCombinedChart;
        this.f173480c = charttype;
        this.f173481d = eVar;
        this.f173482e = eVar.b(charttype, null);
        YAxis axisRight = customCombinedChart.getAxisRight();
        axisRight.getClass();
        this.f173483f = eVar.a(axisRight, null, null);
        this.f173484g = new b(this);
        this.f173485h = new a(this);
        DataRenderer renderer = customCombinedChart.getRenderer();
        renderer.getClass();
        this.f173486i = (c00.a) renderer;
    }

    @Override // sz.b
    public final i00.b a() {
        h<?> hVar = this.f173483f;
        if (hVar != null) {
            return hVar.getF101352b();
        }
        return null;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF69204a() {
        return this.f173482e.getF69204a();
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f173482e.getF101352b();
    }

    @Override // sz.b
    public h<d00.a> e() {
        return this.f173485h;
    }

    @Override // sz.b
    public h<f00.c> g() {
        return this.f173484g;
    }

    @Override // sz.b
    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g().getF142393c());
        arrayList.add(e().getF142393c());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public c00.a getF142393c() {
        return this.f173486i;
    }
}
