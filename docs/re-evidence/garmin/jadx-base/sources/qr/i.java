package qr;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146242a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ am.x0 f146243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsFragment f146244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f146245d;

    public /* synthetic */ i(am.x0 x0Var, ActivityDetailsFragment activityDetailsFragment, long j8) {
        this.f146243b = x0Var;
        this.f146244c = activityDetailsFragment;
        this.f146245d = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f146242a;
        final long j8 = this.f146245d;
        final ActivityDetailsFragment activityDetailsFragment = this.f146244c;
        final am.x0 x0Var = this.f146243b;
        switch (i14) {
            case 0:
                fw.m mVar = (fw.m) obj;
                int i15 = ActivityDetailsFragment.I;
                fw.p pVar = mVar.f73769b;
                if (pVar == fw.p.SUCCESS) {
                    T t7 = mVar.f73770c;
                    activityDetailsFragment.A6().getClass();
                    List<? extends Object> list = (t7 == 0 || !(t7 instanceof List)) ? null : (List) t7;
                    if (list != null) {
                        g22.e.l(activityDetailsFragment);
                        activityDetailsFragment.A6().f12261c.f(activityDetailsFragment.getViewLifecycleOwner(), new ActivityDetailsFragment.k(new i(x0Var, activityDetailsFragment, j8)));
                        aq.u2 u2VarA6 = activityDetailsFragment.A6();
                        u2VarA6.getClass();
                        ge1.b.T(androidx.lifecycle.v1.a(u2VarA6), null, null, new aq.r2(u2VarA6, null), 3);
                        activityDetailsFragment.A6().f12264f.f(activityDetailsFragment.getViewLifecycleOwner(), new androidx.lifecycle.z0() { // from class: qr.j
                            @Override // androidx.lifecycle.z0
                            public final void onChanged(Object obj2) {
                                int i16 = ActivityDetailsFragment.I;
                                if (obj2 != null) {
                                    ActivityDetailsFragment activityDetailsFragment2 = activityDetailsFragment;
                                    t tVarZ6 = activityDetailsFragment2.z6();
                                    tVarZ6.H1 = true;
                                    tVarZ6.I4();
                                    am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
                                    am.x0 x0Var2 = x0Var;
                                    boolean zH = am.z0.H(x0Var2.f4358a);
                                    long j14 = j8;
                                    if (zH) {
                                        dVar.M().c(activityDetailsFragment2.requireContext(), j14);
                                    } else {
                                        dVar.M().a(activityDetailsFragment2.requireContext(), x0Var2, j14);
                                    }
                                }
                            }
                        });
                        activityDetailsFragment.A6().y4(list);
                    }
                } else if (pVar == fw.p.ERROR) {
                    g22.e.f(activityDetailsFragment);
                    Context contextRequireContext = activityDetailsFragment.requireContext();
                    contextRequireContext.getClass();
                    String string = activityDetailsFragment.getString(R.string.activities_trim_failed);
                    string.getClass();
                    String string2 = activityDetailsFragment.getString(R.string.activities_trim_error_message);
                    string2.getClass();
                    new r22.k0(contextRequireContext, new r22.k0.a(string, string2, false, false, null, null, activityDetailsFragment.getString(R.string.lbl_ok), null, new d(activityDetailsFragment, 4), null, null, null, 3772, null));
                }
                break;
            default:
                int i16 = ActivityDetailsFragment.I;
                if (am.z0.H(x0Var.f4358a)) {
                    t tVarZ6 = activityDetailsFragment.z6();
                    tVarZ6.H1 = true;
                    tVarZ6.I4();
                    ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).M().c(activityDetailsFragment.requireContext(), j8);
                    Unit unit = Unit.INSTANCE;
                } else {
                    Context contextRequireContext2 = activityDetailsFragment.requireContext();
                    contextRequireContext2.getClass();
                    String string3 = activityDetailsFragment.getString(R.string.activities_trim_in_progress);
                    string3.getClass();
                    String string4 = activityDetailsFragment.getString(R.string.activities_trim_in_progress_message);
                    string4.getClass();
                    new r22.k0(contextRequireContext2, new r22.k0.a(string3, string4, false, false, null, null, activityDetailsFragment.getString(R.string.lbl_ok), null, new d(activityDetailsFragment, 5), null, null, null, 3772, null));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(ActivityDetailsFragment activityDetailsFragment, long j8, am.x0 x0Var) {
        this.f146244c = activityDetailsFragment;
        this.f146245d = j8;
        this.f146243b = x0Var;
    }
}
