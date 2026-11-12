package oq0;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.model.GradientColor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Loq0/b;", "", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lcom/github/mikephil/charting/model/GradientColor;", "normalGradientColor", "emphasizeGradientColor", "", "roundedBars", "", "barWidth", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lcom/github/mikephil/charting/model/GradientColor;Lcom/github/mikephil/charting/model/GradientColor;ZF)V", "b", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarChart f133271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GradientColor f133272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GradientColor f133273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f133274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f133275e;

    /* JADX INFO: renamed from: oq0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq0/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC2530b {
        HOURS_MINUTES_FORMAT_TYPE,
        MINUTES_SECONDS_FORMAT_TYPE,
        THOUSANDS_WITH_K_FORMAT_TYPE
    }

    static {
        new a(null);
    }

    public b(BarChart barChart, GradientColor gradientColor, GradientColor gradientColor2, boolean z14, float f14) {
        barChart.getClass();
        gradientColor.getClass();
        gradientColor2.getClass();
        this.f133271a = barChart;
        this.f133272b = gradientColor;
        this.f133273c = gradientColor2;
        this.f133274d = z14;
        this.f133275e = f14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loq0/b$a;", "", "<init>", "()V", "", "BAR_WIDTH", "F", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(BarChart barChart, GradientColor gradientColor, GradientColor gradientColor2, boolean z14) {
        this(barChart, gradientColor, gradientColor2, z14, 0.0f, 16, null);
        barChart.getClass();
        gradientColor.getClass();
        gradientColor2.getClass();
    }

    public /* synthetic */ b(BarChart barChart, GradientColor gradientColor, GradientColor gradientColor2, boolean z14, float f14, int i14, j jVar) {
        this(barChart, gradientColor, gradientColor2, z14, (i14 & 16) != 0 ? 0.65f : f14);
    }
}
