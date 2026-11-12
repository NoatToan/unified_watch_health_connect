package jc1;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljc1/e;", "Lcom/github/mikephil/chartingv2/formatter/YAxisValueFormatter;", "<init>", "()V", "a", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements YAxisValueFormatter {
    static {
        new a(null);
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public final String getFormattedValue(float f14, YAxis yAxis) {
        yAxis.getClass();
        x0 x0Var = x0.f105818a;
        return String.format("%1$d%%", Arrays.copyOf(new Object[]{Integer.valueOf((int) f14)}, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljc1/e$a;", "", "<init>", "()V", "", "VALUE_PERCENT_FORMAT", "Ljava/lang/String;", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
