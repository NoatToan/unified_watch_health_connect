package qm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.highlight.BarHighlighter;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lqm/a;", "Lzm/q;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lim/b;", "chartData", "", "fullscreen", "<init>", "(Landroid/content/Context;Lim/b;Z)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements zm.q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f145246i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final im.b f145248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BarChart f145250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public um.a f145251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f145252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BarHighlighter f145253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f145254h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/d1", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f145255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f145256b;

        public b(View view2, a aVar) {
            this.f145255a = view2;
            this.f145256b = aVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            this.f145255a.removeOnAttachStateChangeListener(this);
            BarChart barChartF = this.f145256b.f();
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            barChartF.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm/a$c", "Lcom/github/mikephil/charting/listener/OnChartGestureListener;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements OnChartGestureListener {
        public c() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartDoubleTapped(MotionEvent motionEvent) {
            motionEvent.getClass();
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            motionEvent.getClass();
            chartGesture.getClass();
            a.this.i();
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureStart(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            a aVar = a.this;
            aVar.f().setDrawMarkers(true);
            aVar.f().setHighlightPerDragEnabled(true);
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartLongPressed(MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
            motionEvent.getClass();
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartSingleTapped(MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartTranslate(MotionEvent motionEvent, float f14, float f15) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qm/a$d", "Lum/d;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements um.d {
        public d() {
        }

        @Override // um.d
        public final void a(float f14) {
            a aVar = a.this;
            aVar.f().setDrawMarkers(true);
            aVar.f().highlightValue(f14, 0, 0);
            aVar.j(f14);
        }

        @Override // um.d
        public final void b(float f14, float f15) {
        }
    }

    static {
        new C2740a(null);
    }

    public a(Context context, im.b bVar, boolean z14) {
        context.getClass();
        bVar.getClass();
        this.f145247a = context;
        this.f145248b = bVar;
        this.f145249c = z14;
        this.f145252f = new c();
        this.f145254h = new d();
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f145247a).inflate(R.layout.vertical_bar_chart_view, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.bar_chart_view);
        viewFindViewById.getClass();
        this.f145250d = (BarChart) viewFindViewById;
        boolean z14 = this.f145249c;
        if (z14) {
            BarChart barChartF = f();
            ps2.d dVar = new ps2.d(this, 13);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(barChartF, dVar);
            BarChart barChartF2 = f();
            if (barChartF2.isAttachedToWindow()) {
                f().requestApplyInsets();
            } else {
                barChartF2.addOnAttachStateChangeListener(new b(barChartF2, this));
            }
        }
        BarChart barChartF3 = f();
        int i14 = t.f145451a;
        barChartF3.setLayerType(1, null);
        BarChart barChartF4 = f();
        Legend f31342c = barChartF4.getF31342c();
        if (f31342c != null) {
            f31342c.setEnabled(false);
        }
        Description description = new Description();
        description.setText("");
        barChartF4.setDescription(description);
        barChartF4.setTouchEnabled(z14);
        barChartF4.setPinchZoom(false);
        barChartF4.setDrawGridBackground(false);
        if (z14) {
            e(barChartF4);
        }
        l(barChartF4);
        barChartF4.setExtraBottomOffset(20.0f);
        ViewPortHandler viewPortHandler = barChartF4.getViewPortHandler();
        viewPortHandler.getClass();
        XAxis xAxis = barChartF4.getXAxis();
        xAxis.getClass();
        Transformer transformer = barChartF4.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        barChartF4.setXAxisRenderer(new h00.j(viewPortHandler, xAxis, transformer, null, false, null, 56, null));
        XAxis xAxis2 = barChartF4.getXAxis();
        if (xAxis2 != null) {
            m(xAxis2);
        }
        YAxis axisLeft = barChartF4.getAxisLeft();
        if (axisLeft != null) {
            n(axisLeft);
        }
        barChartF4.setRenderer(g(barChartF4));
        YAxis axisRight = barChartF4.getAxisRight();
        if (axisRight != null) {
            o(axisRight);
        }
        k(barChartF4);
        barChartF4.invalidate();
        return viewInflate;
    }

    public abstract void e(BarChart barChart);

    public final BarChart f() {
        BarChart barChart = this.f145250d;
        if (barChart != null) {
            return barChart;
        }
        p005kotlin.jvm.internal.s.m("chart");
        throw null;
    }

    public abstract r0 g(BarChart barChart);

    public final um.a h() {
        um.a aVar = this.f145251e;
        if (aVar != null) {
            return aVar;
        }
        p005kotlin.jvm.internal.s.m("hoverMarkerView");
        throw null;
    }

    public abstract void i();

    public abstract void j(float f14);

    public abstract void k(BarChart barChart);

    public abstract void l(BarChart barChart);

    public abstract void m(XAxis xAxis);

    public abstract void n(YAxis yAxis);

    public abstract void o(YAxis yAxis);

    /* JADX INFO: renamed from: qm.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqm/a$a;", "", "<init>", "()V", "", "BOTTOM_OFFSET", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2740a {
        public /* synthetic */ C2740a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2740a() {
        }
    }

    public /* synthetic */ a(Context context, im.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, bVar, (i14 & 4) != 0 ? false : z14);
    }
}
