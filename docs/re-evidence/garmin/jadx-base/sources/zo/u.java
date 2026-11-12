package zo;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.MultisportEditLegsActivity;
import com.garmin.android.apps.connectmobile.q1;
import o53.s0;
import z10.d1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k f206075b;

    public /* synthetic */ u(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar, int i14) {
        this.f206074a = i14;
        this.f206075b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f206074a;
        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar = this.f206075b;
        switch (i14) {
            case 0:
                ap.d dVar = kVar.f29372a;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                w9.a aVarA = v1.a(dVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new ap.k(dVar, null), 2);
                dVar.f11593e.f198248r.f(kVar.getViewLifecycleOwner(), kVar.f29380i);
                return;
            case 1:
                int i15 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                androidx.fragment.app.m activity = kVar.getActivity();
                MultisportEditLegsActivity multisportEditLegsActivity = activity instanceof MultisportEditLegsActivity ? (MultisportEditLegsActivity) activity : null;
                if (multisportEditLegsActivity != null) {
                    multisportEditLegsActivity.ca(false);
                    return;
                }
                return;
            default:
                int i16 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                if (d1.f()) {
                    Context contextRequireContext = kVar.requireContext();
                    contextRequireContext.getClass();
                    d1.o(contextRequireContext, new xk1.v(12));
                    return;
                }
                q1.b bVar = q1.f41066b;
                String string = kVar.getString(R.string.activities_restore_original_question);
                string.getClass();
                String string2 = kVar.getString(R.string.activities_delete_changes);
                string2.getClass();
                xw.b bVar2 = new xw.b(kVar, 20);
                bVar.getClass();
                q1 q1VarC = q1.b.c(string, string2, R.string.activities_restore_activity, R.string.lbl_cancel, bVar2);
                androidx.fragment.app.v childFragmentManager = kVar.getChildFragmentManager();
                childFragmentManager.getClass();
                q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                return;
        }
    }
}
