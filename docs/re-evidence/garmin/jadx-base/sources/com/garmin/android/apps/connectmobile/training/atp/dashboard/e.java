package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import a61.d0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import c22.j0;
import c22.l3;
import c22.r0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.x;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.wallet.WalletConstants;
import cu1.h;
import cu1.q;
import cu1.w;
import e23.p;
import f12.l;
import fu1.g;
import fu1.t;
import fu1.v;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import ww1.y;
import xw1.j;
import xw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardFragment$onTrainingPlanUpdate$1", f = "TrainingPlanDashboardFragment.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f45443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f45444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, v vVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f45443b = dVar;
        this.f45444c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f45443b, this.f45444c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0531  */
    /* JADX WARN: Code duplicated, block: B:162:0x053b  */
    /* JADX WARN: Code duplicated, block: B:187:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:189:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x026d  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z14;
        d dVar;
        x xVar;
        androidx.fragment.app.v supportFragmentManager;
        List<fu1.d> list;
        String string;
        DateTime dateTimeP;
        j jVar;
        AppCompatButton appCompatButton;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f45442a;
        if (i14 == 0) {
            r.b(obj);
            d dVar2 = this.f45443b;
            cu1.a aVar2 = dVar2.f45419g;
            v vVar = this.f45444c;
            if (aVar2 != null) {
                boolean z15 = dVar2.f45432v;
                ArrayList arrayList = aVar2.f55612d;
                vVar.getClass();
                xw1.d dVar3 = vVar.f73560a;
                q qVar = aVar2.f55617i;
                qVar.b();
                w wVar = aVar2.f55618j;
                wVar.b();
                cu1.i iVar = aVar2.f55619k;
                iVar.b();
                cu1.r rVar = aVar2.f55620l;
                rVar.b();
                cu1.v vVar2 = aVar2.f55621m;
                vVar2.b();
                h hVar = aVar2.f55622n;
                hVar.b();
                View view2 = aVar2.f55623o;
                view2.getClass();
                view2.setVisibility(8);
                if (dVar3 != null) {
                    if (dVar3.a0() || dVar3.M()) {
                        aVar = aVar;
                        dVar2 = dVar2;
                        aVar2 = aVar2;
                        iVar.a();
                        boolean zM = dVar3.M();
                        TextView textView = iVar.f55682c;
                        ImageView imageView = iVar.f55681b;
                        View view3 = iVar.f55688a;
                        if (zM) {
                            imageView.setImageResource(2131232008);
                            textView.setText(view3.getContext().getString(R.string.lbl_atp_plan_not_completed));
                        } else {
                            Context context = view3.getContext();
                            context.getClass();
                            imageView.setImageDrawable(r0.b(context, R.drawable.challenges, R.color.gcm_icon_primary_action, R.color.gcm_icon_on_color, r0.a.DEFAULT, 48));
                            textView.setText(view3.getContext().getString(R.string.lbl_plan_completed));
                        }
                    } else {
                        if (dVar3.e0()) {
                            if (z15) {
                                vVar2.a();
                                y pause = dVar3.getPause();
                                String date = pause != null ? pause.getDate() : null;
                                TextView textView2 = vVar2.f55713d;
                                View view4 = vVar2.f55688a;
                                String str = date;
                                textView2.setText(view4.getContext().getString(R.string.lbl_data_permission_required));
                                TextView textView3 = vVar2.f55714e;
                                Context context2 = view4.getContext();
                                String strB = j0.b(DateTime.parse(str), "MMMM d", null);
                                if (strB == null) {
                                    strB = "";
                                }
                                textView3.setText(context2.getString(R.string.msg_plan_paused_on_date, strB));
                                vVar2.f55712c.setText(view4.getContext().getString(R.string.lbl_review_permission));
                            } else {
                                rVar.a();
                                y pause2 = dVar3.getPause();
                                rVar.f55703d.setText(rVar.f55688a.getContext().getString(R.string.msg_resume_plan, j0.b(DateTime.parse(pause2 != null ? pause2.getDate() : null), "MMMM d", null)));
                            }
                        }
                        if (dVar3.I() && dVar3.Z()) {
                            hVar.a();
                            xw1.b action = dVar3.getAction();
                            TextView textView4 = hVar.f55678d;
                            TextView textView5 = hVar.f55677c;
                            LinearLayout linearLayout = hVar.f55679e;
                            if (action != null) {
                                textView5.setText(action.getActionBodyLocalized());
                                List<j> listF = action.f();
                                if (listF != null) {
                                    Iterator<T> it = listF.iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!((j) next).i());
                                    jVar = (j) next;
                                } else {
                                    jVar = null;
                                }
                                if (jVar != null) {
                                    textView4.setText(R.string.msg_plan_tab_bar_info);
                                    textView4.setVisibility(0);
                                } else {
                                    textView4.getClass();
                                    textView4.setVisibility(8);
                                }
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(textView5.getContext());
                                linearLayout.removeAllViews();
                                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                layoutParams.getClass();
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                layoutParams2.setMargins(25, 20, 25, 20);
                                List<j> listF2 = action.f();
                                int size = listF2 != null ? listF2.size() : 0;
                                List<j> listF3 = action.f();
                                if (listF3 != null) {
                                    Iterator it3 = listF3.iterator();
                                    int i15 = 0;
                                    while (it3.hasNext()) {
                                        Object next2 = it3.next();
                                        int i16 = i15 + 1;
                                        if (i15 < 0) {
                                            p13.x.q();
                                            throw null;
                                        }
                                        Iterator it4 = it3;
                                        j jVar2 = (j) next2;
                                        if (size < 1) {
                                            appCompatButton = null;
                                        } else if (i15 == 0) {
                                            View viewInflate = layoutInflaterFrom.inflate(R.layout.gcm4_training_coach_action_item, (ViewGroup) null);
                                            viewInflate.getClass();
                                            appCompatButton = (AppCompatButton) viewInflate;
                                        } else if (i15 == size - 1) {
                                            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.gcm4_training_coach_action_ignore_item, (ViewGroup) null);
                                            viewInflate2.getClass();
                                            appCompatButton = (AppCompatButton) viewInflate2;
                                        } else {
                                            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.gcm4_training_coach_action_secondary_item, (ViewGroup) null);
                                            viewInflate3.getClass();
                                            appCompatButton = (AppCompatButton) viewInflate3;
                                        }
                                        Long actionId = action.getActionId();
                                        if (actionId != null && appCompatButton != null) {
                                            appCompatButton.setText(jVar2.f());
                                            appCompatButton.setLayoutParams(layoutParams2);
                                            appCompatButton.setOnClickListener(new bv2.j(hVar, 1, actionId, jVar2));
                                            linearLayout.addView(appCompatButton);
                                        }
                                        layoutInflaterFrom = layoutInflaterFrom;
                                        i15 = i16;
                                        it3 = it4;
                                        layoutParams2 = layoutParams2;
                                    }
                                }
                            }
                        }
                        if (dVar3.Z()) {
                            qVar.a();
                            TextView textView6 = qVar.f55700h;
                            HorseshoePieChart horseshoePieChart = qVar.f55695c;
                            TextView textView7 = qVar.f55694b;
                            HorseshoePieChart horseshoePieChart2 = qVar.f55697e;
                            TextView textView8 = qVar.f55699g;
                            TextView textView9 = qVar.f55698f;
                            View view5 = qVar.f55688a;
                            Context context3 = view5.getContext();
                            m athletePlanGoal = dVar3.getAthletePlanGoal();
                            if (athletePlanGoal != null) {
                                if (athletePlanGoal.f()) {
                                    Integer goalTimeSeconds = dVar3.getGoalTimeSeconds();
                                    if (goalTimeSeconds != null) {
                                        int iIntValue = goalTimeSeconds.intValue();
                                        l3.f23124b.getClass();
                                        textView7.setText(context3.getString(R.string.string_colon_string_pattern, athletePlanGoal.getLocalizedGoal(), l3.a.b1(((long) iIntValue) * 1000)));
                                    }
                                } else {
                                    textView7.setText(athletePlanGoal.getLocalizedGoal());
                                }
                            }
                            int i17 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c;
                            DateTime dateTimeNow = DateTime.now();
                            dateTimeNow.getClass();
                            int iJ = dVar3.j(i17, dateTimeNow);
                            int iA = dVar3.A(i17);
                            DateTime dateTimeNow2 = DateTime.now();
                            dateTimeNow2.getClass();
                            DateTime dateTimeS = dVar3.s();
                            int days = dateTimeS != null ? Days.daysBetween(dateTimeS, dateTimeNow2).getDays() + 1 : 0;
                            int iZ = dVar3.z();
                            horseshoePieChart.getClass();
                            Context context4 = view5.getContext();
                            context4.getClass();
                            new vz.a(horseshoePieChart, new du1.a(context4), new du1.b(horseshoePieChart)).a(new g(days, iZ, String.valueOf(iJ)));
                            textView9.setText(context3.getString(R.string.lbl_plan_progress, String.valueOf(iA)));
                            xw1.e coach = dVar3.getCoach();
                            if (coach != null) {
                                qVar.f55696d.setImageUrl(wt1.r.a() + coach.f192369f);
                                textView8.setText(context3.getString(R.string.lbl_coach_name, coach.f192366c));
                            }
                            Integer confidence = dVar3.getConfidence();
                            if (confidence != null) {
                                horseshoePieChart2.setVisibility(0);
                                textView6.setVisibility(0);
                                qVar.c(3);
                                Context context5 = view5.getContext();
                                context5.getClass();
                                new vz.a(horseshoePieChart2, new du1.c(context5), new du1.d(horseshoePieChart2)).a(confidence);
                            } else {
                                horseshoePieChart2.setVisibility(8);
                                textView6.setVisibility(8);
                                qVar.c(2);
                                int iE = fb2.g.e(150, context3);
                                textView9.setMaxWidth(iE);
                                textView8.setMaxWidth(iE);
                                textView9.requestLayout();
                                textView8.requestLayout();
                            }
                            wVar.a();
                            t tVar = vVar.f73561b;
                            View view6 = wVar.f55688a;
                            fu1.a aVar3 = tVar != null ? tVar.f73554a : null;
                            cu1.p pVar = wVar.f55716c;
                            if (aVar3 != null) {
                                fu1.a aVar4 = tVar.f73554a;
                                d0 d0Var = new d0(29, tVar, wVar);
                                pVar.getClass();
                                WorkoutDTO workoutDTO = aVar4 != null ? aVar4.f73506b : null;
                                if (workoutDTO != null) {
                                    String str2 = workoutDTO.f48041b;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    StringBuilder sb3 = new StringBuilder(view6.getContext().getString(R.string.lbl_next_workout));
                                    String scheduledWorkoutDate = aVar4.f73505a.getScheduledWorkoutDate();
                                    if (scheduledWorkoutDate != null) {
                                        try {
                                            dateTimeP = k.p(scheduledWorkoutDate, "yyyy-MM-dd", null);
                                        } catch (IllegalArgumentException e4) {
                                            String strN = fb1.c.n("Error Parsing date: ", e4.getMessage());
                                            i2.a aVar5 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar5.getClass();
                                            i2.a.f(a2Var, "ATPActivePlanWorkout", strN);
                                            dateTimeP = null;
                                        }
                                    } else {
                                        dateTimeP = null;
                                    }
                                    if (dateTimeP != null) {
                                        sb3.append(" • ");
                                        Context context6 = view6.getContext();
                                        context6.getClass();
                                        sb3.append(wt1.r.c(new l22.a(context6), new pi0.e(context6), dateTimeP));
                                    }
                                    Integer num = workoutDTO.f48049j;
                                    if (num != null && num.intValue() > 0) {
                                        sb3.append(" • ");
                                        Context context7 = view6.getContext();
                                        context7.getClass();
                                        String string2 = context7.getString(R.string.common_minutes_abbreviation_label, String.valueOf((int) (((double) num.intValue()) / 60.0d)));
                                        string2.getClass();
                                        sb3.append(string2);
                                    }
                                    Context context8 = view6.getContext();
                                    context8.getClass();
                                    pVar.a(r0.b(context8, R.drawable.run, R.color.gds_data_viz_blue_primary, R.color.gcm_icon_on_color, r0.a.MEDIUM, 48), str2, sb3.toString(), d0Var);
                                } else {
                                    pVar.f55689a.setVisibility(8);
                                }
                            } else {
                                pVar.f55689a.setVisibility(8);
                            }
                            cu1.p pVar2 = wVar.f55717d;
                            int i18 = tVar != null ? tVar.f73555b : 0;
                            com.garmin.android.apps.connectmobile.connectiq.x xVar2 = new com.garmin.android.apps.connectmobile.connectiq.x(wVar, 11);
                            pVar2.getClass();
                            Context context9 = view6.getContext();
                            String string3 = context9.getString(R.string.lbl_workout_schedule);
                            string3.getClass();
                            if (2 > i18 || i18 > Integer.MAX_VALUE) {
                                string = i18 == 1 ? context9.getString(R.string.lbl_workout_this_week, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) : context9.getString(R.string.lbl_no_workouts_this_week);
                            } else {
                                string = context9.getString(R.string.lbl_workouts_this_week, String.valueOf(i18));
                            }
                            string.getClass();
                            pVar2.a(r0.b(context9, R.drawable.calendar, R.color.gds_data_viz_blue_primary, R.color.gcm_icon_on_color, r0.a.MEDIUM, 48), string3, string, xVar2);
                        }
                    }
                    arrayList.clear();
                    cu1.a aVar6 = aVar2;
                    aVar6.f55613e.clear();
                    aVar6.f55615g.clear();
                    aVar6.f55614f.clear();
                    list = vVar.f73562c;
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    z14 = false;
                    if (!arrayList.isEmpty()) {
                        view2.setVisibility(0);
                    }
                    aVar6.notifyDataSetChanged();
                    dVar = dVar2;
                } else {
                    aVar = aVar;
                }
                dVar2 = dVar2;
                aVar2 = aVar2;
                arrayList.clear();
                cu1.a aVar7 = aVar2;
                aVar7.f55613e.clear();
                aVar7.f55615g.clear();
                aVar7.f55614f.clear();
                list = vVar.f73562c;
                if (list != null) {
                    arrayList.addAll(list);
                }
                z14 = false;
                if (!arrayList.isEmpty()) {
                    view2.setVisibility(0);
                }
                aVar7.notifyDataSetChanged();
                dVar = dVar2;
            } else {
                aVar = aVar;
                z14 = false;
                dVar = dVar2;
            }
            d.b bVar = dVar.f45422j;
            if (bVar != null) {
                bVar.g5(vVar.f73560a);
            }
            d.u6(dVar, vVar.f73560a);
            xw1.d dVar4 = vVar.f73560a;
            if (dVar4 == null || !dVar4.e0()) {
                xVar = dVar.f45417e;
                if (xVar != null) {
                    xVar.dismiss();
                }
            } else {
                l.f68084a.getClass();
                String strV0 = l.a.a().V0();
                if ((strV0 == null || strV0.length() == 0) && l.a.a().L2() && ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).l()) {
                    x.a aVar8 = x.f49750f;
                    String string4 = dVar.getString(R.string.training_status_pause_query);
                    String string5 = dVar.getString(R.string.training_status_pause_desc);
                    string5.getClass();
                    x xVarA = x.a.a(aVar8, string4, string5, dVar.getString(R.string.training_status_pause_prompt), R.drawable.icon_training_status_recovery, 40);
                    dVar.f45417e = xVarA;
                    xVarA.f49751a = new cu1.d0(dVar, 3);
                    xVarA.f49752b = new com.google.accompanist.drawablepainter.a(13);
                    androidx.fragment.app.m activity = dVar.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        androidx.fragment.app.a aVar9 = new androidx.fragment.app.a(supportFragmentManager);
                        x xVar3 = dVar.f45417e;
                        if (xVar3 != null) {
                            aVar9.j(R.id.notification_layout, xVar3, null, 1);
                            aVar9.e();
                        }
                    }
                } else {
                    xVar = dVar.f45417e;
                    if (xVar != null) {
                        xVar.dismiss();
                    }
                }
            }
            xw1.d dVar5 = vVar.f73560a;
            dVar.z6(dVar5 != null ? dVar5.c0() : z14);
            cu1.b bVar2 = dVar.f45421i;
            if (bVar2 == null) {
                s.m("presenter");
                throw null;
            }
            xw1.d dVarB = bVar2.b();
            if (dVarB != null) {
                wt1.d dVarW6 = dVar.w6();
                cu1.b bVar3 = dVar.f45421i;
                if (bVar3 == null) {
                    s.m("presenter");
                    throw null;
                }
                String strD = bVar3.d();
                this.f45442a = 1;
                Object objD4 = dVarW6.D4(dVarB, strD, this);
                u13.a aVar10 = aVar;
                if (objD4 == aVar10) {
                    return aVar10;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
