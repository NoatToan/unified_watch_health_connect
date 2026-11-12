package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.dashboard.PolylineView;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.consent.AdaptiveTrainingPlanConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.atp.schedule.WorkoutScheduleActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.PolyUtil;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/j;", "Lwt1/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements wt1.a {
    @Override // wt1.a
    public final long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> interfaceC0995b) {
        interfaceC0995b.getClass();
        return cw.q.N().O(userSettingsDTO, jSONObject, interfaceC0995b);
    }

    @Override // wt1.a
    public final Context b() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.a();
    }

    @Override // wt1.a
    public final void c(Activity activity, long j8, boolean z14, String str) {
        activity.getClass();
        ITPDashboardActivity.f45618m.getClass();
        activity.startActivityForResult(ITPDashboardActivity.a.a(activity, j8, str, z14), 1001);
    }

    @Override // wt1.a
    public final boolean d() {
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        return com.garmin.android.apps.connectmobile.k1.u();
    }

    @Override // wt1.a
    public final void e(WorkoutScheduleActivity workoutScheduleActivity, long j8, String str) {
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        am.h hVar = am.h.VIEW_ONLY;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11825d = true;
        bVar.f11827f = str;
        workoutScheduleActivity.startActivity(bVar.a(workoutScheduleActivity));
    }

    @Override // wt1.a
    public final void f(androidx.fragment.app.m mVar) {
        AdaptiveTrainingPlanConsentActivity.f32137r.getClass();
        Intent intent = new Intent(mVar, (Class<?>) AdaptiveTrainingPlanConsentActivity.class);
        intent.setFlags(65536);
        mVar.startActivityForResult(intent, 101);
    }

    @Override // wt1.a
    public final UserSettingsDTO getUserSettings() {
        return GCMSettingManager.s();
    }

    @Override // wt1.a
    public final void h() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_GARMIN_COACH);
    }

    @Override // wt1.a
    public final void i(androidx.fragment.app.m mVar, boolean z14) {
        mVar.getClass();
        tb1.h.f163750a.getClass();
        i52.a.f91796a.getClass();
        if (i52.a.l() == ww0.a.PREGNANT) {
            String string = z14 ? mVar.getString(R.string.pregnancy_training_plans_active_message) : mVar.getString(R.string.pregnancy_training_plans_inactive_message);
            string.getClass();
            if (i52.a.f91797b.getBoolean(i52.a.c(R.string.key_has_user_seen_pregnancy_training_plan_banner), false)) {
                return;
            }
            com.garmin.android.apps.connectmobile.x xVarA = com.garmin.android.apps.connectmobile.x.a.a(com.garmin.android.apps.connectmobile.x.f49750f, mVar.getString(R.string.pregnancy_and_training_title), string, mVar.getString(R.string.common_learn_more), 0, 56);
            xVarA.f49751a = new tb1.g(mVar);
            xVarA.f49752b = new ta0.g(5);
            androidx.fragment.app.v supportFragmentManager = mVar.getSupportFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
            aVarB.j(R.id.notification_layout, xVarA, null, 1);
            aVarB.e();
        }
    }

    @Override // wt1.a
    public final void j(CompletedTrainingPlansActivity completedTrainingPlansActivity, long j8) {
        ITPDashboardActivity.f45618m.getClass();
        completedTrainingPlansActivity.startActivityForResult(ITPDashboardActivity.a.a(completedTrainingPlansActivity, j8, null, false), 1001);
    }

    @Override // wt1.a
    public final void k(Activity activity) {
        activity.getClass();
        CompletedTrainingPlansActivity.f45088h.getClass();
        activity.startActivityForResult(new Intent(activity, (Class<?>) CompletedTrainingPlansActivity.class), 1006);
    }

    @Override // wt1.a
    public final boolean l() {
        return zb0.n0.h();
    }

    @Override // wt1.a
    public final void m(androidx.fragment.app.m mVar, int i14, DateTime dateTime, DateTime dateTime2, String str, xw1.k kVar, Integer num) {
        TrainingInitiativeEventActivity.f45718o.getClass();
        Intent intent = new Intent(mVar, (Class<?>) TrainingInitiativeEventActivity.class);
        intent.putExtra("extra_atp_training_plan_enum_ordinal", i14);
        intent.putExtra("extra_race_start_date", dateTime);
        intent.putExtra("extra_race_end_date", dateTime2);
        intent.putExtra("GCM_extra_is_garmin_coach_flow", true);
        intent.putExtra("GCM_tp_plan_name", str);
        intent.putExtra("GCM_race_dto", kVar);
        intent.putExtra("extra_create_event_type", num);
        mVar.startActivityForResult(intent, 150);
    }

    /* JADX WARN: Code duplicated, block: B:213:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:446:0x0785  */
    /* JADX WARN: Code duplicated, block: B:79:0x01db  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // wt1.a
    public final void n(RecyclerView.f0 f0Var, fu1.m mVar, fu1.d dVar, cu1.a.b bVar) {
        Context context;
        String str;
        ImageView imageView;
        boolean z14;
        int i14;
        Drawable drawable;
        int i15;
        fu1.x performanceRating;
        List<LatLng> listDecode;
        f0Var.getClass();
        if (f0Var instanceof hm.a) {
            if (mVar.f73538d) {
                ((hm.a) f0Var).itemView.getLayoutParams().height = 0;
                return;
            }
            hm.a aVar = (hm.a) f0Var;
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = mVar.f73536b;
            ps.q qVarE = hVar != null ? fr.a.e(hVar) : null;
            ps.m mVar2 = mVar.f73537c;
            String encodedSamples = mVar2 != null ? mVar2.getEncodedSamples() : null;
            LatLng[] latLngArr = (encodedSamples == null || encodedSamples.length() == 0 || (listDecode = PolyUtil.decode(encodedSamples)) == null) ? null : (LatLng[]) listDecode.toArray(new LatLng[0]);
            fu1.q gradedWorkout = dVar.getGradedWorkout();
            String localizedRating = (gradedWorkout == null || (performanceRating = gradedWorkout.getPerformanceRating()) == null) ? null : performanceRating.getLocalizedRating();
            ViewGroup viewGroup = aVar.f84479i;
            if (viewGroup != null && (context = viewGroup.getContext()) != null && qVarE != null) {
                dz.a.ViewOnClickListenerC1307a viewOnClickListenerC1307a = aVar.f84478h;
                dz.a.ViewOnClickListenerC1307a viewOnClickListenerC1307a2 = aVar.f84477g;
                am.x0 x0VarL = am.z0.l(am.x0.f4346x, qVarE.getActivityTypeKey());
                String str2 = x0VarL.f4358a;
                am.x0 x0Var = am.x0.P1;
                if (am.z0.b(x0Var, str2)) {
                    if (viewOnClickListenerC1307a.f61660b == null) {
                        viewOnClickListenerC1307a.f61660b = new Bundle();
                    }
                    Bundle bundle = viewOnClickListenerC1307a.f61660b;
                    cl0.c cVar = cl0.c.f27927a;
                    String scoreType = qVarE.getScoreType();
                    cVar.getClass();
                    int iB = cl0.c.a(context, scoreType).equalsIgnoreCase(context.getString(R.string.golf_scorecards_stroke_play)) ? MathKt.b(qVarE.getStrokes()) : qVarE.getTypeScore();
                    str = localizedRating;
                    bundle.putLong("GCM_navigation_activity_id", qVarE.getActivityId());
                    bundle.putString("action", "scorecard");
                    bundle.putInt("type_score", iB);
                    String scoreType2 = qVarE.getScoreType();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = scoreType2.toLowerCase(locale);
                    lowerCase.getClass();
                    bundle.putString("score_type", lowerCase);
                    aVar.f61653a.setOnClickListener(viewOnClickListenerC1307a);
                    ImageView imageView2 = aVar.f61657e;
                    if (imageView2 != null) {
                        Drawable drawable2 = a7.b.getDrawable(imageView2.getRootView().getContext(), R.drawable.exterior_link);
                        if (drawable2 != null) {
                            drawable2.setTint(a7.b.getColor(imageView2.getRootView().getContext(), R.color.gcm_icon_my_day_header_overview));
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else {
                    str = localizedRating;
                    if (am.z0.b(am.x0.E2, str2)) {
                        ss.e.f160596a.getClass();
                        if (!((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("gaming_2_improvements_enabled") && (imageView = aVar.f61657e) != null) {
                            imageView.setVisibility(8);
                        }
                        if (viewOnClickListenerC1307a2.f61660b == null) {
                            viewOnClickListenerC1307a2.f61660b = new Bundle();
                        }
                        Bundle bundle2 = viewOnClickListenerC1307a2.f61660b;
                        bundle2.putLong("GCM_navigation_activity_id", qVarE.getActivityId());
                        bundle2.putString("GCM_navigation_activity_type_key", str2);
                        aVar.f61653a.setOnClickListener(viewOnClickListenerC1307a2);
                    } else {
                        if (viewOnClickListenerC1307a2.f61660b == null) {
                            viewOnClickListenerC1307a2.f61660b = new Bundle();
                        }
                        Bundle bundle3 = viewOnClickListenerC1307a2.f61660b;
                        bundle3.putLong("GCM_navigation_activity_id", qVarE.getActivityId());
                        bundle3.putString("GCM_navigation_activity_type_key", str2);
                        aVar.f61653a.setOnClickListener(viewOnClickListenerC1307a2);
                    }
                }
                ViewGroup viewGroup2 = aVar.f84479i;
                if (viewGroup2 != null) {
                    if (viewGroup2.getBackground() instanceof GradientDrawable) {
                        Drawable background = viewGroup2.getBackground();
                        background.getClass();
                        GradientDrawable gradientDrawable = (GradientDrawable) background;
                        gradientDrawable.mutate();
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                        gradientDrawable.setColors(gm.c.a(context, x0VarL));
                    } else {
                        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, gm.c.a(context, x0VarL));
                        gradientDrawable2.setCornerRadius(0.0f);
                        viewGroup2.setBackground(gradientDrawable2);
                    }
                }
                if (qVarE.getOwnerId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (com.garmin.android.apps.connectmobile.k1.f37122a.l0()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                aVar.f61656d.setText(new mn.a(new l22.a(context)).a(qVarE.getActivityName()));
                ImageView imageView3 = aVar.f61655c;
                if (am.z0.b(x0Var, str2)) {
                    i14 = z14 ? R.drawable.icon_para_golf : x0Var.f4361d;
                } else {
                    am.x0 x0Var2 = am.x0.R0;
                    if (am.z0.b(x0Var2, str2)) {
                        i14 = x0Var2.f4361d;
                    } else if (am.z0.x(str2)) {
                        i14 = am.x0.S0.f4361d;
                    } else {
                        am.x0 x0Var3 = am.x0.T0;
                        if (am.z0.b(x0Var3, str2)) {
                            i14 = x0Var3.f4361d;
                        } else {
                            am.x0 x0Var4 = am.x0.Y;
                            if (am.z0.b(x0Var4, str2)) {
                                i14 = x0Var4.f4361d;
                            } else {
                                am.x0 x0Var5 = am.x0.Z;
                                if (am.z0.b(x0Var5, str2)) {
                                    i14 = x0Var5.f4361d;
                                } else {
                                    am.x0 x0Var6 = am.x0.f4296k0;
                                    if (am.z0.b(x0Var6, str2)) {
                                        i14 = x0Var6.f4361d;
                                    } else {
                                        am.x0 x0Var7 = am.x0.X;
                                        if (am.z0.b(x0Var7, str2)) {
                                            i14 = x0Var7.f4361d;
                                        } else {
                                            am.x0 x0Var8 = am.x0.I;
                                            if (am.z0.b(x0Var8, str2)) {
                                                i14 = x0Var8.f4361d;
                                            } else {
                                                am.x0 x0Var9 = am.x0.P;
                                                if (am.z0.b(x0Var9, str2)) {
                                                    i14 = x0Var9.f4361d;
                                                } else {
                                                    am.x0 x0Var10 = am.x0.T;
                                                    if (am.z0.b(x0Var10, str2)) {
                                                        i14 = x0Var10.f4361d;
                                                    } else {
                                                        am.x0 x0Var11 = am.x0.D;
                                                        if (am.z0.b(x0Var11, str2)) {
                                                            i14 = x0Var11.f4361d;
                                                        } else {
                                                            am.x0 x0Var12 = am.x0.I0;
                                                            if (am.z0.b(x0Var12, str2)) {
                                                                i14 = x0Var12.f4361d;
                                                            } else {
                                                                am.x0 x0Var13 = am.x0.D2;
                                                                if (am.z0.b(x0Var13, str2)) {
                                                                    i14 = x0Var13.f4361d;
                                                                } else {
                                                                    am.x0 x0Var14 = am.x0.O0;
                                                                    if (am.z0.b(x0Var14, str2)) {
                                                                        i14 = x0Var14.f4361d;
                                                                    } else {
                                                                        am.x0 x0Var15 = am.x0.L0;
                                                                        if (am.z0.b(x0Var15, str2)) {
                                                                            i14 = x0Var15.f4361d;
                                                                        } else {
                                                                            am.x0 x0Var16 = am.x0.f4308n;
                                                                            if (am.z0.b(x0Var16, str2)) {
                                                                                i14 = x0Var16.f4361d;
                                                                            } else {
                                                                                am.x0 x0Var17 = am.x0.f4324r;
                                                                                if (am.z0.b(x0Var17, str2)) {
                                                                                    i14 = x0Var17.f4361d;
                                                                                } else {
                                                                                    am.x0 x0Var18 = am.x0.f4331t;
                                                                                    if (am.z0.b(x0Var18, str2)) {
                                                                                        i14 = x0Var18.f4361d;
                                                                                    } else if (am.z0.W(str2)) {
                                                                                        i14 = z14 ? R.drawable.gcm3_list_icon_activity_strength_para : am.x0.f4309n1.f4361d;
                                                                                    } else {
                                                                                        am.x0 x0Var19 = am.x0.C2;
                                                                                        if (am.z0.b(x0Var19, str2)) {
                                                                                            i14 = z14 ? R.drawable.icon_para_hiit : x0Var19.f4361d;
                                                                                        } else if (am.z0.e0(str2)) {
                                                                                            i14 = z14 ? R.drawable.icon_para_yoga : am.x0.f4322q2.f4361d;
                                                                                        } else if (am.z0.N(str2)) {
                                                                                            i14 = z14 ? R.drawable.icon_para_pilates : am.x0.f4326r2.f4361d;
                                                                                        } else if (am.z0.w(str2)) {
                                                                                            i14 = am.x0.f4290i1.f4361d;
                                                                                        } else if (am.z0.T(str2)) {
                                                                                            i14 = am.x0.f4305m1.f4361d;
                                                                                        } else if (am.z0.t(str2)) {
                                                                                            i14 = z14 ? R.drawable.icon_para_cardio : am.x0.f4293j1.f4361d;
                                                                                        } else if (am.z0.z(str2)) {
                                                                                            i14 = am.x0.f4333t2.f4361d;
                                                                                        } else if (am.z0.O(str2)) {
                                                                                            i14 = am.x0.f4340v2.f4361d;
                                                                                        } else {
                                                                                            am.x0 x0Var20 = am.x0.f4344w2;
                                                                                            if (am.z0.b(x0Var20, str2)) {
                                                                                                i14 = x0Var20.f4361d;
                                                                                            } else {
                                                                                                am.x0 x0Var21 = am.x0.f4348x2;
                                                                                                if (am.z0.b(x0Var21, str2)) {
                                                                                                    i14 = x0Var21.f4361d;
                                                                                                } else {
                                                                                                    am.x0 x0Var22 = am.x0.f4267a2;
                                                                                                    if (am.z0.b(x0Var22, str2)) {
                                                                                                        i14 = z14 ? R.drawable.icon_para_ski : x0Var22.f4361d;
                                                                                                    } else {
                                                                                                        am.x0 x0Var23 = am.x0.f4270b2;
                                                                                                        if (am.z0.b(x0Var23, str2)) {
                                                                                                            i14 = z14 ? x0Var23.f4367j : x0Var23.f4361d;
                                                                                                        } else if (am.z0.P(str2)) {
                                                                                                            i14 = am.x0.U1.f4361d;
                                                                                                        } else {
                                                                                                            am.x0 x0Var24 = am.x0.X1;
                                                                                                            if (am.z0.b(x0Var24, str2)) {
                                                                                                                i14 = x0Var24.f4361d;
                                                                                                            } else if (am.z0.o(str2)) {
                                                                                                                i14 = am.x0.W1.f4361d;
                                                                                                            } else if (!am.z0.v(str2)) {
                                                                                                                am.x0 x0Var25 = am.x0.U1;
                                                                                                                if (am.z0.b(x0Var25, str2)) {
                                                                                                                    i14 = x0Var25.f4361d;
                                                                                                                } else if (am.z0.J(str2)) {
                                                                                                                    i14 = am.x0.A2.f4361d;
                                                                                                                } else if (am.z0.L(str2)) {
                                                                                                                    i14 = z14 ? R.drawable.icon_para_onshore_grind : am.x0.B2.f4361d;
                                                                                                                } else {
                                                                                                                    am.x0 x0Var26 = am.x0.f4352y2;
                                                                                                                    if (am.z0.b(x0Var26, str2)) {
                                                                                                                        i14 = z14 ? R.drawable.icon_para_indoor_climb : x0Var26.f4361d;
                                                                                                                    } else {
                                                                                                                        am.x0 x0Var27 = am.x0.f4356z2;
                                                                                                                        if (am.z0.b(x0Var27, str2)) {
                                                                                                                            i14 = z14 ? R.drawable.icon_para_bouldering : x0Var27.f4361d;
                                                                                                                        } else if (am.z0.X(str2)) {
                                                                                                                            i14 = am.x0.I1.f4361d;
                                                                                                                        } else if (am.z0.Q(str2)) {
                                                                                                                            i14 = am.x0.f4273c2.f4361d;
                                                                                                                        } else {
                                                                                                                            am.x0 x0Var28 = am.x0.f4297k1;
                                                                                                                            if (am.z0.b(x0Var28, str2)) {
                                                                                                                                i14 = x0Var28.f4361d;
                                                                                                                            } else {
                                                                                                                                am.x0 x0Var29 = am.x0.f4301l1;
                                                                                                                                if (am.z0.b(x0Var29, str2)) {
                                                                                                                                    i14 = x0Var28.f4361d;
                                                                                                                                } else if (am.z0.b(x0Var29, str2)) {
                                                                                                                                    i14 = x0Var29.f4361d;
                                                                                                                                } else if (am.z0.H(str2)) {
                                                                                                                                    i14 = am.x0.C.f4361d;
                                                                                                                                } else {
                                                                                                                                    am.x0 x0Var30 = am.x0.E2;
                                                                                                                                    if (am.z0.b(x0Var30, str2)) {
                                                                                                                                        i14 = x0Var30.f4361d;
                                                                                                                                    } else {
                                                                                                                                        am.x0 x0Var31 = am.x0.E3;
                                                                                                                                        if (am.z0.b(x0Var31, str2)) {
                                                                                                                                            i14 = x0Var31.f4361d;
                                                                                                                                        } else if (am.z0.F(str2)) {
                                                                                                                                            i14 = am.x0.f4314o2.f4361d;
                                                                                                                                        } else if (am.z0.d0(str2)) {
                                                                                                                                            i14 = am.x0.f4318p2.f4361d;
                                                                                                                                        } else if (am.z0.U(str2)) {
                                                                                                                                            i14 = z14 ? R.drawable.icon_para_sup : am.x0.f4294j2.f4361d;
                                                                                                                                        } else {
                                                                                                                                            am.x0 x0Var32 = am.x0.F2;
                                                                                                                                            if (am.z0.b(x0Var32, str2)) {
                                                                                                                                                i14 = x0Var32.f4361d;
                                                                                                                                            } else {
                                                                                                                                                am.x0 x0Var33 = am.x0.f4280e3;
                                                                                                                                                if (am.z0.b(x0Var33, str2)) {
                                                                                                                                                    i14 = x0Var33.f4361d;
                                                                                                                                                } else {
                                                                                                                                                    am.x0 x0Var34 = am.x0.f4283f3;
                                                                                                                                                    if (am.z0.b(x0Var34, str2)) {
                                                                                                                                                        i14 = x0Var34.f4361d;
                                                                                                                                                    } else {
                                                                                                                                                        am.x0 x0Var35 = am.x0.f4286g3;
                                                                                                                                                        if (am.z0.b(x0Var35, str2)) {
                                                                                                                                                            i14 = x0Var35.f4361d;
                                                                                                                                                        } else {
                                                                                                                                                            am.x0 x0Var36 = am.x0.f4289h3;
                                                                                                                                                            if (am.z0.b(x0Var36, str2)) {
                                                                                                                                                                i14 = x0Var36.f4361d;
                                                                                                                                                            } else {
                                                                                                                                                                am.x0 x0Var37 = am.x0.f4292i3;
                                                                                                                                                                if (am.z0.b(x0Var37, str2)) {
                                                                                                                                                                    i14 = x0Var37.f4361d;
                                                                                                                                                                } else {
                                                                                                                                                                    am.x0 x0Var38 = am.x0.f4295j3;
                                                                                                                                                                    if (am.z0.b(x0Var38, str2)) {
                                                                                                                                                                        i14 = x0Var38.f4361d;
                                                                                                                                                                    } else {
                                                                                                                                                                        am.x0 x0Var39 = am.x0.f4299k3;
                                                                                                                                                                        if (am.z0.b(x0Var39, str2)) {
                                                                                                                                                                            i14 = x0Var39.f4361d;
                                                                                                                                                                        } else {
                                                                                                                                                                            am.x0 x0Var40 = am.x0.f4303l3;
                                                                                                                                                                            if (am.z0.b(x0Var40, str2)) {
                                                                                                                                                                                i14 = x0Var40.f4361d;
                                                                                                                                                                            } else {
                                                                                                                                                                                am.x0 x0Var41 = am.x0.f4307m3;
                                                                                                                                                                                if (am.z0.b(x0Var41, str2)) {
                                                                                                                                                                                    i14 = x0Var41.f4361d;
                                                                                                                                                                                } else {
                                                                                                                                                                                    am.x0 x0Var42 = am.x0.f4311n3;
                                                                                                                                                                                    if (am.z0.b(x0Var42, str2)) {
                                                                                                                                                                                        i14 = x0Var42.f4361d;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        am.x0 x0Var43 = am.x0.f4315o3;
                                                                                                                                                                                        if (am.z0.b(x0Var43, str2)) {
                                                                                                                                                                                            i14 = x0Var43.f4361d;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            am.x0 x0Var44 = am.x0.f4319p3;
                                                                                                                                                                                            if (am.z0.b(x0Var44, str2)) {
                                                                                                                                                                                                i14 = x0Var44.f4361d;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                am.x0 x0Var45 = am.x0.f4327r3;
                                                                                                                                                                                                if (am.z0.b(x0Var45, str2)) {
                                                                                                                                                                                                    i14 = x0Var45.f4361d;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    am.x0 x0Var46 = am.x0.f4330s3;
                                                                                                                                                                                                    if (am.z0.b(x0Var46, str2)) {
                                                                                                                                                                                                        i14 = x0Var46.f4361d;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        am.x0 x0Var47 = am.x0.f4334t3;
                                                                                                                                                                                                        if (am.z0.b(x0Var47, str2)) {
                                                                                                                                                                                                            i14 = x0Var47.f4361d;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            am.x0 x0Var48 = am.x0.f4337u3;
                                                                                                                                                                                                            if (am.z0.b(x0Var48, str2)) {
                                                                                                                                                                                                                i14 = x0Var48.f4361d;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                am.x0 x0Var49 = am.x0.f4341v3;
                                                                                                                                                                                                                if (am.z0.b(x0Var49, str2)) {
                                                                                                                                                                                                                    i14 = x0Var49.f4361d;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    am.x0 x0Var50 = am.x0.f4345w3;
                                                                                                                                                                                                                    if (am.z0.b(x0Var50, str2)) {
                                                                                                                                                                                                                        i14 = x0Var50.f4361d;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        am.x0 x0Var51 = am.x0.f4349x3;
                                                                                                                                                                                                                        if (am.z0.b(x0Var51, str2)) {
                                                                                                                                                                                                                            i14 = x0Var51.f4361d;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            am.x0 x0Var52 = am.x0.J1;
                                                                                                                                                                                                                            if (am.z0.b(x0Var52, str2) || am.z0.b(am.x0.f4353y3, str2)) {
                                                                                                                                                                                                                                i14 = x0Var52.f4361d;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                am.x0 x0Var53 = am.x0.f4357z3;
                                                                                                                                                                                                                                if (am.z0.b(x0Var53, str2)) {
                                                                                                                                                                                                                                    i14 = x0Var53.f4361d;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    am.x0 x0Var54 = am.x0.A3;
                                                                                                                                                                                                                                    if (am.z0.b(x0Var54, str2)) {
                                                                                                                                                                                                                                        i14 = x0Var54.f4361d;
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        am.x0 x0Var55 = am.x0.B3;
                                                                                                                                                                                                                                        if (am.z0.b(x0Var55, str2)) {
                                                                                                                                                                                                                                            i14 = x0Var55.f4361d;
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            am.x0 x0Var56 = am.x0.f4277d3;
                                                                                                                                                                                                                                            if (am.z0.b(x0Var56, str2)) {
                                                                                                                                                                                                                                                i14 = x0Var56.f4361d;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                am.x0 x0Var57 = am.x0.f4323q3;
                                                                                                                                                                                                                                                if (am.z0.b(x0Var57, str2)) {
                                                                                                                                                                                                                                                    i14 = x0Var57.f4361d;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    am.x0 x0Var58 = am.x0.f4287h1;
                                                                                                                                                                                                                                                    if (am.z0.b(x0Var58, str2)) {
                                                                                                                                                                                                                                                        i14 = x0Var58.f4361d;
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        am.x0 x0Var59 = am.x0.f4275d1;
                                                                                                                                                                                                                                                        if (am.z0.b(x0Var59, str2) || am.z0.b(am.x0.f4278e1, str2)) {
                                                                                                                                                                                                                                                            i14 = x0Var59.f4361d;
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            am.x0 x0Var60 = am.x0.P0;
                                                                                                                                                                                                                                                            if (am.z0.b(x0Var60, str2)) {
                                                                                                                                                                                                                                                                i14 = x0Var60.f4361d;
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                am.x0 x0Var61 = am.x0.f4354z;
                                                                                                                                                                                                                                                                if (am.z0.b(x0Var61, str2) || am.z0.b(am.x0.A, str2)) {
                                                                                                                                                                                                                                                                    i14 = x0Var61.f4361d;
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    am.x0 x0Var62 = am.x0.f4281f1;
                                                                                                                                                                                                                                                                    if (am.z0.b(x0Var62, str2) || am.z0.b(am.x0.f4284g1, str2)) {
                                                                                                                                                                                                                                                                        i14 = x0Var62.f4361d;
                                                                                                                                                                                                                                                                    } else if (am.z0.c0(str2)) {
                                                                                                                                                                                                                                                                        i14 = am.x0.f4302l2.f4361d;
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                        am.x0 x0Var63 = am.x0.G2;
                                                                                                                                                                                                                                                                        if (am.z0.b(x0Var63, str2)) {
                                                                                                                                                                                                                                                                            i14 = x0Var63.f4361d;
                                                                                                                                                                                                                                                                        } else if (am.z0.b0(str2)) {
                                                                                                                                                                                                                                                                            i14 = am.x0.K1.f4361d;
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                            am.x0 x0Var64 = am.x0.I2;
                                                                                                                                                                                                                                                                            if (am.z0.b(x0Var64, str2)) {
                                                                                                                                                                                                                                                                                i14 = x0Var64.f4361d;
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                am.x0 x0Var65 = am.x0.J2;
                                                                                                                                                                                                                                                                                if (am.z0.b(x0Var65, str2)) {
                                                                                                                                                                                                                                                                                    i14 = x0Var65.f4361d;
                                                                                                                                                                                                                                                                                } else if (am.z0.p(str2)) {
                                                                                                                                                                                                                                                                                    i14 = am.x0.M1.f4361d;
                                                                                                                                                                                                                                                                                } else if (am.z0.y(str2)) {
                                                                                                                                                                                                                                                                                    i14 = am.x0.D1.f4361d;
                                                                                                                                                                                                                                                                                } else if (am.z0.E(str2) || am.z0.s(str2)) {
                                                                                                                                                                                                                                                                                    i14 = am.x0.T1.f4361d;
                                                                                                                                                                                                                                                                                } else if (am.z0.S(str2)) {
                                                                                                                                                                                                                                                                                    i14 = am.x0.f4276d2.f4361d;
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                    am.x0 x0Var66 = am.x0.X2;
                                                                                                                                                                                                                                                                                    if (am.z0.b(x0Var66, str2)) {
                                                                                                                                                                                                                                                                                        i14 = x0Var66.f4361d;
                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                        am.x0 x0Var67 = am.x0.f4350y;
                                                                                                                                                                                                                                                                                        if (am.z0.b(x0Var67, str2)) {
                                                                                                                                                                                                                                                                                            i14 = x0Var67.f4361d;
                                                                                                                                                                                                                                                                                        } else if (am.z0.Y(str2)) {
                                                                                                                                                                                                                                                                                            i14 = am.x0.f4338v.f4361d;
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                            am.x0 x0Var68 = am.x0.Y2;
                                                                                                                                                                                                                                                                                            if (am.z0.b(x0Var68, str2)) {
                                                                                                                                                                                                                                                                                                i14 = x0Var68.f4361d;
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                am.x0 x0Var69 = am.x0.Z2;
                                                                                                                                                                                                                                                                                                if (am.z0.b(x0Var69, str2)) {
                                                                                                                                                                                                                                                                                                    i14 = x0Var69.f4361d;
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                    am.x0 x0Var70 = am.x0.f4312o;
                                                                                                                                                                                                                                                                                                    if (am.z0.b(x0Var70, str2)) {
                                                                                                                                                                                                                                                                                                        i14 = x0Var70.f4361d;
                                                                                                                                                                                                                                                                                                    } else if (am.z0.b(am.x0.f4271b3, str2)) {
                                                                                                                                                                                                                                                                                                        i14 = am.x0.f4268a3.f4361d;
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                        am.x0 x0Var71 = am.x0.f4274c3;
                                                                                                                                                                                                                                                                                                        if (am.z0.b(x0Var71, str2)) {
                                                                                                                                                                                                                                                                                                            i14 = x0Var71.f4361d;
                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                            am.x0 x0Var72 = am.x0.f4268a3;
                                                                                                                                                                                                                                                                                                            if (am.z0.b(x0Var72, str2)) {
                                                                                                                                                                                                                                                                                                                i14 = x0Var72.f4361d;
                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                am.x0 x0Var73 = am.x0.C3;
                                                                                                                                                                                                                                                                                                                if (am.z0.b(x0Var73, str2)) {
                                                                                                                                                                                                                                                                                                                    i14 = x0Var73.f4361d;
                                                                                                                                                                                                                                                                                                                } else if (z14) {
                                                                                                                                                                                                                                                                                                                    i14 = R.drawable.icon_para_activity_default;
                                                                                                                                                                                                                                                                                                                } else if (am.z0.D(str2)) {
                                                                                                                                                                                                                                                                                                                    i14 = am.x0.D3.f4361d;
                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                    am.x0 x0Var74 = am.x0.S1;
                                                                                                                                                                                                                                                                                                                    if (am.z0.b(x0Var74, str2)) {
                                                                                                                                                                                                                                                                                                                        i14 = x0Var74.f4361d;
                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                        am.x0 x0Var75 = am.x0.R1;
                                                                                                                                                                                                                                                                                                                        i14 = am.z0.b(x0Var75, str2) ? x0Var75.f4361d : am.x0.f4346x.f4361d;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else if (z14) {
                                                                                                                i14 = R.drawable.icon_para_xc_ski;
                                                                                                            } else if (am.z0.u(str2)) {
                                                                                                                i14 = am.x0.f4279e2.f4361d;
                                                                                                            } else if (TextUtils.isEmpty(str2)) {
                                                                                                                i14 = am.x0.Y1.f4361d;
                                                                                                            } else {
                                                                                                                am.x0 x0Var76 = am.x0.f4282f2;
                                                                                                                if (am.z0.b(x0Var76, str2)) {
                                                                                                                    i14 = x0Var76.f4361d;
                                                                                                                } else {
                                                                                                                    i14 = am.x0.Y1.f4361d;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z14) {
                    c22.r0 r0Var = c22.r0.f23226a;
                    drawable = a7.b.getDrawable(context, i14);
                    if (drawable != null) {
                        drawable.setTint(context.getColor(R.color.gcm_system_static_black));
                    }
                } else {
                    drawable = a7.b.getDrawable(context, i14);
                    og2.k.F(R.color.gcm_system_static_black, context, drawable);
                }
                imageView3.setImageDrawable(drawable);
                ImageView imageView4 = aVar.f61657e;
                am.z0 z0Var = am.z0.f4390a;
                if (am.z0.b(am.x0.f4308n, str2)) {
                    i15 = 13;
                } else if (am.z0.b(am.x0.f4312o, str2)) {
                    i15 = 14;
                } else if (am.z0.b(am.x0.f4324r, str2)) {
                    i15 = 15;
                } else if (am.z0.b(am.x0.f4331t, str2)) {
                    i15 = 16;
                } else if (am.z0.W(str2)) {
                    i15 = 17;
                } else if (am.z0.e0(str2)) {
                    i15 = 33;
                } else if (am.z0.N(str2)) {
                    i15 = 50;
                } else if (am.z0.T(str2)) {
                    i15 = 35;
                } else if (am.z0.u(str2)) {
                    i15 = 63;
                } else if (am.z0.v(str2)) {
                    i15 = 61;
                } else if (am.z0.b(am.x0.C3, str2) || am.z0.b(am.x0.f4352y2, str2) || am.z0.b(am.x0.f4356z2, str2) || am.z0.b(am.x0.f4316p, str2)) {
                    i15 = 65;
                } else if (am.z0.b(am.x0.P1, str2)) {
                    i15 = 37;
                } else if (am.z0.b(am.x0.f4268a3, str2)) {
                    i15 = 93;
                } else {
                    i15 = am.z0.b(am.x0.E2, str2) ? 92 : 18;
                }
                imageView4.setOnClickListener(new dz.a.ViewOnClickListenerC1307a(i15));
                PolylineView polylineView = aVar.f84480j;
                if (polylineView != null) {
                    polylineView.setVisibility(4);
                    if (latLngArr != null) {
                        if ((!(latLngArr.length == 0)) && !am.z0.a0(str2) && !am.z0.X(str2) && !am.z0.b(am.x0.f4323q3, str2) && !am.z0.b(am.x0.f4277d3, str2)) {
                            int[] iArrA = gm.c.a(context, x0VarL);
                            int color = iArrA.length == 2 ? iArrA[1] : a7.b.getColor(context, R.color.palette_ruby_1);
                            List listAsList = Arrays.asList(latLngArr);
                            listAsList.getClass();
                            polylineView.setMinimumHeight((int) TypedValue.applyDimension(1, 90.0f, polylineView.getResources().getDisplayMetrics()));
                            polylineView.f28997c.setColor(color);
                            polylineView.f28995a.setColor(color);
                            polylineView.f29000f = p13.w.c(listAsList);
                            LatLngBounds.Builder builder = new LatLngBounds.Builder();
                            Iterator it = listAsList.iterator();
                            while (it.hasNext()) {
                                builder.include((LatLng) it.next());
                            }
                            polylineView.f29001g = builder.build();
                            polylineView.invalidate();
                            polylineView.setVisibility(0);
                        }
                    }
                }
                fm.b bVar2 = new fm.b();
                List listK = p13.x.k(new o13.p(aVar.f84482l, aVar.f84481k), new o13.p(aVar.f84483m, aVar.f84484n), new o13.p(aVar.f84485o, aVar.f84486p), new o13.p(aVar.f84487q, aVar.f84488r), new o13.p(aVar.f84489t, aVar.f84490v));
                List listA = ((fm.a) KoinJavaComponent.get$default(fm.a.class, null, null, 6, null)).a(context, qVarE, bVar2);
                int i16 = gm.a.f77985a;
                listK.getClass();
                listA.getClass();
                int i17 = 0;
                for (Object obj : listK) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    o13.p pVar = (o13.p) obj;
                    TextView textView = (TextView) pVar.f128594a;
                    TextView textView2 = (TextView) pVar.f128595b;
                    if (i17 < listA.size()) {
                        if (textView != null) {
                            textView.setText(((aq.c) listA.get(i17)).f11847a);
                        }
                        if (textView != null) {
                            textView.setContentDescription(((aq.c) listA.get(i17)).f11848b);
                        }
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        if (textView2 != null) {
                            textView2.setText(((aq.c) listA.get(i17)).f11849c);
                        }
                        if (textView2 != null) {
                            textView2.setContentDescription(((aq.c) listA.get(i17)).f11850d);
                        }
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        }
                    } else {
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                    }
                    i17 = i18;
                }
                TextView textView3 = aVar.f84491w;
                if (textView3 != null) {
                    if (p005kotlin.jvm.internal.s.g(str != null ? Boolean.valueOf(str.length() > 0) : null, Boolean.TRUE)) {
                        textView3.setVisibility(0);
                        textView3.setText(str);
                        int[] iArrA2 = gm.c.a(context, x0VarL);
                        textView3.setBackgroundColor(iArrA2.length == 2 ? iArrA2[1] : a7.b.getColor(context, R.color.palette_ruby_1));
                    } else {
                        textView3.setVisibility(8);
                    }
                }
            }
            aVar.f61658f = bVar;
        }
    }

    @Override // wt1.a
    public final void o(WorkoutScheduleActivity workoutScheduleActivity) {
        GCMCalendarActivity.F.getClass();
        Intent intent = new Intent(workoutScheduleActivity, (Class<?>) GCMCalendarActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra.bottom.nav.bar.visibility", false);
        intent.putExtras(bundle);
        workoutScheduleActivity.startActivity(intent);
    }

    @Override // wt1.a
    public final void p(ActiveTrainingPlansActivity activeTrainingPlansActivity) {
        ConsentActivity.a aVar = ConsentActivity.f32155r;
        q92.x xVar = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
        hl.a.c cVar = hl.a.c.f84256b;
        aVar.getClass();
        ConsentActivity.a.c(activeTrainingPlansActivity, cVar, xVar, true);
    }

    @Override // wt1.a
    public final void q(androidx.fragment.app.m mVar, long j8, long j14, boolean z14) {
        WorkoutDetailsActivity.f48482f.getClass();
        Intent intent = new Intent(mVar, (Class<?>) WorkoutDetailsActivity.class);
        intent.putExtra("GCM_extra_activity_type", 101);
        intent.putExtra("GCM_workout_id", j8);
        intent.putExtra("GCM_workout_schedule_id", j14);
        intent.putExtra("GCM_workout_is_protected", z14);
        mVar.startActivityForResult(intent, 101);
    }

    @Override // wt1.a
    public final void r(com.garmin.android.apps.connectmobile.c cVar, long j8, boolean z14, boolean z15, int i14) {
        WorkoutDetailsActivity.f48482f.getClass();
        Intent intent = new Intent(cVar, (Class<?>) WorkoutDetailsActivity.class);
        intent.putExtra("GCM_extra_activity_type", i14);
        intent.putExtra("GCM_workout_schedule_id", j8);
        intent.putExtra("GCM_workout_is_protected", z14);
        intent.putExtra("GCM_workout_is_race", z15);
        cVar.startActivityForResult(intent, i14);
    }

    @Override // wt1.a
    public final boolean s() {
        AdaptiveTrainingPlanConsentActivity.f32137r.getClass();
        i53.f<q92.x> fVar = AdaptiveTrainingPlanConsentActivity.f32138t;
        if (fVar != null && fVar.isEmpty()) {
            return true;
        }
        Iterator<q92.x> it = fVar.iterator();
        while (it.hasNext()) {
            if (!z10.d1.h(it.next(), false)) {
                return false;
            }
        }
        return true;
    }

    @Override // wt1.a
    public final void t(TrainingPlanDashboardActivity trainingPlanDashboardActivity, int i14, Bundle bundle) {
        if (i14 == 27) {
            if (bundle != null && bundle.containsKey("GCM_navigation_activity_type_key") && bundle.containsKey("GCM_navigation_activity_id")) {
                String string = bundle.getString("GCM_navigation_activity_type_key", am.x0.f4346x.f4358a);
                long j8 = bundle.getLong("GCM_navigation_activity_id");
                aq.b bVar = new aq.b();
                bVar.f11823b = j8;
                am.h hVar = am.h.VIEW_EDIT;
                if (hVar != null) {
                    bVar.f11824c = hVar;
                }
                bVar.f11825d = true;
                bVar.f11827f = string;
                trainingPlanDashboardActivity.startActivity(bVar.a(trainingPlanDashboardActivity));
                return;
            }
            return;
        }
        switch (i14) {
            case 13:
                ActivityReportsActivity.a.a(ActivityReportsActivity.f29758a, trainingPlanDashboardActivity, am.x0.f4308n, null, null, null, 28);
                return;
            case 14:
                ActivityReportsActivity.a.a(ActivityReportsActivity.f29758a, trainingPlanDashboardActivity, am.x0.f4312o, null, null, null, 28);
                return;
            case 15:
                ActivityReportsActivity.a.a(ActivityReportsActivity.f29758a, trainingPlanDashboardActivity, am.x0.f4324r, null, null, null, 28);
                return;
            case 16:
                ActivityReportsActivity.a.a(ActivityReportsActivity.f29758a, trainingPlanDashboardActivity, am.x0.f4331t, null, null, null, 28);
                return;
            case 17:
                break;
            default:
                switch (i14) {
                    case 33:
                        ActivityReportsActivity.a.a(ActivityReportsActivity.f29758a, trainingPlanDashboardActivity, am.x0.f4322q2, null, null, null, 28);
                        break;
                    case 34:
                    case 35:
                    case 36:
                        break;
                    default:
                        String strH = am.j.h(i14, "Unhandled navigation type ");
                        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "TrainingPlanDashboardActivity", strH);
                        break;
                }
                return;
        }
        ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, trainingPlanDashboardActivity, am.g.f3953q, null, 28);
    }

    @Override // wt1.a
    public final hm.a u(View view2) {
        return new hm.a(view2);
    }
}
