package aq;

import android.content.DialogInterface;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesActivity;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditExercisesActivity f12130b;

    public /* synthetic */ o(EditExercisesActivity editExercisesActivity, int i14) {
        this.f12129a = i14;
        this.f12130b = editExercisesActivity;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0095  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f12129a;
        final EditExercisesActivity editExercisesActivity = this.f12130b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj;
                if (cVar != null) {
                    editExercisesActivity.f29769d = cVar;
                    editExercisesActivity.f29777l = u.y6(editExercisesActivity.f29770e, editExercisesActivity.f29771f, editExercisesActivity.f29767b, cVar, editExercisesActivity.f29772g);
                    androidx.fragment.app.v supportFragmentManager = editExercisesActivity.getSupportFragmentManager();
                    androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                    u uVar = editExercisesActivity.f29777l;
                    if (uVar == null) {
                        p005kotlin.jvm.internal.s.m("fragment");
                        throw null;
                    }
                    aVarB.l(R.id.edit_exercises_fragment, uVar, null);
                    aVarB.e();
                } else {
                    EditExercisesActivity.a aVar = EditExercisesActivity.f29765m;
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
                EditExercisesActivity.a aVar2 = EditExercisesActivity.f29765m;
                v2Var.getClass();
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_EXERCISE_SETS", editExercisesActivity.f29767b);
                    editExercisesActivity.setResult(-1, intent);
                    editExercisesActivity.finish();
                } else {
                    com.garmin.android.apps.connectmobile.v2.a aVar3 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
                    final int i15 = 1;
                    if (p005kotlin.jvm.internal.s.g(aVar3.f47383a, new NoNetworkException())) {
                        androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(editExercisesActivity);
                        aVar4.setTitle(editExercisesActivity.getString(R.string.common_network_reachability_error));
                        aVar4.setMessage(editExercisesActivity.getString(R.string.common_no_internet_save_error_msg));
                        aVar4.setCancelable(true);
                        final int i16 = 0;
                        aVar4.setPositiveButton(editExercisesActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.p
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                int i18 = i16;
                                EditExercisesActivity editExercisesActivity2 = editExercisesActivity;
                                switch (i18) {
                                    case 0:
                                        EditExercisesActivity.a aVar5 = EditExercisesActivity.f29765m;
                                        editExercisesActivity2.finish();
                                        break;
                                    default:
                                        EditExercisesActivity.a aVar6 = EditExercisesActivity.f29765m;
                                        editExercisesActivity2.finish();
                                        break;
                                }
                            }
                        });
                        aVar4.setNegativeButton(editExercisesActivity.getString(R.string.lbl_cancel), new ag0.e(6));
                        androidx.appcompat.app.e eVarCreate = aVar4.create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                    } else {
                        j23.l lVar = new j23.l(500, 599);
                        Integer num = aVar3.f47384b;
                        if (num == null || !lVar.d(num.intValue())) {
                            androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(editExercisesActivity);
                            aVar5.setTitle(editExercisesActivity.getString(R.string.common_save_error_title));
                            aVar5.setMessage(editExercisesActivity.getString(R.string.common_save_error_msg));
                            aVar5.setCancelable(true);
                            aVar5.setPositiveButton(editExercisesActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.p
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i17) {
                                    int i18 = i15;
                                    EditExercisesActivity editExercisesActivity2 = editExercisesActivity;
                                    switch (i18) {
                                        case 0:
                                            EditExercisesActivity.a aVar6 = EditExercisesActivity.f29765m;
                                            editExercisesActivity2.finish();
                                            break;
                                        default:
                                            EditExercisesActivity.a aVar7 = EditExercisesActivity.f29765m;
                                            editExercisesActivity2.finish();
                                            break;
                                    }
                                }
                            });
                            aVar5.setNegativeButton(editExercisesActivity.getString(R.string.lbl_cancel), new ag0.e(5));
                            androidx.appcompat.app.e eVarCreate2 = aVar5.create();
                            eVarCreate2.getClass();
                            eVarCreate2.show();
                        } else {
                            androidx.appcompat.app.e.a aVar6 = new androidx.appcompat.app.e.a(editExercisesActivity);
                            aVar6.setTitle(editExercisesActivity.getString(R.string.common_network_reachability_error));
                            aVar6.setMessage(editExercisesActivity.getString(R.string.common_no_internet_save_error_msg));
                            aVar6.setCancelable(true);
                            final int i17 = 0;
                            aVar6.setPositiveButton(editExercisesActivity.getString(R.string.lbl_don_t_save), new DialogInterface.OnClickListener() { // from class: aq.p
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                    int i19 = i17;
                                    EditExercisesActivity editExercisesActivity2 = editExercisesActivity;
                                    switch (i19) {
                                        case 0:
                                            EditExercisesActivity.a aVar7 = EditExercisesActivity.f29765m;
                                            editExercisesActivity2.finish();
                                            break;
                                        default:
                                            EditExercisesActivity.a aVar8 = EditExercisesActivity.f29765m;
                                            editExercisesActivity2.finish();
                                            break;
                                    }
                                }
                            });
                            aVar6.setNegativeButton(editExercisesActivity.getString(R.string.lbl_cancel), new ag0.e(6));
                            androidx.appcompat.app.e eVarCreate3 = aVar6.create();
                            eVarCreate3.getClass();
                            eVarCreate3.show();
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
