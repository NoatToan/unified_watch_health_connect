package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import com.google.mlkit.common.MlKitException;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/h2;", "Lzf0/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h2 implements zf0.c {
    @Override // zf0.c
    public final void a(Activity activity, DateTime dateTime, ww1.v vVar, String str, int i14, int i15) {
        activity.getClass();
        TrainingInitiativeEventActivity.f45718o.getClass();
        Intent intent = new Intent(activity, (Class<?>) TrainingInitiativeEventActivity.class);
        intent.putExtra("extra_launch_fbt_location_screen", true);
        intent.putExtra("extra.date.time", dateTime);
        intent.putExtra("extra_fbt_location_time_dto", vVar);
        intent.putExtra("extra_fbt_location_header", str);
        intent.putExtra("extra_fbt_setup_flow_step", i14);
        intent.putExtra("extra_fbt_setup_flow_total_steps", i15);
        activity.startActivityForResult(intent, 200);
    }

    @Override // zf0.c
    public final Intent b(Context context, Long l14, String str) {
        EventDetailsActivity.f45692o.getClass();
        return EventDetailsActivity.a.c(context, l14, str);
    }

    @Override // zf0.c
    public final void c(androidx.fragment.app.m mVar, Long l14) {
        EventDetailsActivity.f45692o.getClass();
        mVar.startActivityForResult(EventDetailsActivity.a.c(mVar, l14, null), 500);
    }

    @Override // zf0.c
    public final void d(androidx.fragment.app.m mVar, fg0.k kVar, fy1.d dVar, int i14) {
        EventGoalActivity.f45976e.getClass();
        Intent intent = new Intent(mVar, (Class<?>) EventGoalActivity.class);
        intent.putExtra("extra_launch_fbt_triathlon_leg_goal_review", true);
        intent.putExtra("extra_is_fbt_flow_back_navigation", true);
        intent.putExtra("GCM_extra_sharable_event_dto", kVar);
        intent.putExtra("extra_triathlon_goal_steps", dVar);
        intent.putExtra("extra_fbt_setup_flow_total_steps", i14);
        mVar.startActivityForResult(intent, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
    }

    @Override // zf0.c
    public final void e(androidx.fragment.app.m mVar, ww1.w wVar, int i14, int i15) {
        TrainingInitiativeEventActivity.f45718o.getClass();
        Intent intent = new Intent(mVar, (Class<?>) TrainingInitiativeEventActivity.class);
        intent.putExtra("extra_launch_fbt_select_triathlon_event_screen", true);
        intent.putExtra("extra_fbt_setup_flow_step", i14);
        intent.putExtra("extra_fbt_setup_flow_total_steps", i15);
        if (wVar != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_fbt_triathlon_leg_targets", wVar);
            com.garmin.android.apps.connectmobile.m2.a(intent, bundle);
        }
        mVar.startActivityForResult(intent, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
    }

    @Override // zf0.c
    public final void f(androidx.fragment.app.m mVar, int i14, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z14, Double d14, Double d15, String str, boolean z15, String str2, boolean z16, int i15, int i16, boolean z17, ww1.w wVar) {
        TrainingInitiativeEventActivity.f45718o.getClass();
        Intent intent = new Intent(mVar, (Class<?>) TrainingInitiativeEventActivity.class);
        intent.putExtra("extra_is_fbt_find_create_event", true);
        intent.putExtra("GCM_extra_event_type", i14);
        intent.putExtra("extra_race_start_date", dateTime);
        intent.putExtra("extra_race_end_date", dateTime2);
        intent.putExtra("extra_calendar_selection_date", dateTime3);
        intent.putExtra("extra_prompt_if_selected_date_before_minimum", z14);
        if (d14 != null) {
            intent.putExtra("extra_fbt_race_distance", d14.doubleValue());
        }
        if (d15 != null) {
            intent.putExtra("extra_fbt_race_duration", d15.doubleValue());
        }
        intent.putExtra("extra_fbt_duration_display_text", str);
        intent.putExtra("extra_fbt_has_primary_event", z15);
        intent.putExtra("extra_fbt_primary_event_name", str2);
        intent.putExtra("extra_fbt_navigate_event_creation_flow", z16);
        intent.putExtra("extra_is_fbt_flow", true);
        intent.putExtra("extra_fbt_setup_flow_step", i15);
        intent.putExtra("extra_fbt_setup_flow_total_steps", i16);
        intent.putExtra("extra_is_fbt_editing", z17);
        if (wVar != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_fbt_triathlon_leg_targets", wVar);
            com.garmin.android.apps.connectmobile.m2.a(intent, bundle);
        }
        mVar.startActivityForResult(intent, 151);
    }

    @Override // zf0.c
    public final void g(androidx.fragment.app.m mVar, fg0.k kVar, boolean z14, fy1.d dVar, Integer num, boolean z15) {
        mVar.getClass();
        EventGoalActivity.f45976e.getClass();
        Intent intent = new Intent(mVar, (Class<?>) EventGoalActivity.class);
        intent.putExtra("extra_launch_fbt_triathlon_overall_time_goal", true);
        intent.putExtra("extra_is_fbt_flow_back_navigation", z14);
        intent.putExtra("GCM_extra_sharable_event_dto", kVar);
        intent.putExtra("extra_triathlon_goal_steps", dVar);
        intent.putExtra("extra_fbt_setup_flow_total_steps", num);
        intent.putExtra("extra_is_fbt_editing", z15);
        mVar.startActivityForResult(intent, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
    }

    @Override // zf0.c
    public final void h(androidx.fragment.app.m mVar, fg0.k kVar, m52.c cVar) {
        mVar.getClass();
        cVar.getClass();
        EventGoalActivity.f45976e.getClass();
        Intent intent = new Intent(mVar, (Class<?>) EventGoalActivity.class);
        intent.putExtra("GCM_extra_sharable_event_dto", kVar);
        intent.putExtra("LEG_TARGET_TYPE", cVar);
        intent.putExtra("extra_is_fbt_editing", true);
        intent.putExtra("extra_is_fbt_editing_leg_goal", true);
        mVar.startActivityForResult(intent, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
    }

    @Override // zf0.c
    public final void i(androidx.fragment.app.m mVar, fg0.k kVar, boolean z14, fy1.d dVar, Integer num, boolean z15, boolean z16, String str) {
        mVar.getClass();
        EventGoalActivity.f45976e.getClass();
        Intent intent = new Intent(mVar, (Class<?>) EventGoalActivity.class);
        intent.putExtra("extra_launch_fbt_triathlon_goal_selection", true);
        intent.putExtra("extra_is_fbt_flow_back_navigation", z14);
        intent.putExtra("GCM_extra_sharable_event_dto", kVar);
        intent.putExtra("extra_triathlon_goal_steps", dVar);
        intent.putExtra("extra_fbt_setup_flow_total_steps", num);
        intent.putExtra("extra_is_fbt_editing", z15);
        intent.putExtra("extra_fbt_only_allow_finish", z16);
        if (str != null) {
            intent.putExtra("extra_fbt_custom_goal_selection_title", str);
        }
        mVar.startActivityForResult(intent, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
    }
}
