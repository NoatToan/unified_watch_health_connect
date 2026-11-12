package sz;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.renderer.CandleStickChartRenderer;
import com.github.mikephil.charting.renderer.ScatterChartRenderer;
import f00.c;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import qz.h;
import vp.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsz/b;", "Lqz/h;", "Lc00/a;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b implements h<c00.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedChart.DrawOrder[] f161319a = {CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.SCATTER};

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161320a;

        static {
            int[] iArr = new int[CombinedChart.DrawOrder.values().length];
            try {
                iArr[CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f161320a = iArr;
        }
    }

    public i00.b a() {
        return null;
    }

    public abstract h<d00.a> e();

    public h<CandleStickChartRenderer> f() {
        return null;
    }

    public abstract h<c> g();

    public ArrayList h() {
        d00.a aVar;
        c cVar;
        CandleStickChartRenderer candleStickChartRenderer;
        ScatterChartRenderer scatterChartRenderer;
        ArrayList arrayList = new ArrayList();
        for (CombinedChart.DrawOrder drawOrder : this.f161319a) {
            int i14 = a.f161320a[drawOrder.ordinal()];
            if (i14 == 1) {
                h<d00.a> hVarE = e();
                if (hVarE != null && (aVar = (d00.a) hVarE.getF142393c()) != null) {
                    arrayList.add(aVar);
                }
            } else if (i14 == 2) {
                continue;
            } else if (i14 == 3) {
                h<c> hVarG = g();
                if (hVarG != null && (cVar = (c) hVarG.getF142393c()) != null) {
                    arrayList.add(cVar);
                }
            } else if (i14 == 4) {
                h<CandleStickChartRenderer> hVarF = f();
                if (hVarF != null && (candleStickChartRenderer = (CandleStickChartRenderer) hVarF.getF142393c()) != null) {
                    arrayList.add(candleStickChartRenderer);
                }
            } else {
                if (i14 != 5) {
                    u0.r();
                    return null;
                }
                h<ScatterChartRenderer> hVarI = i();
                if (hVarI != null && (scatterChartRenderer = ((g) hVarI).f179295h) != null) {
                    arrayList.add(scatterChartRenderer);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public h<ScatterChartRenderer> i() {
        return null;
    }
}
