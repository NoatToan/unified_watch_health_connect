package com.garmin.android.apps.connectmobile.usersummary;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import com.google.maps.android.BuildConfig;
import ds.e0;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(UserDailySummaryDTODeserializer.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0016\u0017B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B]\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\u0012B\u0011\b\u0014\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0004\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/usersummary/UserDailySummaryDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Lpd2/b;", "Landroid/os/Parcelable;", "<init>", "()V", "", "userProfileId", "", "totalKilocalories", "activeKilocalories", "bmrKilocalories", "wellnessKilocalories", "burnedKilocalories", "consumedKilocalories", "remainingKilocalories", "netCalorieGoal", "calendarDate", "(Ljava/lang/String;IIIIIIIILjava/lang/String;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "UserDailySummaryDTODeserializer", "b", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserDailySummaryDTO extends s1 implements pd2.b, Parcelable {
    public static final Parcelable.Creator<UserDailySummaryDTO> CREATOR;
    public int A;
    public String B;
    public String C;
    public int D;
    public int E;
    public int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f47237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f47239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f47243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f47244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f47245r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f47246t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f47247v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f47248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f47249x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f47250y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f47251z;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/usersummary/UserDailySummaryDTO$UserDailySummaryDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/usersummary/UserDailySummaryDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserDailySummaryDTODeserializer implements JsonDeserializer<UserDailySummaryDTO>, JsonSerializer<UserDailySummaryDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final UserDailySummaryDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                UserDailySummaryDTO userDailySummaryDTO = new UserDailySummaryDTO();
                userDailySummaryDTO.k(new JSONObject(jsonElement.toString()));
                return userDailySummaryDTO;
            } catch (Exception e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "UserDailySummaryDTO", e4);
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(UserDailySummaryDTO userDailySummaryDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            UserDailySummaryDTO userDailySummaryDTO2 = userDailySummaryDTO;
            userDailySummaryDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(userDailySummaryDTO2.h(), JsonElement.class);
            } catch (Exception e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "UserDailySummaryDTO", e4);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/usersummary/UserDailySummaryDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/usersummary/UserDailySummaryDTO;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserDailySummaryDTO> {
        @Override // android.os.Parcelable.Creator
        public final UserDailySummaryDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserDailySummaryDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserDailySummaryDTO[] newArray(int i14) {
            return new UserDailySummaryDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public UserDailySummaryDTO(Parcel parcel) {
        parcel.getClass();
        this.f47228a = parcel.readString();
        this.f47229b = parcel.readInt();
        this.f47230c = parcel.readInt();
        this.f47231d = parcel.readInt();
        this.f47232e = parcel.readInt();
        this.f47233f = parcel.readInt();
        this.f47234g = parcel.readInt();
        this.f47235h = parcel.readInt();
        this.f47236i = parcel.readInt();
        this.f47237j = parcel.readString();
        this.f47238k = parcel.readString();
        this.f47239l = parcel.readInt();
        this.f47240m = parcel.readInt();
        this.f47241n = parcel.readInt();
        this.f47242o = parcel.readInt();
        this.f47243p = parcel.readInt();
        this.f47244q = parcel.readInt();
        this.f47245r = parcel.readInt();
        this.f47246t = parcel.readInt();
        this.f47247v = parcel.readInt();
        this.f47248w = parcel.readInt();
        this.f47249x = parcel.readInt();
        this.f47250y = parcel.readInt();
        this.f47251z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
    }

    @Override // pd2.b
    public final boolean d(String str) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pd2.b
    public final String h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userProfileId", this.f47228a);
            jSONObject.put("totalKilocalories", this.f47229b);
            jSONObject.put("activeKilocalories", this.f47230c);
            jSONObject.put("bmrKilocalories", this.f47231d);
            jSONObject.put("wellnessKilocalories", this.f47232e);
            jSONObject.put("burnedKilocalories", this.f47233f);
            jSONObject.put("consumedKilocalories", this.f47234g);
            jSONObject.put("remainingKilocalories", this.f47235h);
            jSONObject.put("netRemainingKilocalories", this.f47244q);
            jSONObject.put("netCalorieGoal", this.f47236i);
            jSONObject.put("calendarDate", this.f47238k);
            jSONObject.put("totalDistanceMeters", this.f47245r);
            jSONObject.put("wellnessDistanceMeters", this.f47246t);
            jSONObject.put("intensityMinutesGoal", this.f47247v);
            jSONObject.put("vigorousIntensityMinutes", this.f47248w);
            jSONObject.put("moderateIntensityMinutes", this.f47249x);
            jSONObject.put("userFloorsAscendedGoal", this.f47250y);
            jSONObject.put("floorsAscended", this.f47251z);
            jSONObject.put("floorsDescended", this.A);
            jSONObject.put("wellnessStartTimeGmt", this.B);
            jSONObject.put("wellnessEndTimeGmt", this.C);
            jSONObject.put("averageStressLevel", this.D);
            jSONObject.put("restingHeartRate", this.E);
            jSONObject.put("maxHeartRate", this.F);
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "UserDailySummaryDTO", e4);
            return "";
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        if (jSONObject.has("userProfileId")) {
            if (jSONObject.isNull("userProfileId")) {
                this.f47228a = null;
            } else {
                this.f47228a = jSONObject.getString("userProfileId");
            }
        }
        if (jSONObject.has("totalKilocalories")) {
            this.f47229b = jSONObject.optInt("totalKilocalories", 0);
        }
        if (jSONObject.has("activeKilocalories")) {
            this.f47230c = jSONObject.optInt("activeKilocalories", 0);
        }
        if (jSONObject.has("bmrKilocalories")) {
            this.f47231d = jSONObject.optInt("bmrKilocalories", 0);
        }
        if (jSONObject.has("wellnessKilocalories")) {
            this.f47232e = jSONObject.optInt("wellnessKilocalories", 0);
        }
        if (jSONObject.has("burnedKilocalories")) {
            this.f47233f = jSONObject.optInt("burnedKilocalories", 0);
        }
        if (jSONObject.has("consumedKilocalories")) {
            this.f47234g = jSONObject.optInt("consumedKilocalories", 0);
        }
        if (jSONObject.has("remainingKilocalories")) {
            this.f47235h = jSONObject.optInt("remainingKilocalories", 0);
        }
        if (jSONObject.has("netCalorieGoal")) {
            this.f47236i = jSONObject.optInt("netCalorieGoal", 0);
        }
        if (jSONObject.has("calendarDate")) {
            String string = jSONObject.getString("calendarDate");
            this.f47238k = string;
            if (s.g(string, BuildConfig.TRAVIS)) {
                this.f47238k = null;
            }
        }
        if (jSONObject.has("uuid")) {
            if (jSONObject.isNull("uuid")) {
                this.f47237j = null;
            } else {
                this.f47237j = jSONObject.getString("uuid");
            }
        }
        if (jSONObject.has("totalSteps")) {
            this.f47239l = jSONObject.optInt("totalSteps", -1);
        }
        if (jSONObject.has("dailyStepGoal")) {
            this.f47240m = jSONObject.optInt("dailyStepGoal", -1);
        }
        if (jSONObject.has("sedentarySeconds")) {
            this.f47241n = jSONObject.optInt("sedentarySeconds");
        }
        if (jSONObject.has("highlyActiveSeconds")) {
            this.f47242o = jSONObject.optInt("highlyActiveSeconds");
        }
        if (jSONObject.has("sleepingSeconds")) {
            this.f47243p = jSONObject.optInt("sleepingSeconds");
        }
        if (jSONObject.has("netRemainingKilocalories")) {
            this.f47244q = jSONObject.optInt("netRemainingKilocalories");
        }
        if (jSONObject.has("totalDistanceMeters")) {
            this.f47245r = jSONObject.optInt("totalDistanceMeters");
        }
        if (jSONObject.has("wellnessDistanceMeters")) {
            this.f47246t = jSONObject.optInt("wellnessDistanceMeters");
        }
        if (jSONObject.has("userFloorsAscendedGoal")) {
            this.f47250y = jSONObject.optInt("userFloorsAscendedGoal", -1);
        }
        if (jSONObject.has("floorsAscended")) {
            this.f47251z = jSONObject.optInt("floorsAscended", -1);
        }
        if (jSONObject.has("floorsDescended")) {
            this.A = jSONObject.optInt("floorsDescended", -1);
        }
        if (jSONObject.has("userFloorsAscendedGoal")) {
            this.f47250y = jSONObject.optInt("userFloorsAscendedGoal", -1);
        }
        if (jSONObject.has("floorsAscended")) {
            this.f47251z = jSONObject.optInt("floorsAscended", -1);
        }
        if (jSONObject.has("floorsDescended")) {
            this.A = jSONObject.optInt("floorsDescended", -1);
        }
        if (jSONObject.has("intensityMinutesGoal")) {
            this.f47247v = jSONObject.optInt("intensityMinutesGoal", -1);
        }
        if (jSONObject.has("moderateIntensityMinutes")) {
            this.f47249x = jSONObject.optInt("moderateIntensityMinutes", -1);
        }
        if (jSONObject.has("vigorousIntensityMinutes")) {
            this.f47248w = jSONObject.optInt("vigorousIntensityMinutes", -1);
        }
        if (jSONObject.has("wellnessStartTimeGmt")) {
            this.B = s1.u(jSONObject, "wellnessStartTimeGmt");
        }
        if (jSONObject.has("wellnessEndTimeGmt")) {
            this.C = s1.u(jSONObject, "wellnessEndTimeGmt");
        }
        if (jSONObject.has("averageStressLevel")) {
            this.D = jSONObject.optInt("averageStressLevel", -1);
        }
        if (jSONObject.has("restingHeartRate")) {
            this.E = jSONObject.optInt("restingHeartRate", -1);
        }
        if (jSONObject.has("maxHeartRate")) {
            this.F = jSONObject.optInt("maxHeartRate", -1);
        }
    }

    public final String toString() {
        String str = this.f47228a;
        int i14 = this.f47229b;
        int i15 = this.f47230c;
        int i16 = this.f47231d;
        int i17 = this.f47232e;
        int i18 = this.f47233f;
        int i19 = this.f47234g;
        int i24 = this.f47235h;
        int i25 = this.f47236i;
        int i26 = this.f47244q;
        int i27 = this.f47245r;
        int i28 = this.f47246t;
        int i29 = this.f47247v;
        int i30 = this.f47248w;
        int i34 = this.f47250y;
        int i35 = this.f47251z;
        int i36 = this.A;
        String str2 = this.B;
        String str3 = this.C;
        int i37 = this.D;
        int i38 = this.E;
        int i39 = this.F;
        StringBuilder sbK = j.k(i14, "UserDailySummary [USER_PROFILE_ID = ", str, " TOTAL_KCAL = ", " ACTIVE_KCAL = ");
        e0.m(i15, i16, " BMR_KCAL = ", " WELLNESS_KCAL = ", sbK);
        e0.m(i17, i18, " BURNED_KCAL = ", " CONSUMED_KCAL = ", sbK);
        e0.m(i19, i24, " REMAINING_KCAL = ", " NET_CALORIE_GOAL = ", sbK);
        e0.m(i25, i26, " NET_REMAINING_KCAL", " DISTANCE = ", sbK);
        e0.m(i27, i28, " WELLNESS_DISTANCE_METERS = ", " INTENSITY_MINUTES_GOAL = ", sbK);
        e0.m(i29, i30, " VIGOROUS_INTENSITY_MINUTES = ", " MODERATE_INTENSITY_MINUTES = ", sbK);
        e0.m(i30, i34, " ASCENDED_GOAL = ", " ASCENDED_ACTUAL = ", sbK);
        e0.m(i35, i36, " DESCENDED_ACTUAL = ", " WELLNESS_START_TIME_GMT = ", sbK);
        sn.a.t(sbK, str2, " WELLNESS_END_TIME_GMT = ", str3, " AVERAGE_STRESS_LEVEL = ");
        e0.m(i37, i38, " RESTING_HEART_RATE = ", " MAX_HEART_RATE = ", sbK);
        return am.j.q(sbK, i39, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f47228a);
        parcel.writeInt(this.f47229b);
        parcel.writeInt(this.f47230c);
        parcel.writeInt(this.f47231d);
        parcel.writeInt(this.f47232e);
        parcel.writeInt(this.f47233f);
        parcel.writeInt(this.f47234g);
        parcel.writeInt(this.f47235h);
        parcel.writeInt(this.f47236i);
        parcel.writeString(this.f47237j);
        parcel.writeString(this.f47238k);
        parcel.writeInt(this.f47239l);
        parcel.writeInt(this.f47240m);
        parcel.writeInt(this.f47241n);
        parcel.writeInt(this.f47242o);
        parcel.writeInt(this.f47243p);
        parcel.writeInt(this.f47244q);
        parcel.writeInt(this.f47245r);
        parcel.writeInt(this.f47246t);
        parcel.writeInt(this.f47247v);
        parcel.writeInt(this.f47248w);
        parcel.writeInt(this.f47249x);
        parcel.writeInt(this.f47250y);
        parcel.writeInt(this.f47251z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\n¨\u0006)"}, d2 = {"Lcom/garmin/android/apps/connectmobile/usersummary/UserDailySummaryDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/usersummary/UserDailySummaryDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "TAG", "Ljava/lang/String;", "KEY_USER_PROFILE_ID", "KEY_TOTAL_KCAL", "KEY_ACTIVE_KCAL", "KEY_BMR_KCAL", "KEY_WELLNESS_KCAL", "KEY_BURNED_KCAL", "KEY_CONSUMED_KCAL", "KEY_REMAINING_KCAL", "KEY_NET_CALORIE_GOAL", "KEY_CALENDAR_DATE", "KEY_UUID", "KEY_TOTAL_STEPS", "KEY_DAILY_STEP_GOAL", "KEY_SEDENTARY_SECONDS", "KEY_SLEEPING_SECONDS", "KEY_HIGHLY_ACTIVE_SECONDS", "KEY_NET_REMAINING_KILOCALORIES", "KEY_DISTANCE", "KEY_INTENSITY_MINUTES_GOAL", "KEY_VIGOROUS_INTENSITY_MINUTES", "KEY_MODERATE_INTENSITY_MINUTES", "KEY_ASCENDED_GOAL", "KEY_ASCENDED_ACTUAL", "KEY_DESCENDED_ACTUAL", "KEY_WELLNESS_START_TIME_GMT", "KEY_WELLNESS_END_TIME_GMT", "KEY_WELLNESS_DISTANCE_METERS", "KEY_AVERAGE_STRESS_LEVEL", "KEY_RESTING_HEART_RATE", "KEY_MAX_HEART_RATE", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public UserDailySummaryDTO(String str, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, String str2) {
        this.f47228a = str;
        this.f47229b = i14;
        this.f47230c = i15;
        this.f47231d = i16;
        this.f47232e = i17;
        this.f47233f = i18;
        this.f47234g = i19;
        this.f47235h = i24;
        this.f47236i = i25;
        this.f47238k = str2;
    }

    public UserDailySummaryDTO() {
        this.f47228a = null;
        this.f47229b = 0;
        this.f47230c = 0;
        this.f47231d = 0;
        this.f47232e = 0;
        this.f47233f = 0;
        this.f47234g = 0;
        this.f47235h = 0;
        this.f47236i = 0;
        this.f47238k = null;
        this.f47245r = 0;
        this.f47246t = 0;
        this.f47247v = 0;
        this.f47248w = 0;
        this.f47249x = 0;
        this.f47250y = 0;
        this.f47251z = 0;
        this.A = 0;
        this.B = null;
        this.C = null;
        this.D = 0;
        this.E = 0;
        this.F = 0;
    }
}
