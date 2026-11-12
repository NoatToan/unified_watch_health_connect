package sl1;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lsl1/j;", "Luz/d;", "Lrl1/j;", "Lrl1/i;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "chartType", "Luz/e;", "rendererConfigFactory", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lrl1/j;Luz/e;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends uz.d<rl1.j, rl1.i> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f159994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f159995k;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"sl1/j$b", "Lqz/h;", "Ld00/a;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements qz.h<d00.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h00.b f159996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i00.b f159997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final tl1.a f159998c;

        public b(j jVar, CustomCombinedChart customCombinedChart) {
            this.f159996a = jVar.f173482e.getF159999a();
            this.f159997b = jVar.f173482e.getF160000b();
            tl1.a aVar = new tl1.a(customCombinedChart, customCombinedChart.getAnimator(), customCombinedChart.getViewPortHandler());
            aVar.f56990b = 1.0f;
            this.f159998c = aVar;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final h00.b getF159999a() {
            return this.f159996a;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: c */
        public final DataRenderer getF173486i() {
            return this.f159998c;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public final i00.b getF160000b() {
            return this.f159997b;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"sl1/j$c", "Lqz/h;", "Lf00/c;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements qz.h<f00.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h00.b f159999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i00.b f160000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f00.d f160001c;

        public c(j jVar, CustomCombinedChart customCombinedChart) {
            this.f159999a = jVar.f173482e.getF159999a();
            this.f160000b = jVar.f173482e.getF160000b();
            ChartAnimator animator = customCombinedChart.getAnimator();
            animator.getClass();
            ViewPortHandler viewPortHandler = customCombinedChart.getViewPortHandler();
            viewPortHandler.getClass();
            this.f160001c = new f00.d(customCombinedChart, animator, viewPortHandler);
        }

        @Override // qz.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final h00.b getF159999a() {
            return this.f159999a;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: c */
        public final DataRenderer getF173486i() {
            return this.f160001c;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public final i00.b getF160000b() {
            return this.f160000b;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CustomCombinedChart customCombinedChart, rl1.j jVar, uz.e<rl1.j, rl1.i> eVar) {
        super(customCombinedChart, jVar, eVar);
        customCombinedChart.getClass();
        jVar.getClass();
        eVar.getClass();
        this.f159994j = new c(this, customCombinedChart);
        this.f159995k = new b(this, customCombinedChart);
    }

    @Override // uz.d, sz.b
    public final qz.h<d00.a> e() {
        return this.f159995k;
    }

    @Override // uz.d, sz.b
    public final qz.h<f00.c> g() {
        return this.f159994j;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsl1/j$a;", "", "<init>", "()V", "", "BAR_CHART_BAR_WIDTH_PERCENT", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
