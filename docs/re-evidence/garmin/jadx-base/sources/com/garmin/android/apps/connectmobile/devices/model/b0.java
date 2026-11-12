package com.garmin.android.apps.connectmobile.devices.model;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/b0;", "", "", "displayResId", "", "resourceMiddleName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b0 {
    NONE(R.string.device_setting_watch_face_complications_empty, ""),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OF_DAY(R.string.device_setting_watch_face_complications_current_time, "currenttime"),
    /* JADX INFO: Fake field, exist only in values array */
    BATTERY(R.string.device_setting_watch_face_complications_battery, "battery"),
    STEPS(R.string.lbl_steps, "steps"),
    /* JADX INFO: Fake field, exist only in values array */
    FLOORS(R.string.floors_climbed_lbl, "floors"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENSITY_MINUTES(R.string.title_intensity_minutes_abbr, "intensitymin"),
    /* JADX INFO: Fake field, exist only in values array */
    SECONDS(R.string.device_setting_watch_face_complications_second_count, "seconds"),
    /* JADX INFO: Fake field, exist only in values array */
    CALORIES(R.string.lbl_calories, "cal"),
    ALTERNATE_DATE(R.string.device_setting_watch_face_complications_day_date, "daydate"),
    /* JADX INFO: Fake field, exist only in values array */
    DATE(R.string.txt_date, "date"),
    /* JADX INFO: Fake field, exist only in values array */
    WEATHER(R.string.weather_section_title, "weather"),
    /* JADX INFO: Fake field, exist only in values array */
    CALENDAR(R.string.lbl_calendar, "calendar"),
    /* JADX INFO: Fake field, exist only in values array */
    STATUS(R.string.device_settings_vector_section_title_status, "status"),
    /* JADX INFO: Fake field, exist only in values array */
    HEART_RATE(R.string.device_screen_heart_rate, "hr"),
    CUSTOM_1(R.string.device_setting_watch_face_complications_floors_intensityMin_steps, "3eye_1"),
    CUSTOM_2(R.string.device_setting_watch_face_complications_steps_secondCount_floors, "3eye_2"),
    CUSTOM_3(R.string.device_setting_watch_face_complications_date_battery_weather, "3eye_3");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34111b;

    b0(int i14, String str) {
        this.f34110a = i14;
        this.f34111b = str;
    }
}
