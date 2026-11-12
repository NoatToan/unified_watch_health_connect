package g62;

import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.view.GCMSnackbarContentLayout;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76082b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, int i14) {
        this.f76081a = i14;
        this.f76082b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer num;
        int i14 = this.f76081a;
        int i15 = 0;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = this.f76082b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                bVar.y6().f49138r.f48046g = (String) obj;
                return Unit.INSTANCE;
            case 1:
                m52.k kVar = (m52.k) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                kVar.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar.y6();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = bVar.f49115h;
                if (fVar == null) {
                    p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                    throw null;
                }
                int size = fVar.f49183h.size();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = bVar.f49115h;
                if (fVar2 == null) {
                    p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                    throw null;
                }
                ArrayList arrayListD1 = h0.d1(fVar2.f49183h);
                j23.l lVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.C;
                cVarY6.X4(size, kVar, arrayListD1, false);
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g gVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g) obj;
                if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) {
                    MenuItem menuItem = bVar.f49120m;
                    if (menuItem != null) {
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a aVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) gVar;
                        menuItem.setEnabled(aVar3.f49186a && aVar3.f49188c);
                    }
                    GCMComplexOneLineButton gCMComplexOneLineButton = bVar.f49112e;
                    if (gCMComplexOneLineButton == null) {
                        p005kotlin.jvm.internal.s.m("addAnotherLegButton");
                        throw null;
                    }
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a aVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) gVar;
                    int i16 = aVar4.f49189d;
                    gCMComplexOneLineButton.setEnabled(aVar4.f49187b);
                    ComposeView composeView = bVar.f49111d;
                    if (composeView == null) {
                        p005kotlin.jvm.internal.s.m("audioNoteView");
                        throw null;
                    }
                    composeView.setVisibility(aVar4.f49190e ? 0 : 8);
                    GCMSnackbarContentLayout gCMSnackbarContentLayout = bVar.f49118k;
                    if (i16 != -1) {
                        if (gCMSnackbarContentLayout == null) {
                            p005kotlin.jvm.internal.s.m("snackbarFooter");
                            throw null;
                        }
                        gCMSnackbarContentLayout.getMessageView().setText(bVar.getString(i16));
                        GCMSnackbarContentLayout gCMSnackbarContentLayout2 = bVar.f49118k;
                        if (gCMSnackbarContentLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("snackbarFooter");
                            throw null;
                        }
                        gCMSnackbarContentLayout2.setVisibility(0);
                        NestedScrollView nestedScrollView = bVar.f49119l;
                        if (nestedScrollView == null) {
                            p005kotlin.jvm.internal.s.m("scrollView");
                            throw null;
                        }
                        nestedScrollView.post(new eh2.b(bVar, 12));
                    } else {
                        if (gCMSnackbarContentLayout == null) {
                            p005kotlin.jvm.internal.s.m("snackbarFooter");
                            throw null;
                        }
                        gCMSnackbarContentLayout.setVisibility(8);
                    }
                } else {
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                }
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                WorkoutDetailsDTO workoutDetailsDTO = (WorkoutDetailsDTO) ((o13.p) obj).f128595b;
                LinkedHashMap linkedHashMap = bVar.y6().f49144z;
                ComposeView composeView2 = bVar.f49110c;
                if (composeView2 == null) {
                    p005kotlin.jvm.internal.s.m("noteView");
                    throw null;
                }
                composeView2.setContent(new z3.e(-1957368693, true, new f(workoutDetailsDTO, bVar)));
                GCMComplexTwoLineButton gCMComplexTwoLineButton = bVar.f49113f;
                if (gCMComplexTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("transitions");
                    throw null;
                }
                gCMComplexTwoLineButton.g(workoutDetailsDTO != null ? workoutDetailsDTO.J0 : false);
                int iIntValue = (workoutDetailsDTO == null || (num = workoutDetailsDTO.f48049j) == null) ? 0 : num.intValue();
                ComposeView composeView3 = bVar.f49117j;
                if (iIntValue > 0) {
                    if (composeView3 == null) {
                        p005kotlin.jvm.internal.s.m("estimatesView");
                        throw null;
                    }
                    composeView3.setVisibility(0);
                    ComposeView composeView4 = bVar.f49117j;
                    if (composeView4 == null) {
                        p005kotlin.jvm.internal.s.m("estimatesView");
                        throw null;
                    }
                    composeView4.setContent(new z3.e(179700368, true, new f(bVar, workoutDetailsDTO, 2)));
                } else {
                    if (composeView3 == null) {
                        p005kotlin.jvm.internal.s.m("estimatesView");
                        throw null;
                    }
                    composeView3.setVisibility(8);
                }
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar3 = bVar.f49115h;
                if (fVar3 == null) {
                    p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                    throw null;
                }
                fVar3.r(workoutDetailsDTO == null ? new WorkoutDetailsDTO() : workoutDetailsDTO, linkedHashMap);
                if (workoutDetailsDTO != null) {
                    com.garmin.android.apps.connectmobile.workouts.data.model.a aVarC = workoutDetailsDTO.C();
                    ComposeView composeView5 = bVar.f49111d;
                    if (composeView5 == null) {
                        p005kotlin.jvm.internal.s.m("audioNoteView");
                        throw null;
                    }
                    composeView5.setContent(new z3.e(411105348, true, new e(aVarC, bVar, i15)));
                }
                bVar.y6().b5(workoutDetailsDTO != null ? workoutDetailsDTO.Q0 : null);
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                ((b.s) obj).getClass();
                bVar.requireActivity().finish();
                return Unit.INSTANCE;
        }
    }
}
