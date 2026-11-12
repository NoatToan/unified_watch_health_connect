package dg1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.LineChart;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldg1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Landroid/content/Context;Lcom/github/mikephil/charting/charts/LineChart;)V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f59515e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineChart f59516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59519d;

    static {
        new C1270a(null);
    }

    public a(Context context, LineChart lineChart) {
        context.getClass();
        lineChart.getClass();
        this.f59516a = lineChart;
        this.f59517b = a7.b.getColor(context, R.color.gcm_text_secondary);
        this.f59518c = a7.b.getColor(context, R.color.gcm3_chart_gradient_green_start);
        this.f59519d = a7.b.getColor(context, R.color.gcm3_chart_gradient_green_end);
    }

    public static float a(float f14, int i14) {
        if (Float.isNaN(f14) || i14 == 0) {
            return 0.0f;
        }
        float f15 = i14;
        return f15 * MathKt.c(f14 / f15);
    }

    /* JADX INFO: renamed from: dg1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Ldg1/a$a;", "", "<init>", "()V", "", "TYPE_TAG", "Ljava/lang/String;", "", "DEFAULT_Y_LABEL_COUNT", "I", "", "X_AXIS_TEXT_SIZE", "F", "LEFT_AXIS_MARGIN", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1270a {
        public /* synthetic */ C1270a(j jVar) {
            this();
        }

        private C1270a() {
        }
    }
}
