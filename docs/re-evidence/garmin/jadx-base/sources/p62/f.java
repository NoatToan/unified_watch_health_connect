package p62;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp62/f;", "Lp62/b;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f136225a;

    public f(Context context) {
        context.getClass();
        this.f136225a = context;
    }

    public static String l(String str, String str2) {
        return e5.g(str, StringUtils.SPACE, str2.length() == 0 ? "" : am.j.m("(", str2, ")"));
    }

    public static double m(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, m52.a aVar) {
        kVar.getClass();
        x52.c.f189053e.getClass();
        x52.c cVarA = x52.c.a.a(aVar);
        if (cVarA == null) {
            return 0.0d;
        }
        x52.e.a aVar2 = x52.e.f189070c;
        m52.d dVar = j0Var.f48217c;
        aVar2.getClass();
        return cVarA.a(kVar, x52.e.a.a(dVar));
    }

    @Override // p62.r
    public com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        Object obj = objArr[0];
        j0Var.f48229n = m(kVar, j0Var, obj instanceof m52.a ? (m52.a) obj : null);
        return j0Var;
    }

    @Override // p62.r
    public SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return new e(this, 0, j0Var, context);
    }

    public abstract double j(int[] iArr);

    public final String k(String str) {
        return tn.k.g(this.f136225a.getString(R.string.workout_set_duration), str.length() == 0 ? "" : am.j.m(" (", str, ")"));
    }

    public double n(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        x52.c.a aVar = x52.c.f189053e;
        m52.a aVar2 = j0Var.f48227l;
        aVar.getClass();
        x52.c cVarA = x52.c.a.a(aVar2);
        if (cVarA != null) {
            return cVarA.f189062c;
        }
        return Double.MAX_VALUE;
    }

    public double o(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        x52.c.a aVar = x52.c.f189053e;
        m52.a aVar2 = j0Var.f48227l;
        aVar.getClass();
        x52.c cVarA = x52.c.a.a(aVar2);
        if (cVarA != null) {
            return cVarA.f189061b;
        }
        return 0.0d;
    }
}
