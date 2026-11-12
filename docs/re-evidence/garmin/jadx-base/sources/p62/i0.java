package p62;

import android.content.Context;
import android.widget.Toast;
import c22.l3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.text.DecimalFormat;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp62/i0;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Z)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends a0 {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, m52.k kVar, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        double dL;
        double dL2;
        kVar.getClass();
        if (v52.f.s()) {
            dL = l(22.0d);
            dL2 = l(25.0d);
        } else {
            dL = l(14.0d);
            dL2 = l(16.0d);
        }
        s(j0Var, dL, dL2);
        return j0Var;
    }

    @Override // p62.b
    public final String g(double d14) {
        return null;
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        double dI;
        double dI2;
        j0Var.getClass();
        o13.p<Double, Double> pVarN = n(j0Var);
        double dDoubleValue = pVarN.f128594a.doubleValue();
        double dDoubleValue2 = pVarN.f128595b.doubleValue();
        if (v52.f.s()) {
            l3.f23124b.getClass();
            dI = l3.a.i(dDoubleValue, q3.KILOMETER_PER_HOUR);
        } else {
            l3.f23124b.getClass();
            dI = l3.a.i(dDoubleValue, q3.MILE_PER_HOUR);
        }
        if (v52.f.s()) {
            l3.f23124b.getClass();
            dI2 = l3.a.i(dDoubleValue2, q3.KILOMETER_PER_HOUR);
        } else {
            l3.f23124b.getClass();
            dI2 = l3.a.i(dDoubleValue2, q3.MILE_PER_HOUR);
        }
        l3.f23124b.getClass();
        double dU1 = l3.a.U1(dI);
        double dU2 = l3.a.U1(dI2);
        spinnerDialogView.setSpinnerCount(4);
        spinnerDialogView.setDelimiters(p13.x.k(".", "  -  ", "."));
        int i14 = (int) dU1;
        spinnerDialogView.d(0, (int) o(j0Var).f189100e, (int) o(j0Var).f189101f, i14, null);
        double d14 = 10;
        spinnerDialogView.d(1, 0, 9, MathKt.b((dU1 - ((double) i14)) * d14), null);
        int i15 = (int) dU2;
        spinnerDialogView.d(2, (int) o(j0Var).f189100e, (int) o(j0Var).f189101f, i15, null);
        spinnerDialogView.d(3, 0, 9, MathKt.b((dU2 - ((double) i15)) * d14), null);
    }

    @Override // p62.a0
    public final double j(int[] iArr) {
        return (((double) iArr[1]) * 0.1d) + ((double) iArr[0]);
    }

    @Override // p62.a0
    public final String k(Context context, double d14, double d15) {
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.workout_between_valid_value_message);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf((int) d14), Integer.valueOf((int) d15)}, 2));
    }

    @Override // p62.a0
    public final double l(double d14) {
        if (v52.f.s()) {
            l3.a aVar = l3.f23124b;
            q3 q3Var = q3.KILOMETER_PER_HOUR;
            aVar.getClass();
            return l3.a.x(d14, q3Var);
        }
        l3.a aVar2 = l3.f23124b;
        q3 q3Var2 = q3.MILE_PER_HOUR;
        aVar2.getClass();
        return l3.a.x(d14, q3Var2);
    }

    @Override // p62.a0
    public final String m(double d14) {
        if (v52.f.s()) {
            l3.a aVar = l3.f23124b;
            q3 q3Var = q3.KILOMETER_PER_HOUR;
            DecimalFormat decimalFormat = l3.f23126d;
            aVar.getClass();
            return l3.a.N0(this.f136215a, d14, q3Var, decimalFormat, true, null);
        }
        l3.a aVar2 = l3.f23124b;
        q3 q3Var2 = q3.MILE_PER_HOUR;
        DecimalFormat decimalFormat2 = l3.f23126d;
        aVar2.getClass();
        return l3.a.N0(this.f136215a, d14, q3Var2, decimalFormat2, true, null);
    }

    @Override // p62.a0
    public final double r() {
        return 0.1d;
    }

    @Override // p62.a0
    public final boolean t(Context context, double d14, double d15, double d16, double d17) {
        if (d14 >= d16 && d15 >= d16 && d14 <= d17 && d15 <= d17) {
            return true;
        }
        Toast.makeText(context, k(context, d16, d17), 0).show();
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lp62/i0$a;", "", "<init>", "()V", "", "DEFAULT_TARGET_VALUE_ONE", "D", "DEFAULT_TARGET_VALUE_TWO", "DEFAULT_TARGET_VALUE_ONE_METRIC_SYSTEM", "DEFAULT_TARGET_VALUE_TWO_METRIC_SYSTEM", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ i0(Context context, m52.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, (i14 & 4) != 0 ? true : z14);
    }
}
