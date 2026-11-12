package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp62/e0;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e0 extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, m52.k kVar, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return this.f136217c ? u(j0Var.C) : u(j0Var.T);
    }

    @Override // p62.r
    public com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        x52.g gVar = kVar == m52.k.f116754n ? x52.g.ZONE_3 : x52.g.ZONE_1;
        if (this.f136217c) {
            j0Var.C = gVar.f189113a;
            return j0Var;
        }
        j0Var.T = gVar.f189113a;
        return j0Var;
    }

    @Override // p62.a0, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return null;
    }

    @Override // p62.a0, p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        String string = this.f136215a.getString(R.string.workout_set_intensity_target);
        string.getClass();
        return string;
    }

    @Override // p62.b
    public final String g(double d14) {
        return null;
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(1);
        spinnerDialogView.setDelimiters(null);
        spinnerDialogView.d(0, 1, (int) o(j0Var).f189101f, this.f136217c ? j0Var.C : j0Var.T, new h(this, 2));
    }

    @Override // p62.a0, p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length != 1) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        if (this.f136217c) {
            j0Var.C = iArr[0];
            return j0Var;
        }
        j0Var.T = iArr[0];
        return j0Var;
    }

    @Override // p62.a0
    public final String m(double d14) {
        return null;
    }

    public String u(int i14) {
        x52.g.f189104d.getClass();
        x52.g gVarA = x52.g.a.a(i14);
        if (gVarA == null) {
            return null;
        }
        Context context = this.f136215a;
        context.getClass();
        String string = context.getString(gVarA.f189114b);
        string.getClass();
        return string;
    }

    public /* synthetic */ e0(Context context, m52.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, (i14 & 4) != 0 ? true : z14);
    }
}
