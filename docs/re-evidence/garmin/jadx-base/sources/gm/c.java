package gm;

import am.x0;
import am.z0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final int[] a(Context context, x0 x0Var) {
        x0Var.getClass();
        String str = x0Var.f4358a;
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.f4308n, str) || z0.b(x0.f4271b3, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_running_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_running_card_gradient_end)};
        }
        if (z0.b(x0.f4312o, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_cycling_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_cycling_card_gradient_end)};
        }
        if (z0.b(x0.f4313o1, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_lap_swimming_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_lap_swimming_card_gradient_end)};
        }
        if (z0.z(str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_floor_climbing_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_floor_climbing_card_gradient_end)};
        }
        if (z0.b(x0.f4324r, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_swimming_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_swimming_card_gradient_end)};
        }
        if (z0.b(x0.f4331t, str) || z0.b(x0.f4274c3, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_walking_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_walking_card_gradient_end)};
        }
        if (z0.b(x0.D, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_diving_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_diving_card_gradient_end)};
        }
        if (z0.e0(str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_yoga_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_yoga_card_gradient_end)};
        }
        if (z0.w(str) || z0.T(str) || z0.W(str) || z0.N(str) || z0.b(x0.f4352y2, str) || z0.b(x0.f4356z2, str) || z0.b(x0.C2, str) || z0.b(x0.C3, str) || z0.D(str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_interior_sports_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_interior_sports_card_gradient_end)};
        }
        if (z0.t(str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_cardio_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_cardio_card_gradient_end)};
        }
        if (z0.b(x0.P1, str) || z0.O(str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_other_golf_racing_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_other_golf_racing_card_gradient_end)};
        }
        if (z0.b(x0.U1, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_winter_sports_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_winter_sports_card_gradient_end)};
        }
        if (z0.b(x0.f4344w2, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_breathwork_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_breathwork_card_gradient_end)};
        }
        if (z0.b(x0.f4348x2, str)) {
            return new int[]{a7.b.getColor(context, R.color.gcm_activity_meditation_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_meditation_card_gradient_end)};
        }
        if (z0.b(x0.f4277d3, str) || z0.b(x0.f4323q3, str)) {
            return new int[]{a7.b.getColor(context, R.color.palette_swagger_2), a7.b.getColor(context, R.color.palette_swagger_1)};
        }
        if (z0.b(x0.f4357z3, str) || z0.b(x0.A3, str) || z0.b(x0.B3, str) || z0.b(x0.f4287h1, str)) {
            return new int[]{a7.b.getColor(context, R.color.palette_ruby_2), a7.b.getColor(context, R.color.palette_ruby_0)};
        }
        return (z0.b(x0.f4350y, str) || z0.K(str)) ? new int[]{a7.b.getColor(context, R.color.gcm_activity_water_sports_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_water_sports_card_gradient_end)} : new int[]{a7.b.getColor(context, R.color.gcm_activity_other_golf_racing_card_gradient_start), a7.b.getColor(context, R.color.gcm_activity_other_golf_racing_card_gradient_end)};
    }
}
