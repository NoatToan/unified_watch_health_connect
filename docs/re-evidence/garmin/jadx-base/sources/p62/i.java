package p62;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import com.google.protobuf.DescriptorProtos;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp62/i;", "Lp62/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136229a;

        static {
            int[] iArr = new int[m52.j.values().length];
            try {
                iArr[m52.j.f116747g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.j.f116746f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f136229a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        context.getClass();
    }

    public static double p(int[] iArr) {
        String str = new DecimalFormat("00").format(iArr[1]);
        x0 x0Var = x0.f105818a;
        return Double.parseDouble(String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(iArr[0]), str}, 2)));
    }

    @Override // p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return v52.f.d(this.f136225a, j0Var.f48229n, j0Var.f48231p);
    }

    @Override // p62.f, p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        Object obj = objArr[0];
        double dM = f.m(kVar, j0Var, obj instanceof m52.a ? (m52.a) obj : null);
        boolean zS = v52.f.s();
        j0Var.f48229n = k52.g.a(dM, zS ? qs.y.UNIT_DISTANCE_KILOMETER : qs.y.UNIT_DISTANCE_MILE);
        j0Var.f48231p = zS ? m52.j.f116746f : m52.j.f116745e;
        return j0Var;
    }

    @Override // p62.f, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return new e(this, 1, j0Var, context);
    }

    @Override // p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        m52.j jVar = j0Var.f48231p;
        Context context = this.f136225a;
        context.getClass();
        return k(jVar != null ? jVar.b(context) : "");
    }

    @Override // p62.b
    public final String g(double d14) {
        x0 x0Var = x0.f105818a;
        return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1));
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        double d14;
        double d15;
        j0Var.getClass();
        double d16 = j0Var.f48229n;
        spinnerDialogView.setSpinnerCount(3);
        m52.j jVar = j0Var.f48231p;
        int i14 = jVar == null ? -1 : a.f136229a[jVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                l3.f23124b.getClass();
                d15 = 1609.344d;
            } else {
                l3.f23124b.getClass();
                d15 = 1000.0d;
            }
            d14 = d16 / d15;
        } else {
            d14 = d16 * 0.01d;
        }
        int i15 = (int) d14;
        spinnerDialogView.d(0, 0, DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE, i15, null);
        spinnerDialogView.d(1, 0, 99, MathKt.b((d14 - ((double) i15)) * ((double) 100)), SpinnerDialogView.f48419r);
        m52.j jVar2 = j0Var.f48231p;
        spinnerDialogView.d(2, 0, 2, jVar2 != null ? jVar2.ordinal() : 0, new h(this, 0));
    }

    @Override // p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        double dP;
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length != 3) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        m52.j jVar = m52.j.values()[iArr[2]];
        j0Var.f48231p = jVar;
        double dJ = j(iArr);
        int i14 = a.f136229a[jVar.ordinal()];
        if (i14 != 1) {
            dP = i14 != 2 ? k52.g.a(dJ, qs.y.UNIT_DISTANCE_MILE) : k52.g.a(dJ, qs.y.UNIT_DISTANCE_KILOMETER);
        } else {
            dP = p(iArr);
        }
        j0Var.f48229n = dP;
        return j0Var;
    }

    @Override // p62.f
    public final double j(int[] iArr) {
        iArr.getClass();
        return (((double) iArr[1]) * 0.01d) + ((double) iArr[0]);
    }
}
