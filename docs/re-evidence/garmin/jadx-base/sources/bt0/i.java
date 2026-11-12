package bt0;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lbt0/i;", "Lqz/g;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;)V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i implements qz.g<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineChart f21073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPortHandler f21074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Transformer f21075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer f21076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f21077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i00.b f21078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f00.c f21079g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bt0/i$b", "Li00/b;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.e f21080i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f21080i = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f21080i;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bt0/i$c", "Li00/b;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.e f21081i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f21081i = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f21081i;
        }
    }

    static {
        new a(null);
    }

    public i(LineChart lineChart) {
        lineChart.getClass();
        this.f21073a = lineChart;
        xs0.b bVar = xs0.b.HEART_RATE;
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        viewPortHandler.getClass();
        this.f21074b = viewPortHandler;
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        this.f21075c = transformer;
        Transformer transformer2 = lineChart.getTransformer(YAxis.AxisDependency.RIGHT);
        transformer2.getClass();
        this.f21076d = transformer2;
        b bVar2 = new b(viewPortHandler, lineChart.getAxisLeft(), transformer);
        bVar2.f86717g = 3.0f;
        this.f21077e = bVar2;
        c cVar = new c(viewPortHandler, lineChart.getAxisRight(), transformer2);
        cVar.f86717g = 3.0f;
        this.f21078f = cVar;
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.c cVar2 = new f00.c(lineChart, animator, viewPortHandler);
        cVar2.f67652c = Paint.Cap.ROUND;
        cVar2.f67653d = Float.valueOf(68.0f);
        this.f21079g = cVar2;
    }

    @Override // qz.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public final i00.b getF21078f() {
        return this.f21078f;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f21079g;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f21077e;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbt0/i$a;", "", "<init>", "()V", "", "Y_AXIS_X_OFFSET", "F", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
