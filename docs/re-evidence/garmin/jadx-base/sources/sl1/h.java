package sl1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\rB/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsl1/h;", "Luz/a;", "Lrl1/j;", "Lrl1/i;", "Lrm1/j;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "chartType", "overlayChartType", "Lcom/github/mikephil/charting/listener/OnChartGestureListener;", "onChartGestureListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lrl1/j;Lrl1/i;Lcom/github/mikephil/charting/listener/OnChartGestureListener;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends uz.a<rl1.j, rl1.i, rm1.j> {
    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(CustomCombinedChart customCombinedChart, rl1.j jVar, rl1.i iVar, OnChartGestureListener onChartGestureListener) {
        customCombinedChart.getClass();
        jVar.getClass();
        Context context = customCombinedChart.getContext();
        context.getClass();
        super(customCombinedChart, new uz.b(jVar, new i(context)), new j(customCombinedChart, jVar, new k(customCombinedChart)), new g(customCombinedChart, onChartGestureListener), new c(customCombinedChart), 32.0f);
        if (iVar != null) {
            b(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsl1/h$a;", "", "<init>", "()V", "", "FIXED_Y_AXIS_WIDTH", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ h(CustomCombinedChart customCombinedChart, rl1.j jVar, rl1.i iVar, OnChartGestureListener onChartGestureListener, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(customCombinedChart, jVar, (i14 & 4) != 0 ? null : iVar, (i14 & 8) != 0 ? null : onChartGestureListener);
    }
}
