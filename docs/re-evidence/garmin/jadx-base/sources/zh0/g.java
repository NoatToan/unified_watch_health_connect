package zh0;

import android.content.Context;
import android.graphics.Paint;
import android.text.format.DateFormat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;
import yz.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lzh0/g;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh0.c f204797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h00.h f204798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f204799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f00.c f204800d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zh0/g$b", "Li00/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f204801i;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zh0/g$b$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends ValueFormatter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f204802a;

            public a(g gVar) {
                this.f204802a = gVar;
            }

            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                xh0.c cVar = this.f204802a.f204797a;
                double dAbs = Math.abs(f14);
                cVar.getClass();
                return xh0.c.b(dAbs);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f204801i = new a(gVar);
        }

        @Override // i00.b
        /* JADX INFO: renamed from: d */
        public final boolean getF160005j() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f204801i;
        }
    }

    static {
        new a(null);
    }

    public g(LineChart lineChart) {
        lineChart.getClass();
        Context context = lineChart.getContext();
        context.getClass();
        this.f204797a = new xh0.c(context);
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        h00.h hVar = new h00.h(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        hVar.f80601e = new k(DateFormat.is24HourFormat(context));
        hVar.f80603g = true;
        hVar.f80605i = 8.0f;
        this.f204798b = hVar;
        this.f204799c = new b(this, viewPortHandler, lineChart.getAxisLeft(), transformer);
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.c cVar = new f00.c(lineChart, animator, viewPortHandler);
        cVar.f67652c = Paint.Cap.ROUND;
        this.f204800d = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF157069d() {
        return this.f204798b;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f204800d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF157070e() {
        return this.f204799c;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzh0/g$a;", "", "<init>", "()V", "", "X_AXIS_Y_OFFSET", "F", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
