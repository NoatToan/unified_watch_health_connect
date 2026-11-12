package mm;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lmm/e;", "Lcom/github/mikephil/chartingv2/formatter/ValueFormatter;", "Lcom/github/mikephil/chartingv2/formatter/YAxisValueFormatter;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements ValueFormatter, YAxisValueFormatter {
    static {
        new a(null);
    }

    public static String a(int i14) {
        int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
        if (i15 <= 0) {
            int i16 = i14 / 60;
            x0 x0Var = x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i16), Integer.valueOf(i14 % 60)}, 2));
        }
        int i17 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        x0 x0Var2 = x0.f105818a;
        return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i17), Integer.valueOf(i14 % 60)}, 3));
    }

    @Override // com.github.mikephil.chartingv2.formatter.ValueFormatter
    public final String getFormattedValue(float f14, Entry entry, int i14, ViewPortHandler viewPortHandler) {
        entry.getClass();
        viewPortHandler.getClass();
        return a((int) f14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lmm/e$a;", "", "<init>", "()V", "", "MIN_SEC_FORMAT", "Ljava/lang/String;", "HOUR_MIN_SEC_FORMAT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public final String getFormattedValue(float f14, YAxis yAxis) {
        return a((int) f14);
    }
}
