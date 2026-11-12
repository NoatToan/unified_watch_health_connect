package p62;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp62/a0;", "Lp62/b;", "Landroid/content/Context;", "mContext", "Lm52/k;", "mSportType", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f136215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m52.k f136216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136217c;

    public a0(Context context, m52.k kVar, boolean z14) {
        context.getClass();
        kVar.getClass();
        this.f136215a = context;
        this.f136216b = kVar;
        this.f136217c = z14;
    }

    @Override // p62.r
    public String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        o13.p<Double, Double> pVarN = n(j0Var);
        double dDoubleValue = pVarN.f128594a.doubleValue();
        double dDoubleValue2 = pVarN.f128595b.doubleValue();
        String strM = m(dDoubleValue);
        String strM2 = m(dDoubleValue2);
        x0 x0Var = x0.f105818a;
        return String.format("%s - %s", Arrays.copyOf(new Object[]{strM, strM2}, 2));
    }

    @Override // p62.r
    public SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return new e(this, 3, j0Var, context);
    }

    @Override // p62.b
    public String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        x52.f fVarO = o(j0Var);
        Context context = this.f136215a;
        return com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.workout_set_intensity_target), " (", fVarO.b(context), ")");
    }

    @Override // p62.b
    public com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length % 2 != 0) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        int length = iArr.length / 2;
        p13.l.a(length, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, 0, length);
        iArrCopyOfRange.getClass();
        double dL = l(j(iArrCopyOfRange));
        int length2 = iArr.length / 2;
        int length3 = iArr.length;
        p13.l.a(length3, iArr.length);
        int[] iArrCopyOfRange2 = Arrays.copyOfRange(iArr, length2, length3);
        iArrCopyOfRange2.getClass();
        double dL2 = l(j(iArrCopyOfRange2));
        if (dL < dL2) {
            s(j0Var, dL, dL2);
            return j0Var;
        }
        if (dL != dL2) {
            s(j0Var, dL2, dL);
            return j0Var;
        }
        if (dL >= r() + q(j0Var)) {
            s(j0Var, dL - r(), dL2);
            return j0Var;
        }
        s(j0Var, dL, dL2 + r());
        return j0Var;
    }

    public double j(int[] iArr) {
        return iArr[0];
    }

    public String k(Context context, double d14, double d15) {
        if (Double.isNaN(d14)) {
            x0 x0Var = x0.f105818a;
            String string = context.getString(R.string.workout_lower_than_valid_value_confirmation);
            string.getClass();
            return String.format(string, Arrays.copyOf(new Object[]{g(d15)}, 1));
        }
        x0 x0Var2 = x0.f105818a;
        String string2 = context.getString(R.string.workout_higher_than_valid_value_confirmation);
        string2.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{g(d14)}, 1));
    }

    public double l(double d14) {
        return d14;
    }

    public abstract String m(double d14);

    public final o13.p<Double, Double> n(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return this.f136217c ? new o13.p<>(Double.valueOf(j0Var.f48233r), Double.valueOf(j0Var.f48234t)) : new o13.p<>(Double.valueOf(j0Var.F), Double.valueOf(j0Var.I));
    }

    public final x52.f o(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        boolean z14 = this.f136217c;
        m52.k kVar = this.f136216b;
        if (z14) {
            x52.f.f189078g.getClass();
            return x52.f.a.b(j0Var, kVar);
        }
        x52.f.f189078g.getClass();
        return x52.f.a.a(j0Var, kVar);
    }

    public double p(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return o(j0Var).f189101f;
    }

    public double q(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return o(j0Var).f189100e;
    }

    public double r() {
        return 1.0d;
    }

    public final void s(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, double d14, double d15) {
        j0Var.getClass();
        if (this.f136217c) {
            j0Var.f48233r = d14;
            j0Var.f48234t = d15;
        } else {
            j0Var.F = d14;
            j0Var.I = d15;
        }
        double d16 = zf.b.D(Double.valueOf(j0Var.f48233r)) ? j0Var.f48233r : 0.0d;
        double d17 = zf.b.D(Double.valueOf(j0Var.f48234t)) ? j0Var.f48234t : 0.0d;
        double d18 = zf.b.D(Double.valueOf(j0Var.F)) ? j0Var.F : 0.0d;
        double d19 = zf.b.D(Double.valueOf(j0Var.I)) ? j0Var.I : 0.0d;
        m52.g gVar = j0Var.f48232q;
        m52.g gVar2 = m52.g.PACE;
        if (gVar == gVar2 || gVar == m52.g.SPEED) {
            j0Var.D = new BigDecimal(String.valueOf((d16 + d17) / 2.0d)).setScale(10, RoundingMode.HALF_UP).doubleValue();
        }
        m52.g gVar3 = j0Var.E;
        if (gVar3 == gVar2 || gVar3 == m52.g.SPEED) {
            j0Var.D = new BigDecimal(String.valueOf((d18 + d19) / 2.0d)).setScale(10, RoundingMode.HALF_UP).doubleValue();
        }
    }

    public boolean t(Context context, double d14, double d15, double d16, double d17) {
        if (d14 < d16 || d15 < d16) {
            Toast.makeText(context, k(context, d16, Double.NaN), 0).show();
            return false;
        }
        if (d14 <= d17 && d15 <= d17) {
            return true;
        }
        Toast.makeText(context, k(context, Double.NaN, d17), 0).show();
        return false;
    }
}
