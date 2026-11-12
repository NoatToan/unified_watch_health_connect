package com.garmin.android.apps.connectmobile.settings.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(StepLengthDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "StepLengthDTODeserializer", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StepLengthDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<StepLengthDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f43519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f43521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f43522f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO$StepLengthDTODeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StepLengthDTODeserializer implements JsonSerializer<StepLengthDTO>, JsonDeserializer<StepLengthDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final StepLengthDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                StepLengthDTO stepLengthDTO = new StepLengthDTO();
                stepLengthDTO.k(new JSONObject(jsonElement.toString()));
                return stepLengthDTO;
            } catch (Exception e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "StepLengthDTO", e4);
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(StepLengthDTO stepLengthDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            StepLengthDTO stepLengthDTO2 = stepLengthDTO;
            stepLengthDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(stepLengthDTO2.D().toString(), JsonElement.class);
            } catch (Exception e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "StepLengthDTO", e4);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/model/StepLengthDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepLengthDTO> {
        @Override // android.os.Parcelable.Creator
        public final StepLengthDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new StepLengthDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StepLengthDTO[] newArray(int i14) {
            return new StepLengthDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public StepLengthDTO(Parcel parcel) {
        parcel.getClass();
        this.f43519c = Double.NaN;
        this.f43521e = Double.NaN;
        this.f43522f = Double.NaN;
        this.f43517a = parcel.readString();
        this.f43518b = parcel.readString();
        this.f43519c = parcel.readDouble();
        this.f43520d = parcel.readString();
        this.f43521e = parcel.readDouble();
        this.f43522f = parcel.readDouble();
    }

    public final boolean C() {
        return this.f43517a == null && this.f43518b == null && this.f43520d == null && Double.isNaN(this.f43519c) && Double.isNaN(this.f43521e) && Double.isNaN(this.f43522f);
    }

    public final JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f43517a)) {
                String str = this.f43517a;
                str.getClass();
                jSONObject.put("userId", Long.parseLong(str));
            }
            if (!TextUtils.isEmpty(this.f43518b)) {
                jSONObject.put("activityTypeKey", this.f43518b);
            }
            if (!TextUtils.isEmpty(this.f43520d)) {
                jSONObject.put("unitKey", this.f43520d);
            }
            if (!Double.isNaN(this.f43519c)) {
                jSONObject.put("distance", this.f43519c);
            }
            if (!Double.isNaN(this.f43521e)) {
                jSONObject.put("steps", this.f43521e);
            }
            if (!Double.isNaN(this.f43522f)) {
                jSONObject.put("stepLength", this.f43522f);
            }
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.SETTINGS, "StepLengthDTO", "Error while converting to JSON object: " + e4);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f43517a = s1.u(jSONObject, "userId");
            this.f43518b = s1.u(jSONObject, "activityTypeKey");
            this.f43519c = jSONObject.optDouble("distance");
            this.f43520d = s1.u(jSONObject, "unitKey");
            this.f43521e = jSONObject.optDouble("steps");
            this.f43522f = jSONObject.optDouble("stepLength");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f43517a);
        parcel.writeString(this.f43518b);
        parcel.writeDouble(this.f43519c);
        parcel.writeString(this.f43520d);
        parcel.writeDouble(this.f43521e);
        parcel.writeDouble(this.f43522f);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "USER_ID", "ACTIVITY_TYPE_KEY", "DISTANCE", "UNIT_KEY", "STEPS", "STEPS_LENGTH", "ACTIVITY_TYPE_RUNNING", "ACTIVITY_TYPE_WALKING", "UNIT_METER", "UNIT_FOOT", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public StepLengthDTO() {
        this.f43519c = Double.NaN;
        this.f43521e = Double.NaN;
        this.f43522f = Double.NaN;
    }
}
