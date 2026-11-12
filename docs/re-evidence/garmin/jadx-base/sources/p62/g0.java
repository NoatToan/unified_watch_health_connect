package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp62/g0;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "targetList", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Ljava/util/List;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> f136226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, m52.k kVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
        this.f136226d = list;
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        boolean z14 = this.f136217c;
        Context context = this.f136215a;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = this.f136226d;
        return z14 ? gl1.y.m(j0Var.f48236w, j0Var.f48237x, j0Var.f48238y, list, context) : gl1.y.m(j0Var.f48239z, j0Var.A, j0Var.B, list, context);
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        return j0Var;
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

    public /* synthetic */ g0(Context context, m52.k kVar, List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, list, (i14 & 8) != 0 ? true : z14);
    }
}
