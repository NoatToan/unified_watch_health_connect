package com.garmin.android.apps.connectmobile.settings.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(Office365SettingDTODeserializer.class)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B+\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0003\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "", "authCode", "", "pushActivity", "pushEvent", "pushWorkout", "(Ljava/lang/String;ZZZ)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "Office365SettingDTODeserializer", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Office365SettingDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<Office365SettingDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43516f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO$Office365SettingDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Office365SettingDTODeserializer implements JsonDeserializer<Office365SettingDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final Office365SettingDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                Office365SettingDTO office365SettingDTO = new Office365SettingDTO();
                office365SettingDTO.k(new JSONObject(jsonElement.toString()));
                return office365SettingDTO;
            } catch (Exception e4) {
                i2.a.j(i2.f36769a, "Office365SettingDTO", e4.getMessage());
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Office365SettingDTO> {
        @Override // android.os.Parcelable.Creator
        public final Office365SettingDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Office365SettingDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Office365SettingDTO[] newArray(int i14) {
            return new Office365SettingDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public Office365SettingDTO(Parcel parcel) {
        parcel.getClass();
        this.f43511a = parcel.readString();
        this.f43512b = parcel.readInt() == 1;
        this.f43513c = parcel.readInt() == 1;
        this.f43514d = parcel.readInt() == 1;
        this.f43515e = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f43511a = s1.u(jSONObject, "authCode");
        this.f43512b = jSONObject.optBoolean("pushActivity", false);
        this.f43513c = jSONObject.optBoolean("pushEvent", false);
        this.f43514d = jSONObject.optBoolean("pushWorkout", false);
        this.f43515e = jSONObject.optBoolean("connected", false);
        if (jSONObject.has("returnError")) {
            this.f43516f = jSONObject.optJSONObject("returnError").optInt("code");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f43511a);
        parcel.writeInt(this.f43512b ? 1 : 0);
        parcel.writeInt(this.f43513c ? 1 : 0);
        parcel.writeInt(this.f43514d ? 1 : 0);
        parcel.writeInt(this.f43515e ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "TAG", "Ljava/lang/String;", "AUTH_CODE_PK", "PUSH_ACTIVITY_PK", "PUSH_EVENT_PK", "PUSH_WORKOUT_PK", "CONNECTED_PK", "RETURN_ERROR_PK", "RETURN_ERROR_CODE_PK", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public Office365SettingDTO(String str, boolean z14, boolean z15, boolean z16) {
        this.f43511a = str;
        this.f43512b = z14;
        this.f43513c = z15;
        this.f43514d = z16;
    }

    public Office365SettingDTO() {
    }
}
