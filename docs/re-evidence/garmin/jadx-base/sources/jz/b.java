package jz;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljz/b;", "Lcom/github/mikephil/chartingv2/formatter/YAxisValueFormatter;", "<init>", "()V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements YAxisValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f101898a;

    static {
        new a(null);
        f101898a = TimeModel.NUMBER_FORMAT;
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public final String getFormattedValue(float f14, YAxis yAxis) {
        yAxis.getClass();
        x0 x0Var = x0.f105818a;
        return String.format(f101898a, Arrays.copyOf(new Object[]{Integer.valueOf(Math.round(f14))}, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljz/b$a;", "", "<init>", "()V", "", "INT_VALUE_FORMAT", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
