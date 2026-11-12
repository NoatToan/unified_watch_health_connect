package c62;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import java.util.Arrays;
import java.util.Calendar;
import l72.i3;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class e0 extends p005kotlin.jvm.internal.q implements e23.l<i3, Unit> {
    public e0(Object obj) {
        super(1, obj, WorkoutDetailsActivity.class, "onMenuItemSelected", "onMenuItemSelected(Lcom/garmin/android/apps/ui/TitleBarMenuItem;)V", 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0103, please report this as an issue */
    @Override // e23.l
    public final Unit invoke(i3 i3Var) {
        Window window;
        WorkoutScheduleDTO workoutScheduleDTO;
        WorkoutDetailsDTO workoutDetailsDTO;
        WorkoutDetailsDTO workoutDetailsDTO2;
        WorkoutScheduleDTO workoutScheduleDTO2;
        WorkoutDetailsDTO workoutDetailsDTO3;
        i3 i3Var2 = i3Var;
        i3Var2.getClass();
        WorkoutDetailsActivity workoutDetailsActivity = (WorkoutDetailsActivity) this.receiver;
        o52.e eVar = workoutDetailsActivity.f48486d;
        int i14 = 2;
        int i15 = 3;
        int i16 = 1;
        switch (WorkoutDetailsActivity.b.f48488a[c1.valueOf(i3Var2.f111063a).ordinal()]) {
            case 1:
                workoutDetailsActivity.ga();
                break;
            case 2:
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.WORKOUT_ESTIMATE;
                aVar.getClass();
                HelpActivity.a.d(workoutDetailsActivity, lVar, null, null);
                break;
            case 3:
            case 4:
                workoutDetailsActivity.ha();
                break;
            case 5:
                new r22.c0(workoutDetailsActivity, DateTime.now().minusYears(1).withTimeAtStartOfDay().getMillis(), r22.c0.a(DateTime.now().plusYears(1)).getMillis(), Calendar.getInstance(), new u(workoutDetailsActivity, 0)).show();
                break;
            case 6:
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = workoutDetailsActivity.ea();
                WorkoutDetailsDTO workoutDetailsDTO4 = workoutDetailsActivity.ea().f48605r;
                Long lValueOf = workoutDetailsDTO4 != null ? Long.valueOf(workoutDetailsDTO4.f48040a) : null;
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                String string = workoutDetailsActivity.getString(R.string.workout_duplicate_default_format);
                string.getClass();
                WorkoutDetailsDTO workoutDetailsDTO5 = workoutDetailsActivity.ea().f48605r;
                String str = String.format(string, Arrays.copyOf(new Object[]{workoutDetailsDTO5 != null ? workoutDetailsDTO5.f48041b : null}, 1));
                w9.a aVarA = androidx.lifecycle.v1.a(fVarEa);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.g(lValueOf, str, fVarEa, null), 2);
                break;
            case 7:
                new androidx.appcompat.app.e.a(workoutDetailsActivity).setTitle(R.string.workout_delete_confirmation).setMessage(R.string.workout_delete_warning_message).setNegativeButton(R.string.lbl_cancel, new ag0.e(22)).setPositiveButton(R.string.lbl_delete, new ai1.a(workoutDetailsActivity, 8)).show();
                break;
            case 8:
                View viewInflate = LayoutInflater.from(workoutDetailsActivity).inflate(R.layout.workout_dialog, (ViewGroup) null);
                EditText editText = (EditText) viewInflate.findViewById(R.id.edit_text);
                if (!c22.b.f(workoutDetailsActivity)) {
                    editText.requestFocus();
                }
                WorkoutDetailsDTO workoutDetailsDTO6 = workoutDetailsActivity.ea().f48605r;
                editText.setText(workoutDetailsDTO6 != null ? workoutDetailsDTO6.f48041b : null);
                editText.setSingleLine();
                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(workoutDetailsActivity).setTitle(R.string.workout_name).setView(viewInflate).setPositiveButton(workoutDetailsActivity.getString(R.string.lbl_save), new ag0.d(6, workoutDetailsActivity, editText)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
                eVarCreate.getClass();
                if (eVarCreate.getWindow() != null && (window = eVarCreate.getWindow()) != null) {
                    window.setSoftInputMode(4);
                }
                eVarCreate.show();
                break;
            case 9:
                if (workoutDetailsActivity.ea().C <= 0) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa2 = workoutDetailsActivity.ea();
                    ge1.b.T(androidx.lifecycle.v1.a(fVarEa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.p(fVarEa2, workoutDetailsActivity.ea().B, null), 3);
                } else {
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa3 = workoutDetailsActivity.ea();
                    ge1.b.T(androidx.lifecycle.v1.a(fVarEa3), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.q(fVarEa3, workoutDetailsActivity.ea().C, workoutDetailsActivity.ea().B, null), 3);
                }
                break;
            case 10:
                WorkoutScheduleDTO workoutScheduleDTO3 = workoutDetailsActivity.ea().f48606t;
                if (workoutScheduleDTO3 != null) {
                    WorkoutDetailsDTO workoutDetailsDTO7 = workoutDetailsActivity.ea().f48605r;
                    if (workoutDetailsDTO7 != null && workoutDetailsDTO7.I()) {
                        eVar.t(workoutDetailsActivity, workoutScheduleDTO3);
                    } else {
                        eVar.E(workoutDetailsActivity, workoutScheduleDTO3);
                    }
                }
                break;
            case 11:
                if (workoutDetailsActivity.ea().f48606t != null) {
                    WorkoutScheduleDTO workoutScheduleDTO4 = workoutDetailsActivity.ea().f48606t;
                    if ((workoutScheduleDTO4 != null ? workoutScheduleDTO4.f48065a : null) != null && (workoutScheduleDTO2 = workoutDetailsActivity.ea().f48606t) != null && (workoutDetailsDTO3 = workoutScheduleDTO2.f48065a) != null && workoutDetailsDTO3.G()) {
                        com.garmin.android.apps.connectmobile.q1.b bVar = com.garmin.android.apps.connectmobile.q1.f41066b;
                        String string2 = workoutDetailsActivity.getString(R.string.msg_remove_workout);
                        string2.getClass();
                        String string3 = workoutDetailsActivity.getString(R.string.itp_remove_workout_body);
                        string3.getClass();
                        u uVar = new u(workoutDetailsActivity, i16);
                        bVar.getClass();
                        com.garmin.android.apps.connectmobile.q1 q1VarC = com.garmin.android.apps.connectmobile.q1.b.c(string2, string3, R.string.common_confirm, R.string.device_action_cancel, uVar);
                        androidx.fragment.app.v supportFragmentManager = workoutDetailsActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        q1VarC.v6(supportFragmentManager, null);
                    } else if (workoutDetailsActivity.ea().f48605r != null) {
                        if (workoutDetailsActivity.ea().f48606t != null) {
                            workoutScheduleDTO = workoutDetailsActivity.ea().f48606t;
                            if (workoutScheduleDTO != null) {
                                workoutDetailsDTO = workoutScheduleDTO.f48065a;
                            } else {
                                workoutDetailsDTO = null;
                            }
                            if (workoutDetailsDTO == null) {
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.WORKOUTS;
                                String str2 = "Error! " + workoutDetailsActivity.ea().f48606t + " or the workout details it contains was null!";
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "WorkoutDetailsActivity", str2);
                                workoutDetailsActivity.displayFailedMessage();
                            } else {
                                com.garmin.android.apps.connectmobile.q1.b bVar2 = com.garmin.android.apps.connectmobile.q1.f41066b;
                                String string4 = workoutDetailsActivity.getString(R.string.msg_remove_workout);
                                string4.getClass();
                                String string5 = workoutDetailsActivity.getString(R.string.msg_remove_workout_info);
                                string5.getClass();
                                u uVar2 = new u(workoutDetailsActivity, i15);
                                bVar2.getClass();
                                com.garmin.android.apps.connectmobile.q1 q1VarC2 = com.garmin.android.apps.connectmobile.q1.b.c(string4, string5, R.string.common_confirm, R.string.device_action_cancel, uVar2);
                                androidx.fragment.app.v supportFragmentManager2 = workoutDetailsActivity.getSupportFragmentManager();
                                supportFragmentManager2.getClass();
                                q1VarC2.v6(supportFragmentManager2, null);
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.WORKOUTS;
                            String str3 = "Error! " + workoutDetailsActivity.ea().f48606t + " or the workout details it contains was null!";
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "WorkoutDetailsActivity", str3);
                            workoutDetailsActivity.displayFailedMessage();
                        }
                    } else if (workoutDetailsActivity.ea().f48606t != null) {
                        workoutScheduleDTO = workoutDetailsActivity.ea().f48606t;
                        if (workoutScheduleDTO != null) {
                            workoutDetailsDTO = workoutScheduleDTO.f48065a;
                        } else {
                            workoutDetailsDTO = null;
                        }
                        if (workoutDetailsDTO == null) {
                            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.WORKOUTS;
                            String str4 = "Error! " + workoutDetailsActivity.ea().f48606t + " or the workout details it contains was null!";
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "WorkoutDetailsActivity", str4);
                            workoutDetailsActivity.displayFailedMessage();
                        } else {
                            com.garmin.android.apps.connectmobile.q1.b bVar3 = com.garmin.android.apps.connectmobile.q1.f41066b;
                            String string6 = workoutDetailsActivity.getString(R.string.msg_remove_workout);
                            string6.getClass();
                            String string7 = workoutDetailsActivity.getString(R.string.msg_remove_workout_info);
                            string7.getClass();
                            u uVar3 = new u(workoutDetailsActivity, i15);
                            bVar3.getClass();
                            com.garmin.android.apps.connectmobile.q1 q1VarC3 = com.garmin.android.apps.connectmobile.q1.b.c(string6, string7, R.string.common_confirm, R.string.device_action_cancel, uVar3);
                            androidx.fragment.app.v supportFragmentManager3 = workoutDetailsActivity.getSupportFragmentManager();
                            supportFragmentManager3.getClass();
                            q1VarC3.v6(supportFragmentManager3, null);
                        }
                    } else {
                        com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.WORKOUTS;
                        String str5 = "Error! " + workoutDetailsActivity.ea().f48606t + " or the workout details it contains was null!";
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "WorkoutDetailsActivity", str5);
                        workoutDetailsActivity.displayFailedMessage();
                    }
                } else if (workoutDetailsActivity.ea().f48605r != null && (workoutDetailsDTO2 = workoutDetailsActivity.ea().f48605r) != null && workoutDetailsDTO2.G()) {
                    com.garmin.android.apps.connectmobile.q1.b bVar4 = com.garmin.android.apps.connectmobile.q1.f41066b;
                    String string8 = workoutDetailsActivity.getString(R.string.msg_remove_workout);
                    string8.getClass();
                    String string9 = workoutDetailsActivity.getString(R.string.itp_remove_workout_body);
                    string9.getClass();
                    u uVar4 = new u(workoutDetailsActivity, i14);
                    bVar4.getClass();
                    com.garmin.android.apps.connectmobile.q1 q1VarC4 = com.garmin.android.apps.connectmobile.q1.b.c(string8, string9, R.string.common_confirm, R.string.device_action_cancel, uVar4);
                    androidx.fragment.app.v supportFragmentManager4 = workoutDetailsActivity.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    q1VarC4.v6(supportFragmentManager4, null);
                } else if (workoutDetailsActivity.ea().f48606t != null) {
                    workoutScheduleDTO = workoutDetailsActivity.ea().f48606t;
                    if (workoutScheduleDTO != null) {
                        workoutDetailsDTO = workoutScheduleDTO.f48065a;
                    } else {
                        workoutDetailsDTO = null;
                    }
                    if (workoutDetailsDTO == null) {
                        com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.WORKOUTS;
                        String str6 = "Error! " + workoutDetailsActivity.ea().f48606t + " or the workout details it contains was null!";
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var5, "WorkoutDetailsActivity", str6);
                        workoutDetailsActivity.displayFailedMessage();
                    } else {
                        com.garmin.android.apps.connectmobile.q1.b bVar5 = com.garmin.android.apps.connectmobile.q1.f41066b;
                        String string10 = workoutDetailsActivity.getString(R.string.msg_remove_workout);
                        string10.getClass();
                        String string11 = workoutDetailsActivity.getString(R.string.msg_remove_workout_info);
                        string11.getClass();
                        u uVar5 = new u(workoutDetailsActivity, i15);
                        bVar5.getClass();
                        com.garmin.android.apps.connectmobile.q1 q1VarC5 = com.garmin.android.apps.connectmobile.q1.b.c(string10, string11, R.string.common_confirm, R.string.device_action_cancel, uVar5);
                        androidx.fragment.app.v supportFragmentManager5 = workoutDetailsActivity.getSupportFragmentManager();
                        supportFragmentManager5.getClass();
                        q1VarC5.v6(supportFragmentManager5, null);
                    }
                } else {
                    com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.WORKOUTS;
                    String str7 = "Error! " + workoutDetailsActivity.ea().f48606t + " or the workout details it contains was null!";
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var6, "WorkoutDetailsActivity", str7);
                    workoutDetailsActivity.displayFailedMessage();
                }
                break;
            default:
                lc.u0.r();
                return null;
        }
        return Unit.INSTANCE;
    }
}
