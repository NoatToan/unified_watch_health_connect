package at0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e32.o;
import p005kotlin.Metadata;
import qz.g;
import yz.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lat0/b;", "Lqz/g;", "Lf00/c;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "", "intervalType", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;I)V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements g<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.e f12735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bt0.a f12736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bt0.a f12737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f00.c f12738d;

    static {
        new a(null);
    }

    public b(CustomLineChart customLineChart, int i14) {
        customLineChart.getClass();
        int color = a7.b.getColor(customLineChart.getContext(), R.color.palette_ruby_2);
        int color2 = a7.b.getColor(customLineChart.getContext(), R.color.palette_delta_2);
        ViewPortHandler viewPortHandler = customLineChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customLineChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        Transformer transformer2 = customLineChart.getTransformer(YAxis.AxisDependency.RIGHT);
        transformer2.getClass();
        Integer num = o.f62808k.f62822d;
        boolean z14 = num != null && i14 == num.intValue();
        XAxis xAxis = customLineChart.getXAxis();
        xAxis.getClass();
        h00.e eVar = new h00.e(viewPortHandler, xAxis, transformer, z14 ? pz.a.LARGE_LIMIT_DOT_PATTERN : pz.a.ALL_LARGE_DOT_PATTERN, pz.b.DEFAULT_LABEL_PATTERN, z14);
        eVar.f80604h = z14 ? 0.0f : 270.0f;
        eVar.f80605i = 24.0f;
        this.f12735a = eVar;
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.getClass();
        bt0.a aVar = new bt0.a(viewPortHandler, axisLeft, transformer, color);
        aVar.f86715e = 6;
        aVar.f86716f = false;
        aVar.f86711a = false;
        this.f12736b = aVar;
        YAxis axisRight = customLineChart.getAxisRight();
        axisRight.getClass();
        bt0.a aVar2 = new bt0.a(viewPortHandler, axisRight, transformer2, color2);
        aVar2.f86715e = 6;
        aVar2.f86716f = false;
        aVar2.f86711a = false;
        aVar2.f86714d = new j();
        this.f12737c = aVar2;
        ChartAnimator animator = customLineChart.getAnimator();
        animator.getClass();
        f00.c cVar = new f00.c(customLineChart, animator, viewPortHandler);
        cVar.f67653d = Float.valueOf(0.0f);
        cVar.f67654e = Float.valueOf(20.0f);
        this.f12738d = cVar;
    }

    @Override // qz.g
    /* JADX INFO: renamed from: a */
    public final i00.b getF21078f() {
        return this.f12737c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF157069d() {
        return this.f12735a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f12738d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF157070e() {
        return this.f12736b;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lat0/b$a;", "", "<init>", "()V", "", "CHART_EXTRA_BOTTOM_OFFSET", "F", "DEFAULT_Y_OFFSET", "", "NUMBER_Y_AXIS_LABELS", "I", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
