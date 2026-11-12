package yz;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyz/j;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends ValueFormatter {
    static {
        new a(null);
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        if (Float.isNaN(f14)) {
            return "";
        }
        int iC = MathKt.c(f14);
        int i14 = iC / DateTimeConstants.SECONDS_PER_HOUR;
        if (i14 <= 0) {
            int i15 = iC / 60;
            x0 x0Var = x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(iC % 60)}, 2));
        }
        int i16 = (iC % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        x0 x0Var2 = x0.f105818a;
        return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i16), Integer.valueOf(iC % 60)}, 3));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lyz/j$a;", "", "<init>", "()V", "", "MIN_SEC_FORMAT", "Ljava/lang/String;", "HOUR_MIN_SEC_FORMAT", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
