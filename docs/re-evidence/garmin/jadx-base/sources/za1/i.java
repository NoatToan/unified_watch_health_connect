package za1;

import am.j;
import android.content.Context;
import c22.l3;
import c22.m3;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import f12.l;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lza1/i;", "", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h00.i f203324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f203325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f00.c f203326d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"za1/i$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f203327a;

        public a() {
            this.f203327a = j.z(l.f68084a) || l.a.a().C1();
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            if (!this.f203327a) {
                f14 *= 3.28084f;
            }
            i.this.getClass();
            String str = l3.f23126d.format(((float) Math.ceil(((double) f14) / 10.0d)) * 10);
            str.getClass();
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"za1/i$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ValueFormatter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3 f203330b;

        public b(m3 m3Var) {
            this.f203330b = m3Var;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            l3.a aVar = l3.f23124b;
            DecimalFormat decimalFormat = l3.f23125c;
            aVar.getClass();
            return l3.a.P(i.this.f203323a, f14, this.f203330b, decimalFormat, false, "");
        }
    }

    public i(LineChart lineChart) {
        lineChart.getClass();
        this.f203323a = lineChart.getContext();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        viewPortHandler.getClass();
        h00.i iVar = new h00.i(viewPortHandler, com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer), transformer);
        iVar.f80601e = new b(j.z(l.f68084a) ? m3.KILOMETER : m3.MILE);
        this.f203324b = iVar;
        this.f203325c = new a();
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        this.f203326d = new f00.c(lineChart, animator, viewPortHandler);
    }
}
