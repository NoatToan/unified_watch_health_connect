package p62;

import android.content.Context;
import android.widget.Toast;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lp62/j0;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "isMetricSwimPaceUnit", "isPrimary", "", "poolSize", "<init>", "(Landroid/content/Context;Lm52/k;Ljava/lang/Boolean;ZLjava/lang/Double;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f136230g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f136231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f136232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f136233f;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, m52.k kVar, Boolean bool, boolean z14, Double d14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
        this.f136231d = bool != null ? bool.booleanValue() : true;
        this.f136232e = true ^ zf.b.D(d14);
        this.f136233f = new String[]{this.f136215a.getString(R.string.lbl_per_100_meters), this.f136215a.getString(R.string.lbl_per_100_yards)};
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return m(j0Var.F);
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        l3.a aVar = l3.f23124b;
        boolean z14 = this.f136231d;
        aVar.getClass();
        j0Var.F = l3.a.n(120, z14);
        j0Var.P = this.f136231d ? m52.h.METER : m52.h.YARD;
        return j0Var;
    }

    @Override // p62.a0, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return new e(this, 4, j0Var, context);
    }

    @Override // p62.a0, p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        boolean z14 = this.f136232e;
        Context context = this.f136215a;
        if (z14) {
            String string = context.getString(R.string.workout_set_intensity_target);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.workout_set_intensity_target);
        l3.a aVar = l3.f23124b;
        boolean z15 = this.f136231d;
        aVar.getClass();
        return com.nimbusds.jose.shaded.gson.internal.a.h(string2, " (", context.getString(l3.a.O1(z15)), ")");
    }

    @Override // p62.b
    public final String g(double d14) {
        String str = l3.f23129g.format(d14);
        str.getClass();
        return d53.u.v(str, ".", ":", false);
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        boolean z14 = this.f136232e;
        spinnerDialogView.setSpinnerCount(z14 ? 3 : 2);
        spinnerDialogView.setDelimiters(p13.x.k(":", StringUtils.SPACE));
        double dDoubleValue = n(j0Var).f128594a.doubleValue();
        l3.a aVar = l3.f23124b;
        boolean z15 = this.f136231d;
        aVar.getClass();
        int iR = l3.a.r(dDoubleValue, z15);
        spinnerDialogView.d(0, (int) q(j0Var), (int) p(j0Var), iR / 60, null);
        spinnerDialogView.d(1, 0, 59, iR % 60, SpinnerDialogView.f48419r);
        if (z14) {
            spinnerDialogView.e(2, this.f136233f, !this.f136231d ? 1 : 0);
        }
    }

    @Override // p62.a0, p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        int length = iArr.length;
        boolean z14 = this.f136232e;
        if (length != (z14 ? 3 : 2)) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        if (z14) {
            this.f136231d = iArr[2] == 0;
        }
        boolean z15 = this.f136231d;
        j0Var.P = z15 ? m52.h.METER : m52.h.YARD;
        int i14 = (iArr[0] * 60) + iArr[1];
        l3.f23124b.getClass();
        s(j0Var, l3.a.n(i14, z15), j0Var.I);
        return j0Var;
    }

    @Override // p62.a0
    public final double j(int[] iArr) {
        iArr.getClass();
        return ((double) iArr[0]) + (((double) iArr[1]) / 100.0d);
    }

    @Override // p62.a0
    public final String m(double d14) {
        l3.a aVar = l3.f23124b;
        boolean z14 = this.f136231d;
        aVar.getClass();
        return l3.a.S0(new l22.a(this.f136215a), l3.a.r(d14, z14), Boolean.valueOf(this.f136231d));
    }

    @Override // p62.a0
    public final double p(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return this.f136231d ? 3.3d : 3.12d;
    }

    @Override // p62.a0
    public final double q(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return this.f136231d ? 0.3d : 0.27d;
    }

    @Override // p62.a0
    public final boolean t(Context context, double d14, double d15, double d16, double d17) {
        if (d14 < d16) {
            x0 x0Var = x0.f105818a;
            String string = context.getString(R.string.workout_higher_than_valid_value_confirmation);
            string.getClass();
            Toast.makeText(context, String.format(string, Arrays.copyOf(new Object[]{g(d16 - 0.01d)}, 1)), 0).show();
            return false;
        }
        if (d14 <= d17) {
            return true;
        }
        x0 x0Var2 = x0.f105818a;
        String string2 = context.getString(R.string.workout_lower_than_valid_value_confirmation);
        string2.getClass();
        Toast.makeText(context, String.format(string2, Arrays.copyOf(new Object[]{g(d17 + 0.01d)}, 1)), 0).show();
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp62/j0$a;", "", "<init>", "()V", "", "DEFAULT_TARGET_VALUE", "D", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
