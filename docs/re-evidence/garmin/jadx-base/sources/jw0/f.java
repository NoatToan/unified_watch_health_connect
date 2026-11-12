package jw0;

import b63.o;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import p005kotlin.Metadata;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BA\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljw0/f;", "ChartType", "OverlayType", "Luz/d;", "Lj23/g;", "Lb63/o;", "dateInterval", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "chartType", "Luz/e;", "rendererConfigFactory", "", "isDaily", "<init>", "(Lj23/g;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Ljava/lang/Object;Luz/e;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f<ChartType, OverlayType> extends uz.d<ChartType, OverlayType> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f101348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f101349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c00.a f101350l;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"jw0/f$a", "Lqz/h;", "Lf00/c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements h<f00.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h00.b f101351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i00.b f101352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f00.c f101353c;

        public a(f<ChartType, OverlayType> fVar, CustomCombinedChart customCombinedChart) {
            this.f101351a = fVar.f173482e.getF57459d();
            this.f101352b = fVar.f173482e.getF57460e();
            ChartAnimator animator = customCombinedChart.getAnimator();
            animator.getClass();
            ViewPortHandler viewPortHandler = customCombinedChart.getViewPortHandler();
            viewPortHandler.getClass();
            this.f101353c = new f00.c(customCombinedChart, animator, viewPortHandler);
        }

        @Override // qz.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final h00.b getF57459d() {
            return this.f101351a;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: c */
        public final DataRenderer getF173486i() {
            return this.f101353c;
        }

        @Override // qz.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public final i00.b getF57460e() {
            return this.f101352b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j23.g<o> gVar, CustomCombinedChart customCombinedChart, ChartType charttype, uz.e<ChartType, OverlayType> eVar, boolean z14) {
        super(customCombinedChart, charttype, eVar);
        gVar.getClass();
        customCombinedChart.getClass();
        eVar.getClass();
        this.f101348j = new a(this, customCombinedChart);
        this.f101349k = new d(customCombinedChart, customCombinedChart, gVar, z14);
        DataRenderer renderer = customCombinedChart.getRenderer();
        renderer.getClass();
        this.f101350l = (c00.a) renderer;
    }

    @Override // uz.d, qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f101350l;
    }

    @Override // uz.d, sz.b
    public final h<d00.a> e() {
        return this.f101349k;
    }

    @Override // uz.d, sz.b
    public final h<f00.c> g() {
        return this.f101348j;
    }

    @Override // uz.d, sz.b
    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f101349k.f101344g);
        arrayList.add(this.f101348j.f101353c);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // uz.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final c00.a getF101350l() {
        return this.f101350l;
    }
}
