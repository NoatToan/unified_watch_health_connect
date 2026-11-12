package oi0;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import d53.k;
import d53.u;
import d53.w;
import j20.x;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loi0/b;", "", "Ll22/b;", "resourceResolver", "", "text", "<init>", "(Ll22/b;Ljava/lang/String;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f132237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f132238b;

    public b(l22.b bVar, String str) {
        bVar.getClass();
        str.getClass();
        this.f132237a = bVar;
        this.f132238b = str;
    }

    public final void A() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_mile), bVar.getString(R.string.lbl_mile_singular), false);
    }

    public final void B() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_mile), bVar.getString(R.string.common_lbl_miles), false);
    }

    public final void C() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_mph), bVar.getString(R.string.common_mph_string), false);
    }

    public final void D() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_unit_milliliter_abr), bVar.getString(R.string.common_milliliters), false);
    }

    public final void E() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        String string = bVar.getString(R.string.common_min_abbreviated_without_period);
        if (string.length() > 0) {
            string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
        }
        this.f132238b = u.v(str, string, bVar.getString(R.string.lbl_minimum), false);
    }

    public final void F() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_minute_per_km), bVar.getString(R.string.lbl_minutes_per_kilometer), false);
    }

    public final void G() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_minute_per_mile), bVar.getString(R.string.lbl_minutes_per_mile), false);
    }

    public final void H() {
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(this.f132238b, bVar.getString(R.string.lbl_minute_100_meters), bVar.a(R.string.lbl_minutes_per_distance, bVar.a(R.string.common_n_meters_label, 100)), false);
    }

    public final void I() {
        this.f132238b = new k("[-–]").f(this.f132238b, this.f132237a.getString(R.string.lbl_minus));
    }

    public final void J() {
        l22.b bVar = this.f132237a;
        String string = bVar.getString(R.string.lbl_minute);
        String string2 = bVar.getString(R.string.common_min_abbreviated_without_period);
        String string3 = bVar.getString(R.string.lbl_minutes_abbreviation);
        this.f132238b = new k(x.d(string, "|", string2, "|", string3)).f(this.f132238b, bVar.getString(R.string.lbl_time_unit_minutes));
    }

    public final void K() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_ms), bVar.getString(R.string.lbl_milliseconds), false);
    }

    public final void L() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_my_fitness_pal), bVar.getString(R.string.lbl_my_fitness_pal_talkback), false);
    }

    public final void M() {
        l22.b bVar = this.f132237a;
        String string = bVar.getString(R.string.no_value);
        String string2 = bVar.getString(R.string.no_value_card);
        this.f132238b = new k(a0.j("-- : --|--:--|", string, "|", string2)).f(this.f132238b, bVar.getString(R.string.txt_empty_page_no_data));
    }

    public final void N() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_one_rep), bVar.getString(R.string.lbl_one_repetition), true);
    }

    public final void O() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.common_abbrev_ounce), bVar.getString(R.string.common_ounces), false);
    }

    public final void P(boolean z14, boolean z15) {
        String str = this.f132238b;
        String strConcat = StringUtils.SPACE;
        if (!z15) {
            String string = this.f132237a.getString(R.string.lbl_per);
            if (!z14) {
                strConcat = "";
            }
            strConcat = string.concat(strConcat);
        }
        this.f132238b = u.v(str, "/", strConcat, false);
    }

    public final void R() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_lbs), bVar.getString(R.string.lbl_pounds), false);
    }

    public final void S() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_psi), bVar.getString(R.string.lbl_pound_per_square_inch), false);
    }

    public final void T() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_rpm), bVar.getString(R.string.lbl_revolutions_per_minute), false);
    }

    public final void U() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.pulse_ox_spo2_label), bVar.getString(R.string.lbl_peripheral_oxygen_saturation), false);
    }

    public final void V() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_vo2_max), bVar.getString(R.string.lbl_max_oxygen_rate), true);
    }

    public final void W() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.common_abbrev_ml_per_kg_per_min), bVar.getString(R.string.lbl_vo2_unit_long_format), false);
    }

    public final void X() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_watts), bVar.getString(R.string.common_watts), false);
    }

    public final void Y() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_watt_kg), bVar.getString(R.string.lbl_watts_per_kilogram), false);
    }

    public final void Z() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        if (w.z(str, bVar.getString(R.string.lbl_kg), false)) {
            q();
            return;
        }
        if (w.z(this.f132238b, bVar.getString(R.string.lbl_abbrev_stone), false) && w.z(this.f132238b, bVar.getString(R.string.lbl_lbs), false)) {
            this.f132238b = u.v(u.v(this.f132238b, bVar.getString(R.string.lbl_abbrev_stone), bVar.getString(R.string.lbl_stones), false), bVar.getString(R.string.lbl_lbs), bVar.getString(R.string.lbl_pounds), false);
        } else if (w.z(this.f132238b, bVar.getString(R.string.lbl_lbs), false)) {
            R();
        } else if (w.z(this.f132238b, bVar.getString(R.string.lbl_abbrev_stone), false)) {
            this.f132238b = u.v(u.v(this.f132238b, ":", bVar.getString(R.string.lbl_stones), false), bVar.getString(R.string.lbl_abbrev_stone), bVar.getString(R.string.lbl_pounds), false);
        }
    }

    public final void a() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.sleep_lbl_average_prefix), bVar.getString(R.string.lbl_average), true);
    }

    public final void a0() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_yard), bVar.getString(R.string.common_yard), false);
    }

    public final void b() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_bpm), bVar.getString(R.string.lbl_heart_rate_beats_per_minute), false);
    }

    public final void b0() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_yard), bVar.getString(R.string.common_yards_string), false);
    }

    public final void c() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.activities_brpm_common_lbl), bVar.getString(R.string.lbl_breaths_per_minute), false);
    }

    public final void d() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.calories_abbreviation), bVar.getString(R.string.lbl_calories), false);
    }

    public final void e() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.legal_page_eula), bVar.getString(R.string.lbl_end_user_license_agreements), false);
    }

    public final void f() {
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(this.f132238b, bVar.getString(R.string.lbl_functional_threshold_power_short), bVar.getString(R.string.device_settings_functional_threshold_power), false);
    }

    public final void g() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_ft), bVar.getString(R.string.common_feet_string), false);
    }

    public final void h() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_ft_per_hour), bVar.getString(R.string.lbl_feet_per_hour), false);
    }

    public final void i() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_ft), bVar.getString(R.string.foot_unit), false);
    }

    public final void j() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_grams_abr), bVar.getString(R.string.lbl_grams), false);
    }

    public final void k() {
        this.f132238b = u.v(this.f132238b, ">", this.f132237a.getString(R.string.workout_duration_value_above), false);
    }

    public final void l() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.hrv), bVar.getString(R.string.lbl_heart_rate_variability), false);
    }

    public final void m() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        boolean z14 = w.z(str, bVar.getString(R.string.lbl_cm), false);
        String str2 = this.f132238b;
        if (z14) {
            this.f132238b = u.v(str2, bVar.getString(R.string.lbl_cm), bVar.getString(R.string.lbl_centimeters), false);
            return;
        }
        if (w.z(str2, bVar.getString(R.string.lbl_foot), false) && w.z(this.f132238b, bVar.getString(R.string.lbl_inch), false)) {
            this.f132238b = u.v(u.v(this.f132238b, bVar.getString(R.string.lbl_foot), bVar.getString(R.string.common_feet_string), false), bVar.getString(R.string.lbl_inch), bVar.getString(R.string.lbl_inches), false);
            return;
        }
        boolean z15 = w.z(this.f132238b, bVar.getString(R.string.lbl_foot), false);
        String str3 = this.f132238b;
        if (z15) {
            this.f132238b = u.v(str3, bVar.getString(R.string.lbl_foot), bVar.getString(R.string.common_feet_string), false);
            return;
        }
        boolean z16 = w.z(str3, bVar.getString(R.string.lbl_inch), false);
        String str4 = this.f132238b;
        if (z16) {
            this.f132238b = u.v(str4, bVar.getString(R.string.lbl_inch), bVar.getString(R.string.lbl_inches), false);
            return;
        }
        if (w.z(str4, "'", false) && w.z(this.f132238b, "\"", false)) {
            this.f132238b = u.v(u.v(this.f132238b, "'", bVar.getString(R.string.common_feet_string), false), "\"", bVar.getString(R.string.lbl_inches), false);
        } else if (w.z(this.f132238b, "'", false)) {
            this.f132238b = u.v(this.f132238b, "'", bVar.getString(R.string.common_feet_string), false);
        }
    }

    public final void n() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_hours_abbreviation), bVar.getString(R.string.lbl_hours), false);
    }

    public final void o() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(u.v(str, bVar.getString(R.string.common_duration_format_label), bVar.getString(R.string.common_duration_format_label_content_description), false), bVar.getString(R.string.hour_minute_second_format), bVar.getString(R.string.common_duration_format_label_content_description), false);
    }

    public final void p() {
        this.f132238b = new k("[-–—]").f(this.f132238b, this.f132237a.getString(R.string.lbl_to));
    }

    public final void q() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_kg), bVar.getString(R.string.lbl_kilograms), false);
    }

    public final void r() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_km), bVar.getString(R.string.lbl_kilometer_singular), false);
    }

    public final void s() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_km), bVar.getString(R.string.common_lbl_kilometers), false);
    }

    public final void t() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_kmh), bVar.getString(R.string.common_kph_string), false);
    }

    public final void u() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_nautical_speed_abr), bVar.getString(R.string.lbl_knots), false);
    }

    public final void v() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.title_live_track), bVar.getString(R.string.lbl_screen_reader_live_track), false);
    }

    public final void w() {
        this.f132238b = u.v(this.f132238b, "<", this.f132237a.getString(R.string.workout_duration_value_below), false);
    }

    public final void x() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_m), bVar.getString(R.string.common_meter), false);
    }

    public final void y() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_m), bVar.getString(R.string.common_meters_string), false);
    }

    public final void z() {
        String str = this.f132238b;
        l22.b bVar = this.f132237a;
        this.f132238b = u.v(str, bVar.getString(R.string.lbl_meters_per_hour_short_abbrev), bVar.getString(R.string.lbl_meters_per_hour), false);
    }
}
