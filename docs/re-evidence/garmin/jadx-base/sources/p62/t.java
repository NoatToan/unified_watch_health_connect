package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp62/t;", "Lp62/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context) {
        super(context);
        context.getClass();
    }

    @Override // p62.j, p62.f, p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        j0Var.f48230o = this.f136225a.getString(x52.d.BELOW.f189069b);
        Object obj = objArr[0];
        j0Var.f48229n = f.m(kVar, j0Var, obj instanceof m52.a ? (m52.a) obj : null);
        return j0Var;
    }

    @Override // p62.j, p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        Context context = this.f136225a;
        String string = context.getString(R.string.workout_set_intensity_target);
        string.getClass();
        String string2 = context.getString(R.string.lbl_bpm);
        string2.getClass();
        return f.l(string, string2);
    }
}
