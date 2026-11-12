package vp;

import android.content.Context;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.ScatterChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lvp/d;", "Lsz/b;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "Lmp/k;", "metric", "", "intervalType", "", "isUsingMetric", "isNotStatuteUS", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lorg/joda/time/LocalDate;Lmp/k;IZZ)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends sz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f179273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vp.b f179274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f179275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h00.b f179276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i00.b f179277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f179278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c00.a f179279h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/d$b", "Li00/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f179280i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f179281j;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp/d$b$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends ValueFormatter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mp.k f179282a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedChart f179283b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f179284c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f179285d;

            public a(mp.k kVar, CombinedChart combinedChart, boolean z14, boolean z15) {
                this.f179282a = kVar;
                this.f179283b = combinedChart;
                this.f179284c = z14;
                this.f179285d = z15;
            }

            @Override // com.github.mikephil.charting.formatter.ValueFormatter
            public final String getFormattedValue(float f14) {
                mp.k kVar = mp.k.PACK_WEIGHT;
                mp.k kVar2 = this.f179282a;
                if (kVar2 == kVar) {
                    kVar2 = mp.k.PACE;
                }
                Context context = this.f179283b.getContext();
                context.getClass();
                return wp.a.b(context, Double.valueOf(f14), kVar2, null, this.f179284c, this.f179285d, 8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mp.k kVar, CombinedChart combinedChart, boolean z14, boolean z15, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f179280i = true;
            this.f179281j = new a(kVar, combinedChart, z14, z15);
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF179280i() {
            return this.f179280i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f179281j;
        }

        @Override // i00.b
        public final void g() {
            this.f179280i = false;
        }
    }

    static {
        new a(null);
    }

    public d(CombinedChart combinedChart, LocalDate localDate, mp.k kVar, int i14, boolean z14, boolean z15) {
        combinedChart.getClass();
        localDate.getClass();
        kVar.getClass();
        f fVar = new f(combinedChart, localDate, i14);
        this.f179273b = fVar;
        vp.b bVar = new vp.b(combinedChart, kVar, localDate, i14, 0.35f, z14, z15);
        this.f179274c = bVar;
        this.f179275d = new g(combinedChart, localDate, i14);
        this.f179276e = fVar.getF179276e();
        this.f179277f = bVar.f179258i;
        this.f179278g = new b(kVar, combinedChart, z14, z15, combinedChart.getViewPortHandler(), combinedChart.getAxisRight(), combinedChart.getTransformer(YAxis.AxisDependency.RIGHT));
        DataRenderer renderer = combinedChart.getRenderer();
        renderer.getClass();
        this.f179279h = (c00.a) renderer;
    }

    @Override // sz.b
    /* JADX INFO: renamed from: a */
    public final i00.b getF157071f() {
        return this.f179278g;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h00.b getF179276e() {
        return this.f179276e;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f179279h;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i00.b getF179277f() {
        return this.f179277f;
    }

    @Override // sz.b
    public final qz.h<d00.a> e() {
        return this.f179274c;
    }

    @Override // sz.b
    public final qz.h<f00.c> g() {
        return this.f179273b;
    }

    @Override // sz.b
    public final qz.h<ScatterChartRenderer> i() {
        return this.f179275d;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvp/d$a;", "", "<init>", "()V", "", "COMBINED_BAR_WIDTH", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
