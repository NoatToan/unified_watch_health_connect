package vm;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvm/d;", "Lqz/h;", "Ld00/a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomBarChart;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements h<d00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f178729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f178730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d00.a f178731c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vm/d$b", "Li00/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f178732i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f178733j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final yz.b f178734k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            yAxis.getClass();
            this.f178732i = true;
            this.f178733j = true;
            this.f178734k = new yz.b(0);
        }

        @Override // i00.b
        public final boolean a() {
            return false;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF178733j() {
            return this.f178733j;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF178732i() {
            return this.f178732i;
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF21082i() {
            return this.f178734k;
        }

        @Override // i00.b
        public final void f() {
        }

        @Override // i00.b
        public final void g() {
            this.f178733j = false;
        }

        @Override // i00.b
        public final void h() {
            this.f178732i = false;
        }
    }

    static {
        new a(null);
    }

    public d(CustomBarChart customBarChart) {
        customBarChart.getClass();
        ViewPortHandler viewPortHandler = customBarChart.getViewPortHandler();
        viewPortHandler.getClass();
        Transformer transformer = customBarChart.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        XAxis xAxis = customBarChart.getXAxis();
        xAxis.getClass();
        e eVar = new e(viewPortHandler, xAxis, transformer, pz.a.ALL_LARGE_DOT_PATTERN, pz.b.DEFAULT_LABEL_PATTERN, false, 32, null);
        eVar.f80608l = true;
        eVar.f80606j = true;
        eVar.f80607k = false;
        this.f178729a = eVar;
        this.f178730b = new b(viewPortHandler, customBarChart.getAxisLeft(), transformer);
        d00.a aVar = new d00.a(customBarChart, customBarChart.getAnimator(), customBarChart.getViewPortHandler());
        aVar.f56990b = 0.55f;
        Float fValueOf = Float.valueOf(20.0f);
        aVar.f56994f = fValueOf;
        aVar.f56995g = fValueOf;
        this.f178731c = aVar;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF101974h() {
        return this.f178729a;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF142393c() {
        return this.f178731c;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF101352b() {
        return this.f178730b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lvm/d$a;", "", "<init>", "()V", "", "ROUTES_CHART_BAR_WIDTH", "F", "ROUTES_EXTRA_OFFSET", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
