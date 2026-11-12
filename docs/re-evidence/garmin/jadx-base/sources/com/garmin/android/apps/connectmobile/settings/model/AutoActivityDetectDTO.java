package com.garmin.android.apps.connectmobile.settings.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(AutoActivityDetectDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0014\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "AutoActivityDetectDTODeserializer", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AutoActivityDetectDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<AutoActivityDetectDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f43509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f43510c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO$AutoActivityDetectDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AutoActivityDetectDTODeserializer implements JsonDeserializer<AutoActivityDetectDTO>, JsonSerializer<AutoActivityDetectDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final AutoActivityDetectDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                AutoActivityDetectDTO autoActivityDetectDTO = new AutoActivityDetectDTO();
                autoActivityDetectDTO.k(new JSONObject(jsonElement.toString()));
                return autoActivityDetectDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(AutoActivityDetectDTO autoActivityDetectDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            AutoActivityDetectDTO autoActivityDetectDTO2 = autoActivityDetectDTO;
            autoActivityDetectDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                JSONObject jSONObject = new JSONObject(autoActivityDetectDTO2.f43508a);
                jSONObject.put("WellnessAutoActivity.createNonHrActivity", String.valueOf(autoActivityDetectDTO2.f43509b));
                String string = jSONObject.toString();
                string.getClass();
                return (JsonElement) GsonUtil.f47253b.fromJson(string, JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoActivityDetectDTO> {
        @Override // android.os.Parcelable.Creator
        public final AutoActivityDetectDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AutoActivityDetectDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoActivityDetectDTO[] newArray(int i14) {
            return new AutoActivityDetectDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public AutoActivityDetectDTO(Parcel parcel) {
        this.f43508a = "";
        this.f43510c = Boolean.FALSE;
        Class cls = Boolean.TYPE;
        this.f43510c = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f43509b = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            String strU = s1.u(jSONObject, Action.KEY_ATTRIBUTE);
            if (s.g(strU, "WellnessAutoActivity.createNonHrActivity")) {
                this.f43509b = s1.o(jSONObject, "value");
            }
            if (s.g(strU, "WellnessAutoActivity.defaultNonHrActivityCreation")) {
                Boolean boolO = s1.o(jSONObject, "value");
                this.f43510c = boolO;
                if (this.f43509b == null) {
                    this.f43509b = boolO;
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeValue(this.f43510c);
        parcel.writeValue(this.f43509b);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "KEY", "Ljava/lang/String;", "VALUE", "CREATE_NON_HR_ACTIVITY", "DEFAULT_CREATE_NON_HR_ACTIVITY", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public AutoActivityDetectDTO() {
        this.f43508a = "";
        this.f43510c = Boolean.FALSE;
    }
}
