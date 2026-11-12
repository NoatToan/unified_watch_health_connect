package es0;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Les0/i;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements qz.h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es0.a f65204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i00.d f65205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.c f65206c;

    static {
        new a(null);
    }

    public i(LineChart lineChart) {
        lineChart.getClass();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        es0.a aVar = new es0.a(lineChart, transformer);
        aVar.f80603g = true;
        aVar.f80605i = 10.0f;
        this.f65204a = aVar;
        viewPortHandler.getClass();
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.getClass();
        this.f65205b = new i00.d(viewPortHandler, axisLeft, transformer);
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.c cVar = new f00.c(lineChart, animator, viewPortHandler);
        cVar.f67652c = Paint.Cap.ROUND;
        this.f65206c = cVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f65204a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f65206c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f65205b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Les0/i$a;", "", "<init>", "()V", "", "X_AXIS_Y_OFFSET", "F", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
