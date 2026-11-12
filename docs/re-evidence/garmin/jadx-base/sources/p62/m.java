package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp62/m;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, m52.k kVar, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        int i14 = (int) j0Var.F;
        x52.a.f189039c.getClass();
        x52.a aVarA = x52.a.C3515a.a(i14);
        if (aVarA != null) {
            return this.f136215a.getString(aVarA.f189044b);
        }
        return null;
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        j0Var.F = x52.a.RECOVERY.f189043a;
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
        x52.a.C3515a c3515a = x52.a.f189039c;
        int i14 = (int) j0Var.F;
        c3515a.getClass();
        x52.a aVarA = x52.a.C3515a.a(i14);
        spinnerDialogView.setSpinnerCount(1);
        spinnerDialogView.setDelimiters(null);
        spinnerDialogView.d(0, 1, (int) o(j0Var).f189101f, (aVarA != null ? aVarA.ordinal() : 0) + 1, new h(this, 1));
    }

    @Override // p62.a0, p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        x52.a aVar;
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length != 1) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        x52.a.C3515a c3515a = x52.a.f189039c;
        int i14 = 0;
        int i15 = iArr[0] - 1;
        c3515a.getClass();
        x52.a[] aVarArrValues = x52.a.values();
        int length = aVarArrValues.length;
        while (true) {
            if (i14 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i14];
            if (aVar.ordinal() == i15) {
                break;
            }
            i14++;
        }
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f189043a) : null;
        if (numValueOf != null) {
            j0Var.F = numValueOf.intValue();
        }
        return j0Var;
    }

    @Override // p62.a0
    public final String m(double d14) {
        return null;
    }

    public /* synthetic */ m(Context context, m52.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, (i14 & 4) != 0 ? true : z14);
    }
}
