package p62;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp62/c0;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Z)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends a0 {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, m52.k kVar, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        String string;
        j0Var.getClass();
        o13.p<Double, Double> pVarN = n(j0Var);
        double dDoubleValue = pVarN.f128594a.doubleValue();
        double dDoubleValue2 = pVarN.f128595b.doubleValue();
        l3.f23124b.getClass();
        if (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2)) {
            return "";
        }
        Context context = this.f136215a;
        if (context == null || (string = context.getString(R.string.no_value)) == null) {
            string = "--";
        }
        String str = dDoubleValue > 0.0d ? l3.f23131i.format(dDoubleValue) : string;
        if (dDoubleValue2 > 0.0d) {
            string = l3.f23131i.format(dDoubleValue2);
        }
        return context != null ? e5.g(context.getString(R.string.lbl_heart_rate_zone_bpm, str), " - ", context.getString(R.string.lbl_heart_rate_zone_bpm, string)) : "";
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        if (this.f136217c) {
            j0Var.C = 0;
        } else {
            j0Var.T = 0;
        }
        s(j0Var, 120.0d, 130.0d);
        return j0Var;
    }

    @Override // p62.a0, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return null;
    }

    @Override // p62.b
    public final String g(double d14) {
        return null;
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(2);
        spinnerDialogView.setDelimiters(p13.w.c("  -  "));
        o13.p<Double, Double> pVarN = n(j0Var);
        double dDoubleValue = pVarN.f128594a.doubleValue();
        double dDoubleValue2 = pVarN.f128595b.doubleValue();
        spinnerDialogView.d(0, (int) o(j0Var).f189100e, (int) o(j0Var).f189101f, (int) dDoubleValue, null);
        spinnerDialogView.d(1, (int) o(j0Var).f189100e, (int) o(j0Var).f189101f, (int) dDoubleValue2, null);
    }

    @Override // p62.a0
    public final String m(double d14) {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lp62/c0$a;", "", "<init>", "()V", "", "DEFAULT_TARGET_VALUE_ONE", "I", "DEFAULT_TARGET_VALUE_TWO", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c0(Context context, m52.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, (i14 & 4) != 0 ? true : z14);
    }
}
