package ty1;

import android.content.DialogInterface;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSegmentedButton;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e2 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 f167100b;

    public /* synthetic */ e2(com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var, int i14) {
        this.f167099a = i14;
        this.f167100b = a0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        int i15 = this.f167099a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = this.f167100b;
        switch (i15) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                a0Var.F6().B6(null);
                a0Var.F6().J6(null);
                a0Var.F6().S6();
                dialogInterface.dismiss();
                return;
            case 1:
                GCMSegmentedButton gCMSegmentedButton = a0Var.f45793j;
                if (gCMSegmentedButton == null) {
                    p005kotlin.jvm.internal.s.m("mShareableButton");
                    throw null;
                }
                gCMSegmentedButton.c();
                AddTIEventViewModel addTIEventViewModelF6 = a0Var.F6();
                GCMSegmentedButton gCMSegmentedButton2 = a0Var.f45793j;
                if (gCMSegmentedButton2 == null) {
                    p005kotlin.jvm.internal.s.m("mShareableButton");
                    throw null;
                }
                addTIEventViewModelF6.E6(gCMSegmentedButton2.a());
                dialogInterface.dismiss();
                return;
            case 2:
                AppCompatButton appCompatButton = a0Var.O0;
                if (appCompatButton == null) {
                    p005kotlin.jvm.internal.s.m("mAddToCalendarButton");
                    throw null;
                }
                appCompatButton.performClick();
                dialogInterface.dismiss();
                return;
            case 3:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                if (!a0Var.F6().f46439u2 || (eVar = a0Var.f45783e) == null || eVar.e0()) {
                    List<com.garmin.android.apps.connectmobile.courses.model.d> listD = a0Var.F6().l5().d();
                    if (listD != null) {
                        for (com.garmin.android.apps.connectmobile.courses.model.d dVar : listD) {
                            if (!dVar.F()) {
                                AddTIEventViewModel addTIEventViewModelF7 = a0Var.F6();
                                String str = dVar.courseId;
                                ge1.b.T(androidx.lifecycle.v1.a(addTIEventViewModelF7), null, null, new mz1.j(addTIEventViewModelF7, str != null ? Long.parseLong(str) : -1L, false, null), 3);
                                a0Var.F6().S6();
                            }
                        }
                    }
                } else {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = a0Var.f45783e;
                    if (eVar2 != null) {
                        eVar2.z0(true);
                        AddTIEventViewModel addTIEventViewModelF8 = a0Var.F6();
                        String str2 = eVar2.courseId;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ge1.b.T(androidx.lifecycle.v1.a(addTIEventViewModelF8), null, null, new mz1.z(addTIEventViewModelF8, str2, eVar2, null), 3);
                    }
                }
                dialogInterface.dismiss();
                return;
            default:
                GCMSegmentedButton gCMSegmentedButton3 = a0Var.f45793j;
                if (gCMSegmentedButton3 == null) {
                    p005kotlin.jvm.internal.s.m("mShareableButton");
                    throw null;
                }
                gCMSegmentedButton3.c();
                AddTIEventViewModel addTIEventViewModelF9 = a0Var.F6();
                GCMSegmentedButton gCMSegmentedButton4 = a0Var.f45793j;
                if (gCMSegmentedButton4 == null) {
                    p005kotlin.jvm.internal.s.m("mShareableButton");
                    throw null;
                }
                addTIEventViewModelF9.E6(gCMSegmentedButton4.a());
                dialogInterface.dismiss();
                return;
        }
    }
}
