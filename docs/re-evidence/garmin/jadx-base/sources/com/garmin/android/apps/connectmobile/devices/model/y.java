package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/y;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "c", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends s1 implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34330c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/y$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/y;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i14) {
            return new y[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public y(Parcel parcel) {
        parcel.getClass();
        this.f34328a = parcel.readString();
        this.f34329b = parcel.readInt();
        this.f34330c = parcel.readByte() != 0;
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("screenId", this.f34328a);
            jSONObject.put("screenIndex", this.f34329b);
            jSONObject.put("enabled", this.f34330c);
            return jSONObject;
        } catch (JSONException e4) {
            sn.a.s("Error converting to JSON: ", e4.getMessage(), i2.f36769a, a2.DEVICES, "ScreenDTO");
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f34328a = jSONObject.optString("screenId");
        this.f34329b = jSONObject.optInt("screenIndex", -1);
        this.f34330c = jSONObject.optBoolean("enabled");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f34328a);
        parcel.writeInt(this.f34329b);
        parcel.writeByte(this.f34330c ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v50 com.garmin.android.apps.connectmobile.devices.model.y$c[], still in use, count: 1, list:
      (r0v50 com.garmin.android.apps.connectmobile.devices.model.y$c[]) from 0x035f: CONSTRUCTOR (r0v50 com.garmin.android.apps.connectmobile.devices.model.y$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/y$c;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_WEATHER", R.string.title_weather_on_off),
        /* JADX INFO: Fake field, exist only in values array */
        HEALTH_STATS_2("APP_NATIVE_ID_STEPS", R.string.steps_steps),
        /* JADX INFO: Fake field, exist only in values array */
        ACTIVE_MINUTES("APP_NATIVE_ID_ACTIVE_MINUTES", R.string.title_intensity_minutes),
        /* JADX INFO: Fake field, exist only in values array */
        DISTANCE("APP_NATIVE_ID_DISTANCE", R.string.lbl_distance),
        /* JADX INFO: Fake field, exist only in values array */
        CALORIES("APP_NATIVE_ID_CALORIES", R.string.lbl_calories),
        /* JADX INFO: Fake field, exist only in values array */
        TIME("APP_NATIVE_ID_TIME", R.string.lbl_time),
        /* JADX INFO: Fake field, exist only in values array */
        DATE("APP_NATIVE_ID_DATE", R.string.txt_date),
        /* JADX INFO: Fake field, exist only in values array */
        STEPS_GOAL("APP_NATIVE_ID_STEPS_GOAL", R.string.steps_steps_goal),
        /* JADX INFO: Fake field, exist only in values array */
        ACTIVITY_TIMER("APP_NATIVE_ID_ACTIVITY_TIMER", R.string.lbl_activity_timer),
        /* JADX INFO: Fake field, exist only in values array */
        HEART_RATE("APP_NATIVE_ID_HEART_RATE", R.string.device_screen_heart_rate),
        /* JADX INFO: Fake field, exist only in values array */
        TIME_DATE("APP_NATIVE_ID_TIME_DATE", R.string.device_screen_time_date),
        /* JADX INFO: Fake field, exist only in values array */
        LAST_ACTIVITY("APP_NATIVE_ID_LAST_ACTIVITY", R.string.lbl_last_activity),
        /* JADX INFO: Fake field, exist only in values array */
        TIMER("APP_NATIVE_ID_TIMER", R.string.run_options_timer),
        /* JADX INFO: Fake field, exist only in values array */
        FLOORS_CLIMBED("APP_NATIVE_ID_FLOORS_CLIMBED", R.string.floors_climbed_lbl),
        /* JADX INFO: Fake field, exist only in values array */
        MUSIC("APP_NATIVE_ID_MUSIC", R.string.controls_menu_music_control),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_BIKE", R.string.lbl_bike),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_BIKE_RUN", R.string.concept_garmin_devices),
        /* JADX INFO: Fake field, exist only in values array */
        HEALTH_STATS_2("APP_NATIVE_ID_VIRB", R.string.device_screen_virb_remote),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_ALL_DAY_STRESS", R.string.title_stress),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_CALENDAR", R.string.calendar),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_NOTIFICATIONS", R.string.device_screen_notifications),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_MOVE_BAR", R.string.device_screen_move_bar),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_STRENGTH_TRAINING", R.string.lbl_strength_training),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_STRESS_SCORE", R.string.allday_stress_score),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_MY_DAY", R.string.concept_my_day_abbr),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_SLEEP", R.string.concept_sleep),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_VARIA", R.string.concept_garmin_devices),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_GOLF_WIDGET", R.string.device_category_golf),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_USER_TEXT_SCREEN", R.string.lbl_custom_text),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_BODY_BATTERY", R.string.device_settings_body_battery),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_HEALTH_STATS", R.string.lbl_health_stats),
        /* JADX INFO: Fake field, exist only in values array */
        HEALTH_STATS_2("APP_NATIVE_ID_HEALTH_STATS_2", R.string.lbl_health_stats),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_ATP", R.string.lbl_adaptive_training_plan),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_WEIGHT", R.string.lbl_weight),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_DELTA("APP_NATIVE_ID_WEIGHT_DELTA", R.string.lbl_weight_trend),
        /* JADX INFO: Fake field, exist only in values array */
        POWER_TO_WEIGHT("APP_NATIVE_ID_POWER_TO_WEIGHT", R.string.concept_garmin_devices),
        BMI("APP_NATIVE_ID_BMI", R.string.lbl_weight_characteristic_bmi),
        BODY_FAT("APP_NATIVE_ID_BODY_FAT", R.string.lbl_body_fat_percent_sign),
        MUSCLE_MASS("APP_NATIVE_ID_MUSCLE_MASS", R.string.lbl_weight_characteristic_muscle_mass),
        BODY_WATER("APP_NATIVE_ID_BODY_WATER", R.string.lbl_body_water_percent_sign),
        BONE_MASS("APP_NATIVE_ID_BONE_MASS", R.string.lbl_weight_characteristic_bone_mass),
        /* JADX INFO: Fake field, exist only in values array */
        MCT("APP_NATIVE_ID_MCT", R.string.pregnancy_womens_health_tracking_title),
        /* JADX INFO: Fake field, exist only in values array */
        HYDRATION("APP_NATIVE_ID_HYDRATION", R.string.lbl_hydration_title),
        /* JADX INFO: Fake field, exist only in values array */
        RESPIRATION("APP_NATIVE_ID_BREATHING", R.string.activities_respiration_title),
        /* JADX INFO: Fake field, exist only in values array */
        PULSE_OX("APP_NATIVE_ID_PULSE_OXIMETER", R.string.device_settings_pulse_ox),
        /* JADX INFO: Fake field, exist only in values array */
        STATUS_TIME("APP_NATIVE_ID_STATUS_TIME", R.string.device_settings_status_time),
        /* JADX INFO: Fake field, exist only in values array */
        LAP_SWIMMING("APP_NATIVE_ID_LAP_SWIMMING", R.string.lbl_last_pool_swim),
        /* JADX INFO: Fake field, exist only in values array */
        OPEN_WATER("APP_NATIVE_ID_OPEN_WATER", R.string.lbl_last_open_water_swim),
        /* JADX INFO: Fake field, exist only in values array */
        RUN("APP_NATIVE_ID_RUN", R.string.lbl_run),
        /* JADX INFO: Fake field, exist only in values array */
        HISTORY("APP_NATIVE_ID_HISTORY", R.string.lbl_last_sport_history);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34331c = new a(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34338j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34340b;

        static {
            f34338j = new w13.c(new c[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r2, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r2, r0, r1, r0, r1, r0, r1, r0, r1, r0, new c("APP_NATIVE_ID_MCT", R.string.pregnancy_womens_health_tracking_title), new c("APP_NATIVE_ID_HYDRATION", R.string.lbl_hydration_title), new c("APP_NATIVE_ID_BREATHING", R.string.activities_respiration_title), new c("APP_NATIVE_ID_PULSE_OXIMETER", R.string.device_settings_pulse_ox), new c("APP_NATIVE_ID_STATUS_TIME", R.string.device_settings_status_time), new c("APP_NATIVE_ID_LAP_SWIMMING", R.string.lbl_last_pool_swim), new c("APP_NATIVE_ID_OPEN_WATER", R.string.lbl_last_open_water_swim), new c("APP_NATIVE_ID_RUN", R.string.lbl_run), new c("APP_NATIVE_ID_HISTORY", R.string.lbl_last_sport_history)});
        }

        private c(String str, int i14) {
            super(str, i);
            this.f34339a = str;
            this.f34340b = i14;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f34337i.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/y$c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static Integer a(String str) {
                if (str == null) {
                    return null;
                }
                w13.c cVar = c.f34338j;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    c cVar2 = (c) bVarN.next();
                    if (p005kotlin.jvm.internal.s.g(cVar2.f34339a, str)) {
                        return Integer.valueOf(cVar2.f34340b);
                    }
                }
                return null;
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/y$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/y;", "CREATOR", "Landroid/os/Parcelable$Creator;", "KEY_SCREEN_ID", "KEY_SCREEN_INDEX", "KEY_ENABLED", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public y() {
    }
}
