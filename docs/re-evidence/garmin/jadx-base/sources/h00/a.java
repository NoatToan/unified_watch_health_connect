package h00;

import android.graphics.Paint;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomHorizontalBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.renderer.XAxisRendererHorizontalBarChart;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh00/a;", "Lcom/github/mikephil/charting/renderer/XAxisRendererHorizontalBarChart;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends XAxisRendererHorizontalBarChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f80591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f80592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<xz.h> f80593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d.a f80594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f80596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, CustomHorizontalBarChart customHorizontalBarChart) {
        super(viewPortHandler, xAxis, transformer, customHorizontalBarChart);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        customHorizontalBarChart.getClass();
        this.f80595e = 6;
        this.f80596f = true;
    }
}
