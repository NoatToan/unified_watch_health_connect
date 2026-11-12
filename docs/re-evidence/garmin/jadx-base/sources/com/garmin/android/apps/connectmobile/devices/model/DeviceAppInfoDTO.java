package com.garmin.android.apps.connectmobile.devices.model;

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

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(DeviceAppInfoDeserializer.class)
public class DeviceAppInfoDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<DeviceAppInfoDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33859g;

    public static class DeviceAppInfoDeserializer implements JsonDeserializer<DeviceAppInfoDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final DeviceAppInfoDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                DeviceAppInfoDTO deviceAppInfoDTO = new DeviceAppInfoDTO();
                deviceAppInfoDTO.k(new JSONObject(jsonElement.toString()));
                return deviceAppInfoDTO;
            } catch (Exception e4) {
                i2.g(e4, "DeviceAppInfoDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<DeviceAppInfoDTO> {
        @Override // android.os.Parcelable.Creator
        public final DeviceAppInfoDTO createFromParcel(Parcel parcel) {
            return new DeviceAppInfoDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceAppInfoDTO[] newArray(int i14) {
            return new DeviceAppInfoDTO[i14];
        }
    }

    public DeviceAppInfoDTO(Parcel parcel) {
        this.f33859g = false;
        this.f33853a = parcel.readString();
        this.f33854b = parcel.readString();
        this.f33855c = parcel.readString();
        this.f33856d = parcel.readString();
        this.f33857e = parcel.readString();
        this.f33858f = parcel.readString();
        this.f33859g = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f33853a = s1.u(jSONObject, "applicationKey");
            this.f33854b = s1.u(jSONObject, "productDisplayName");
            this.f33855c = s1.u(jSONObject, "imageUrl");
            this.f33856d = s1.u(jSONObject, "versionString");
            this.f33857e = s1.u(jSONObject, "versionMajor");
            this.f33858f = s1.u(jSONObject, "versionMinor");
            this.f33859g = jSONObject.optBoolean("released");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f33853a);
        parcel.writeString(this.f33854b);
        parcel.writeString(this.f33855c);
        parcel.writeString(this.f33856d);
        parcel.writeString(this.f33857e);
        parcel.writeString(this.f33858f);
        parcel.writeInt(this.f33859g ? 1 : 0);
    }

    public DeviceAppInfoDTO() {
        this.f33859g = false;
    }
}
