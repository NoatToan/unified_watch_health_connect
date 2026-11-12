package com.garmin.android.apps.connectmobile.golf.truswing.model;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public enum c {
    TEMPO(2131232071, R.string.golf_lbl_swing_tempo, R.string.golf_club_tempo_description),
    SPEED(2131232070, R.string.golf_lbl_club_speed, R.string.golf_club_head_speed_description),
    CLUB_PATH_AT_IMPACT(2131232065, R.string.golf_lbl_club_path, R.string.golf_club_path_description_a),
    FACE_ANGLE_TO_TARGET(2131232066, R.string.golf_lbl_face_angle_to_target, R.string.golf_face_to_target_description_a),
    SHAFT_LEAN_AT_IMPACT(2131232069, R.string.golf_lbl_shaft_lean_impact, R.string.golf_shaft_lean_impact_description),
    SHAFT_LEAN_AT_ADDRESS(2131232069, R.string.golf_lbl_shaft_lean_address, R.string.golf_shaft_lean_address_description),
    SHAFT_ANGLE_AT_IMPACT(2131232068, R.string.golf_lbl_shaft_angle_impact, R.string.golf_shaft_angle_impact_description),
    SHAFT_ANGLE_AT_ADDRESS(2131232068, R.string.golf_lbl_shaft_angle_address, R.string.golf_shaft_angle_address_description),
    DYNAMIC_LOFT(2131232067, R.string.golf_lbl_dynamic_loft, R.string.golf_dynamic_loft_description);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35916c;

    c(int i14, int i15, int i16) {
        this.f35915b = i15;
        this.f35914a = i14;
        this.f35916c = i16;
    }
}
