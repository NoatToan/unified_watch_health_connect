package c62;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lc62/b1;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lr52/c;", "<init>", "()V", "", "isThirdPartyWorkout", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, r52.c> {
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(r52.c cVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        cVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(503987489);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zIsLoading = cVar.isLoading();
            boolean z17 = !zIsLoading;
            boolean z18 = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(eVar));
            Object objQ = o0VarE.q();
            if (z18) {
                objQ = new c32.k(eVar, 7);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c32.k(eVar, 7);
                    o0VarE.K(objQ);
                }
            }
            o13.t tVarB = o13.m.b((e23.a) objQ);
            com.garmin.android.apps.connectmobile.workouts.data.model.y f48583g = eVar.getF48583g();
            f48583g.getClass();
            boolean z19 = (f48583g instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.a) || (f48583g instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.b);
            if (!(eVar.o() instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a) || eVar.h()) {
                if (eVar.h()) {
                    o0VarE.C(-913866609);
                } else if (eVar.getF48577a().I()) {
                    o0VarE.C(-913698434);
                    cVar.c("RESCHEDULE_WORKOUT", gl1.y.Q(o0VarE, R.string.lbl_reschedule), (zIsLoading || eVar.f() || eVar.g()) ? false : true);
                } else {
                    if (eVar.getF48577a().D()) {
                        o0VarE.C(-913245803);
                        WorkoutScheduleDTO f48578b = eVar.getF48578b();
                        boolean z24 = (g22.k.c(f48578b != null ? f48578b.C() : null) || eVar.j()) ? false : true;
                        if (eVar.t() || !z24) {
                            o0VarE.C(-912827551);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-913046659);
                            cVar.c("RESCHEDULE_WORKOUT", gl1.y.Q(o0VarE, R.string.lbl_reschedule), z17);
                            o0VarE.g0(false);
                        }
                        if (eVar.v() || eVar.t()) {
                            o0VarE.C(-912537887);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-912749307);
                            cVar.c("REMOVE_WORKOUT", gl1.y.Q(o0VarE, R.string.lbl_remove), z17);
                            o0VarE.g0(false);
                        }
                        if (z24 && z19) {
                            o0VarE.C(-912471547);
                            String strQ = gl1.y.Q(o0VarE, R.string.lbl_send_to_device);
                            s62.a.f157643a.getClass();
                            t62.b.f162798a.getClass();
                            cVar.b("SEND_TO_DEVICE", strQ, x62.n.a(v62.l2.f175943a), z17);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-912198623);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(false);
                    } else if (eVar.x() != com.garmin.android.apps.connectmobile.workouts.presentation.details.c.ForScheduledWorkout || eVar.getF48577a().G()) {
                        boolean z25 = false;
                        if (eVar.l().f24690a) {
                            o0VarE.C(-911323617);
                        } else if (eVar.getF48577a().G()) {
                            o0VarE.C(-911208111);
                            WorkoutScheduleDTO f48578b2 = eVar.getF48578b();
                            boolean z26 = (g22.k.c(f48578b2 != null ? f48578b2.C() : null) || eVar.j()) ? false : true;
                            if (eVar.v()) {
                                o0VarE.C(-910813791);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-911025211);
                                cVar.c("REMOVE_WORKOUT", gl1.y.Q(o0VarE, R.string.lbl_remove), z17);
                                o0VarE.g0(false);
                            }
                            if (z19) {
                                o0VarE.C(-910764749);
                                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_send_to_device);
                                s62.a.f157643a.getClass();
                                t62.b.f162798a.getClass();
                                cVar.b("SEND_TO_DEVICE", strQ2, x62.n.a(v62.l2.f175943a), !zIsLoading && z26);
                                z25 = false;
                                o0VarE.g0(false);
                            } else {
                                z25 = false;
                                o0VarE.C(-910474527);
                                o0VarE.g0(false);
                            }
                            cVar.c("EDIT_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_edit_workout), z17);
                            cVar.c("RENAME_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_rename), z17);
                        } else if (eVar.B().f116776l) {
                            o0VarE.C(-909980356);
                            if (z19) {
                                o0VarE.C(-909982557);
                                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_send_to_device);
                                s62.a.f157643a.getClass();
                                t62.b.f162798a.getClass();
                                cVar.b("SEND_TO_DEVICE", strQ3, x62.n.a(v62.l2.f175943a), (zIsLoading || eVar.getF48577a().Q0.isEmpty()) ? false : true);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-909676959);
                                o0VarE.g0(false);
                            }
                            if (((Boolean) tVarB.getValue()).booleanValue()) {
                                z15 = false;
                                o0VarE.C(-908748447);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-909610464);
                                cVar.c("HELP", gl1.y.Q(o0VarE, R.string.lbl_help), !zIsLoading && eVar.getF48577a().c0());
                                cVar.c("EDIT_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_edit_workout), z17);
                                cVar.c("CLONE_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_lbl_duplicate), z17);
                                cVar.c("RENAME_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_rename), z17);
                                z15 = false;
                                o0VarE.g0(false);
                            }
                            cVar.c("ADD_TO_CALENDAR", gl1.y.Q(o0VarE, R.string.workout_add_to_calendar), z17);
                            cVar.c("DELETE_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_delete_workout), z17);
                            o0VarE.g0(z15);
                        } else {
                            o0VarE.C(-908294607);
                            if (z19) {
                                o0VarE.C(-908289213);
                                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_send_to_device);
                                s62.a.f157643a.getClass();
                                t62.b.f162798a.getClass();
                                cVar.b("SEND_TO_DEVICE", strQ4, x62.n.a(v62.l2.f175943a), (zIsLoading || eVar.getF48577a().Q0.isEmpty()) ? false : true);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-907983615);
                                o0VarE.g0(false);
                            }
                            if (((Boolean) tVarB.getValue()).booleanValue()) {
                                z14 = false;
                                o0VarE.C(-907298143);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-907924715);
                                cVar.c("EDIT_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_edit_workout), z17);
                                cVar.c("CLONE_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_lbl_duplicate), z17);
                                cVar.c("RENAME_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_rename), z17);
                                z14 = false;
                                o0VarE.g0(false);
                            }
                            cVar.c("ADD_TO_CALENDAR", gl1.y.Q(o0VarE, R.string.workout_add_to_calendar), z17);
                            cVar.c("DELETE_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_delete_workout), z17);
                            o0VarE.g0(z14);
                        }
                        o0VarE.g0(z25);
                    } else {
                        o0VarE.C(-912037175);
                        if (((Boolean) tVarB.getValue()).booleanValue()) {
                            z16 = false;
                            o0VarE.C(-911585567);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-912005524);
                            cVar.c("EDIT_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_edit_workout), z17);
                            cVar.c("RENAME_WORKOUT", gl1.y.Q(o0VarE, R.string.workout_rename), z17);
                            z16 = false;
                            o0VarE.g0(false);
                        }
                        cVar.c("REMOVE_FROM_CALENDAR", gl1.y.Q(o0VarE, R.string.workout_remove_from_calendar), z17);
                        o0VarE.g0(z16);
                    }
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-914013363);
                r52.c.a(cVar, "SAVE_WORKOUT", gl1.y.Q(o0VarE, R.string.lbl_edit), false, 12);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, cVar, eVar, i14, 16);
        }
    }
}
