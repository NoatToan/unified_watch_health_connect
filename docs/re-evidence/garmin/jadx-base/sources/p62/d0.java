package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp62/d0;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "ftp", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;IZ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, m52.k kVar, int i14, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
        this.f136220d = i14;
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        o13.p<Double, Double> pVarN = n(j0Var);
        return gl1.d.x(this.f136215a, pVarN.f128594a.doubleValue(), pVarN.f128595b.doubleValue(), this.f136217c ? j0Var.f48235v : j0Var.P, this.f136220d);
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        int i14 = this.f136220d;
        int i15 = i14 > 10 ? i14 - 10 : 0;
        int i16 = i14 + 10;
        if (kVar == m52.k.f116754n) {
            i15 = 200;
            i16 = 400;
        }
        if (this.f136217c) {
            j0Var.C = 0;
            j0Var.f48235v = null;
        } else {
            j0Var.T = 0;
            j0Var.P = null;
        }
        s(j0Var, i15, i16);
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
    }

    @Override // p62.a0
    public final String m(double d14) {
        return null;
    }

    public /* synthetic */ d0(Context context, m52.k kVar, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, i14, (i15 & 8) != 0 ? true : z14);
    }
}
