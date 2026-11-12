package p62;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp62/f0;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "<init>", "(Landroid/content/Context;Lm52/k;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends a0 {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, m52.k kVar) {
        super(context, kVar, true);
        context.getClass();
        kVar.getClass();
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        o13.p<Double, Double> pVarN = n(j0Var);
        double dDoubleValue = pVarN.f128594a.doubleValue();
        double dDoubleValue2 = pVarN.f128595b.doubleValue();
        String strM = m(dDoubleValue);
        String strM2 = m(dDoubleValue2);
        l3.a aVar = l3.f23124b;
        boolean zS = v52.f.s();
        aVar.getClass();
        Context context = this.f136215a;
        context.getClass();
        String string = new l22.a(context).getString(l3.a.N1(zS));
        x0 x0Var = x0.f105818a;
        return String.format("%s-%s %s", Arrays.copyOf(new Object[]{strM, strM2, string}, 3));
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        double dL;
        double dL2;
        kVar.getClass();
        if (v52.f.s()) {
            dL = l(330.0d);
            dL2 = l(360.0d);
        } else {
            dL = l(510.0d);
            dL2 = l(570.0d);
        }
        s(j0Var, dL, dL2);
        return j0Var;
    }

    @Override // p62.b
    public final String g(double d14) {
        return l3.a.t1(l3.f23124b, d14);
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(4);
        spinnerDialogView.setDelimiters(p13.x.k(":", "  -  ", ":"));
        o13.p<Double, Double> pVarN = n(j0Var);
        double dDoubleValue = pVarN.f128594a.doubleValue();
        double dDoubleValue2 = pVarN.f128595b.doubleValue();
        l3.a aVar = l3.f23124b;
        boolean zS = v52.f.s();
        aVar.getClass();
        int iP = l3.a.p(dDoubleValue, zS);
        int iP2 = l3.a.p(dDoubleValue2, v52.f.s());
        SpinnerDialogView.f fVar = SpinnerDialogView.f48419r;
        spinnerDialogView.d(0, 0, 59, iP / 60, fVar);
        spinnerDialogView.d(1, 0, 59, iP % 60, fVar);
        spinnerDialogView.d(2, 0, 59, iP2 / 60, fVar);
        spinnerDialogView.d(3, 0, 59, iP2 % 60, fVar);
    }

    @Override // p62.a0, p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
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
        double dJ = j(iArrCopyOfRange);
        int length2 = iArr.length / 2;
        int length3 = iArr.length;
        p13.l.a(length3, iArr.length);
        int[] iArrCopyOfRange2 = Arrays.copyOfRange(iArr, length2, length3);
        iArrCopyOfRange2.getClass();
        double dJ2 = j(iArrCopyOfRange2);
        if (dJ < dJ2) {
            s(j0Var, l(dJ), l(dJ2));
            return j0Var;
        }
        if (dJ != dJ2) {
            s(j0Var, l(dJ2), l(dJ));
            return j0Var;
        }
        if (dJ >= o(j0Var).f189100e + 1.0d) {
            s(j0Var, l(dJ - 1.0d), l(dJ2));
            return j0Var;
        }
        s(j0Var, l(dJ), l(dJ2 + 1.0d));
        return j0Var;
    }

    @Override // p62.a0
    public final double j(int[] iArr) {
        return (((double) iArr[0]) * 60.0d) + ((double) iArr[1]);
    }

    @Override // p62.a0
    public final double l(double d14) {
        l3.a aVar = l3.f23124b;
        boolean zS = v52.f.s();
        aVar.getClass();
        return l3.a.m(d14, zS);
    }

    @Override // p62.a0
    public final String m(double d14) {
        return l3.a.v0(l3.f23124b, this.f136215a, d14, v52.f.s(), false, null, 32);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lp62/f0$a;", "", "<init>", "()V", "", "DEFAULT_TARGET_VALUE_ONE", "D", "DEFAULT_TARGET_VALUE_TWO", "DEFAULT_TARGET_VALUE_ONE_METRIC_SYSTEM", "DEFAULT_TARGET_VALUE_TWO_METRIC_SYSTEM", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
