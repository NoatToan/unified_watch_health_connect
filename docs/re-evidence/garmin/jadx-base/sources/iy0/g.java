package iy0;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zz.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Liy0/g;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f95795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.e f95796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f95797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zz.g f95798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zz.p f95799e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<MotionEvent, Unit> {
        public b(Object obj) {
            super(1, obj, pz.d.class, "toggleDoubleHighlight", "toggleDoubleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.g((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f95795a = barLineChartBase;
        Context context = barLineChartBase.getContext();
        this.f95796b = new b00.e(barLineChartBase, new b(barLineChartBase), null, 4, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f95797c = new v(viewPortHandler, 0.0f, 2, null);
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        gl.c.f77766a.getClass();
        paint.setColor(f0.j(gl.c.f77767b.f77769a));
        paint.setAlpha(128);
        paint.setPathEffect(null);
        Unit unit = Unit.INSTANCE;
        this.f95798d = new zz.g(viewPortHandler2, paint);
        context.getClass();
        this.f95799e = new zz.p(context);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f95799e;
    }

    @Override // qz.e
    public final zz.j c() {
        return this.f95797c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(pz.d.a(this.f95795a, highlight.getX()));
        return entry;
    }

    @Override // qz.e
    public final zz.k e() {
        return this.f95798d;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f95796b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liy0/g$a;", "", "<init>", "()V", "", "HIGHLIGHT_OVERLAY_ALPHA", "I", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
