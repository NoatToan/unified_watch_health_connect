package ew1;

import android.content.DialogInterface;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.events.components.GCMEditTextTrainingInitiative;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f66542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f66543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f66544d;

    public /* synthetic */ k(Object obj, int i14, Object obj2, int i15) {
        this.f66541a = i15;
        this.f66544d = obj;
        this.f66542b = i14;
        this.f66543c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f66541a;
        int i16 = this.f66542b;
        Object obj = this.f66543c;
        Object obj2 = this.f66544d;
        switch (i15) {
            case 0:
                n nVar = (n) obj2;
                String str = (String) obj;
                nVar.f66606r = 1609000.0d;
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = nVar.f66593e;
                if (gCMEditTextTrainingInitiative == null) {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
                gCMEditTextTrainingInitiative.getF34926b().setText(String.valueOf(i16));
                GCMComplexTwoLineButton gCMComplexTwoLineButton = nVar.f66594f;
                if (gCMComplexTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("goalDistance");
                    throw null;
                }
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(i16)}, 1)) + StringUtils.SPACE + str);
                nVar.F6(false);
                AppCompatButton appCompatButton = nVar.f66602n;
                if (appCompatButton == null) {
                    p005kotlin.jvm.internal.s.m("nextButton");
                    throw null;
                }
                appCompatButton.setEnabled(true);
                dialogInterface.dismiss();
                return;
            case 1:
                fv1.c cVar = (fv1.c) obj2;
                String str2 = (String) obj;
                cVar.f73689q = 1609000.0d;
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = cVar.f73676d;
                if (gCMEditTextTrainingInitiative2 == null) {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
                gCMEditTextTrainingInitiative2.getF34926b().setText(String.valueOf(i16));
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = cVar.f73677e;
                if (gCMComplexTwoLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("goalDistance");
                    throw null;
                }
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                gCMComplexTwoLineButton2.setButtonBottomLeftLabel(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(i16)}, 1)) + StringUtils.SPACE + str2);
                cVar.y6(false);
                AppCompatButton appCompatButton2 = cVar.f73685m;
                if (appCompatButton2 == null) {
                    p005kotlin.jvm.internal.s.m("nextButton");
                    throw null;
                }
                appCompatButton2.setEnabled(true);
                dialogInterface.dismiss();
                return;
            case 2:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f) obj2;
                q62.b bVar = (q62.b) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar2 = fVar.f49177b;
                if (bVar2 != null) {
                    bVar2.b(i16);
                    bVar.d();
                    ArrayList arrayList = fVar.f49183h;
                    if (p13.h0.e0(i16, arrayList) != null) {
                        arrayList.remove(i16);
                        fVar.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                int i17 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                j22.b.f96736a.getClass();
                j22.b.y((com.garmin.android.apps.connectmobile.userprofile.editimage.a) obj2, i16, (ArrayList) obj);
                return;
            case 4:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a aVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a) obj2;
                RadioButton radioButton = (RadioButton) obj;
                double d14 = aVar.f49607c;
                double d15 = aVar.f49613i;
                double d16 = aVar.f49608d;
                if (d14 > d16) {
                    aVar.f49608d = d14;
                    aVar.f49607c = d16;
                } else if (d14 == d16) {
                    if (d14 >= (radioButton.isChecked() ? aVar.f49611g : i16) + d15) {
                        aVar.f49607c -= d15;
                    } else {
                        aVar.f49608d += d15;
                    }
                }
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a.InterfaceC0979a interfaceC0979a = aVar.f49610f;
                double d17 = aVar.f49607c;
                double d18 = aVar.f49608d;
                m52.h hVar = aVar.f49609e;
                o62.b0 b0Var = (o62.b0) interfaceC0979a;
                WorkoutStepEditActivity workoutStepEditActivity = (WorkoutStepEditActivity) b0Var.f129647b;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.d dVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.d) b0Var.f129648c;
                WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = workoutStepEditActivity.da();
                boolean z14 = dVar.f49673a;
                androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.workouts.data.model.j0> y0Var = jVarDa.f49703c;
                if (z14) {
                    y0Var.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa.G4(), 0, null, false, false, null, 0.0d, null, d17, d18, hVar, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -917505, 16383));
                    return;
                } else {
                    y0Var.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, d17, d18, hVar, null, null, null, 0.0d, null, null, 536870911, 16383));
                    return;
                }
            case 5:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar3 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b) obj2;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                dialogInterface.getClass();
                pj1.s sVarY6 = bVar3.y6();
                l20.a aVar4 = ((yj1.f.b) obj).f197539f;
                if (aVar4 != null) {
                    ge1.b.T(androidx.lifecycle.v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar4, null), 3);
                }
                bVar3.z6(Integer.valueOf(i16));
                return;
            default:
                int i18 = xz0.o.f192801j;
                dialogInterface.dismiss();
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersInviteAccepted");
                ((xz0.o) obj2).f192802a.i4((InboxRequestItem) obj, i16);
                return;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, int i14, int i15) {
        this.f66541a = i15;
        this.f66544d = obj;
        this.f66543c = obj2;
        this.f66542b = i14;
    }
}
