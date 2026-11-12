package q30;

import android.content.Context;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lq30/h;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "", "addExtraTopPadding", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Z)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h implements qz.h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q30.a f142391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i00.c f142392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.c f142393c;

    static {
        new a(null);
    }

    public h(LineChart lineChart, boolean z14) {
        lineChart.getClass();
        Context context = lineChart.getContext();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        context.getClass();
        m00.a aVar = new m00.a(context, null, 2, null);
        viewPortHandler.getClass();
        q30.a aVar2 = new q30.a(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        aVar2.f80601e = new m00.d(aVar);
        aVar2.f80603g = true;
        aVar2.f80605i = 8.0f;
        this.f142391a = aVar2;
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.getClass();
        i00.c cVar = new i00.c(viewPortHandler, axisLeft, transformer);
        cVar.f86714d = new m00.e(aVar);
        this.f142392b = cVar;
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        f00.c cVar2 = new f00.c(lineChart, animator, viewPortHandler);
        cVar2.f67652c = Paint.Cap.ROUND;
        cVar2.f67653d = Float.valueOf(z14 ? 68.0f : 0.0f);
        this.f142393c = cVar2;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f142391a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f142392b;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public f00.c c() {
        return this.f142393c;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lq30/h$a;", "", "<init>", "()V", "", "Y_OFFSET", "F", "EXTRA_TOP_OFFSET", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ h(LineChart lineChart, boolean z14, int i14, j jVar) {
        this(lineChart, (i14 & 2) != 0 ? true : z14);
    }
}
