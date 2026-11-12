package d41;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld41/b;", "Ld41/a;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends d41.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f57456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f57457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f00.e f57458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00.b f57459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i00.b f57460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c00.a f57461f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"d41/b$a", "Lf00/e$b$a;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements f00.e.b.a {
        @Override // f00.e.b.a
        public final boolean a(Entry entry, ILineDataSet iLineDataSet) {
            entry.getClass();
            if (!s.g(iLineDataSet.getLabel(), "KEY_OVERNIGHT_AVG_DATA_SET")) {
                return false;
            }
            entry.getY();
            return false;
        }
    }

    public b(CombinedChart combinedChart, DateTime dateTime, DateTime dateTime2) {
        combinedChart.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        d dVar = new d(combinedChart, dateTime, dateTime2);
        this.f57456a = dVar;
        ChartAnimator animator = combinedChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler = combinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        this.f57457b = new e(combinedChart, animator, viewPortHandler);
        ChartAnimator animator2 = combinedChart.getAnimator();
        animator2.getClass();
        ViewPortHandler viewPortHandler2 = combinedChart.getViewPortHandler();
        viewPortHandler2.getClass();
        this.f57458c = new f00.e(combinedChart, animator2, viewPortHandler2, false, new a(), 8, null);
        this.f57459d = dVar.f57465c;
        this.f57460e = dVar.f57466d;
        DataRenderer renderer = combinedChart.getRenderer();
        renderer.getClass();
        this.f57461f = (c00.a) renderer;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.b getF57459d() {
        return this.f57459d;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f57461f;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i00.b getF57460e() {
        return this.f57460e;
    }

    @Override // d41.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getF57457b() {
        return this.f57457b;
    }

    @Override // d41.a
    public final h<f00.c> f() {
        return this.f57456a;
    }

    @Override // d41.a
    /* JADX INFO: renamed from: g, reason: from getter */
    public final f00.e getF57458c() {
        return this.f57458c;
    }
}
