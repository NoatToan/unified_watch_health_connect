package xm;

import com.github.mikephil.charting.formatter.ValueFormatter;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxm/d;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "chartType", "<init>", "(I)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191327a;

    static {
        new a(null);
    }

    public d(int i14) {
        this.f191327a = i14;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        int i14 = this.f191327a;
        if (f14 == 180.0f && (i14 == 23 || i14 == 26)) {
            x0 x0Var = x0.f105818a;
            return String.format("BDC %d", Arrays.copyOf(new Object[]{Integer.valueOf((int) f14)}, 1));
        }
        if (f14 == 0.0f && (i14 == 24 || i14 == 25)) {
            x0 x0Var2 = x0.f105818a;
            return String.format("TDC %d", Arrays.copyOf(new Object[]{Integer.valueOf((int) f14)}, 1));
        }
        x0 x0Var3 = x0.f105818a;
        return String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf((int) f14)}, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxm/d$a;", "", "<init>", "()V", "", "INT_VALUE_FORMAT", "Ljava/lang/String;", "BDC_FORMAT", "TDC_FORMAT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
