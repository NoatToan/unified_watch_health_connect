package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp62/j;", "Lp62/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        context.getClass();
    }

    @Override // p62.r
    public String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return v52.f.e(this.f136225a, j0Var.f48229n, j0Var.f48230o);
    }

    @Override // p62.f, p62.r
    public com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        j0Var.f48230o = this.f136225a.getString(x52.d.ABOVE.f189069b);
        super.d(kVar, j0Var, Arrays.copyOf(objArr, objArr.length));
        return j0Var;
    }

    @Override // p62.f, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return null;
    }

    @Override // p62.b
    public String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        String string = this.f136225a.getString(R.string.lbl_bpm);
        string.getClass();
        return k(string);
    }

    @Override // p62.b
    public final String g(double d14) {
        return null;
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(2);
        x52.d.a aVar = x52.d.f189064c;
        String str = j0Var.f48230o;
        aVar.getClass();
        Context context = this.f136225a;
        x52.d dVarA = x52.d.a.a(context, str);
        String string = context.getString(x52.d.ABOVE.f189068a);
        string.getClass();
        String string2 = context.getString(x52.d.BELOW.f189068a);
        string2.getClass();
        spinnerDialogView.e(0, new String[]{string, string2}, dVarA != null ? dVarA.ordinal() : 0);
        spinnerDialogView.d(1, (int) o(j0Var), (int) n(j0Var), (int) j0Var.f48229n, null);
    }

    @Override // p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length != 2) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        String string = this.f136225a.getString(x52.d.values()[iArr[0]].f189069b);
        string.getClass();
        j0Var.f48230o = string;
        j0Var.f48229n = iArr[1];
        return j0Var;
    }

    @Override // p62.f
    public final double j(int[] iArr) {
        iArr.getClass();
        return iArr[1];
    }
}
